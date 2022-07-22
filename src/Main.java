public class Main {
    public static void main(String[] args) {
        task_1();
    }

    public static void task_1() {
//        1. Целочисленный массив, заполненный тремя цифрами – 1, 2 и 3 – с помощью ключевого слова new.

        int[] masTask1 = new int[]{1,2,3};

//        2. Массив, в котором можно хранить три дробных числа – 1.57, 7.654, 9.986 –  сразу заполнив его значениями.

        double [] masTask2 = {1.57, 7.654, 9.986};

//        3. Произвольный массив – тип и количество данных определите сами. Самостоятельно выберите способ создания
//        массива: с помощью ключевого слова или сразу заполненный элементами.

        int [] masTask3 = new int[5];

//        Пройдите по каждому из трех массивов и распечатайте все элементы всех трех массивов, начиная с первого элемента,
//                через запятую. Запятая между последним элементом одного массива и первым элементом следующего не нужна.

        for(int i=0; i<masTask1.length; i++){
            System.out.print(masTask1[i]);
            if(i<masTask1.length-1){System.out.print(", ");}
            else{System.out.print(" ");}
        }
        for(int i=0; i<masTask2.length; i++){
            System.out.print(masTask2[i]);
            if(i<masTask2.length-1){System.out.print(", ");}
            else{System.out.print(" ");}
        }
        for(int i=0; i<masTask3.length; i++){
            System.out.print(masTask3[i]);
            if(i<masTask3.length-1){System.out.print(", ");}
        }
        System.out.println("");

//        Теперь ваша задача – распечатать все элементы всех трех массивов, но начинать нужно не
//        с первого элемента массива, а с последнего. Элементы должны быть распечатаны через запятую,
//        при этом элементы одного массива располагаются на одной строчке, а элементы другого массива – на другой.
//        Запятая между последним элементом одного массива и первым элементом следующего не нужна.

        for(int i=masTask1.length-1; i>=0; i--){
            System.out.print(masTask1[i]);
            if(i>0){System.out.print(", ");}
            else{System.out.print(" \n");}
        }
        for(int i=masTask2.length-1; i>=0; i--){
            System.out.print(masTask2[i]);
            if(i>0){System.out.print(", ");}
            else{System.out.print(" \n");}
        }
        for(int i=masTask3.length-1; i>=0; i--){
            System.out.print(masTask3[i]);
            if(i>0){System.out.print(", ");}
        }

//        Пройдитесь по первому целочисленному массиву и все нечетные числа в нем сделайте четными (нужно прибавить 1).
//        Важно: код должен работать с любым целочисленным массивом, поэтому для решения задания вам нужно использовать циклы.
//         Распечатайте результат преобразования в консоль.

        System.out.println("");

        for(int i=0; i<masTask1.length; i++){
            if(masTask1[i]%2!=0){masTask1[i]+=1;}
            System.out.print(masTask1[i]);
            if(i<masTask1.length-1){System.out.print(", ");}
            else{System.out.print(" ");}
        }
    }
}