import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertString {

    private String Str1 = "Привет пример на java";
    private String Str2 = Str1;
    private String Str3 = new String("Пока пример на java");
    private String Str4 = new String("Привет пример на java");
    private boolean retVal;

    @Test
    public void assertStringTest_1(){
        retVal = Str1 == Str2;
        System.out.println("Строка Str1 равна строке Str2? Ответ: " + retVal ); //true
        Assert.assertTrue(retVal);
    }

    @Test
    public void assertStringTest_2() {
        retVal = Str1.equals(Str2);
        System.out.println("Строка Str1 равна строке Str2? Ответ: " + retVal ); //true
        Assert.assertTrue(retVal);
    }

    @Test
    public void assertStringTest_3() {
        retVal = Str1 == Str3;
        System.out.println("Строка Str1 равна строке Str3? Ответ: " + retVal ); //false
        Assert.assertFalse(retVal);
    }

    @Test
    public void assertStringTest_4() {
        retVal = Str1.equals(Str3);
        System.out.println("Строка Str1 равна строке Str3? Ответ: " + retVal ); //false
        Assert.assertFalse(retVal);
    }

    @Test
    public void assertStringTest_5() {
        retVal = Str1 == Str4;
        System.out.println("Строка Str1 равна строке Str4? Ответ: " + retVal ); //false
        Assert.assertFalse(retVal);
    }

    @Test
    public void assertStringTest_6() {
        retVal = Str1.equals(Str4);
        System.out.println("Строка Str1 равна строке Str4? Ответ: " + retVal ); //true
        Assert.assertTrue(retVal);
    }
}
