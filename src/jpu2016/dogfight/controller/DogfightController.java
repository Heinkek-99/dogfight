package jpu2016.dogfight.controller;
import jpu2016.dogfight.modele.IDogfightModel;
import jpu2016.dogfight.view.IViewSystem;

	public class DogfightController implements IOrderPerformer {

		private final IDogfightModel dogfightModel;
		private IViewSystem viewSystem;
		
		public static int TIME_SLEEP = 30;
		
		public DogfightController(final IDogfightModel dogfightModel) {
			
			this.dogfightModel = dogfightModel;
		}
		public void orderPerform(UserOrder userOrder) {
		}
		
		public void play() {
			
		}
		
		public void setViewSystem(IViewSystem viewSystem) {
			
		}
		
		private void launchMissile(final int player) {
			
		}
		
		private void gameLoop() {
			
		}
		public IDogfightModel getDogfightModel() {
			return dogfightModel;
		}
		
		
		
	}

