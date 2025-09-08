package team;

import java.math.BigDecimal;

public class Bar extends Workers{
    private String titel;

public Bar (String titel,String name,int workingMonths, BigDecimal hourSalary, BigDecimal tips) {
    super(name,workingMonths,hourSalary,tips);
    this.titel = titel;
}

public  String getTitel () {return titel;}


}
