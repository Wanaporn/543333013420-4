package football;

public class TomasKalas {

	private String name;
 	private String position;
 	private String friend[];
 	
 	public TomasKalas(){
 		name = "TomasKalas";
 		position = "Quarterback";
 		friend = new String [] {"MarkSchwarzer","OriolRomeu","NemanjaMatic"};
 			
 	}
 	
 	public TomasKalas(int a){
 		System.out.println("TomasKalas overloading 1");
 	}
 	
 		public String getName(){
 			return name;
 		}
 		
 		public String getPosition(){
 			return position;
 		}
 		
 		public String[] getFriend(){
 			return friend;
 		}
 	}
 
