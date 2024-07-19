package name.minedustry.fluid;

import net.minecraft.fluid.FlowableFluid;
import net.minecraft.fluid.Fluid;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class Fluids {
    public static final FlowableFluid FLOWING_CRYOFLUID = register("cryofluid", new CryoFluid.Flowing());
    public static final FlowableFluid STILL_CRYOFLUID = register("cryofluid", new CryoFluid.Still());
    public static final FlowableFluid FLOWING_OIL = register("oil", new Oil.Flowing());
    public static final FlowableFluid STILL_OIL = register("oil", new Oil.Still());
    public static final FlowableFluid FLOWING_SLAG = register("slag", new Slag.Flowing());
    public static final FlowableFluid STILL_SLAG = register("slag", new Slag.Still());

    private static <T extends Fluid> T register(String id, T value) {
        return Registry.register(Registries.FLUID, id, value);
    }
}
