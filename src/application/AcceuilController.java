package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public  class AcceuilController implements Initializable{

	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		 @FXML
		    private AnchorPane Achat_Btn;

		    @FXML
		    private Button Achat_PayerBtn;

		    @FXML
		    private Spinner<?> Achat_Quantite;

		    @FXML
		    private TableView<?> Achat_TableView;

		    @FXML
		    private Label Achat_Total;

		    @FXML
		    private TableColumn<?, ?> Achat_col_Prix;

		    @FXML
		    private TableColumn<?, ?> Achat_col_Quantite;

		    @FXML
		    private ComboBox<?> Achat_lunetteID;

		    @FXML
		    private ComboBox<?> Achat_lunetteNom;

		    @FXML
		    private Button Home_Btn;

		    @FXML
		    private AnchorPane Home_Form;

		    @FXML
		    private Label Home_LunettesDisponibles;

		    @FXML
		    private Label Home_RevenuTotale;

		    @FXML
		    private Label Home_TotaleClients;

		    @FXML
		    private BarChart<?, ?> Home_chart;

		    @FXML
		    private AnchorPane LunetteDisponible_AjouterBtn;

		    @FXML
		    private TextField LunetteDisponible_IDlunette;

		    @FXML
		    private AnchorPane LunetteDisponible_ImageView;

		    @FXML
		    private Button LunetteDisponible_ImportBtn;

		    @FXML
		    private Button LunetteDisponible_ModifierBtn;

		    @FXML
		    private TextField LunetteDisponible_Nomlunette;

		    @FXML
		    private TextField LunetteDisponible_PrixLunette;

		    @FXML
		    private ComboBox<?> LunetteDisponible_StatusLunette;

		    @FXML
		    private Button LunetteDisponible_SupprimerBtn;

		    @FXML
		    private TableView<?> LunetteDisponible_TableView;

		    @FXML
		    private TableColumn<?, ?> LunetteDisponible_col_IDlunette;

		    @FXML
		    private TableColumn<?, ?> LunetteDisponible_col_NomLunette;

		    @FXML
		    private TableColumn<?, ?> LunetteDisponible_col_PrixLunette;

		    @FXML
		    private TableColumn<?, ?> LunetteDisponible_col_StatusLunette;

		    @FXML
		    private AnchorPane LunetteDisponible_form;

		    @FXML
		    private TextField LunetteDisponible_rechercher;

		    @FXML Button LunettesDisponible_Btn;

		    @FXML
		    private ImageView close;

		    @FXML
		    private ImageView deconnecter_Btn;

		    @FXML
		    private ImageView minimize;
		
	}

	
}
