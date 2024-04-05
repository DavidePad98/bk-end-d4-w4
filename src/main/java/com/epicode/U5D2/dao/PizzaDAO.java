package com.epicode.U5D2.dao;

import com.epicode.U5D2.entities.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PizzaDAO extends JpaRepository<Pizza, Long> {

    List<Pizza> findByName(String name);

    List<Pizza> findByNameStartingWithIgnoreCase(String partialName);

@Query("SELECT p FROM Pizza p WHERE p.isXl = true")
List<Pizza> filterByIsXL();
}
