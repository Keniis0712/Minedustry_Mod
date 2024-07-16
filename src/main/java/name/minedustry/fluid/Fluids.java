package name.minedustry.fluid;

import net.minecraft.fluid.FlowableFluid;
import net.minecraft.fluid.Fluid;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class Fluids {
    public static final FlowableFluid FLOWING_CRYOFLUID = register("cryofluid", new CryoFluid.Flowing());
    public static final FlowableFluid STILL_CRYOFLUID = register("cryofluid", new CryoFluid.Still());

    private static <T extends Fluid> T register(String id, T value) {
        return Registry.register(Registries.FLUID, id, value);
    }
}
