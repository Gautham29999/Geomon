import java.util.*;
public class Geomon{
   private String name; // The name of the Geomon
	private String type; // The type of the Geomon
	private String status = "NONE";
	private int statusTurns;
	
	private double health; // The health of the Geomon
	private double stamina; // The stamina of the Geomon
	
	private String atkName1; // The name of the first attack 
	private double atk1; // The damage that the first attack deals
	private double stam1;
	
	
	private String atkName2; // The name of the second attack
	private double atk2; // The damage that the second attack deals
	private double stam2;
	
   private boolean blocking = false;
   
	private double level = 1; // The level that the geomon is
	private double xp = 0; // The xp that the geomon has
	
	// Accesors and Mutators
	
	public String getName()   { return name; }
	public String getType()   { return type; }
	public double getHealth()   { return health; }
	public double getStamina() {return stamina;}
	public String getStatus() {return status;}
	public int getStatusTurns(){return statusTurns;}
	
	public String getAtk1Name()   { return atkName1; }
	public double getAtk1()   { return atk1; }
	public double getStam1(){return stam1;}
	
	
	public String getAtk2Name()   { return atkName2; }
	public double getAtk2()   { return atk2; }
	public double getStam2(){return stam2;}
   
   public boolean getBlocking(){return blocking;}

	public void setName(String n) { name = n; }
	public void setType(String t) {type = t;}	
	public void setHealth(double h) { health = h; }
	public void setStamina(double s) {stamina = s;}
	public void setStatus(String stat){status = stat;}
	public void setStatusTurns(int statTurns){statusTurns = statTurns;}
	
	public void setAtk1Name(String atk1) { atkName1 = atk1; }
	public void setAtk1Dmg(double a1) { atk1 = a1; }
	public void setStam1(double s1) {stam1 = s1;}
   
   public void setBlocking(boolean block){blocking = block;}
	
	public void setAtk2Name(String atk2) { atkName2 = atk2; }
	public void setAtk2Dmg(double a2) { atk2 = a2; }
	public void setStam2(double s2) {stam2 = s2;}
   
   public Geomon(String n, String t, double h, double s, String atkN1, double a1, double s1, String atkN2, double a2,double s2){
		name = n;
		type = t;
		health = h;
		stamina = s;
		atkName1 = atkN1;
		atk1 = a1;
		stam1 = s1;
		atkName2 = atkN2;
		atk2 = a2;
		stam2 = s2;
	}
   
   
}