package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;

import java.io.IOException;

public class InController {
    @FXML
    private Button Planner;
    @FXML
    private Button Weekrooster;



    public void HoverP() throws IOException {
        Planner.setStyle("-fx-background-color: #253a4d ");
        Planner.setTextFill(Color.WHITE);



    }

    public void HoverW() throws IOException {
        Weekrooster.setStyle("-fx-background-color: #253a4d ");
        Weekrooster.setTextFill(Color.WHITE);

    }
    ///Dit lijkt misschien dubbele code maar het lijkt niet anders te kunnen in controller classe
    ///als ik van beide buttons een button maak en dan
    /// this.buttonname.setStyle doe zorgt het ervoor dat alleen
    /// de tweede button wordt opgelicht als er gehoverd wordt


    public void UnHover() throws IOException {

        Planner.setStyle("-fx-background-color: #265683 ");
        Weekrooster.setStyle("-fx-background-color: #265683 ");
        Planner.setTextFill(Color.BLACK);
        Weekrooster.setTextFill(Color.BLACK);


    }




    public void startPlanner() throws IOException {

        Main A = new Main();
        A.changeScene("../FXML/Planner.fxml");

    }


    public void startRooster() throws IOException {

        Main A = new Main();
        A.changeSceneP("../FXML/Rooster.fxml");

    }



}
