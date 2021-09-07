package com.Live.Demo.Project;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("saveLive")
    public Collection<UserModel> saveData(){
        return userService.saveJson();
    }

    @GetMapping("getDataMongo/{id}")
    public List<UserModel> getLiveData(@PathVariable("id") String id){
        return userService.getData(id);
    }

    @GetMapping("isactive/{activeStatus}")
    public List<UserModel> getuserByActiveStatus(@PathVariable("activeStatus") Boolean activeStatus){

   return null;


    }

}
