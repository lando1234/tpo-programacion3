import java.util.List;

import java.util.List;
import org.junit.jupiter.api.Test;
import uade.edu.ar.gen.AlgoritmoGenomaHumano;

public class UnitTest {


        @Test
        void encontrarNumerosConNucleotidosDe5Cifras() {
            long startTime = System.currentTimeMillis();
            AlgoritmoGenomaHumano algoritmoGenomaHumano = new AlgoritmoGenomaHumanoImplementation();
            algoritmoGenomaHumano.encontrarGenomaHumano((List)null, 10, 50);
            long endTime = System.currentTimeMillis() - startTime;
        }

        @Test
        void encontrarNumerosConNucleotidosDe10Cifras() {
            long startTime = System.currentTimeMillis();
            AlgoritmoGenomaHumano algoritmoGenomaHumano = new AlgoritmoGenomaHumanoImplementation();
            algoritmoGenomaHumano.encontrarGenomaHumano((List)null, 10, 50);
            long endTime = System.currentTimeMillis() - startTime;
        }

        @Test
        void encontrarNumerosConNucleotidosDe50Cifras() {
            long startTime = System.currentTimeMillis();
            AlgoritmoGenomaHumano algoritmoGenomaHumano = new AlgoritmoGenomaHumanoImplementation();
            algoritmoGenomaHumano.encontrarGenomaHumano((List)null, 10, 50);
            long endTime = System.currentTimeMillis() - startTime;
        }

        @Test
        void encontrarNumerosConNucleotidosDe100Cifras() {
            long startTime = System.currentTimeMillis();
            AlgoritmoGenomaHumano algoritmoGenomaHumano = new AlgoritmoGenomaHumanoImplementation();
            algoritmoGenomaHumano.encontrarGenomaHumano((List)null, 10, 50);
            long endTime = System.currentTimeMillis() - startTime;
        }
    }


