public abstract class MathSoftware {

    SortMethods sm;

    public void performSort() {
        this.sm.sort();
    }

    public void set_sort(SortMethods arg) {
        this.sm = arg;
    }
}
