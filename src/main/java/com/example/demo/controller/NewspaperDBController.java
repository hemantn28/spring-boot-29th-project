package com.example.demo.controller;

import com.example.demo.model.Newspaper;
import com.example.demo.service.DBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class NewspaperDBController {

    @Autowired
    DBService service;

    @RequestMapping(value = "add_newspapers_db", method = RequestMethod.POST)
    public String add(@RequestBody Newspaper newspaper){

        return service.add(newspaper);
    }


    //Get
    @RequestMapping(value = "get_newspapers_db", method = RequestMethod.GET)
    public List<Newspaper> getAll(){
        return service.getAll();

    }


    //Update
    @RequestMapping(value = "update_newspapers_db/{name}/{id}", method = RequestMethod.PUT)
    public String update(@PathVariable String name, @PathVariable Integer id){
       service.update("Hindustan",110);
       return "newspapers updated in DB successfully";
    }


    //Delete

   @RequestMapping(value = "delete_newspapers_db",method = RequestMethod.DELETE)
    public String delete(@RequestParam Integer id){
        service.delete(107);
        return "newspapers deleted in Db successfully";

    }

}


