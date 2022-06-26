package dev.aarow.potionshuffle;

import dev.aarow.potionshuffle.commands.impl.StartPotionShuffleCMD;
import dev.aarow.potionshuffle.commands.impl.StopPotionShuffleCMD;
import dev.aarow.potionshuffle.managers.impl.GameManager;
import lombok.Getter;
import org.bukkit.plugin.java.JavaPlugin;

@Getter
public class PotionShuffle extends JavaPlugin {

    @Getter private static PotionShuffle instance;

    private GameManager gameManager;

    @Override
    public void onEnable(){
        this.instance = this;

        this.gameManager = new GameManager();

        this.registerCommands();
    }

    protected void registerCommands(){
        this.getCommand("startpotionshuffle").setExecutor(new StartPotionShuffleCMD());
        this.getCommand("stoppotionshuffle").setExecutor(new StopPotionShuffleCMD());
    }
}
