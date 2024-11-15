public class Refrigerator {
    
    private boolean hasWorkToDo;

    
    public Refrigerator(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public boolean getHasWorkToDo() {
        return hasWorkToDo;
    }

    public void orderFood() {
        System.out.println("Ordering food");
    }

}
