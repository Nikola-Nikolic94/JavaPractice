package videoPlayerControl;

public class TimeControl extends Control{

	private boolean forward;
		
	public boolean isForward() {
		return forward;
	}
	public void setForward(boolean forward) {
		this.forward = forward;
	}
	@Override
	public void action(VideoPlayer vp) {
		
		if(forward == true && vp.getDuration() > vp.getCurrentTime() + 15) {
			vp.setCurrentTime(vp.getCurrentTime() + 15);
		} else if(forward == true){
			vp.setCurrentTime(vp.getDuration());
		}
		if(forward == false && 0 <= vp.getCurrentTime() - 15) {
			vp.setCurrentTime(vp.getCurrentTime() - 15);
		} else if (forward == false){
			vp.setCurrentTime(0);
		}
	}
	
}
