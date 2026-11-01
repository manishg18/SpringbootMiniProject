package com.smsk.healthcare.service;

import com.smsk.healthcare.entity.std;
import com.smsk.healthcare.repository.stdRep;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class stdSer {
    private final stdRep ser;
    public List<std> get(){
        return ser.findAll();
    }
    public std insert(std new_std){
        return ser.save(new_std);
    }

    public std update(Long id,std new_std){

        std oldid=ser.findById(id).orElseThrow(()->new RuntimeException("id not found"));
        oldid.setName(new_std.getName());
        oldid.setAge(new_std.getAge());

        return ser.save(oldid);

    }
    public String delete(Long id){


        ser.deleteById(id);
        return "deleted";

    }

}
