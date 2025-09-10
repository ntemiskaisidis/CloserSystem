package team;

import menu.NonAlko;
import menu.Alkos;

import java.math.BigDecimal;

public class Bar extends Workers{
    private String titel;
    NonAlko nonAlko;
    Alkos alkos;

public Bar (String titel,String name,int workingMonths, BigDecimal hourSalary, BigDecimal tips) {
    super(name,workingMonths,hourSalary,tips);
    this.titel = titel;
}

    public  String getTitel () {return titel;}

    public void saleNonAlko(NonAlko nonAlko ) {
        System.out.print("Ваш коктейль: " + nonAlko.getName());
        System.out.println(" C вас : " + nonAlko.getPrice());
    }
    public void saleAlko (Alkos alkos) {
        System.out.print("Вашь коктейль: " + alkos.getName());
        System.out.println("C вас : " + alkos.getPrice());

    }


}
