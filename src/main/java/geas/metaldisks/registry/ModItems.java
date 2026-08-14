package geas.metaldisks.registry;

import geas.metaldisks.GeasMetalDIsks;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModItems {
    public static final DeferredRegister.Items  ITEMS =
            DeferredRegister.createItems(GeasMetalDIsks.MOD_ID);


    public static final Supplier<Item> CREATOR_METAL_DISC = ITEMS.register("creator_metal_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.CREATOR_METAL_KEY).stacksTo(1)));

}
