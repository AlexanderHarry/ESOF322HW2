public class Main {
    public static void main(String args[]) {
        MathSoftware mathematica = new Mathematica();
        MathSoftware mTool = new MTool();
        MathSoftware myMath = new MyMath();
        mathematica.performSort();
        mTool.performSort();
        myMath.performSort();

        mathematica.set_sort(new Bubble());

        mathematica.performSort();
    }
}