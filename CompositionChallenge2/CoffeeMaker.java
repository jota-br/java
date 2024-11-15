public class CoffeeMaker {
    
    private boolean hasWorkToDo;

    public boolean getHasWorkToDo() {
        return hasWorkToDo;
    }
    
    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void brewCoffee() {

        if (this.hasWorkToDo) {
            System.out.println("Brewing coffee");
            this.hasWorkToDo = false;
        }
    }
}
