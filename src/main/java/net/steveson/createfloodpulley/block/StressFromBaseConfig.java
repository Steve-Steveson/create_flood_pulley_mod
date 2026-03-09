package net.steveson.createfloodpulley.block;

import com.simibubi.create.AllBlocks;
import com.simibubi.create.api.stress.BlockStressValues;
import com.simibubi.create.infrastructure.config.AllConfigs;
import com.simibubi.create.infrastructure.config.CStress;

public class StressFromBaseConfig {

    public static void register() {
        BlockStressValues.IMPACTS.registerProvider((p) -> {
            if (CFPBlocks.FLOOD_PULLEY.is(p)) {
                final CStress stress = AllConfigs.server().kinetics.stressValues;
                return stress.getImpact(AllBlocks.HOSE_PULLEY.get());
            }
            return null;
        });
    }

}
