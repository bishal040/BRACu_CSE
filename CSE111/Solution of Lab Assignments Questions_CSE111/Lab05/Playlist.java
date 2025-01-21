public class Playlist {
  public String name;
  public Song firstSong;
  public int songCount;

  public Playlist(String name) {
      this.name = name;
      System.out.println(name + " playlist has been created!");
  }

  public void info() {
      if (firstSong == null) {
          System.out.println("No songs in the playlist: " + name);
      } else {
          System.out.println("Songs in the playlist " + name + ":");
          Song current;
          int index = 1;
          for (current = firstSong; current != null; current = current.next, index++) {
              System.out.println("Song-" + index);
              System.out.println("Title: " + current.name);
              System.out.println("Artist: " + current.artistName);
              System.out.println("Length: " + current.time + " minutes");
          }
      }
  }

  public void addSong(Song s) {
      addSong(s, songCount);
  }

  public void addSong(Song s, int index) {
      if (index < 0) {
          System.out.println("Invalid index. Cannot add song.");
          return;
      }
      songCount++;
      if (firstSong == null) {
          firstSong = s;
          System.out.println(s.name + " has been added to the playlist: " + name);
      } else if (index == 0) {
          s.next = firstSong;
          firstSong = s;
          System.out.println(s.name + " has been added to the start of the playlist: " + name);
      } else {
          Song current = firstSong;
          int count;
          for (count = 0; count < index - 1 && current.next != null; current = current.next, count++) {}
          if (count == index - 1) {
              s.next = current.next;
              current.next = s;
              System.out.println(s.name + " has been added to the playlist: " + name);
          } else {
              System.out.println("Index out of bounds. Song not added.");
              songCount--;
          }
      }
  }

  public void playSong(String title) {
      Song current;
      for (current = firstSong; current != null; current = current.next) {
          if (current.name.equals(title)) {
              System.out.println("Now playing: " + current.name + " by " + current.artistName);
              return;
          }
      }
      System.out.println("Song titled \"" + title + "\" not found in the playlist: " + name);
  }

  public void playSong(int index) {
      if (index < 0 || index >= songCount) {
          System.out.println("Invalid index. No song found at position " + index + " in the playlist: " + name);
          return;
      }
      Song current;
      int currentIndex = 0;
      for (current = firstSong; current != null; current = current.next, currentIndex++) {
          if (currentIndex == index) {
              System.out.println("Now playing: " + current.name + " by " + current.artistName);
              return;
          }
      }
  }

  public void deleteSong(String name) {
      if (firstSong == null) {
          System.out.println("No songs to delete in the playlist: " + name);
      } else if (firstSong.name.equals(name)) {
          firstSong = firstSong.next;
          songCount--;
          System.out.println(name + " has been removed from the playlist: " + name);
      } else {
          Song current;
          for (current = firstSong; current.next != null; current = current.next) {
              if (current.next.name.equals(name)) {
                  current.next = current.next.next;
                  songCount--;
                  System.out.println(name + " has been removed from the playlist: " + name);
                  return;
              }
          }
          System.out.println("Song titled \"" + name + "\" not found in the playlist: " + name);
      }
  }

  public void merge(Playlist play) {
      if (play.firstSong == null) {
          System.out.println("The other playlist is empty. No songs to merge.");
      } else if (firstSong == null) {
          firstSong = play.firstSong;
          System.out.println("The playlists have been merged successfully!");
      } else {
          Song current;
          for (current = firstSong; current.next != null; current = current.next) {}
          current.next = play.firstSong;
          System.out.println("The playlists have been merged successfully!");
      }
  }

  public int totalSong() {
      return songCount;
  }
}