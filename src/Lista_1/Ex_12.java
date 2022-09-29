/*
Neste problema, você deverá ler 3 palavras que definem o tipo de animal
possível segundo o esquema abaixo, da esquerda para a direita. Em seguida
conclua qual dos animais seguintes foi escolhido, através das três palavras
fornecidas.
Entrada
A entrada contém 3 palavras, uma em cada linha, necessárias para identificar o
animal segundo a figura acima, com todas as letras minúsculas.
Saída
Imprima o nome do animal correspondente à entrada fornecida.
 */

package Lista_1;

import java.util.Scanner;

public class Ex_12 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String s1,s2,s3;
        System.out.println("Escolha dentre as opções da lista:\nVertebrado\nInvertebrado\n\nAve\nMamifero\nInseto\nAnelidio\n\nCarnivoro\nOnivoro\nHerbivoro\nHematofago\n");
        s1 = s.next();
        s2 = s.next();
        s3 = s.next();
        if(s1.equalsIgnoreCase("Vertebrado (Ave ou Mamifero)")){
            if(s2.equalsIgnoreCase("Ave")){
                if(s3.equalsIgnoreCase("Carnivoro")){
                    System.out.println("Águia");
                }else if(s3.equalsIgnoreCase("Onivoro")){
                    System.out.println("Pomba");
                }

            }else if(s2.equalsIgnoreCase("Mamifero")){
                if(s3.equalsIgnoreCase("Onivoro")){
                    System.out.println("Homem");
                }else if(s3.equalsIgnoreCase("Herbivoro")){
                    System.out.println("Vaca");
                }else{
                    System.out.println("Nenhum animal encontrado com essas especificações.");
                }
            }else{
                System.out.println("Nenhum animal encontrado com essas especificações.");
            }

        }else if(s1.equalsIgnoreCase("Invertebrado (Inseto ou Anelidio)")){
            if(s2.equalsIgnoreCase("Inseto")){
                if(s3.equalsIgnoreCase("Hematofago")){
                    System.out.println("Pulga");
                }else if(s3.equalsIgnoreCase("Herbivoro")){
                    System.out.println("Lagarta");
                }
            }else if(s2.equalsIgnoreCase("Anelidio")){
                if(s3.equalsIgnoreCase("Hematofago")){
                    System.out.println("Sanguessuga");
                }else if(s3.equalsIgnoreCase("Onivoro")){
                    System.out.println("Minhoca");
                }else{
                    System.out.println("Nenhum animal encontrado com essas especificações.");
                }
            }else{
                System.out.println("Nenhum animal encontrado com essas especificações.");
            }
        }else{
            System.out.println("Escolha entre Vertebrado ou Invertebrado!");
        }
    }
}