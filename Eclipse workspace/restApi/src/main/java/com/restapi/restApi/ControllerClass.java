package com.restapi.restApi;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerClass {


    @RequestMapping(value="/api/authenticate")
    public ResponseEntity<PojoClass> authenticate(@RequestBody PojoClass obj)
    {
        if(obj.username.equals("Honey") && obj.password.equals("Honey"))
            return new ResponseEntity<PojoClass>(obj,HttpStatus.OK );

        return new ResponseEntity<>(null ,HttpStatus.NOT_FOUND);

    }

}
