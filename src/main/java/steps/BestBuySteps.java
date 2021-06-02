package steps;

import driver.SeleniumWebDriver;
import org.openqa.selenium.By;
import pages.BestBuyPage;
import utils.Excel;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class BestBuySteps {

    private static ArrayList<Map<String, String>> lecturaExcel = new ArrayList<Map<String, String>>();

    public void escribirEnTexto(By elemento, String texto) {
        SeleniumWebDriver.driver.findElement(elemento).sendKeys(texto);
    }

    public void clicEnElemento(By elemento) {
        SeleniumWebDriver.driver.findElement(elemento).click();
    }

    public String obtenerTextoDeElemento(By elemento) {
        return SeleniumWebDriver.driver.findElement(elemento).getText();
    }

    public void validarEstoEnPantalla(By elemento, String texto) {
        assertEquals(obtenerTextoDeElemento(elemento), texto);
    }

    public void buscarPalabraEnBestBuy() {
        clicEnElemento(BestBuyPage.getImgPaisPage());
        clicEnElemento(BestBuyPage.getBtnVentanaPage());
        try {
            lecturaExcel = Excel.readExcel("C:\\Users\\kevin\\OneDrive\\Desktop\\Libro1.xlsx", "Hoja1");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        for (int i = 0; i < lecturaExcel.size(); i++) {
            escribirEnTexto(BestBuyPage.getTxtBuscadorPage(), lecturaExcel.get(i).get("Productos"));
            clicEnElemento(BestBuyPage.getBtnBuscadorPage());
            BestBuyPage.setBtnProducto(lecturaExcel.get(i).get("Productos"));
            clicEnElemento(BestBuyPage.getBtnProducto());
            BestBuyPage.setLblProducto(lecturaExcel.get(i).get("Productos"));
            validarEstoEnPantalla(BestBuyPage.getLblProducto(), lecturaExcel.get(i).get("Productos"));

        }
    /*public void buscarPalabraEnBestBuy2(String palabra) {
        escribirEnTexto(BestBuyPage.getTxtBuscadorPage(), palabra);
        clicEnElemento(BestBuyPage.getBtnBuscadorPage());
        clicEnElemento(BestBuyPage.getItem2());
    }*/


    }

}
