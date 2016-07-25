package org.fundacionjala.katas;

        import org.junit.Test;

        import static org.junit.Assert.assertEquals;

/**
 * Created by danielgonzales on 7/25/2016.
 */
public class KatasTest {

    private EANValidator eanValidator = new EANValidator ();

    @Test
    public void test_01 () {
        assertEquals (true, eanValidator.validate ("9783815820865"));
    }

    @Test
    public void test_02 () {
        assertEquals (false, eanValidator.validate ("9783815820864"));
    }

    @Test
    public void test_03 () {
        assertEquals (true, eanValidator.validate ("9783827317100"));
    }

    @Test
    public void test_04 () {
        assertEquals (true, eanValidator.validate ("4003301018398"));
    }

}
