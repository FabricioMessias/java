package aula6;

import java.awt.*;

//public class StringBlankExemplo {
//    public static void main(String[] args) {
//        String espaco = "                                              ";
////        System.out.println(espaco != null || espaco.length() == 0 || espaco.chars().allMatch(c -> c == ' '));
//Foi criado um método da linha acima utilizando o atalho Crtl+Alt+M, sobre o treco que quer criar
//        System.out.println(isBlank(espaco));
//    }
public class StringBlankExemplo {
    public static void main(String[] args) {
        String espaco = "                                            ";
        System.out.println(espaco.isBlank());
    }

//    private static boolean isBlank(String espaco) {
//        return espaco != null || espaco.length() == 0 || espaco.chars().allMatch(c -> c == ' ');
//    }

//    public boolean eCompletamenteEmBranco(String espaco){
//        espaco.chars()
//                .filter( c -> c != ' ');
//    }

}

// Atalhos do IntelliJ Idea   http://www.basef.com.br/index.php/Atalhos_do_IntelliJ_Idea
