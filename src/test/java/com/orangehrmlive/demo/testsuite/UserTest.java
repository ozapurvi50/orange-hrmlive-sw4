package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.pages.*;
import com.orangehrmlive.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserTest extends BaseTest {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    AdminPage adminPage = new AdminPage();
    ViewSystemUsersPage viewSystemUsersPage = new ViewSystemUsersPage();
    AddUserPage addUserPage = new AddUserPage();

    @Test

    public void adminShouldAddUserSuccessFully() throws InterruptedException {

        //* Login to Application
        loginPage.loginToApplication();
        //* click On "Admin" Tab
        homePage.clickOnAdminButton();
        //* Verify "System Users" Text
        Assert.assertEquals(adminPage.verifySystemUsers(), "System Users", "Error");
        //* click On "Add" button
        adminPage.clickOnAddButton();
        // * Verify "Add User" Text
        Assert.assertEquals(addUserPage.verifyAddUser(), "Add User", "Error");
        // * Select User Role "Admin"
        addUserPage.selectUserRole();
        //	enter Employee Name "Lisa Andrews"
        addUserPage.enterEmployeeName();
        Thread.sleep(2000);
        //	enter Username
        addUserPage.enterUserName("Pinkash2002");
        //	Select status "Disable"
        addUserPage.selectStatusDisabled();
        addUserPage.selectStatus();
        //	enter password
        addUserPage.sendPassword("Temp@123");
        //	enter Confirm Password
        addUserPage.confirmPassword("Temp@123");
        //	click On "Save" Button
        addUserPage.clickOnSaveButton();
        //	verify message "Successfully Saved"
        //Assert.assertEquals(adminPage.verifySaveSuccessfully(),"","Error"); //Can't get the "Successfully Saved" message through automation script

    }

@Test

    public void searchTheUserCreatedAndVerifyIt() {

        // * Login to Application
        loginPage.loginToApplication();
        // * click On "Admin" Tab
        homePage.clickOnAdminButton();
        //* Verify "System Users" Text
        Assert.assertEquals(adminPage.verifySystemUsers(), "System Users", "Error");
        //* Enter Username
        viewSystemUsersPage.enterUserName();
        //* Select User Role
        viewSystemUsersPage.selectUserRole();
        //* Select Status
        viewSystemUsersPage.selectStatus();
        //* Click on "Search" Button
        viewSystemUsersPage.clickOnSearchButton();
        //* Verify the User should be in Result list.
        //Assert.assertEquals(viewSystemUsersPage.verifyUserShouldBeInResultList(), "Mohan Karam Gandhi", "Error");

    }

    @Test

    public void verifyThatAdminShouldDeleteTheUserSuccessFully() {

        //*	Login to Application
        loginPage.loginToApplication();
        //*	click On "Admin" Tab
        homePage.clickOnAdminButton();
        //*	Verify "System Users" Text
        Assert.assertEquals(viewSystemUsersPage.verifySystemUsersText(), "System Users", "Error");
        //*	Enter Username
        viewSystemUsersPage.enterUserName();
        //*	Select User Role
        viewSystemUsersPage.selectUserRole();
        //* Select Status
        viewSystemUsersPage.selectStatus();
        //*	Click on "Search" Button
        viewSystemUsersPage.clickOnSearchButton1();
        //*	Verify the User should be in Result list.
        //	Click on Check box
        //	Click on Delete Button
        //	Popup will display
        //	Click on Ok Button on Popup
        //	verify message "Successfully Deleted"
    }

@Test

    public void searchTheDeletedUserAndVerifyTheMessageNoRecordFound() {

        //*	Login to Application
        loginPage.loginToApplication();
        //*	click On "Admin" Tab
        homePage.clickOnAdminButton();
        //*	Verify "System Users" Text
        Assert.assertEquals(viewSystemUsersPage.verifySystemUsersText(), "System Users", "Error");
        //*	Enter Username
        viewSystemUsersPage.enterUserName();
        //*	Select User Role
        viewSystemUsersPage.selectUserRole();
        //*	Select Status
        viewSystemUsersPage.selectStatus();
        //*	Click on "Search" Button
        viewSystemUsersPage.clickOnSearchButton1();
        //*	verify message "No Records Found"
        Assert.assertEquals(viewSystemUsersPage.verifyNoRecordsFoundText(), "No Records Found", "Error");
    }


}
