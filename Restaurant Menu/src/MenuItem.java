import java.util.ArrayList;
import java.util.HashMap;

public class MenuItem {
    private double price;
    private ArrayList<Menu> item;
    private String description;
    private String category;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public ArrayList<Menu> getItem() {
        return item;
    }

    public void setItem(ArrayList<Menu> item) {
        this.item = item;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}

