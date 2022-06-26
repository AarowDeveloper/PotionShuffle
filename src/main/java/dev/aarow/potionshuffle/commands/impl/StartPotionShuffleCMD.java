package dev.aarow.potionshuffle.commands.impl;

import dev.aarow.potionshuffle.PotionShuffle;
import dev.aarow.potionshuffle.tasks.PotionShuffleTask;
import dev.aarow.potionshuffle.utility.text.CC;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.potion.Potion;

public class StartPotionShuffleCMD implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if(!(commandSender.hasPermission("potionshuffle.staff"))){
            commandSender.sendMessage(CC.translate("&cNo permission."));
            return true;
        }
        if(PotionShuffle.getInstance().getGameManager().isStarted()){
            commandSender.sendMessage(CC.translate("&cPotion Shuffle has been already activated."));
            return true;
        }

        Bukkit.broadcastMessage(CC.translate("&a&lPotion Shuffle has been activated by " + commandSender.getName() + "."));

        PotionShuffleTask potionShuffleTask = new PotionShuffleTask();

        PotionShuffle.getInstance().getGameManager().setPotionShuffleTask(potionShuffleTask);

        potionShuffleTask.runTaskTimer(PotionShuffle.getInstance(), 0, 20 * 60L);

        return true;
    }
}
