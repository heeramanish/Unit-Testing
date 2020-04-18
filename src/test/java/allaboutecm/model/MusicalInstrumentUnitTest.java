package allaboutecm.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class MusicalInstrumentUnitTest {

    private MusicalInstrument musicalInstrument;

    @BeforeEach
    void setUp() {
        musicalInstrument = new MusicalInstrument("Guitar");
    }

    @DisplayName("Musical Instrument Should Not Be Null")
    @Test
    public void musicalInstrumentShouldNotBeNull (){
        NullPointerException exception = assertThrows(NullPointerException.class, () -> musicalInstrument.setName(null));
        assertEquals("Musical Instrument Cannot Be Null", exception.getMessage());
    }
}
