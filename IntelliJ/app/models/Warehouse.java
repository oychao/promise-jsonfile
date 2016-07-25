package models;

import com.avaje.ebean.Model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ouyangcharles on 5/11/16.
 */
public class Warehouse extends Model {
    public String name;
    public List<StockItem> stock = new ArrayList<>();

    public String toString() {
        return name;
    }
}
