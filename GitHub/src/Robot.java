
public class Robot {

		public String name;
			
//		public Robot(String robotsname){
//			this.name = robotsname;	
//		}
	//	
//		public Robot(){
//			
//		}
		
		public String getName(){
			return this.name;
		}
		
		public void setName(String robotname){
			this.name = robotname;
		}
		
		public void saySomething(){
			System.out.println("Thank you. My name is " +name +" btw.");
		}

}