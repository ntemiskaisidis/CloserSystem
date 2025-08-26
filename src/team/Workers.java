package team;

import java.math.BigDecimal;

public abstract class Workers {
    protected String name;
    protected int workingMonths;
    protected BigDecimal hourSalary;
    protected BigDecimal tips;

    public Workers (String name, int workingMonths, BigDecimal hourSalary, BigDecimal tips) {
        this.name  = name;
        this.workingMonths = workingMonths;
        this.hourSalary = hourSalary;
        this.tips =tips;
    }
    public String getName () {return name;}
    public String toString (){return name + " " + workingMonths +  " " + hourSalary + " " + tips;}
    }

