
import uade.edu.ar.gen.AlgoritmoGenomaHumano;

import java.util.ArrayList;
import java.util.List;

public class AlgoritmoGenomaHumanoImplementation implements AlgoritmoGenomaHumano {

    @Override
    public List<Integer> encontrarGenomaHumano(List<List<Integer>> nucleotidos, int rangoDesde, int rangoHasta) {
        List<Integer> resultados = new ArrayList<>();
        encontrarGenomaHumanoRecursivo(nucleotidos, rangoDesde, rangoHasta, "", resultados);
        return resultados;
    }

    private void encontrarGenomaHumanoRecursivo(List<List<Integer>> nucleotidos, int rangoDesde, int rangoHasta,
                                                String valorActual, List<Integer> resultados) {

        // Poda: Verificar si el valor actual (parcialmente construido) está dentro del rango
        if (!valorActual.isEmpty()) {
            int valor = Integer.parseInt(valorActual);
            if (valor >= rangoDesde && valor <= rangoHasta) {
                resultados.add(valor);
            }
        }

        // Poda: Detener la recursión si el tamaño del valor actual es igual al número de conjuntos de nucleótidos
        if (valorActual.length() == nucleotidos.size()) {
            return;
        }

        // Continuar con la construcción del valor actual
        int posicion = valorActual.length();
        List<Integer> nucleotidoActual = nucleotidos.get(posicion);

        for (Integer digito : nucleotidoActual) {
            // Llamada recursiva para agregar el próximo dígito al valor actual
            encontrarGenomaHumanoRecursivo(nucleotidos, rangoDesde, rangoHasta, valorActual + digito, resultados);
        }
    }

}
