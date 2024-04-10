package mapping.dtos;

import lombok.Builder;

import java.util.Date;
@Builder
public record ClientDTO(String name, String iDnumber, Date date_birth){

    @Override
    public String name() {
        return name;
    }

    @Override
    public String iDnumber() {
        return iDnumber;
    }

    @Override
    public Date date_birth() {
        return date_birth;
    }
}