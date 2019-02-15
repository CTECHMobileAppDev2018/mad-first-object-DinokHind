
public class StartGame {
  
  public static void main(String[] args) {
   
    Player player0 = new Player();
    player0.setName("Mr. Bartucz");
    //making player 2
    Player player1 = new Player();
    player1.setName("Silas");
    player1.setHealth(105);
    
    Goblin goblin1 = new Goblin();
    goblin1.setName("Throrjack");
    
    System.out.println("Player1 name is: " + player0.getName());
    System.out.println("Player2 name is: " + player1.getName());
    System.out.println("Goblin1 name is: " + goblin1.getName());
    
    // this won't work until you create a getHealth method in your object. Uncomment it when you do.
    System.out.println(player0.getName() + "'s health is: " + player0.getHealth());
    
    //printing player 2 health
    System.out.println(player1.getName() + "'s health is at: " + player1.getHealth());
    
    //printing out goblin health
    System.out.println(goblin1.getName() + " is at " + goblin1.getHealth() + " health.");
   
    //goblin attacks
    System.out.println(goblin1.getName() + " attacks.");
    player1.setHealth((player1.getHealth() - goblin1.getDamage()));
    
    //printing attack results
    System.out.println(player1.getName() + " has been left at " + player1.getHealth() + " health after " + goblin1.getName() + " attacked.");
    
    //adding a player array
    Player[] playerArray = new Player[5];
    
    //adding players to the array
    playerArray[0] = player0;
    playerArray[1] = player1;
    
    //printing the player names
    for (int i = 0; i < (playerArray.length); i++){
      if (playerArray[i] != null){
        System.out.println("Player" + i + "'s name is " + playerArray[i].getName());
      }
    }
    
  }  
  
}