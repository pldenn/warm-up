import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class OverturnTest {

    @Test

    public void shouldRevers(){
    Main rev = new Main();
        String actual = "george";
        Assertions.assertEquals("egroeg", rev.reverseString(actual));
    }

}