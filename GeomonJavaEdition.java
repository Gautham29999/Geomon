import java.util.*;
import java.io.*; 
public class GeomonJavaEdition{
   public static void main(String [] args){
      System.out.println("Geomon");
      
      // All GEOMONS
      // Geomon still need balancing
      Geomon [] Geomons = new Geomon[30]; 
      Geomons[0] = new Geomon("Turtle","Water",150.0 ,100.0 ,"Waterjet",15.0 , 10.0,"Splash", 20.0, 15.0 );
   	Geomons[1] = new Geomon("Fish","Water",75.0 , 50.0, "Splash", 10.0 , 5.0, "WhirlPool",15.0 ,10.0 );
   	Geomons[2] = new Geomon("Whale","Water",150.0,75.0,"Tail Whip",10.0,7.5,"Tsunami",15.0,10.0);
      Geomons[3] = new Geomon("Dolphin","Water",100.0,100.0,"Squeak",20.0,10.0,"Icebeam",25.0,15.0);
   	Geomons[4] = new Geomon("Shark","Water",75.0,75.0,"Bite",30.0,25.0,"Sharpedo",40.0,30.0);
	   Geomons[5] = new Geomon("Seal","Water",100.0,75.0,"Spray",10.0,10.0,"Glacier",25.0,15.0);      
      Geomons[6] = new Geomon("Frog","Water",100.0,150.0,"Leap",15.0,10.0,"Bubble stream",25.0,20.0);
      Geomons[7] = new Geomon("Eel","Water",100.0,150.0,"Bite",15.0,25.0,"Shock",25.0,30.0);
      Geomons[8] = new Geomon("Penguin","Water",100.0,150.0,"Waddle",15.0,25.0,"Freeze",25.0,30.0);
      Geomons[9] = new Geomon("Kraken","Water",250.0 ,200.0 , "Tsunami", 35.0, 30.0, "Sink",55.0 ,40.0);

   	Geomons[10] = new Geomon("Hellhound","Fire", 100.0, 100.0 , "Fireball", 25.0 , 40.0, "Heat Wave", 30.0,45.0 );
   	Geomons[11] = new Geomon("Lizard","Fire",75.0 , 90.0, "Scratch",10.0 ,15.0 , "Ignite",20.0,30.0 );
   	Geomons[12] = new Geomon("Scorpion","Fire",125.0 , 100.0, "Wildfire",30.0 ,30.0 , "Blaze",45.0 ,45.0 );
      Geomons[13] = new Geomon("Firefox","Fire",80.0,95.0,"Scratch",25.0,30.0,"Blast",25.0,35.0);
      Geomons[14] = new Geomon("Lion","Fire",80.0,95.0,"Bite",25.0,30.0,"Roar",25.0,35.0);
      Geomons[15] = new Geomon("Cheetah","Fire",80.0,95.0,"Dash",25.0,30.0,"Flame Tornado",25.0,35.0);
      Geomons[16] = new Geomon("Viper","Fire",80.0,95.0,"Bite",25.0,30.0,"Flame Fang",25.0,35.0);
      Geomons[17] = new Geomon("Firefly","Fire",80.0,95.0,"Sting",25.0,30.0,"Burn",25.0,35.0);
      Geomons[18] = new Geomon("Hawk","Fire",80.0,95.0,"Swoop",25.0,30.0,"Flame Talon",25.0,35.0);
      Geomons[19] = new Geomon("Dragon","Fire", 175.0, 125.0, "Scorch", 35.0 ,45.0 , "Magma Blast", 50.0 , 45.0);

   	Geomons[20] = new Geomon("Caterpillar","Plant",150.0 ,125.0 , "Bonk",25.0 ,25.0 , "Seed-Bullet", 30.0,25.0);
   	Geomons[21] = new Geomon("Flytrap","Plant", 150.0, 150.0, "Gnaw", 25.0 ,35.0 , "Spores",55.0 ,50.0 );
	   Geomons[22] = new Geomon("Sparrow","Plant",80.0,95.0,"Blast",25.0,30.0,"Scratch",25.0,35.0);
	   Geomons[23] = new Geomon("Koala","Plant",150.0,150.0,"Bite",15.0,25.0,"Rock Throw",25.0,30.0);
      Geomons[24] = new Geomon("Monkey","Plant",125.0,100.0,"Scratch",10.0,5.0,"Stick Nunchuks",25.0,30.0);
      Geomons[25] = new Geomon("Bee Hive","Plant",150.0,75.0,"Sting",20.0,10.0,"Swarm",25.0,10.0);
      Geomons[26] = new Geomon("Goat","Plant",100.0,150.0,"mehhhhh",10.0,5.0,"Ram",15.0,10.0);
      Geomons[27] = new Geomon("Mushroom","Plant",75.0,50.0,"Spore",15.0,5.0,"Hallucinate",20.0,10.0);
      Geomons[28] = new Geomon("Ant","Water",100.0,150.0,"Bite",15.0,5.0,"Leaf Cutter",25.0,10.0);
      Geomons[29] = new Geomon("Tree Golem","Plant",150.0,100.0,"Sun-Beam",15.0,10.0,"Poison",30.0,40.0);

      Geomon Cerberus = new Geomon("Cerberus","Boss",1000.0,500.0,"Overheat",55.0,40.0,"Incinerate",75.0,50.0);

      Geomon[] hand = new Geomon[5];
      Scanner in = new Scanner(System.in);
      System.out.println("Are you a new player?(Y/N)");
      String yn = in.nextLine();
      
       while(!(yn.equals("Y")) && !(yn.equals("N"))){
         System.out.println("Invalid response, please try again: ");
         yn = in.nextLine();
       }
      String username = "";
      String password = "";
      
      int[] handIndex = new int[5]; 
      int yourLevel = 0;
                  
      
         if (yn.equals("Y")){
         System.out.println("Enter a new username:");
         username = in.nextLine();
   
         System.out.println("Enter a new password");
         password = in.nextLine();
         username.concat(".txt");
         
         try{
            File newSave = new File(username);
            FileWriter writer = new FileWriter(username);
            BufferedWriter bwriter = new BufferedWriter(writer);
            bwriter.write(password);
            bwriter.newLine();
            
            //Starter hand
            bwriter.write("0");
            bwriter.newLine();
            bwriter.write("4");
            bwriter.newLine();
            bwriter.write("7");
            bwriter.newLine();
            bwriter.write("10");
            bwriter.newLine();
            bwriter.write("16");
            bwriter.newLine();
            
            bwriter.write("1");
            bwriter.newLine();
            
            bwriter.close();
            
            hand[0] = Geomons[0];
            hand[1] = Geomons[4];
            hand[2] = Geomons[7];
            hand[3] = Geomons[10];
            hand[4] = Geomons[16];
            
            handIndex[0] = 0;
            handIndex[1] = 4;
            handIndex[2] = 7;
            handIndex[3] = 10;
            handIndex[4] = 16;
            yourLevel = 1;
         } catch (IOException ex){
            System.out.println("Error, pls check file location");
         }
      }else if (yn.equals("N")){
         System.out.println("Enter Username(Case Sensitive) : ");
         username = in.nextLine();
         username.concat(".txt");
         boolean loggedIn = false;
         System.out.println("Enter Password: ");
         password = in.nextLine();
         
         
         try{
            File save = new File(username);
            Scanner reader = new Scanner(save);
            String data = reader.nextLine();
            while(!(password.equals(data))){     
               System.out.println("Wrong password, try again: ");
               password = in.nextLine();
            }
            
            for(int i = 0; i < 5; i++){
               data = reader.nextLine();
               hand[i] = Geomons[Integer.parseInt(data)];
               handIndex[i] = Integer.parseInt(data);
            }
            data = reader.nextLine();
            yourLevel = Integer.parseInt(data);
            reader.close(); 
         } catch(FileNotFoundException ex1){
            System.out.println("ERROR");
         }         
      }
			
      
      
      
      
      Geomon levelTeam[] = new Geomon[5];
      int levelTeamIndex [] = new int[5];
      int pack[] = new int[3];

      boolean win = false;
      while(yourLevel <= 5){
         if (yourLevel == 1){
            System.out.println("5 years ago thousands of creatures big and small started dissapearing into thin air.");
            pause(3);
            System.out.println("Your beloved K9 unit was also one of the victims of this mass dissapearing");
            pause(3);
            System.out.println("Now you are a detective investigating the case in which you come across an old cabin in the woods");
            pause(3);
            System.out.println("The old lady in the cabin explained that all those creatures were infused with magic and captured in orbs by the dark mage placidusax.");
            pause(3);
            System.out.println("These creatures are known as geomon and can be summoned using a rune bracelet");
            pause(3);
            System.out.println("The old lady explains that the only way to free all the creatures captured is by defeating the dark mage and breaking his bracelet");
            pause(3);
            System.out.println("The old lady gives you a rune bracelet and 5 geomon which she stole from the dark mage.");
            pause(3);
            System.out.println("She tells you the dark mage lives in a tower in the middle of the woods");
            pause(3);
            System.out.println("The next day you arrive at the tower and are confronted by some guards patrolling the tower.");
            pause(3);
            System.out.println("You have no choice other than to fight him in a duel");
            pause(6);
            
         
            levelTeam[0] = Geomons[1];
            levelTeam[1] = Geomons[17];
            levelTeam[2] = Geomons[20];
            levelTeam[3] = Geomons[7];
            levelTeam[4] = Geomons[11];
            
            levelTeamIndex[0] = 1;
            levelTeamIndex[1] = 17;
            levelTeamIndex[2] = 20;
            levelTeamIndex[3] = 7;
            levelTeamIndex[4] = 11;
           
         
            level(hand,levelTeam);
         } else if (yourLevel == 2){
            System.out.println("After beating the captain of the guards, you proceed into the tower.");
            pause(3);
            System.out.println("You walk up the stairs to find yourself in a library.");
            pause(3);
            System.out.println("You are met with a librarian wearing a green robe.");
            pause(3);
            System.out.println("She introduces herself as Raya and challenges you to a duel");
            pause(3);
            
            levelTeam[0] = Geomons[21];
            levelTeam[1] = Geomons[22];
            levelTeam[2] = Geomons[25];
            levelTeam[3] = Geomons[27];
            levelTeam[4] = Geomons[28];
            
            levelTeamIndex[0] = 21;
            levelTeamIndex[1] = 22;
            levelTeamIndex[2] = 25;
            levelTeamIndex[3] = 27;
            levelTeamIndex[4] = 28;
            
            level(hand,levelTeam);
                        
         } else if(yourLevel == 3){
            System.out.println("You walk up a few more stairs till you reach a alchemy room");
            pause(3);
            System.out.println("You see a man doing experiments with various chemicals");
            pause(3);
            System.out.println("He notices you but continues on with his experiment");
            pause(3);
            System.out.println("You try walking past him but he throws a potion infront of you that melts the ground");
            pause(3);
            System.out.println("You both get ready for a duel");
            pause(3);
            
            levelTeam[0] = Geomons[0];
            levelTeam[1] = Geomons[7];
            levelTeam[2] = Geomons[8];
            levelTeam[3] = Geomons[3];
            levelTeam[4] = Geomons[2];
            
            levelTeamIndex[0] = 0;
            levelTeamIndex[1] = 7;
            levelTeamIndex[2] = 8;
            levelTeamIndex[3] = 3;
            levelTeamIndex[4] = 2;
            
            level(hand,levelTeam);


         } else if (yourLevel == 4){
            System.out.println("You finally reach to top floor of the tower to find a man wearing a crimson jacket.");
            pause(3);
            System.out.println("The man introduces himself as Brennan, the disciple of the dark mage");
            pause(3);
            System.out.println("He challenges to a duel...");
            pause(3);
            
            levelTeam[0] = Geomons[14];
            levelTeam[1] = Geomons[10];
            levelTeam[2] = Geomons[15];
            levelTeam[3] = Geomons[16];
            levelTeam[4] = Geomons[19];
            
            levelTeamIndex[0] = 14;
            levelTeamIndex[1] = 10;
            levelTeamIndex[2] = 15;
            levelTeamIndex[3] = 16;
            levelTeamIndex[4] = 19;
            
            level(hand,levelTeam);

         } else if(yourLevel == 5){
            System.out.println("You finally reach the top level of the tower.");
            pause(3);
            System.out.println("You see a man wearing an all black tuxedo");
            pause(3);
            System.out.println("You recognize him as the man who has been trading geomon throughout the tower.");
            pause(3);
            System.out.println("He smiles and summons a dog that you instantly recognize as your K9 unit.");
            pause(3);
            System.out.println("He snaps his finger and your K9 bursts into flames transforming into the three headed dog of the underworld");
            pause(3);
            System.out.println("CERBURUS");
            pause(3);
            System.out.println("TIP:CERBURUS HAS NO WEAKNESSES NOR STRENGTHS");
            pause(5);
            bossLevel(hand,Cerberus);
            
         }
            if (hand[4].getHealth() <= 0){
               System.out.println("YOU LOST");
               heal(hand,handIndex,Geomons);
               heal(levelTeam, levelTeamIndex, Geomons);
            } else if (levelTeam[4].getHealth() <= 0){
               System.out.println("YOU WIN");
               heal(hand,handIndex,Geomons);
               openDealer(hand, Geomons, pack, handIndex);
               editSaveFile(username,password,handIndex,yourLevel);
               yourLevel++;
            } else {
               System.out.println("Error");
            }
            
      }  

      
            
            
      
      
   }
   
