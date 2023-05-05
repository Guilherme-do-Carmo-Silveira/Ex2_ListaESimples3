package view;

import controller.OrdCOntroller;
import docarmo.ListaInt.Lista;

public class main {

	public static void main(String[] args) {
		
		OrdCOntroller control = new OrdCOntroller();
		
		Lista lp = new Lista();
		Lista ls = new Lista();
		
//		Lista Primaria
		
		lp.addFirst(1);
		try {
			lp.addLast(7);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
//		Lista Secundaria
		
		ls.addFirst(3);
		try {
			ls.addLast(4);
			ls.addLast(8);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		control.OrdenaLista(lp, ls);
		

	}

}
