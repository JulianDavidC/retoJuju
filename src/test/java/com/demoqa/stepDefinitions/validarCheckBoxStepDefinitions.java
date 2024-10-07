package com.demoqa.stepDefinitions;

import com.demoqa.steps.ElementsCheckboxStep;
import com.demoqa.steps.PaginaInicialStep;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.thucydides.core.annotations.Steps;


public class validarCheckBoxStepDefinitions {
    @Steps
    PaginaInicialStep paginaInicialStep;
    @Steps
    ElementsCheckboxStep elementsCheckboxStep;


    @Dado("que el usuario abre el navegador y la pagina sanangel")
    public void queElUsuarioAbreElNavegadorYLaPaginaSanangel() {
        paginaInicialStep.abrirNavegador();
    }
    @Cuando("se escoja opcion elements")
    public void seEscojaOpcionElements() {
        paginaInicialStep.seleccionarBotonElements();
    }
    @Cuando("escogemos la opcion checkbox")
    public void escogemosLaOpcionCheckbox() {
        elementsCheckboxStep.ingresarOpcionCheckBox();
    }
    @Cuando("seleccionamos los checks Notes, WorkSpace, Office, Word File.doc")
    public void seleccionamosLosChecksNotesWorkSpaceOfficeWordFileDoc() {
        elementsCheckboxStep.llenarChecks();
    }
    @Entonces("Se debe validar que los checks este marcados")
    public void seDebeValidarQueLosChecksEsteMarcados() {
        elementsCheckboxStep.validarChecks();
    }
}
