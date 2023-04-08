package productmanagement;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Admin
 */
public class ProList extends DLL {

    Scanner sc = null;

    public ProList() {
        super();
        sc = new Scanner(System.in);

    }

    private Node<Product> find(String code) {
        Node<Product> ref;

        for (ref = this.getHeader().next; ref != this.getTrailer(); ref = ref.next) {
            if (ref.infor.getCode().equals(code)) {
                return ref;
            }
        }

        return null;
    }

    public void add() {
        String code, name;
        int price, guaranty;
        System.out.println("Add new product");
        boolean proceed = false;
        do {
            System.out.println("Enter code: ");
            code = sc.nextLine().toUpperCase();
            proceed = find(code) != null;
            if (proceed == true) {
                System.out.println("This code is duplicated");
            }
        } while (proceed);
        do {
            System.out.println("Enter product name: ");
            name = sc.nextLine().trim();
            proceed = (name.length() == 0);
            if (proceed == true) {
                System.out.println("Can not be blank");
            }
        } while (proceed);
        do {
            System.out.println("Enter price: ");
            price = Integer.parseInt(sc.nextLine());

            if (price <= 0) {
                System.out.println("Must be greater than 0");
            }
        } while (price <= 0);

        do {
            System.out.println("Enter guaranty: ");
            guaranty = Integer.parseInt(sc.nextLine());

            if (guaranty <= 0) {
                System.out.println("Must be greater than 0");
            }
        } while (guaranty <= 0);
        Product pro = new Product(code, name, price, guaranty);
        this.addFirst(pro);

        System.out.println("This product is added");
    }

    public void remove() {
        if (this.isEmpty()) {
            System.out.println("The list is empty");
        } else {
            String code;
            System.out.println("Enter code");
            code = sc.nextLine().toUpperCase();
            Node<Product> ref = find(code);
            if (ref == null) {
                System.out.println("Does not exist");
            } else {
                this.remove(ref);
                System.out.println("This product has been removed");
            }
        }
    }

    public void updatePrice() {
        if (this.isEmpty()) {
            System.out.println("The list is empty");
        } else {
            String code;
            System.out.println("Enter code");
            code = sc.nextLine().toUpperCase();
            Node<Product> ref = find(code);
            if (ref == null) {
                System.out.println("Does not exist");
            } else {
                int oldPrice = ref.infor.getPrice();
                int newPrice;
                do {
                    System.out.println("Old price: " + oldPrice + ", new price: ");
                    newPrice = Integer.parseInt(sc.nextLine());
                } while (newPrice <= 0);
                ref.infor.setPrice(newPrice);
                System.out.println("Price has been updated");
            }
        }

    }

    public void updateGuaranty() {
        if (this.isEmpty()) {
            System.out.println("The list is empty");
        } else {
            String code;
            System.out.println("Enter code");
            code = sc.nextLine().toUpperCase();
            Node<Product> ref = find(code);
            if (ref == null) {
                System.out.println("Does not exist");
            } else {
                int oldGuaranty = ref.infor.getGuaranty();
                int newGuaranty;
                do {
                    System.out.println("Old guaranty: " + oldGuaranty + ", new guaranty: ");
                    newGuaranty = Integer.parseInt(sc.nextLine());
                } while (newGuaranty <= 0);
                ref.infor.setPrice(newGuaranty);
                System.out.println("Guaranty has been updated");
            }
        }

    }

    public void print() {

        System.out.println("PRODUCT LIST");
        this.printAll();

    }

}
