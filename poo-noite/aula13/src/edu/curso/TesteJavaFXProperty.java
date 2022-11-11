package edu.curso;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

public class TesteJavaFXProperty {
	
	public static void main(String[] args) {
		
		Estudante e1 = new Estudante("José Silva");
		
//		ChangeListener<String> cl = 
//				new ChangeListener<String>() {
//			@Override
//			public void changed(
//					ObservableValue<? extends String> observable, 
//					String oldValue, 
//					String newValue) {
//				System.out.println("Nome trocado de " + oldValue +
//						" para " + newValue);
//				
//			} 		
//		};
//		e1.nomeProperty().addListener(cl);
		
		e1.nomeProperty().addListener(
			(observable, antigo, novo) -> {
				System.out.println("Nome trocado de " + antigo + 
						" para " + novo);
			});
		
		e1.nomeProperty().set("João Carlos");
		e1.nomeProperty().set("Eduardo Alberto");
		
		System.out.println(" Nome: " + e1.nomeProperty().get() );
		
	}

}
