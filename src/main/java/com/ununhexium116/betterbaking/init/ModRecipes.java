package com.ununhexium116.betterbaking.init;

import com.ununhexium116.betterbaking.BetterBaking;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistryModifiable;

@Mod.EventBusSubscriber(modid = BetterBaking.MODID)
public class ModRecipes {

    @SubscribeEvent
    public static void registerRecipes(RegistryEvent.Register<IRecipe> event) {
        ResourceLocation bread = new ResourceLocation("minecraft:bread");

        IForgeRegistryModifiable modRegistry = (IForgeRegistryModifiable) event.getRegistry();

        modRegistry.remove(bread);
    }

}
