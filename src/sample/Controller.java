package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {

    public TextField txtLetras;
    public Button btnBusqueda;

    public void Busqueda(ActionEvent actionEvent){

        Persona.Encontrar(txtLetras.getText());

    }

}
