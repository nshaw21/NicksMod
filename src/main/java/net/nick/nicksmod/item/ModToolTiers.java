package net.nick.nicksmod.item;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;
import net.nick.nicksmod.NicksMod;
import net.nick.nicksmod.util.ModTags;

import java.util.List;

public class ModToolTiers {
    public static final Tier LIGHTNING = TierSortingRegistry.registerTier(
            /*
            Level - 0 (Wood & Gold), 1 (Stone), 2 (Iron), 3 (Diamond), 4 (netherite) 5 (1 step netherite)
            Uses - Durability
            Speed - The efficiency multiplier of all items in this tier.
            (Fist damage is 1, so you add the speed for the tools on top of the base fist speed.)
            attackDamageBonus - The base attack damage of all items in this tier + 1. (Adds the number you put + 1)
            enchantmentValue - How enchantable an item of this tier is
             */
            new ForgeTier(5,1500,12.0f,4,25,
                    ModTags.Blocks.NEEDS_LIGHTNING_TOOL, () -> Ingredient.of(ModItems.LIGHTNING_ESSENCE.get())),
            new ResourceLocation(NicksMod.MOD_ID, "lightning"), List.of(Tiers.NETHERITE), List.of());
}
