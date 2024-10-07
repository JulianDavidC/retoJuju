package com.demoqa.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class ElementsRadioButtonPageObject extends PageObject {
    By btnCheckBox = By.xpath("//li/span[text()='Radio Button']");
    By rtbYes = By.xpath("//*[@for='yesRadio']");
    By lblSucces = By.xpath("//*[@class='text-success']");

    public By getBtnCheckBox() {
        return btnCheckBox;
    }

    public By getRtbYes() {
        return rtbYes;
    }

    public By getLblSucces() {
        return lblSucces;
    }
}
