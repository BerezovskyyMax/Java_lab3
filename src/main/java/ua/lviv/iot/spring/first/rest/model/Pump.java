package ua.lviv.iot.spring.first.rest.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Pump {

    private double priceInUAH;
    private int weightInGramms;
    private String countryWhereCreated;
    private int warrantyPeriodInMonths;
    private String bodyMaterial;
    private String brand;
    private double powerInKilowatts;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    public Pump() {

    }

    public Pump(double priceInUAH, int weightInGramms, String countryWhereCreated, int warrantyPeriodInMonths,
            String bodyMaterial, String brand, double powerInKilowatts) {
        super();
        this.priceInUAH = priceInUAH;
        this.weightInGramms = weightInGramms;
        this.countryWhereCreated = countryWhereCreated;
        this.warrantyPeriodInMonths = warrantyPeriodInMonths;
        this.bodyMaterial = bodyMaterial;
        this.brand = brand;
        this.powerInKilowatts = powerInKilowatts;
    }

    public double getPriceInUAH() {
        return priceInUAH;
    }

    public void setPriceInUAH(double priceInUAH) {
        this.priceInUAH = priceInUAH;
    }

    public int getWeightInGramms() {
        return weightInGramms;
    }

    public void setWeightInGramms(int weightInGramms) {
        this.weightInGramms = weightInGramms;
    }

    public String getCountryWhereCreated() {
        return countryWhereCreated;
    }

    public void setCountryWhereCreated(String countryWhereCreated) {
        this.countryWhereCreated = countryWhereCreated;
    }

    public int getWarrantyPeriodInMonths() {
        return warrantyPeriodInMonths;
    }

    public void setWarrantyPeriodInMonths(int warrantyPeriodInMonths) {
        this.warrantyPeriodInMonths = warrantyPeriodInMonths;
    }

    public String getBodyMaterial() {
        return bodyMaterial;
    }

    public void setBodyMaterial(String bodyMaterial) {
        this.bodyMaterial = bodyMaterial;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPowerInKilowatts() {
        return powerInKilowatts;
    }

    public void setPowerInKilowatts(double powerInKilowatts) {
        this.powerInKilowatts = powerInKilowatts;
    }

    public Integer getId() {
        return id;
    }

    public Integer setId(Integer id) {
        return this.id = id;
    }

    @Override
    public String toString() {
        return "Pump [priceInUAH=" + priceInUAH + ", weightInGramms=" + weightInGramms + ", countryWhereCreated="
                + countryWhereCreated + ", warrantyPeriodInMonths=" + warrantyPeriodInMonths + ", bodyMaterial="
                + bodyMaterial + ", brand=" + brand + ", powerInKilowatts=" + powerInKilowatts + ", id=" + id + "]";
    }

}
