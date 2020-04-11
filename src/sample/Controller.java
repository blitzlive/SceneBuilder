package sample;


import java.awt.*;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;

public class Controller implements Initializable{
    @FXML
    private DatePicker calenderTime;

    @FXML
    private Label timestamp;

    @FXML
    private BarChart<String,Number> chart1;

    @FXML
    private CategoryAxis x;

    @FXML
    private CategoryAxis y;

    public static LocalDate actualDate() {
        LocalDate date = LocalDate.now();
        DateTimeFormatter df = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        return date;
    }

    public static LocalTime actualTime() {
        LocalTime time = LocalTime.now();
        LocalTime newTime =  time.plusMinutes(0).withSecond(0).withNano(0);
        return newTime;
    }


    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        calenderTime.setValue(sample.Controller.actualDate());
        //TODO: Zeit formatieren und richtig eintragen
        timestamp.setText(String.valueOf(sample.Controller.actualTime()));
        // Series 1 - Data of 2014
        XYChart.Series<String, Number> dataSeries1 = new XYChart.Series<String, Number>();
        dataSeries1.setName("Semesterferien (hours)");
        //168 Stunden Zeit in der Woche
        dataSeries1.getData().add(new XYChart.Data<String, Number>("Gesamt", 100));
        dataSeries1.getData().add(new XYChart.Data<String, Number>("Siemens", 36));
        dataSeries1.getData().add(new XYChart.Data<String, Number>("Universität", 0));
        dataSeries1.getData().add(new XYChart.Data<String, Number>("Scout", 1));
        dataSeries1.getData().add(new XYChart.Data<String, Number>("Schlaf", 36));
        dataSeries1.getData().add(new XYChart.Data<String, Number>("Frezeit", 27));



        // Series 2 - Data of 2015
        XYChart.Series<String, Number> dataSeries2 = new XYChart.Series<String, Number>();
        dataSeries2.setName("Vorlesungszeit (hours)");

        dataSeries2.getData().add(new XYChart.Data<String, Number>("Gesamt", 100));
        dataSeries2.getData().add(new XYChart.Data<String, Number>("Siemens", 8));
        dataSeries2.getData().add(new XYChart.Data<String, Number>("Universität", 27));
        dataSeries2.getData().add(new XYChart.Data<String, Number>("Scout", 1));
        dataSeries2.getData().add(new XYChart.Data<String, Number>("Schlaf", 36));
        dataSeries2.getData().add(new XYChart.Data<String, Number>("Frezeit", 28));

