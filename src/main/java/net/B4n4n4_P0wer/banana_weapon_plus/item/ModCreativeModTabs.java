package net.B4n4n4_P0wer.banana_weapon_plus.item;

import net.B4n4n4_P0wer.banana_weapon_plus.BananaWeaponPlus;
import net.B4n4n4_P0wer.banana_weapon_plus.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BananaWeaponPlus.MOD_ID);

    public static final RegistryObject<CreativeModeTab> BANANA_WEAPON_PLUS_TUB = CREATIVE_MODE_TABS.register("banana_weapon_plus_tub",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.RUBY.get()))
                    .title(Component.translatable("creativetab.banana_weapon_plus_tub"))
                    .displayItems((pParameters, pOutput) -> {
                        //Ruby
                        pOutput.accept(ModItems.RUBY.get());

                        pOutput.accept(ModBlocks.RUBY_BLOCK.get());
                        pOutput.accept(ModBlocks.RUBY_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_RUBY_ORE.get());

                        //Tridents
                        pOutput.accept(ModItems.HELL_TRIDENT_HEAD.get());
                        pOutput.accept(ModItems.HELL_TRIDENT.get());

                        pOutput.accept(ModItems.END_TRIDENT_HEAD.get());
                        pOutput.accept(ModItems.END_TRIDENT.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
