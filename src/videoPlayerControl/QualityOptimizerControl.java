package videoPlayerControl;

public class QualityOptimizerControl extends Control{

	private int internetSpeed;

	public int getInternetSpeed() {
		return internetSpeed;
	}
	public void setInternetSpeed(int internetSpeed) {
		this.internetSpeed = internetSpeed;
	}
	@Override
	public void action(VideoPlayer vp) {
		if(internetSpeed * 10.1 >= 1080) {
			vp.setVideoQuality(1080);
		} else if (internetSpeed * 10.1 >= 720) {
			vp.setVideoQuality(720);
		} else if (internetSpeed * 10.1 >= 480) {
			vp.setVideoQuality(480);
		} else if (internetSpeed * 10.1 >= 360) {
			vp.setVideoQuality(360);
		} else if (internetSpeed * 10.1 >= 240) {
			vp.setVideoQuality(240);
		} else {
			vp.setVideoQuality(144);
		}
	}
	
	
	
}
