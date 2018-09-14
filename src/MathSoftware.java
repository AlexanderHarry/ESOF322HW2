public abstract class MathSoftware implements SortMethods {

    SortMethods sm;

    public void performSort() {
        sm.sort();
    }


    public void set_sort(SortMethods arg) {
        this.sm = arg;
    }
}
