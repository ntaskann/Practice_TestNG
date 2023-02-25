package tests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.DhtmlPage;
import utilities.ConfigReader;
import utilities.Driver;

public class Practice01 {
    DhtmlPage dhtmlPage;
    @Test
    public void testName() {
        dhtmlPage=new DhtmlPage();
        //http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html adresine gidiniz
        Driver.getDriver().get(ConfigReader.getProperty("dhtmlUrl"));
        //Tüm ülkeleri yazdırınız

        for (WebElement w: dhtmlPage.ulkeler){
            System.out.println("Ulkeler = " + w.getText());
        }

        //Ülkeler ile şehirleri eşleştiriniz
        Actions actions=new Actions(Driver.getDriver());
        actions.dragAndDrop(dhtmlPage.Seoul,dhtmlPage.Korea).
                dragAndDrop(dhtmlPage.Oslo,dhtmlPage.Norway).
                dragAndDrop(dhtmlPage.Stockholm,dhtmlPage.Sweden).
                dragAndDrop(dhtmlPage.Washington,dhtmlPage.Abd).
                dragAndDrop(dhtmlPage.Rome,dhtmlPage.Italy).
                dragAndDrop(dhtmlPage.Madrid,dhtmlPage.Spain).
                dragAndDrop(dhtmlPage.Copenhagen,dhtmlPage.Denmark).perform();

    }

}