package io.papermc.spawnPlugin;

import com.mojang.brigadier.Command;
import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandSendEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class spawnplugin extends JavaPlugin implements Listener {

    Papyrus.Command spawnCmd = new Papyrus.Command("spawn") {
        {
            description = "Return to spawn";
            usageMessage = "/spawn";
            command.executes(context -> {
                Location spawnLocation = context.getSource().getBukkitWorld().getSpawnLocation();
                Player player = (Player) context.getSource().getBukkitSender();
                player.teleport(spawnLocation);
                return Command.SINGLE_SUCCESS;
            });
        }
    };

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(this, this);
        Papyrus papyrus = new Papyrus(this);
        papyrus.register(spawnCmd);
    }

}