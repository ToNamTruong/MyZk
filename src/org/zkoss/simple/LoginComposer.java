package org.zkoss.simple;


import org.zkoss.lang.Strings;
import org.zkoss.zk.ui.Sessions;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zul.Button;
import org.zkoss.zul.Div;
import org.zkoss.zul.Label;
import org.zkoss.zul.Textbox;
import org.zkoss.zul.Window;

@SuppressWarnings("serial")
public class LoginComposer extends SelectorComposer<Window> {

	@Wire("#window")
	private Window window;
	@Wire("#login")
	private Button loginButton;
	@Wire("#logout")
	private Button logoutButton;
	@Wire("#usertb")
	private Textbox usertb;
	@Wire("#pwdtb")
	private Textbox pwdtb;
	@Wire("#msg")
	private Label msg;
	@Wire("#userName")
	private Label userName;
	@Wire("#userDiv")
	private Div userDiv;
	@Wire("#loginDiv")
	private Div loginDiv;
	
	@Listen("onClick = #login")
	public void doLogin(){
		String user = usertb.getValue();
		String pwd = pwdtb.getValue();
		if(Strings.isBlank(user) || Strings.isEmpty(pwd)){
			msg.setValue("*Need user name and password!");
			return;
		}
		if(!"1234".equals(pwd)){
			msg.setValue("*Wrong password!");
			return;
		}
		Sessions.getCurrent().setAttribute("user",user);
		loginDiv.setVisible(false);
		userDiv.setVisible(true);
		userName.setValue(user);
		msg.setValue("");
	}
	
	@Listen("onClick = #logout")
	public void doLogout(){
		Sessions.getCurrent().removeAttribute("user");
		
		loginDiv.setVisible(true);
		userDiv.setVisible(false);
		userName.setValue("");
	}
	
	@Listen("onOK = #window")
	public void doOK(){
		if(loginDiv.isVisible()){
			doLogin();
		}else{
			doLogout();
		}
	}
	
}
