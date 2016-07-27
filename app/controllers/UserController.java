package controllers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.avaje.ebean.Ebean;
import com.google.inject.Inject;

import models.User;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.*;
import user.views.html.*;

/**
 * @author ouyangcharles
 *
 */
public class UserController extends Controller {

	@Inject
	FormFactory formFactory;

	/**
	 * form page
	 * 
	 * @return
	 */
	public Result index() {
		return ok(save.render("test"));
	}

	/**
	 * get data from form and save it to database
	 * 
	 * @return
	 */
	public Result save() {
		User user = formFactory.form(User.class).bindFromRequest().get();
		user.signUpDate = System.currentTimeMillis();
		// User user = new User("Charles", "ch.k.ouyang@gmail.com", 25,
		// System.currentTimeMillis());
		Ebean.save(user);
		return ok(Ebean.json().toJson(user));
	}

	/**
	 * querying data by id
	 * 
	 * @return
	 */
	public Result find() {
		User user = Ebean.find(User.class, 1);
		// System.out.println(new Date(user.signUpDate));
		return ok(Ebean.json().toJson(user));
	}

	/**
	 * querying all data
	 * 
	 * @return
	 */
	public Result findAll() {
		List<User> users = Ebean.find(User.class).findList();
		for (User user : users) {
			System.out.println(new Date(user.signUpDate));
		}
		return ok(Ebean.json().toJson(users));
	}

	/**
	 * querying data satisfied some criteria
	 * 
	 * @return
	 */
	public Result findSome() {
		Date date = null;
		try {
			date = new SimpleDateFormat("dd-MM-yyyy,HH:mm:ss")
					.parse("26-07-2016,16:00:00");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		List<User> users = Ebean.find(User.class).where()
				.ge("signUpDate", date.getTime()).findList();
		return ok(Ebean.json().toJson(users));
	}

	/**
	 * delete user by id
	 * 
	 * @param id
	 * @return
	 */
	public Result delete(Long id) {
		// Ebean.delete(User.class, id);
		User user = Ebean.find(User.class, id);
		Ebean.delete(user);
		return ok(Ebean.json().toJson(user));
	}

	public Result pageModify(Long id) {
		User user = Ebean.find(User.class, id);
		return ok(modify.render(user));
	}

	/**
	 * update user by id
	 * 
	 * @return
	 */
	public Result modify() {
		User user = formFactory.form(User.class).bindFromRequest().get();
		Ebean.update(user);
		return ok(Ebean.json().toJson(user));
	}
}
