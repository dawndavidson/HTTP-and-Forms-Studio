package restaurant;

import java.util.ArrayList;
import java.util.Date;


public class Menu {
    private ArrayList<MenuItem> soup;
    private ArrayList<MenuItem> salad;
    private ArrayList<MenuItem> steak;
    private ArrayList<MenuItem> shrimp;
    private ArrayList<MenuItem> chicken;
    private ArrayList<MenuItem> pasta;
    private ArrayList<MenuItem> drinks;

    public ArrayList getSoup() {
        return soup;
    }
    public void setSoup(ArrayList soup) {
        this.soup = soup;
    }

    public ArrayList getSalad() {
        return salad;
    }
    public void setSalad(ArrayList salad) {
        this.salad = salad;
    }

    public ArrayList getSteak() {
        return steak;
    }
    public void setSteak(ArrayList steak) { this.steak = steak;
    }

    public ArrayList getShrimp() {
        return shrimp;
    }
    public void setShrimp(ArrayList shrimp) {
        this.shrimp = shrimp;
    }

    public ArrayList getChicken() {
        return chicken;
    }
    public void setChicken(ArrayList chicken) {
        this.chicken = chicken;
    }

    public ArrayList getPasta() {
        return pasta;
    }
    public void setPasta(ArrayList pasta) {
        this.pasta = pasta;
    }

    public ArrayList getDrinks() {
        return drinks;
    }
    public void setDrinks(ArrayList drinks) {
        this.drinks = drinks;
    }
}
