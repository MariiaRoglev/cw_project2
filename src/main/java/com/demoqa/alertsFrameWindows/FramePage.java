package com.demoqa.alertsFrameWindows;

import com.demoqa.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Base64;
import java.util.List;

public class FramePage extends BasePage
{

    public FramePage(WebDriver driver) {
        super(driver);
    }


    @FindBy(tagName="iframe")
    List<WebElement> iframe;
    public FramePage returnListOfFrames() {
        //by find all web elements using method size()
        System.out.println("The total number of iframes "+iframe.size());
        return this;
    }
}
