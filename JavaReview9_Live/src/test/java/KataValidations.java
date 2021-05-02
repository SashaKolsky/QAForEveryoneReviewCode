import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KataValidations {

    @Test
    public void createPhoneNumberTest() {

        System.out.println(PhoneNumberFromArray.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
        assertEquals("(123) 456-7890", PhoneNumberFromArray.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }

    @Test
    public void createPhoneNumberTestRegEx() {
        assertEquals("(123) 456-7890", PhoneNumberFromArray.createPhoneNumberRegEx(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }

    @Test
    public void minValueTest() {
        assertEquals(13, FormTheMinimum.minValue(new int[] {1,3,1}));
        assertEquals(457, FormTheMinimum.minValue(new int[] {4, 7, 5, 7}));
        assertEquals(148, FormTheMinimum.minValue(new int[] {4, 8, 1, 4}));
        assertEquals(579, FormTheMinimum.minValue(new int[] {5, 7, 9, 5, 7}));
        assertEquals(678, FormTheMinimum.minValue(new int[] {6, 7, 8, 7, 6, 6}));
    }

}
