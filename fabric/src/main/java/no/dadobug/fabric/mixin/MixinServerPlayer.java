package no.dadobug.fabric.mixin;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.network.ServerPlayerInteractionManager;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import no.dadobug.EntryModule;
import no.dadobug.blocks.OresBlockStates;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

@Mixin(ServerPlayerInteractionManager.class)
public class MixinServerPlayer {
    @Shadow
    public ServerWorld world;
    @Shadow
    public ServerPlayerEntity player;

    /*
    @Inject(at = @At(value = "INVOKE", target = "Lnet/minecraft/item/ItemStack;postMine(Lnet/minecraft/world/World;Lnet/minecraft/block/BlockState;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/entity/player/PlayerEntity;)V"), method = "tryBreakBlock", locals = LocalCapture.CAPTURE_FAILHARD)
    private void regenBlock(BlockPos pos, CallbackInfoReturnable<Boolean> cir, BlockState state) {
        if(state.isIn(EntryModule.REGEN_TAG) && !(EnchantmentHelper.getEquipmentLevel(EntryModule.SHATTERING.get(), player) > 0) && (!(EnchantmentHelper.getEquipmentLevel(EntryModule.CURSE_OF_FRACTURING.get(), player) > 0) || !state.isIn(EntryModule.FRACTURE_TAG)) && (!(EnchantmentHelper.getEquipmentLevel(EntryModule.EXTRACTION.get(), player) > 0) || !state.isIn(EntryModule.CORE_TAG))){

            this.world.setBlockState(pos, state);

        } else if(state.isIn(EntryModule.FRACTURE_TAG) && (EnchantmentHelper.getEquipmentLevel(EntryModule.CURSE_OF_FRACTURING.get(), player) > 0)){

            if(state.contains(OresBlockStates.REPLACE_WITH_BEDROCK)) this.world.setBlockState(pos, EntryModule.BEDROCK_FRACTURED.ore().get().getDefaultState().with(OresBlockStates.REPLACE_WITH_BEDROCK, state.get(OresBlockStates.REPLACE_WITH_BEDROCK)));
            else this.world.setBlockState(pos, EntryModule.BEDROCK_FRACTURED.ore().get().getDefaultState());

        } else if(state.isIn(EntryModule.CORE_TAG) && (EnchantmentHelper.getEquipmentLevel(EntryModule.EXTRACTION.get(), player) > 0)){

            if(state.contains(OresBlockStates.REPLACE_WITH_BEDROCK)) this.world.setBlockState(pos, EntryModule.BEDROCK_HOLLOW.get().getDefaultState().with(OresBlockStates.REPLACE_WITH_BEDROCK, state.get(OresBlockStates.REPLACE_WITH_BEDROCK)));
            else this.world.setBlockState(pos, EntryModule.BEDROCK_HOLLOW.get().getDefaultState());

        } else if(state.contains(OresBlockStates.REPLACE_WITH_BEDROCK) && (EnchantmentHelper.getEquipmentLevel(EntryModule.SHATTERING.get(), player) > 0)){
            if(state.get(OresBlockStates.REPLACE_WITH_BEDROCK))this.world.setBlockState(pos, Blocks.BEDROCK.getDefaultState());
        }
    }
     */
}
