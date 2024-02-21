package com.example.realestate.controller;

import org.springframework.web.bind.annotation.RestController;
import com.example.realestate.model.Rent;
import com.example.realestate.service.RentService;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
public class RentController {
    private RentService rentService;
    public RentController(RentService rentService)
    {
        this.rentService=rentService;
    }
    @PostMapping("/rent")
    public ResponseEntity<Rent> postRentDetails(@RequestBody Rent rent) {
        if(rentService.saveRent(rent) == true)
            return new ResponseEntity<>(rent,HttpStatus.OK);
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
    
    @GetMapping("/rent")
    public ResponseEntity<List<Rent>> getRentDetails() {
        List<Rent> list=rentService.rentDetails();
        if(list == null)
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        return new ResponseEntity<>(list,HttpStatus.OK);
    }
    
    @PutMapping("/rent/{propertyId}")
    public ResponseEntity<Rent> updateDetails(@PathVariable("propertyId") int id, @RequestBody Rent rent) {
        if(rentService.updateRentDetails(id, rent) == true)
            return new ResponseEntity<>(rent,HttpStatus.OK);
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @DeleteMapping("/rent/{productId}")
    public ResponseEntity<Rent> deleteProperty(@PathVariable("propertyId") int id)
    {
        if(rentService.deleteProperty(id) == true)
        {
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);

    }
}
