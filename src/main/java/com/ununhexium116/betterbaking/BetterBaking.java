package com.ununhexium116.betterbaking;

import com.ununhexium116.betterbaking.init.ModItems;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.Mod.EventHandler;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid=BetterBaking.MODID, name=BetterBaking.NAME, version=BetterBaking.VERSION, acceptedMinecraftVersions=BetterBaking.ACCEPTED_MINECRAFT_VERSIONS)
public class BetterBaking {

    public static final String MODID = "betterbaking";
    public static final String NAME = "Better Baking";
    public static final String VERSION = "1.0";
    public static final String ACCEPTED_MINECRAFT_VERSIONS = "[1.12]";

    @Instance
    public static BetterBaking instance;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event){
        ModItems.init();
        System.out.println("BetterBaking Preinitialization");
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        System.out.println("BetterBaking Initiazlization");
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event){
        System.out.println("BetterBaking PostInitialization");
    }

}
