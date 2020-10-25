package com.peamo.designpatterns.iteratorPattern;

//import org.springframework.beans.BeanUtils;

import java.io.Serializable;
import java.util.Iterator;

/**
 * @author hwalong
 * @date 2018/9/1
 */
public class Waitress {

    private DinerMenu dinerMenu;

    private PancakeHouseMenu pancakeHouseMenu;

    public Waitress(DinerMenu dinerMenu, PancakeHouseMenu pancakeHouseMenu) {
        this.dinerMenu = dinerMenu;
        this.pancakeHouseMenu = pancakeHouseMenu;
    }

    public void printMenu() {

        Iterator pi = pancakeHouseMenu.createIterator();
        printMenu(pi);

        Iterator di = dinerMenu.createIterator();
        printMenu(di);
    }

    public void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            MenuItem menuItem = new MenuItem();
//            BeanUtils.copyProperties(obj,menuItem);
            System.out.println(String.format("%s , %s -- %s",menuItem.name,menuItem.getPrice(),menuItem.getDescription()));
        }
    }

    class MenuItem implements Serializable {
        private String name;
        private String description;
        private boolean vegetarian;
        private double price;

        public MenuItem() {
        }

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
