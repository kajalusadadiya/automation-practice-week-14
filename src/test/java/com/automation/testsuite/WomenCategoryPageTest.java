package com.automation.testsuite;

import com.automation.pages.HomePage;
import com.automation.pages.SignInPage;
import com.automation.pages.WomenCategoryPage;
import com.automation.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import resources.testdata.TestData;

public class WomenCategoryPageTest extends TestBase {
    HomePage homePage;
  SignInPage signINPage;
    SoftAssert softAssert;
    WomenCategoryPage womenCategoryPage;

    @BeforeMethod(groups = {"regression", "smoke", "sanity"})
    public void setup1() {
        homePage = new HomePage();
        signINPage = new SignInPage();
        softAssert = new SoftAssert();
        womenCategoryPage =new WomenCategoryPage();
    }
    @Test(groups = {"sanity", "regression"})
    public void verifyUserShouldNavigateToWomenCategoryPageSuccessfully(){
        homePage.setClickOnWomenLink();
        String expectedText = "WOMEN";
        String actualText = womenCategoryPage.verifyWomenText();

        softAssert.assertEquals(actualText,expectedText);
        softAssert.assertAll();
    }

    @Test(dataProvider = "dataSet", dataProviderClass = TestData.class,groups = {"smoke", "regression"})
    public void verifyUserShouldAddProductToTheCartSuccessfully(String product, String qty,
                                                                String size, String colour) throws InterruptedException { homePage.setClickOnWomenLink();
        womenCategoryPage.setSelectProduct(product);
        womenCategoryPage.selectQty(qty);
        womenCategoryPage.setSelectSize(size);
        womenCategoryPage.setSelectColour(colour);
        womenCategoryPage.setAddToCartButton();
        Thread.sleep(2000);
        String expectedText = "Product successfully added to your shopping cart";
        String actualText =womenCategoryPage.setConfirmationText();
        System.out.println(actualText);
        softAssert.assertEquals(actualText,expectedText);
        // softAssert.assertAll();
        womenCategoryPage.setCloseWindow();
    }
}
