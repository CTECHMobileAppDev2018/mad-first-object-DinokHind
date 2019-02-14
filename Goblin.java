//enemy class
public class Goblin{
  
  //enemy stat stuff
  private String name;
  private int health;
  private int damage;
  
  //constructor
  Goblin(){
    this.health = 20;
    this.damage = 5;
  }
  
  //for getting damage
  public int getDamage(){
    return this.damage;
  }
  
  //for setting name
  public void setName(String enemyName){
    if (enemyName.length() > 0){
    this.name = enemyName;
    } else {
      this.name = "error";
    }
  }
  
  //for getting name
  public String getName(){
    return this.name;
  }
  
  //for setting health
  public void setHealth(int enemyHealth){
    if (enemyHealth > 0){
      this.health = enemyHealth;
    } else {
      this.health = 0;
    }
  }
  
  //for getting health
  public int getHealth(){
    return this.health;
  }
}