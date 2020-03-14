package ba.unsa.etf.rs;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {
    public Button ispisBtn;
    public TextField unosFld;
    public TextField ispisFld;
    public static int sumaCifara(int broj){
        int suma = 0;
        while(broj != 0){
            suma = suma + (broj % 10);
            broj = broj / 10;
        }
        return suma;
    }
    public void sumCifara(ActionEvent actionEvent) {
        int a = Integer.parseInt(unosFld.getText());
        for(int i = 1; i <= a; i++){
            if(i % sumaCifara(i) == 0){
                sumaCifara(a);
            }
        }
        ispisFld.setText(String.valueOf(a));
    }
}
