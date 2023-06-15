package FeProject;

import jakarta.servlet.http.HttpServletResponse;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.validation.support.BindingAwareModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Objects;

@Controller
public class WebController {

    @Autowired
    Service service;

    //Send home page to user
    @RequestMapping(method = RequestMethod.GET, value = "/")
    public String getHomePage(){
        return "index.html";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/getalldata")
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody List<DataEntity> getAllData(HttpServletResponse response){
        response.setContentType("application/json");
        return service.getAllData();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/addcrime", consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public void addCrime(@RequestBody String payload){
        service.addCrime(payload);
//        System.out.println(payload);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/getlatlong")
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody List<LatLong> getLatLong(HttpServletResponse response){
        response.setContentType("application/json");
        return service.getLatLong();
    }
}
