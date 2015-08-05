package ui_tests;


import com.sun.xml.internal.bind.v2.runtime.unmarshaller.LeafPropertyLoader;
import core.BrowserTypes;
import utils.PropertyLoader;

public class TestData {

   public static final BrowserTypes BROWSER_NAME = BrowserTypes.valueOf(PropertyLoader.loadProoerty("browser.name"));

}
