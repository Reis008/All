/* Aula Estruturas condicionais. - Data: 08/09/22
* Lab. ATP – SI - 2/2022
* Aluno(a): Nome do aluno(a)Lucas 
* Exerc 1.Criar um programa que receba o valor de x, e calcule e imprima
o valor de f(x) */
import java.util.*;
import java.lang.Math;
public class atv1{
public static void main(String[]args){
//DECLARANDO VARIAVEIS
double x;
Scanner leitura = new Scanner(System.in);
//PEDINDO O USUARIO AS INFORMAÇOES
System.out.println("INFORME O VALOR DE X");
x=leitura.nextDouble();
//PROCESSANDO DADOS
if(x<=1){
System.out.println("f(x) = 1");
}
else if(1<x&&x<=2){
System.out.println("f(x) = 2");
}
else if(2<x&&x<=3){
System.out.println("f(x) = "+ Math.pow(x, 2));
}
else if(x>3){
System.out.println("f(x) = "+ Math.pow(x, 3));
}
leitura.close();
}
}
/* Exerc 2. A sequência de Fibonacci tem papel importante na explicação
de fenômenos naturais. Ela é também bastante utilizada para fins
estéticos, pela sua reconhecida harmonia. Exemplo
disso foi sua utilização na construção do Partenon, em Atenas. A
sequência dá-se inicialmente por dois números 1. A partir do terceiro
elemento usa-se a expressão: elemento N = elemento n-1 + elemento n-2.
Exemplo de sequência: 1, 1, 2, 3, 5, 8. Construa um programa que imprima
na tela os n primeiros elementos da sequência de Fibonacci, onde n é
informado pelo usuário. */
import java.util.*;
public class atv2{
public static void main(String[] args) {
//DECLARANDO VARIAVEIS
int n,n_1=1,n_2=-1,vezes,contagem=0;
//PEDINDO O USUARIO AS INFORMAÇOES
Scanner leitura = new Scanner(System.in);
System.out.println("DIGITE QUANTOS TERMOS DA SEQUENCIA SERÃO MOSTRADOS");
vezes=leitura.nextInt();
//PROCESSANDO DADOS MOSTRANDO RESULTADO
while ( contagem<vezes){
n=n_1+n_2;
n_2=n_1;
n_1=n;
System.out.print(n);
contagem++;
}
leitura.close();
}
}
/* Exerc 3. Escreva um programa que encontre o quinto número maior que
1000, cuja divisão por 11
tenha resto 5.*/
public class atv3{
public static void main(String[] args) {
//DECLARANDO VARIAVEIS - PROCESSANDO DADOS E MOSTRANDO RESULTADO
int i = 1001;
int n = 0;
while (true) {
if (i % 11 == 5) {
n++;
if(n == 5){
break;}
}
i++;
}
System.out.println(i);
}
}
/* Exerc 4.Chico tem 1,50m e cresce 2 centímetros por ano, enquanto Juca
tem 1,10m e cresce 3
centímetros por ano. Construir um programa que calcule e imprima quantos
anos serão
necessários para que Juca seja maior que Chico.*/
public class atv4{
public static void main(String[] args) {
//DECLARANDO VARIAVEIS
double chico = 150;
double juca = 110;
double anos = 0;
// PROCESSANDO DADOS
while(juca <= chico) {
chico += 2;
juca += 3;
anos++;
}
//MOSTRANDO RESULTADO
System.out.println("SERÃO NECESSARIOS "+ anos+" PARA JUCA SER MAIOR");
}
}
/* Exerc 5.Seja a seguinte série: 1, 4, 4, 2, 5, 5, 3, 6, 6, 4, 7, 7, ...
Escreva um programa que seja capaz de gerar os N termos dessa série. Esse
número N
deve ser lido do teclado*/
import java.util.*;
public class atv5{
public static void main(String[] args){
//DECLARANDO VARIAVEIS
int n, s;
//PEDINDO O USUARIO AS INFORMAÇOES
Scanner leitura = new Scanner(System.in);
System.out.println("DIGITE QUANTOS TERMOS VOCE QUER GERAR DESSA SERIE :
");
n= leitura.nextInt();
// PROCESSANDO DADOS
for (int i = 0; i < n; i++){
if (i % 3 == 0){
s = i/3 + 1;
}
else {
s = i/3 + 4;
}
//MOSTRANDO RESULTADO
System.out.print( s);
}
leitura.close();
}
}
/* Exerc 6.Criar um programa que imprima todos os números inteiros e
positivos no intervalo
aberto entre 10 e 100 de modo que:- não terminem em zero;
- se o dígito da direita for removido, o número restante é divisor do
número original
Exemplos:28: 2 é divisor de 28--36: 3 é divisor de 36*/
public class atv6{
public static void main(String[] args) {
//DECLARANDO VARIAVEIS
int numero;
//PROCESSANDO DADOS E MOSTRANDO RESULTADO
for (numero=10;numero<=100;numero++){
if (numero%10!=0){
if(numero%(numero/10)==0){
System.out.printf("%d \n",numero);}
}
}
}
}
/* Exerc 7.Determine se um determinado ano lido e bissexto.
Sendo que um ano é bissexto se for divisível por 400
ou se for divisível por 4 e não for divisível por 100.
Por exemplo: 1988,1992,1996*/
import java.util.*;
public class atv7{
public static void main(String[] args) {
//DECLARANDO VARIAVEIS
int ano;
//PEDINDO O USUARIO AS INFORMAÇOES
Scanner leitura = new Scanner (System.in);
System.out.println("DIGITE O ANO");
ano = leitura.nextInt();
//PROCESSANDO DADOS E MOSTRANDO RESULTADO
if (ano % 400 ==0)
System.out.println("O ANO "+ ano+ " É BISSEXTO");
else if (( ano % 4 ==0) && (ano % 100 !=0)){
System.out.println("O ANO "+ ano+ " É BISSEXTO");
}
else
System.out.println("O ANO NÃO É BISSEXTO");
leitura.close();
}
}
/* Exerc 8.Uma empresa vende o mesmo produto para quatro diferentes
estados.Cada estado possui uma taxa diferente de imposto sobre o produto
(MG 7%; SP 12%; RJ 15%; MS 8%).Faca um programa em que o usuário
entre com o valor e o estado destino do produto e o programa retorne
o preço final do produto acrescido do imposto do estado
em que ele será vendido.
Se o estado digitado não for válido, mostrar uma mensagem de erro.*/
import java.util.*;
public class atv8{
public static void main(String[] args) {
//DECLARANDO VARIAVEIS
int Opcao;
double valor,total,vt;
//PEDINDO O USUARIO AS INFORMAÇOES
Scanner leitura = new Scanner(System.in);
System.out.println("DIGITE O VALOR DO PRODUTO");
valor = leitura.nextDouble();
System.out.println("DIGITE O ESTADO DESTINO DO PRODUTO" +
"\n 1 = MG \n 2 = SP \n 3 = RJ \n 4 = MS");
Opcao = leitura.nextInt();
//PROCESSANDO DADOS E MOSTRANDO RESULTADO
if(Opcao <= 0){
System.out.println("OPÇÃO INVALIDA");
}
else if(Opcao == 1){
total = valor * 0.07;
vt = valor+ total;
System.out.println("O VALOR FINAL DO PRODUTO NO ESTADO DE MINAS GERAIS "+
"SERA DE R$ " + vt + " REAIS");
}
else if(Opcao==2){
total = valor * 0.12;
vt = valor+ total;
System.out.println("O VALOR FINAL DO PRODUTO NO ESTADO DE SÃO PAULO"+
"SERA DE R$" + vt + " REAIS");
}
else if(Opcao==3){
total = valor * 0.15;
vt = valor+ total;
System.out.println("O VALOR FINAL DO PRODUTO NO ESTADO DO RIO DE
JANEIRO"+
"SERA DE R$" + vt + " REAIS");
}
else if(Opcao==4){
total = valor * 0.15;
vt = valor+ total;
System.out.println("O VALOR FINAL DO PRODUTO NO ESTADO DE MATO GROSSO DO
SUL"+
"SERA DE R$" + vt + " REAIS");
}
leitura.close();
}
}
/* Exerc 9.Faça um programa que leia a distância em Km e a quantidade de
litros de gasolina
consumidos por um carro em um percurso, calcule o consumo em Km/l e
escreva uma
mensagem de acordo com a tabela abaixo:*/
import java.util.*;
public class atv9{
public static void main(String[] args) {
//DECLARANDO VARIAVEIS
int km;
double litros,resultado;
//PEDINDO O USUARIO AS INFORMAÇOES
Scanner leitura = new Scanner (System.in);
System.out.println("DIGITE A DISTANCIA EM KM");
km = leitura.nextInt();
System.out.println("DIGITE A QUANTIDADE DE LITROS CONSUMIDOS");
litros = leitura.nextInt();
//PROCESSANDO DADOS
resultado = km/litros;
//MOSTRANDO RESULTADO
if ( resultado <=0){
System.out.println("DADOS INVALIDOS");
}
else if((resultado>0)&&resultado <8){
System.out.println("VENDA O CARRO !!!!");
}
else if(( resultado >= 8) && (resultado<=14)){
System.out.println("ECONOMICO !!!!");
}
else if( resultado >= 14){
System.out.println("SUPER ECONOMICO !!!!");
}
leitura.close();
}
}
/* Exerc 10.A nota final de um estudante é calculada a partir de três
notas atribuídas entre o
intervalo de 0 até 10, respectivamente, a um trabalho de laboratório, a
uma avaliação semestral
e a um exame final. A média das três notas mencionadas anteriormente
obedece aos pesos:
Trabalho de laboratório: 2; Avaliação Semestral: 3; Exame Final: 5. De
acordo com o
resultado, mostre na tela se o aluno está reprovado (média entre 0 e
2,9), de recuperação
(entre 3 e 4,9) ou se foi aprovado. Faça todas as verificações
necessárias.*/
import java.util.*;
public class atv10{
public static void main(String[] args) {
//DECLARANDO VARIAVEIS
int lab,sem,fim,resultado;
//PEDINDO O USUARIO AS INFORMAÇOES
Scanner leitura = new Scanner (System.in);
System.out.println("DIGITE A NOTA OBTIDA NO TRABALHO DE LABORATORIO");
lab = leitura.nextInt();
System.out.println("DIGITE A NOTA OBTIDA NA AVALIAÇÃO SEMESTRAL");
sem = leitura.nextInt();
System.out.println("DIGITE A NOTA OBTIDA NO EXAME FINAL");
fim = leitura.nextInt();
//PROCESSANDO DADOS
resultado= ((lab * 2)+(sem*3)+(fim*5))/10;
//MOSTRANDO RESULTADO
if(resultado>=5){
System.out.println("VOCÊ FOI APROVADO");
}
else if (( resultado>=0)&&(resultado<=2.9)){
System.out.println("VOCÊ FOI REPROVADO");
}
else if (( resultado>=3)&&(resultado<=4.9)){
System.out.println("VOCÊ ESTA DE RECUPERAÇÃO");
}
leitura.close();
}
}
/* Exerc 11.Usando switch-case, escreva um programa que leia um inteiro
entre 1 e 12 e imprima o
mês correspondente a este número. Isto é, janeiro se 1, fevereiro se 2, e
assim por diante.*/
import java.util.*;
public class atv11{
public static void main(String[] args) {
//DECLARANDO VARIAVEIS
int n;
//PEDINDO O USUARIO AS INFORMAÇOES
Scanner leitura = new Scanner (System.in);
System.out.println("DIGITE UM NUMERO INTEIRO ENTRE 1 E 12");
n= leitura.nextInt();
//PROCESSANDO DADOS E MOSTRANDO RESULTADO
switch (n) {
case 1:
System.out.println("NUMERO CORRESPONDENTE AO MÊS DE JANEIRO");
break;
case 2:
System.out.println("NUMERO CORRESPONDENTE AO MÊS DE FEVERREIRO");
break;
case 3:
System.out.println("NUMERO CORRESPONDENTE AO MÊS DE MARÇO");
break;
case 4:
System.out.println("NUMERO CORRESPONDENTE AO MÊS DE ABRIL");
break;
case 5:
System.out.println("NUMERO CORRESPONDENTE AO MÊS DE MAIO");
break;
case 6:
System.out.println("NUMERO CORRESPONDENTE AO MÊS DE JUNHO");
break;
case 7:
System.out.println("NUMERO CORRESPONDENTE AO MÊS DE JULHO");
break;
case 8:
System.out.println("NUMERO CORRESPONDENTE AO MÊS DE AGOSTO");
break;
case 9:
System.out.println("NUMERO CORRESPONDENTE AO MÊS DE SETEMBRO");
break;
case 10:
System.out.println("NUMERO CORRESPONDENTE AO MÊS DE OUTUBRO");
break;
case 11:
System.out.println("NUMERO CORRESPONDENTE AO MÊS DE NOVEMBRO");
break;
case 12:
System.out.println("NUMERO CORRESPONDENTE AO MÊS DE DEZEMBRO");
break;
}
leitura.close();
}
}
/* Exerc 12.As tarifas de certo parque de estacionamento são as
seguintes:
• 1a e a 2ª hora: R$ 1,00 cada-3ª e 4ª hora - R$ 1,40 cada-5ª hora e
seguintes - R$ 2,00 cada
O número de horas a pagar é sempre inteiro e arredondado por excesso.
Deste modo, quem
estacionar durante 61 minutos pagará por duas horas, que é o mesmo que
pagaria se tivesse
permanecido 120 minutos. Os momentos de chegada ao parque e partida deste
são
apresentados na forma de pares de inteiros, representando horas e
minutos. Por exemplo,
o par 12 50 representará “dez para a uma da tarde”. Pretende-se criar um
programa que,
lidos pelo teclado os momentos de chegada e de partida, escreva na tela o
preço cobrado
pelo estacionamento. Admite-se que a chegada e a partida se dão com
intervalo não superior
a 24 horas. Portanto, se uma dada hora de chegada for superior à da
partida, isso não é
uma situação de erro, significa a que a partida ocorreu no dia seguinte
ao da chegada.*/
import java.util.*;
public class atv12{
public static void main(String[] args) {
//DECLARANDO VARIAVEIS
double chegada,saida,total;
//PEDINDO O USUARIO AS INFORMAÇOES
Scanner leitura = new Scanner(System.in);
System.out.println("DIGITE O MOMENTO DA CHEGADA");
chegada=leitura.nextDouble();
System.out.println("DIGITE O MOMENTO DA PARTIDA");
saida=leitura.nextDouble();
//PROCESSANDO DADOS
total=saida-chegada;
//MOSTRANDO RESULTADO
if(total<=1){
System.out.println("PREÇO = R$ 1");
}
else if(total<=2){
System.out.println("PREÇO = R$ 2");
}
else if(total<=3){
System.out.println("PREÇO = R$ 3,40");
}
else if(total<=4){
System.out.println("PREÇO = R$ 4,80");
}
else if(total>4){
System.out.println("PREÇO = R$ 6.80");
}
leitura.close();
}
}
/* Exerc 13.Faça um programa que calcule o IMC de uma pessoa. Seu
programa irá receber o peso
(em quilos) e a altura (em metros) de uma pessoa e calcular o IMC. Após o
cálculo, imprima
uma mensagem na tela de acordo com a tabela.IMC = peso / (altura *
altura)*/
import java.util.*;
public class atv13{
public static void main(String[] args) {
//DECLARANDO VARIAVEIS
double peso,altura,imc;
//PEDINDO O USUARIO AS INFORMAÇOES
Scanner leitura = new Scanner(System.in);
System.out.println("DIGITE O SEU PESO");
peso=leitura.nextDouble();
System.out.println("DIGITE A SUA ALTURA EM METROS");
altura=leitura.nextDouble();
//PROCESSANDO DADOS E MOSTRANDO RESULTADO
imc= peso / (altura * altura);
if(imc<=18.5){
System.out.println("ABAIXO DO PESO");}
else if((imc>=18.6)&&(imc<=24.9)){
System.out.println("SAUDÁVEL");}
else if((imc>=25.0)&&(imc<=29.9)){
System.out.println("PESO EM EXCESSO");}
else if((imc>=30.0)&&(imc<=34.9)){
System.out.println("OBESIDADE GRAU I");}
else if((imc>=35.0)&&(imc<=39.9)){
System.out.println("OBESIDADE GRAU II(SEVERA)");}
else if(imc>=40){
System.out.println("OBESIDADE GRAU III(MÓRBIDA");}
leitura.close();
}
}
* Exerc 14.O custo ao consumidor de um carro novo é a soma do custo de
fábrica, da comissão do
distribuidor, e dos impostos. A comissão e os impostos são calculados
sobre o custo de
fábrica, de acordo com a tabela abaixo. Leia o custo de fábrica e escreva
o custo ao
consumidor.*/
import java.util.*;
public class atv14{
public static void main(String[] args) {
//DECLARANDO VARIAVEIS
double custofabrica,distribuidor,impostos,total;
//PEDINDO O USUARIO AS INFORMAÇOES
Scanner leitura = new Scanner(System.in);
System.out.println("DIGITE O CUSTO DE FÁBRICA");
custofabrica=leitura.nextDouble();
//PROCESSANDO DADOS E MOSTRANDO RESULTADO
if(custofabrica<12000){
distribuidor=custofabrica*0.05;
total=custofabrica+distribuidor;
System.out.println("O CUSTO TOTAL É DE R$ "+total);}
else if((custofabrica>=12000)&&(custofabrica<25000)){
distribuidor=custofabrica*0.10;
impostos=custofabrica*0.15;
total=custofabrica+distribuidor+impostos;
System.out.println("O CUSTO TOTAL É DE R$ "+total);}
else if(custofabrica>=25000){
distribuidor=custofabrica*0.15;
impostos=custofabrica*0.20;
total=custofabrica+distribuidor+impostos;
System.out.println("O CUSTO TOTAL É DE R$ "+total);}
leitura.close();
}
}
/* Exerc 15.Escreva o menu de opções abaixo. Leia a opção do usuário e
execute a operação escolhida.
Escreva uma mensagem de erro se a opção for inválida. Escolha a opção:
1- Soma de 2 números;
2- Diferença entre 2 números (maior pelo menor);
3- Produto entre 2 números;
4- Divisão entre 2 números (considere que o denominador não será zero).*/
import java.util.*;
public class atv15{
public static void main(String[] args) {
//DECLARANDO VARIAVEIS
int opcao;
double a ,b,total;
//PEDINDO O USUARIO AS INFORMAÇOES
Scanner leitura = new Scanner(System.in);
System.out.println("DIGITE A OPÇÃO \n1- Soma de 2 números"+
"\n2- Diferença entre 2 números(maior pelo menor)"+
"\n3- Produto entre 2 números"+"\n4- Divisão entre 2 números(considere
que o denominador não será zero)");
opcao =leitura.nextInt();
//PROCESSANDO DADOS E MOSTRANDO RESULTADO
if(opcao>=5){
System.out.println("OPÇÃO INVALIDA");
}
else{
switch (opcao) {
case 1:
System.out.println("DIGITE O PRIMEIRO NUMERO");
a = leitura.nextDouble();
System.out.println("DIGITE O SEGUNDO NUMERO");
b = leitura.nextDouble();
total=a+b;
System.out.println("A SOMA DOS DOIS NUMEROS É IGUAL A "+total);
break;
case 2:
System.out.println("DIGITE O PRIMEIRO NUMERO");
a = leitura.nextDouble();
System.out.println("DIGITE O SEGUNDO NUMERO");
b = leitura.nextDouble();
if(a>b){
total = a-b;
System.out.println("A DIFERENÇA ENTRE OS NUMEROS É IGUAL A " +
total);}
else if(b>a){
total=b-a;
System.out.println("A DIFERENÇA ENTRE OS NUMEROS É IGUAL A " +
total);}
break;
case 3:
System.out.println("DIGITE O PRIMEIRO NUMERO");
a = leitura.nextDouble();
System.out.println("DIGITE O SEGUNDO NUMERO");
b = leitura.nextDouble();
total=a*b;
System.out.println("O PRODUTO DOS NUMEROS É IGUAL A " + total);
break;
case 4:
System.out.println("DIGITE O NUMERADOR");
a = leitura.nextDouble();
System.out.println("DIGITE O DENOMINADOR");
b = leitura.nextDouble();
total=a/b;
if(b==0){
System.out.println("DENOMINADOR INVALIDO");}
else{
System.out.println("A DIVISÃO DOS NUMEROS É IGUAL A " + total);}
}
}
leitura.close();
}
}
