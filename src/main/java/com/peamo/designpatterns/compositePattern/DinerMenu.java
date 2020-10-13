package com.peamo.designpatterns.compositePattern;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @author hualong.li
 * @date 2018/9/1
 */
public class DinerMenu {

    private static final int Max_ITEMS = 3;
    private int numberOfItems = 0;
    private MenuItem[] menuItemss;


    public DinerMenu() {
        menuItemss = new MenuItem[Max_ITEMS];
        addItem("Vegetarian BLT","(Fakin') Bacon with lettuce & tomato on whole wheat",true,2.99);
        addItem("BLT","Bacon with lettuce & tomato on whole wheat",true,2.99);
        addItem("Hotdog","A hot dog,with saurkraut,relish,onions,topped with cheese",false,3.05);
    }

    public void addItem(String name,String description,boolean vegetarian,double price) {
        MenuItem menu = new MenuItem(name,description,vegetarian,price);
        if(numberOfItems >= Max_ITEMS) {
            return;
        }else{
            menuItemss[numberOfItems] = menu;
            numberOfItems++;
        }
    }
    public Iterator createIterator() {
        List<MenuItem> s = Arrays.asList(menuItemss);
                return s.iterator();
    }

    class MenuItem implements Serializable {
        private String name;
        private String description;
        private boolean vegetarian;
        private double price;

        public MenuItem(String name, String description, boolean vegetarian, double price) {
            this.name = name;
            this.description = description;
            this.vegetarian = vegetarian;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public boolean isVegetarian() {
            return vegetarian;
        }

        public void setVegetarian(boolean vegetarian) {
            this.vegetarian = vegetarian;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }
    }
}
