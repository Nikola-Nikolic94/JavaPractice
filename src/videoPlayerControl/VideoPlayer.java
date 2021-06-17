package videoPlayerControl;

public class VideoPlayer {

	private int duration;
	private int currentTime;
	private int sound;
	private int videoQuality;
	
	public VideoPlayer () {
		
	}

	public VideoPlayer(int duration, int currentTime, int sound, int videoQuality) {
		super();
		this.duration = duration;
		this.currentTime = currentTime;
		this.sound = sound;
		this.videoQuality = videoQuality;
	}

	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public int getCurrentTime() {
		return currentTime;
	}
	public void setCurrentTime(int currentTime) {
		this.currentTime = currentTime;
	}
	public int getSound() {
		return sound;
	}
	public void setSound(int sound) {
		this.sound = sound;
	}
	public int getVideoQuality() {
		return videoQuality;
	}
	public void setVideoQuality(int videoQuality) {
		this.videoQuality = videoQuality;
	}
	public void print() {
		System.out.println("Duration of the video is: " + this.duration + " seconds");
		System.out.println("The current time of the video is: " + this.currentTime + " seconds");
		System.out.println("The volume is: " + this.sound);
		System.out.println("Video quality is: " + this.videoQuality + "p");
	}
	
}
