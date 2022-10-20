package no.dadobug.worldgen;

import net.minecraft.block.BlockState;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.util.Pair;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.ChunkRegion;

import java.util.ArrayList;

public class Propagator {
    private BlockPos pos;

    public Propagator(BlockPos pos){
        this.pos = pos;
    }

    public BlockPos getPos() {
        return pos;
    }

    public boolean propagate(ChunkRegion world, Random random, ArrayList<Pair<RuleTest, BlockState>> targets){
        ArrayList<BlockPos> possibleChoices = new ArrayList<>();
        boolean LoopSuccess = false;
        for(byte i = 0; i < 6; i++) {
            Direction direction = Direction.byId(i);
            if(targets.stream().anyMatch((target) -> target.getLeft().test(world.getBlockState(pos.offset(direction)), random))){
                possibleChoices.add(pos.offset(direction));
                LoopSuccess = true;
            }
        }
        if(LoopSuccess){
            pos = possibleChoices.size()==1?possibleChoices.get(0):possibleChoices.get(random.nextInt(possibleChoices.size() - 1));
            return targets.stream().anyMatch((target) -> {
                if (target.getLeft().test(world.getBlockState(pos), random)) {
                    world.setBlockState(pos, target.getRight(), 3);
                    return true;
                }
                return false;
            });
        } else {
            for(byte x = 0; x < 3; x++) {
                for(byte y = 0; y < 3; y++) {
                    for(byte z = 0; z < 3; z++) {
                        byte finalX = (byte) (x - 1);
                        byte finalY = (byte) (y - 1);
                        byte finalZ = (byte) (z - 1);
                        if(targets.stream().anyMatch((target) -> target.getLeft().test(world.getBlockState(pos.add(finalX, finalY, finalZ)), random))){
                            possibleChoices.add(pos.add(finalX, finalY, finalZ));
                            LoopSuccess = true;
                        }

                    }
                }
            }
            if(LoopSuccess){
                pos = possibleChoices.size()==1?possibleChoices.get(0):possibleChoices.get(random.nextInt(possibleChoices.size() - 1));
                return targets.stream().anyMatch((target) -> {
                    if (target.getLeft().test(world.getBlockState(pos), random)) {
                        world.setBlockState(pos, target.getRight(), 3);
                        return true;
                    }
                    return false;
                });
            }
        }
        return false;
    }
}
