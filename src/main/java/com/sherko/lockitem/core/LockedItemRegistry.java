package com.sherko.lockitem.core;

import java.util.HashMap;
import java.util.Map;

public class LockedItemRegistry {
    private final static Map<Integer, Boolean> LOCKED_ITEMS_MAP = new HashMap<>(); //id, isSlotLocked

    /**
     * registers the item to locked items map
     * @param id item id
     * @param slotLock whether it's inventory locked or slot locked
     */
    public static void registerLockedItem(int id, boolean slotLock){
        LOCKED_ITEMS_MAP.put(id, slotLock);
    }

    public static void unregisterLockedItem(int id) {
        LOCKED_ITEMS_MAP.remove(id);
    }

    public static boolean contains(int id) {
        return LOCKED_ITEMS_MAP.containsKey(id);
    }

    public static boolean isSlotLock(int id) {
        return LOCKED_ITEMS_MAP.get(id);
    }
}
