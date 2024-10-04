public class App {
    public static void main(String[] args) throws Exception {
        MetodoOrdenamiento mO = new MetodoOrdenamiento();

        int[] arr = {1,5,198,10,984,9,4,89,8,};
        int [] arrOrdenado = mO.sortBubbleAdvance(arr);

        mO.printArray (arrOrdenado);
    }
}
   