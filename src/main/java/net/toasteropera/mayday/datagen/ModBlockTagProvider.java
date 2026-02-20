package net.toasteropera.mayday.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.toasteropera.mayday.Mayday;
import net.toasteropera.mayday.block.ModBlocks;
import net.toasteropera.mayday.util.ModTags;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, Mayday.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(ModTags.Blocks.CRUSHING_HAMMER_MINEABLE)
                .add(Blocks.STONE)
                .add(Blocks.COBBLESTONE)
                .add(Blocks.GRAVEL)
                .add(Blocks.DIRT)
                .add(Blocks.SAND);
    }
}
