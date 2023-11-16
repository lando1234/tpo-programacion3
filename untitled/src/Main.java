import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        List<Integer> neuclo = new ArrayList<Integer>();
        neuclo.add(5);
        neuclo.add(3);
        neuclo.add(7);

        List<Integer> tido = new ArrayList<Integer>();
        tido.add(4);
        tido.add(5);
        tido.add(9);
        tido.add(2);
        List<List<Integer>> lista = new ArrayList<List<Integer>>();
        lista.add(neuclo);
        lista.add(tido);

        AlgoritmoGenomaHumanoImplementation imple = new AlgoritmoGenomaHumanoImplementation();

        List<Integer> result = imple.encontrarGenomaHumano(lista,40,78);

        result.forEach( i -> {System.out.println(i);} );


        }
    }