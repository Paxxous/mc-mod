package net.paxxous.testingmod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.paxxous.testingmod.TestingMod;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    //create the block
    public static final Block POOP = registerBlock("poop",
            new Block(FabricBlockSettings.of(Material.METAL).breakInstantly()), ItemGroup.MISC);

    //register the block itself
    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(TestingMod.MOD_ID, name), block);
    }

    //register the block item
    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(TestingMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    //register
    public static void registerModBocks() {
        TestingMod.LOGGER.info("Registering ModBlocks for " + TestingMod.MOD_ID);
    }

}
