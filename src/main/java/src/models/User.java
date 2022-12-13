package src.models;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter

public class User {

    private UUID uuid;
    private String firstName;
    private String secondName;
    private String thirdName;
    private int indivTaxNumber;
    private String phone;
    private Housing housing;

}
