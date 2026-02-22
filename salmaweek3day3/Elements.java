package salmaweek3day3;

public class Elements extends Button{
	

  //Objects to call methods from subclass,superclass and other subclasses
	
public static void main(String[] args) {
	
	
	Elements execute=new Elements();
	execute.click();
	execute.setText(null);
	execute.submit();
	
	checkBoxButton execute1=new checkBoxButton();
	execute1.clickCheckButton();
	execute1.submit();
	
	RadioButton execute2=new RadioButton();
	execute2.selectRadioButton();
	execute2.submit();
	
	TextField execute3=new TextField();
	execute3.getText();
	execute3.click();
	execute3.setText(null);
}}


