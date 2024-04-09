package mapping.mapper;

import mapping.dtos.ClientDTO;
import model.cliente;

public class ClienteMapper {
    public static ClientDTO mapFromModel(cliente cliente){
        return new ClientDTO( cliente.getName(), cliente.getIDnumber(), cliente.getDate_birth());

    }
    public static cliente mapFromDTO(ClientDTO clienteDTO){
        return cliente.builder()
                .name(clienteDTO.name())
                .IDnumber(clienteDTO.iDnumber())
                .date_birth(clienteDTO.date_birth())
                .build();
    }
}