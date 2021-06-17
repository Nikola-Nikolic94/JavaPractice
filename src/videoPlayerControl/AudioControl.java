package videoPlayerControl;

public class AudioControl extends Control{

	private boolean increaseVolume;

	public boolean isIncreaseVolume() {
		return increaseVolume;
	}
	public void setIncreaseVolume(boolean increaseVolume) {
		this.increaseVolume = increaseVolume;
	}
	@Override
	public void action(VideoPlayer vp) {
		
		if(increaseVolume == true && 100 >= vp.getSound() + 1) {
			vp.setSound(vp.getSound() + 1);
		} else if(increaseVolume == true){
			vp.setSound(100);
		}
		if(increaseVolume == false && 0 <= vp.getSound() - 1) {
			vp.setSound(vp.getSound() - 1);
		} else if(increaseVolume == false){
			vp.setSound(0);
		}
	}		
}
