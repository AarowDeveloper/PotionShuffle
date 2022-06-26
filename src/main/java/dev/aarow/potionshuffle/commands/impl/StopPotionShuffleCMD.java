package dev.aarow.potionshuffle.commands.impl;

import dev.aarow.potionshuffle.PotionShuffle;
import dev.aarow.potionshuffle.tasks.PotionShuffleTask;
import dev.aarow.potionshuffle.utility.text.CC;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.potion.Potion;

public class StopPotionShuffleCMD implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if(!(commandSender.hasPermission("potionshuffle.staff"))){
            commandSender.sendMessage(CC.translate("&cNo permission."));
            return true;
        }
        if(!PotionShuffle.getInstance().getGameManager().isStarted()){
            commandSender.sendMessage(CC.translate("&cPotion Shuffle is not activated."));
            return true;
        }

        Bukkit.broadcastMessage(CC.translate("&c&lPotion Shuffle has been stopped by " + commandSender.getName() + "."));

        PotionShuffle.getInstance().getGameManager().getPotionShuffleTask().cancel();
        PotionShuffle.getInstance().getGameManager().setPotionShuffleTask(null);
        PotionShuffle.getInstance().getGameManager().setStarted(false);

        return true;
    }
}