   public static void heal(Geomon [] team, int[]teamIndex, Geomon [] allGeomon){
      for(int i = 0; i < 5; i++){
         team[i] = allGeomon[teamIndex[i]]; 
      }
   }
   
   public static void pause(int secs){
      try{
         Thread.sleep(secs*1000);
      } catch(InterruptedException ex){
         System.out.println("ERROR");
      }
   }
   public static void level(Geomon[] yourHand, Geomon[] oppHand){
      int i = 0, j=0;
      
      while(i<5 && j<5){
         outputBattle(yourHand[i],oppHand[j]);
         if (yourHand[i].getHealth() <= 0){
            System.out.println(yourHand[i].getName() + " died.");
            i++;
         } else if (oppHand[j].getHealth() <= 0){
            System.out.println(oppHand[j].getName() + " died.");
            j++;
         } else {
            System.out.println("ERROR?");
         }
      }
   }
   
   public static void bossLevel(Geomon [] hand, Geomon boss){
      int i = 0;
      while(i<5){
         outputBattle(hand[i],boss);
      }
   }
   
   public static void outputBattle(Geomon yourGeomon, Geomon oppGeomon){
   
      Scanner sc = new Scanner (System.in);
      Random rand = new Random();
      
      int turn = 0;
      boolean inBattle = true;
      while(yourGeomon.getHealth() > 0 && oppGeomon.getHealth() > 0){
            int move;
            if (turn%2 == 0){
               System.out.println("----------------------------------------------------------------------------------------");
         
              System.out.printf("%-30s", "YOUR GEOMON: "+ yourGeomon.getName());
              System.out.printf("%-30s %n", "OPPONENT GEOMON: "+ oppGeomon.getName());
         
         
               System.out.printf("%-30s", "HEALTH: "+ yourGeomon.getHealth());
               System.out.printf("%-30s %n", "HEALTH: "+ oppGeomon.getHealth());
               
               System.out.printf("%-30s", "STAMINA: "+ yourGeomon.getStamina());
               System.out.printf("%-30s %n", "STAMINA: "+ oppGeomon.getStamina());

               
               System.out.printf("%25s %n","MOVES");
               System.out.printf("%-30s", "1."+ yourGeomon.getAtk1Name() + "(" + yourGeomon.getAtk1() + "/" + yourGeomon.getStam1() + ")");
               System.out.printf("%-30s %n", "2."+ yourGeomon.getAtk2Name() + "(" + yourGeomon.getAtk2() + "/" + yourGeomon.getStam2() + ")");
               System.out.printf("%-30s", "3.Defend(20 stam)");
               System.out.printf("%-30s %n", "4.Recover Stamina(+20 Stam)");
               
   
                  System.out.print("Enter Move: ");
                  move = sc.nextInt();
                  attack(move,yourGeomon,oppGeomon);
            } else if(turn%2 != 0){
            
               if(oppGeomon.getStamina() < oppGeomon.getAtk2()){
                  move = 4;
               } else {
                  move = rand.nextInt(3)+1;
               }
               attack(move,oppGeomon,yourGeomon);
            }
            turn++;
                 
      }
         System.out.println("----------------------------------------------------------------------------------------");
         
   }
   
