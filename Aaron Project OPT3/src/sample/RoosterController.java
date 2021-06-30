package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

import java.time.LocalDate;

import java.io.IOException;
import java.time.LocalDate;


public class RoosterController {

    @FXML
    private Label OMA;
    @FXML
    private Label MMA;
    @FXML
    private Label AMA;

    @FXML
    private Label ODI;
    @FXML
    private Label MDI;
    @FXML
    private Label ADI;

    @FXML
    private Label OWO;
    @FXML
    private Label MWO;
    @FXML
    private Label AWO;

    @FXML
    private Label ODO;
    @FXML
    private Label MDO;
    @FXML
    private Label ADO;

    @FXML
    private Label OVR;
    @FXML
    private Label MVR;
    @FXML
    private Label AVR;

    @FXML
    private Label OZA;
    @FXML
    private Label MZA;
    @FXML
    private Label AZA;

    @FXML
    private Label OZO;
    @FXML
    private Label MZO;
    @FXML
    private Label AZO;

    @FXML
    private Button Back;
    @FXML
    private Slider WeekKeuze;
    @FXML
    private Label WelkeWeek;
    @FXML
    private Button Selecteer;
    @FXML
    private Label Error;


    private int WeekNum = 1;


    public void Return() throws IOException {
        Controller M = new Controller();
        M.Start();
    }

    public void hoverB() throws IOException {

        Back.setStyle("-fx-background-color: #253a4d ");
        Back.setTextFill(Color.WHITE);

    }

    public void hoverS() throws IOException {

        Selecteer.setStyle("-fx-background-color: #253a4d ");
        Selecteer.setTextFill(Color.WHITE);

    }

    public void unHover() throws IOException {

        Back.setStyle("-fx-background-color: #8ea7bf ");
        Back.setTextFill(Color.BLACK);
        Selecteer.setStyle("-fx-background-color: #8ea7bf ");
        Selecteer.setTextFill(Color.BLACK);

    }

    public void sliderCon() throws IOException {
        WeekNum = (int) WeekKeuze.getValue();
        WelkeWeek.setText("Week: "+ Integer.toString(WeekNum));


    }
    public void show() throws IOException{
        if (Singleton.getInstance().getSingleTest() == 0){

            Error.setTextFill(Color.RED);

        } else {
            OMA.setText("Ochtend: \r" + Singleton.getInstance().getWeek(WeekNum).getDagen(1).getOchtend());
            MMA.setText("Middag: \r" + Singleton.getInstance().getWeek(WeekNum).getDagen(1).getMiddag());
            AMA.setText("Avond: \r" + Singleton.getInstance().getWeek(WeekNum).getDagen(1).getAvond());
            ODI.setText("Ochtend: \r" + Singleton.getInstance().getWeek(WeekNum).getDagen(2).getOchtend());
            MDI.setText("Middag: \r" + Singleton.getInstance().getWeek(WeekNum).getDagen(2).getMiddag());
            ADI.setText("Avond: \r" + Singleton.getInstance().getWeek(WeekNum).getDagen(2).getAvond());
            OWO.setText("Ochtend: \r" + Singleton.getInstance().getWeek(WeekNum).getDagen(3).getOchtend());
            MWO.setText("Middag: \r" + Singleton.getInstance().getWeek(WeekNum).getDagen(3).getMiddag());
            AWO.setText("Avond: \r" + Singleton.getInstance().getWeek(WeekNum).getDagen(3).getAvond());
            ODO.setText("Ochtend: \r" + Singleton.getInstance().getWeek(WeekNum).getDagen(4).getOchtend());
            MDO.setText("Middag: \r" + Singleton.getInstance().getWeek(WeekNum).getDagen(4).getMiddag());
            ADO.setText("Avond: \r" + Singleton.getInstance().getWeek(WeekNum).getDagen(4).getAvond());
            OVR.setText("Ochtend: \r" + Singleton.getInstance().getWeek(WeekNum).getDagen(5).getOchtend());
            MVR.setText("Middag: \r" + Singleton.getInstance().getWeek(WeekNum).getDagen(5).getMiddag());
            AVR.setText("Avond: \r" + Singleton.getInstance().getWeek(WeekNum).getDagen(5).getAvond());
            OZA.setText("Ochtend: \r" + Singleton.getInstance().getWeek(WeekNum).getDagen(6).getOchtend());
            MZA.setText("Middag: \r" + Singleton.getInstance().getWeek(WeekNum).getDagen(6).getMiddag());
            AZA.setText("Avond: \r" + Singleton.getInstance().getWeek(WeekNum).getDagen(6).getAvond());
            OZO.setText("Ochtend: \r" + Singleton.getInstance().getWeek(WeekNum).getDagen(7).getOchtend());
            MZO.setText("Middag: \r" + Singleton.getInstance().getWeek(WeekNum).getDagen(7).getMiddag());
            AZO.setText("Avond: \r" + Singleton.getInstance().getWeek(WeekNum).getDagen(7).getAvond());

        }
    }

}