public class Personnage {
    private static final String[] ORIENTATIONS = {"NORD", "EST", "SUD", "OUEST"};
    private int orientationIndex;
    public Personnage() {
        this.orientationIndex = 0;
    }

    
    
    public String tourner(int fois) {
        orientationIndex = (orientationIndex + 4*fois) % ORIENTATIONS.length;
        return ORIENTATIONS[orientationIndex];
    }

    
}
