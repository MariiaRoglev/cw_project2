package com.demoqa.tests;

import com.demoqa.forms.PracticeFormPages;
import com.demoqa.pages.HomePage;
import com.demoqa.pages.SidePanel;
import com.demoqa.utils.DataProviders;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


    public class PracticeFormTest extends TestBase {

       @BeforeMethod
       public void precondition()
       {
           new HomePage(driver).getForms();
           new SidePanel(driver).selectPracticeForm();

       }

       @Test(dataProviderClass = DataProviders.class,dataProvider = "addNewStudentFormWithCsv")
        public void createStudentAccount(String name,String surName, String mail, String phone)
        {
            new PracticeFormPages(driver)
                    .enterPersonalData(name,surName,mail,phone)
                    .selectGender("Male")
                    .enterdateOfBirth("17 Aug 1987")
                    .addSubjects(new String[]{"Math","Chemistry"})
                   .selectHobbies(new String[]{"Sports","Reading"})
//                    .uploadFile("C:/Users/winte/Downloads//WhatsApp Image 2025-05-10 at 12.02.48.jpg")
                  .inputState("NCR")
                    .inputCity("Delhi")
                    .submit().verifySuccessRegistration("Thanks for submitting the form")
            ;

        }



//        @Test(dataProviderClass = DataProvider.class, dataProvider = "addNewStudentFormWithCsv")
//
//        public void createStudentAccount(String name, String lastName, String email, String phone) {
//
//            new PracticeFormTest(driver)
//                    .enterPersonalData(name, lastName, email, phone)
//                    .selectGender("Male")
//                    .enertData("16 aug 1987")
//                    .addSubject(new String[]{"Math", "Chemistry"})
//                    .selectHobby(new String[]{"Sport", "Reading"})
//                    .uploudFile("")
//                    .inputState("NCR")
//                    .inputCity("Delphi")
//                    .submit()
//                    .verifySuccessRegistration("Thanks for submitting the form");
//        }




    }

