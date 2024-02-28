package com.sherko.lockitem;

import cn.nukkit.plugin.PluginBase;
import cn.nukkit.utils.TextFormat;
import com.sherko.lockitem.listeners.InventoryListener;

public class LockedItemPlugin extends PluginBase {
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new InventoryListener(), this);
        getLogger().info(TextFormat.YELLOW + "LockItemAPI" + TextFormat.GREEN + " is enabled successfully!");
    }
}