        // Add Series to BarChart.
        chart1.getData().add(dataSeries1);
        chart1.getData().add(dataSeries2);
        chart1.setTitle("Aktuelle Zeitplanung:Stunden per Woche");

    }
    /*******************************************************************************
     *                                                                             *
     * Main Button Style (in V-Box)                                                *
     *                                                                             *
     ******************************************************************************/
    @FXML
    private void openbrowser() throws IOException {
        URL Link=null;
        try {
            Link = new URL("https://www.google.com/");
            timestamp.setText(String.valueOf(sample.Controller.actualTime()));

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        if(Desktop.isDesktopSupported()){
            try {
                Desktop.getDesktop().browse(Link.toURI());
            } catch (IOException e) {
                e.printStackTrace();
            } catch (URISyntaxException e) {
                e.printStackTrace();
            }
        }
    }

    @FXML
    private void openmails(){
       URL Link=null;
        try {
        Link = new URL("https://mail.google.com/mail/u/0/#inbox");
            timestamp.setText(String.valueOf(sample.Controller.actualTime()));
    } catch (MalformedURLException e) {
        e.printStackTrace();
    }
        if(Desktop.isDesktopSupported()){
        try {
            Desktop.getDesktop().browse(Link.toURI());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }
}
    @FXML
    private void openexcel(){
        Runtime runtime = Runtime.getRuntime();
        try
        {
          runtime.exec("C:\\Program Files\\Microsoft Office\\root\\Office16\\EXCEL.EXE");
            timestamp.setText(String.valueOf(sample.Controller.actualTime()));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    @FXML
    private void opensystemcontroll(){
        Runtime runtime = Runtime.getRuntime();
        try
        {
            runtime.exec("Control.exe");
            timestamp.setText(String.valueOf(sample.Controller.actualTime()));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    @FXML
    private void openfulldir(){
        Runtime runtime = Runtime.getRuntime();
        try
        {
            Runtime.getRuntime().exec("explorer.exe %USERPROFILE%\\Documents");
            timestamp.setText(String.valueOf(sample.Controller.actualTime()));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    /*******************************************************************************
     *                                                                             *
     * ButtonOnAction Lifestyle                                               *
     *                                                                             *
     ******************************************************************************/
    @FXML
    private void openspoty(){
        Runtime runtime = Runtime.getRuntime();
        try
        {
            runtime.exec("Spotify.exe");
            timestamp.setText(String.valueOf(sample.Controller.actualTime()));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    @FXML
    private void opengoogle(){
        URL Link=null;
        try {
            Link = new URL("https://www.google.com/");
            timestamp.setText(String.valueOf(sample.Controller.actualTime()));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        if(Desktop.isDesktopSupported()){
            try {
                Desktop.getDesktop().browse(Link.toURI());
            } catch (IOException e) {
                e.printStackTrace();
            } catch (URISyntaxException e) {
                e.printStackTrace();
            }
        }
    }
    @FXML
    private void openmydealz(){
        URL Link=null;
        try {
            Link = new URL("https://www.mydealz.de/new");
            timestamp.setText(String.valueOf(sample.Controller.actualTime()));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        if(Desktop.isDesktopSupported()){
            try {
                Desktop.getDesktop().browse(Link.toURI());
            } catch (IOException e) {
                e.printStackTrace();
            } catch (URISyntaxException e) {
                e.printStackTrace();
            }
        }
    }
    @FXML
    private void openyoutube(){
        URL Link=null;
        try {
            Link = new URL("https://www.youtube.com/?gl=DE");
            timestamp.setText(String.valueOf(sample.Controller.actualTime()));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        if(Desktop.isDesktopSupported()){
            try {
                Desktop.getDesktop().browse(Link.toURI());
            } catch (IOException e) {
                e.printStackTrace();
            } catch (URISyntaxException e) {
                e.printStackTrace();
            }
        }
    }
    @FXML
    private void openlifestyledir() throws IOException {
        Runtime runtime = Runtime.getRuntime();
        try
        {
            Runtime.getRuntime().exec("explorer.exe %USERPROFILE%\\Documents");
            timestamp.setText(String.valueOf(sample.Controller.actualTime()));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    /*******************************************************************************
     *                                                                             *
     * ButtonOnAction Lifestyle                                               *
     *                                                                             *
     ******************************************************************************/
    @FXML
    private void openfacebook(){
        URL Link=null;
        try {
            Link = new URL("https://www.facebook.com/");
            timestamp.setText(String.valueOf(sample.Controller.actualTime()));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        if(Desktop.isDesktopSupported()){
            try {
                Desktop.getDesktop().browse(Link.toURI());
            } catch (IOException e) {
                e.printStackTrace();
            } catch (URISyntaxException e) {
                e.printStackTrace();
            }
        }
    }

    @FXML
    private void openinstagram(){
        URL Link=null;
        try {
            Link = new URL("https://www.instagram.com/?hl=de");
            timestamp.setText(String.valueOf(sample.Controller.actualTime()));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        if(Desktop.isDesktopSupported()){
            try {
                Desktop.getDesktop().browse(Link.toURI());
            } catch (IOException e) {
                e.printStackTrace();
            } catch (URISyntaxException e) {
                e.printStackTrace();
            }
        }
    }

    @FXML
    private void openXing(){
        URL Link=null;
        try {
            Link = new URL("https://www.xing.com/home");
            timestamp.setText(String.valueOf(sample.Controller.actualTime()));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        if(Desktop.isDesktopSupported()) {
            try {
                Desktop.getDesktop().browse(Link.toURI());
            } catch (IOException e) {
                e.printStackTrace();
            } catch (URISyntaxException e) {
                e.printStackTrace();
            }
        }
    }
    @FXML
    private void openwhatsapp() {
        URL Link = null;
        try {
            Link = new URL("https://web.whatsapp.com/");
            timestamp.setText(String.valueOf(sample.Controller.actualTime()));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        if (Desktop.isDesktopSupported()) {
            try {
                Desktop.getDesktop().browse(Link.toURI());
            } catch (IOException e) {
                e.printStackTrace();
            } catch (URISyntaxException e) {
                e.printStackTrace();
            }
        }
    }
    /*******************************************************************************
     *                                                                             *
     * ButtonOnAction University                                                   *
     *                                                                             *
     ******************************************************************************/
    @FXML
    private void openHSweb(){
        URL Link=null;
        try {
            Link = new URL("https://www.hs-magdeburg.de/home.html");
            timestamp.setText(String.valueOf(sample.Controller.actualTime()));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        if(Desktop.isDesktopSupported()){
            try {
                Desktop.getDesktop().browse(Link.toURI());
            } catch (IOException e) {
                e.printStackTrace();
            } catch (URISyntaxException e) {
                e.printStackTrace();
            }
        }
    }

    @FXML
    private void openHSMail(){
        URL Link=null;
        try {
            Link = new URL("https://groupware.hs-magdeburg.de/egroupware/login.php");
            timestamp.setText(String.valueOf(sample.Controller.actualTime()));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        if(Desktop.isDesktopSupported()){
            try {
                Desktop.getDesktop().browse(Link.toURI());
            } catch (IOException e) {
                e.printStackTrace();
            } catch (URISyntaxException e) {
                e.printStackTrace();
            }
        }
    }
    @FXML
    private void openHSMoodle(){
        URL Link=null;
        try {
            Link = new URL("https://moodle2.hs-magdeburg.de/moodle/login/index.php");
            timestamp.setText(String.valueOf(sample.Controller.actualTime()));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        if(Desktop.isDesktopSupported()){
            try {
                Desktop.getDesktop().browse(Link.toURI());
            } catch (IOException e) {
                e.printStackTrace();
            } catch (URISyntaxException e) {
                e.printStackTrace();
            }
        }
    }
    @FXML
    private void openCitavi(){
        //TODO:Noch nachstellen
        Runtime runtime = Runtime.getRuntime();
        try
        {
        runtime.exec("C:\\Program Files (x86)\\Citavi 6\\bin\\Citavi.exe");
            timestamp.setText(String.valueOf(sample.Controller.actualTime()));
                }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    @FXML
    private void openHSdirectory(){
        Runtime runtime = Runtime.getRuntime();
        try
        {
            Runtime.getRuntime().exec("explorer.exe C:\\Users\\admin\\Documents\\Uni");
            timestamp.setText(String.valueOf(sample.Controller.actualTime()));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    /*******************************************************************************
     *                                                                             *
     * ButtonOnAction Work Siemens/HS                                                   *
     *                                                                             *
     ******************************************************************************/
    @FXML
    private void openProject(){
        Runtime runtime = Runtime.getRuntime();
        try
        {
            Runtime.getRuntime().exec("explorer.exe C:\\Users\\admin\\Documents\\Project\\");
            timestamp.setText(String.valueOf(sample.Controller.actualTime()));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    @FXML
    private void openWorktime(){
        Runtime runtime = Runtime.getRuntime();
        try
        {
            Runtime.getRuntime().exec("explorer.exe C:\\Users\\admin\\Documents\\Jobs\\Hochschulscout (15h) Monat\\");
            timestamp.setText(String.valueOf(sample.Controller.actualTime()));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    @FXML
    private void openHSMailWork(){
        URL Link=null;
        try {
            Link = new URL("https://groupware.hs-magdeburg.de/egroupware/login.php");
            timestamp.setText(String.valueOf(sample.Controller.actualTime()));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        if(Desktop.isDesktopSupported()){
            try {
                Desktop.getDesktop().browse(Link.toURI());
            } catch (IOException e) {
                e.printStackTrace();
            } catch (URISyntaxException e) {
                e.printStackTrace();
            }
        }
    }
    @FXML
    private void openSiemensdir(){
        Runtime runtime = Runtime.getRuntime();
        try
        {
            Runtime.getRuntime().exec("explorer.exe C:\\Users\\admin\\Documents\\Jobs\\Siemens\\");
            timestamp.setText(String.valueOf(sample.Controller.actualTime()));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    @FXML
    private void openDirHSges(){
        Runtime runtime = Runtime.getRuntime();
        try
        {
            Runtime.getRuntime().exec("explorer.exe C:\\Users\\admin\\Documents\\Jobs\\");
            timestamp.setText(String.valueOf(sample.Controller.actualTime()));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    /*******************************************************************************
     *                                                                             *
     * ButtonOnAction Stocks and Tax                                               *
     *                                                                             *
     ******************************************************************************/
    @FXML
    private void openStocks(){
        URL Link=null;
        try {
            Link = new URL("https://www.finanzen.net/index/dax/topflop");
            timestamp.setText(String.valueOf(sample.Controller.actualTime()));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        if(Desktop.isDesktopSupported()){
            try {
                Desktop.getDesktop().browse(Link.toURI());
            } catch (IOException e) {
                e.printStackTrace();
            } catch (URISyntaxException e) {
                e.printStackTrace();
            }
        }
    }

    @FXML
    private void openDepot(){
        URL Link=null;
        try {
            Link = new URL("https://www.1822direkt-banking.de/JOBa1822Client/#/login");
            timestamp.setText(String.valueOf(sample.Controller.actualTime()));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        if(Desktop.isDesktopSupported()){
            try {
                Desktop.getDesktop().browse(Link.toURI());
            } catch (IOException e) {
                e.printStackTrace();
            } catch (URISyntaxException e) {
                e.printStackTrace();
            }
        }
    }
    @FXML
    private void openTax(){
        URL Link=null;
        try {
            Link = new URL("https://www.elster.de/eportal/login/softpse");
            timestamp.setText(String.valueOf(sample.Controller.actualTime()));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        if(Desktop.isDesktopSupported()){
            try {
                Desktop.getDesktop().browse(Link.toURI());
            } catch (IOException e) {
                e.printStackTrace();
            } catch (URISyntaxException e) {
                e.printStackTrace();
            }
        }
    }
    @FXML
    private void openTaxdir(){
        Runtime runtime = Runtime.getRuntime();
        try
        {
            Runtime.getRuntime().exec("explorer.exe C:\\Users\\admin\\Documents\\Steuerordner\\");
            timestamp.setText(String.valueOf(sample.Controller.actualTime()));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    @FXML
    private void openDirFin(){
        Runtime runtime = Runtime.getRuntime();
        try
        {
            Runtime.getRuntime().exec("explorer.exe C:\\Users\\admin\\Documents\\Steuerordner\\");
            timestamp.setText(String.valueOf(sample.Controller.actualTime()));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    /*******************************************************************************
     *                                                                             *
     * ButtonOnAction Financal                                                     *
     *                                                                             *
     ******************************************************************************/
    @FXML
    private void opendkb(){
        URL Link=null;
        try {
            Link = new URL("https://www.dkb.de/banking");
            timestamp.setText(String.valueOf(sample.Controller.actualTime()));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        if(Desktop.isDesktopSupported()){
            try {
                Desktop.getDesktop().browse(Link.toURI());
            } catch (IOException e) {
                e.printStackTrace();
            } catch (URISyntaxException e) {
                e.printStackTrace();
            }
        }
    }

    @FXML
    private void opennaspa(){
        URL Link=null;
        try {
            Link = new URL("https://www.naspa.de/de/home.html");
            timestamp.setText(String.valueOf(sample.Controller.actualTime()));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        if(Desktop.isDesktopSupported()){
            try {
                Desktop.getDesktop().browse(Link.toURI());
            } catch (IOException e) {
                e.printStackTrace();
            } catch (URISyntaxException e) {
                e.printStackTrace();
            }
        }
    }
    @FXML
    private void open1822direct(){
        URL Link=null;
        try {
            Link = new URL("https://www.1822direkt-banking.de/JOBa1822Client/#/login");
            timestamp.setText(String.valueOf(sample.Controller.actualTime()));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        if(Desktop.isDesktopSupported()){
            try {
                Desktop.getDesktop().browse(Link.toURI());
            } catch (IOException e) {
                e.printStackTrace();
            } catch (URISyntaxException e) {
                e.printStackTrace();
            }
        }
    }
    /*******************************************************************************
     *                                                                             *
     * ButtonOnAction Financal                                                     *
     *                                                                             *
     ******************************************************************************/
    @FXML
    private void openCalender(){
        timestamp.setText(String.valueOf(sample.Controller.actualTime()));
    //TODO Kalenderapp verknüpfen
    }
}


