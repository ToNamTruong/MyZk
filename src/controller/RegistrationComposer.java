package controller;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zul.Button;
import org.zkoss.zul.Checkbox;
import org.zkoss.zul.Datebox;
import org.zkoss.zul.Popup;
import org.zkoss.zul.Radiogroup;
import org.zkoss.zul.Row;
import org.zkoss.zul.Textbox;

public class RegistrationComposer extends SelectorComposer<Component>{
	@Wire("#submitButton")
	private Button submitButton;
	@Wire("#nameBox")
	private Textbox nameBox;
	@Wire("#genderRadio")
	private Radiogroup genderRadio;
	@Wire("#birthdayBox")
	private Datebox birthdayBox;
	@Wire("#acceptTermBox")
	private Checkbox acceptTermCheckbox;
	@Wire("#nameRow")
	private Row nameRow;
	@Wire("#helpPopup")
	private Popup helpPopup;

	
	@Listen("onCheck = #acceptTermBox")
	public void changeSubmitStatus(){
	// Nếu checkbox được check
		if (acceptTermCheckbox.isChecked()){
		// Enable nút Submit
		submitButton.setDisabled(false);
		// Đặt icon sclass cho nút Submit
		// Đây là thư viện icon được tích hợp sẵn
		submitButton.setIconSclass("z-icon-check");
		}else{
		submitButton.setDisabled(true);
		submitButton.setIconSclass("");
	}
	}
}
