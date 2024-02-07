package testNg;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestPassFail
{
    @Test(priority=1)
    
    public void sample()
    {
    	Reporter.log("Hello vaibhav",true);
    	Assert.assertTrue(true);               //Assert.assertTrue- green color
    }
    @Test(priority=2)
    public void sample1()
    {
    	Reporter.log("Good Morning",true);
    	Assert.fail();                        //Assert fail- red color
    }
 }
