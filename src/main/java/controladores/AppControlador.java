package controladores;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import lombok.Data;
import modelos.Usuario;



@Data

public class AppControlador {

    @FXML
    private CheckBox cbadmin;

    @FXML
    private ChoiceBox<String> cbplataforma;

    @FXML
    private TableColumn<Usuario,String> colcorreo;

    @FXML
    private TableColumn<Usuario,String>  colplataforma;

    @FXML
    private TableColumn<Usuario,Integer>  colversion;

    @FXML
    private TableColumn<Usuario,String>  coladmin;

    @FXML
    private TableColumn<Usuario,String>  colhora;


    @FXML
    private Spinner<Integer> spversion;

    @FXML
    private TableView<Usuario> tabla;

    @FXML
    private TextField txfcorreo;

    @FXML
    void borrar(ActionEvent event) {
        tabla.getItems().remove(tabla.getSelectionModel().getSelectedItem());

    }

    @FXML
    void guardar(ActionEvent event) {
        Usuario p1 = new Usuario(txfcorreo.getText(), cbplataforma.toString(),spversion.getValue(), cbadmin.toString());
        tabla.getItems().add(p1);
        limpiar(event);



    }

    @FXML
    void limpiar(ActionEvent event) {
        txfcorreo.setText("");

    }
    @FXML
    public void initialize() {
        ObservableList<String> plataformas = FXCollections.observableArrayList("PlayStation", "PC", "Xbox");
        cbplataforma.setItems(plataformas);
        cbplataforma.setValue("PC");

        SpinnerValueFactory<Integer> valueFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 5, 1);
        spversion.setValueFactory(valueFactory);



       colcorreo.setCellValueFactory(new PropertyValueFactory<>("correo"));
        colplataforma.setCellValueFactory(new PropertyValueFactory<>("plataforma"));
        colversion.setCellValueFactory(new PropertyValueFactory<>("version"));
       coladmin.setCellValueFactory(new PropertyValueFactory<>("admin"));
       colhora.setCellValueFactory(new PropertyValueFactory<>("hora"));




    }


}
