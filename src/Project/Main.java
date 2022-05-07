package Project;

import Logic.*;
import MyExceptions.*;

import java.util.*;
import java.lang.*;

public class Main {

    private static Product ProtectCreate(int registrationNumber, String productName, String model, int count, String manufacturer, double price, Date dateOfManufacture) {
        try {
            var product1 = new Product(registrationNumber, productName, model, count, manufacturer, price, dateOfManufacture);
            System.out.println("Product ADDED");
            return product1;
        } catch (ProductException ex) {
            System.out.println("===================================");
            System.out.println("Product Error");
            System.out.println("Who called exception = " + ex.GetWhoCalled());
            System.out.println("Message = " + ex.getMessage());
            System.out.println("===================================");
        }

        return null;
    }

    private static List<Product> createProduct() {

        var data1 = new GregorianCalendar(2022, 3, 13).getTime();
        var data2 = new GregorianCalendar(2020, 3, 13).getTime();
        var data3 = new GregorianCalendar(2019, 3, 14).getTime();
        var data4 = new GregorianCalendar(2008, 3, 13).getTime();
        var data5 = new GregorianCalendar(2022, 8, 13).getTime();
        var data6 = new GregorianCalendar(2010, 10, 24).getTime();
        var data7 = new GregorianCalendar(1998, 4, 18).getTime();
        var data8 = new GregorianCalendar(2021, 1, 21).getTime();
        var data9 = new GregorianCalendar(2022, 2, 14).getTime();
        var data10 = new GregorianCalendar(2020, 6, 19).getTime();

        var products = new LinkedList<Product>();

        products.add(ProtectCreate(1, "Телефон", "SJ-100", 100, "Armani", 1000, data1));
        products.add(ProtectCreate(2, "Автмобіль", "berlineta", 10, "Ferari", 120000, data2));
        products.add(ProtectCreate(3, "Компютер", "mst-2", 200, "Intel", 3400, data3));
        products.add(ProtectCreate(3, "Телефон", "arce 1000", 810, "Xiami", 684, data4));
        products.add(ProtectCreate(4, "Ноутбук", "SJ-100", 124, "Acer", 2457, data5));
        products.add(ProtectCreate(5, "Принтер", "RAM-100", 2104, "HP", 240, data6));
        products.add(ProtectCreate(6, "Гелікоптер", "AID-100", 2, "Augusta Westa", 600000, data7));
        products.add(ProtectCreate(7, "Диск", "SIMER 2", 20000, "hitachi", 2, data8));
        products.add(ProtectCreate(8, "Ліжко", "vilon", 20, "IKEA", 400, data9));
        products.add(ProtectCreate(9, "Автомобіль", "focus", 60, "Ford", 20000000, data10));

        var res = new LinkedList<Product>();

        for (var product : products)
            if(product != null)
                res.add(product);

        return res;
    }


    public static void main(String[] args) {

        var res = createProduct();

        for (var product : res) {
            System.out.println(product.getRegistrationNumber());
        }
    }
}
