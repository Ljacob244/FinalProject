import java.util.Scanner;


public class PlaylistManager
{

    static boolean value = true;
    static String songsFile = "songs.txt";

    public static void main(String args [])
    {


        
        SongList songList = new SongList();
        
 
        songList.songs = songList.songList();
     
        songList.saveList(songsFile);
        menuLoop();
        
       


        }

        public static void userMenu()
    {
        System.out.println("");
        System.out.println("Menu");
        System.out.println("-------------------------");
        System.out.println("1.See Song List");
        System.out.println("2.Add Songs to Playlist");
        System.out.println("3.Remove Songs from Playlist");
        System.out.println("4.View Playlist");
        System.out.println("5.Exit Program");
        System.out.println("6.Save playlist");
        System.out.println(" ");

    


    }

    public static void menuLoop()
    { 

        String fileName = "playlist.txt";
        while(value == true)
        {
        
        Scanner input = new Scanner(System.in); 
        userMenu();
        int answer = getValidMenuChoice(1,6,"Choose a option between 1 and 6:");
        
        
        SongList songList = new SongList();


        if(answer == 1)
        {
            
            songList.loadFromFile(songsFile);
            songList.printSongList(songsFile);
            System.out.println(" ");
        }
        if(answer == 5)
        { 
            System.out.println(" ");
            System.out.println("Exiting Program");
            value = false;
        }
        if(answer == 2)
        {
            
            Playlist.AddSong();
            
        }
        if(answer == 4)
        {
            System.out.println("Your playlist consists of : ");
            System.out.println(" ");
            Playlist.printPlaylistFromFile(fileName);
        }
        if(answer == 3)
        {
            Playlist.RemoveSong();
        }
        if(answer == 6)
        {
            System.out.println("Saving playlist to file");
            System.out.println("");
            Playlist.savePlaylistToFile(fileName);
        }
        
    
        




    }

    }
    public static int getValidMenuChoice(int min, int max, String msg)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your choice: ");
        try
        {
            int choice = Integer.parseInt(input.nextLine());
            if (choice < min || choice > max)
            {
                System.out.println("Invalid choice. Please enter a number between " + min + " and " + max + ".");
                return getValidMenuChoice(min, max, msg);
            }
            return choice;

    }catch(NumberFormatException e)
    {
        System.out.println("Invalid input. Please enter a vlid number");
        return getValidMenuChoice(min, max, msg);
    }




    }

}

    
    




