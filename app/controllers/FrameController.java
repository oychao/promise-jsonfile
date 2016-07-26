package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.*;

public class FrameController extends Controller {

	// home page
	public Result frame() {
		return ok(frame.render(""));
	}

	public Result demo() {
		return ok();
	}

	// dashboard tab
	public Result dashboard() {
		return TODO;
	}

	// statistics tab
	public Result statistics() {
		return TODO;
	}

}
