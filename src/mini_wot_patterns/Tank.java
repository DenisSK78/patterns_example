package mini_wot_patterns;


import mini_wot_patterns.crow.Charger;
import mini_wot_patterns.crow.Commander;
import mini_wot_patterns.crow.CrewMember;
import mini_wot_patterns.crow.Mechanic;
import mini_wot_patterns.modules.LeftTrack;
import mini_wot_patterns.modules.Module;
import mini_wot_patterns.modules.RightTrack;
import mini_wot_patterns.modules.Tower;
import mini_wot_patterns.shell.ShellDamage;

import java.util.ArrayList;
import java.util.List;

public class Tank implements Gun, ShellDamage {

    private Integer heals;
    private List<Module> modules;
    private List<CrewMember> crewMembers;

    @Override
    public void shot() {
    }

    @Override
    public Damage bang() {
        return new Damage();
    }

    public Integer getHeals() {
        return heals;
    }

    public List<Module> getModules() {
        return modules;
    }

    public List<CrewMember> getCrewMembers() {
        return crewMembers;
    }

    void setHeals(Integer heals) {
        this.heals = heals;
    }

    void setModules(List<Module> modules) {
        this.modules = modules;
    }

    void setCrewMembers(List<CrewMember> crewMembers) {
        this.crewMembers = crewMembers;
    }

    List<CrewMember> addCrew(){
        List<CrewMember> crewMembers = new ArrayList<>();
        crewMembers.add(new Commander());
        crewMembers.add(new Mechanic());
        crewMembers.add(new Charger());
        return crewMembers;
    }

    List<Module> addModules(){
        List<Module> modules = new ArrayList<>();
        modules.add(new mini_wot_patterns.modules.Gun());
        modules.add(new LeftTrack());
        modules.add(new RightTrack());
        modules.add(new Tower());
        return  modules;
    }
}
