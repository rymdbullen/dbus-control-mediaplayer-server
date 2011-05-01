package net.tux.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.RootPanel;

public class App implements EntryPoint {

	public void onModuleLoad() {
		Button button = new Button("Click me");
		RootPanel.get().add(button);
	}

}
