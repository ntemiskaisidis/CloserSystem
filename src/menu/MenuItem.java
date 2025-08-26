package menu;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


/**
 * Создание абстрактного класса
 * Создание конструктора для него
 * развитие абстрактного класса
 *
 */
public abstract class MenuItem {
    protected String id;
    protected String name;
    protected BigDecimal price;

    private static List<MenuItem> Karta= new ArrayList<MenuItem>(); // Создание массива, чтобы каждый объект потом был в нем


    public MenuItem (String id, String name, BigDecimal price) {
        this.id = id;
        this.name = name;
        this.price = price;
        Karta.add(this); // каждый раз при использование конструктора объект будет добавляться в массив

    }
    public static void printMenu() {
        for (MenuItem a: Karta) {
            System.out.println(a.getName()+ " " + a.getPrice());
        }
    }
    public String getId () {return id; }
    public String getName () {return name; }
    public BigDecimal getPrice() {return price;}

    public void setId (String newId) {id = newId; }
    public void setName (String newName) {name = newName; }
    public void setPrice (BigDecimal newPrice ){price = newPrice;}
}
