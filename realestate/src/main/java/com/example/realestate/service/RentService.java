package com.example.realestate.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.example.realestate.model.Rent;
import com.example.realestate.repository.RentRepository;

@Service
public class RentService {
    private RentRepository rentRepository;
    public RentService(RentRepository rentRepository)
    {
        this.rentRepository=rentRepository;
    }
    public boolean saveRent(Rent rent)
    {
        try
        {
            rentRepository.save(rent);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    
    public List<Rent> rentDetails()
    {
        return rentRepository.findAll();
    }
    
    public boolean updateRentDetails(int id,Rent rent)
    {
        if(this.getProductId(id) == null)
        {
            return false;
        }
        try
        {
            rentRepository.save(rent);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }

    public Rent getProductId(int id)
    {
        return rentRepository.findById(id).orElse(null);
    }
    
    public boolean deleteProperty(int id)
    {
        if(this.getProductId(id) == null)
            return false;
        rentRepository.deleteById(id);
        return true;
    }
}
