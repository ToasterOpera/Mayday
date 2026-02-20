package net.toasteropera.mayday.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.toasteropera.mayday.Mayday;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> CRUSHING_HAMMER_MINEABLE = createTag("crushing_hammer_mineable");

        private static TagKey<Block> createTag(String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(Mayday.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> CRUSHING_HAMMERS = createTag("crushing_hammers");

        private static TagKey<Item> createTag(String name) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(Mayday.MOD_ID, name));
        }
    }
}