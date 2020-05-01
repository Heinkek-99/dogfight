package jpu2016.dogfight.contoller;
import jpu2016.dogfight.model.IDogfightModel;
import jpu2016.dogfight.view.IViewSystem;

	public class DogfightController implements IOrderPerformer {

		private IDogfightModel dogfightModel;
		private IViewSystem viewSystem;
		
		public static int TIME_SLEEP = 30;
		
		public static int getTIME_SLEEP() {
			return TIME_SLEEP;
		}
		public static void setTIME_SLEEP(int tIME_SLEEP) {
			TIME_SLEEP = tIME_SLEEP;
		}
		public DogfightController(IDogfightModel dogfightModel);
		
		public void orderPerform(UserOrder userOrder);
		
		public void play() {
			
		}
		
		public void setViewSystem(IViewSystem viewSystem) {
			
		}
		
		private void launchMissile(int player) {
			
		}
		
		private void gameLoop() {
			
		}
		
		
		
	}

