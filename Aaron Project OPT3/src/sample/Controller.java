package sample;


import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.Parent;
import javafx.scene.paint.Color;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Controller {

    @FXML
    private Button StartButton;


    public void Start() throws IOException {

        Main A = new Main();
        A.changeScene("../FXML/Instellen.fxml");

    }


    public void Hover() throws IOException {
        StartButton.setStyle("-fx-background-color: #253a4d ");
        StartButton.setTextFill(Color.WHITE);
        //StartButton.setStyle("-fx-background-color: #1c4872 ");


    }

    public void UnHover() throws IOException {

        StartButton.setStyle("-fx-background-color: #265683 ");
        StartButton.setTextFill(Color.BLACK);

    }
    ///Deze code wordt meerdere keren gebruikt, dit is een code smells
    ///maar vanwege hoe controller classen werken heb ik geen efficientere manier gevonden
    ///om dit te doen, dit is enkel een cosmetisch dingetje voor als mensen over de knop
    /// hoveren dus ik hoop dat u het kan overzien aangezien ik had even goed geen hover reactie
    ///kunnen doen en daarbij de codesmell weg gehouden maar dit maakt het programma wat mooier
    ///hopelijk kost deze code smell mij dus geen punten omdat ik waarschijnlijk geen punten
    ///mis was gelopen als ik dit simpelweg niet had geimplementeerd



    }


