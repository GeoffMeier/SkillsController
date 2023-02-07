package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SkillsController {
    @RequestMapping(value="/favorite", method =  {RequestMethod.POST, RequestMethod.GET} )
    @GetMapping()
    @ResponseBody
    public String favoriteLanguages(@RequestParam String name, @RequestParam String one, @RequestParam String two, @RequestParam String three){
        return "<html>"+
                "<body>"+
                "<h1> Name: " + name + "/h1>" +
               "<ol>"+ "<li>" + one + "</li>" + "<li>" + two + "</li>" + "<li>" + three + "</li>"+
                "</body>"+
                "</html>";
    }


//    @ResponseBody
//    public String html(){
//      return  "<html>"+
//              "<body>"+
//              "<h1> Skills Tracker</h1>" +
//              "<h2> We have a few skills we would like to learn. Here is my list!!</h2>"+
//              "<ol>"+ "<li> Java </li>" + "<li> JavaScript </li>" + "<li> CSS </li>"+
//              "</body>"+
//              "</html>";
//    }

    @GetMapping("/form")

    @ResponseBody
    public String form(){

        return "<html>" +
                "<body>" +
                "<form action=  'favorite' method= 'post'>" + // submit request to /hello
                "<h3>Enter Your Name:  <input type = 'text' name='name'></h3>"+
                "<h3> My Favorite Language is  </h3>" +
                "<select>"  + " <option>Java</option>  <option>JavaScript</option> <option>CSS</option></select>" +
                "<h3>My 2nd Favorite Language is:  </h3>" +
                "<select name = 'two' > <option>Java</option>  <option>JavaScript</option> <option>CSS</option></select>" +
                "<h3>My 3rd Favorite Language is:  </h3>" +
               " <select name= ' three' > <option>Java</option>  <option>JavaScript</option> <option>CSS</option></select>"  +
                " <input type= 'submit' value='Submit'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }

}
