package Logic;

import MyExceptions.*;
import java.util.*;

public class ProductWarehouse {
    private List<Product> products;
    private String warehouseName;

    //ctor
    public ProductWarehouse(String warehouseName) {
        this.warehouseName = warehouseName;

        products = new LinkedList<Product>();
    }


    public void addProduct(Product product) throws Exception {
        for (var prod : products) {
            if (prod.getRegistrationNumber() == product.getRegistrationNumber()) {
                throw new WarehouseException(warehouseName, "Продукт не можливо додати оскільки даний продукт на складу уже є.");
            }
        }
    }

    public boolean removeProduct(Product product) {
        return products.remove(product);
    }

    public List<Product> getAllProducts() {
        return products;
    }


    public List<Product> getProductByManufacturer(String manufacturer) {
        var res = new LinkedList<Product>();

        for (var prod : products) {
            if (prod.getManufacturer() == manufacturer) {
                res.add(prod);
            }
        }

        return res;
    }
    public List<String> getManufacturerList() {
        var res = new LinkedList<String>();

        for (var prod : products)
            if(!res.contains(prod.getManufacturer()))
                res.add(prod.getManufacturer());

        return res;
    }
    public double getAllPrice(){
        double res = 0;

        for (var prod : products)
            res += prod.getPrice();

        return  res;
    }
    public int getTotalProductQuantity(){
        int res = 0;

        for (var prod : products)
            res += prod.getNumber();

        return  res;
    }


    public String getWarehouseName() {
        return warehouseName;
    }
}
