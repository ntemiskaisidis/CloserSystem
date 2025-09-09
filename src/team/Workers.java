package team;
/*
-> Создание абстрактного класса для всех типов работников
-> Добавление общих методов
-> Инкапсуляция

 */
import java.math.BigDecimal;

public abstract class Workers {
    protected  String name;
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
    public int  getWorkingMonths() {return workingMonths;}
    public BigDecimal getHourSalary () {return hourSalary;}
    public BigDecimal getTips () {return tips;  }

    public String toString (){
        return "This is " + name + " he is working"+ workingMonths + " he is payed : " + hourSalary + " his tips this month:  " + tips;
    }

    }

