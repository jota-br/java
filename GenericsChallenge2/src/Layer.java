import java.util.ArrayList;
import java.util.List;

public class Layer <T extends Mappable> {

    private List<T> elementsList;

    public Layer(T[] elementsList) {
        this.elementsList = new ArrayList<T>(List.of(elementsList));
    }

    public void addElements(T... elements) {

        elementsList.addAll(List.of(elements));
    }

    public void renderLayer() {

        for (T e : elementsList) {
            e.render();
        }
    }
}
