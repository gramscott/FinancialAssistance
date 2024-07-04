import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.EventListener;
import java.util.List;


public class User {
    private LocalDate dateOfRegistration;
    private Evidence activeName;
    private LocalDate dateOfBirth;
    private String nationalInsuranceNumber;
    private Evidence residentialAddress;
    private Evidence correspondenceAddress;
    private Evidence bankAccount;
    private boolean isProspect;
    private List<Evidence> nameHistory;
    private List<Evidence> addressHistory;
    private List<Evidence> bankAccountHistory;

    public User(String name, LocalDate dateOfBirth, String residentialAddress, String bankAccount) {
        this.dateOfRegistration = LocalDate.now();
        this.activeName = new Evidence(name);
        this.dateOfBirth = dateOfBirth;
        this.residentialAddress = new Evidence(residentialAddress);
        this.bankAccount = new Evidence(bankAccount);
        this.isProspect = true;

        this.nameHistory = new ArrayList<>();
        this.addressHistory = new ArrayList<>();
        this.bankAccountHistory = new ArrayList<>();

        this.nameHistory.add(this.activeName);
        this.addressHistory.add(this.residentialAddress);
        this.bankAccountHistory.add(this.bankAccount);
    }

    public String getActiveName() {
        return activeName.getValue();
    }



    public void addName(String name) {
        Evidence newName = new Evidence(name);
        this.activeName = newName;
        this.nameHistory.add(newName);
    }

    public String getActiveAddress() {
        if (correspondenceAddress != null){
            return correspondenceAddress.getValue();
        }
        return residentialAddress.getValue();
    }

    public void addCorrespondenceAddress(String address) {
        Evidence newAddress = new Evidence(address);
        this.addressHistory.add(newAddress);
    }

    public String getActiveBankAccount() {
        return bankAccount.getValue();
    }

    public void addBankAccount(String bankAccount) {
        Evidence newBankAccount = new Evidence(bankAccount);
        this.bankAccount = newBankAccount;
        this.bankAccountHistory.add(newBankAccount);
    }


}