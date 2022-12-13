package src.models;


import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Setter
@Getter

public class Housing {

    private UUID uuid;
    private User user;
    private ServiceType serviceType;

}
