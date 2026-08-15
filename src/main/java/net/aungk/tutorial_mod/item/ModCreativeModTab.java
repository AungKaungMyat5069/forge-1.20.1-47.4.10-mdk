package net.aungk.tutorial_mod.item;

import net.aungk.tutorial_mod.TutorialMod;
import net.aungk.tutorial_mod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TutorialMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TUTORIAL_TAB = CREATIVE_MODE_TAB.register("tutorial_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.SAPPHIRE.get()))
                    .title(Component.translatable("creativeTab.tutorial_tab"))
                    .displayItems(
                            (pParemeter, pOutput) -> {
                                pOutput.accept(ModItems.SAPPHIRE.get());
                                pOutput.accept(ModItems.RAW_SAPPHIRE.get());
                                pOutput.accept(ModBlocks.SAPPHIRE_BLOCK.get());
                                pOutput.accept(ModBlocks.RAW_SAPPHIRE_BLOCK.get());

                                pOutput.accept(ModBlocks.SAPPHIRE_ORE.get());
                                pOutput.accept(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get());
                                pOutput.accept(ModBlocks.NETHER_SAPPHIRE_ORE.get());
                                pOutput.accept(ModBlocks.END_STONE_SAPPHIRE_ORE.get());

                                pOutput.accept(ModItems.MEDAL_DETECTOR.get());
                                pOutput.accept(ModBlocks.SOUND_BLOCK.get());
                                pOutput.accept(ModItems.STRAWBERRY.get());
                            }
                    )
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
