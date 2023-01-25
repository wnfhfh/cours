package cours01_fichiersTextesSort;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * @author Robert Aubé
 * @version 1.0 (Date de création: 2022-11-29)
 */
public class PizzaArrayList {
    private ArrayList<Pizza> listPizza;

    public PizzaArrayList() {
        this.listPizza = new ArrayList<Pizza>();
    }

    public void ajouterPizza(Pizza p) {
        listPizza.add(p);
    }

    public void enleverPizza(int i) {
        listPizza.remove(i);
    }

    public void enleverPizza(Pizza p) {
        listPizza.remove(p);
    }

    public void avancerToutesLesPizzas() {
        for (int i = 0; i < listPizza.size(); i++) {
            listPizza.get(i).avancerX();
        }
    }

    public void trier(){
        listPizza.sort(Comparator.naturalOrder());
    }

    @Override
    public String toString() {
        return "PizzaArrayList{" +
                "listPizza=" + listPizza +
                '}';
    }
}
