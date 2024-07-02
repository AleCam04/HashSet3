/*
Scrivere una funzione che restituisca un hashset riempito
Creare un oggeto dello stesso tipo inserito nell'HashSet e popolarlo
Scorrere il set, per ogni elemento verificare se è uguale all'oggetto creato ed eliminarlo
Svuotare l'hashset, verificarlo e stampare il risultato
*/

import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> numero = numeri();
        Integer a = 1;
        numero.add(a);

        Iterator<Integer> iterator= numero.iterator();
        while (iterator.hasNext()){
            Integer element = iterator.next();
            if(element.equals(a)){
                System.out.println("Elemento: " + a +" nel HashSet");
                iterator.remove(); //<--------------------
                System.out.println("Elemento tolto");
            }
        }
        System.out.println(numero);
        numero.clear();
        System.out.println("HashSet eliminato:" + numero);
    }

    public static HashSet<Integer> numeri(){
        HashSet<Integer> numero = new HashSet<>();
        numero.add(1);
        numero.add(2);
        numero.add(3);
        numero.add(4);
        return numero;
    }
}