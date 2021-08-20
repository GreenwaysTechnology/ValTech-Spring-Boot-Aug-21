package com.example.restapp.resources;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/response")
public class ResponseController {


    //plain text: string
    @GetMapping("/str")
    public String hello() {
        return "Hello";
    }

    @GetMapping("/object")
    public Customer customer() {
        return new Customer(1, "Subramanian");
    }

    //sending Status code : GET 200 OK /POST

    @PostMapping("/save")
    // @ResponseBody
    @ResponseStatus(HttpStatus.CREATED)
    public ResposeTransfer postForm(@RequestBody LoginForm loginForm) {
        System.out.println(loginForm);
        return new ResposeTransfer("Thank you for Posting");
    }

    @GetMapping("/info")
    public ResponseEntity sendMoreInfo() {
        Customer customer = new Customer(1, "Subramanian");
        //payload,header,status code
        return ResponseEntity
                .status(HttpStatus.OK)
                .header("myheader","myvalue")
                .body(customer);
    }


}
