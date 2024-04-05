package com.epicode.U5D2.dao;

import com.epicode.U5D2.entities.Drink;
import com.epicode.U5D2.entities.Pizza;
import com.epicode.U5D2.entities.Topping;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class PizzaService {
    @Autowired
    private PizzaDAO pDAO;
    @Autowired
    private ToppingDAO tDAO;
    @Autowired
    private DrinkDAO dDAO;

    public void saveTopping(Topping newTopping){
        if (newTopping.getName().length() < 0) throw new RuntimeException("devi inserire un nome più lungo di due caratteri");
        tDAO.save(newTopping);
        log.info("pizza salvata");
    }

    public void savePizza(Pizza newPizza){
        if (newPizza.getName().length() < 0) throw new RuntimeException("devi inserire un nome più lungo di due caratteri");
        pDAO.save(newPizza);
        log.info("topping salvato");
    }

    public void saveDrinks(Drink newDrink){
        if (newDrink.getName().length() < 0) throw new RuntimeException("devi inserire un nome più lungo di due caratteri");
        dDAO.save(newDrink);
        log.info("drink salvato");
    }

public List<Pizza> findByName(String name){
        return pDAO.findByName(name);
}

    public List<Pizza> filterByPartialName(String partialName){
        return pDAO.findByNameStartingWithIgnoreCase(partialName);
    }

    public List<Pizza> filterIsXL(){
        return pDAO.filterByIsXL();
    }
}
