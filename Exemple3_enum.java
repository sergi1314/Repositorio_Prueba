enum Week{
	Monday("Dilluns", 20),
	Tuesday("Dimarts", 20),
	Wednesday("Dimecres", 20),
	Thursday("Dijous", 20),
	Friday("Divendres",20),
	Saturday,
	Sunday;
	//Atributs
	public final String text;
	private final int preu;
	//Constructors
	Week(){
		text="cap de setmana";
		preu=40;
	}
	Week(String text, int preu){
		this.text=text;
		this.preu=preu;
	}
	public int getPreu(){
		return preu;
	}
}
	public class Exemple3_enum{
		public static void main(String[]args){
			System.out.println("text: "+Week.Friday.text+" preu: "+Week.Friday.getPreu());
			int total=0;
			for(Week d: Week.values()){
				total=total+d.getPreu();
			}
			System.out.println("Treballar una setmana costa: "+total+" euros");
		}
	}
			
			
			
		
