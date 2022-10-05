/* Aula Estruturas condicionais. - Data: 15/09/22
* Lab. ATP – SI 2-2022
* Aluno(a): Nome do aluno(a) LUCAS
* Exerc 1.Escreva um programa que leia 3 valores inteiros e diferentes e mostre-os em
ordem decrescente*/
import java.util.*;
public class atv1{
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
/*Exerc 2. Escreva um programa para calcular a soma de 10 números quaisquer fornecidos
pelo
usuário.*/
import java.util.*;
public class atv2{
public static void main(String[] args) {
//DECLARANDO VARIAVEIS
int soma=0,numero,i=0;
Scanner leitura = new Scanner(System.in);
//PEDINDO AO USUARIO AS INFORMAÇOES E PROCESSANDO DADOS
while (i <= 9) {
i ++;
System.out.println("Digite um numero");
numero=leitura.nextInt();
soma=soma+numero;
}
//MOSTRANDO RESULTADO
System.out.println("A Soma DOS 1O NUMEROS É IGUAL A " + soma);
leitura.close();
}
}
/*Exerc 3 Escreva um programa para ler a idade de 40 pessoas, exibir a idade da pessoa
mais nova,
calcular a idade média e calcular a porcentagem de pessoas com idade entre 24 e 30 anos.*/
import java.util.*;
public class atv3 {
public static void main(String[] args) {
//DECLARANDO VARIAVEIS
int idade, nova = Integer.MAX_VALUE;
float media, soma = 0, porcentagem, qtde=0;
Scanner leitura = new Scanner(System.in);
//PEDINDO AO USUARIO AS INFORMAÇOES PROCESSANDO DADOS
for (int i = 0; i < 40; i++){
System.out.println("dIGITE A O VALOR REFERENTE A IDADE");
idade = leitura.nextInt();
if(idade < nova){
nova = idade;
}
soma = soma+ idade;
if(idade >= 24 && idade <= 30){
qtde ++;
}
}
//MOSTRANDO RESULTADOS
System.out.println("A PESSOA MAIS NOVA TEM" + nova+ "ANOS");
media = soma/40;
porcentagem = (qtde/40)* 100;
System.out.println("A IDADE MEDIA É DE "+media+ "ANOS");
System.out.println("PESSOA ENTRE 24 E 30 ANOS É EQUIVALENTE A "+porcentagem+"%");
leitura.close();
}
}
/*Exerc 4. Deseja-se fazer uma pesquisa a respeito do consumo mensal de energia elétrica
em uma
determinada cidade. Para isso, são fornecidos os seguintes dados:
• preço do kWh consumido;
• número do consumidor;
• quantidade de kWh consumidos durante o mês;
O número de consumidores que participarão da pesquisa é igual a 80. Faça um algoritmo que
leia os dados descritos acima, calcule e imprima
(a) para cada consumidor, o total a pagar,
(b) o maior consumo verificado,
(c) o menor consumo verificado,
(d) a média geral de consumo. */
import java.util.*;
public class atv4 {
public static void main(String[] args){
//DECLARANDO VARIAVEIS
Scanner leitura = new Scanner(System.in);
int valorKw, consumo, totalapagar, codigo;
float media, soma_Kw=0;
int maior = Integer.MIN_VALUE;
int menor= Integer.MAX_VALUE;
int i = 0;
//PEDINDO AO USUARIO AS INFORMAÇOES - PROCESSANDO DADOS E MOSTRANDO RESULTADO
while(i < 80){
System.out.println("DIGITE O PREÇO DO KW");
valorKw = leitura.nextInt();
System.out.println("DIGITE O CONSUMO ");
consumo = leitura.nextInt();
System.out.println("DIGITE O CODIGO DO CLIENTE");
codigo = leitura.nextInt();
totalapagar = valorKw* consumo;
System.out.println("O TOTAL DO CLIENTE"+codigo+ "A PAGAR SERA DE= "+ totalapagar);
if (consumo > maior){
maior = consumo;
}
if (consumo< menor){
menor = consumo;
}
soma_Kw = soma_Kw + consumo;
i++;
}
media = soma_Kw /80;
System.out.println("O MAIOR CONSUMO FOI DE"+ maior+"KW");
System.out.println("O MENOR CONSUMO FOI DE"+ menor+"KW");
System.out.println("A MEDIA DE CONSMO FOI DE"+ media+"KW");
leitura.close();
}
}
/*Exerc 5. Desenvolver um programa que efetue a soma de todos os números ímpares que são
múltiplos de três e que se encontram no conjunto dos números de 500 até 2100.*/
public class atv5 {
public static void main(String[] args){
for(int i = 500; i <= 2100; i++){
if(i%2 != 0 && i%3 == 0){
System.out.println(i);
}}}
}
/*ExercEscrever um programa que leia 60 números e conte quantos deles estão nos seguintes
intervalos: [0-25], [26-50], [51-75] e [76-100].*/
import java.util.*;
public class atv6{
public static void main(String[] args) {
//DECLARANDO VARIAVEIS
Scanner leitura = new Scanner(System.in);
int intervalo1=0, intervalo2=0, intervalo3=0, intervalo4=0;
int numero;
//PEDINDO AO USUARIO AS INFORMAÇOES E PROCESSANDO DADOS
for(int i = 0; i < 60; i++){
System.out.println("Digite um número");
numero = leitura.nextInt();
if (numero >=0 && numero <= 25){
intervalo1++;
}
else if(numero >=26 && numero <= 50){
intervalo2++;
}
else if(numero >= 51 && numero <= 75){
intervalo3++;
}
else if(numero >= 76 && numero <= 100){
intervalo4++;
}
else{
System.out. println("ESTA FORA DO INTERVALO");
}
//MOSTRANDO RESULTADO
}
System.out.println("ESTA NO INTERVALO DE 0 - 25= "+ intervalo1+"NUMEROS");
System.out.println("ESTA NO INTERVALO DE 26 - 50= "+intervalo2+"NUMEROS");
System.out.println("ESTA NO INTERVALO DE51 - 75= "+ intervalo3+"NUMEROS");
System.out.println("ESTA NO INTERVALO DE76 - 100= "+intervalo4+"NUMEROS");
leitura.close();
}
}
/*Exerc 7. Faça um programa que leia um valor A e um valor N. Calcule e imprima a soma dos
N
primeiros números a partir de A (inclusive). Considere que não será lido um valor negativo
para N.
Exemplo:
A N SOMA
3 2 (3+4) = 7
4 5 (4+5+6+7+8) = 30*/
import java.util.*;
public class atv7 {
public static void main(String[] args) {
Scanner leitura = new Scanner(System.in);
// DECLARANDO VARIAVEIS
int inicio, parcelas, soma = 0;
// PEDINDO AO USUARIO AS INFORMAÇOES
System.out.println("DIGITE O INICO");
inicio = leitura.nextInt();
System.out.println("DIGITE A QUANTIDADE DE PARCELAS");
parcelas = leitura.nextInt();
soma = inicio;
// PROCESSANDO DADOS E MOSTRANDO RESULTADO
for (int i = 1; i <= (parcelas - 1); i++) {
inicio = inicio + 1;
soma = soma + inicio;
}
System.out.println(+ soma);
leitura.close();
}
}
/*Exerc 8. Escreva um programa para calcular e escrever o valor de S:
S = 1/1 + 2/4 + 4/16 + 5/25 + 6/36 + ... 10/100*/
public class atv8 {
public static void main(String [] args){
// DECLARANDO VARIAVEIS
double S = 0;
//PROCESSANDO DADOS
for (int num=1; num < 10; num++){
S = S + (num/Math.pow(num, 2));
}
//MOSTRANDO RESULTADO
System.out.println("S= "+ S);
}
}
/*Exerc 9. Faça um programa que escreva a tabuada de multiplicação de todos os números
inteiros
de 2 a 9.
*/
public class atv9 {
public static void main(String [] args){
//DECLARANDO VARIAVEIS
int num = 2;
// PROCESSANDO DADOS E MOSTRANDO RESULTADO
while(num <= 9){
for(int i = 1; i <=10; i++){
System.out.println(num * i);
}
num++;
}
}
}
/*Exerc 10. A secretaria de saúde de uma cidade fez uma pesquisa entre seus habitantes,
coletando
dados sobre a idade e a quantidade de filhos de cada habitante. A secretaria deseja saber:
a) média da idade da população;
b) média do número de filhos;
c) maior idade;
d) percentual de pessoas acima de 60 anos.
O final da leitura de dados se dará com a entrada de uma idade negativa.*/
import java.util.*;
public class atv10 {
public static void main(String [] args){
Scanner leitura = new Scanner(System.in);
//DECLARANDO VARIAVEIS
int idade, filhos, pessoa=0;
float mediai=0, mediaf=0;
int maior = Integer.MIN_VALUE;
int perc_60, cont_60=0;
//PEDINDO AO USUARIO AS INFORMAÇOES
do{
System.out.println("DIGITE O VALOR REFERENTE A IDADE");
idade = leitura.nextInt();
System.out.println("DIGITE O VALOR REFERENTE A QUANTIDADE DE FILHOS");
filhos = leitura.nextInt();
//PROCESSANDO DADOS
if(idade > maior){
maior = idade;
}
mediai = mediai+ idade;
mediaf = mediaf + filhos;
if (idade > 60){
cont_60 ++;
}
pessoa++;
}while(idade >= 0);
mediaf = mediaf/pessoa;
mediai = mediai/pessoa;
perc_60 = (cont_60/pessoa)*100;
//MOSTRANDO RESULTADO
System.out.println("A PESSOA COM A MAIOR IDADE TEM "+maior+"ANOS");
System.out.println("A MEDIA DE IDADE DA CIDADE É DE "+mediai+"ANOS");
System.out.println("A MEDIA DE FILHOS É DE "+mediaf);
System.out.println("ESSA CIDADE TEM UM PERCENTUAL DE "+perc_60+"% DE PESSOAS COM MAIS
DE 60 ANOS" );
leitura.close();
} }
/*Exerc 11. O departamento que controla o índice de poluição do meio ambiente mantém 3
grupos
de indústrias que são altamente poluentes do meio ambiente. O índice de poluição aceitável
varia de 0,05 até 0,25. Se o índice sobe para 0,3 as indústrias do primeiro grupo são
intimadas
a suspenderem suas atividades, se o índice cresce para 0,4 as do primeiro e segundo grupo
são intimadas a suspenderem suas atividades e se o índice atingir 0,5 todos os 3 grupos
devem
ser notificados a paralisarem suas atividades. Faça um algoritmo que lê o índice de
poluição
medido e emite a notificação adequada aos diferentes grupos de empresas.
*/
import java.util.*;
public class atv11 {
public static void main(String [] args){
Scanner leitura = new Scanner(System.in);
//DECLARANDO VARIAVEIS
float poluicao;
//PEDINDO AO USUARIO AS INFORMAÇOES
System.out.println("DIGITE O INDICE DE POLUIÇAO");
poluicao = leitura.nextFloat();
//PROCESSANDO DADOS E MOSTRANDO RESULTADO
if (poluicao >= 0.3f){
System.out.println("EMPRESAS DO GRUPO 1 PARALISADAS");
}
else if (poluicao >= 0.4f){
System.out.println("EMPRESAS DO GRUPO 1 E GRUPO 2 PARALISADAS");
}
else if(poluicao >=0.5f){
System.out.println("EMPRESAS DO GRUPO 1, 2 E 3 PARALISADAS");
}
leitura.close();
}
}
/*Exerc 12. Construir um programa para fazer um levantamento estatístico das respostas de
uma
prova tipo múltipla escolha, considerando que a prova contém 50 questões e que cada
questão possui 5 opções: A, B, C, D e E. O algoritmo deve apresentar os
percentuais relativos às quantidades de respostas A, B, C, D e E. */
/*Construir um programa para fazer um levantamento
estatístico das respostas de uma prova tipo múltipla
escolha, considerando que a prova contém 50
questões e que cada questão possui 5 opções:
A, B, C, D e E. O algoritmo deve apresentar
os percentuais relativos às quantidades de
respostas A, B, C, D e E. */
import java.util.*;
public class atv12 {
public static void main(String [] args){
//DECLARANDO VARIAVEIS
char opcao;
int A=0, B=0,C=0,D=0,E=0;
Scanner leitura = new Scanner(System.in);
for (int i = 0; i < 50; i++){
//PEDINDO AO USUARIO AS INFORMAÇOES
System.out.println("Opcao");
opcao = leitura.next().charAt(0);
//PROCESSANDO DADOS
switch(opcao){
case 'A':
A++;
break;
case 'B':
B++;
break;
case 'C':
C++;
break;
case 'D':
D++;
break;
case 'E':
E++;
break;
}
}
//MOSTRANDO RESULTADO
System.out.println("PERCENTUAL DA QUESTAO A " + (A/50)*100);
System.out.println("PERCENTUAL DA QUESTAO B " + (B/50)*100);
System.out.println("PERCENTUAL DA QUESTAO C " + (C/50)*100);
System.out.println("PERCENTUAL DA QUESTAO D " + (D/50)*100);
System.out.println("PERCENTUAL DA QUESTAO E " + (E/50)*100);
leitura.close();
}
}
/*Exerc 13 Faça um programa para ler as coordenadas (X, Y) de uma quantidade indeterminada
de
pontos no sistema cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O
algoritmo será encerrado quando as duas coordenadas digitadas forem 0 (nesta situação,
sair
sem escrever mensagem alguma)
Para os dados de entrada abaixo Deve ser gerada a seguinte saída
2 2 primeiro quadrante
3 -2 quarto quadrante
4 7 primeiro quadrante
-8 -1 terceiro quadrante
-7 1 segundo quadrante
.*/
import java.util.*;
public class atv13 {
public static void main(String [] args){
Scanner leitura = new Scanner(System.in);
//DECLARANDO VARIAVEIS
int X, Y;
//PEDINDO AO USUARIO AS INFORMAÇOES
do{
System.out.println("Digite O VALOR DE X");
X = leitura.nextInt();
System.out.println("Digite O VALOR DE Y");
Y = leitura.nextInt();
//PROCESSANDO DADOS E MOSTRANDO RESULTADO
if ( X >0 && Y >0){
System.out.println("PRIMEIRO QUADRANTE ");
}
else if(X < 0 && Y > 0){
System.out.println("SEGUNDO QUADRANTE");
}
else if(X < 0 && Y < 0){
System.out.println("TERCEIRO QUADRANTE");
}
else if (X > 0 && Y < 0){
System.out.println("QUARTO QUADRANTE");
}
}while(X != 0 && Y !=0);
leitura.close();
}
}
14 É IGUAL AO 10
/*Exerc 15. Crie um programa que peça um número inteiro ao usuário, e imprima a seguinte
tabela:
1
2 4
3 6 9
4 8 12 16
..*/
import java.util.*;
public class atv15 {
public static void main(String [] args){
//DECLARANDO VARIAVEIS
Scanner leitura = new Scanner(System.in);
int n;
//PEDINDO AO USUARIO AS INFORMAÇOES
System.out.println("DIGITE UM NUMERO");
n = leitura.nextInt();
//PROCESSANDO DADOS MOSTRANDO RESULTADO
for( int i = 1; i <= n; i++){
for(int j = 1; j <= i; j++){
//MOSTRANDO RESULTADO
System.out.print(" " + i*j);
}
System.out.println();
}
leitura.close();
}
}
/*Exerc 16.Faça um programa para calcular o k-ésimo dígito da direita para a esquerda de
um número
n. Suponha que k é menor ou igual ao número de dígitos de n. Exemplo: o 3o dígito de 1984
é 9.*/
import java.util.*;
public class atv16 {
public static void main(String [] args){
Scanner le = new Scanner(System.in);
//DECLARANDO VARIAVEIS
int n, resto, digito, divisao=0, quociente;
// //PEDINDO AO USUARIO AS INFORMAÇOES
System.out.println("DIGITE UM NUMERO");
n = le.nextInt();
System.out.println("DIGITE O DIGITO");
digito = le.nextInt();
//PROCESSANDO DADOS
while(divisao != digito){
quociente = n/10;
resto = n%10;
if(divisao == digito){
}
n = quociente;
divisao++;
//MOSTRANDO RESULTADO
System.out.println(resto);
}
le.close();
}
}
