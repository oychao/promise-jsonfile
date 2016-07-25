package models;


import com.avaje.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by ouyangcharles on 5/11/16.
 */
@Entity
public class User extends Model {

    @Id
    public int id;
    public String username;
    public int age;

    public User(String username, int age) {
        this.username = username;
        this.age = age;
    }

    public User() {
    }
}
