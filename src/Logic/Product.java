package Logic;

import MyExceptions.*;

import java.util.Date;


public class Product {

    //data
    private int registrationNumber;
    private String productName;
    private String model;
    private int number;
    private String manufacturer;
    private double price;
    private Date dateOfManufacture;


    //ctor
    public Product(int registrationNumber, String productName) throws ProductException {
        setRegistrationNumber(registrationNumber);
        setProductName(productName);
    }

    public Product(int registrationNumber, String productName, String model, int count, String manufacturer, double price, Date dateOfManufacture) throws ProductException {
        setRegistrationNumber(registrationNumber);
        setProductName(productName);
        setModel(model);
        setNumber(count);
        setManufacturer(manufacturer);
        setPrice(price);
        setDateOfManufacture(dateOfManufacture);
    }


    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public String getProductName() {
        return productName;
    }

    public String getModel() {
        return model;
    }

    public int getNumber() {
        return number;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public Date getDateOfManufacture() {
        return dateOfManufacture;
    }


    public void setRegistrationNumber(int registrationNumber) throws ProductException {
        if (registrationNumber < 0)
            throw new ProductException("registrationNumber", "Регестраційний номер не відповідає дійсності");

        this.registrationNumber = registrationNumber;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setNumber(int number) throws ProductException {
        if (number <= 0)
            throw new ProductException("number", "Кількість предметів не відповідає дійсності");

        this.number = number;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setPrice(double price) throws ProductException {
        if (price <= 0 || price > 1000000)
            throw new ProductException("price", "Ціна не відповідає дійсності");

        this.price = price;
    }

    public void setDateOfManufacture(Date dateOfManufacture) throws ProductException {
        if (dateOfManufacture.getTime() < new Date().getTime())
            this.dateOfManufacture = dateOfManufacture;
        else
            throw new ProductException("dateOfManufacture", "Дата не відповідає дійсності");
    }

}
