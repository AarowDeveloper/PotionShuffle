package dev.aarow.potionshuffle.utility.general;

import org.bukkit.potion.PotionEffectType;

import java.util.concurrent.ThreadLocalRandom;

public class PotionUtility {

    public static PotionEffectType getRandomPotionEffect(){
        return PotionEffectType.values()[ThreadLocalRandom.current().nextInt(0, PotionEffectType.values().length-1)];
    }
}
