package com.generation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.models.Tazon;

@Repository
public interface TazonRepository extends JpaRepository<Tazon, Integer>{

}
