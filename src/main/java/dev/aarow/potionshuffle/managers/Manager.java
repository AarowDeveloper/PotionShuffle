package dev.aarow.potionshuffle.managers;

import dev.aarow.potionshuffle.PotionShuffle;

public abstract class Manager {

    public PotionShuffle plugin = PotionShuffle.getInstance();

    public abstract void setup();

    public Manager(){
        this.setup();
    }
}
