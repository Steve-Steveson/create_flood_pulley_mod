package net.steveson.createfloodpulley.block;

import com.simibubi.create.AllCreativeModeTabs;
import com.simibubi.create.Create;
import com.simibubi.create.content.fluids.hosePulley.HosePulleyBlock;
import com.simibubi.create.foundation.data.BlockStateGen;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.simibubi.create.foundation.data.SharedProperties;
import com.simibubi.create.infrastructure.config.CStress;
import com.tterrag.registrate.util.entry.BlockEntry;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.steveson.createfloodpulley.CreateFloodPulleyMod;
import net.steveson.createfloodpulley.block.custom.FloodPulleyBlock;

import static com.simibubi.create.foundation.data.ModelGen.customItemModel;
import static com.simibubi.create.foundation.data.TagGen.pickaxeOnly;
import static net.steveson.createfloodpulley.CreateFloodPulleyMod.REGISTRATE;


public class CFPBlocks {

    static {
        REGISTRATE.setCreativeTab(AllCreativeModeTabs.BASE_CREATIVE_TAB);
    }

    public static final BlockEntry<FloodPulleyBlock> FLOOD_PULLEY = REGISTRATE.block("flood_pulley", FloodPulleyBlock::new)
            .initialProperties(SharedProperties::copperMetal)
            .properties(BlockBehaviour.Properties::noOcclusion)
            .addLayer(() -> RenderType::cutoutMipped)
            .transform(pickaxeOnly())
            .blockstate(BlockStateGen.horizontalBlockProvider(true))
//            .transform(CStress.setImpact(4.0))
            .item()
            .transform(customItemModel())
            .register();


    // Load this class

    public static void register() {
    }

}
