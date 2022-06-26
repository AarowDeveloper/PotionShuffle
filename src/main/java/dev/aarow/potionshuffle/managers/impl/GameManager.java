package dev.aarow.potionshuffle.managers.impl;

import dev.aarow.potionshuffle.tasks.PotionShuffleTask;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GameManager {

    private boolean started;

    private PotionShuffleTask potionShuffleTask;
    public GameManager(){
        this.started = false;
    }

}
