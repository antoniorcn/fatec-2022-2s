package edu.curso;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.effect.Blend;
import javafx.scene.effect.BlendMode;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.InnerShadow;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Neon extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		stage.setTitle("Efeitos de Texto: Neon Sign");
        double width = 600;
        double height = 300;
        Pane root = new Pane();
        Scene scene = new Scene(root, width, height);
         
        Rectangle rect = new Rectangle (width, height);
        rect.setStyle("-fx-fill: radial-gradient(center 50% 50%, "
        		+ "radius 70%, rgba(0, 0, 0, 0.1) 40%, "
        		+ "rgba(0, 0, 0, 0.8) 100%);");
                        
        Text text = new Text();
        text.setStyle("-fx-fill: white; -fx-font: 120px Harlow;");
      
        text.setX(20);
        text.setY(150);
        Blend blend = new Blend();
        blend.setMode(BlendMode.MULTIPLY);
              
        DropShadow ds = new DropShadow();
        ds.setColor(Color.rgb(254, 235, 66, 0.3));
        ds.setOffsetX(5);
        ds.setOffsetY(5);
        ds.setRadius(5);
        ds.setSpread(0.2);
        
        blend.setBottomInput(ds);
        
        DropShadow ds1 = new DropShadow();
        ds1.setColor(Color.web("#f13a00"));
        ds1.setRadius(20);
        ds1.setSpread(0.2);
        
        Blend blend2 = new Blend();
        blend2.setMode(BlendMode.MULTIPLY);
        
        InnerShadow is = new InnerShadow();
        is.setColor(Color.web("#feeb42"));
        is.setRadius(9);
        is.setChoke(0.8);
        blend2.setBottomInput(is);
        
        InnerShadow is1 = new InnerShadow();
        is1.setColor(Color.web("#f13a00"));
        is1.setRadius(5);
        is1.setChoke(0.4);
        blend2.setTopInput(is1);
        
        Blend blend1 = new Blend();
        blend1.setMode(BlendMode.MULTIPLY);
        blend1.setBottomInput(ds1);
        blend1.setTopInput(blend2);
        
        blend.setTopInput(blend1);
         
        text.setEffect(blend);
      
        TextField textField = new TextField();
        textField.setText("Neon Sign");
        text.textProperty().bind(textField.textProperty());
        textField.setPrefColumnCount(40);
        textField.setLayoutX(50);
        textField.setLayoutY(260);
        root.getChildren().addAll(rect,text,textField);
        stage.setScene(scene);
        stage.show();
	}
	
	
	public static void main(String[] args) {
		Application.launch(Neon.class, args);
	}

}
