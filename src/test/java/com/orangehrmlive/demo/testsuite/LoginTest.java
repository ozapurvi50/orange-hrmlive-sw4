package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.pages.HomePage;
import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();

    @Test
    /**verifyUserShouldLoginSuccessFully()  */

    public void verifyUserShouldLoginSuccessFully() {

        //* Enter username
        //* Enter password
        //* Click on Login Button
        loginPage.loginToApplication();
        //* Verify "Dashboard" Message
        Assert.assertEquals(loginPage.verification(), "Dashboard", "Error");

    }

    @Test
    /*** 2. VerifyThatTheLogoDisplayOnLoginPage()  */
    public void VerifyThatTheLogoDisplayOnLoginPage() {

        //* Launch the application
        loginPage.loginToApplication();
        //* Verify Logo is Displayed
        Assert.assertEquals(loginPage.verifyLogo(), "", "Error");
    }

    @Test
    /*** 3. VerifyUserShouldLogOutSuccessFully()*/
    public void VerifyUserShouldLogOutSuccessFully() {

        //* Login To The application
        loginPage.loginToApplication();
        //* Click on User Profile logo
        homePage.clickOnProfileLogo();
        //* Mouse hover on "Logout" and click
        homePage.clickOnLogOut();
        //* Verify the text "Login Panel" is displayed
        Assert.assertEquals(homePage.verifyLogo(), "Login", "Error");
    }

}
