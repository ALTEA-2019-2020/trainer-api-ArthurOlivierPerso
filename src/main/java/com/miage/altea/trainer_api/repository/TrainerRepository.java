package com.miage.altea.trainer_api.repository;


import com.miage.altea.trainer_api.bo.Trainer;
import org.springframework.data.repository.CrudRepository;

public interface TrainerRepository extends CrudRepository<Trainer, String> {
}
