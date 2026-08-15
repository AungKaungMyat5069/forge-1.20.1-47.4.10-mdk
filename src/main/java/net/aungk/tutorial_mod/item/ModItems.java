package net.aungk.tutorial_mod.item;

import net.aungk.tutorial_mod.TutorialMod;
import net.aungk.tutorial_mod.item.custom.MedalDetectorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    //work like sheet
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    // add to the sheet
    // new Properties - work like as the normal item, can not use bow or other function
    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_SAPPHIRE = ITEMS.register("raw_sapphire", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MEDAL_DETECTOR = ITEMS.register("medal_detector",
            () -> new MedalDetectorItem(new Item.Properties().durability(100)));
    public static final RegistryObject<Item> STRAWBERRY = ITEMS.register("strawberry", () -> new Item(new Item.Properties().food(ModFoods.STAWBERRY)));

    // give it to the minecraft code
    public static void register(IEventBus iEventBus) {
        ITEMS.register(iEventBus);
    }
}
