/* Aula Estruturas condicionais. - Data: 01/09/22
* Lab.ATP - SI - 2/2022
* Aluno(a): Nome do aluno(a)Lucas Soares Dos Reis
* Profa. Michelle Nery Nascimento
* Exerc 1.A equipe Ferrari (F-1) deseja calcular o número mínimo de litros que
deverá colocar no tanque
de seu carro para que ele possa percorrer um determinado número de voltas até
o primeiro reabastecimento.
Escreva um programa que leia o comprimento da pista (em metros), o número
total de voltas a serem percorridas no grande prêmio,
o número de reabastecimentos desejados e o consumo de combustível do carro (em
Km/L).
Calcular e escrever o número mínimo de litros necessários para percorrer até o
primeiro reabastecimento.
OBS: Considere que o número de voltas entre os reabastecimentos é o mesmo*/
import java.util.*;
public class atv1{
//DECLARANDO VARIAVEIS
 public static void main(String[]args){
float comprimentopista,comprimentototal,totalvoltas,paradas,consumo,
comprimentoporvolta,primeiraparada;
//PEDINDO AO USUARIO AS INFORMAÇOES
 Scanner leitura=new Scanner(System.in);
 System.out.println("DIGITE O COMPRIMENTO DA PISTA EM METROS");
 comprimentopista = leitura.nextFloat();
 System.out.println("DIGITE O NUMERO TOTAL DE VOLTAS");
 totalvoltas = leitura.nextFloat();
 System.out.println("DIGITE O NUMERO DE REABASTECIMENTOS DESEJADOS");
 paradas = leitura.nextFloat();
 System.out.println("DIGITE O CONSUMO DO VEICULO EM KM/L");
 consumo = leitura.nextFloat();
//PROCESSANDO DADOS
 comprimentototal=(comprimentopista * totalvoltas) / 1000;
 comprimentoporvolta= comprimentototal / paradas;
 primeiraparada = comprimentoporvolta/consumo;
//MOSTRANDO RESULTADO
System.out.println("A EQUIPE FERRARI DEVERA COLOCAR NO SEU TANQUE NO MINIMO "
+ primeiraparada + " LITROS DE COMBUSTIVEL" );
 leitura.close();
 }
}
/*Exerc 2. Uma empresa deseja interligar alguns computadores, para isso deseja
saber quantos
switch’s comprar. Faça um programa que leia o número de computadores a serem
interligados e a
quantidade de portas por switch, informe quantos switch’s deverão ser
adquiridos. Para cada porta
do switch pode-se ligar apenas um computador. Considere que todos os switches
terão a mesma
quantidade de portas.*/
import java.util.*;
public class atv2{
 //DECLARANDO VARIAVEIS
 public static void main(String[]args){
 int numerodecomputadores,quantportas,resultado;
 //PEDINDO AO USUARIO AS INFORMAÇOES
 Scanner leitura = new Scanner(System.in);
 System.out.println("DIGITE O NUMERO DE COMPUTADORES");
 numerodecomputadores=leitura.nextInt();
 System.out.println("DIGITE A QUANTIDADES DE PORTAS POR SWITCH`S");
 quantportas=leitura.nextInt();
 //PROCESSANDO DADOS
 resultado=numerodecomputadores/quantportas;
 //MOSTRANDO RESULTADO
 System.out.println("O NUMERO DE SWITCH`S NECESSARIOS PARA INTERLIGAR "+
numerodecomputadores +
 " COMPUTADORES É DE " + resultado + " SWITCH`S");
 leitura.close();
 }
}
/*Exerc 3.Uma companhia de carros paga a seus empregados um salário de R$
500,00 por mês
mais uma comissão de R$ 50,00 para cada carro vendido e mais 5% do valor total
da venda.
Elabore um programa para calcular e imprimir o nome e o salário do vendedor
num dado mês
recebendo como dados de entrada o nome do vendedor, o número de carros
vendidos e o valor
total das vendas.
*/
import java.util.*;
public class atv3{
//DECLARANDO VARIAVEIS
 public static void main(String[]args){
 String nome;
 int numerodecarrosvendidos;
 float valortotalvendas,comissao;
 double total;
 double comissaovalortotal;
//PEDINDO AO USUARIO AS INFORMAÇOES
 Scanner leitura = new Scanner(System.in);
 System.out.println("DIGITE O NOME DO VENDEDOR");
 nome=leitura.nextLine();
 System.out.println("DIGITE A QUANTIDADE DE CARROS VENDIDOS");
 numerodecarrosvendidos=leitura.nextInt();
 System.out.println("DIGITE O VALOR TOTAL DAS VENDAS");
 valortotalvendas=leitura.nextFloat();
 //PROCESSANDO DADOS
 comissao=numerodecarrosvendidos*50;
 comissaovalortotal=(valortotalvendas*0.05);
 total=500+comissao+comissaovalortotal;
 //MOSTRANDO RESULTADO
 System.out.println("O FUNCIONARIO " +nome+" VAI RECEBER O SEU SALARIO FIXO
DE R$500 + UM VALOR DE R$50"+
 " POR CADA CARRO VENDIDO + UMA COMISSÃO DE 5% DO VALOR TOTAL DAS VENDAS.O
SALARIO FINAL DE "+ nome+
 " SERA DE R$ " +total);
 leitura.close();
 }
}
/*Exerc 4.Considerando que o índice de reajuste para determinada classe social
foi acordado para
ser um índice de reposição salarial (em porcentagem) mais um índice de
produtividade (em
porcentagem) que cada empresa irá definir, faça um programa que leia o código
de um
funcionário (número inteiro), seu salário atual, o índice de reposição
salarial e o de produtividade e
calcule o novo salário do funcionário. Escrever o código do funcionário, seu
salário atual, quanto
terá de aumento e o novo salário. */
import java.util.*;
public class atv4{
 //DECLARANDO VARIAVEIS
 public static void main(String[]args){
 int codfunc;
 float salarioatual;
 double reposiçaosalarial,produtividade;
 double totalaumento;
 double total;
 //PEDINDO AO USUARIO AS INFORMAÇOES
 Scanner leitura = new Scanner(System.in);
 System.out.println("DIGITE O CODIGO DO FUNCIONARIO");
 codfunc=leitura.nextInt();
 System.out.println("DIGITE O SALARIO ATUAL DO FUNCIONARIO");
 salarioatual=leitura.nextFloat();
 System.out.println("DIGITE QUANTOS PORCENTO ELE IRA TER DE REPOSIÇAO
SALARIAL");
 reposiçaosalarial=leitura.nextDouble();
 System.out.println("DIGITE EM PORCENTO O INDICE DE PRODUTIVIDADE DO
FUNCIONARIO DEFINIDO PELA EMPRESA");
 produtividade=leitura.nextDouble();
 //PROCESSANDO DADOS
 totalaumento= salarioatual * ((reposiçaosalarial+produtividade)/100);
 total=totalaumento+salarioatual;
 //MOSTRANDO RESULTADO
 System.out.println("FUNCIONARIO CODIGO: "+codfunc +
 "\nSALARIO AUTAL R$ " + salarioatual+
 "\nAUMENTO DE R$" +totalaumento +
 "\nSALARIO FINAL R$ " + total);
 leitura.close();
 }
}
//*Exerc 5 NAO TEM NA FOLHA
/*Exerc 6. A energia gasta em kcal (calorias) com uma atividade aeróbica
qualquer obedece a
seguinte equação: E = MET × PESO × Tempo atividade/60. O tempo é dado em
minutos. O peso
é dado em quilos. METS significa capacidade aeróbica e depende do tipo de
exercício. Ciclismo
ou corrida leve tem pontuação de 7.0 METS. A Natação Crawl tem pontuação de
8.0 METS. Um
usuário deve entrar com seu peso, quanto tempo ele corre por semana; quanto
tempo ele pedala
por semana e quanto tempo ele nada por semana. O seu programa deve retornar o
número de
calorias que este usuário queima por semana com exercícios físicos. (OBS: os
dados acima são
reais para pessoas até 40 anos.) */
import java.util.*;
public class atv5e6{
 //DECLARANDO VARIAVEIS
 public static void main(String[]args){
 int corridamin,natacaomin,pedalamin;
double peso,energiagastacorrida,energiagastanatacao,energiagastapedal,total;
 //PEDINDO AO USUARIO AS INFORMAÇOES
 Scanner leitura = new Scanner(System.in);
 System.out.println("DIGITE SEU PESO");
 peso=leitura.nextDouble();
 System.out.println("DIGITE QUANTOS MINUTOS VOCE CORRE POR SEMANA");
 corridamin=leitura.nextInt();
 System.out.println("DIGITE QUANTOS MINUTOS VOCE NADA POR SEMANA");
 natacaomin=leitura.nextInt();
 System.out.println("DIGITE QUANTOS MINUTOS VOCE PEDALA POR SEMANA");
 pedalamin=leitura.nextInt();
 //PROCESSANDO DADOS
 energiagastacorrida= 7.0 * peso * corridamin/60;
 energiagastanatacao= 8.0 * peso * natacaomin/60;
 energiagastapedal= 7.0 *peso *pedalamin/60;
 total=energiagastacorrida+energiagastanatacao+energiagastapedal;
 //MOSTRANDO RESULTADO
 System.out.println("VOCE QUEIMA UM TOTAL DE " + total +
 " CALORIAS POR SEMANA COM OS EXERCICIOS INFORMADOS");
 leitura.close();
 }
}
/*Exerc 7.Escreva um programa que leia três valores inteiros e diferentes e
mostre-os em ordem
decrescente. */
import java.util.*;
public class atv7{
 //DECLARANDO VARIAVEIS
 public static void main(String[]args){
 int x,y,z;
 //PEDINDO AO USUARIO AS INFORMAÇOES
 Scanner leitura = new Scanner(System.in);
 System.out.println("DIGITE O PRIMEIRO VALOR");
 x=leitura.nextInt();
 System.out.println("DIGITE O SEGUNDO VALOR");
 y=leitura.nextInt();
 System.out.println("DIGITE O TERCEIRO VALOR");
 z=leitura.nextInt();
 //PROCESSANDO DADOS E MOSTRANDO RESULTADO
 if ((x>y && x >z) && (z>y)){
 System.out.println("EM ORDEM DECRESCENTE");
 System.out.println(x);
 System.out.println(z);
 System.out.println(y);
 }
 else if ((x>y && x >z) && (y>z)){
 System.out.println("EM ORDEM DECRESCENTE");
 System.out.println(x);
 System.out.println(y);
 System.out.println(z);
 }
 else if ((y>x && y>z)&&(x>z)){
 System.out.println("EM ORDEM DECRESCENTE");
 System.out.println(y);
 System.out.println(x);
 System.out.println(z);
 }
 else if ((y>x && y>z)&&(z>x)){
 System.out.println("EM ORDEM DECRESCENTE");
 System.out.println(y);
 System.out.println(z);
 System.out.println(x);
 }
 else if ((z>x && z>y)&& (y>x)){
 System.out.println("EM ORDEM DECRESCENTE");
 System.out.println(z);
 System.out.println(y);
 System.out.println(x);
 }
 else if ((z>x && z>y)&& (x>y)){
 System.out.println("EM ORDEM DECRESCENTE");
 System.out.println(z);
 System.out.println(x);
 System.out.println(y);
 }
 leitura.close();

 }
}
/*Exerc 8.Dados três valores: A, B, C, verificar se eles podem ser valores dos
lados de um triângulo e,
se forem, se é um triângulo escaleno, equilátero ou isósceles, considerando os
seguintes conceitos:
• O comprimento de cada lado de um triângulo é menor do que a soma dos outros
dois lados.
• Chama-se equilátero o triângulo que tem três lados iguais.
• Denomina-se isósceles o triângulo que tem o comprimento de dois lados
iguais.
• Recebe o nome de escaleno o triângulo que tem os três lados diferentes. */
import java.util.*;
public class atv8{
//DECLARANDO VARIAVEIS
 public static void main(String[]args){
 int a , b , c;
//PEDINDO AO USUARIO AS INFORMAÇOES
 Scanner leitura = new Scanner(System.in);
 System.out.println("DIGITE O PRIMEIRO VALOR");
 a=leitura.nextInt();
 System.out.println("DIGITE O SEGUNDO VALOR");
 b=leitura.nextInt();
 System.out.println("DIGITE O TERCEIRO VALOR");
 c=leitura.nextInt();
//PROCESSANDO DADOS E MOSTRANDO RESULTADO
 if(a + b > c && a + c > b && b + c > a){
 System.out.println("OS VALORES FORMAM UM TRIANGULO - ");

 if(a == b && a == c )
 System.out.println("\nEQUILATERO");

 else if(a == b || a == c || b == c)
 System.out.println("\nISOSCELES");
 else
 System.out.println("\nESCALENO");
 }
 else
 System.out.println("\nOS VALORES NAO FORMAM UM TRIANGULO");
 leitura.close();
}
}
/*Exerc 9. Faça um programa que leia três valores A, B, C e imprima na tela
esses valores se a soma de A
+ B for menor que C. */
import java.util.*;
public class atv9{
 //DECLARANDO VARIAVEIS
 public static void main(String[]args){
 int a,b,c;
 //PEDINDO AO USUARIO AS INFORMAÇOES
 Scanner leitura = new Scanner(System.in);
 System.out.println("DIGITE O PRIMEIRO VALOR");
 a=leitura.nextInt();
 System.out.println("DIGITE O SEGUNDO VALOR");
 b=leitura.nextInt();
 System.out.println("DIGITE O TERCEIRO VALOR");
 c=leitura.nextInt();
//PROCESSANDO DADOS E MOSTRANDO RESULTADO
if(a + b < c){
System.out.println("VALORES = "+ a);
System.out.println(b);
System.out.println(c);}
else
System.out.println("A SOMA DE A + B É MAIOR QUE C");
leitura.close();
 }
}
