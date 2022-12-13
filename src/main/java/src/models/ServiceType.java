package src.models;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Setter
@Getter

public class ServiceType {

    private UUID uuid;
    private String nameServiceType;
    private int costService;
    private Organization organization;

}
