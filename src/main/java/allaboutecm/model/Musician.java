package allaboutecm.model;

import com.google.common.collect.Sets;

import java.net.URL;
import java.util.Objects;
import java.util.Set;

import static org.apache.commons.lang3.Validate.*;

/**
 * An artist that has been featured in (at least) one ECM record.
 *
 * See {@https://www.ecmrecords.com/artists/1435045745}
 */
public class Musician extends Entity {

    private String name;
    private URL musicianUrl;
    private URL musicianWebsite;
    private Set<Album> albums;

    /*
     * Parameterised Constructor for Musician Class
     *
     * @param name
     *
     */
    public Musician(String name) {
        notNull(name);
        this.name = name;
        this.musicianUrl = null;
        albums = Sets.newLinkedHashSet();
    }

    /*
     * Accessor Method for name
     *
     * @return name
     */
    public String getName()
    {
        return name;
    }

    /*
     * Accessor Method for musicianWebsite
     *
     * @return musicianWebsite
     */
    public URL getMusicianWebsite() {
        return musicianWebsite;
    }

    /*
     * Mutator Method for musicianWebsite
     *
     * @param musicianWebsite
     */
    public void setMusicianWebsite(URL musicianWebsite) {
        notNull(musicianWebsite);
        this.musicianWebsite = musicianWebsite;
    }

    /*
     * Mutator Method for name
     *
     * @param name
     */
    public void setName(String name)
    {
        notNull(name);
        notBlank(name);
        this.name = name;
    }

    /*
     * Accessor Method for albums
     *
     * @return albums
     */
    public Set<Album> getAlbums() {
        return albums;
    }

    /*
     * Mutator Method for albums
     *
     * @param albums
     */
    public void setAlbums(Set<Album> albums) throws Exception
    {
        notEmpty(albums);
        this.albums = albums;
    }

    /*
     * Method for checking if the Musician exists
     *
     * @return boolean
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Musician that = (Musician) o;
        return Objects.equals(name, that.name);
    }

    /*
     * Method for hashCode
     *
     * @return hash
     */
    @Override
    public int hashCode()
    {
        return Objects.hash(name);
    }

    /*
     * Accessor Method for musicianUrl
     *
     * @return musicianUrl
     */
    public URL getMusicianUrl()
    {
        return musicianUrl;
    }

    /*
     * Mutator Method for musicianUrl
     *
     * @param musicianUrl
     */
    public void setMusicianUrl(URL musicianUrl)
    {
        notNull(musicianUrl);
        this.musicianUrl = musicianUrl;
    }
}
