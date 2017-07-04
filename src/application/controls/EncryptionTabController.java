package application.controls;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class EncryptionTabController {

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
	void button_NowyOdbiorca_Szyfrowanie_Action(ActionEvent event) {

	}

	@FXML
	void button_Szyfruj_Szyfrowanie_Action(ActionEvent event) {

	}

	@FXML
	void button_Usun_Szyfrowanie_Action(ActionEvent event) {

	}

	@FXML
	void button_WczytajPlik_Szyfrowanie_Action(ActionEvent event) {

	}

	@FXML
	void button_ZapiszDo_Szyfrowanie_Action(ActionEvent event) {

	}

}
