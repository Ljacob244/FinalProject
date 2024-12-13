import java.io.*;

public class SongList {
    public Song[] songs; 

    
    
    public SongList(String filename)
    {
        loadFromFile(filename);
    }

    
    public SongList()
    {
        this.songs = songList();
    }


    public void saveList(String fileName) {
        try (FileWriter writer = new FileWriter(fileName)) {
            if (songs == null || songs.length == 0) {
                System.out.println("No songs available to save.");
                return;
            }
            for (Song song : songs) {
                writer.write(song.getTitle() + "," + song.getArtist() + "\n");
            }
            System.out.println("Songs saved to file: " + fileName);
        } catch (IOException error) {
            System.out.println("Error saving to file: " + error.getMessage());
        }
    }

    
    public void loadFromFile(String fileName) {
        try {
            
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            int lineCount = 0;

            
            while ((line = reader.readLine()) != null) {
                lineCount++;
            }
            reader.close();

            
            songs = new Song[lineCount];
            reader = new BufferedReader(new FileReader(fileName));
            int index = 0;

            
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",", 2);
                if (parts.length == 2) {
                    songs[index++] = new Song(parts[0], parts[1]);
                }
            }
            reader.close();
            System.out.println("Songs loaded from file: " + fileName);
        } catch (IOException error) {
            System.out.println("Error loading from file: " + error.getMessage());
        }
    }


    public void printSongs() {
        if (songs == null || songs.length == 0) {
            System.out.println("No songs to display.");
            return;
        }
        for (Song song : songs) {
            System.out.println(song);
        }
    }

    public void printSongList(String songsFile)
    {
        try(BufferedReader reader = new BufferedReader(new FileReader(songsFile)))
        {
            String line;
            System.out.println("Song list :  ");
            while((line = reader.readLine()) != null)
            {
                System.out.println(line);
            }
        }catch (IOException error)
        {
            System.out.println("Error reading the file: " + error.getMessage());
        }
    }



    // Loaded list of songs
    public static Song[] songList() {
        Song[] Songs = new Song[50];
        Songs[0] = new Song("You & the 6", "Drake");
        Songs[1] = new Song("Hate Me", "Lil Yachty & Ian");
        Songs[2] = new Song("Broke Boi", "Playboi Carti");
        Songs[3] = new Song("New Drank", "Lucki");
        Songs[4] = new Song("Ghetto Symphony", "A$AP Rocky");
        Songs[5] = new Song("Close to You", "Frank Ocean");
        Songs[6] = new Song("Hate Sleeping Alone", "Drake");
        Songs[7] = new Song("Feel it", "Young Thug");
        Songs[8] = new Song("Do Not Matter", "Lil Uzi Vert");
        Songs[9] = new Song("Flip", "Blue Smiley");
        Songs[10] = new Song("Better in the Dark", "Jordana & TV Girl");
        Songs[11] = new Song("A New Kind of Love", "Frou Frou");
        Songs[12] = new Song("August 10", "Julie Doiron");
        Songs[13] = new Song("Losing My Mind", "BabySmoove");
        Songs[14] = new Song("Cuban Linx", "Untiljapan");
        Songs[15] = new Song("I'm Ready For You", "Bryson Tiller");
        Songs[16] = new Song("Survival Tactics", "Joey Bada$$ & Capital Steez");
        Songs[17] = new Song("Love No Thotties", "Chief Keef");
        Songs[18] = new Song("Girl Next Door", "Copperpot");
        Songs[19] = new Song("Daddy's Birthday", "Young Thug");
        Songs[20] = new Song("Fashion Habits", "Ken Carson");
        Songs[21] = new Song("Safe", "Young Thug");
        Songs[22] = new Song("#FreeTank", "HeyCartier");
        Songs[23] = new Song("Burn One Interlude", "Brent Faiyaz");
        Songs[24] = new Song("Ex-Factor", "Lauryn Hill");
        Songs[25] = new Song("Mad", "Solange & Lil Wayne");
        Songs[26] = new Song("Kiss of Life", "Sade");
        Songs[27] = new Song("Calm & Patient", "Jhene Aiko");
        Songs[28] = new Song("Jukebox Joints", "A$AP Rocky");
        Songs[29] = new Song("Changes", "A$AP Rocky");
        Songs[30] = new Song("Hallucinating", "Future");
        Songs[31] = new Song("Feel No Ways", "Drake");
        Songs[32] = new Song("Koi", "Trippie Redd");
        Songs[33] = new Song("Poker Face", "Lucki");
        Songs[34] = new Song("On My Mind", "Jorja Smith");
        Songs[35] = new Song("Changes","A$AP Rocky");
        Songs[36] = new Song("Margiela Split Toes","WestsideGunn");
        Songs[37] = new Song("Love Yourz","J Cole");
        Songs[38] = new Song("Sauce it Up","Lil Uzi Vert");
        Songs[39] = new Song("Have My Baby","Chief Keef");
        Songs[40] = new Song("Nikes","Frank Ocean");
        Songs[41] = new Song("Backseat Freestyle","Kendrick Lamar");
        Songs[42] = new Song("Solo","Future");
        Songs[43] = new Song("On & On","Erykah Badu");
        Songs[44] = new Song("Nothing even Matters","Lauryn Hill");
        Songs[45] = new Song("From Time","Drake & Jhene Aiko");
        Songs[46] = new Song("Intergalactic Janet","Ley Soul");
        Songs[47] = new Song("6 Foot 7 Foot","Lil Wayne");
        Songs[48] = new Song("Superpowers","Daniel Caesar");
        Songs[49] = new Song("Nigo","Lucki");
        return Songs;
    }

    public static String getArtistWithTitle(String title)
    {
        for(Song song : songList())
        {
            if(song.getTitle().equalsIgnoreCase(title))
            {
                return song.getArtist();
            }
            
        }
        return "Unknown Artist";
    }





}
