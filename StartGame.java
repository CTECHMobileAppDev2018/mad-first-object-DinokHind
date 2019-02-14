
public class StartGame {
  
  public static void main(String[] args) {
   
    Player player1 = new Player();
    player1.setName("Mr. Bartucz");
    //making player 2
    Player player2 = new Player();
    player2.setName("Silas");
    player2.setHealth(105);
    
    Goblin goblin1 = new Goblin();
    goblin1.setName("Throrjack");
    
    System.out.println("Player1 name is: " + player1.getName());
    System.out.println("Player2 name is: " + player2.getName());
    System.out.println("Goblin1 name is: " + goblin1.getName());
    
    // this won't work until you create a getHealth method in your object. Uncomment it when you do.
    System.out.println(player1.getName() + "'s health is: " + player1.getHealth());
    
    //printing player 2 health
    System.out.println(player2.getName() + "'s health is at: " + player2.getHealth());
    
    //printing out goblin health
    System.out.println(goblin1.getName() + " is at " + goblin1.getHealth() + " health.");
   
    //goblin attacks
    System.out.println(goblin1.getName() + " attacks.");
    player2.setHealth((player2.getHealth() - goblin1.getDamage()));
      
    System.out.println(player2.getName() + " has been left at " + player2.getHealth() + " health after " + goblin1.getName() + "attacked.");
  }  
  
}