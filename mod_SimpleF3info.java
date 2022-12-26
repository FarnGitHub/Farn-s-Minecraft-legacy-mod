package net.minecraft.src;

import java.awt.Color;
import java.util.Properties;

import net.minecraft.client.Minecraft;

public class mod_SimpleF3info extends BaseMod {

	public String Version() {
		return "1.0";
	}

	public mod_SimpleF3info() {
		ModLoader.SetInGameHook(this, true, false);
	}

	public boolean OnTickInGame(Minecraft minecraft) {
			ScaledResolution scaledresolution = new ScaledResolution(minecraft.gameSettings, minecraft.displayWidth, minecraft.displayHeight);
			int i = scaledresolution.getScaledWidth();
			int j = scaledresolution.getScaledHeight();
			int k = 2;
			int l = 2;
			byte byte0 = 10;
			boolean flag = false;

			if(minecraft.gameSettings.showDebugInfo && minecraft.inGameHasFocus) {
				int i20 = MathHelper.floor_double(minecraft.thePlayer.posX);
				int i21 = MathHelper.floor_double(minecraft.thePlayer.posY);
				int i22 = MathHelper.floor_double(minecraft.thePlayer.posZ);
				String getBiomeAtplayerPosition = minecraft.theWorld.getWorldChunkManager().getBiomeGenAt(i20, i22).biomeName;

				minecraft.fontRenderer.drawStringWithShadow("Light Level: " + minecraft.thePlayer.worldObj.getBlockLightValue(i20, i21, i22), 2, 96, 14737632);
				minecraft.fontRenderer.drawStringWithShadow("Biome: " + getBiomeAtplayerPosition, 2, 104, 14737632);
				minecraft.fontRenderer.drawStringWithShadow("Seed: " + minecraft.theWorld.getRandomSeed(), 2, 112, 14737632);
			}

		return true;
	}
}
