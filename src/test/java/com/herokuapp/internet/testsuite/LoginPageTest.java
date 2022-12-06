package com.herokuapp.internet.testsuite;

import com.herokuapp.internet.pages.LoginPage;
import com.herokuapp.internet.pages.SecureAreaPage;
import com.herokuapp.internet.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {

    LoginPage loginPage = new LoginPage();
    SecureAreaPage securearea = new SecureAreaPage();

    @Test
    public void UserShouldLoginSuccessfullyWithValidCredentials(){

        loginPage.enterUsername("tomsmith");
        loginPage.enterPassword("SuperSecretPassword!");
        loginPage.clickOnLoginButton();
        String expectedText = "Secure Area";
        Assert.assertEquals(securearea.getErrorMessage(), expectedText, "Secure Area text is not displayed");

    }

    @Test
    public void verifyTheUsernameErrorMessage(){
        loginPage.enterUsername("tomsmith1");
        loginPage.enterPassword("SuperSecretPassword!");
        loginPage.clickOnLoginButton();
        String expectedUsernameText ="Your username is invalid!\n"+"×";
        Assert.assertEquals(loginPage.getUsernameErrorMessage(), expectedUsernameText, "Username error message is not displayed" );

    }

    @Test
    public void verifyThePasswordErrorMessage(){
        loginPage.enterUsername("tomsmith");
        loginPage.enterPassword("SuperSecretPassword");
        loginPage.clickOnLoginButton();
        String expectedPasswordMessage ="Your password is invalid!\n"+"×";
        Assert.assertEquals(loginPage.getPasswordErrorMessage(), expectedPasswordMessage, "Password error message is not displayed");
    }

}