   public static void attack(int move, Geomon atkGeomon, Geomon defGeomon){
      double dmgDealt=0;
      double typeMultiplier=0;
      double stamNeeded=0;
      typeMultiplier = checkType(atkGeomon.getType(), defGeomon.getType());
      
      if (move ==1){
         stamNeeded = atkGeomon.getStam1();
      } else if (move == 2){
         stamNeeded = atkGeomon.getStam2();
      } else if(move == 3){
         stamNeeded = 20;
      }
      if(atkGeomon.getBlocking()){
         atkGeomon.setBlocking(false);
      }
      
      if((move == 1 && atkGeomon.getStamina() >= stamNeeded) && (defGeomon.getBlocking() == false)){
           dmgDealt = (atkGeomon.getAtk1())* typeMultiplier;
           defGeomon.setHealth(defGeomon.getHealth()-dmgDealt);
           atkGeomon.setStamina(atkGeomon.getStamina()-stamNeeded);
           System.out.println(atkGeomon.getName() + " attacked " + defGeomon.getName() +  " with " + atkGeomon.getAtk1Name() + " and dealt " + dmgDealt + " damage.");
      } else if((move == 2 && atkGeomon.getStamina() >= stamNeeded) && defGeomon.getBlocking() == false){
           dmgDealt = (atkGeomon.getAtk2())* typeMultiplier;
           defGeomon.setHealth(defGeomon.getHealth()-dmgDealt);
           atkGeomon.setStamina(atkGeomon.getStamina()-stamNeeded);
           System.out.println(atkGeomon.getName() + " attacked " + defGeomon.getName() + " with " + atkGeomon.getAtk2Name() + " and dealt " + dmgDealt + " damage.");
      } else if (move == 3 && atkGeomon.getStamina() >= stamNeeded){
         atkGeomon.setStamina(atkGeomon.getStamina()-stamNeeded);
         atkGeomon.setBlocking(true);
      } else if (move == 4){
         atkGeomon.setStamina(atkGeomon.getStamina() + 30);
         System.out.println(atkGeomon.getName() + " recovered 30 Stamina");
      } else {
         System.out.println(atkGeomon.getName() + " doesnt have enought stamina to attack");
      }
      
      if (defGeomon.getBlocking() == true){
         System.out.println(atkGeomon.getName() + " attacked " + defGeomon.getName() + ", but it defended itself!");
         defGeomon.setBlocking(false);
      } 
   }
   
