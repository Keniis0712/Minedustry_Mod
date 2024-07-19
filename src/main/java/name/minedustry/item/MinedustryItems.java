package name.minedustry.item;

import name.minedustry.Minedustry;
import name.minedustry.fluid.Fluids;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static net.minecraft.item.Items.BUCKET;

public class MinedustryItems {
    public static final Item LEAD = registerItems("lead", new Item(new Item.Settings()));
    public static final Item TITANIUM = registerItems("titanium", new Item(new Item.Settings()));
    public static final Item THORIUM = registerItems("thorium", new Item(new Item.Settings()));

    public static final Item CRYOFLUID_BUCKET = registerItems("cryofluid_bucket", new BucketItem(Fluids.STILL_CRYOFLUID, new Item.Settings().recipeRemainder(BUCKET).maxCount(1)));
    public static final Item OIL_BUCKET = registerItems("oil_bucket", new BucketItem(Fluids.STILL_OIL, new Item.Settings().recipeRemainder(BUCKET).maxCount(1)));
    public static final Item SLAG_BUCKET = registerItems("slag_bucket", new BucketItem(Fluids.STILL_SLAG, new Item.Settings().recipeRemainder(BUCKET).maxCount(1)));

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
