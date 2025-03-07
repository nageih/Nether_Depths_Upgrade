package com.scouter.netherdepthsupgrade.utils;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.Block;

import static com.scouter.netherdepthsupgrade.NetherDepthsUpgrade.prefix;

public class NDUTags {
    public static class Blocks {
        private static TagKey<Block> tag(String name){
            return BlockTags.create(prefix(name));

        }
        private static TagKey<Block> forgeTag(String name){
            return BlockTags.create(new ResourceLocation("forge", name));

        }
    }

    public static class Items {
        private static TagKey<Item> tag(String name){
            return ItemTags.create(prefix(name));

        }
        private static TagKey<Item> forgeTag(String name){
            return ItemTags.create(new ResourceLocation("forge", name));

        }
    }

    public static class EntityTypes {
        private static TagKey<EntityType<?>> tag(String name){
            return TagKey.create(Registry.ENTITY_TYPE_REGISTRY, prefix(name));

        }
        private static TagKey<EntityType<?>> forgeTag(String name){
            return TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("forge", name));

        }
    }

    public static class Biomes {
        public static final TagKey<Biome> IS_LAVA_PUFFERFISH_BIOME = tag("is_lava_pufferfish_biome");
        public static final TagKey<Biome> IS_WITHER_BONEFISH_BIOME = tag("is_wither_bonefish_biome");
        public static final TagKey<Biome> IS_BONEFISH_BIOME = tag("is_bonefish_biome");
        public static final TagKey<Biome> IS_GLOWDINE_BIOME = tag("is_glowdine_biome");
        public static final TagKey<Biome> IS_MAGMACUBEFISH_BIOME = tag("is_magmacubefish_biome");
        public static final TagKey<Biome> IS_SOULSUCKER_BIOME = tag("is_soulsucker_biome");
        public static final TagKey<Biome> IS_BLAZEFISH_BIOME = tag("is_blazefish_biome");
        public static final TagKey<Biome> IS_SEARING_COD_BIOME = tag("is_searing_cod_biome");
        public static final TagKey<Biome> IS_OBSIDIANFISH_BIOME = tag("is_obsidianfish_biome");

        private static TagKey<Biome> tag(String name){
            return TagKey.create(Registry.BIOME_REGISTRY, prefix(name));

        }
        private static TagKey<Biome> forgeTag(String name){
            return TagKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("forge", name));

        }
    }
}
