package dev.aarow.potionshuffle.utility.text;

import org.bukkit.ChatColor;

public class CC {

    public static String translate(String input){
        return ChatColor.translateAlternateColorCodes('&', input);
    }
}
