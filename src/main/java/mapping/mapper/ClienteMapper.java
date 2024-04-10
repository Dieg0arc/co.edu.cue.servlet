package mapping.mapper;

import mapping.dtos.ClientDTO;
import model.Client;

public class ClienteMapper {
    public static ClientDTO mapFromModel(Client cliente){
        return new ClientDTO( cliente.getName(), cliente.getIDnumber(), cliente.getDate_birth());

    }
    public static Client mapFromDTO(ClientDTO clienteDTO){
        return Client.builder()
                .name(clienteDTO.name())
                .IDnumber(clienteDTO.iDnumber())
                .date_birth(clienteDTO.date_birth())
                .build();
    }
}