package model;

import java.time.LocalDate;

public class Visa {

    private int visaId;
    private String passportNumber;
    private String visaType;
    private LocalDate issueDate;
    private LocalDate expiryDate;

    public Visa(int visaId, String passportNumber, String visaType, LocalDate issueDate, LocalDate expiryDate) {
        this.visaId = visaId;
        this.passportNumber = passportNumber;
        this.visaType = visaType;
        this.issueDate = issueDate;
        this.expiryDate = expiryDate;
    }

    public int getVisaId() {
        return visaId;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public String getVisaType() {
        return visaType;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }
}
