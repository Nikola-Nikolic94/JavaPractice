package youTubePlayer;

public class YoutubePlayer {

	private String name;
	private int lenght;
	private int quality;
	private int numberOfLikes;
	private int numberOfDislikes;
	private int views;
	private String mode;
	private int volume;
	private int currentTime;
	
	public String getName() {
		return name;
	}
	public int getLenght() {
		return lenght;
	}
	public int getQuality() {
		return quality;
	}
	public int getNumberOfLikes() {
		return numberOfLikes;
	}
	public int getNumberOfDislikes() {
		return numberOfDislikes;
	}
	public int getViews() {
		return views;
	}
	public String getMode() {
		return mode;
	}
	public int getVolume() {
		return volume;
	}
	public int getCurrentTime() {
		return currentTime;
	}
	public YoutubePlayer(String name, int lenght) {
		this.name = name;
		this.lenght = lenght;
		this.numberOfLikes = 0;
		this.numberOfDislikes = 0;
		this.views = 0;
		this.mode = "mini player mode";
		this.volume = 75;
		this.currentTime = 0;
		this.quality = 144;
	}
	public YoutubePlayer(
			String name,
			int lenght,
			int quality,
			int likes,
			int dislikes,
			int views,
			String mode,
			int volume,
			int currentTime) {
		
		this.name = name;
		this.lenght = lenght;
		this.quality = quality;
		this.numberOfLikes = likes;
		this.numberOfDislikes = dislikes;
		this.views = views;
		this.mode = mode;
		this.volume = volume;
		this.currentTime = currentTime;
	}
	public void like() {
		this.numberOfLikes += 1;
	}
	public void dislike() {
		
		this.numberOfDislikes += 1;
	}
	public void turnVolumeUp() {
		
		if(this.volume + 10 <= 100) {
			this.volume += 10;
		} else {
			this.volume = 100;
		}
	}
	public void turnVolumeDown() {
		
		if(this.volume - 10 <= 0) {
			this.volume = 0;
		} else {
			this.volume -= 10;
		}
	}
	public void setQuality(int mb) {
		
		if(mb < 2) {
			this.quality = 144;
		} else if (mb < 4 && mb >= 2) {
			this.quality = 240;
		} else if (mb < 6 && mb >= 4) {
			this.quality = 360;
		} else if (mb < 8 && mb >= 6) {
			this.quality = 720;
		} else {
			this.quality = 1080;
		}
	}
	public void activateMiniPlayerMode() {
		this.mode = "mini player mode";
	}
	public void activateMovieMode() {
		this.mode = "movie mode";
	}
	public void activateFullScreen() {
		this.mode = "fullscreen mode";
	}
	public void rewind() {
		
		if(this.currentTime + 10 >= this.lenght) {
			this.currentTime = this.lenght;
		} else {
			this.currentTime += 10;
		}
	}
	public void printVolume() {
		
		System.out.print("<:");
		
		for (int i = 1; i < this.volume / 10; i++ ) {
			System.out.print(" |");
		}
		if (this.volume < 10) {
			System.out.print("/");
		}
	}
	public void printMode() {
		
		if(this.mode.equals("mini player mode")) {
			System.out.println("[ ]");
		} else if (this.mode.equals("movie mode")) {
			System.out.println("[ ..]");
		} else {
			System.out.println("[||||]");
		}
	}
	public void printCurrentTime() {
		int minCurrent = this.currentTime / 60;
		int minTotal = this.lenght / 60;
		int sekCurrent = this.currentTime - (minCurrent * 60);
		int sekTotal = this.lenght - (minTotal * 60);
		System.out.print(minCurrent + ":" + sekCurrent + " / " + minTotal + ":" + sekTotal);		
	}
	public void print() {
		 printCurrentTime();
		 System.out.print(" Volume");
		 printVolume();
		 System.out.print(" Kvalitet: " + this.quality + "p");
		 System.out.print(" Rezim: ");
		 printMode();
		 System.out.println(this.name);
		 System.out.println("Likes " + numberOfLikes + " | " + "Dislikes " + numberOfDislikes);
		 System.out.println(views + " Views");
	}
	
}
