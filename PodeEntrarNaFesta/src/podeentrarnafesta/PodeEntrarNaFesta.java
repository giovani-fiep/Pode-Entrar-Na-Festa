package podeentrarnafesta;


// Classe principal
public class PodeEntrarNaFesta {
    // Método principal (programa que será executado)
    public static void main (String[] args) {
        // Declaração de variável 
        int idade;
        // Atribuir um valor a variável idade 
        idade = 17;
        // Mostrar na tela
        System.out.println("Minha idade é "+idade); 
        // Aumentar a idade        idade = 18;
        // Mostrar na tela 
        System.out.println("Minha idade é "+idade);
        // Acrescenta 1 a idade  
        idade = idade + 1;
        idade = idade + 1;  
        // Mostrar na tela 
        System.out.println("Minha idade é " + idade);
        // Criar variavel para salvar a resposta 
        String resposta; 
        resposta = podeEntrarNaFesta(idade);
        // Mostrar na tela 
        System.out.println("Pode entrar na festa? " + resposta);
    }       
    // Método/função  
    static String podeEntrarNaFesta (int idade_da_pessoa) { 
        if (idade_da_pessoa >= 18) {
            return "Sim";      
        }        else {    
            return "Não";     
        }    
    }
}
