import org.junit.jupiter.api.Test;
import ua.lviv.iot.lab7.TextManipulator;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TextManipulatorTest {

    @Test
    public void testRemovingWordsOnConsonantBadArgsCase() {
        TextManipulator textManipulator = new TextManipulator();
        String text = "abcd bcde Bcde ACDC vdfdgergwef abc cbd isnt isn't dont don't ggwp gg-wp";
        String result = textManipulator.removeWordsOnConsonant(text, -3);
        assertEquals(result, text);
        result = textManipulator.removeWordsOnConsonant(text, 0);
        assertEquals(result, text);
    }

    @Test
    public void testRemovingWordsOnConsonantRegularCase() {
        TextManipulator textManipulator = new TextManipulator();
        String text = "a b A B ab ba AB BA abcd bcde Bcde ACDC vdfdgergwef abc cbd";
        String result = textManipulator.removeWordsOnConsonant(text, 1);
        assertEquals("a  A  ab ba AB BA abcd bcde Bcde ACDC vdfdgergwef abc cbd", result);
        result = textManipulator.removeWordsOnConsonant(text, 2);
        assertEquals("a b A B ab  AB  abcd bcde Bcde ACDC vdfdgergwef abc cbd", result);
        result = textManipulator.removeWordsOnConsonant(text, 3);
        assertEquals("a b A B ab ba AB BA abcd bcde Bcde ACDC vdfdgergwef abc ", result);
        result = textManipulator.removeWordsOnConsonant(text, 4);
        assertEquals("a b A B ab ba AB BA abcd   ACDC vdfdgergwef abc cbd", result);

    }

}
