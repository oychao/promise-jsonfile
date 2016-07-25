package models;

import com.avaje.ebean.Model;

import java.util.List;

/**
 * Created by ouyangcharles on 5/11/16.
 */
public class Tag extends Model {
    public Long id;
    public String name;
    public List<Product> products;
}
