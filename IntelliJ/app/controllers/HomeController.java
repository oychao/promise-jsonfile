package controllers;

import interceptors.LogInfo;
import interceptors.VerboseAction;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.With;
import views.html.index;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
        return ok(index.render("Your new application is ready."));
    }

    @With(VerboseAction.class)
    public Result demo1() {
    	return TODO;
    }

    @LogInfo
    public Result demo2() {
        return TODO;
    }
}