package UI;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

    public static void main(String[] args) {
        // Встановлюємо шлях до драйвера Chrome
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\nvatsyk\\IdeaProjects\\Admin.v1\\chromedriver-win64\\chromedriver.exe");

        // Ініціалізуємо об'єкт ChromeDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Відкриваємо веб-сторінку
        driver.get("https://beta.admin.ustruckingservice.com/");

        // Знаходимо поле для введення логіну та вводимо логін
        WebElement usernameField = driver.findElement(By.id("username"));
        usernameField.sendKeys("new70249@gmail.com");

        // Знаходимо поле для введення пароля та вводимо пароль
        WebElement passwordField = driver.findElement(By.id("user_password"));
        passwordField.sendKeys("Vv8888999!");

        // Знаходимо кнопку "Логін" та натискаємо на неї
        WebElement loginButton = driver.findElement(By.xpath("/html/body/main/div/div[2]/div/form/button"));
        loginButton.click();

        // Чекаємо певний час для завершення процесу логування
        try {
            Thread.sleep(1000); // Чекаємо 3 секунди
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        // Прокручуємо сторінку вниз
        JavascriptExecutor secondjs = (JavascriptExecutor) driver;
        secondjs.executeScript("window.scrollBy(0,3000);");
        //Переходимо на Дашборд
        WebElement firstElement = driver.findElement(By.xpath("//*[@id=\"menu-item-330223\"]/a"));
        firstElement.click();
        //Клікаємо на View details баттон Драйверз
        WebElement firstButton = driver.findElement(By.xpath("//*[@id=\"main-panel\"]/div[2]/div/div/div[2]/div[2]/div[1]/div/div/a"));
        firstButton.click();
        // Cкролимо донизу
        JavascriptExecutor thirdjs = (JavascriptExecutor) driver;
        thirdjs.executeScript("window.scrollBy(0,3000);");
        //Повертаємось на Дашборд
        WebElement secondElement = driver.findElement(By.xpath("//*[@id=\"menu-item-330223\"]/a"));
        secondElement.click();
        //Клікаємо на View details баттон Керрієрз
        WebElement secondButton = driver.findElement(By.xpath("//*[@id=\"main-panel\"]/div[2]/div/div/div[2]/div[2]/div[2]/div/div/a"));
        secondButton.click();
        // Cкролимо донизу
        JavascriptExecutor fourthjs = (JavascriptExecutor) driver;
        fourthjs.executeScript("window.scrollBy(0,3000);");
        //Повертаємось на Дашборд
        WebElement thirdElement = driver.findElement(By.xpath("//*[@id=\"menu-item-330223\"]/a"));
        thirdElement.click();
        //Клікаємо на View details баттон Метчез
        WebElement thirdButton = driver.findElement(By.xpath("//*[@id=\"main-panel\"]/div[2]/div/div/div[2]/div[2]/div[3]/div/div/a"));
        thirdButton.click();
        // Cкролимо донизу
        JavascriptExecutor sixjs = (JavascriptExecutor) driver;
        sixjs.executeScript("window.scrollBy(0,3000);");
        //Повертаємось на Дашборд
        WebElement fourthElement = driver.findElement(By.xpath("//*[@id=\"menu-item-330223\"]/a"));
        fourthElement.click();
        //Клікаємо на View details баттон Джобз
        WebElement fourthButton = driver.findElement(By.xpath("//*[@id=\"main-panel\"]/div[2]/div/div/div[2]/div[2]/div[4]/div/div/a"));
        fourthButton.click();
        //Проскролюємо донизу правим скролом
        JavascriptExecutor sevenjs = (JavascriptExecutor) driver;
        sevenjs.executeScript("window.scrollBy(0,3000);");
        //Повертаємось на Дашборд
        WebElement fifthElement = driver.findElement(By.xpath("//*[@id=\"menu-item-330223\"]/a"));
        fifthElement.click();

        // Знаходимо ліву бічну панель за класом або іншим селектором
        WebElement leftSidebar = driver.findElement(By.className("sidebar-wrapper"));
        // Прокручуємо ліву бічну панель вниз
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollTop += 2000;", leftSidebar);


        //Знаходимо баттон логаут на клікаємо по ньому
        WebElement logoutButton = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/ul/li[11]/a")); // Замість id вкажіть селектор, який відповідає кнопці логауту
        logoutButton.click();


        //ми на сторінці Логіну

        // Закриваємо веб-драйвер
        //driver.quit();
    }
}

