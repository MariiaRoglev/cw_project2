package com.demoqa.tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


    public class PracticeFormTest extends TestBase {

        @Test(dataProviderClass = DataProvider.class, dataProvider = "addNewStudentFormWithCsv")

        public void createStudentAccount(String name, String lastName, String email, String phone) {

            new PracticeFormTest(driver)
                    .enterPersonalData(name, lastName, email, phone)
                    .selectGender("Male")
                    .enertData("16 aug 1987")
                    .addSubject(new String[]{"Math", "Chemistry"})
                    .selectHobby(new String[]{"Sport", "Reading"})
                    .uploudFile("")
                    .inputState("NCR")
                    .inputCity("Delphi")
                    .submit()
                    .verifySuccessRegistration("");

        }
    }

