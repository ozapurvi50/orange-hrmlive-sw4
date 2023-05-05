package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.By;

/**
 * HomePage - Search, Admin, PIM, Leave, and Dashboard locatores
 * and create appropriate methods for it.
 */
public class HomePage extends Utility {

    By profileLogo = By.xpath("//img[@class='oxd-userdropdown-img']");

    public void clickOnProfileLogo() {
        clickOnElement(profileLogo);
    }

    By logOut = By.xpath("//a[normalize-space()='Logout']");

    public void clickOnLogOut() {
        clickOnElement(logOut);
    }

    By loginText = By.xpath("//h5[@class='oxd-text oxd-text--h5 orangehrm-login-title']");

    public String verifyLogo() {
        return getTextFromElement(loginText);
    }

    By adminButton = By.xpath("//li[1]//a[1]//span[1]");

    public void clickOnAdminButton() {
        clickOnElement(adminButton);
    }
}

