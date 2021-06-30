package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

import java.time.LocalDate;

import java.io.IOException;
import java.time.LocalDate;

public class PlanController {

    @FXML
private MenuButton Dagselect;
    @FXML
private MenuButton Deelselect;
    @FXML
private TextArea Plan;
    @FXML
private Button Toevoegen;
    @FXML
private Label Warning;
    @FXML
private Slider WeekSlider;
    @FXML
private MenuItem Maandag;
    @FXML
private MenuItem Dinsdag;
    @FXML
private MenuItem Woensdag;
    @FXML
private MenuItem Donderdag;
    @FXML
private MenuItem Vrijdag;
    @FXML
private MenuItem Zaterdag;
    @FXML
private MenuItem Zondag;
    @FXML
private TextArea Planin;
    @FXML
private Label Niettoevoeg;
    @FXML
private Button Back;




static Main A = new Main();

private int Welkedag = 0;

private int weekNMB = 1;

private int DagdeelNMB = 0;

private String Warningtxt = "1";

private String buttonText;



public void sliderNumb() throws IOException{
    weekNMB = (int) WeekSlider.getValue();
    Warningtxt = Integer.toString(weekNMB);
    Warning.setText(Warningtxt);


}

public void saveDate() throws IOException {
    if ((Welkedag == 0) || (DagdeelNMB == 0) || (Planin.getText().equals(""))) {
        Niettoevoeg.setStyle("-fx-text-fill: #FF0000");

    } else if (Singleton.getInstance().getSingleTest() == 0){
        // Niettoevoeg.setStyle("-fx-text-fill: #8ea7bf");
        Niettoevoeg.setStyle("-fx-text-fill: #22e309");
        Singleton.getInstance().setWeken();
        Niettoevoeg.setText("Datum toegevoegd aan week " + Singleton.getInstance().getWeek(weekNMB).getWeeknum());
        if (DagdeelNMB == 1){

            Singleton.getInstance().getWeek(weekNMB).getDagen(Welkedag).setOchtend(Planin.getText());

        }
        else if (DagdeelNMB == 2){

            Singleton.getInstance().getWeek(weekNMB).getDagen(Welkedag).setMiddag(Planin.getText());

        }
        else if (DagdeelNMB == 3){

            Singleton.getInstance().getWeek(weekNMB).getDagen(Welkedag).setAvond(Planin.getText());

        }

    } else {
        Niettoevoeg.setStyle("-fx-text-fill: #22e309");
        Niettoevoeg.setText("Datum toegevoegd aan week " + Singleton.getInstance().getWeek(weekNMB).getWeeknum());

        if (DagdeelNMB == 1){

            Singleton.getInstance().getWeek(weekNMB).getDagen(Welkedag).setOchtend(Planin.getText());

        }
        else if (DagdeelNMB == 2){

            Singleton.getInstance().getWeek(weekNMB).getDagen(Welkedag).setMiddag(Planin.getText());

        }
        else if (DagdeelNMB == 3){

            Singleton.getInstance().getWeek(weekNMB).getDagen(Welkedag).setAvond(Planin.getText());

        }


    }

}



    public void hover() throws IOException {
        Toevoegen.setStyle("-fx-background-color: #253a4d ");
        Toevoegen.setTextFill(Color.WHITE);



    }

    public void unHover() throws IOException {

        Toevoegen.setStyle("-fx-background-color: #265683 ");
        Toevoegen.setTextFill(Color.BLACK);
        Back.setStyle("-fx-background-color: #265683 ");
        Back.setTextFill(Color.BLACK);

    }

    public void hoverB() throws IOException {
        Back.setStyle("-fx-background-color: #253a4d ");
        Back.setTextFill(Color.WHITE);



    }


/// ik had geprobeert de dubbele code code smell weg te krijgen
    /// door maa reen hover methode en unhover methode te maken
    /// vervolgens parameters toe te voegen en die met andere methodes te geven
    /// helaas crashed dit java, ik heb het gevoel dat dubbele code hoort bij meerdere
    /// dezelfde java fx objecten hebben.


    public void lastPage() throws IOException{
    Controller C = new Controller();
    C.Start();

    }


    public void setOcht(ActionEvent event) throws IOException{
        Deelselect.setText("Ochtend");
        DagdeelNMB = 1;
    }
    public void setMid(ActionEvent event) throws IOException{
        Deelselect.setText("Middag");
        DagdeelNMB = 2;
    }
    public void setAvd(ActionEvent event) throws IOException{
        Deelselect.setText("Avond");
        DagdeelNMB = 3;
    }


    public void setMDag(ActionEvent event) throws IOException{
        Dagselect.setText("Maandag");
        Welkedag = 1;
    }
    public void setDDag(ActionEvent event) throws IOException{
        Dagselect.setText("Dinsdag");
        Welkedag = 2;
    }
    public void setWDag(ActionEvent event) throws IOException{
        Dagselect.setText("Woensdag");
        Welkedag = 3;
    }
    public void setDODag(ActionEvent event) throws IOException{
        Dagselect.setText("Donderdag");
        Welkedag = 4;
    }
    public void setVDag(ActionEvent event) throws IOException{
        Dagselect.setText("Vrijdag");
        Welkedag = 5;
    }
    public void setZDag(ActionEvent event) throws IOException{
        Dagselect.setText("Zaterdag");
        Welkedag = 6;
    }
    public void setZODag(ActionEvent event) throws IOException{
        Dagselect.setText("Zondag");
        Welkedag = 7;
    }

}
/// Dit is dubbele code, ik heb het op een andere manier geprobeert
/// te doen maar dan crashed het programma helaas. De manier
/// hoe object id werkt in fxml zorgt ervoor dat je niet
/// this. kan doen of meerdere javafx voorwerpen hetzelfde object kan maken
/// dit zorgt ervoor dat er vaak geen andere optie is dan dubbele code
/// misschien weet iemand met meer ervaring wel een workarround maar alles
/// wat ik doe eindigt in crashes, ik heb echt actief geprobeert code
/// smells weg te houden