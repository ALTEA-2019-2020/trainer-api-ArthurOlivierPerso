package com.miage.altea.trainer_api.controller;

import com.miage.altea.trainer_api.bo.Trainer;
import com.miage.altea.trainer_api.service.TrainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/trainers")
public class TrainerController {

    private final TrainerService trainerService;

    @Autowired
    TrainerController(TrainerService trainerService){
        this.trainerService = trainerService;
    }

    @GetMapping("/")
    Iterable<Trainer> getAllTrainers(){
        return trainerService.getAllTrainers();
    }

    @GetMapping("/{name}")
    Trainer getTrainer(@PathVariable String name){
        return trainerService.getTrainer(name);
    }

    @PostMapping("/")
    Trainer createTrainer(@Valid @RequestBody Trainer trainer){
        return trainerService.createTrainer(trainer);
    }

    @PutMapping("/{name}")
    Trainer updateTrainer(@Valid @RequestBody Trainer trainer, @PathVariable String name){
        return trainerService.updateTrainer(trainer, name);
    }

    @DeleteMapping("/{name}")
    void deleteTrainer(@PathVariable String name){
        trainerService.deleteTrainer(name);
    }

}