package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.By;


/**LoginPage - Store usename, password, Login Button, HR for All logo, and LOGIN Panel text Locators
 and create appropriate methods for it.
 */
public class LoginPage extends Utility {

    By usernameObj = By.xpath("//input[@placeholder='username']");
    By passwordObj = By.xpath("//input[@placeholder='password']");
    By loginButton =  By.xpath("//button[@type='submit']");
    By dashBoard = By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']");

    public void loginToApplication(){
        sendTextToElement(usernameObj,"Admin");
        sendTextToElement(passwordObj,"admin123");
        clickOnElement(loginButton);
    }
    public String verification(){
        return getTextFromElement(dashBoard);
    }

    By logo = By.xpath("//div[@class='orangehrm-login-logo']//img[@alt='orangehrm-logo']");

    public String verifyLogo(){
        return getAttributeValue(logo,"alt");
    }



}
