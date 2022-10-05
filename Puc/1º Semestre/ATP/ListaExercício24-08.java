/* Aula Entrada, saída e processamento de dados. - Data: 24/08/2022
* Lab. ATP – SI / 2/2022
* Aluno(a): Nome do aluno(a) LUCAS
* Exerc 1.Escreva um programa onde serão fornecidos como entrada de dados
dois valores inteiros, calcule e imprima a soma, o produto, a diferença, o
quociente destes números.*/
import java.util.*;
public class atv1{
 //DECLARANDO VARIAVEIS
 public static void main(String[] args) {
 int x,y,soma,produto,quociente,diferenca;
 Scanner leitura= new Scanner(System.in);
 //PEDINDO AO USUARIO AS INFORMAÇOES
 System.out.println("Digite o primeiro valor");
 x =leitura.nextInt();
 System.out.println("Digite o segundo valor");
 y =leitura.nextInt();
 //PROCESSANDO DADOS
 soma = x + y;
 produto = x * y;
 diferenca = x - y;
 quociente = x / y;
 //MOSTRANDO RESULTADO
 System.out.println("A soma dos valores é igual a " + soma);
 System.out.println("O produto dos valores é igual a " + produto);
 System.out.println("A diferenca dos valores é igual a " + diferenca);
 System.out.println("o quociente dos valores é igual a " + quociente);
 leitura.close();
 }
}
/*Exerc 2.Escreva um programa que leia uma temperatura em graus Farenheit e a
imprima em graus Centígrados
 .A conversão de graus Farenheit para Centígrados é obtida por C=(5/9)(F-32).
 */
