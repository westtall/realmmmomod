package net.west.realmmmomod.item;


import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.west.realmmmomod.RealmmmoMod;
import net.west.realmmmomod.item.custom.wanditem;

public class ModItems {
public static final Item WAND = registerItem(new wanditem(new Item.Settings().maxDamage(32)));
public static final Item WIZARDSTAFF = registerItem(new  Item(new Item.Settings()));
    public static final Item MITHIRL = registerItem(new Item(new Item.Settings()));




    private static Item registerItem(Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(RealmmmoMod.MOD_ID, "wand"), item);
    }
    public static void registerModItems() {
        RealmmmoMod.LOGGER.info("Registering Mod Items for" + RealmmmoMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(WAND);
            entries.add(WIZARDSTAFF);
            entries.add(MITHIRL);


        });
    }
}
