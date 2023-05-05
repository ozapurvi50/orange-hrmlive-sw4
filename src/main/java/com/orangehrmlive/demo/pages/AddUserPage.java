package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

/**
 * .AddUserPage - User Role Drop Down, Employee Name, Username, Status Drop Down, Password, Confirm Password,
 * Save and Cancel Button Locators and it's actions
 */
public class AddUserPage extends Utility {

    By textAddUser = By.xpath("//h6[normalize-space()='Add User']");

    public String verifyAddUser() {
        return getTextFromElement(textAddUser);
    }

    By userRoleDropDown = By.xpath("(//div[@class='oxd-select-text-input'][normalize-space()='-- Select --'])[1]");
    public void selectUserRole(){
        clickOnElement(userRoleDropDown);
        driver.findElement(userRoleDropDown).sendKeys(Keys.DOWN,Keys.TAB);
    }


    By employeeName = By.xpath("//input[@placeholder='Type for hints...']");
    By mohanKaramGandhi = By.cssSelector(".oxd-autocomplete-option span");
    public void enterEmployeeName(){
        sendTextToElement(employeeName,"Mohan Karam Gandhi");
        clickOnElement(mohanKaramGandhi);
    }

    By userName = By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[4]/div[1]/div[2]/input[1]");

    public void enterUserName(String text) {
        sendTextToElement(userName,text);
    }

  By statusDropDown = By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]");
    public void selectStatusDisabled(){
        clickOnElement(statusDropDown);
    }
    By disabled = By.xpath("//span[normalize-space()='Disabled']");

    public void selectStatus() {
       clickOnElement(disabled);
    }

    By password = By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/input[1]");
    public void sendPassword(String text) {
        sendTextToElement(password, text);
    }
    By confirmPassword = By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/div[2]/input[1]");

    public void confirmPassword(String text) {
        sendTextToElement(confirmPassword, text);
    }

    By save =  By.xpath("//button[@type='submit']");
    public void clickOnSaveButton(){
        clickOnElement(save);
    }

}

