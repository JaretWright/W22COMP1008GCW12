package com.example.w22comp1008w12prep;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    private Person person;

    @BeforeEach
    void setUp() {
        person = new Person("Fred","Flintstone","55 HappyVale Dr", LocalDate.now().minusYears(55));
    }

    @Test
    void setFirstName() {
        person.setFirstName("Frank");
        assertEquals("Frank", person.getFirstName());
    }

    @Test
    void setFirstNameMaxCharacters() {
        person.setFirstName("   ABCDEFGHIJKLMNOPQRST   ");
        assertEquals("ABCDEFGHIJKLMNOPQRST", person.getFirstName());
    }

    @Test
    void setFirstNameMinCharacters() {
        person.setFirstName("   Xi   ");
        assertEquals("Xi", person.getFirstName());
    }


    //first name should be 2-20 characters
    @Test
    void setFirstNameShort(){
        Assertions.assertThrows(IllegalArgumentException.class, ()-> {
            person.setFirstName("A");
        });
    }

    @Test
    void setFirstNameShortWithSpaces(){
        Assertions.assertThrows(IllegalArgumentException.class, ()-> {
            person.setFirstName("   A   ");
        });
    }

    @Test
    void setFirstNameLong(){
        Assertions.assertThrows(IllegalArgumentException.class, ()-> {
            person.setFirstName("ABCDEFGHIJKLMNOPQRSTU");
        });
    }




    @Test
    void setLastName() {
    }

    @Test
    void setAddress() {
    }

    @Test
    void setBirthday() {
    }

    @Test
    void getAge() {
    }

    @Test
    void testToString() {
    }
}