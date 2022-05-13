/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bonjournom;
import aleatoire.Person;
/**
 *
 * @author pham07058706
 */
public class BonjourNom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Mises a jour de BonjourNom dans Test_
        Person martin = new Person(args[0],args[1],Integer.parseInt(args[2]));
        System.out.println("Bonjour "+martin.getFirstName()+" "+martin.getLastName()+ " "+martin.getAge());
    }
    
}
