package com.example.lostpetsfinderapp;

import org.springframework.data.repository.CrudRepository;

public interface LostPetsRepository extends CrudRepository<Pets,Long>
{

}
