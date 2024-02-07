package testNg;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNgDemo
{
		@BeforeSuite
		public void bs() {
			Reporter.log("Connection to DB",true);
		}
		@BeforeClass
		public void bc() {
			Reporter.log("Launch the Browser",true);
		}
		@BeforeMethod
		public void bm() {
			Reporter.log("Login To app",true);
		}
		@AfterMethod
		public void am() {
			Reporter.log("Logout From app",true);
		}
		@AfterClass
		public void ac() {
			Reporter.log("Close the Browser",true);
		}
		@AfterSuite
		public void as() {
			Reporter.log("DB disconnection",true);
		}
	   @Test
	    public void TC() {
		Reporter.log("Hello Vaibahv",true);
	}	
}