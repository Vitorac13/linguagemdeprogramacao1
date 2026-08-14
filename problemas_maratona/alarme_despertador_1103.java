//1103 - Alarme Despertador
//https://judge.beecrowd.com/pt/problems/view/1103

/*
Daniela é enfermeira em um grande hospital, e tem os horários de trabalho muito variáveis. 
Para piorar, ela tem sono pesado, e uma grande dificuldade para acordar com relógios 
despertadores.
Recentemente ela ganhou de presente um relógio digital, com alarme com vários tons, e tem 
esperança que isso resolva o seu problema. No entanto, ela anda muito cansada e quer 
aproveitar cada momento de descanso. Por isso, carrega seu relógio digital despertador 
para todos os lugares, e sempre que tem um tempo de descanso procura dormir, programando 
o alarme despertador para a hora em que tem que acordar. No entanto, com tanta ansiedade 
para dormir, acaba tendo dificuldades para adormecer e aproveitar o descanso.
Um problema que a tem atormentado na hora de dormir é saber quantos minutos ela teria de 
sono se adormecesse imediatamente e acordasse somente quando o despertador tocasse. Mas 
ela realmente não é muito boa com números, e pediu sua ajuda para escrever um programa que, 
dada a hora corrente e a hora do alarme, determine o número de minutos que ela poderia 
dormir.

Entrada
A entrada contém vários casos de teste. Cada caso de teste é descrito em uma linha, 
contendo quatro números inteiros H1 , M1 , H2 e M2, com H1:M1 representando a hora e 
minuto atuais, e H2:M2 representando a hora e minuto para os quais o alarme  despertador 
foi programado (0≤H1≤23, 0≤M1≤59, 0≤H2≤23, 0≤M2 ≤59).
O final da entrada é indicado por uma linha que contém apenas quatro zeros, separados por 
espaços em branco.

Saída
Para cada caso de teste da entrada seu programa deve imprimir uma linha, cada uma contendo 
um número inteiro, indicando o número de minutos que Daniela tem para dormir.
*/

/*ulizando o scanner porque os valores de entrada são em uma unica linha, 
e essa foi a forma que achei pra ler os valores assim. Usamos o IO.readln, 
mas assim a entrada seria dada em 4 linhas.*/
import java.util.Scanner; 

void main(){

    Scanner sc = new Scanner(System.in);

    int h1=1, m1=1, h2=1, m2=1;
    h1 = sc.nextInt();
    m1 = sc.nextInt();
    h2 = sc.nextInt();
    m2 = sc.nextInt();

    while(h1!=0 || m1!=0 || h2!=0 || m2!=0){


        if(h1 > h2 || (h1 == h2 && m1 > m2) || (h1 == h2 && m1 == m2)){
            h2 += 24;
        }

        int t1 = h1*60 + m1;
        int t2 = h2*60 + m2;

        System.out.println(t2-t1);

        h1 = sc.nextInt();
        m1 = sc.nextInt();
        h2 = sc.nextInt();
        m2 = sc.nextInt();

    }
}