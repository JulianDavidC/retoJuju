package com.demoqa.stepDefinitions;

import com.demoqa.steps.ElementsTextBoxStep;
import com.demoqa.steps.PaginaInicialStep;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class ValidarTextBoxStepDefinitions {

  @Steps
  PaginaInicialStep paginaInicialStep;
  @Steps
  ElementsTextBoxStep elementsTextBoxStep;
  @Dado("que el usuario abre el navegador en la pagina sanangel")
  public void queElUsuarioAbreElNavegadorEnLaPaginaSanangel() {
    paginaInicialStep.abrirNavegador();
  }
  @Cuando("escoja la opcion elements")
  public void escojaLaOpcionElements() {
    paginaInicialStep.seleccionarBotonElements();
  }
  @Cuando("escogemos la opcion text box")
  public void escogemosLaOpcionTextBox() {
    elementsTextBoxStep.seleccionarBotonTextBox();
  }
  @Cuando("llenamos los datos para presionar el boton submit")
  public void llenamosLosDatosParaPresionarElBotonSubmit() {
    elementsTextBoxStep.llenarCampos();
    elementsTextBoxStep.presionarBotonSubmit();
  }
  @Entonces("se debe validar que la informacion ingresa sea correct")
  public void seDebeValidarQueLaInformacionIngresaSeaCorrect() {
    elementsTextBoxStep.validarDatos("Name:Julian Chica", "Email:pruebas@pruebas.co","Current Address :Calle 13 # 1 - 2","Permananet Address :Cra 6a este");

  }

}
