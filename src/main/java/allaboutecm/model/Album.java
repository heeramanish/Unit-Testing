package allaboutecm.model;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

import java.net.URL;
import java.util.List;
import java.util.Objects;
import java.util.Set;

import static org.apache.commons.lang3.Validate.*;

/**
 * Represents an album released by ECM records.
 * <p>
 * See {@https://www.ecmrecords.com/catalogue/143038750696/the-koln-concert-keith-jarrett}
 */
public class Album extends Entity {

    private int releaseYear;

    private String recordNumber;
    private String albumName;
    private Set<Musician> featuredMusicians;
    private Set<MusicianInstrument> instruments;
    private URL albumURL;
    private List<Track> tracks;

    private String albumGenre;
    private String albumStyle;
    private String albumReleaseFormat;
    private String albumReview;
    private Double albumRating;

    /*
     * Parameterised Constructor for Album Class
     *
     * @param releaseYear
     * @param recordNumber
     * @param albumName
     *
     */
    public Album(int releaseYear, String recordNumber, String albumName) {
        notNull(recordNumber);
        notNull(albumName);

        notBlank(recordNumber);
        notBlank(albumName);

        this.releaseYear = releaseYear;
        this.recordNumber = recordNumber;
        this.albumName = albumName;

        this.albumURL = null;

        featuredMusicians = Sets.newHashSet();
        instruments = Sets.newHashSet();
        tracks = Lists.newArrayList();
    }

    /*
     * Accessor Method for recordNumber
     *
     * @return recordNumber
     */
    public String getRecordNumber() {
        return recordNumber;
    }

    /*
     * Mutator Method for recordNumber
     *
     * @param recordNumber
     */
    public void setRecordNumber(String recordNumber) {
        notNull(recordNumber);
        notBlank(recordNumber);

        this.recordNumber = recordNumber;
    }

    /*
     * Accessor Method for featuredMusicians
     *
     * @return featuredMusicians
     */
    public Set<Musician> getFeaturedMusicians() {
        return featuredMusicians;
    }

    /*
     * Mutator Method for featuredMusicians
     *
     * @param featuredMusicians
     */
    public void setFeaturedMusicians(Set<Musician> featuredMusicians) throws Exception {
        notEmpty(featuredMusicians);
        this.featuredMusicians = featuredMusicians;
    }

    /*
     * Accessor Method for instruments
     *
     * @return instruments
     */
    public Set<MusicianInstrument> getInstruments() {
        return instruments;
    }

    /*
     * Mutator Method for instruments
     *
     * @param instruments
     */
    public void setInstruments(Set<MusicianInstrument> instruments) throws Exception {
        notEmpty(instruments);
        this.instruments = instruments;
    }

    /*
     * Accessor Method for albumURL
     *
     * @return albumURL
     */
    public URL getAlbumURL() {
        return albumURL;
    }

    /*
     * Mutator Method for albumURL
     *
     * @param albumURL
     */
    public void setAlbumURL(URL albumURL) {
        notNull(albumURL);
        this.albumURL = albumURL;
    }

    /*
     * Accessor Method for tracks
     *
     * @return tracks
     */
    public List<Track> getTracks() {
        return tracks;
    }

    /*
     * Mutator Method for tracks
     *
     * @param tracks
     */
    public void setTracks(List<Track> tracks) {
        noNullElements(tracks);
        notEmpty(tracks);
        this.tracks = tracks;
    }

    /*
     * Accessor Method for releaseYear
     *
     * @return releaseYear
     */
    public int getReleaseYear() {
        return releaseYear;
    }

    /*
     * Mutator Method for releaseYear
     *
     * @param releaseYear
     */
    public boolean setReleaseYear(int releaseYear) {
        notNull(releaseYear);
        this.releaseYear = releaseYear;
        return false;
    }

    /*
     * Accessor Method for albumName
     *
     * @return albumName
     */
    public String getAlbumName() {
        return albumName;
    }

    /*
     * Mutator Method for albumName
     *
     * @param albumName
     */
    public void setAlbumName(String albumName) {
        notNull(albumName);
        notBlank(albumName);

        this.albumName = albumName;
    }

    /*
     * Method for checking if the album exists
     *
     * @return boolean
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Album album = (Album) o;
        return releaseYear == album.releaseYear &&
                recordNumber.equals(album.recordNumber) &&
                albumName.equals(album.albumName);
    }

    /*
     * Accessor Method for albumGenre
     *
     * @return albumGenre
     */
    public String getAlbumGenre() {
        return albumGenre;
    }

    /*
     * Mutator Method for albumGenre
     *
     * @param albumGenre
     */
    public void setAlbumGenre(String albumGenre) {
        notNull(albumGenre);
        this.albumGenre = albumGenre;
    }

    /*
     * Accessor Method for albumStyle
     *
     * @return albumStyle
     */
    public String getAlbumStyle() {
        return albumStyle;
    }

    /*
     * Mutator Method for albumStyle
     *
     * @param albumStyle
     */
    public void setAlbumStyle(String albumStyle) {
        notNull(albumStyle);
        this.albumStyle = albumStyle;
    }

    /*
     * Accessor Method for albumReleaseFormat
     *
     * @return albumReleaseFormat
     */
    public String getAlbumReleaseFormat() {
        return albumReleaseFormat;
    }

    /*
     * Mutator Method for albumReleaseFormat
     *
     * @param albumReleaseFormat
     */
    public void setAlbumReleaseFormat(String albumReleaseFormat) {
        notNull(albumReleaseFormat);
        this.albumReleaseFormat = albumReleaseFormat;
    }

    /*
     * Accessor Method for albumReview
     *
     * @return albumReview
     */
    public String getAlbumReview() {
        return albumReview;
    }

    /*
     * Mutator Method for albumReview
     *
     * @param albumReview
     */
    public void setAlbumReview(String albumReview) {
        notNull(albumReview);
        this.albumReview = albumReview;
    }

    /*
     * Accessor Method for albumRating
     *
     * @return albumRating
     */
    public Double getAlbumRating() {
        return albumRating;
    }

    /*
     * Mutator Method for albumRating
     *
     * @param albumRating
     */
    public void setAlbumRating(Double albumRating) {
        notNull(albumRating);
        this.albumRating = albumRating;
    }

    /*
     * Method for hashCode
     *
     * @return hash
     */
    @Override
    public int hashCode() {
        return Objects.hash(releaseYear, recordNumber, albumName);
    }
}
