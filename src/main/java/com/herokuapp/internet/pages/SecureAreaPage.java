package com.herokuapp.internet.pages;

import com.herokuapp.internet.utility.Utility;
import org.openqa.selenium.By;

public class SecureAreaPage extends Utility {

    By errorMessage = By.xpath("//div[@class = 'example']/h2[contains(text(), 'Secure Area')]");

    public String getErrorMessage(){

        return getTextFromElement(errorMessage);
    }
}
