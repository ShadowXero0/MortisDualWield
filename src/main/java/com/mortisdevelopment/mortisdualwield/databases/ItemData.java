package com.mortisdevelopment.mortisdualwield.databases;

import com.mortisdevelopment.mortisdualwield.data.Data;
import org.bukkit.inventory.meta.ItemMeta;
import org.jetbrains.annotations.NotNull;

public class ItemData extends Data {

    private final ItemMeta meta;

    public ItemData(@NotNull ItemMeta meta) {
        super(meta.getPersistentDataContainer());
        this.meta = meta;
    }

    public ItemMeta getMeta() {
        return meta;
    }
}
