package com.example.demo.service;

import com.example.demo.model.Newspaper;
import com.example.demo.repository.NewspaperRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class DBService {

    @Autowired
    NewspaperRepository newspaperRepository;

    public String add( Newspaper newspaper){
        newspaperRepository.save(newspaper);
        return "newspaper added to DB successfully";
    }


    public List<Newspaper> getAll(){
        return newspaperRepository.findAll();

    }


    public String update(@PathVariable String name, @PathVariable Integer id){
        Newspaper newspaper=newspaperRepository.getById(id);
        newspaper.setName("Hindustan");
        newspaperRepository.save(newspaper);
        return "newspaper updated in DB successfully";
    }


    public String delete(@RequestParam Integer id){
        newspaperRepository.deleteById(id);
        return "newspapers deleted in Db successfully";

    }

}
