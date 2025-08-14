package br.com.knightware.knightware_backend.service;

import br.com.knightware.knightware_backend.model.DefaultReturn;
import br.com.knightware.knightware_backend.model.dto.ClientDTO;

public interface ClientService {
    public DefaultReturn<ClientDTO> registerCustomer(ClientDTO dto);
}
