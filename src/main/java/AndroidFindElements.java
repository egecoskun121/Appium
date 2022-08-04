import io.appium.java_client.AppiumDriver;
import io.appium.java_client.FindsByAndroidUIAutomator;
import io.appium.java_client.MobileElement;

import java.net.MalformedURLException;

public class AndroidFindElements {
    public static void main(String[] args) throws MalformedURLException {
        AppiumDriver driver = CreateDriverSession.initializeDriver();

        MobileElement element= (MobileElement) driver.findElementByAccessibilityId("Accessibility");
        System.out.println(element.getText());

        MobileElement element2= (MobileElement) driver.findElementById("android:id/text1");
        System.out.println(element2.getText());

        MobileElement element3= (MobileElement) driver.findElementByXPath("//android.widget.TextView[@content-desc=\"Accessibility\"]");
        System.out.println(element3.getText());

        MobileElement element4= (MobileElement) ((FindsByAndroidUIAutomator)driver).findElementByAndroidUIAutomator("new UISelector().text(\"Accesibility\")");
        System.out.println(element4.getText());
    }
}