   public static double checkType(String atkGeomonType, String defGeomonType){
      if(defGeomonType == "Boss"){
         return 1;
      }
      if(atkGeomonType == "Fire"){ 
         if(defGeomonType == "Water"){
            return 0.5;
         } else if (defGeomonType == "Plant"){
            return 2.0;
         } else {
            return 1.0;
         }
      } else if (atkGeomonType == "Water"){
         if(defGeomonType == "Fire"){
            return 2.0;
         } else if (defGeomonType == "Plant"){
            return 0.5;
         } else {
            return 1.0;
         }
      } else if (atkGeomonType == "Plant"){
         if(defGeomonType == "Fire"){
            return 0.5;
         } else if (defGeomonType == "Water"){
            return 2.0;
         } else {
            return 1.0;
         }
      } 
      
      
      return 0;
   }
   
   public static void openDealer(Geomon[] hand, Geomon[] allGeomons, int []pack, int[] handIndex){
      Scanner in = new Scanner(System.in);
      System.out.println("A mysterious masked man approaches you...");
      System.out.println("He offers to trade one of his geomon for one of your geomon...");
      System.out.println("Would you like to accept his offer(Y/N)?");
      String answer = in.nextLine();
      
      if(answer.equals("N")){
         System.out.println("The man shaked his head and disapeared");
         return;
      }

      
      System.out.println("The man shows you 3 Geomon...");
      for (int i = 0; i < 3; i++){
         pack[i] = randomCard();
         System.out.println((i+1)+ ". " + allGeomons[pack[i]].getName());
      }
      int selection, swap;
      System.out.println("Which geomon would you like: ");
      selection = in.nextInt();
      
      for(int i = 0; i < 5; i++){
         System.out.println((i+1) + ". " + hand[i].getName());
      }
      System.out.println("Which geomon would you like to switch from your hand: ");
      swap = in.nextInt();
      
      hand[swap-1] = allGeomons[pack[selection-1]];
      handIndex[swap-1] = pack[selection-1];
      
      System.out.println("Your new hand: ");
      for(int i = 0; i < 5; i++){
         System.out.println((i+1) + ". " + hand[i].getName());
      }
      System.out.println("The mysterious beast nodded and flew away");
            
   }
   
