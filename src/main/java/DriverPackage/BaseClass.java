package DriverPackage;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class BaseClass {
    public WebDriver driver;
    public WebDriverWait wait;
    Actions act;
    TakesScreenshot ts;

    public BaseClass(){
        this.driver=DriverManager.getDriver();
        wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        PageFactory.initElements(driver,this);


    }
    public void click_Element(WebElement element)
    {
        WebElement elementClick=wait.until(ExpectedConditions.elementToBeClickable(element));
        elementClick.click();;
    }
    public void type_Values(String data,WebElement element)
    {
        WebElement valueField=wait.until(ExpectedConditions.visibilityOf(element));
        valueField.sendKeys(data);
    }
    public void move_mouse_to_element(WebElement element)
    {   WebElement mouseHover=wait.until(ExpectedConditions.visibilityOf(element));
        act=new Actions(driver);
        act.moveToElement(mouseHover).perform();
    }
    public void drag_Drop(WebElement element1,WebElement element2){
        WebElement source=wait.until(ExpectedConditions.visibilityOf(element1));
        WebElement target=wait.until(ExpectedConditions.visibilityOf(element2));
        act=new Actions(driver);
        act.dragAndDrop(source,target).perform();

    }
    public void scroll_to_element(WebElement element){
        WebElement scroll=wait.until(ExpectedConditions.visibilityOf(element));
        act=new Actions(driver);
        act.scrollToElement(scroll).perform();
    }


    public void type_Values_enter(WebElement element,String text){

        WebElement inputFields=wait.until(ExpectedConditions.visibilityOf(element));
        act=new Actions(driver);
        act.sendKeys(inputFields,text, Keys.ENTER).build().perform();


    }
    public void screen_shot(String fileName){
        ts=(TakesScreenshot)driver;

        try {
            File src=ts.getScreenshotAs(OutputType.FILE);
            File des= new File("target/ScreenShot/"+fileName+".png");

            FileUtils.copyFile(src,des);
        } catch (IOException e) {
            System.out.println("file path not found");
        }


    }
    public void setImplicitTime(long time)
    {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));


    }
}

