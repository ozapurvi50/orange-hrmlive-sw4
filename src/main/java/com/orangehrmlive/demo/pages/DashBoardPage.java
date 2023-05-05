package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.By;

/**DashboardPage - Dashboard text Locator
 and create appropriate methods for it.
 */
public class DashBoardPage extends Utility {


        By textDashboard=By.xpath("//h6[normalize-space()='Dashboard']");
        By userProfileLogo=By.xpath("//p[@class='oxd-userdropdown-name']");
        By linkLogOut=By.xpath("//a[normalize-space()='Logout']");

        public void clickOnUserProfileLogo(){
            clickOnElement(userProfileLogo);
        }
        public String verifyDashboardMessage(){
            return getTextFromElement(textDashboard);
        }
        public void mouseHoverOnLogOutAndClick(){
            clickOnElement(linkLogOut);
        }
    }

