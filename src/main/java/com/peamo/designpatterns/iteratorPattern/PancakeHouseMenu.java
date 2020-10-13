package com.peamo.designpatterns.iteratorPattern;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author hualong.li
 * @date 2018/9/1
 */
public class PancakeHouseMenu {

    List<MenuItem> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<MenuItem>();
        addItem("K&B's Pancake Breakfast","Pancakes with scrambled eggs ,an toast",true,2.99);
        addItem("Regular Pancake Breakfast","pancakes with fried eggs ,sausages",false,2.99);
        addItem("Blueberry Pancakes","Pancakes made with fresh blueberries",true,3.49);
    }


    public void addItem(String name,String description,boolean vegetarian,double price) {
        MenuItem menu = new MenuItem(name,description,vegetarian,price);
        menuItems.add(menu);
    }

    public Iterator createIterator() {
        return menuItems.iterator();
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
