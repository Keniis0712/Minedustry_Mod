package name.minedustry.item;

import name.minedustry.Minedustry;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class MinedustryItems {
    public static final Item LEAD = registerItems("lead", new Item(new Item.Settings()));
    public static final Item TITANIUM = registerItems("titanium", new Item(new Item.Settings()));
    public static final Item THORIUM = registerItems("thorium", new Item(new Item.Settings()));

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
