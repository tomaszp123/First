/*
	Created by Tomasz Pajewski on 2020-01-28.
	Java some table examples
*/
public class 00_tabl{
	
	public static void main(String[] args) {
        int tab[] = new int[5];
        int[] tab1 = new int[5]; // zapis równoiważny z tab
        tab[0] = 5;
        tab = [9,6,8,4,3];
        System.out.println("Tablica "+tab[0]);
        for(i:=0; i<5; i++){
            System.out.println("Tablica [i] ="+tab[i]);
        }
        for(i: tab){
            System.out.println("Tablica [i] ="+i);
        }
        int i=0;
        for(; i<tab.length; ){
            System.out.println("Tablica [i] ="+tab[i]);
            i++;
        }
        int n=tab.length;
        while(n>0){
            System.out.println("Tablica [i] ="+tab[n]);
            n--;
        }
        n=tab.length;
        do{
            System.out.println("Tablica [i] ="+tab[n]);
            n--;
        }
        while(n>0);
        int[][] tab3 = {{2,3,4},{1,2,3}};
        int i,j=0
        for(;i<tab3.length;i++){
            for(;j<tab3[i].length;j++){
                System.out.println("Tablica ["+i+"]["+j+"] ="+tab3[i][j]);
            }
        }
	}
}