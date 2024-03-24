import java.util.ArrayList;
import java.util.List;

public class BuscaSequencial {

  public int buscarNumero(int[] array, int chave) {
    for (int i = 0; i < array.length; i++)
      if (array[i] == chave) {
        return i;
      }
    return -1;
  }

  public List<Integer> buscarOcorrencia(int[] array, int chave) {
    List<Integer> indices = new ArrayList<>();

    for (int i = 0; i < array.length; i++) {
      if (array[i] == chave) {
        indices.add(i);
      }
    }
    return indices;
  }
  
}