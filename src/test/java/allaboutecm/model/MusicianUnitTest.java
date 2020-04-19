package allaboutecm.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.*;

class MusicianUnitTest {
    private static final String URL_REGEX =
            "^((((https?|ftps?|gopher|telnet|nntp)://)|(mailto:|news:))" +
                    "(%[0-9A-Fa-f]{2}|[-()_.!~*';/?:@&=+$,A-Za-z0-9])+)" +
                    "([).!';/?:,][[:blank:]])?$";

    private static final Pattern URL_PATTERN = Pattern.compile(URL_REGEX);
    private String url;
    private Musician musician;

    @BeforeEach
    public void setUp() {
        try {
            musician = new Musician("Jim Morrison");
            url = "https://www.google.com.au";
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    @Test
    @DisplayName("Musician name should contain both the first and last names")
    public void musicianNameShouldContainBothTheFirstAndLastNames() {
        assertTrue(musician.getName().contains(" "));
    }


    @Test
    @DisplayName("Musician name cannot be null")
    public void musicianNameCannotBeNull() {
        assertThrows(NullPointerException.class, () -> musician.setName(null));
    }

    @Test
    @DisplayName("URL should be valid")
    public void urlShouldBeValid() throws IllegalArgumentException {
        url = "https://www.google.com.au";
        assertTrue(urlValidator(url));
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

    @Test
    @DisplayName("MusicianWebsiteURL cannot be null")
    public void MusicianWebsiteUrlCannotBeNull() {
        Assertions.assertThrows(NullPointerException.class, () -> {
            this.musician.setMusicianWebsite((URL) null);
        });
    }

    // method to validate the url
    public static boolean urlValidator(String url) {

        if (url == null) {
            return false;
        }
        Matcher matcher = URL_PATTERN.matcher(url);
        return matcher.matches();
    }
}