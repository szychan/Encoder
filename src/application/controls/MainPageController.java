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
	@FXML
	private TabPane tabPaneMain;
	// Inject tab content.
	@FXML
	private Tab encryptionTab;
	// Inject controller
	@FXML
	private EncryptionTabController encryptionTabController;

	// Inject tab content.
	@FXML
	private Tab decryptionTab;
	// Inject controller
	@FXML
	private DecryptionTabController decryptionTabController;

	// Inject tab content.
	@FXML
	private Tab generationTab;
	// Inject controller
	@FXML
	private GenerationTabController generationTabController;

	@FXML
	private TabPane tabPane;

	@FXML
	private Tab logTab;

	@FXML
	private TextArea textArea_Log;

	@FXML
	private ProgressBar progressBar_Status;

	public void init() {
		tabPane.getSelectionModel().selectedItemProperty()
				.addListener((ObservableValue<? extends Tab> observable, Tab oldValue, Tab newValue) -> {
					if (newValue == encryptionTab) {
						System.out.println("encryptionTabPage");

					} else if (newValue == decryptionTab) {
						System.out.println("decryption tab page");

					} else if (newValue == generationTab) {
						System.out.println("generation tab page");
					}
				});

	}

}
