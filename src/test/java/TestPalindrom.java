import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class TestPalindrom {

    @Test
    public void TestPalidromeTrue(){
        Palindrom palindrom = new Palindrom();
        assertTrue( palindrom.isStringPalindrome("madam"));
    }

    @Test
    public void TestPalidromeFalse(){
        Palindrom palindrom = new Palindrom();
        assertFalse( palindrom.isStringPalindrome("madamy"));
    }
    
}
