package stepdefinition;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cucumber.Baseclass;
import com.cucumber.Pomclass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Adefinition extends Baseclass {
	
	public static String url;
	public static String user;
	public static String pass;
	
	//public static WebDriver driver;
	public static FileInputStream file;
	public static Properties prop;
	public static WebDriverWait wait;
	public static JavascriptExecutor js;
	public static TakesScreenshot ts;
	Logger log = Logger.getLogger(Adefinition.class);


@Given("^User need to open Webpage$")
public void user_need_to_open_Webpage() throws Throwable {
//	file = new FileInputStream("C:\\Users\\Welcome\\eclipse-workspace\\cucumber\\src\\main\\java\\com\\cucumber\\cadactin.properties");
//	prop = new Properties();
//	prop.load(file);
//	BasicConfigurator.configure();
	//cb = prop.getProperty("browser");
	
	Browser("chrome");
	getProperties();
	url = prop.getProperty("url");
	seturl(url);
	
	log.info("Browser Launched Successfully and Landed on Login Page");
    
}

@When("^User gives a valid Username and Password$")
public void user_gives_a_valid_Username_and_Password() throws Throwable {
	PageFactory.initElements(driver, Pomclass.class);
	//user = prop.getProperty("uid");
	Uid(Pomclass.userid, "ssjabeer");
	//pass = prop.getProperty("pwd");
	Uid(Pomclass.pwd, "Jabeer@07");
//	Uid(userid, prop.getProperty("uid"));
//	Uid(pwd, prop.getProperty("pwd"));
	log.info("Username & Password Entered Sucessfully"); 
	//log.info("Username Entered Successfully ");
    
}

@Then("^Click on Signin to move to next page$")
public void click_on_Signin_to_move_to_next_page() throws Throwable {
	 Click(Pomclass.login);
    
}

//@Given("^select your location from the list$")
//public void select_your_location_from_the_list() throws Throwable {
//   
//    
//}
//
//@When("^select your hotel$")
//public void select_your_hotel() throws Throwable {
//   
//    
//}
//
//@When("^select your room type which you need$")
//public void select_your_room_type_which_you_need() throws Throwable {
//   
//    
//}
//
//@When("^select number of rooms you want$")
//public void select_number_of_rooms_you_want() throws Throwable {
//   
//    
//}
//
//@When("^Enter your Check in date when you need to book$")
//public void enter_your_Check_in_date_when_you_need_to_book() throws Throwable {
//   
//    
//}
//
//@When("^Enter Check out data when you leave the hotel$")
//public void enter_Check_out_data_when_you_leave_the_hotel() throws Throwable {
//   
//    
//}
//
//@When("^Select number of persons to stay$")
//public void select_number_of_persons_to_stay() throws Throwable {
//   
//    
//}
//
//@When("^Select if any child is there$")
//public void select_if_any_child_is_there() throws Throwable {
//   
//    
//}
//
//@Then("^Click on Search button$")
//public void click_on_Search_button() throws Throwable {
//   
//    
//}
//
//@Given("^check hotel details$")
//public void check_hotel_details() throws Throwable {
//   
//    
//}
//
//@When("^click on selecthotel radio button$")
//public void click_on_selecthotel_radio_button() throws Throwable {
//   
//    
//}
//
//@Then("^Move to Book hotel$")
//public void move_to_Book_hotel() throws Throwable {
//   
//    
//}
//
//@Given("^Enter your First name$")
//public void enter_your_First_name() throws Throwable {
//   
//    
//}
//
//@When("^Enter your Last name$")
//public void enter_your_Last_name() throws Throwable {
//   
//    
//}
//
//@When("^Entr your Address$")
//public void entr_your_Address() throws Throwable {
//   
//    
//}
//
//@When("^Enter a Valid CREDITCARD NUMBER$")
//public void enter_a_Valid_CREDITCARD_NUMBER() throws Throwable {
//   
//    
//}
//
//@When("^Select your Card type$")
//public void select_your_Card_type() throws Throwable {
//   
//    
//}
//
//@When("^Select your valid Expiry month$")
//public void select_your_valid_Expiry_month() throws Throwable {
//   
//    
//}
//
//@When("^Select your Valid Expiry Year$")
//public void select_your_Valid_Expiry_Year() throws Throwable {
//   
//    
//}
//
//@When("^Enter your CVV number of the selected card$")
//public void enter_your_CVV_number_of_the_selected_card() throws Throwable {
//   
//    
//}
//
//@Then("^Click on booknow button$")
//public void click_on_booknow_button() throws Throwable {
//   
//    
//}
//
//@Given("^Navigate to Booking confirm page$")
//public void navigate_to_Booking_confirm_page() throws Throwable {
//   
//    
//}
//
//@When("^Take a screenshot of confirmed booking$")
//public void take_a_screenshot_of_confirmed_booking() throws Throwable {
//   
//    
//}
//
//@Then("^Click on Logout Button$")
//public void click_on_Logout_Button() throws Throwable {
//   
//    
//}


}
