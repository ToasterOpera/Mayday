package net.toasteropera.mayday.datagen;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.toasteropera.mayday.Mayday;
import net.toasteropera.mayday.item.ModItems;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Mayday.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        handheldItem(ModItems.WOODEN_CRUSHING_HAMMER.get());
        handheldItem(ModItems.STONE_CRUSHING_HAMMER.get());
        handheldItem(ModItems.IRON_CRUSHING_HAMMER.get());
        handheldItem(ModItems.GOLD_CRUSHING_HAMMER.get());
        handheldItem(ModItems.DIAMOND_CRUSHING_HAMMER.get());
        handheldItem(ModItems.NETHERITE_CRUSHING_HAMMER.get());
    }
}
