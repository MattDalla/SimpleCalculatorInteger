package it.matt;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import static java.lang.Integer.parseInt;
import static javafx.scene.paint.Color.LIGHTBLUE;
import static javafx.scene.paint.Color.LIGHTGREY;

public class HelloFX extends Application {



    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Calculator 1.0.0 by Teoz.Da");
        GridPane calcGrid = new GridPane();
        calcGrid.setAlignment((Pos.BOTTOM_CENTER));
        calcGrid.setVgap(5);
        calcGrid.setHgap(5);
        calcGrid.setPadding(new Insets(25, 25, 25, 25));
        calcGrid.setBackground((new Background(new BackgroundFill(LIGHTBLUE, CornerRadii.EMPTY, Insets.EMPTY))));


        String textAnswer = "Hello!";
        Text symb = new Text("");

        Label result = new Label("");
        Label answer = new Label(textAnswer);
        answer.setPrefHeight((35));
        answer.setPrefWidth((144+15));
        answer.setBorder((new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, null, new BorderWidths(1)))));
        answer.setBackground(new Background(new BackgroundFill(LIGHTGREY, CornerRadii.EMPTY, Insets.EMPTY)));
        answer.setAlignment(Pos.CENTER_RIGHT);

        Button b1 = new Button("1");
        Button b2 = new Button("2");
        Button b3 = new Button("3");
        Button b4 = new Button("4");
        Button b5 = new Button("5");
        Button b6 = new Button("6");
        Button b7 = new Button("7");
        Button b8 = new Button("8");
        Button b9 = new Button("9");
        Button b0 = new Button("0");
        Button bAC = new Button("AC");
        Button bEq = new Button("=");
        Button bPl = new Button("+");
        Button bMi = new Button("-");
        Button bMu = new Button("*");
        Button bDi = new Button("/");

        setButtonSize(b1);
        setButtonSize(b2);
        setButtonSize(b3);
        setButtonSize(b4);
        setButtonSize(b5);
        setButtonSize(b6);
        setButtonSize(b7);
        setButtonSize(b8);
        setButtonSize(b9);
        setButtonSize(b0);
        setButtonSize(bPl);
        setButtonSize(bMi);
        setButtonSize(bDi);
        setButtonSize(bEq);
        setButtonSize(bMu);
        setButtonSize(bAC);


        calcGrid.add(answer, 0, 0, 4, 1);
        calcGrid.add(b7, 0, 1);
        calcGrid.add(b8, 1, 1);
        calcGrid.add(b9, 2, 1);
        calcGrid.add(bDi, 3, 1);

        calcGrid.add(b4, 0, 2);
        calcGrid.add(b5, 1, 2);
        calcGrid.add(b6, 2,2);
        calcGrid.add(bMu, 3, 2);

        calcGrid.add(b1, 0, 3);
        calcGrid.add(b2, 1, 3);
        calcGrid.add(b3, 2, 3);
        calcGrid.add(bMi, 3,3);

        calcGrid.add(bAC, 0, 4);
        calcGrid.add(b0, 1, 4);
        calcGrid.add(bEq, 2, 4);
        calcGrid.add(bPl, 3, 4);


        b0.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if ((answer.getText().equals("Hello!")) || !(symb.getText().equals(""))){
                    answer.setText("0");
                }else
                    answer.setText(answer.getText()+"0");
            }
        });

        b1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if ((answer.getText().equals("Hello!")) || !(symb.getText().equals(""))) {
                    answer.setText("1");

                }else
                    answer.setText(answer.getText()+"1");
            }
        });

        b2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if ((answer.getText().equals("Hello!")) || !(symb.getText().equals(""))) {
                    answer.setText("2");
                }else
                    answer.setText(answer.getText()+"2");
            }
        });
        b3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if ((answer.getText().equals("Hello!")) || !(symb.getText().equals(""))) {
                    answer.setText("3");
                }else
                    answer.setText(answer.getText()+"3");
            }
        });
        b4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if ((answer.getText().equals("Hello!")) || !(symb.getText().equals(""))){
                    answer.setText("4");
                }else
                    answer.setText(answer.getText()+"4");
            }
        });

        b5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if ((answer.getText().equals("Hello!")) || !(symb.getText().equals(""))) {
                    answer.setText("5");
                }else
                    answer.setText(answer.getText()+"5");
            }
        });

        b6.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if ((answer.getText().equals("Hello!")) || !(symb.getText().equals(""))){
                    answer.setText("6");
                }
                else
                    answer.setText(answer.getText()+"6");
            }
        });

        b7.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if ((answer.getText().equals("Hello!")) || !(symb.getText().equals(""))) {
                    answer.setText("7");
                }else
                    answer.setText(answer.getText()+"7");
            }
        });

        b8.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if((answer.getText().equals("Hello!")) || !(symb.getText().equals(""))) {
                    answer.setText("8");

                }else
                    answer.setText(answer.getText()+"8");
            }
        });

        b9.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if ((answer.getText().equals("Hello!")) || !(symb.getText().equals(""))){
                    answer.setText("9");
                }else
                    answer.setText(answer.getText()+"9");
            }
        });

        bPl.setOnAction((new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if (answer.getText().equals("Hello!")){
                    result.setText("");

                }else if(result.getText().equals("")) {
                    Integer res = Integer.parseInt(answer.getText());
                    result.setText(res.toString());
                    symb.setText("+");

                }
                else if(!(result.getText().equals(""))){
                    Integer a = parseInt(result.getText());
                    Integer b = parseInt(answer.getText());
                    Integer c = a+b;
                    result.setText(c.toString());
                    answer.setText(c.toString());
                    symb.setText("+");

                }
            }
        }));

        bMi.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if (answer.getText().equals("Hello!")){
                    result.setText("");

                }else if(result.getText().equals("")) {
                    Integer res = Integer.parseInt(answer.getText());
                    result.setText(res.toString());
                    symb.setText("-");

                }
                else if(!(result.getText().equals(""))){
                    Integer a = parseInt(result.getText());
                    Integer b = parseInt(answer.getText());
                    Integer c = a-b;
                    result.setText(c.toString());
                    answer.setText(c.toString());
                    symb.setText("-");

                }
            }
        });

        bMu.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if (answer.getText().equals("Hello!")){
                    result.setText("");

                }else if(result.getText().equals("")) {
                    Integer res = Integer.parseInt(answer.getText());
                    result.setText(res.toString());
                    symb.setText("*");

                }
                else if(!(result.getText().equals(""))){
                    Integer a = parseInt(result.getText());
                    Integer b = parseInt(answer.getText());
                    Integer c = a*b;
                    result.setText(c.toString());
                    answer.setText(c.toString());
                    symb.setText("*");

                }
            }
        });

        bDi.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if (answer.getText().equals("Hello!")){
                    result.setText("");

                }else if(result.getText().equals("")) {
                    Integer res = Integer.parseInt(answer.getText());
                    result.setText(res.toString());
                    symb.setText("/");

                }
                else if(!(result.getText().equals(""))){
                    Integer a = parseInt(result.getText());
                    Integer b = parseInt(answer.getText());
                    if (b!= 0) {
                        Integer c = a * b;
                        result.setText(c.toString());
                        answer.setText(c.toString());
                        symb.setText("/");
                    }
                    else {
                        answer.setText("Err");
                        result.setText("");
                        symb.setText("");
                    }
                }
            }
        });

        bEq.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if (result.getText().equals("")) {
                    answer.setText(answer.getText());
                } else if (!(result.getText().equals(""))) {
                    if (symb.getText().equals("+")) {
                        Integer a = parseInt(result.getText());
                        Integer b = parseInt(answer.getText());
                        Integer c = a + b;
                        answer.setText(c.toString());
                        result.setText("");
                    } else if (symb.getText().equals("-")) {
                        Integer a = parseInt(result.getText());
                        Integer b = parseInt(answer.getText());
                        Integer c = a - b;
                        answer.setText(c.toString());
                        result.setText("");
                    } else if (symb.getText().equals("*")) {
                        Integer a = parseInt(result.getText());
                        Integer b = parseInt(answer.getText());
                        Integer c = a * b;
                        answer.setText(c.toString());
                        result.setText("");
                    } else if (symb.getText().equals("/")) {
                        Integer a = parseInt(result.getText());
                        Integer b = parseInt(answer.getText());
                        if (b != 0) {
                            Integer c = a/b;
                            System.out.println("BELLAAA");
                            System.out.println(c);
                            answer.setText(c.toString());
                            result.setText("");
                        } else{
                            answer.setText("Err");
                            result.setText("");
                            symb.setText("");
                        }
                    }
                }
            }
        });

        bAC.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent actionEvent) {
            answer.setText("Hello!");
            result.setText("");
            symb.setText("");
        }
    });

    Scene scene = new Scene(calcGrid, 300, 275);
        primaryStage.setScene(scene);
        primaryStage.show();


