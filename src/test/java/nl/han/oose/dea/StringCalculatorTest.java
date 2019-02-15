package nl.han.oose.dea;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StringCalculatorTest {
    StringCalculator adder;
    @BeforeEach
    void setup(){
        adder = new StringCalculator();
    }
    @Test
    public void returnsNumberIsZero(){
        // Arrange

        // Act
        var addedNumber = adder.add("");

        // Assert
        Assertions.assertEquals(0,addedNumber);
    }

    @Test
    public void returnsNumberIsEqualToStringNumber(){
        // Arrange

        // Act
        var addedNumber = adder.add("230");

        // Assert
        Assertions.assertEquals(230,addedNumber);
    }

    @Test
    public void returnsNumberIsSumOfString(){
        //Arrange

        //Act
        var addedNumber = adder.add("1,8,9,2");
        //Assert
        Assertions.assertEquals(20,addedNumber);
    }

    @Test
    public void returnsNumberIsSumOfStringWithNewLineDelimiter(){
        //Arange

        //Act
        var addedNumber = adder.add("1,2,3\n4");

        //Assert
        Assertions.assertEquals(10,addedNumber);
    }

}
