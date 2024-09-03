package com.vtiger.pages;

import com.aventstack.extentreports.ExtentTest;
import com.vtiger.utilities.PageActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends PageActions {

    // By uid = By.name("user_name");

    @FindBy(linkText = "Logout")
    WebElement lnk_logout ;

    @FindBy(linkText= "Home")
    WebElement lnk_home;




    public HomePage(WebDriver driver, ExtentTest logger){

        super(driver,logger);                       // this will initialized current class object
        PageFactory.initElements(driver, this);

    }



    public void click_logout()
    {
        clickElement(lnk_logout,"Link Logout clicked");
    }

    public void validate_logout()
    {

        elementExist(lnk_logout,"Link Logout is displayed");
    }

    public void validate_home()
    {

        elementExist(lnk_home, "Link Home is displayed");
    }




}
