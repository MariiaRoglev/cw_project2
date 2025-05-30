package com.demoqa.bookStore;

import com.demoqa.pages.BasePage;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage
{
    public LoginPage(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(id="userName")
    WebElement userField;
    @FindBy(id="password")
    WebElement passwordField;

    public LoginPage enterUserData(String userName, String password)
    {
        typeWithJS(userField,userName,0,300);
        type(passwordField,password);
        return this;
    }

    @FindBy(id="login")
    WebElement loginBtn;

    public ProfilePage clickOnLoginBtn()
    {
        click(loginBtn);
        return new ProfilePage(driver);
    }
}
