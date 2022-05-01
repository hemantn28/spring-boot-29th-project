package com.example.demo.controller;

import com.example.demo.model.Newspaper;
import com.example.demo.repository.NewspaperRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DBController {

    //Create
    @Autowired
    NewspaperRepository newspaperRepository;

    @RequestMapping(value = "add_newspaper_db", method = RequestMethod.POST)
    public String add(@RequestBody Newspaper newspaper){
        newspaperRepository.save(newspaper);
        return "newspaper added to DB successfully";
    }


    //Get
    @RequestMapping(value = "get_newspaper_db", method = RequestMethod.GET)
    public List<Newspaper> getAll(){
        return newspaperRepository.findAll();

    }


    //Update
    @RequestMapping(value = "update_newspaper_db/{name}/{id}", method = RequestMethod.PUT)
    public String update(@PathVariable String name,@PathVariable Integer id){
        Newspaper newspaper=newspaperRepository.getById(id);
        newspaper.setName("Hindustan");
        newspaperRepository.save(newspaper);
        return "newspaper updated in DB successfully";
    }


    //Delete

    @RequestMapping(value = "delete_newspaper_db",method = RequestMethod.DELETE)
    public String delete(@RequestParam Integer id){
        newspaperRepository.deleteById(id);
        return "newspaper deleted in Db successfully";

    }

}
