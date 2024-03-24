public class BuscaBinaria {

  public static int buscaBinariaAlternativa(int[] array, int chave) {
    int esquerda = 0;
    int direita = array.length -1;

    while (esquerda <= direita) {
      int meio = esquerda + (direita - esquerda) / 2;
    
      if (array[meio] == chave)
        return meio;

      if (array[meio] < chave)
        esquerda = meio + 1;

      else
        direita = meio - 1;
    }

    return -1;
  }
}
