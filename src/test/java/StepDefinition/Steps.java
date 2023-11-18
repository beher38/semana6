package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;	
import cucumber.api.java.en.When;

public class Steps {
	
	WebDriver driver;
	
	@Given("Abrir Chrome")
	public void abrir_Chrome() {
		System.out.println("Este paso abre Chrome");
		System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8081/Login2/login.php");
	}
	
	@When("ingresa Username {string} y Password {string}")
	public void ingresa_Username_y_Password(String string, String string2) {
		System.out.println("Ingresa credencial del usuario");
		System.out.println("Este paso ingresa el nombre de usuario y contraseña em pagina login");
		driver.findElement(By.id("username")).sendKeys(string);
		driver.findElement(By.id("password")).sendKeys(string2);
	}

	
	@Then("Iniciar sesion")
	public void inicia_sesion() {
		System.out.println("En este pasose inicia sesion con los datos de MyTest");
		driver.findElement(By.id("boton")).click();
	}
	
}
