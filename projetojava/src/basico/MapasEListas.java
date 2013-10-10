package basico;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapasEListas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] nomes={"Denis","Giovane","Luciano"};
		
		for(int i=0;i<nomes.length;i++){
			System.out.println(nomes[i]);
		}
		
		List<String> listaDeNomes=new ArrayList<String>(Arrays.asList(nomes));
		
		listaDeNomes.add("Renzo");
		System.out.println("Impressao da lista");
		for(String n:listaDeNomes){
			System.out.println(n);
		}
		
		String[] sobrenomes={"Costa","Liberato","Ramalho","Nuccitelli"};
		
		Map<String, String> mapaDeNomes=new HashMap<String, String>();
		
		for(int i=0;i<listaDeNomes.size();i++){
			mapaDeNomes.put(listaDeNomes.get(i), sobrenomes[i]);
		}
		
		for(String chave:mapaDeNomes.keySet()){
			System.out.println("O nome do "+chave+" é "+ mapaDeNomes.get(chave));
		}

	}

}
