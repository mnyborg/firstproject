package gwt.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Firstproject implements EntryPoint {

	// data
	String data;
	
	//data label
	Label lblNameData = new Label("");


	// page one panel
	private HorizontalPanel pageOnePanel = new HorizontalPanel();


	// page two panel
	private VerticalPanel pageTwoPanel = new VerticalPanel();


	// start method
	public void onModuleLoad() {

		// data 
		String navn;


		// build page one panel
		Label lblName = new Label("Indtast navn: ");
		final TextBox txtName = new TextBox();
		Button btnOk = new Button("Ok");

		pageOnePanel.add(lblName);
		pageOnePanel.add(txtName);
		pageOnePanel.add(btnOk);

		// show page one
		showPageOne();

		// build page two panel
		Label lblNameInput = new Label("Du indtastede: ");
			Button btnBack = new Button("Tilbage");

		pageTwoPanel.add(lblNameInput);
		pageTwoPanel.add(lblNameData);
		pageTwoPanel.add(btnBack);


		// add click handlers
		btnOk.addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				data = txtName.getText();
				showPageTwo(data); 	
			}
		});
		
		btnBack.addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				showPageOne(); 	
			}
		});
		
	}


	public void showPageOne() {

		RootPanel.get().clear();
		RootPanel.get().add(pageOnePanel);
		
	}


	public void showPageTwo(String data) {
		// set data 
		lblNameData.setText(data);
		
		RootPanel.get().clear();
		RootPanel.get().add(pageTwoPanel);
		

	}
}


