package productmanagement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Admin
 */
public class Product {

    private String code, name;
    private int price, guaranty;

    public Product() {
    }

    public Product(String code, String name, int price, int guaranty) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.guaranty = guaranty;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getGuaranty() {
        return guaranty;
    }

    public void setGuaranty(int guaranty) {
        this.guaranty = guaranty;
    }

    public boolean equals(Product pro) {
        return pro.getCode().equals(this.getCode()) && pro.getName().equals(this.getName()) && pro.getPrice() == this.getPrice();
    }

    @Override
    public String toString() {
        return "Product{" + "code=" + code + ", name=" + name + ", price=" + price + ", guaranty=" + guaranty + '}';
    }

}
