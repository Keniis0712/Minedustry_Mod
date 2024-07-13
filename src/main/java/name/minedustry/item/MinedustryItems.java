package name.minedustry.item;

import name.minedustry.Minedustry;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class MinedustryItems {
    public static final Item LEAD = registerItems("lead", new Item(new Item.Settings()));

    private static Item registerItems(String id, Item item){
        return Registry.register(
                Registries.ITEM,
                Identifier.of(Minedustry.MOD_ID, id),
                item);
    }

    public static void registerModItems(){
        Minedustry.LOGGER.info("Registering items");
    }
}
