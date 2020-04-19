package allaboutecm.model;

import java.util.Objects;

import static org.apache.commons.lang3.Validate.notNull;

/**
 * This class encapsulates the relationship of a musical instrument played by a musician in a given album.
 * <p>
 * For example, in ECM 1064/65, MusicianInstrument denotes the instrument Piano being played by
 * the musician Keith Jarrett in this album.
 * See {@https://www.ecmrecords.com/catalogue/143038750696/the-koln-concert-keith-jarrett}
 */
public class MusicianInstrument extends Entity {
    private Musician musician;
    private MusicalInstrument musicalInstrument;

    /*
     * Parameterised Constructor for Musician Class
     *
     * @param musician
     * @param musicalInstrument
     *
     */
    public MusicianInstrument(Musician musician, MusicalInstrument musicalInstrument) {
        notNull(musician);
        notNull(musicalInstrument);

        this.musician = musician;
        this.musicalInstrument = musicalInstrument;
    }

    /*
     * Accessor Method for musician
     *
     * @return musician
     */
    public Musician getMusician() {
        return musician;
    }

    /*
     * Mutator Method for musician
     *
     * @param musician
     */
    public void setMusician(Musician musician) {
        // Checking musician is not Null
        notNull(musician, "Musician Cannot Be Null");
        this.musician = musician;
    }

    /*
     * Accessor Method for musicalInstrument
     *
     * @return musicalInstrument
     */
    public MusicalInstrument getMusicalInstrument() {
        return musicalInstrument;
    }

    /*
     * Mutator Method for musicalInstrument
     *
     * @param musicalInstrument
     */
    public void setMusicalInstrument(MusicalInstrument musicalInstrument) {
        // Checking MusicalInstrument is not Null
        notNull(musicalInstrument, "MusicalInstrument Cannot Be Null");
        this.musicalInstrument = musicalInstrument;
    }

    /*
     * Method for checking if the MusicianInstrument exists
     *
     * @return boolean
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MusicianInstrument that = (MusicianInstrument) o;
        return musician.equals(that.musician) &&
                musicalInstrument.equals(that.musicalInstrument);
    }

    /*
     * Method for hashCode
     *
     * @return hash
     */
    @Override
    public int hashCode() {
        return Objects.hash(musician, musicalInstrument);
    }
}
