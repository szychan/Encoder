package application.controls;

import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.PasswordField;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class MainPageController {
	@FXML private TabPane tabPaneMain;
	// Inject tab content.
	@FXML private Tab encryptionTab;
	// Inject controller
	@FXML private EncryptionTabController encryptionTabController;

	// Inject tab content.
	@FXML private Tab decryptionTab;
	// Inject controller
	@FXML private DecryptionTabController decryptionTabController;
    @FXML
    private ComboBox<?> comboBox_Tryb;

    @FXML
    private ComboBox<?> comboBox_DlugoscBloku;

    @FXML
    private ComboBox<?> comboBox_DlugoscKlucza;

    @FXML
    private TextField textField_PlikWejsciowy_Szyfrowanie;

    @FXML
    private TextField textField_PlikWyjsciowy_Szyfrowanie;

    @FXML
    private Button button_WczytajPlik_Szyfrowanie;

    @FXML
    private Button button_ZapiszDo_Szyfrowanie;

    @FXML
    private Button button_Szyfruj_Szyfrowanie;

    @FXML
    private Button button_NowyOdbiorca_Szyfrowanie;

    @FXML
    private Button button_Usun_Szyfrowanie;

    @FXML
    private ListView<?> listView_Odbiorcy_Szyfrowanie;

    @FXML
    private ComboBox<?> comboBox_DlugoscPodbloku;

    @FXML
    private ComboBox<?> comboBox_LiczbaRund;

    @FXML
    private TextField textField_PlikWejsciowy_Odszyfrowanie;

    @FXML
    private TextField textField_PlikWyjsciowy_Odszyfrowanie;

    @FXML
    private Button button_WczytajPlik_Odszyfrowanie;

    @FXML
    private Button button_ZapiszDo_Odszyfrowanie;

    @FXML
    private Button button_Odszyfruj_Odszyfrowanie;

    @FXML
    private ListView<?> listView_Odbiorcy_Odszyfrowanie;

    @FXML
    private PasswordField passwordField_Haslo_Odszyfrowanie;

    @FXML
    private TabPane tabPane;

    @FXML
    private Tab tabLog;

    @FXML
    private TextArea textArea_Log;

    @FXML
    private ProgressBar progressBar_Stan;
    
    public void init() {
        tabPane.getSelectionModel().selectedItemProperty().addListener((ObservableValue<? extends Tab> observable,
                                                                        Tab oldValue, Tab newValue) -> {
            if (newValue == decryptionTab) {
                System.out.println("Bar Tab page");
                
            } else if (newValue == encryptionTab) {
                System.out.println("Foo Tab page");
               
            }
        });
    }

    @FXML
    void button_NowyOdbiorca_Szyfrowanie_Action(ActionEvent event) {

    }

    @FXML
    void button_Odszyfruj_Odszyfrowanie_Action(ActionEvent event) {

    }

    @FXML
    void button_Szyfruj_Szyfrowanie_Action(ActionEvent event) {

    }

    @FXML
    void button_Usun_Szyfrowanie_Action(ActionEvent event) {

    }

    @FXML
    void button_WczytajPlik_Odszyfrowanie_Action(ActionEvent event) {

    }

    @FXML
    void button_WczytajPlik_Szyfrowanie_Action(ActionEvent event) {

    }

    @FXML
    void button_ZapiszDo_Odszyfrowanie_Action(ActionEvent event) {

    }

    @FXML
    void button_ZapiszDo_Szyfrowanie_Action(ActionEvent event) {

    }

    @FXML
    void myszkoklik(MouseEvent event) {

    }

}
