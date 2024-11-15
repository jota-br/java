public class DishWasher {
    private boolean hasWorkToDo;

    public boolean getHasWorkToDo() {
        return hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
    
    public void doDishes() {

        if (this.hasWorkToDo) {
            System.out.println("Washing dishes");
            this.hasWorkToDo = false;
        }
    }

}
