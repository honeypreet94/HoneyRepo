package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;
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
    @Produces(MediaType.APPLICATION_XML)
    public List<TempPojo> getTemp()
    {
        return al;
    }


    @RequestMapping(value="/api/temperatures/{id}")
    public ResponseEntity<TempPojo> getTempById(@PathVariable int id)
    {
        Iterator iterator=al.iterator();
        while(iterator.hasNext())
        {
            TempPojo obj=(TempPojo)iterator.next();
            if(id==obj.id)
                return new ResponseEntity<TempPojo>(obj, HttpStatus.ACCEPTED);

        }

        return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
    }

    @RequestMapping(value="/api/temperatures/add")
    public ResponseEntity<TempPojo> addTemp(@RequestBody TempPojo obj)
    {
        al.add(obj);
        return new ResponseEntity<>(null,HttpStatus.OK);
    }

    @RequestMapping(value="/api/temperatures/replace/{id}")
    public ResponseEntity<TempPojo> replace(@PathVariable int id, @RequestBody TempPojo obj)
    {
        Iterator itr=al.iterator();
        while(itr.hasNext())
        {
            TempPojo t=(TempPojo)itr.next();
            if(id==t.id)
            {
                int i=al.indexOf(t);
                al.set(i,obj);
                return new ResponseEntity<TempPojo>(obj,HttpStatus.ACCEPTED);
            }

        }
        return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
    }

    @RequestMapping(value="/api/temperatures/delete/{id}")
    public ResponseEntity<TempPojo> deleteData(@PathVariable int id)
    {
        Iterator itr=al.iterator();
        while(itr.hasNext())
        {
            TempPojo t=(TempPojo)itr.next();
            if(id==t.id)
            {
                int i=al.indexOf(t);
                al.remove(i);
                return new ResponseEntity<>(null,HttpStatus.OK);
            }
        }
        return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
    }
    @RequestMapping(value="/api/temperatures/patch/{id}")
    public ResponseEntity<TempPojo> replaceSpecific(@PathVariable int id, @RequestBody TempPojo obj)
    {
        Iterator itr=al.iterator();
        while(itr.hasNext())
        {
            TempPojo t=(TempPojo)itr.next();
            if(id==t.id)
            {
                t.setTemp(obj.getTemp());
                return new ResponseEntity<TempPojo>(obj,HttpStatus.ACCEPTED);
            }

        }
        return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
    }
}
