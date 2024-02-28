package com.sherko.lockitem.listeners;

import cn.nukkit.event.EventHandler;
import cn.nukkit.event.EventPriority;
import cn.nukkit.event.Listener;
import cn.nukkit.event.inventory.InventoryClickEvent;
import cn.nukkit.event.player.PlayerDropItemEvent;
import com.sherko.lockitem.core.LockedItemRegistry;

public class InventoryListener implements Listener {

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onItemDrop(PlayerDropItemEvent e){
        int itemId = e.getItem().getId();
        if (!LockedItemRegistry.contains(itemId)) return;
        e.setCancelled();
    }

    @EventHandler (priority = EventPriority.HIGHEST)
    public void onInvItemMove(InventoryClickEvent e){
        int itemId = e.getSourceItem().getId();
        if (!LockedItemRegistry.contains(itemId)) return;
        if (LockedItemRegistry.isSlotLock(itemId)) e.setCancelled();
    }
}
