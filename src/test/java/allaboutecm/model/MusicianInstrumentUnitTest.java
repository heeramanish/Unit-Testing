package allaboutecm.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class MusicianInstrumentUnitTest {

    private Musician musician;
    private MusicalInstrument musicalInstrument;
    private MusicianInstrument musicianInstrument;

    @BeforeEach
    void setUp() {
        musician = new Musician("Neil");
        musicalInstrument = new MusicalInstrument("Guitar");
        musicianInstrument = new MusicianInstrument(musician, musicalInstrument);
    }

    @DisplayName("Musician Should Not Be Null")
    @Test
    public void musicianShouldNotBeNull (){
        NullPointerException exception = assertThrows(NullPointerException.class, () -> musicianInstrument.setMusician(null));
        assertEquals("Musician Cannot Be Null", exception.getMessage());
    }
}
