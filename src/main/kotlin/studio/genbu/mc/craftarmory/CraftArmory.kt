package studio.genbu.mc.craftarmory

import org.bukkit.plugin.java.JavaPlugin
import studio.genbu.mc.craftarmory.events.PlayerEvents

class CraftArmory: JavaPlugin() {

    override fun onLoad() {
        logger.info("CraftArmory has been loaded.")
    }

    override fun onEnable() {
        server.pluginManager.registerEvents(PlayerEvents(), this)

        logger.info("CraftArmory has been enabled.")
    }

    override fun onDisable() {
        logger.info("CraftArmory has been disabled.")
    }

}
