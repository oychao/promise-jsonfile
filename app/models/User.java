package models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.avaje.ebean.Model;
import com.avaje.ebean.annotation.JsonIgnore;

@Entity
public class User extends Model {

	@Id
	@GeneratedValue
	public long id;

	public String username;	
	@JsonIgnore
	public String email;
	public int age;
	public long signUpDate;

	public User() {
		super();
	}

	public User(String username, String email, int age, long signUpDate) {
		super();
		this.username = username;
		this.email = email;
		this.age = age;
		this.signUpDate = signUpDate;
	}

	public User(long id, String username, String email, int age, long signUpDate) {
		super();
		this.id = id;
		this.username = username;
		this.email = email;
		this.age = age;
		this.signUpDate = signUpDate;
	}

}
