package com.sherko.lockitem;

import cn.nukkit.plugin.PluginBase;
import cn.nukkit.utils.TextFormat;

public class LockedItemPlugin extends PluginBase {
    @Override
    public void onEnable() {
        getLogger().info(TextFormat.YELLOW + "LockItemAPI" + TextFormat.GREEN + " is enabled successfully!");
    }
}