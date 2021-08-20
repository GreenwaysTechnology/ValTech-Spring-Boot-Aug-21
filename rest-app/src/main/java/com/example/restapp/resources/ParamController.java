package com.example.restapp.resources;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ParamController {

    //id is place hoder which will be updated based on values
    @GetMapping(value = "/customers/{id}")
    public String findById(@PathVariable(value = "id") int id) {
        return "Got Id " + id;
    }

    //http://localhost:8080/api/customers/filter?ranking=prime
    @GetMapping(value = "/customers/filter")
    public String filter(@RequestParam(value = "ranking") String ranking) {
        return "Filter By " + ranking;
    }

    //matrix parameters
    @GetMapping(value = "/customers/contacts/{contactNumber}")
    public String contactInfo(@PathVariable(value = "contactNumber") @MatrixVariable(required = true) int contactNumber) {
        return "Customer Contact Number" + contactNumber;
    }

}