   public static int randomCard(){
      Random rand = new Random();
      int randomPick = rand.nextInt(148)+1;
      if(randomPick <=5){
         return 0; // Kraken
      } else if(randomPick <=10){
         return 1; // Kraken
      } else if(randomPick <=15){
         return 2; // Kraken
      } else if(randomPick <=20){
         return 3; // Kraken
      } else if(randomPick <=25){
         return 4; // Kraken
      } else if(randomPick <=30){
         return 5; // Kraken
      } else if(randomPick <=35){
         return 6; // Kraken
      } else if(randomPick <=40){
         return 7; // Kraken
      } else if(randomPick <=45){
         return 8; // Kraken
      } else if(randomPick <=50){
         return 10; // Kraken
      } else if(randomPick <=55){
         return 11; // Kraken
      } else if(randomPick <=60){
         return 12; // Kraken
      } else if(randomPick <=65){
         return 13; // Kraken
      } else if(randomPick <=75){
         return 14; // Kraken
      } else if(randomPick <=80){
         return 15; // Kraken
      } else if(randomPick <=85){
         return 15; // Kraken
      } else if(randomPick <=90){
         return 16; // Kraken
      } else if(randomPick <=95){
         return 17; // Kraken
      } else if(randomPick <=100){
         return 18; // Kraken
      } else if(randomPick <=105){
         return 20; // Kraken
      } else if(randomPick <=110){
         return 21; // Kraken
      } else if(randomPick <=115){
         return 22; // Kraken
      } else if(randomPick <=120){
         return 23; // Kraken
      } else if(randomPick <=125){
         return 24; // Kraken
      } else if(randomPick <=130){
         return 25; // Kraken
      } else if(randomPick <=135){
         return 26; // Kraken
      } else if(randomPick <=140){
         return 27; // Kraken
      } else if(randomPick <=145){
         return 28; // Kraken
      }   else if (randomPick == 146){
         return 9;
      } else if (randomPick == 147){
         return 19;
      } else if(randomPick == 148){
         return 29;
      } else {
         System.out.println("ERROR");
         return -1;
      } 
   }
   
   public static void editSaveFile(String user, String pswrd, int[] handIndex, int lvl){
      try {
         File save = new File(user);
         FileWriter writer = new FileWriter(user);
         BufferedWriter bwriter = new BufferedWriter(writer);
         bwriter.write(pswrd);
         bwriter.newLine();
         
         for(int i = 0; i < 5; i++){
            bwriter.write(Integer.toString(handIndex[i]));
            bwriter.newLine();
         }
         bwriter.write(Integer.toString(lvl));
         bwriter.newLine();
         bwriter.close();
      }catch (IOException ex){
         System.out.println("Error");
      }

   }
}