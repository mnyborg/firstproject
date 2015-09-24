package gwt.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Event;
import com.google.gwt.user.client.Window;
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

	public void onModuleLoad() {

		String navn;

		final VerticalPanel vPanel = new VerticalPanel();
		HorizontalPanel hPanel = new HorizontalPanel();

		Label lblName = new Label("Indtast navn: ");
		TextBox txtName = new TextBox();

		Button btnOk = new Button("Ok");

		hPanel.add(lblName);
		hPanel.add(txtName);
		hPanel.add(btnOk);


		RootPanel.get().add(hPanel);


		Label lblNameInput = new Label("Du indtastede: ");

		Button btnBack = new Button("Tilbage");
		
		vPanel.add(lblNameInput);
		vPanel.add(btnBack);


		btnOk.addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {
				Window.alert("OK clicked");
				RootPanel.get().clear();
				
				RootPanel.get().add(vPanel);
				
				
			}
		});
	}

	
	public void showPage1() {
		
	}

	
	public void showPage2() {
		
	}
}


