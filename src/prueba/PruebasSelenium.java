package prueba;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class PruebasSelenium {

	static WebDriver driver1;

	@BeforeAll
	static void setURL() {
		driver1 = new ChromeDriver();

	}

	@Test
	void testValido1() {
		driver1.get("https://elenarivero.github.io/ejercicio3/index.html");
		WebElement nombreApellidoBox = driver1.findElement(By.id("nomap"));
		WebElement fechaBox = driver1.findElement(By.id("fecha"));

		nombreApellidoBox.sendKeys("Ruben");
		fechaBox.sendKeys("15/04/2005");

		WebElement submitButton = driver1.findElement(By.xpath("//p/input[@type='submit']"));
		submitButton.click();

		WebElement correcto = driver1.findElement(By.cssSelector("h3"));

		assertEquals("Datos correctos", correcto.getText());

	}

	@Test
	void testError1() {
		driver1.get("https://elenarivero.github.io/ejercicio3/index.html");
		WebElement nombreApellidoBox = driver1.findElement(By.id("nomap"));
		WebElement fechaBox = driver1.findElement(By.id("fecha"));

		nombreApellidoBox.sendKeys("5Ruben");
		fechaBox.sendKeys("02/02/2005");

		WebElement submitButton = driver1.findElement(By.xpath("//p/input[@type='submit']"));
		submitButton.click();

		WebElement errorNombreApellido = driver1.findElement(By.id("errorNomap"));
		boolean texto = errorNombreApellido.isDisplayed();
		assertTrue(texto);

		WebElement errorFecha = driver1.findElement(By.id("errorFecha"));
		boolean textoFecha = errorFecha.isDisplayed();
		assertFalse(textoFecha);

	}

	@Test
	void testError2() {
		driver1.get("https://elenarivero.github.io/ejercicio3/index.html");
		WebElement nombreApellidoBox = driver1.findElement(By.id("nomap"));
		WebElement fechaBox = driver1.findElement(By.id("fecha"));

		nombreApellidoBox.sendKeys("");
		fechaBox.sendKeys("01/01/2005");

		WebElement submitButton = driver1.findElement(By.xpath("//p/input[@type='submit']"));
		submitButton.click();

		WebElement errorNombreApellido = driver1.findElement(By.id("errorNomap"));
		boolean texto = errorNombreApellido.isDisplayed();
		assertTrue(texto);

		WebElement errorFecha = driver1.findElement(By.id("errorFecha"));
		boolean textoFecha = errorFecha.isDisplayed();
		assertFalse(textoFecha);

	}

	@Test
	void testError3() {
		driver1.get("https://elenarivero.github.io/ejercicio3/index.html");
		WebElement nombreApellidoBox = driver1.findElement(By.id("nomap"));
		WebElement fechaBox = driver1.findElement(By.id("fecha"));

		nombreApellidoBox.sendKeys("/Ruben");
		fechaBox.sendKeys("30/11/2005");

		WebElement submitButton = driver1.findElement(By.xpath("//p/input[@type='submit']"));
		submitButton.click();

		WebElement errorNombreApellido = driver1.findElement(By.id("errorNomap"));
		boolean texto = errorNombreApellido.isDisplayed();
		assertTrue(texto);

		WebElement errorFecha = driver1.findElement(By.id("errorFecha"));
		boolean textoFecha = errorFecha.isDisplayed();
		assertFalse(textoFecha);

	}

	@Test
	void testError4() {
		driver1.get("https://elenarivero.github.io/ejercicio3/index.html");
		WebElement nombreApellidoBox = driver1.findElement(By.id("nomap"));
		WebElement fechaBox = driver1.findElement(By.id("fecha"));

		nombreApellidoBox.sendKeys("Ru555ben");
		fechaBox.sendKeys("31/12/2005");

		WebElement submitButton = driver1.findElement(By.xpath("//p/input[@type='submit']"));
		submitButton.click();

		WebElement errorNombreApellido = driver1.findElement(By.id("errorNomap"));
		boolean texto = errorNombreApellido.isDisplayed();
		assertTrue(texto);

		WebElement errorFecha = driver1.findElement(By.id("errorFecha"));
		boolean textoFecha = errorFecha.isDisplayed();
		assertFalse(textoFecha);

	}
	
	@Test
	void testError5() {
		driver1.get("https://elenarivero.github.io/ejercicio3/index.html");
		WebElement nombreApellidoBox = driver1.findElement(By.id("nomap"));
		WebElement fechaBox = driver1.findElement(By.id("fecha"));

		nombreApellidoBox.sendKeys("Ru////////ben");
		fechaBox.sendKeys("15/04/2005");

		WebElement submitButton = driver1.findElement(By.xpath("//p/input[@type='submit']"));
		submitButton.click();

		WebElement errorNombreApellido = driver1.findElement(By.id("errorNomap"));
		boolean texto = errorNombreApellido.isDisplayed();
		assertTrue(texto);

		WebElement errorFecha = driver1.findElement(By.id("errorFecha"));
		boolean textoFecha = errorFecha.isDisplayed();
		assertFalse(textoFecha);

	}
	
	@Test
	void testError6() {
		driver1.get("https://elenarivero.github.io/ejercicio3/index.html");
		WebElement nombreApellidoBox = driver1.findElement(By.id("nomap"));
		WebElement fechaBox = driver1.findElement(By.id("fecha"));

		nombreApellidoBox.sendKeys("Ruben");
		fechaBox.sendKeys("");

		WebElement submitButton = driver1.findElement(By.xpath("//p/input[@type='submit']"));
		submitButton.click();

		WebElement errorNombreApellido = driver1.findElement(By.id("errorNomap"));
		boolean texto = errorNombreApellido.isDisplayed();
		assertFalse(texto);

		WebElement errorFecha = driver1.findElement(By.id("errorFecha"));
		boolean textoFecha = errorFecha.isDisplayed();
		assertTrue(textoFecha);

	}
	
	@Test
	void testError7() {
		driver1.get("https://elenarivero.github.io/ejercicio3/index.html");
		WebElement nombreApellidoBox = driver1.findElement(By.id("nomap"));
		WebElement fechaBox = driver1.findElement(By.id("fecha"));

		nombreApellidoBox.sendKeys("Ruben");
		fechaBox.sendKeys("2005/15/04");

		WebElement submitButton = driver1.findElement(By.xpath("//p/input[@type='submit']"));
		submitButton.click();

		WebElement errorNombreApellido = driver1.findElement(By.id("errorNomap"));
		boolean texto = errorNombreApellido.isDisplayed();
		assertFalse(texto);

		WebElement errorFecha = driver1.findElement(By.id("errorFecha"));
		boolean textoFecha = errorFecha.isDisplayed();
		assertTrue(textoFecha);

	}
	
	@Test
	void testError8() {
		driver1.get("https://elenarivero.github.io/ejercicio3/index.html");
		WebElement nombreApellidoBox = driver1.findElement(By.id("nomap"));
		WebElement fechaBox = driver1.findElement(By.id("fecha"));

		nombreApellidoBox.sendKeys("Ruben");
		fechaBox.sendKeys("32/04/2005");

		WebElement submitButton = driver1.findElement(By.xpath("//p/input[@type='submit']"));
		submitButton.click();

		WebElement errorNombreApellido = driver1.findElement(By.id("errorNomap"));
		boolean texto = errorNombreApellido.isDisplayed();
		assertFalse(texto);

		WebElement errorFecha = driver1.findElement(By.id("errorFecha"));
		boolean textoFecha = errorFecha.isDisplayed();
		assertTrue(textoFecha);

	}
	
	@Test
	void testError9() {
		driver1.get("https://elenarivero.github.io/ejercicio3/index.html");
		WebElement nombreApellidoBox = driver1.findElement(By.id("nomap"));
		WebElement fechaBox = driver1.findElement(By.id("fecha"));

		nombreApellidoBox.sendKeys("Ruben");
		fechaBox.sendKeys("00/04/2005");

		WebElement submitButton = driver1.findElement(By.xpath("//p/input[@type='submit']"));
		submitButton.click();

		WebElement errorNombreApellido = driver1.findElement(By.id("errorNomap"));
		boolean texto = errorNombreApellido.isDisplayed();
		assertFalse(texto);

		WebElement errorFecha = driver1.findElement(By.id("errorFecha"));
		boolean textoFecha = errorFecha.isDisplayed();
		assertTrue(textoFecha);

	}
	
	@Test
	void testError10() {
		driver1.get("https://elenarivero.github.io/ejercicio3/index.html");
		WebElement nombreApellidoBox = driver1.findElement(By.id("nomap"));
		WebElement fechaBox = driver1.findElement(By.id("fecha"));

		nombreApellidoBox.sendKeys("Ruben");
		fechaBox.sendKeys("15/00/2005");

		WebElement submitButton = driver1.findElement(By.xpath("//p/input[@type='submit']"));
		submitButton.click();

		WebElement errorNombreApellido = driver1.findElement(By.id("errorNomap"));
		boolean texto = errorNombreApellido.isDisplayed();
		assertFalse(texto);

		WebElement errorFecha = driver1.findElement(By.id("errorFecha"));
		boolean textoFecha = errorFecha.isDisplayed();
		assertTrue(textoFecha);

	}
	
	@Test
	void testError11() {
		driver1.get("https://elenarivero.github.io/ejercicio3/index.html");
		WebElement nombreApellidoBox = driver1.findElement(By.id("nomap"));
		WebElement fechaBox = driver1.findElement(By.id("fecha"));

		nombreApellidoBox.sendKeys("Ruben");
		fechaBox.sendKeys("15/13/2005s");

		WebElement submitButton = driver1.findElement(By.xpath("//p/input[@type='submit']"));
		submitButton.click();

		WebElement errorNombreApellido = driver1.findElement(By.id("errorNomap"));
		boolean texto = errorNombreApellido.isDisplayed();
		assertFalse(texto);

		WebElement errorFecha = driver1.findElement(By.id("errorFecha"));
		boolean textoFecha = errorFecha.isDisplayed();
		assertTrue(textoFecha);

	}

	/*
	 * @AfterAll static void exitDriver() { driver1.quit(); }
	 */
}
