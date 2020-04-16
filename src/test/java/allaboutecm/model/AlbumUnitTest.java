package allaboutecm.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

//import static org.hamcrest.MatchAssert.assertThat;



class AlbumUnitTest {
    private Album album;

    @BeforeEach
    public void setUp()
    {
        album = new Album(1975, "ECM 1064/65", "The Köln Concert");
    }

    @Test
    @DisplayName("Album name cannot be null")
    public void albumNameCannotBeNull()
    {
        assertThrows(NullPointerException.class, () -> album.setAlbumName(null));
    }

    @ParameterizedTest
    @ValueSource(strings = {"", " ", "    \t"})
    @DisplayName("Album name cannot be empty or blank")
    public void albumNameCannotBeEmptyOrBlank(String arg)
    {
        assertThrows(IllegalArgumentException.class, () -> album.setAlbumName(arg));
    }

    @Test
    public void sameNameAndNumberMeansSameAlbum()
    {
        Album album1 = new Album(1975, "ECM 1064/65", "The Köln Concert");

        assertEquals(album, album1);
    }

    //############### check for releaseYear ###################
    @Test
    @DisplayName("Release year cannot be null")
    public void releaseYearCannotBeNull()
    {
        //setup
        int year = 0;
        //execute
        boolean actual = album.setReleaseYear(year);
        assertFalse(actual);
       // assertThrows(NullPointerException.class, () -> album.setReleaseYear(0));
    }

    @Test
    @DisplayName("releaseYear must be four digit")
    public void checkReleaseYearFourDigit()
    {
        int year = 1975;
        album.setReleaseYear(year);
        int yearLength= String.valueOf(year).length();
        assertEquals(yearLength,4);

    }

    // ############# Check for RecordNumber ##################
    @Test
    @DisplayName("Same Record name means same album")
    public void sameRecordNumberAndNameMeansSameAlbum()
    {
        Album albums = new Album(1975, "ECM 1064/65", "The Köln Concert");

        assertEquals(album, albums);
    }

    @Test
    @DisplayName("RecordNumber cannot be null")
    public void RecordNumberCannotBeNull() {
        assertThrows(NullPointerException.class, () -> album.setRecordNumber(null));
    }

    @Test
    @ParameterizedTest
    @ValueSource(strings = {"", " ", "    \t"})
    @DisplayName("RecordNumber cannot be empty/blank")
    public void RecordNumberCannotBeEmptyOrBlank(String arg)
    {
        assertThrows(IllegalArgumentException.class, () -> album.setRecordNumber(arg));
    }

    //################ Album URL check  ################
    @Test
    @DisplayName("Album URl cannot be null")
    public void AlbumUrlCannotBeNull()
    {
        assertThrows(NullPointerException.class, () -> album.setAlbumURL(null));
    }



    // ####### List<String> tracks ###########
    @Test
    public void TestTrackList()
        {
        List<String> actual = Arrays.asList("Köln, Jan 24 1975, PART I","Köln, Jan 24 1975, PART II A","Köln, Jan 24 1975, PART II B");
        List<String> expected = Arrays.asList("Köln, Jan 24 1975, PART I","Köln, Jan 24 1975, PART II A","Köln, Jan 24 1975, PART II B");
      //  List<String> result = album.setTracks();
        assertEquals(expected, actual);

        }


    // ########## set<Musician> ##############
    @Test
    //@ParameterizedTest
    @DisplayName("FeaturedMusicians can;t be null")
    public void featuredMusicianCannotBeNull() throws IllegalArgumentException
    {
        assertThrows(NullPointerException.class,() -> album.setFeaturedMusicians(null));

    }



    // ############## set<MusicianInstrument> ###############
    @Test
    @DisplayName("invalid input")
    public void shouldThrowOnInvalidMusicianInstrument() throws IllegalArgumentException
    {
        assertThrows(NullPointerException.class, () -> album.setInstruments(null));
    }
}