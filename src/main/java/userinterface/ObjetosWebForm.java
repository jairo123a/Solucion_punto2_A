package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ObjetosWebForm {
    public static final Target NAME = Target.the("Name").located(By.id("firstName"));
    public static final Target LASTNAME = Target.the("lastName").located(By.id("lastName"));
    public static final Target EMAIL = Target.the("Email").located(By.id("userEmail"));
    public static final Target GENDERMALE = Target.the("genero").located(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[1]/label"));
    public static final Target GENDERFEMALE = Target.the("genero").located(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[1]/label"));
    public static final Target USERNUMBER = Target.the("Telefono").located(By.id("userNumber"));
    public static final Target Hobbies = Target.the("Hobbies").located(By.xpath("//label[@for='hobbies-checkbox-1']"));
    public static final Target CURRENT= Target.the("current").located(By.id("currentAddress"));
    public static final Target STATE= Target.the("Estadp").located(By.xpath("//div[@class= ' css-2b097c-container' and @id='state']"));
    public static final Target STATE1= Target.the("Estadp").located(By.id("react-select-3-input"));
    public static final Target DUBMITTING= Target.the("Estadp").located(By.id("example-modal-sizes-title-lg"));

}

