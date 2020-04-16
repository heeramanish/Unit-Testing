package allaboutecm.model;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Set;

import static org.apache.commons.lang3.Validate.*;

/**
 * Represents an album released by ECM records.
 *
 * See {@https://www.ecmrecords.com/catalogue/143038750696/the-koln-concert-keith-jarrett}
 */
public class Album extends Entity {

    private int releaseYear;

    private String recordNumber;

    private String albumName;

    private Set<Musician> featuredMusicians;

    private Set<MusicianInstrument> instruments;

    private URL albumURL;

    private List<String> tracks;

    public Album(int releaseYear, String recordNumber, String albumName)
    {
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

    public String getRecordNumber() {
        return recordNumber;
    }

    public void setRecordNumber(String recordNumber)
    {
        notNull(recordNumber);
        notBlank(recordNumber);

        this.recordNumber = recordNumber;
    }

    public Set<Musician> getFeaturedMusicians()
    {
        return featuredMusicians;
    }

    public void setFeaturedMusicians(Set<Musician> featuredMusicians) throws Exception
    {
        notEmpty(featuredMusicians);
        this.featuredMusicians = featuredMusicians;
    }

    public Set<MusicianInstrument> getInstruments()
    {
        return instruments;
    }

    public void setInstruments(Set<MusicianInstrument> instruments) throws Exception
    {
        notEmpty(instruments);
        this.instruments = instruments;
    }

    public URL getAlbumURL() {
        return albumURL;
    }

    public void setAlbumURL(URL albumURL)
    {
       // notBlank(albumURL);
        notNull(albumURL);
        this.albumURL = albumURL;
    }

    public List<String> getTracks()
    {
        return tracks;
    }

    public void setTracks(List<String> tracks)
    {
      //  List<String> actual = Arrays.asList("Köln, Jan 24 1975, PART I","Köln, Jan 24 1975, PART II A","Köln, Jan 24 1975, PART II B";

        noNullElements(tracks);
        notEmpty(tracks);
        this.tracks = tracks;
    }

    public int getReleaseYear()
    {
        return releaseYear;
    }

    public boolean setReleaseYear(int releaseYear)
    {
        notNull(releaseYear);
        this.releaseYear = releaseYear;
        return false;

    }

    public String getAlbumName()
    {

        return albumName;
    }

    public void setAlbumName(String albumName)
    {
        notNull(albumName);
        notBlank(albumName);

        this.albumName = albumName;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Album album = (Album) o;
        return releaseYear == album.releaseYear &&
                recordNumber.equals(album.recordNumber) &&
                albumName.equals(album.albumName);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(releaseYear, recordNumber, albumName);
    }
}