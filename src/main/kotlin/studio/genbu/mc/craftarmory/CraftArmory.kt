package studio.genbu.mc.craftarmory

import org.bukkit.plugin.java.JavaPlugin

class CraftArmory: JavaPlugin() {

    override fun onLoad() {
        logger.info("CraftArmory has been loaded.")
    }

    override fun onEnable() {
        logger.info("CraftArmory has been enabled.")
    }

    override fun onDisable() {
        logger.info("CraftArmory has been disabled.")
    }

}
