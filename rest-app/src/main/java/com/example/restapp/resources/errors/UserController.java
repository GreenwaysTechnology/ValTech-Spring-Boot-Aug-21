package com.example.restapp.resources.errors;

import com.example.restapp.resources.ResposeTransfer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping("/{id}")
    public ResponseEntity getById(@PathVariable long id) {
        if (id == 10) {
           throw new UserNotFoundException("User Not Found");
        }
        return ResponseEntity.ok().body("User found!");
    }

    //error handler

//    @ExceptionHandler(UserNotFoundException.class)
//    public ResponseEntity handleError() {
//        return ResponseEntity.status(400).body(new ResposeTransfer("User Not Found"));
//    }
//
//    //inner classes
    private class UserNotFoundException extends RuntimeException {
        public UserNotFoundException() {
        }

        public UserNotFoundException(String message) {
            super(message);
        }

        public UserNotFoundException(String message, Throwable cause) {
            super(message, cause);
        }

        public UserNotFoundException(Throwable cause) {
            super(cause);
        }

        public UserNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
            super(message, cause, enableSuppression, writableStackTrace);
        }
    }
}
