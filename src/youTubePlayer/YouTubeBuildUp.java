package youTubePlayer;

public class YouTubeBuildUp {

	public static void main(String[] args) {
		
		YoutubePlayer yt = new YoutubePlayer(
					"Java tutorial",
					250,
					1080,
					50000,
					2000,
					123000,
					"movie mode",
					100,
					64);
		
		yt.print();

	}

}
