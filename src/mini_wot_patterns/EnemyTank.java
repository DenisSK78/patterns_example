package mini_wot_patterns;

import mini_wot_patterns.crow.CrewMember;
import mini_wot_patterns.modules.Module;

import java.util.List;

public class EnemyTank extends Tank{

    public EnemyTank(Integer heals, List<Module> modules, List<CrewMember> crewMembers) {
        setHeals(installHeals());
        setCrewMembers(addCrew());
        setModules(addModules());
    }

    private Integer installHeals(){
        return 1400;
    }
}
