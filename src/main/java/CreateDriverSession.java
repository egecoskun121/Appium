import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class CreateDriverSession {
    public static AppiumDriver initializeDriver() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName","Android");
        caps.setCapability(MobileCapabilityType.DEVICE_NAME,"Pixel 4");
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
        caps.setCapability(MobileCapabilityType.UDID,"emulator-5554");
        String appURL=System.getProperty("user.dir")+ File.separator+"src"+File.separator+"main"+
                File.separator+"resources"+File.separator+"ApiDemos-debug.apk";
        caps.setCapability(MobileCapabilityType.APP,appURL);
        caps.setCapability("newCommandTimeout",300);


        URL url = new URL("http://0.0.0.0:4723/wd/hub");

        AppiumDriver driver = new AndroidDriver(url,caps);
        System.out.println("session id:"+driver.getSessionId());


        return driver;
    }
}
