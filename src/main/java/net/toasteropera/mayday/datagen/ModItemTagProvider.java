package net.toasteropera.mayday.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.toasteropera.mayday.Mayday;
import net.toasteropera.mayday.item.ModItems;
import net.toasteropera.mayday.util.ModTags;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                              CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, Mayday.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(ModTags.Items.CRUSHING_HAMMERS)
                .add(ModItems.WOODEN_CRUSHING_HAMMER.get())
                .add(ModItems.STONE_CRUSHING_HAMMER.get())
                .add(ModItems.IRON_CRUSHING_HAMMER.get())
                .add(ModItems.GOLD_CRUSHING_HAMMER.get())
                .add(ModItems.DIAMOND_CRUSHING_HAMMER.get())
                .add(ModItems.NETHERITE_CRUSHING_HAMMER.get());
    }
}
