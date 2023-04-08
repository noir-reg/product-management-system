/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productmanagement;

/**
 *
 * @author Admin
 */
public class DLL_Product_Program {

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.add("Add new product");
        menu.add("Remove a product");
        menu.add("Update price of a product");
        menu.add("Update guaranty of a product");
        menu.add("Print product list");
        menu.add("Quit");
        ProList list = new ProList();
        int userChoice;
        do {
            userChoice = menu.getUSerChoice();
            switch (userChoice) {
                case 1:
                    list.add();
                    break;
                case 2:
                    list.remove();
                    break;
                case 3:
                    list.updatePrice();
                    break;
                case 4:
                    list.updateGuaranty();
                case 5:
                    list.print();
                    break;
            }

        } while (userChoice > 0 && userChoice < 6);
    }

}
