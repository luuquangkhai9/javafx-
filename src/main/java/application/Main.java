package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.paint.Paint;

import javafx.scene.image.Image;

import java.util.Objects;
import javafx.fxml.FXMLLoader;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws Exception {
//        Parent root = new Group();
        FXMLLoader loader = FXMLLoader.load(getClass().getResource("/sample.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
//        Image icon = new Image("file:/D:\\daihocki1\\OOP\\javafx_tranning\\icon.jpg");
//        stage.getIcons().add(icon);
        stage.setTitle("Khai dz ");
//        stage.setHeight(420);
//        stage.setWidth(420);
//        stage.setResizable(false);
//        stage.setX(550);
//        stage.setY(200);
//        stage.setFullScreen(true);
//        stage.setFullScreenExitHint("Do you love me?\n y or n");
//        stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("y"));

//        Text text = new Text();
//        text.setText("Whoaaa");
//        text.setX(300);
//        text.setY(300);
//        text.setFont(Font.font("Verdana", 50));
//        text.setFill(Color.DARKBLUE);

//        Line line = new Line();
//        line.setStartX(200);
//        line.setStartY(200);
//        line.setEndX(500);
//        line.setEndY(200);
//        line.setStrokeWidth(5);
//        line.setStroke(Color.RED);
//        line.setOpacity(0.5);
//        line.setRotate(45);

//        Rectangle rectangle = new Rectangle();
//        rectangle.setX(100);
//        rectangle.setY(100);
//        rectangle.setWidth(100);
//        rectangle.setHeight(100);
//        rectangle.setFill(Color.WHITE);
//        rectangle.setStrokeWidth(5);
//        rectangle.setStroke(Color.BLACK);
//        rectangle.setOpacity(0.5);

//        Polygon triangle = new Polygon();
//        triangle.getPoints().setAll(200.0, 200.0, 300.0,300.0,200.0,300.0);;
//        triangle.setFill(Color.YELLOW);

//        Circle circle = new Circle();
//        circle.setCenterX(350);
//        circle.setCenterY(350);
//        circle.setRadius(50);
//        circle.setFill(Color.ORANGE);

//        Image image = new Image("file:/D:\\daihocki1\\OOP\\javafx_tranning\\src\\stage.png");
//        ImageView imageView = new ImageView(image);
//        imageView.setX(400);
//        imageView.setY(400);

//        root.getChildren().add(text);
//        root.getChildren().add(line);
//        root.getChildren().add(rectangle);
//        root.getChildren().add(triangle);
//        root.getChildren().add(circle);
//        root.getChildren().add(imageView);

        stage.setScene(scene);
        stage.show();
    }

    public static  void main(String[] args) {
        launch(args);
    }
}
