package services;

import mapping.dtos.*;

import java.util.List;

public interface ClientService {
    List<ClientDTO> listar();
}