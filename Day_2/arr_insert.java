package Day_2;

public class arr_insert {
    public static void main(String[] args) {
        int[] arr= new int[5];  // Hamesa yaad ye rakhn a hai jab bhi mujhe insert krwana ho to array me size extra krna hoga
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
        // hum chate hai postion 2 pe 25 value ko assign ke like [10,20,25,30,40]
        int size=4; // means 3 this arr
        int postion=2; // index of 2 
        int value=25;  // yhi value ko assign kr na hai

        // ab hum ek loop chalayege 
        for(int i=size; i>postion; i--){
            arr[i]=arr[i-1];
        }
        arr[postion]=value;
        size++;

        for(int i=0; i<size; i++){
            System.out.println(arr[i]);
        }
    }
}
