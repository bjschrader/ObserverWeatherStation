package lab1;

/**
 *
 * @author schra_000
 */
public class TeamMemberObserver implements TeamColorChangeListener {

    private String teamColor;
    
    @Override
    public void processColorChange() {
        updateColor();
    }
    
    private void updateColor(){
        
        System.out.println(teamColor);
    }
}
