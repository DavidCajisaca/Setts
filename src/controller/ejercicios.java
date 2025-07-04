package controller;

import java.util.HashSet;
import java.util.Set;

public class ejercicios {
public ejercicios() {
    tieneduplicados(new int[]{1, 2, 3, 4, 5});
    tieneduplicados(new int[]{1, 2, 3, 4, 5, 4,3,2,45});
    esIsograma("Murcielago");
    esIsograma("Camaleon");
}
public boolean tieneduplicados(int[] numeros){
  Set<Integer> set = new HashSet<>();
  for (int n : numeros) {
      if (!set.add(n)) {
          return true;
      }
  }
  return false;
}
public boolean esIsograma(String palabra) {
    Set<Character> set = new HashSet<>();
    for (char c : palabra.toCharArray()) {
        if (!set.add(c)) {
            return false;
        }
    }
    return true;
}
public int contarPalabrasUnicas(String frase) {
    Set<String> palabras = new HashSet<>();
    String[] palabrasArray = frase.split(" ");
    for (String palabra : palabrasArray) {
        palabras.add(palabra);
    }
    return palabras.size();
}

public Set<String> obtenerPalabrasUnicas(String frase) {
    Set<String> palabras = new HashSet<>();
    String[] palabrasArray = frase.split(" ");
    for (String palabra : palabrasArray) {
        palabras.add(palabra);
    }
    return palabras;
}

public void compararTexto(String texto1, String texto2) {
    Set<String> palabrasTexto1 = obtenerPalabrasUnicas(texto1);
    Set<String> palabrasTexto2 = obtenerPalabrasUnicas(texto2);

    Set<String> comunes = new HashSet<>(palabrasTexto1);
    comunes.retainAll(palabrasTexto2);

    System.out.println("Palabras únicas en texto 1: " + palabrasTexto1);
    System.out.println("Palabras únicas en texto 2: " + palabrasTexto2);
    System.out.println("Palabras comunes: " + comunes);

    int size1 = palabrasTexto1.size();
    int size2 = palabrasTexto2.size();
    int mayor = (size1 > size2) ? size1 : size2;

    double porcentaje = ((double) comunes.size() / mayor) * 100;

    System.out.printf("Coincidencia léxica: %.2f%%\n", porcentaje);
}



}
