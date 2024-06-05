import java.util.HashSet;
import java.util.Iterator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("persone è " + nomiPersone());
//creazione del secondo hashset
        HashSet<String> persone2 = nomiPersone();
        String nome = "Andrea";

        //Uso l'iteratore per andarmi a svuotare l'hashset

        Iterator<String> iterator = persone2.iterator();
        while (iterator.hasNext()){
            iterator.next();
            if (persone2.contains(nome)){
                iterator.remove();
            }
        }
        System.out.println("hashset svuotato: " + persone2);
    }

//metodo in cui vado a crearmi un hashset
    private static HashSet<String> nomiPersone() {
        HashSet<String> persone = new HashSet<>();

        persone.add("Andrea");
        persone.add("Giuseppe");
        persone.add("Daniele");
        persone.add("Francesco");

        return persone;
    }
}