import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PersonnageTest {

    @Test
    public void testTourner1Quart() {
        Personnage personnage = new Personnage();
        // Après 1 quart de tour, l'orientation doit être EST
        assertEquals("EST", personnage.tourner(1));
    }

    @Test
    public void testTourner2Quarts() {
        Personnage personnage = new Personnage();
        // Après 2 quarts de tour, l'orientation doit être SUD
        assertEquals("SUD", personnage.tourner(2));
    }

    @Test
    public void testTourner3Quarts() {
        Personnage personnage = new Personnage();
        // Après 3 quarts de tour, l'orientation doit être OUEST
        assertEquals("OUEST", personnage.tourner(3));
    }

    @Test
    public void testTourner4Quarts() {
        Personnage personnage = new Personnage();
        // Après 4 quarts de tour (un tour complet), l'orientation doit revenir à NORD
        assertEquals("NORD", personnage.tourner(4));
    }

    @Test
    public void testTourner5Quarts() {
        Personnage personnage = new Personnage();
        // Après 5 quarts de tour, l'orientation doit être EST
        assertEquals("EST", personnage.tourner(5));
    }

    @Test
    public void testTournerNegative() {
        Personnage personnage = new Personnage();
        // Tester une rotation négative (3 quarts dans le sens inverse des aiguilles d'une montre)
        assertEquals("OUEST", personnage.tourner(-1));
    }

    @Test
    public void testTournerGrandNombre() {
        Personnage personnage = new Personnage();
        // Tester avec un grand nombre de rotations (100 quarts de tour)
        assertEquals("SUD", personnage.tourner(100));
    }
}
