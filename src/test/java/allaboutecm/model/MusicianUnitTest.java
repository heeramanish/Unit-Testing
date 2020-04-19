package allaboutecm.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.net.URL;

import static org.junit.jupiter.api.Assertions.*;

class MusicianUnitTest {


    private Musician musician;

    @BeforeEach
    public void setUp() {
        try {
            musician = new Musician("Jim Morrison");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Test
    @DisplayName("Musician name cannot be null")
    public void musicianNameCannotBeNull() {
        assertThrows(NullPointerException.class, () -> musician.setName(null));
    }

    @Test
    @ParameterizedTest
    @ValueSource(strings = {"", " ", "    \t"})
    @DisplayName("Musician name cannot be empty or blank")
    public void musicianNameCannotBeEmptyOrBlank(String argm) {
        assertThrows(IllegalArgumentException.class, () -> musician.setName(argm));
    }

    @Test
    @DisplayName("MusicianURL cannot be null")
    public void MusicianUrlCannotBeNull() {
        Assertions.assertThrows(NullPointerException.class, () -> {
            this.musician.setMusicianUrl((URL) null);
        });
    }

}