//        GridPane grid = new GridPane();
//        grid.setAlignment(Pos.CENTER);
//        grid.setHgap(10);
//        grid.setVgap(10);
//        grid.setPadding(new Insets(25, 25, 25, 25));
//
//
//
//        Text scenetitle = new Text("Welcome");
//        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
//        grid.add(scenetitle, 0, 0, 2, 1);
//
//        Label userName = new Label("User Name:");
//        grid.add(userName, 0, 1);
//
//        TextField userTextField = new TextField();
//        grid.add(userTextField, 1, 1);
//
//        Label pw = new Label("Password:");
//        grid.add(pw, 0, 2);
//
//        PasswordField pwBox = new PasswordField();
//        grid.add(pwBox, 1, 2);
//
//        Button btn = new Button("Sign in");
//        HBox hbBtn = new HBox(10);
//        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
//        hbBtn.getChildren().add(btn);
//        grid.add(hbBtn, 1, 4);
//
//        final Text actiontarget = new Text();
//        grid.add(actiontarget, 1, 6);
//
//        btn.setOnAction(new EventHandler<ActionEvent>() {
//
//            @Override
//            public void handle(ActionEvent e) {
//                actiontarget.setFill(Color.FIREBRICK);
//                actiontarget.setText("Sign in button pressed");
//            }
//        });

//        Scene scene = new Scene(grid1, 300, 275);
//        primaryStage.setScene(scene);
//        primaryStage.show();
}

    public void setButtonSize(Button button){
        button.setPrefHeight(35.0);
        button.setPrefWidth(36.0);
    }


    public static void main(String[] args) {
        launch();
    }

}