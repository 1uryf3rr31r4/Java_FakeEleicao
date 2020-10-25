package eleicao;
import java.util.Scanner;

public class Eleicao
{   
    public static void main(String[] args)
    {
        int voto, lula = 0, bolsonaro = 0, eneas = 0, branco = 0, nulo = 0;
    
        System.out.println("Eleições 2018");
        System.out.println("Canditado Lula - 13");
        System.out.println("Canditado Bolsonaro - 17");
        System.out.println("Canditado Eneas - 56");
         
        Scanner scan = new Scanner(System.in);
           
        do
        {
            System.out.println("Digite o número do candidato: ");
            voto = scan.nextInt();
              
            if(voto == 13)
            {
                lula+=1;
            }
            else if(voto == 17)
            {
                bolsonaro+=1;               
            }
            else if(voto == 56)
            {
                eneas+=1;
            }
            else if(voto == 00)
            {
                branco+=1;
            }
            else if(voto == 99)
            {
                nulo+=1;
            }
        }while(voto != -1);
        
        if(lula > bolsonaro && lula > eneas)
        {
            System.out.println("O Candidato eleito foi Lula" );
        }
        else if(bolsonaro > lula && bolsonaro > eneas)
        {
            System.out.println("O Candidato eleito foi Bolsonaro");
        }
        else if(eneas > lula && eneas > bolsonaro)
        {
            System.out.println("O Candidato eleito foi Eneas");
        }
        
        System.out.println("Quantidade de Votos em Branco: "+ branco);
        System.out.println("Quantidade de Votos Nulos: "+ nulo);
       
        }         
    }
