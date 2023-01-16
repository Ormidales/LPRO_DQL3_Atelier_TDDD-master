package test.kotlin.exercice_3_monetique.draft;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import main.kotlin.draft.Exemple;

public class ExempleTest {
    
	@Test
    public void TestMemePrix(){
        // Même Prix
        Exemple sut = new Exemple();
        sut.setPrice(5);
        Exemple sut1 = new Exemple();
        sut1.setPrice(5);
        assertEquals(sut.getPrice() ,sut1.getPrice());
    }
    
	@Test
    public void TestPasMemePrix(){
        // Pas Même Prix
        Exemple sut = new Exemple();
        sut.setPrice(5);
        Exemple sut1 = new Exemple();
        sut1.setPrice(4);
        assertNotEquals(sut.getPrice() ,sut1.getPrice());
    }
	
	@Test
	public void testPrixAugmenterEgal() {
		// Prix Augmenter Egal
		Exemple sut = new Exemple();
		sut.setPrice(5);
		sut.augmenter(2);
		assertEquals(7, sut.getPrice());
	}
	
	@Test
	public void testPrixAugmenterNonEgal() {
		// Prix Augmenter Non Egal
		Exemple sut = new Exemple();
		sut.setPrice(5);
		sut.augmenter(2);
		assertNotEquals(6, sut.getPrice());
	}

}