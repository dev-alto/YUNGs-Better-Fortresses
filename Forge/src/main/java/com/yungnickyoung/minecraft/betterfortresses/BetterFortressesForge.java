package com.yungnickyoung.minecraft.betterfortresses;

import com.yungnickyoung.minecraft.betterfortresses.module.ConfigModuleForge;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(BetterFortressesCommon.MOD_ID)
public class BetterFortressesForge {
    public BetterFortressesForge(FMLJavaModLoadingContext fmlJavaModLoadingContext) {
        BetterFortressesCommon.init();
        ConfigModuleForge.init(fmlJavaModLoadingContext);
    }
}