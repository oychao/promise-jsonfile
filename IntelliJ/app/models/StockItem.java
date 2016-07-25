package models;

import com.avaje.ebean.Model;

/**
 * Created by ouyangcharles on 5/11/16.
 */
public class StockItem extends Model{
    public Warehouse warehouse;
    public Product product;
    public Long quantity;

    public String toString() {
        return String.format("%d %s", quantity, product);
    }
}
