package com.vtiger.pages;

import com.aventstack.extentreports.ExtentTest;
import com.vtiger.utilities.PageActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends PageActions {

   // By uid = By.name("user_name");


    @FindBy(name = "user_name")
    WebElement tb_uid ;

    @FindBy(name = "user_password")
    WebElement tb_password ;
    @FindBy(xpath= "//select[@name='login_theme']")

    WebElement dp_theme ;
    @FindBy(name= "Login")

    WebElement btn_login ;

    @FindBy(xpath= "//*[contains(text(),'You must specify a valid username and password.')]")

    WebElement error_msg ;



    public  LoginPage(WebDriver driver, ExtentTest logger){

        super(driver,logger);                     // this will initialized current class object

        PageFactory.initElements(driver, this);

        System.out.println("Hey I am branch_01");

    }


    public void login(String userid, String pwd){

        setInput(tb_uid,userid,userid+" has been entered into username field");
        setInput(tb_password,pwd,pwd+" has been entered into password field");
        clickElement(btn_login,"Login button clicked");


    }




    public void login(String userid, String pwd, String theme){

        setInput(tb_uid,userid,userid+" has been entered into username field");
        setInput(tb_password,pwd,pwd+" has been entered into password field");
        selectVisibleText(dp_theme,theme,theme+" has been selected from theme dropdown");
        clickElement(btn_login,"Login button clicked");



    }


     public  void validate_Error_message(){


        error_msg.isDisplayed();


     }











}
