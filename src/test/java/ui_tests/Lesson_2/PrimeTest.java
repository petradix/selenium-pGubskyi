package ui_tests.Lesson_2;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by petr
 * Date: 13.07.2015
 * Time: 21:17.
 */
public class PrimeTest
{
    @Test
    public void isPrimeNumberTest(){
        int num1 = 7;

        Assert.assertTrue(isPrime(num1));
    }

    public boolean isPrime(int a) {
      int j = 2;
      if (a % j == 0) {
                    return false;
                }
       else {
          return true;
      }

    }
}
