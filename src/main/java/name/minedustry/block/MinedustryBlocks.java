package name.minedustry.block;

import name.minedustry.Minedustry;
import name.minedustry.fluid.Fluids;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.FluidBlock;
import net.minecraft.block.MapColor;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class MinedustryBlocks {
    public static final Block COPPER_WALL = register(
            "copper_wall",
            new Block(
                    AbstractBlock.Settings.create()
                            .requiresTool()
                            .strength(1.5f, 6.0f)));
    public static final Block TITANIUM_WALL = register(
            "titanium_wall",
            new Block(
                    AbstractBlock.Settings.create()
                            .requiresTool()
                            .strength(2.5f, 6.5f)));
    public static final Block THORIUM_WALL = register(
            "thorium_wall",
            new Block(
                    AbstractBlock.Settings.create()
                            .requiresTool()
                            .strength(3f, 7f)));

    public static final Block CRYOFLUID = register(
            "cryofluid",
            new FluidBlock(
                    Fluids.STILL_CRYOFLUID,
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.LIGHT_BLUE)
                            .replaceable()
                            .noCollision()
                            .strength(100.0F)
                            .pistonBehavior(PistonBehavior.DESTROY)
                            .dropsNothing()
                            .liquid()
                            .sounds(BlockSoundGroup.INTENTIONALLY_EMPTY)
            )
    );
    public static final Block OIL = register(
            "oil",
            new FluidBlock(
                    Fluids.STILL_OIL,
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.BLACK)
                            .replaceable()
                            .noCollision()
                            .strength(100.0F)
                            .pistonBehavior(PistonBehavior.DESTROY)
                            .dropsNothing()
                            .liquid()
                            .sounds(BlockSoundGroup.INTENTIONALLY_EMPTY)
            )
    );
    public static final Block SLAG = register(
            "slag",
            new FluidBlock(
                    Fluids.STILL_SLAG,
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.ORANGE)
                            .replaceable()
                            .noCollision()
                            .strength(100.0F)
                            .pistonBehavior(PistonBehavior.DESTROY)
                            .dropsNothing()
                            .liquid()
                            .sounds(BlockSoundGroup.INTENTIONALLY_EMPTY)
            )
    );

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
