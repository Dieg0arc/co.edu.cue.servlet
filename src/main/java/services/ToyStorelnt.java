package services;

import mapping.dtos.*;

import java.sql.SQLException;
import java.util.List;

public interface ToyStorelnt {
    List<ClientDTO> listCustomers();
}