package com.miage.altea.trainer_api.service;

import com.miage.altea.trainer_api.bo.Trainer;

public interface TrainerService {

    Iterable<Trainer> getAllTrainers();
    Trainer getTrainer(String name);
    Trainer createTrainer(Trainer trainer);
    Trainer updateTrainer(Trainer trainer, String name);
    void deleteTrainer(String name);
}