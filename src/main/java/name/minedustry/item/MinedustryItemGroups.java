package name.minedustry.item;

import name.minedustry.Minedustry;
import name.minedustry.block.MinedustryBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class MinedustryItemGroups {
    public static final ItemGroup MINEDUSTRY_GROUP = Registry.register(
        Registries.ITEM_GROUP,
        Identifier.of(Minedustry.MOD_ID,
                "minedustry_group"),
        ItemGroup.create(ItemGroup.Row.TOP, -1)
            .displayName(
                    Text.translatable("itemGroup.minedustry_group"))
            .icon(() -> new ItemStack(MinedustryItems.LEAD))
            .entries(((displayContext, entries) -> {
                entries.add(MinedustryItems.LEAD);
                entries.add(MinedustryItems.TITANIUM);
                entries.add(MinedustryItems.THORIUM);

                entries.add(MinedustryItems.CRYOFLUID_BUCKET);

                entries.add(MinedustryBlocks.COPPER_WALL);
                entries.add(MinedustryBlocks.TITANIUM_WALL);
                entries.add(MinedustryBlocks.THORIUM_WALL);
            }))
            .build());

    public static void registerModItemGroups(){
        Minedustry.LOGGER.info("Registering item groups");
    }
}
