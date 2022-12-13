package src.models;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter

public class Organization {

    private UUID uuid;
    private String nameOrganization;
    private String iban;
    private String phone;
    private String email;

}
