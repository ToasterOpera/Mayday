package net.toasteropera.mayday.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.toasteropera.mayday.Mayday;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Mayday.MOD_ID);

    public static final Supplier<CreativeModeTab> MAYDAY_TAB = CREATIVE_MODE_TAB.register("mayday_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.DIAMOND_CRUSHING_HAMMER.get()))
                    .title(Component.translatable("creativetab.mayday.mayday"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.WOODEN_CRUSHING_HAMMER);
                        output.accept(ModItems.STONE_CRUSHING_HAMMER);
                        output.accept(ModItems.IRON_CRUSHING_HAMMER);
                        output.accept(ModItems.GOLD_CRUSHING_HAMMER);
                        output.accept(ModItems.DIAMOND_CRUSHING_HAMMER);
                        output.accept(ModItems.NETHERITE_CRUSHING_HAMMER);
                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}