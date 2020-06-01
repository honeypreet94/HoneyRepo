package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.awt.*;
import java.util.ArrayList;
import java.util.List;

@RestController
public class ApiController {

    static ArrayList<TempPojo> al=new ArrayList<>();
    static{
        al.add(new TempPojo(1,"abc",29));
        al.add(new TempPojo(2,"cde",29));
        al.add(new TempPojo(3,"efg",29));
    }

    @RequestMapping(value="/api/temperatures")

    public List<TempPojo> getTemp()
    {
        return al;
    }
}
