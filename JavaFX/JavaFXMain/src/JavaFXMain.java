import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;

//JavaFX é uma biblioteca gráfica do Java
public class JavaFXMain extends Application {
    public static void main(String[] args) {
        launch(args); //Automaticamente entende que precisa executar o START
    }

    @Override
    public void start(Stage primaryStage) {   // AUTOMATICAMENTE EXECUTADO PELO LAUNCH(ARGS)

        Group root = new Group();
        Scene scene = new Scene(root,500,500);
        primaryStage.setScene(scene);
        Rectangle r1 =new Rectangle();
        r1.setX(10);
        r1.setY(10);
        r1.setHeight(100);
        r1.setWidth(100);
        r1.setFill(Color.DARKRED);
        root.getChildren().add(r1);



        final long startNanoTime = System.nanoTime();

        new AnimationTimer(){
            @Override
            public void handle (long currentNanoTime){
                double timer = (currentNanoTime - startNanoTime)/10000000000.0;
                double posX,posY,tamtela;
                double speed=1;
                posX=r1.getX();
                posY=r1.getY();
                tamtela=primaryStage.getWidth(); //Segue o tamanho da Janela
                //ANIMATION
                while (true) {
                    tamtela=primaryStage.getWidth();

                    if (posX == tamtela-100) {
                        r1.setX(r1.getX() + speed);


                    }
                }

                //ANIMATION
            }
        }.start();

        primaryStage.show();

    }
}

