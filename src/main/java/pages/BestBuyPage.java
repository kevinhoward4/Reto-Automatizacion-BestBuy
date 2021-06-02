package pages;

import org.openqa.selenium.By;

public class BestBuyPage {


  //button[@class='c-close-icon c-modal-close-icon']
  private  static By imgPaisPage = By.xpath("//img[@alt='Estados Unidos']");
  private  static By btnVentanaPage = By.xpath("//button[@class='c-close-icon c-modal-close-icon']");
  private  static By txtBuscadorPage = By.xpath("//input[@id='gh-search-input']");
  private  static By btnBuscadorPage = By.xpath("//button[@class='header-search-button']");
  private static By btnProducto;
  private static By lblProducto;

  public static By getBtnProducto() {return btnProducto;}

  public static void setBtnProducto(String producto) {
    BestBuyPage.btnProducto = By.xpath("//h4[@class='sku-header']//a[contains(text(),'"+producto+"')]");;
  }
  public static By getLblProducto() {return lblProducto;}

  public static void setLblProducto(String producto) {
    BestBuyPage.lblProducto = By.xpath("//h1[contains(text(),'"+producto+"')]");
  }

  //private  static By item1 = By.xpath("//h4[@class='sku-header']//a[contains(text(),'Microsoft - Xbox Series X 1TB Console - Black')]");
  //private  static By item2 = By.xpath("//h4[@class='sku-header']//a[contains(text(),'SanDisk - Ultra PLUS 128GB microSDXC UHS-I Memory Card Mobile')]");
  //private  static By item3 = By.xpath("//h4[@class='sku-header']//a[contains(text(),'Samsung - 5.2 Cu. Ft. High Efficiency Top Load Washer with Activewash - Black stainless steel')]");
  //private  static By item4 = By.xpath("//h4[@class='sku-header']//a[contains(text(),'GoPro - HERO8 Black 4K Waterproof Action Camera - Black')]");
  //private  static By item5 = By.xpath("//h4[@class='sku-header']//a[contains(text(),'Apple Watch Series 6 (GPS) 44mm Space Gray Aluminum Case with Black Sport Band - Space Gray')]");
  ////h4[@class='sku-header']//a[contains(text(),'Microsoft - Xbox Series X 1TB Console - Black')]
    // //h4[@class='sku-header']//a[contains(text(),'SanDisk - Ultra PLUS 128GB microSDXC UHS-I Memory Card Mobile')]
    // //h4[@class='sku-header']//a[contains(text(),'Samsung - 5.2 Cu. Ft. High Efficiency Top Load Washer with Activewash - Black stainless steel')]
    // //h4[@class='sku-header']//a[contains(text(),'GoPro - HERO8 Black 4K Waterproof Action Camera - Black')]
    // //h4[@class='sku-header']//a[contains(text(),'Apple Watch Series 6 (GPS) 44mm Space Gray Aluminum Case with Black Sport Band - Space Gray')]
  public static By getImgPaisPage() {return imgPaisPage;}
  public static By getBtnVentanaPage() {return btnVentanaPage;}
  public static By getBtnBuscadorPage() {return btnBuscadorPage;}
  public static By getTxtBuscadorPage() {return txtBuscadorPage;}
  //public static By getItem1() {return item1;}
  //public static By getItem2() {return item2;}
  //public static By getItem3() {return item3;}
  //public static By getItem4() {return item4;}
  //public static By getItem5() {return item5;}





}
