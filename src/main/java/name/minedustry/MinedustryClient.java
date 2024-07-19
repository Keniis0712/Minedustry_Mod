package name.minedustry;

import name.minedustry.fluid.Fluids;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.fabricmc.fabric.api.client.render.fluid.v1.SimpleFluidRenderHandler;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.util.Identifier;

public class MinedustryClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        FluidRenderHandlerRegistry.INSTANCE.register(Fluids.STILL_CRYOFLUID, Fluids.FLOWING_CRYOFLUID,
                new SimpleFluidRenderHandler(
                        Identifier.of("minedustry", "block/cryofluid_still"),
                        Identifier.of("minedustry", "block/cryofluid_flow"),
                        0x66ccff
                )
        );
        FluidRenderHandlerRegistry.INSTANCE.register(Fluids.STILL_OIL, Fluids.FLOWING_OIL,
                new SimpleFluidRenderHandler(
                        Identifier.of("minedustry", "block/oil_still"),
                        Identifier.of("minedustry", "block/oil_flow"),
                        0xFFFFFF
                )
        );
        FluidRenderHandlerRegistry.INSTANCE.register(Fluids.STILL_SLAG, Fluids.FLOWING_SLAG,
                new SimpleFluidRenderHandler(
                        Identifier.of("minedustry", "block/slag_still"),
                        Identifier.of("minedustry", "block/slag_flow"),
                        0xFF8142
                )
        );
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(),
                Fluids.STILL_CRYOFLUID, Fluids.FLOWING_CRYOFLUID,
                Fluids.STILL_OIL, Fluids.FLOWING_OIL,
                Fluids.STILL_SLAG, Fluids.FLOWING_SLAG);
    }
}
