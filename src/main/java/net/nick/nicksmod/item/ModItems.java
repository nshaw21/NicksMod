package net.nick.nicksmod.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.nick.nicksmod.NicksMod;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, NicksMod.MOD_ID);

    public static final RegistryObject<Item> LIGHTNING_ESSENCE = ITEMS.register("lightning_essence",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> LIGHTNING_SWORD = ITEMS.register("lightning_sword",
            () -> new SwordItem(ModToolTiers.LIGHTNING, 5,-2.4f, new Item.Properties()));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
