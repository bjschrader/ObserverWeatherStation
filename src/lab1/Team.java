package lab1;

import java.util.ArrayList;
import java.util.List;

/**
 * publisher
 * 
 * @author schra_000
 */
public class Team {
    private String teamColor;
    private List<TeamColorChangeListener> listeners;
    
    public Team(){
        listeners = new ArrayList<>();
    }
    
    public void addListener(TeamColorChangeListener tccs){
        listeners.add(tccs);
    }

    public String getTeamColor() {
        return teamColor;
    }

    public void setTeamColor(String teamColor) {
        this.teamColor = teamColor;
        notifyListeners();
    }
    
    public void notifyListeners(){
        for(TeamColorChangeListener obj : listeners){
        obj.processColorChange();
    }
    }
    
}
