package ru_aston_Gerasimovich_DS.task1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import ru_aston_Gerasimovich_DS.task1.User;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest {

    private final User user = new User(
            25,
            "Дима",
            "Герасимович",
            true,
            false
    );

    @Test
    void constructorInitialization() {
        assertEquals(25, user.getAge());
        assertEquals("Иван", user.getName());
        assertEquals("Иванов", user.getSurname());
        assertTrue(user.isTwoYearsOfDrivingCar());
        assertFalse(user.isTwentyYearsOfDrivingCar());
    }

    @Test
    void validAgeSetterGetter() {
        user.setAge(30);
        assertEquals(30, user.getAge());
    }

    @ParameterizedTest
    @ValueSource(ints = {-10, 200})
    void setInvalidAgeShouldThrowException(int invalidAge) {
        assertThrows(IllegalArgumentException.class,
                () -> user.setAge(invalidAge),
                "Должно выбрасываться исключение для возраста: " + invalidAge);
    }

    @Test
    void setInvalidNameShouldThrowException() {
        assertAll(
                () -> assertThrows(IllegalArgumentException.class,
                        () -> user.setName(null),
                        "Null имя должно вызывать исключение"),

                () -> assertThrows(IllegalArgumentException.class,
                        () -> user.setName("   "),
                        "Пустое имя должно вызывать исключение")
        );
    }


    @Test
    void equalsAndHashCode() {
        User sameUser = new User(25, "Иван", "Иванов", true, false);
        User differentUser = new User(30, "Петр", "Петров", false, true);

        assertAll(
                () -> assertEquals(user, sameUser),
                () -> assertNotEquals(user, differentUser),
                () -> assertEquals(user.hashCode(), sameUser.hashCode())
        );
    }

    @Test
    void invalidConstructorParameters() {
        assertAll(
                () -> assertThrows(IllegalArgumentException.class,
                        () -> new User(-5, "Иван", "Иванов", true, false)),

                () -> assertThrows(IllegalArgumentException.class,
                        () -> new User(25, null, "Иванов", true, false)),

                () -> assertThrows(IllegalArgumentException.class,
                        () -> new User(25, "  ", "Иванов", true, false)),

                () -> assertThrows(IllegalArgumentException.class,
                        () -> new User(25, "Иван", "", true, false))
        );
    }

    @Test
    void trimNameAndSurname() {
        User userWithSpaces = new User(30, "  Анна  ", "  Петрова  ", false, true);
        assertEquals("Анна", userWithSpaces.getName());
        assertEquals("Петрова", userWithSpaces.getSurname());
    }
}

