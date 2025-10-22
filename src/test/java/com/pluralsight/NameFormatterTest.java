package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NameFormatterTest {
    @Test
    public void format_FirstAndLastNames_ProperFormat(){
        //Arrange
        String input = "Arsenii Kunilovskii";
        //Act
        input = NameFormatter.format(input);
        //Assert
        assertEquals("Kunilovskii Arsenii", input);
    }
    @Test
    public void format_FullName_ProperFormat(){
        //Arrange
        String input = "Mr. Arsenii A. Kunilovskii, I";
        //Act
        input = NameFormatter.format(input);
        //Assert
        assertEquals("Kunilovskii, Mr. Arsenii A., I", input);
    }
    @Test
    public void format_AllValues_ProperFormat(){
        //Arrange
        String firstName = "Arsenii";
        String lastName = "Kunilovskii";
        String prefix = "Mr.";
        String middleName = "A.";
        String suffix = "I";
        //Act
        String output = NameFormatter.format(prefix,firstName,middleName,lastName,suffix);
        //Assert
        assertEquals("Kunilovskii, Mr. Arsenii A., I", output);
    }

}