package net.toasteropera.mayday.item;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.toasteropera.mayday.Mayday;
import net.toasteropera.mayday.util.ModTags;

import java.util.List;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Mayday.MOD_ID);

//    public static final DeferredItem<Item> BISMUTH = ITEMS.register("bismuth",
//            () -> new Item(new Item.Properties()));
//    public static final DeferredItem<Item> RAW_BISMUTH = ITEMS.register("raw_bismuth",
//            () -> new Item(new Item.Properties()));

//    public static final DeferredItem<Item> CHISEL = ITEMS.register("chisel",
//            () -> new ChiselItem(new Item.Properties().durability(32)));

//    public static final DeferredItem<Item> RADISH = ITEMS.register("radish",
//            () -> new Item(new Item.Properties().food(ModFoodProperties.RADISH)) {
//                @Override
//                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
//                    tooltipComponents.add(Component.translatable("tooltip.tutorialmod.radish.tooltip"));
//                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
//                }
//            });

    //    public static final DeferredItem<Item> FROSTFIRE_ICE = ITEMS.register("frostfire_ice",
//            () -> new FuelItem(new Item.Properties(), 800));
//    public static final DeferredItem<Item> STARLIGHT_ASHES = ITEMS.register("starlight_ashes",
//            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> WOODEN_CRUSHING_HAMMER = ITEMS.register("wooden_crushing_hammer",
            () -> new DiggerItem(Tiers.WOOD, ModTags.Blocks.CRUSHING_HAMMER_MINEABLE, new Item.Properties()
                    .attributes(DiggerItem.createAttributes(Tiers.WOOD, 5f, -3.0f))));
    public static final DeferredItem<Item> STONE_CRUSHING_HAMMER = ITEMS.register("stone_crushing_hammer",
            () -> new DiggerItem(Tiers.STONE, ModTags.Blocks.CRUSHING_HAMMER_MINEABLE, new Item.Properties()
                    .attributes(DiggerItem.createAttributes(Tiers.STONE, 6f, -3.0f))));
    public static final DeferredItem<Item> IRON_CRUSHING_HAMMER = ITEMS.register("iron_crushing_hammer",
            () -> new DiggerItem(Tiers.IRON, ModTags.Blocks.CRUSHING_HAMMER_MINEABLE, new Item.Properties()
                    .attributes(DiggerItem.createAttributes(Tiers.IRON, 7f, -3.0f))));
    public static final DeferredItem<Item> GOLD_CRUSHING_HAMMER = ITEMS.register("gold_crushing_hammer",
            () -> new DiggerItem(Tiers.GOLD, ModTags.Blocks.CRUSHING_HAMMER_MINEABLE, new Item.Properties()
                    .attributes(DiggerItem.createAttributes(Tiers.GOLD, 8f, -3.0f))));
    public static final DeferredItem<Item> DIAMOND_CRUSHING_HAMMER = ITEMS.register("diamond_crushing_hammer",
            () -> new DiggerItem(Tiers.DIAMOND, ModTags.Blocks.CRUSHING_HAMMER_MINEABLE, new Item.Properties()
                    .attributes(DiggerItem.createAttributes(Tiers.DIAMOND, 9f, -3.0f))));
    public static final DeferredItem<Item> NETHERITE_CRUSHING_HAMMER = ITEMS.register("netherite_crushing_hammer",
            () -> new DiggerItem(Tiers.NETHERITE, ModTags.Blocks.CRUSHING_HAMMER_MINEABLE, new Item.Properties()
                    .attributes(DiggerItem.createAttributes(Tiers.NETHERITE, 10f, -3.0f))));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}