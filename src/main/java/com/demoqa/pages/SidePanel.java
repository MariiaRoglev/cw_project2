package com.demoqa.pages;

import com.demoqa.alertsFrameWindows.AlertsPage;
import com.demoqa.bookStore.LoginPage;
import com.demoqa.forms.PracticeFormPages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SidePanel extends BasePage
{
    public SidePanel(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(xpath="//span[.='Login']")
    WebElement login;
    public LoginPage selectLogin()
    {
        clickWithJS(login,0,300);
        return new LoginPage(driver);
    }


    @FindBy(xpath="//span[.='Alerts']")
    WebElement alerts;
    public AlertsPage selectAlerts()
    {
        clickWithJS(alerts,0,300);
        return new AlertsPage(driver);
    }

    @FindBy(xpath="//span[.='Frames']")
    WebElement frames;
    public SidePanel selectFrame()
    {
        clickWithJS(frames,0,300);
        return new SidePanel(driver);
    }


    @FindBy(xpath="//span[.='Practice Form']")
    WebElement practiceForm;
    public PracticeFormPages selectPracticeForm()
    {
        clickWithJS(practiceForm,0,200);
        return new PracticeFormPages(driver);
    }
}
