import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(5);
        lista.add(5);
        lista.add(3);
        lista.add(3);

        System.out.println("Número de ocorrências do número 5: "+nOcorrencias(lista, 5));
        System.out.println("Valores repetidos: "+listRepeat(lista));
    }
    public static int nOcorrencias(ArrayList<Integer> l, Integer el) {
        int count = 0;
        for (Integer num : l) {
            if (num.equals(el)) {
                count++;
            }
        }
        return count;
    }

    public static ArrayList<Integer> listRepeat(ArrayList<Integer> l) {
        ArrayList<Integer> repetidos = new ArrayList<>();
        ArrayList<Integer> lidos = new ArrayList<>();

        for (int i = 0; i < l.size(); i++) {
            int valor = l.get(i);
            if (lidos.contains(valor)) {
                continue;
            }

            boolean ehRepetido = false;
            for (int j = i + 1; j < l.size(); j++) {
                if (valor == l.get(j)) {
                    ehRepetido = true;
                    repetidos.add(valor);
                    break;
                }
            }

            if (ehRepetido) {
                lidos.add(valor);
            }
        }

        return repetidos;
    }
}