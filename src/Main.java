public class Main {
    public static void main(String[] args) {
        System.out.println("array");

        //Zadanie 1

        System.out.println("Zadanie 1");

        int [] weight = new int [3];

        weight[0]=1;
        weight[1]=2;
        weight[2]=3;

        float [] arr = new float[] {1.57f, 7.654f, 9.986f};

        int [] myarr = new int [] {56, 27, 258, 147, 695, 2, 13};

        //Zadanie 2

        System.out.println("Zadanie 2");

        for (int i=0; i<weight.length; i++) {
            if (i<weight.length-1){
                System.out.print(weight[i] + ", ");}
            else System.out.println(weight[i]);
        }


        for (int o=0; o<arr.length; o++) {
            if (o<arr.length-1){
                System.out.print(arr[o] + ", ");}
            else System.out.println(arr[o]);
        }


        for (int m=0; m<myarr.length; m++) {
            if (m<myarr.length-1){
                System.out.print(myarr[m] + ", ");}
            else System.out.println(myarr[m]);
        }

        //Zadanie 3

        System.out.println("Zadanie 3");

        for (int x = weight.length-1; x>=0; x--) {
            if (x>0){
            System.out.print(weight[x]+", ");}
            else System.out.println(weight[x]);
        }

        for (int y = arr.length-1; y>=0; y--) {
            if (y>0){
                System.out.print(arr[y]+", ");}
            else System.out.println(arr[y]);
        }

        for (int z = myarr.length-1; z>=0; z--) {
            if (z>0){
                System.out.print(myarr[z]+", ");}
            else System.out.println(myarr[z]);
        }

        //Zadanie 4

        System.out.println("Zadanie 4");


        for (int a=0; a<weight.length; a++) {
            if (weight[a]%2==1){
                weight[a]+=1;}
            if (a<weight.length-1){
                System.out.print(weight[a] + ", ");}
            else System.out.println(weight[a]);

        }

    }
}