package FeProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

@Controller
public class WebController {

    @Autowired
    Service service;

    @RequestMapping(method = RequestMethod.GET, value = "/")
    public String getHomePage(){
        return "index.html";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/getalldata")
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody List<DataEntity> getAllData(){
        return service.getAllData();
    }

}
