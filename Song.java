public class Song {
    

    public String title;
    public String artist;



    public String getTitle()
    {
        return title;
    }

    public String getArtist()
    {
        return artist;
    }

    public Song(String title, String artist)
    {

        this.title = title;
        this.artist = artist;

    }

    public Song(String title)
    {

        this.title = title;
        this.artist = "Unknown Artist";

    }

    @Override
    public String toString()
    {
        return title + (artist != null ? " - " + artist : "");
    }







}
