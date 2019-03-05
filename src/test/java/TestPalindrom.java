import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class TestPalindrom {

    @Test
    public void TestPalidrome(){
        Palindrom palindrom = new Palindrom();
        assertTrue( palindrom.isStringPalindrome("madam"));

    }


}
