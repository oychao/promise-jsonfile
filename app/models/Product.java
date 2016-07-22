package models;

import com.avaje.ebean.Model;

import java.util.List;

/**
 * Created by ouyangcharles on 5/11/16.
 */
public class Product extends Model {
    public String ean;
    public String name;
    public String description;
    public byte[] picture;
    public List<Tag> tags;

    public String toString() {
        return name;
    }
}
