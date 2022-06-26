package dev.aarow.potionshuffle.tasks;

import dev.aarow.potionshuffle.utility.general.PotionUtility;
import dev.aarow.potionshuffle.utility.text.CC;
import org.bukkit.Bukkit;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scheduler.BukkitRunnable;

public class PotionShuffleTask extends BukkitRunnable {

    @Override
    public void run() {
        PotionEffectType potionEffectType = PotionUtility.getRandomPotionEffect();
        Bukkit.getOnlinePlayers().forEach(online -> {
            online.addPotionEffect(new PotionEffect(potionEffectType, 20 * 60, 1));
        });

        Bukkit.broadcastMessage(CC.translate("&eNew potion effect is &e&l" + potionEffectType.getName() + "&e."));
    }
}
