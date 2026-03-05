package net.steveson.createfloodpulley.block;

import com.simibubi.create.AllBlocks;
import com.simibubi.create.content.contraptions.pulley.HosePulleyVisual;
import com.simibubi.create.content.fluids.hosePulley.HosePulleyBlockEntity;
import com.simibubi.create.content.fluids.hosePulley.HosePulleyRenderer;
import com.tterrag.registrate.util.entry.BlockEntityEntry;
import net.steveson.createfloodpulley.block.custom.FloodPulleyBlockEntity;
import net.steveson.createfloodpulley.block.custom.FloodPulleyRenderer;
import net.steveson.createfloodpulley.block.custom.FloodPulleyVisual;

import static net.steveson.createfloodpulley.CreateFloodPulleyMod.REGISTRATE;

public class CFPBlockEntities {

    public static final BlockEntityEntry<FloodPulleyBlockEntity> FLOOD_PULLEY = REGISTRATE
            .blockEntity("hose_pulley", FloodPulleyBlockEntity::new)
            .visual(() -> FloodPulleyVisual::new)
            .validBlocks(CFPBlocks.FLOOD_PULLEY)
            .renderer(() -> FloodPulleyRenderer::new)
            .register();

    public static void register() {}
}
