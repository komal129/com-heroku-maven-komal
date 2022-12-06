package com.herokuapp.internet.pages;

import com.herokuapp.internet.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    By userNameField = By.name("username");
    By passwordField = By.name("password");
    By loginButton = By.xpath("//button[@type = 'submit']");

    By usernameErrorMessage = By.xpath("//div/div[@id='flash']");
    By passwordErrorMessage = By.xpath("//div/div[@id='flash']");

    public void enterUsername(String email){

        sendTextToElement(userNameField, email);
    }

    public void enterPassword(String password){

        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton(){

        clickOnElement(loginButton);
    }

    public String getUsernameErrorMessage(){

        return getTextFromElement(usernameErrorMessage);
    }

    public String getPasswordErrorMessage(){

        return getTextFromElement(passwordErrorMessage);
    }
}
