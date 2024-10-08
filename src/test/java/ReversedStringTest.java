import org.junit.Assert;
import org.junit.Test;

public class ReversedStringTest {


        @Test
        public void reverseTestWithNull(){
            Assert.assertNull(ReverseString.reverseString(null));
            System.out.println("passed");
        }

        @Test
        public void reverseTestWithDigits(){
            Assert.assertEquals("random", ReverseString.reverseString("123abc"));
            System.out.println("passed");
        }

        @Test
        public void reverseTestHappyPath(){
            Assert.assertEquals("elppa", ReverseString.reverseString("apple"));
            System.out.println("passed");
            System.out.println("Added new version");
            System.out.println("Yeeahoo");
        }

    }





