public class Refrigerator {
    
    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public boolean getHasWorkToDo() {
        return hasWorkToDo;
    }

    public void orderFood() {
        
        if (this.hasWorkToDo) {
            System.out.println("Ordering food");
            this.hasWorkToDo = false;
        }
    }
}
