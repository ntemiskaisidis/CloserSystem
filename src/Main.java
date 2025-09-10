import menu.Alkos;
import menu.Coffes;
import menu.MenuItem;
import menu.NonAlko;
import team.Bar;
import team.Security;

import java.math.BigDecimal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**
         * -> Создание обложки объектов для работы
         * -> Экономия кода с помощью абстрактного класса
         *
         */
        Coffes espresso = new Coffes("hot","1","Espresso",new BigDecimal("2.50"));
        Coffes capuchino = new Coffes("hot","2","Capucchino",new BigDecimal("4.50"));
        Coffes freddo = new Coffes("cold","3","Freddoespresso",new BigDecimal("8"));
        Coffes freddoc = new Coffes("cold","4","Freddocapucchino",new BigDecimal("10"));

        Alkos tequila = new Alkos("0,25ml","1","Tequilla",new BigDecimal("30"));
        Alkos vodka = new Alkos("0,25ml","2","Vodka",new BigDecimal("15"));
        Alkos konjak = new Alkos("0,25ml","3","Konjak",new BigDecimal("30"));
        Alkos wiskey = new Alkos("0,25ml","4","Wiskey",new BigDecimal("45"));

        NonAlko cola = new NonAlko("sweet","1","Cocacolla",new BigDecimal("4"));
        NonAlko pepsi = new NonAlko("sweet","2","Pepsi",new BigDecimal("4"));
        NonAlko water = new NonAlko("nonsugar","3","Water",new BigDecimal("2"));
        NonAlko juice = new NonAlko("sweet","4","Apple juice",new BigDecimal("5"));

        //  MenuItem.printMenu();


        Bar pascha = new Bar(
                "Chief", "Pascha", 46, new BigDecimal("16.50"),new BigDecimal ("0")
        );

        Bar nikita = new Bar(
                "co-Chief", "Nikita", 22, new BigDecimal("12.50"),new BigDecimal ("0")
        );

        Bar valera = new Bar(
                "Runner", "Valera", 12, new BigDecimal("12"),new BigDecimal ("0")
        );
        Bar danek = new Bar(
                "Barmen", "Danek", 19, new BigDecimal("10"),new BigDecimal ("0")
        );

        Security denis  = new Security(
                "Chief", "Denis",36, new BigDecimal("15"), new BigDecimal ("0")
        );
        Security louis = new Security(
                "bear", "Louis", 15,new BigDecimal("18"),new BigDecimal ("0")
        );

        // denis.checkInside();
        // denis.helpOutside();
        // louis.helpOutside();
        System.out.println("-------------------");
        System.out.println();

        danek.saleNonAlko(cola);
        nikita.saleAlko(wiskey);

        valera.makeCoffe(capuchino);



        // System.out.println(danek.toString());

        /*
        -> Проверка всех методов
        ->
         */
        /*
        System.out.println(espresso.getId());

        System.out.println(espresso.getName());
        espresso.setPrice(new BigDecimal("5"));
        System.out.println("Espresso costs : " + espresso.getPrice());

        Scanner sc = new Scanner(System.in);
        System.out.println("Сделайте заказ");
        String order = sc.next();
        System.out.println(order);
         */
    }
}
