package no.dadobug.blocks;

import net.minecraft.state.property.BooleanProperty;

public class BedrockStates {
    public static final BooleanProperty REPLACE_WITH_BEDROCK = BooleanProperty.of("replace_with_bedrock");

    public enum CoreType{
        FRACTURED,
        NORMAL,
        FLUID,
        JOKE_FLUID_ONE,
        JOKE_ITEM_ONE
    }

}
