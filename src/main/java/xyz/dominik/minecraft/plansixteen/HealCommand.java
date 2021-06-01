package xyz.dominik.minecraft.plansixteen;

import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class HealCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if(!(sender instanceof Player)) {
            return true;
        }

        Player player = (Player) sender;

        if(player.hasPermission("xyz.dominik.minecraft.plansixteen.heal")) {
            player.setHealth(20d);
            player.setFoodLevel(20);
            player.sendMessage("Du wurdest geheilt");
            player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_PLING, 0.2f, 0.2f);
        }

        return true;
    }
}
