import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class OverturnTest {

    @Test
    public void shouldRevers(){
    Overturn rev = new Overturn();
        String actual = "george";
        Assertions.assertEquals("egroeg", rev);
    }

}