package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;

/**
 * Created by Jordan on 5/20/2015 for saas-api2
 */
public class Application extends Controller{

    public static Result index() {
        return ok(index.render("Your new application is ready."));
    }

}
