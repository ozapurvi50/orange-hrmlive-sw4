package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.By;


/**
 * .AdminPage - UserManagement, Job, Organization Tabs Locators and it's actions
 */
public class AdminPage extends Utility {

    By verify = By.xpath("//h5[@class='oxd-text oxd-text--h5 oxd-table-filter-title']");

    public String verifySystemUsers(){
        return getTextFromElement(verify);

    }

    By addButton = By.xpath("//button[normalize-space()='Add']");

    public void clickOnAddButton(){
        clickOnElement(addButton);
    }


 By userManagement=By.xpath("//span[normalize-space()='User Management']");
    By job=By.xpath("//span[normalize-space()='Job']");
    By organizationTab=By.xpath("//span[normalize-space()='Organization']");
    By saveMessage =By.xpath("//div[@class='oxd-toast oxd-toast--success oxd-toast-container--toast']");

    public String verifySaveSuccessfully(){
        return getTextFromElement(saveMessage);
    }
}