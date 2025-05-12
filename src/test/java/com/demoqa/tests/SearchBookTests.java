package com.demoqa.tests;

import com.demoqa.bookStore.ProfilePage;
import com.demoqa.pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchBookTests extends TestBase
{
    @BeforeMethod
    public void precondition()
    {
        new HomePage(driver).getBookStore();
    }
    @Test
    public void searchBookPositive()
    {
        new ProfilePage(driver).typeKeyInSearchInput("git").verifyNAmeOfBook("Git");

    }






}
