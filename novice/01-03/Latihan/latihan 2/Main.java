package tutorial;

class Player{
    String name;
    double health;
    int level;

    Weapon weapon;
    Armor armor;

    Player(String name, double health){
        this.name = name;
        this.health = health;
    }
    void equipWeapon(Weapon weapon){
this.weapon = weapon;
    } 
}

class Weapon{
    double attackPower;
    String name;


    Weapon(String name, double attackPower){
        this.name = name;
        this.attackPower = attackPower;
 
    }
    void display(){
        System.out.println("Weapon : "+ this.name + ", power : " + this.attackPower);
    }
}

class armor{
    double defencePower;

  Armor(double defencePower){
    this.defencePower = defencePower;
}

public class Main{
public static void main(String[] args) {
    
    Player player1 = new Player("ucup",100);
    
    Weapon pedang = new Weapon("pedang",15);

    Armor bajuBesi = new Armor(10);

    player1.equipWeapon(pedang);
    player1.weapon.display();
}
}