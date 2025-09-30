public class Song{
  public String name;
  public String artistName;
  public int time;
  public Song next;
  public int count;
  public Song(String name, String artistName, int time)
  {
    this.name = name;
    this.artistName = artistName;
    this.time= time;
  }
  public void songInfo()
  {
    System.out.printf("Title: %s\nArtist: %s\nLength: %d minutes\n",this.name,this.artistName,this.time);
  }
}