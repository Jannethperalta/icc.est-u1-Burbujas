public class MetodosdeOrdenamiento {

    import java.util.Arrays;

public class MetodoOrdenamiento {

    public int[] sortBubbleAdvance (int[] array){
        int n= array.length;
        for (int i =0; i< n ; i++){
            System.out.println("Pasada"+i);
            for ( int j=0 ;j<n-1; j++ ){
                System.out.println("j= "+j+" [j]"+array[j]);
                if (array[j] > array[j+1]){
                    System.out.println("Si hay cambio");
                //Intercambio
                int aux = array[j];
                array [j] = array [j+1];
                array[j+1] = aux;}

            }
        }
        return array;
    }

    public void printArray(int[] arrOrdenado) {
        System.out.println("Arreglo Ordenado: "+Arrays.toString(arrOrdenado));
    }
    
}

    