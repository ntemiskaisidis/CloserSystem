package team;
import java.math.BigDecimal;

public class Security extends Workers {
    private String titel;

    public Security (String titel, String name, int workingHours, BigDecimal hourSalary, BigDecimal tips) {
        super (name, workingHours,hourSalary,tips);
        this.titel = titel;

    }
    public String getTitel () {return titel;}

}
