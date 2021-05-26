package strings;

public class Exercicios {

    public static void main(String[] args) {

        var nome = "André";
        var sobreNome = "Gomes";
        final var nomeCompleto = nome + " " + sobreNome;
        String aula = " Aula   de     java ";

        System.out.println("A B C D E F G".toCharArray());
        System.out.println("Aula excelente de Java".split(" "));

        String[] arrayList = "Aula excelente de Java".split(" ");
        System.out.println(arrayList);
        System.out.println("\nA frase tem -> " + arrayList.length + " Palavras");
        for (String palavras : arrayList) {
            System.out.println(palavras);
        }

        System.out.println("\n" + aula.trim().replaceAll("\\s+", " "));
        System.out.println("\nAula".concat(" de Java Avançado"));
        System.out.println("1234 asda qw".replaceAll("[0-9]", "#"));

    }
}
