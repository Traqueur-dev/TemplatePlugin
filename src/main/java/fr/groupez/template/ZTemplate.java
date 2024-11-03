package fr.groupez.template;

import fr.groupez.api.ZPlugin;
import fr.groupez.api.placeholder.Placeholders;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public final class ZTemplate extends ZPlugin {


    @Override
    public void enable() {
        Placeholders.register("test", (player, params) -> {
            for (String param : params) {
                System.out.println(param);
            }
            return "Hello";
        });
        Placeholders.register("reltest", (player, player1, params) -> {
            for (String param : params) {
                System.out.println(param);
            }
            return "Hello " + player.getName() + " and " + player1.getName();
        });

        Player player = Bukkit.getPlayer("Traqueur_");
        player.sendMessage(Placeholders.parse(player, "%ztemplate_test%"));
        player.sendMessage(Placeholders.parse(player, player, "%rel_ztemplate_reltest_zoinec%"));
    }

    @Override
    public void disable() {

    }
}
