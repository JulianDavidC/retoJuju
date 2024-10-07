package com.demoqa.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class ElementsCheckboxPageObject extends PageObject {

    By btnCheckBox = By.xpath("//li/span[text()='Check Box']");
    By chkCheckBox = By.xpath("//*[@id='tree-node']/div/button[1]");
    By lblNote = By.xpath("//span[text()='Notes']");
    By lblWorkSpace = By.xpath("//span[text()='WorkSpace']");
    By lblOffice = By.xpath("//span[text()='Office']");
    By lblWord = By.xpath("//span[text()='Word File.doc']");
    By chkNotes = By.xpath("//*[@id='tree-node-notes']");
    By chkWorkspace = By.xpath("//*[@id='tree-node-workspace']");
    By chkoffice = By.xpath("//*[@id='tree-node-office']");
    By chkwordFile = By.xpath("//*[@id='tree-node-wordFile']");

    public By getBtnCheckBox() {
        return btnCheckBox;
    }
    public By getChkCheckBox() {
        return chkCheckBox;
    }
    public By getLblNote() {
        return lblNote;
    }
    public By getLblWorkSpace() {
        return lblWorkSpace;
    }
    public By getLblOffice() {
        return lblOffice;
    }
    public By getLblWord() {
        return lblWord;
    }
    public By getChkNotes() {
        return chkNotes;
    }
    public By getChkWorkspace() {
        return chkWorkspace;
    }
    public By getChkwordFile() {
        return chkwordFile;
    }
    public By getChkoffice() {
        return chkoffice;
    }


}
