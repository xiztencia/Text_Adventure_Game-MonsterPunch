package test;

import main.Gender;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GenderTest {

    @Test
    void TestGenderEnums() {
        Assertions.assertEquals("MALE", Gender.MALE.toString());
        assertEquals("FEMALE", Gender.FEMALE.toString());
    }
}