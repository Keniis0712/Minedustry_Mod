package name.minedustry.block;

import name.minedustry.Minedustry;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class MinedustryBlocks {
    public  static final Block COPPER_WALL = register(
            "copper_wall",
            new Block(
                    AbstractBlock.Settings.create()
                            .requiresTool()
                            .strength(1.5f, 6.0f)));
    public  static final Block TITANIUM_WALL = register(
            "titanium_wall",
            new Block(
                    AbstractBlock.Settings.create()
                            .requiresTool()
                            .strength(2.5f, 6.5f)));
    public  static final Block THORIUM_WALL = register(
            "thorium_wall",
            new Block(
                    AbstractBlock.Settings.create()
                            .requiresTool()
                            .strength(3f, 7f)));

    public static void registerBlockItems(String id, Block block) {
        BlockItem item = Registry.register(
                Registries.ITEM,
                Identifier.of(Minedustry.MOD_ID, id),
                new BlockItem(block, new Item.Settings())
        );
        item.appendBlocks(Item.BLOCK_ITEMS, item);
    }

    public static Block register(String id, Block block) {
        registerBlockItems(id, block);
        return Registry.register(Registries.BLOCK, Identifier.of(Minedustry.MOD_ID, id), block);
    }

    public static void registerModBlock() {
        Minedustry.LOGGER.info("Registering blocks");
    }
}
