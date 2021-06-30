package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


import java.io.IOException;
import java.util.ArrayList;

class Singleton {
    private static Singleton instance;
    private static ArrayList<Week> welkeWeek;
    private static Integer Singletest = 0;

    private Singleton(){
      this.welkeWeek = new ArrayList<Week>();

    }

    public void addweek(Integer numb) {

        this.welkeWeek.add(new Week(numb));
        this.getWeek(numb).setDagen();

    }

    public Week getWeek(int i){
       return this.welkeWeek.get((i - 1));

    }

    public void setWeken() {
        for (int i = 1; i <= 52; i++) {
            this.addweek(i);
            System.out.println("Initialised week" + i);

        }
        Singletest = 1;
    }
        public static Singleton getInstance(){

            if (instance == null) {
                instance = new Singleton();
            }
                return instance;

            }

            public Integer getSingleTest(){
            return this.Singletest;

            }

            }




class Week {


    private Integer weekNummer;
    private ArrayList<Dagen> bevat;
    //   private Alarm heeft;

    public Week(Integer numb) {
        this.weekNummer = numb;
        this.bevat = new ArrayList<Dagen>();
    }

    public Integer getWeeknum() {
        return this.weekNummer;

    }
    public void addDag(Integer numb){

        this.bevat.add(new Dagen(numb));

    }

        public void setDagen () {
            for (int i = 1; i <= 7; i++) {
                this.addDag(i);
                System.out.println("Instantiating day " + i);

            }
        }

        public Dagen getDagen(int i){

        return this.bevat.get(i - 1);

        }


    }


class Dagen{

    private Integer dag;
    private String ochtend = "";
    private String middag = "";
    private String avond = "";

    public Dagen(Integer dag){

        this.dag = dag;

    }

    public void setOchtend(String ochtend){

        this.ochtend = ochtend;

    }

    public void setMiddag(String middag){

        this.middag = middag;

    }

    public void setAvond(String avond){

        this.avond = avond;

    }

    public String getOchtend() {

        return this.ochtend;

    }
    public String getMiddag() {

        return this.middag;


    }
    public String getAvond(){
            return this.avond;

    }

}

class Alarm{

    private Integer alarmtijd;



}


public class Main extends Application {

    private static Stage Stg;


    @Override
    public void start(Stage stageA) throws Exception{


        Parent root = FXMLLoader.load(getClass().getResource("../FXML/sample.fxml"));
        stageA.setTitle("Planner");
        stageA.setResizable(false);
        stageA.setScene(new Scene(root, 824, 400));
        stageA.show();
        Stg = stageA;
    }
    public void changeScene(String Text) throws IOException {

        Parent pane = FXMLLoader.load(getClass().getResource(Text));
        Stg.setHeight(410);
        Stg.setWidth(834);
        Stg.getScene().setRoot(pane);

    }

    public void changeSceneP(String Text) throws IOException {

        Parent pane = FXMLLoader.load(getClass().getResource(Text));
        Stg.setHeight(600);
        Stg.setWidth(965);
        Stg.getScene().setRoot(pane);

    }


    public static void main(String[] args) {
        launch(args);
    }
}
