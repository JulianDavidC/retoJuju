package com.demoqa.pageObject;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;


@DefaultUrl("https://demoqa.com/")
public class PaginaInicialPageObject extends PageObject {

  By btnElement = By.xpath("//h5[text()='Elements']");

  public By getBtnElement() {
    return btnElement;
  }
}
