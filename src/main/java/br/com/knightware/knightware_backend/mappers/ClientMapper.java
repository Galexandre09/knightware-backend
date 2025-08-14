package br.com.knightware.knightware_backend.mappers;

import br.com.knightware.knightware_backend.model.dto.ClientDTO;
import br.com.knightware.knightware_backend.model.entity.Client;

public class ClientMapper {

    // Converte de Entity para DTO
    public static ClientDTO toDTO(Client client) {
        if (client == null) {
            return null;
        }
        return new ClientDTO(
                client.getClientId(),
                client.getName(),
                client.getPhone(),
                client.getAddress(),
                client.getEmail()
        );
    }

    // Converte de DTO para Entity
    public static Client toEntity(ClientDTO dto) {
        if (dto == null) {
            return null;
        }
        return new Client(
                dto.getClientId(),
                dto.getName(),
                dto.getPhone(),
                dto.getAddress(),
                dto.getEmail()
        );
    }
}

