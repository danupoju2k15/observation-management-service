package com.accolade.etp.observation.management.controllers;

import play.mvc.Controller;
import play.mvc.Result;


public class Application extends Controller {

    public Result index() {
        return ok("Your new application is ready.");
    }

}
