package controller;

import docarmo.ListaInt.Lista;
import docarmo.QuickSort.Ordenacao;

public class OrdCOntroller {
	

	public OrdCOntroller() {
		super();
	}

	public void OrdenaLista(Lista lp, Lista ls) {
		Lista lt = new Lista();

		int tam = ls.size();
		tam += lp.size();
		int cta = 0;
		for (int i = 0; i < tam; i++) {
			if (i == 0) {
				try {
					lt.addFirst(lp.get(i));
				} catch (Exception e) {
					e.printStackTrace();
				}
			}else if(i == 1){
				try {
					lt.addLast(lp.get(i));
				} catch (Exception e) {
					e.printStackTrace();
				}
			}else {
				try {
					lt.addLast(ls.get(cta));
				} catch (Exception e) {
					e.printStackTrace();
				}
				cta++;
			}
		}
		System.out.println("Lista terciaria");
		lt.Mostra();
		Ordenacao(lt);
	}
	
	public void Ordenacao(Lista lt) {
		Ordenacao ord = new Ordenacao();
		
		int tam = lt.size();
		int [] vt = new int [tam];
		
		for(int i = 0; i < tam; i ++) {
			try {
				vt[i] = lt.get(i);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		ord.QuickSort(vt, 0, tam - 1);
		
		System.out.println("\nLista terciaria");
		
		for(int i = 0; i < tam; i ++) {
			System.out.println(vt[i]);
		}
	}
}
