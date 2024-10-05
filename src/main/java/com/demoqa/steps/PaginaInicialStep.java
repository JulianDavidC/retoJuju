package com.demoqa.steps;

import com.demoqa.pageObject.PaginaInicialPageObject;
import net.thucydides.core.annotations.Step;

public class PaginaInicialStep {
  PaginaInicialPageObject paginaInicialPageObject = new PaginaInicialPageObject();

  @Step
  public void abrirNavegador(){
    paginaInicialPageObject.open();
  }

  @Step
  public void seleccionarBotonElements(){
    paginaInicialPageObject.getDriver().findElement(paginaInicialPageObject.getBtnElement()).click();
  }


}
