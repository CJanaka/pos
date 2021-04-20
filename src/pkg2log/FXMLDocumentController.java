/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2log;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;

/**
 *
 * @author JANAKA
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private AnchorPane layer2;
    @FXML
    private AnchorPane layer1;
    @FXML
    private JFXButton accbtn;
    @FXML
    private ImageView user1;
    @FXML
    private Label userl2;//user 1 label2
    @FXML
    private Label userl1;//user 1 labell
    @FXML
    private Label u1n;
    @FXML
    private Label u1p;
    @FXML
    private JFXButton logbtn;
    @FXML
    private Label email;
    @FXML
    private JFXTextField efield;
    @FXML
    private JFXButton signbtn;
    @FXML
    private Label select;
    @FXML
    private Label u1head;
    @FXML
    private Label u2head;
    @FXML
    private JFXButton signslider;
    @FXML
    private JFXPasswordField pfield;
    @FXML
    private JFXTextField nfield;
    @FXML
    private ImageView user2;
    @FXML
    private JFXButton canselbtn;
    @FXML
    private Label fpword;
    @FXML
    private JFXButton okbtn;
    @FXML
    private Label acchead;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        signbtn.setVisible(false);
        u1n.setVisible(false);
        u1p.setVisible(false);
        nfield.setVisible(false);
        logbtn.setVisible(false);
        pfield.setVisible(false);
        email.setVisible(false);
        efield.setVisible(false);
        u1head.setVisible(false);
        u2head.setVisible(false);
        signslider.setVisible(false);
        canselbtn.setVisible(false);
        fpword.setVisible(false);
        okbtn.setVisible(false);
        acchead.setVisible(false);
        signbtn.setVisible(false);

    }

    public void main() {

        select.setVisible(true);
        userl1.setVisible(true);
        userl2.setVisible(true);
        user1.setVisible(true);
        user2.setVisible(true);
        signbtn.setVisible(true);
        signbtn.setVisible(false);
        u1n.setVisible(false);
        u1p.setVisible(false);
        nfield.setVisible(false);
        logbtn.setVisible(false);
        pfield.setVisible(false);
        email.setVisible(false);
        efield.setVisible(false);
        u1head.setVisible(false);
        u2head.setVisible(false);
        signslider.setVisible(false);
        canselbtn.setVisible(false);
        fpword.setVisible(false);
        okbtn.setVisible(false);
        acchead.setVisible(false);
        signbtn.setVisible(false);

    }

    @FXML
    public void slide() {
        TranslateTransition slide1 = new TranslateTransition();
        slide1.setDuration(Duration.seconds(0.1));
        slide1.setNode(layer2);

        slide1.setToX(444);
        slide1.play();

        layer1.setTranslateX(-309);
        signslider.setVisible(true);
        accbtn.setVisible(false);
        createacc();
    }

    @FXML
    public void slideright() {

        TranslateTransition slide1 = new TranslateTransition();
        slide1.setDuration(Duration.seconds(0.1));
        slide1.setNode(layer2);

        slide1.setToX(0);
        slide1.play();

        layer1.setTranslateX(0);

        signslider.setVisible(false);//sign in btn
        accbtn.setVisible(true);
        main();

    }

    @FXML
    public void usr1() {

        signbtn.setVisible(false);
        u1n.setVisible(true);
        u1p.setVisible(true);
        nfield.setVisible(true);
        logbtn.setVisible(true);
        pfield.setVisible(true);
        email.setVisible(false);
        efield.setVisible(false);
        u1head.setVisible(true);
        u2head.setVisible(false);
        user1.setVisible(false);
        user2.setVisible(false);
        userl2.setVisible(false);
        userl1.setVisible(false);
        select.setVisible(false);
        canselbtn.setVisible(true);
        fpword.setVisible(true);
        okbtn.setVisible(false);
        acchead.setVisible(false);
        signbtn.setVisible(false);

    }

    @FXML
    public void user2() {

        signbtn.setVisible(false);
        u1n.setVisible(true);
        u1p.setVisible(true);
        nfield.setVisible(true);
        logbtn.setVisible(true);
        pfield.setVisible(true);
        email.setVisible(false);
        efield.setVisible(false);
        u1head.setVisible(false);
        u2head.setVisible(true);
        user1.setVisible(false);
        user2.setVisible(false);
        userl2.setVisible(false);
        userl1.setVisible(false);
        select.setVisible(false);
        canselbtn.setVisible(true);
        fpword.setVisible(true);
        okbtn.setVisible(false);
        acchead.setVisible(false);
        signbtn.setVisible(false);
    }

    @FXML
    public void cancel() {

        user1.setVisible(true);
        user2.setVisible(true);
        userl2.setVisible(true);
        userl1.setVisible(true);
        select.setVisible(true);
        canselbtn.setVisible(false);
        u1n.setVisible(false);
        u1p.setVisible(false);
        u1head.setVisible(false);
        u2head.setVisible(false);
        pfield.setVisible(false);
        nfield.setVisible(false);
        logbtn.setVisible(false);
        fpword.setVisible(false);
        email.setVisible(false);
        efield.setVisible(false);
        okbtn.setVisible(false);
        acchead.setVisible(false);
        signbtn.setVisible(false);

    }

    @FXML
    public void forgot() {

        email.setVisible(true);
        efield.setVisible(true);
        okbtn.setVisible(true);
        acchead.setVisible(false);
        signbtn.setVisible(false);
    }

    public void createacc() {

        acchead.setVisible(true);
        u1n.setVisible(true);
        u1p.setVisible(true);
        nfield.setVisible(true);
        pfield.setVisible(true);
        efield.setVisible(true);
        email.setVisible(true);
        efield.setVisible(true);

        user1.setVisible(false);
        user2.setVisible(false);
        userl2.setVisible(false);
        userl1.setVisible(false);
        select.setVisible(false);
        canselbtn.setVisible(false);
        u1head.setVisible(false);
        u2head.setVisible(false);

        logbtn.setVisible(false);
        fpword.setVisible(false);
        okbtn.setVisible(false);
        signbtn.setVisible(true);

    }

}
