package com.demoqa.forms;

import com.demoqa.pages.BasePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PracticeFormPages extends BasePage
{
    public PracticeFormPages(WebDriver driver)
    {
        super(driver);
    }


    @FindBy(id="firstName")
    WebElement firstName;

    @FindBy(id="lastName")
    WebElement lastName;

    @FindBy(id="userEmail")
    WebElement userEmail;

    @FindBy(id="userNumber")
    WebElement userNumber;


    public PracticeFormPages enterPersonalData(String name, String surName, String mail, String phone) {


        typeWithJS(firstName,name,0,300);
        type(lastName,surName);
        type(userEmail,mail);
        type(userNumber,phone);
        return this;
    }


    @FindBy(css="[for='gender-radio-1']")
    WebElement male;

    @FindBy(css="[for='gender-radio-2']")
    WebElement female;

    @FindBy(css="[for='gender-radio-3']")
    WebElement other;

    public PracticeFormPages selectGender(String gender) {
        if(gender.equals("Male")) {
            click(male);
        }
        else if(gender.equals("Female")) {
            click(male);
        }
        else {
            click(other);
        }
        return this;
    }



    @FindBy(id="dateOfBirthInput")
    WebElement dateOfBirthInput;

    public PracticeFormPages enterdateOfBirth(String date)
    {
    click(dateOfBirthInput);

    String os = System.getProperty("os.name");
    System.out.println("My OS is " + os);
    if(os.startsWith("Mac"))
    {
        dateOfBirthInput.sendKeys(Keys.COMMAND,"a");
    }
    else
    {
        dateOfBirthInput.sendKeys(Keys.CONTROL,"a");
    }
        dateOfBirthInput.sendKeys(date);
    dateOfBirthInput.sendKeys(Keys.ENTER);
    return this;
    }



    @FindBy(id= "subjectsInput")
    WebElement subjectsInput;

    public PracticeFormPages addSubjects(String[] subjects) {
        for (int i = 0; i <subjects.length ; i++) {
            if(subjects[i] !=null){
                type(subjectsInput,subjects[i]);
                subjectsInput.sendKeys(Keys.ENTER);
            }

        }

        return this;
    }



    @FindBy(css= "[for='hobbies-checkbox-1']")
    WebElement sports;

    @FindBy(css= "[for='hobbies-checkbox-2']")
    WebElement reading;

    @FindBy(css= "[for='hobbies-checkbox-3']")
    WebElement music;

    public PracticeFormPages selectHobbies(String[] hobby)
    {
        for (int i = 0; i <hobby.length ; i++)
        {
            if(hobby[i].equals("Sports"))
            {
                click(sports);
            }
            if(hobby[i].equals("Reading"))
            {
                click(reading);
            }
            if(hobby[i].equals("Music"))
            {
                click(music);
            }

        }

        return this;
    }
}
