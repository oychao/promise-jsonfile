package controllers;

import java.util.List;

import com.avaje.ebean.Ebean;
import com.google.inject.Inject;

import models.User;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.*;

public class UserController extends Controller {

	@Inject
	FormFactory formFactory;

	public Result index() {
		return ok(demo.render(""));
	}

	public Result save() {
		User user = formFactory.form(User.class).bindFromRequest().get();
		user.signUpDate = System.currentTimeMillis();
		// User user = new User("Charles", "ch.k.ouyang@gmail.com", 25,
		// System.currentTimeMillis());
		Ebean.save(user);
		return ok(Ebean.json().toJson(user));
	}

	public Result find() {
		User user = Ebean.find(User.class, 1);
		// System.out.println(new Date(user.signUpDate));
		return ok(Ebean.json().toJson(user));
	}

	public Result findAll() {
		List<User> users = Ebean.find(User.class).findList();
		return ok(Ebean.json().toJson(users));
	}
}
