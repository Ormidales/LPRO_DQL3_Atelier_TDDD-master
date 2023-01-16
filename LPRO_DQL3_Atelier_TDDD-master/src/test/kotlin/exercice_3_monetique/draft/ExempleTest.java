package test.kotlin.exercice_3_monetique.draft;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertSame;

import org.junit.Test;

import main.kotlin.draft.AutreExemple;
import main.kotlin.draft.Exemple;
import main.kotlin.draft.IExemple;

class ExempleTest {
    @Test
    public void Test1(){
        //arrange
        Exemple sut = new Exemple();
        sut.setPrice(2);
        Exemple sut1 = new Exemple();
        sut1.setPrice(2);

        assertNotEquals(sut1, sut);
        assertEquals( sut1.getClass(), sut.getClass()  );
        assertSame(sut1, sut);

        AutreExemple sut2  = new AutreExemple();
        IExemple monExemple = sut2;

        assertEquals(sut, monExemple);

        monExemple = sut;
        //Object a = null;

        assertEquals(sut, monExemple);

        sut.setPrice(4);

        //act
        sut.augmenter(2);

        //assert
        assertEquals(6, sut.getPrice());
    }

}