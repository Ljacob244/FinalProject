# FinalProject


My Final Project "Playlist Manager" has a pre loaded list of songs that allow you to mangage a playlist.

The Main Class to Run the program is PlaylistManager.java
SongList contains code for generating the preloaded songlist and saving it to a file
Song.java creates objects and constructors for the Song class
Playlist.java has code for everything to do with the playlist itself. For example(generating it, add/remove song method, saving to a file, etc.)


In the Menu you have 6 options to choose from. 
1.See Song List
2.Add Songs to Playlist
3.Remove Songs from Playlist
4.View Playlist
5.Exit Program
6.Save playlist

1 - Shows you the preloaded songlist
2 - Add songs to your playlist from the songlist
3 - Remove songs from your playlist
4 - View your playlist 
5 - Close the program
6 - Saves your playlist even after closing the program

In this program i used

Arrays for the preloaded songs.

ArrayLaded songlistists for your playlist, so you can add and remove songs.

Recursion to make sure youre choosing a option in the menu thats available.

File persistence to save songlists and the playlist to txt files so data will be saved after closing the program.

Exceptions are used to handle invalid user inputs and file errors making sure the program overral runs smooth.
