import jakarta.validation.constraints.NotBlank;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class User {

    private final LocalDateTime registrationDate;

    @NotBlank
    private String name;

    @NotBlank
    private LocalDate dateOfBirth;

    @NotBlank
    private String residentialAddress;

    private String correspondenceAddress;

    private String bankAccount;

    User(LocalDateTime registrationDate, String name, LocalDate dateOfBirth, String residentialAddress, String bankAccount) {
        this.registrationDate = new LocalDateTime;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.residentialAddress = residentialAddress;
        this.bankAccount = bankAccount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getRegistrationDate() {
        return registrationDate;
    }

    public String getResidentialAddress() {
        return residentialAddress;
    }

    public void setResidentialAddress(String residentialAddress) {
        this.residentialAddress = residentialAddress;
    }


    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
