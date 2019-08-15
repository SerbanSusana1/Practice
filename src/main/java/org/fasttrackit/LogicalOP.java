package org.fasttrackit;

public class LogicalOP {

    public  void  printNr(int nr){
        for (int i=nr;i<100;i++){
            System.out.print(i+" " );
        }
    }

    public  void  printNr1(int nr){
        for (int i=nr;i>-100;i--){
            System.out.print(i+" ");
        }
    }

    public void nrPare(){
        int i=1;
        String text="" ;
        for(i=1;i<=100;i++){

            if(i % 2 == 0){
                text = text + i+" ";
            }
        }
        System.out.print(text);
    }

    public  void nrImpare(){
        int i = 1;
        String text="";

        for (i=1;i<=100;i++){
            if (i % 2 !=0){
                text =text + i +" ";
            }
        }
        System.out.print(text);

    }

    public  void sumaNr(int nr){
        int suma =0;
        int i;
        for ( i=nr; i<100; i++){
            suma = suma+i;
        }
        System.out.print("Suma este :" + suma);

    }

    public  void  mediaNr(int nr){
        double media=0 ;
        int i;
        for (i=nr;i<100;i++){
           media=media + i;
        }
        media=media/i;
        System.out.println("Media este :" + media);

    }


    public  void  printNr2(int nr1, int nr2){
        for (int i=nr1;i<nr2;i++){
            System.out.print(i+" ");
        }
    }


    public void printAst(){
        String text;
        int i;

        for (i=7;i>0;i--){
            text="";
            for(int k=1; k<=i;k++) {
                text=text+"*";
            }
            System.out.println(text);
        }
        System.out.println();


    }

    public static void main (String[] arg){
        LogicalOP ex1= new LogicalOP();
        ex1.printNr(4);
        System.out.println();
        ex1.printNr1(4);
        System.out.println();
        ex1.printNr2(5,78);
        System.out.println();
        ex1.nrPare();
        System.out.println();
        ex1.nrImpare();
        System.out.println();
        ex1.sumaNr(7);
        System.out.println();
        ex1.mediaNr(8);
        System.out.println();
        ex1.printAst();
    }
}

