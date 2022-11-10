package edu.curso;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

public class TestePropriedadeFx {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		Pessoa p2 = new Pessoa();
		
//		ChangeListener<String> cl = new ChangeListener<String>() {
//			@Override
//			public void changed(
//					ObservableValue<? extends String> observable, 
//					String oldValue, 
//					String newValue) {
//				System.out.println("Nome alterado de " + oldValue +
//						" para " + newValue);
//				
//			} 
//		};
//		p1.nomeProperty().addListener(cl);
		
		p1.nomeProperty().addListener(
				(observavel, antigo, novo) -> { 
					System.out.println("Nome alterado de " + antigo +
							" para " + novo);
		});
		
		p1.setNome("João");
		p2.setNome("Maria");
		
		p1.setNome("Carlos");
		p2.setNome("Marta");

	}

}
