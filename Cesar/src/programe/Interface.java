package programe;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Interface {

    public Button EncoderCesar;
    public Button DecoderCesar;
    public Button DecoderCesarSansCle;
    public Button EncoderVigenere;
    public Button DecoderVigenere;
    public Button DecoderVigenereSansCle;
    public TextArea chpSaisieEncoderCesar; //chpSaisieEncoderCesar.getText();
    public TextField chpCleEncoderCesar;
    public TextArea chpRetourEncoderCesar;
    public TextArea chpSaisieDecoderCesar;
    public TextField chpCleDecoderCesar;
    public TextArea chpRetourDecoderCesar;
    public TextArea chpSaisieDecoderCesarSansCle;
    public TextArea chpRetourDecoderCesarSansCle;
    public TextArea chpSaisieEncoderVigenere;
    public TextField chpCleEncoderVigenere;
    public TextArea chpRetourEncoderVigenere;
    public TextArea chpSaisieDecoderVigenere;
    public TextField chpCleDecoderVigenere;
    public TextArea chpRetourDecoderVigenere;
    public TextArea chpSaisieDecoderVigenereSansCle;
    public TextArea chpRetourDecoderVigenereSansCle;

    public Interface() {
        System.out.println("Interface instantiated");
    }

    @FXML
    public void initialize(){
        System.out.println("Interface initialized");
    }

    Cesar c = new Cesar();
    Vigenere v = new Vigenere();


    public void EncoderCesar(){
        chpRetourEncoderCesar.setText(c.coder(chpSaisieEncoderCesar.getText().toUpperCase(), chpCleEncoderCesar.getText().toUpperCase().charAt(0)));
    }

    public void DecoderCesar(){
        chpRetourDecoderCesar.setText(c.decoder(chpSaisieDecoderCesar.getText().toUpperCase(), chpCleDecoderCesar.getText().toUpperCase().charAt(0)));
    }

    public void DecoderCesarSansCle(){
        chpRetourDecoderCesarSansCle.setText(c.decoderSansCle(chpSaisieDecoderCesarSansCle.getText().toUpperCase()));
    }

    public void EncoderVigenere(){
        chpRetourEncoderVigenere.setText(v.coder(chpSaisieEncoderVigenere.getText().toUpperCase(), chpCleEncoderVigenere.getText().toUpperCase()));
    }

    public void DecoderVigenere(){
        chpRetourDecoderVigenere.setText(v.decoder(chpSaisieDecoderVigenere.getText().toUpperCase(), chpCleDecoderVigenere.getText().toUpperCase()));
    }

    public void DecoderVigenereSansCle(){
        chpRetourDecoderVigenere.setText(v.decoderSansCle(chpSaisieDecoderVigenere.getText().toUpperCase()));
    }
}