import java.util.*;
public class atv2{
 //DECLARANDO VARIAVEIS
public static void main(String[] args) {
 double x;
 double celsius;
 Scanner leitura= new Scanner(System.in);
 //PEDINDO AO USUARIO AS INFORMAÇOES
 System.out.println("Digite a temperatura em Farenheit ");
 x = leitura.nextInt();
 //PROCESSANDO DADOS
 celsius = ( x - 32 ) / 1.8;
 //MOSTRANDO RESULTADO
 System.out.println("A temperatura " + x + " em graus Farenheit convertido
fica " + celsius + " em graus celsius" );
 leitura.close();
 }
}
/*Exerc 3.Escreva um programa que pergunte os seguintes dados referentes ao
pneu de um
automóvel: P = pressão V = volume T = temperatura
e calcule a massa de ar desse pneu segundo a fórmula (M = massa de ar): PV =
0.37M(T+460)*/
import java.util.*;
public class atv3{
 //DECLARANDO VARIAVEIS
 public static void main(String[] args){
 double pressao,volume,temperatura,valor;
 Scanner leitura= new Scanner(System.in);
 //PEDINDO AO USUARIO AS INFORMAÇOES
 System.out.println("DIGITE A PRESSÃO :");
 pressao =leitura.nextDouble();
 System.out.println("DIGITE O VOLUME:");
 volume =leitura.nextDouble();
 System.out.println("DIGITE A TEMPERATURA :");
 temperatura =leitura.nextDouble();
 //PROCESSANDO DADOS
 valor = ( pressao * volume / ( temperatura + 460 )) / 0.37 ;
 //MOSTRANDO RESULTADO
 System.out.println("A MASSA DE AR DESSE PNEU É " + valor);
 leitura.close();
 }
}
/*Exerc 4.Escreva um programa que pergunte qual o tempo transcorrido em um
cronômetro em
horas, minutos e segundos e transforme (e mostre) todo este tempo em
segundos.*/
import java.util.*;
public class atv4{
//DECLARANDO VARIAVEIS
 public static void main(String[] args){
 float horas,minutos,segundos,ems;
 Scanner leitura= new Scanner(System.in);
//PEDINDO AO USUARIO AS INFORMAÇOES
 System.out.println("DIGITE SOMENTE O TEMPO TRANSCORIDO EM HORAS");
 horas = leitura.nextFloat();
 System.out.println("DIGITE SOMENTE O TEMPO TRANSCORIDO EM MINUTOS");
 minutos = leitura.nextFloat();
 System.out.println("DIGITE SOMENTE O TEMPO TRANSCORIDO EM SEGUNDOS");
 segundos = leitura.nextFloat();
//PROCESSANDO DADOS
 ems = (horas * 3600) + (minutos * 60) + segundos;
//MOSTRANDO RESULTADO
 System.out.println("O TEMPO TRANSCORRIDO EM SEGUNDOS É IGUAL A " +
ems);
 leitura.close();
 }
}
Exerc 5 – o mesmo do 2
/*Exerc 6.Determinar a quantidade de litros de combustível gastos em uma
viagem por um
automóvel que faz 12km/l. Para isso, sabe-se que o tempo gasto na viagem é t =
35min e
a velocidade média do automóvel é v = 80km/h.*/
public class atv6{
 //DECLARANDO VARIAVEIS
 public static void main(String[] args){
 float valor;
 float consumo = 12;
 float tg = 35;
 float vm = 80;
 //PROCESSANDO DADOS
 valor = ((tg / 60) * vm ) / consumo;
 //MOSTRANDO RESULTADO
 System.out.println("O AUTOMOVEL GASTOU " + valor + " LITROS DE COMBUSTIVEL
NESSA VIAGEM DE " + tg + " MINUTOS");
 }
}
/*Exerc 7.Criar um algoritmo que obtenha 4 números reais e exiba a sua média
ponderada, sabendose que os pesos são 2, 1, 3 e 4, nesta ordem. */
import java.util.*;
public class atv7{
//DECLARANDO VARIAVEIS
public static void main(String[] args){
float numero1,numero2,numero3,numero4,valor;
int peso1=2,peso2=1,peso3=3,peso4=4;
Scanner leitura= new Scanner(System.in);
//PEDINDO AO USUARIO AS INFORMAÇOES
System.out.print("DIGITE O PRIMEIRO NUMERO :");
numero1 = leitura.nextFloat();
System.out.print("DIGITE O SEGUNDO NUMERO :");
numero2 = leitura.nextFloat();
System.out.print("DIGITE O TERCEIRO NUMERO :");
numero3 = leitura.nextFloat();
System.out.print("DIGITE O QUARTO NUMERO :");
numero4 = leitura.nextFloat();
//PROCESSANDO DADOS
valor = ((numero1*peso1)+(numero2*peso2)+(numero3*peso3)+(numero4*peso4))/
(peso1+peso2+peso3+peso4);
//MOSTRANDO RESULTADO
System.out.println("A MEDIA PONDERADA DOS NUMERO DIGITADOS É " + valor);
leitura.close();
 }
};
/*Exerc 8.Para vários tributos a base de calculo é o salário mínimo. Fazer um
algoritmo que leia o o
valor do salário de uma pessoa. Calcular e exibir quantos salários mínimos
essa pessoa
ganha. Considere que o valor do salário mínimo é: R$1.212,00. */
import java.util.*;
 public class atv8{
 //DECLARANDO VARIAVEIS
 public static void main(String [] args){
 float salario = 1212;
 float ganho,resultado;
 Scanner leitura= new Scanner(System.in);
 //PEDINDO AO USUARIO AS INFORMAÇOES
 System.out.print("DIGITE O QUANTO VOCÊ GANHA :");
 ganho = leitura.nextFloat();
 //PROCESSANDO DADOS
 resultado = ganho/salario;
 //MOSTRANDO RESULTADO
 System.out.println("VOCE GANHA O REFERENTE A " + resultado + "
SALARIOS MINIMOS." );
 leitura.close();
 }
 }
/*Exerc 9.Todo restaurante cobra 10% sobre o valor do consumo do cliente para
o garçom, embora por lei não possa obrigar o cliente a pagar. Fazer um
algoritmo que leia o valor gasto com as despesas realizadas em um restaurante
e imprima o valor da gorjeta e o valor total a ser pago (despesa mais
gorjeta). */
 import java.util.*;
 public class atv9{
 //DECLARANDO VARIAVEIS
 public static void main(String[]args){
 double bebida,entrada,principal,sobremesa,total,gorjeta,tg;
 Scanner leitura= new Scanner(System.in);
 //PEDINDO AO USUARIO AS INFORMAÇOES
 System.out.print("DIGITE O VALOR GASTO EM BEBIDAS :R$");
 bebida = leitura.nextDouble();
 System.out.print("DIGITE O VALOR GASTO NA ENTRADA :R$");
 entrada = leitura.nextDouble();
 System.out.print("DIGITE O VALOR GASTO NO PRATO PRINCIPAL :R$");
 principal= leitura.nextDouble();
 System.out.print("DIGITE O VALOR GASTO NA SOBREMESA :R$");
 sobremesa = leitura.nextDouble();
 //PROCESSANDO DADOS
 total = bebida+entrada+principal+sobremesa;
 gorjeta = total * 0.10;
 tg = total+gorjeta;
 //MOSTRANDO RESULTADO
 System.out.println("O VALOR CONSUMIDO FOI DE R$" + total + ", O VALOR DA
GORJETA FICOU R$"+ gorjeta + "O VALOR TOTAL A SER PAGO = R$" +tg );
 leitura.close();
 }
 }
/*Exerc 10.Faça um algoritmo para calcular quantas ferraduras são necessárias
para equipar todos os
cavalos comprados para um haras
 */
 import java.util.*;
 public class atv10{
 //DECLARANDO VARIAVEIS
 public static void main(String[]args){
 int cavalos;
 int total;
 Scanner leitura= new Scanner(System.in);
 //PEDINDO AO USUARIO AS INFORMAÇOES
 System.out.print("DIGITE QUANTOS NOVOS CAVALOS VÃO SER COMPRADOS : ");
 cavalos = leitura.nextInt();
 //PROCESSANDO DADOS
 total = cavalos * 4;
 //MOSTRANDO RESULTADO
 System.out.println("VAI SER GASTO UM TOTAL DE " + total + " FERRADURAS
PARA OS NOVOS CAVALOS DO HARAS.");
 leitura.close.();
 }
}
