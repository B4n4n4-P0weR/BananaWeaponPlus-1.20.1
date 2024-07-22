package net.B4n4n4_P0wer.banana_weapon_plus.item;

import net.B4n4n4_P0wer.banana_weapon_plus.BananaWeaponPlus;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BananaWeaponPlus.MOD_ID);

    public static final RegistryObject<Item> RUBY  = ITEMS.register("ruby",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> END_TRIDENT_HEAD  = ITEMS.register("end_trident_head",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> END_TRIDENT  = ITEMS.register("end_trident",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> HELL_TRIDENT_HEAD  = ITEMS.register("hell_trident_head",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HELL_TRIDENT  = ITEMS.register("hell_trident",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SHINING_WITHER_ROSE  = ITEMS.register("shining_wither_rose",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
