package model;

import java.time.LocalDate;

public class Movement {

    private int movementId;
    private String passportNumber;
    private String movementType; // ENTRY or EXIT
    private LocalDate movementDate;
    private String port;

    public Movement(int movementId, String passportNumber, String movementType, LocalDate movementDate, String port) {
        this.movementId = movementId;
        this.passportNumber = passportNumber;
        this.movementType = movementType;
        this.movementDate = movementDate;
        this.port = port;
    }

    public int getMovementId() {
        return movementId;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public String getMovementType() {
        return movementType;
    }

    public LocalDate getMovementDate() {
        return movementDate;
    }

    public String getPort() {
        return port;
    }
}
