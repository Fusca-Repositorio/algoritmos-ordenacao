public class Selection implements SortingAlgorithm {

	@Override
	public void sort(int[] v) {
		
		for (int i = 0; i < v.length; i++) {
			// encontra o índice do menor elemento
			int index_menor = i;
			for (int j = i + 1; j < v.length; j++)
				if (v[j] < v[index_menor])
						index_menor = j;
			
			// coloca o menor na primeira posição
			int aux = v[i];
			v[i] = v[index_menor];
			v[index_menor] = aux;
		}
		
	}

}