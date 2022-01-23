package net.paxxous.testingmod.item;


import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.paxxous.testingmod.TestingMod;


public class ModItems {
    public static final Item MEN = registerItem("men",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    public static final Item EZLMAO = registerItem("ezlmao",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(TestingMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        TestingMod.LOGGER.info("Registering Mod Items for" + TestingMod.MOD_ID);
    }

}
