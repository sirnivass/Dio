/* Classe executável.
 * Logo, necessita ter um método principal, esse método é o main.
 * Toda classe precisa existir no seu diretório src do seu projeto.
 * Nomes em maiúsculos
 * 
 */

public class MinhaClasse { // Nomes de Classe iniciam-se sempre com letras maiúsculas.

    /*
     * Nosso método main, é 'especial', por isso precisa seguir um padrão:
     * public
     * static
     * void
     * parâmetros: String[] args
     * string, feita por um array "[]" e nessas Strings, possuem argumentos.
     */
    public static void main(String[] args) { //main é o método principal da classe executávelSystem = Classe do sitema, possui operações de input e output.
        
        //Variáveis:
        String primeiroNome = "Rodolffo", segundoNome = "Nivass", nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        int anoDeNascimento;
        System.out.print("Olá pessoas!");
    
    }

    public static String nomeCompleto(String primeiroNome String segundoNome) {
        return primeiroNome.contains(" ").contains(segundoNome);
    }    
}