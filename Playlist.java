import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class Playlist
{
    public static ArrayList<Song> songs = new ArrayList<>(); 




    public static void AddSong()
    {
        boolean var = true;
        Scanner songReq = new Scanner(System.in);

        while(var = true)
        {
        System.out.println("What songs would you like to do add / If done type Done and you will return to menu ");
        String title = songReq.nextLine();
        
        if(title.equalsIgnoreCase("Done"))
        {
            var = false;
            System.out.println("Returning you back to the menu");
            System.out.println("-------------------------------");
            return;
            
        }
        else
        {
            String artist = SongList.getArtistWithTitle(title);

            if(artist.equals("Unknown Artist"))
            {
                System.out.println("Invalid song title, Enter a song from the list");
            }
            else
            {
            System.out.println("You just added " + title + "-" + artist + " to your new playlist");
            Song newSong = new Song(title, artist);
            songs.add(newSong);
            appendSongToFile("playlist.txt", newSong);
            }

            
        }


        


        }


    }


        public static void RemoveSong()
            {
                boolean var = true;
                Scanner songReq = new Scanner(System.in);

            while(var = true)
            {
            System.out.println("What songs would you like to do remove / If done type Done and you will return to menu ");
            String title = songReq.nextLine();
            
            if(title.equalsIgnoreCase("Done"))
            {
                var = false;
                System.out.println(" returning you back to the menu");
                System.out.println("-------------------------------");
                return;
                
            }
            else
            {
                for (int i = 0; i < songs.size(); i++) {
                    Song currentSong = songs.get(i); 
                    if (currentSong.getTitle().equalsIgnoreCase(title)) { 
                        songs.remove(i); 
                        System.out.println("You just removed \"" + currentSong.getTitle() + "\" from your playlist.");
                        savePlaylistToFile("playlist.txt");
                        return; 
                    }
                }
                
                




                }

}
                




}

                    public static void printPlaylist()
                    {
                        if(songs.isEmpty())
                        {
                            System.out.println("Playlist currently empty");
                        }
                        else{
                        for(Song song : songs)
                        {
                            System.out.println(song.getTitle() + "-" + song.getArtist());
                        }
                        }
                    }



    
                    public static void savePlaylistToFile(String fileName)
                    {
                        try(FileWriter writer = new FileWriter(fileName))
                        {
                            for(Song song : songs)
                            {
                                writer.write(song.getTitle() + (song.getArtist() != null ? ","  + song.getArtist() : "") + "\n");
                            }
                            System.out.println("Playlist saved to file : " + fileName);
                        } catch(IOException error)
                        {
                            System.out.println("Error saving playlist to file : " + error);
                        }
                        }



                        public static void printPlaylistFromFile(String fileName) {
                            try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
                                String line;
                                while ((line = reader.readLine()) != null) {
                                    System.out.println(line);
                                }
                            } catch (IOException error) {
                                System.out.println("Error reading playlist from file: " + error.getMessage());
                            }
                        }



                        private static void appendSongToFile(String fileName, Song song) {
                            try (FileWriter writer = new FileWriter(fileName, true)) { 
                                writer.write(song.getTitle() + "," + song.getArtist() + "\n"); 
                            } catch (IOException error) {
                                System.out.println("Error appending to file: " + error.getMessage());
                            }
                        




                    }

                }




















