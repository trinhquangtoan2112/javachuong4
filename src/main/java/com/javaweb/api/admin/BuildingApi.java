package com.javaweb.api.admin;


import com.javaweb.model.dto.BuildingDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "buildingAPIofAdmin")
@RequestMapping("/api/building")
public class BuildingApi {

    @PostMapping
    public void addOrUpdateBuilding(@RequestBody BuildingDTO buildingDTO){
            System.out.println("14421241421");
        System.out.println("14421241421");
    }
}
