package ui.skill;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.beans.property.ListProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

/**
 * 
 */
public class SkillControlleur implements Initializable {

	/**
	 * Default constructor
	 */
	public SkillControlleur() {
	}

	/**
	 * @return
	 */
	public void addSkill() {
		// TODO implement here
	}

	/**
	 * @return
	 */
	public void deleteSkill() {
		// TODO implement here
	}

	/**
	 * @return
	 */
	public void updateSkill() {
		// TODO implement here
	}

	@FXML
	private Button button;

	@FXML
	private Label label;

	@FXML
	private ListView myListView;

	protected List<String> asianCurrencyList = new ArrayList<>();
	protected List<String> europeanCurrencyList = new ArrayList<>();

	protected ListProperty<String> listProperty = new SimpleListProperty<>();

	@FXML
	private void handleButtonAction(ActionEvent event) {
		listProperty.set(FXCollections.observableArrayList(europeanCurrencyList));
	}

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		asianCurrencyList.add("BDRO - IG4");
		asianCurrencyList.add("CSI - IG4");
		asianCurrencyList.add("Algo - IG4");
		asianCurrencyList.add("DM - IG4");
		asianCurrencyList.add("Stats - IG4");

		europeanCurrencyList.add("EUR");
		europeanCurrencyList.add("GBP");
		europeanCurrencyList.add("NOK");
		europeanCurrencyList.add("SEK");
		europeanCurrencyList.add("CHF");
		europeanCurrencyList.add("HUF");

		myListView.itemsProperty().bind(listProperty);

		// This does not work, you can not directly add to a ListProperty
		// listProperty.addAll( asianCurrencyList );
		listProperty.set(FXCollections.observableArrayList(asianCurrencyList));
	}

}