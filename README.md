# Simple API to lock items (in inventory or in slot) for Nukkit

### Just register the item you want to lock in ``LockedItemRegistry`` when enabling your plugin

```java
LockedItemRegistry.registerLockedItem(ItemID.DIAMOND, true);
```
to lock item in slot ( you `can't` move the item in inventory but you can't drop it ).

```java
LockedItemRegistry.registerLockedItem(ItemID.DIAMOND, false);
```
to lock item in inventory ( you `can` move the item in inventory but you can't drop it )

