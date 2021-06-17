package videoPlayerControl;

public class StartVideoPlayer {

	public static void main(String[] args) {
		
		VideoPlayer vp = new VideoPlayer (250, 120, 50, 144);
		
		AudioControl ac = new AudioControl();
		TimeControl tc = new TimeControl();
		QualityOptimizerControl qoc = new QualityOptimizerControl();
		qoc.setInternetSpeed(250);
		qoc.action(vp);
		tc.setForward(false);
		tc.action(vp);
		ac.setIncreaseVolume(true);
		ac.action(vp);
		vp.print();

	}

}
