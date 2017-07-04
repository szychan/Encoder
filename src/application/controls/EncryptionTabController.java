package application.controls;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class EncryptionTabController {

    @FXML
    private ComboBox<?> comboBox_Mode;

    @FXML
    private ComboBox<?> comboBox_BlockSize;

    @FXML
    private ComboBox<?> comboBox_KeyLenght;

    @FXML
    private TextField textField_InputFile_Encryption;

    @FXML
    private TextField textField_OutputFile_Encryption;

    @FXML
    private Button button_LoadFile_Encryption;

    @FXML
    private Button button_SaveTo_Encryption;

    @FXML
    private Button button_Encrypt_Encryption;

    @FXML
    private Button button_NewRecipent_Encryption;

    @FXML
    private Button button_Delete_Encryption;

    @FXML
    private ListView<?> listView_Recipents_Encryption;

    @FXML
    private ComboBox<?> comboBox_SubblockSize;

    @FXML
    private ComboBox<?> comboBox_Rounds;

    @FXML
    void button_DeleteRecipent_Encryption_Action(ActionEvent event) {

    }

    @FXML
    void button_Encrypt_Encryption_Action(ActionEvent event) {

    }

    @FXML
	void button_LoadFile_Encryption_Action(ActionEvent event) {

    }

    @FXML
    void button_NewRecipent_Encryption_Action(ActionEvent event) {

    }

    @FXML
    void button_SaveTo_Encryption_Action(ActionEvent event) {

    }

}
