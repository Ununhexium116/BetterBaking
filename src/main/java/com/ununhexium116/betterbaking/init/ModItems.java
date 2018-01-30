package com.ununhexium116.betterbaking.init;

import com.ununhexium116.betterbaking.BetterBaking;
import com.ununhexium116.betterbaking.items.ItemBatterBucket;
import com.ununhexium116.betterbaking.items.ItemDough;
import com.ununhexium116.betterbaking.items.ItemFlour;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = BetterBaking.MODID)
public class ModItems {

    static Item flour;
    static Item dough;
    static Item batterbucket;

    public static void init() {
        flour = new ItemFlour("flour").setCreativeTab(CreativeTabs.FOOD).setMaxStackSize(64);
        dough = new ItemDough("dough").setCreativeTab(CreativeTabs.FOOD).setMaxStackSize(64);
        batterbucket = new ItemBatterBucket("batter_bucket").setCreativeTab(CreativeTabs.FOOD).setMaxStackSize(1);
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(flour, dough, batterbucket);
    }

    @SubscribeEvent
    public static void registerRenders(ModelRegistryEvent event) {
        registerRender(flour);
        registerRender(dough);
        registerRender(batterbucket);
    }

    private static void registerRender(Item item) {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation( item.getRegistryName(), "inventory"));
    }
}
