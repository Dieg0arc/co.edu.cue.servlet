package mapping.dtos;

import lombok.Builder;

import java.util.Date;
@Builder
public record ClientDTO(String name, String iDnumber, Date date_birth){
}