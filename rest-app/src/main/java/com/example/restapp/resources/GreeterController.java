package com.example.restapp.resources;


import org.springframework.web.bind.annotation.*;


//@Controller
//@ResponseBody
@RestController
@RequestMapping("/api/greeter")  //main resource
public class GreeterController {

    //sub resources

    //    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @GetMapping(value = "/list")
    public String sayHello() {
        return "Hello Spring !!!!";
    }

    //@RequestMapping(value = "/create", method = RequestMethod.POST)
    @PostMapping(value = "/create")
    public String create() {
        return "Save is called";
    }

    @DeleteMapping(value = "/remove")
    public String remove() {
        return "delete is called";
    }

    @PutMapping(value = "/update")
    public String update() {
        return "Update is called";
    }

}

