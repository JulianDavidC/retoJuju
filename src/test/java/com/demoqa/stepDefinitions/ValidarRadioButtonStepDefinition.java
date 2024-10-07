package com.demoqa.stepDefinitions;

import com.demoqa.steps.ElementsRadioButtonSteps;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class ValidarRadioButtonStepDefinition {

    @Steps
    ElementsRadioButtonSteps elementsRadioButtonSteps;

    @Dado("que me encuentro en la pantalla element seleciono la opcion Radio buttons")
    public void queMeEncuentroEnLaPantallaElementSelecionoLaOpcionRadioButtons() {
        elementsRadioButtonSteps.ingresarOpcionRadioButton();
    }
    @Cuando("de click en uno de los radio buttoms")
    public void deClickEnUnoDeLosRadioButtoms() {
        elementsRadioButtonSteps.seleccionarRadioButton();
    }
    @Entonces("Se debe validar que este marcado")
    public void seDebeValidarQueEsteMarcado() {
        elementsRadioButtonSteps.validarRadioButtonSelecionado();
    }

}
