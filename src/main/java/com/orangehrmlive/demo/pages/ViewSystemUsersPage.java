package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

/**
 * ViewSystemUsersPage - System Users Text, Username Field, User Roll dropDown, Employee Name Field,
 *   Status Drop Down, Search Button, Reset Button, Add Button and Delete Button locators and it's actions
 */
public class ViewSystemUsersPage extends Utility {

        By textSystemUsers=By.cssSelector(".oxd-text.oxd-text--h5");
        By userNameField=By.xpath("//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']");
        By userRollDropDown=By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]");
        By employeeNameField=By.xpath("//input[@placeholder='Type for hints...']");
        By statusDropDown=By.xpath("//div[contains(text(),'-- Select --')]");
        By searchButton=By.xpath("//button[@type='submit']");
        By searchButton1=By.xpath("//button[normalize-space()='Search']");
        By resetButton=By.cssSelector(".oxd-button.oxd-button--medium.oxd-button--ghost");
        By addButton=By.xpath("(//button[@type='button'])[4]");
        By textNoRecordsFound=By.xpath("//span[normalize-space()='No Records Found']");
        By textUserNina =By.xpath("//div[contains(text(),'Nina.Patel')]");
        By deleteButton;


        public String verifySystemUsersText(){
            return getTextFromElement(textSystemUsers);
        }
        public void enterUserName(){
            sendTextToElement(userNameField,"Nina.Patel");
        }
        public void selectUserRole(){
            clickOnElement(userRollDropDown);
            driver.findElement(userRollDropDown).sendKeys(Keys.DOWN,Keys.DOWN,Keys.TAB);
        }
        public void selectStatus(){
            clickOnElement(statusDropDown);
            driver.findElement(statusDropDown).sendKeys(Keys.DOWN,Keys.TAB);
        }
        public void clickOnSearchButton(){
            clickOnElement(searchButton);
        }
        public void clickOnAddButton(){
            clickOnElement(addButton);
        }
        public String verifyNoRecordsFoundText(){
            return getTextFromElement(textNoRecordsFound);
        }
        public void clickOnSearchButton1(){
            clickOnElement(searchButton1);
        }
        public String verifyUserShouldBeInResultList(){
            return getTextFromElement(textUserNina);
        }

    }


