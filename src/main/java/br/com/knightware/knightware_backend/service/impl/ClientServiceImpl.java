package br.com.knightware.knightware_backend.service.impl;

import br.com.knightware.knightware_backend.mappers.ClientMapper;
import br.com.knightware.knightware_backend.model.DefaultReturn;
import br.com.knightware.knightware_backend.model.dto.ClientDTO;
import br.com.knightware.knightware_backend.model.entity.Client;
import br.com.knightware.knightware_backend.repository.client.ClientRepository;
import br.com.knightware.knightware_backend.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {
    @Autowired
    private ClientRepository clientRepository;

    public DefaultReturn<ClientDTO> registerCustomer(ClientDTO dto) {
        try{
            String erro = validadeCustomerData(dto);
            if (erro != ""){
                List<String> erros = new ArrayList<>();
                erros.add(erro);
                DefaultReturn defaultReturn = new DefaultReturn(null,erros);
                return defaultReturn;
            }
            Client customer = clientRepository.findByEmail(dto.getEmail());
            if (customer != null){
                List<String> menssages = new ArrayList<>();
                menssages.add("Cliente já cadastrado");
                DefaultReturn defaultReturn = new DefaultReturn(null,menssages);
                return defaultReturn;
            }
            Client entity = ClientMapper.toEntity(dto);
            clientRepository.save(entity);
            List<String> menssages = new ArrayList<>();
            menssages.add("Cliente cadastrado com sucesos!");
            DefaultReturn defaultReturn = new DefaultReturn(dto,menssages);
            return defaultReturn;

        }catch (Exception e){
            throw new RuntimeException(e.getMessage());
        }
    }

    private String validadeCustomerData(ClientDTO dto) {
        try {
            List<String> erros = new ArrayList<>();
            if (dto.getName().matches(".*[^a-zA-Z].*")){
                erros.add("O nome do cliente não pode conter carateres especiais ou números.");
            }
            if (!java.util.stream.Stream.of(".com", "@")
                    .anyMatch(dto.getEmail()::contains)){
                erros.add("Email precisa conter .com e @.");
            }
            if (dto.getPhone().matches(".*[a-zA-Z].*") ||dto.getPhone().matches(".*[^a-zA-Z0-9].*")){
                erros.add("Núemro de telefone não pode conter letras ou caracteres especiais");
            }
           String erro = String.join(",", erros);
            if (erro != ""){
                erro = erro + ".";
            }
            return erro;
        } catch (Exception e){
            throw new RuntimeException(e.getMessage());
        }
    }
}
