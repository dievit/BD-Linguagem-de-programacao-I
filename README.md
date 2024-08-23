<h1 align="center"> Bem-vindo(a) ao repositório de Linguagem de Programação I </h1>
<h3 align="center">
Os exercícios estão listados abaixo juntamente com seus respectivos testes de mesa.
</h3>
<details>
  <summary>Exercício 1</summary>

 ## :dart: <a href = https://github.com/dievit/BD-Linguagem-de-programacao-I/blob/main/codes/AgeInDays.java> Código 1 </a>

Caso 1: Entrada válida

| Passo | Instrução/Operação | Valor da Variável | Saída do Programa |
| --- | --- | --- | --- |
| 1 | int anos = scanner.nextInt(); | anos = 25 |  |
| 2 | int meses = scanner.nextInt(); | meses = 5 |  |
| 3 | meses > 12 (false) | meses = 5 |  |
| 4 | int dias = scanner.nextInt(); | dias = 10 |  |
| 5 | dias > 30 (false) | dias = 10 |  |
| 6 | idadeParaDias = (anos * 365) + (meses * 30) + dias; | idadeParaDias = 9135 + 150 + 10 = 9295 |  |
| 7 | System.out.println("Sua idade em dias é: " + idadeParaDias); | idadeParaDias = 9295 | Sua idade em dias é: 9295 |
| 8 | scanner.close(); |  |  |

Caso 2: Meses inválidos

| Passo | Instrução/Operação | Valor da Variável | Saída do Programa |
| --- | --- | --- | --- |
| 1 | int anos = scanner.nextInt(); | anos = 30 |  |
| 2 | int meses = scanner.nextInt(); | meses = 15 |  |
| 3 | meses > 12 (true) | meses = 15 | O ano só tem 12 meses seu burro! Digite novamente: |
| 4 | meses = scanner.nextInt(); | meses = 10 |  |
| 5 | meses > 12 (false) | meses = 10 |  |
| 6 | int dias = scanner.nextInt(); | dias = 25 |  |
| 7 | dias > 30 (false) | dias = 25 |  |
| 8 | idadeParaDias = (anos * 365) + (meses * 30) + dias; | idadeParaDias = 10950 + 300 + 25 = 11275 |  |
| 9 | System.out.println("Sua idade em dias é: " + idadeParaDias); | idadeParaDias = 11275 | Sua idade em dias é: 11275 |
| 10 | scanner.close(); |  |  |

  
</details>

<details>
  <summary>Exercício 2</summary>
  
## :dart: <a href= https://github.com/dievit/BD-Linguagem-de-programacao-I/blob/main/codes/CanYouVote.java>Código 2</a>
Caso 1: Usuário menor de 16 anos

| Passo | Instrução/Operação | Valor da Variável | Saída do Programa |
| --- | --- | --- | --- |
| 1 | int actualYear = LocalDate.now().getYear(); | actualYear = 2024 |  |
| 2 | int userInput = scanner.nextInt(); | userInput = 2010 |  |
| 3 | actualYear - userInput | 2024 - 2010 = 14 |  |
| 4 | if ((actualYear - userInput) < 16) (true) | 14 < 16 (true) |  |
| 5 | System.out.println("Você não pode votar ainda!"); |  | Você não pode votar ainda! |
| 6 | scanner.close(); |  |  |

Caso 2: Usuário que pode votar.

| Passo | Instrução/Operação | Valor da Variável | Saída do Programa |
| --- | --- | --- | --- |
| 1 | int actualYear = LocalDate.now().getYear(); | actualYear = 2024 |  |
| 2 | int userInput = scanner.nextInt(); | userInput = 2005 |  |
| 3 | actualYear - userInput | 2024 - 2005 = 19 |  |
| 4 | if ((actualYear - userInput) < 16) (false) | 19 < 16 (false) |  |
| 5 | System.out.println("Parabéns, você já pode votar!"); |  | Parabéns, você já pode votar! |
| 6 | scanner.close(); |  |  |

</details>

<details>
  <summary>Exercício 3</summary>
  
## :dart: <a href=https://github.com/dievit/BD-Linguagem-de-programacao-I/blob/main/codes/UpSalary.java>Código 3</a>

Caso 1: Pequeno aumento (2,5%)

| Passo | Instrução/Operação | Valor da Variável | Saída do Programa |
| --- | --- | --- | --- |
| 1 | double salarioAtual = scanner.nextDouble(); | salarioAtual = 2000.00 |  |
| 2 | double percentualAumento = scanner.nextDouble(); | percentualAumento = 2.5 |  |
| 3 | double novoSalario = salarioAtual + (salarioAtual * (percentualAumento/100)); | novoSalario = 2000.00 + (2000.00 * 0.025) = 2050.00 |  |
| 4 | System.out.println("Seu salário atual era: R$" + String.format("%.2f", salarioAtual)); |  | Seu salário atual era: R$2000.00 |
| 5 | System.out.println("Seu novo salário é: R$" + String.format("%.2f", novoSalario)); |  | Seu novo salário é: R$2050.00 |
| 6 | System.out.println("Percentual de aumento: " + percentualAumento + "%"); |  | Percentual de aumento: 2.5% |

Caso 2: Aumento significativo (15%)

| Passo | Instrução/Operação | Valor da Variável | Saída do Programa |
| --- | --- | --- | --- |
| 1 | double salarioAtual = scanner.nextDouble(); | salarioAtual = 3500.00 |  |
| 2 | double percentualAumento = scanner.nextDouble(); | percentualAumento = 15.0 |  |
| 3 | double novoSalario = salarioAtual + (salarioAtual * (percentualAumento/100)); | novoSalario = 3500.00 + (3500.00 * 0.15) = 4025.00 |  |
| 4 | System.out.println("Seu salário atual era: R$" + String.format("%.2f", salarioAtual)); |  | Seu salário atual era: R$3500.00 |
| 5 | System.out.println("Seu novo salário é: R$" + String.format("%.2f", novoSalario)); |  | Seu novo salário é: R$4025.00 |
| 6 | System.out.println("Percentual de aumento: " + percentualAumento + "%"); |  | Percentual de aumento: 15.0% |
</details>

<details>
  <summary>Exercício 4</summary>
  
## :dart: <a href= https://github.com/dievit/BD-Linguagem-de-programacao-I/blob/main/codes/CarConsumerPrice.java>Código 4</a>
Caso 1: Dados válidos

| Passo | Instrução/Operação | Valor da Variável | Saída do Programa |
| --- | --- | --- | --- |
| 1 | double factoryCost = scanner.nextDouble(); | factoryCost = 50000.00 |  |
| 2 | double taxRate = scanner.nextDouble(); | taxRate = 10.0 |  |
| 3 | double distributorMargin = scanner.nextDouble(); | distributorMargin = 5.0 |  |
| 4 | double consumerFinalPrice = factoryCost + (factoryCost * (taxRate/100)) + (factoryCost + (distributorMargin/100)); | consumerFinalPrice = 50000.00 + (50000.00 * 0.10) + (50000.00 * 0.05) = 50000.00 + 5000.00 + 2500.00 = 57500.00 |  |
| 5 | System.out.println("O preço final do veículo para o consumidor é: " + String.format("%.2f", consumerFinalPrice)); |  | O preço final do veículo para o consumidor é: 57500.00 |

Caso 2: Dados inválidos

| Passo | Instrução/Operação | Valor da Variável | Saída do Programa |
| --- | --- | --- | --- |
| 1 | double factoryCost = scanner.nextDouble(); | factoryCost = -20000.00 |  |
| 2 | double taxRate = scanner.nextDouble(); | taxRate = -5.0 |  |
| 3 | double distributorMargin = scanner.nextDouble(); | distributorMargin = -10.0 |  |
| 4 | double consumerFinalPrice = factoryCost + (factoryCost * (taxRate/100)) + (factoryCost + (distributorMargin/100)); | consumerFinalPrice = -20000.00 + (-20000.00 * -0.05) + (-20000.00 * -0.10) = -20000.00 + 1000.00 + 2000.00 = -17000.00 |  |
| 5 | System.out.println("O preço final do veículo para o consumidor é: " + String.format("%.2f", consumerFinalPrice)); |  | O preço final do veículo para o consumidor é: -17000.00 |
</details>

<details>
  <summary>Execício 5</summary>

  ## :dart: <a href= https://github.com/dievit/BD-Linguagem-de-programacao-I/blob/main/codes/SellerSalary.java>Código 5</a>

Caso 1: Dados válidos

| Passo | Instrução/Operação | Valor da Variável | Saída do Programa |
| --- | --- | --- | --- |
| 1 | int selledCars = scanner.nextInt(); | selledCars = 10 |  |
| 2 | double totalSelled = scanner.nextDouble(); | totalSelled = 200000.00 |  |
| 3 | double sellerSalary = scanner.nextDouble(); | sellerSalary = 1500.00 |  |
| 4 | double carFixComission = scanner.nextDouble(); | carFixComission = 300.00 |  |
| 5 | double finalSalary = ((selledCars * carFixComission) + sellerSalary + (totalSelled * 0.05)); | finalSalary = ((10 * 300.00) + 1500.00 + (200000.00 * 0.05)) = (3000.00 + 1500.00 + 10000.00) = 14500.00 |  |
| 6 | System.out.println("O valor final do salário é de: R$" + String.format("%.2f", finalSalary)); |  | O valor final do salário é de: R$14500.00 |

Caso 2: Dados inválidos (negativos)

| Passo | Instrução/Operação | Valor da Variável | Saída do Programa |
| --- | --- | --- | --- |
| 1 | int selledCars = scanner.nextInt(); | selledCars = -5 |  |
| 2 | double totalSelled = scanner.nextDouble(); | totalSelled = -50000.00 |  |
| 3 | double sellerSalary = scanner.nextDouble(); | sellerSalary = -1000.00 |  |
| 4 | double carFixComission = scanner.nextDouble(); | carFixComission = -100.00 |  |
| 5 | double finalSalary = ((selledCars * carFixComission) + sellerSalary + (totalSelled * 0.05)); | finalSalary = ((-5 * -100.00) + (-1000.00) + (-50000.00 * 0.05)) = (500.00 + (-1000.00) + (-2500.00)) = -3000.00 |  |
| 6 | System.out.println("O valor final do salário é de: R$" + String.format("%.2f", finalSalary)); |  | O valor final do salário é de: R$-3000.00 |
</details>

<details>
  <summary>Exercício 6</summary>

  ## :dart: <a href=https://github.com/dievit/BD-Linguagem-de-programacao-I/blob/main/codes/FahrenheitCelsius.java>Código 6</a>
  
Caso 1:  Dados válidos

| Passo | Instrução/Operação | Valor da Variável | Saída do Programa |
| --- | --- | --- | --- |
| 1 | double fDegree = scanner.nextDouble(); | fDegree = 98.6 |  |
| 2 | double cDegree = (fDegree - 32) / 1.8; | cDegree = (98.6 - 32) / 1.8 = 66.6 / 1.8 = 37.00 |  |
| 3 | System.out.println(fDegree + " É igual a: " + String.format("%.2f", cDegree)); |  | 98.6 É igual a: 37.00 |

Caso 2: Dados inválidos

| Passo | Instrução/Operação | Valor da Variável | Saída do Programa |
| --- | --- | --- | --- |
| 1 | double fDegree = scanner.nextDouble(); | fDegree = 212 |  |
| 2 | double cDegree = (fDegree - 32) / 1.8; | cDegree = (212 - 32) / 1.8 = 180 / 1.8 = 100.00 |  |
| 3 | System.out.println(fDegree + " É igual a: " + String.format("%.2f", cDegree)); |  | 212 É igual a: 100.00 |
</details>

<details>
  <summary>Exercício 7</summary>

  ## :dart: <a href=https://github.com/dievit/BD-Linguagem-de-programacao-I/blob/main/codes/BiggerThanTen.java>Código 7</a>

Caso 1: Número maior ou igual a 10

| Passo | Instrução/Operação | Valor da Variável | Saída do Programa |
| --- | --- | --- | --- |
| 1 | int userChoice = scanner.nextInt(); | userChoice = 15 |  |
| 2 | if (userChoice >= 10) | 15 >= 10 (true) |  |
| 3 | System.out.println("É maior que 10!"); |  | É maior que 10! |
| 4 | scanner.close(); |  |  |

Caso 2: Número menor que 10

| Passo | Instrução/Operação | Valor da Variável | Saída do Programa |
| --- | --- | --- | --- |
| 1 | int userChoice = scanner.nextInt(); | userChoice = 5 |  |
| 2 | if (userChoice >= 10) | 5 >= 10 (false) |  |
| 3 | System.out.println("Não é maior que 10!"); |  | Não é maior que 10! |
| 4 | scanner.close(); |  |  |
</details>

<details>
  <summary>Exercício 8</summary>

  ## :dart: <a href=https://github.com/dievit/BD-Linguagem-de-programacao-I/blob/main/codes/PositiveOrNot.java>Código 8</a>

Caso 1: Número positivo ou zero

| Passo | Instrução/Operação | Valor da Variável | Saída do Programa |
| --- | --- | --- | --- |
| 1 | int userChoice = scanner.nextInt(); | userChoice = 7 |  |
| 2 | if (userChoice >= 0) | 7 >= 0 (true) |  |
| 3 | System.out.println("É positivo!"); |  | É positivo! |
| 4 | scanner.close(); |  |  |

Caso2: Número negativo

| Passo | Instrução/Operação | Valor da Variável | Saída do Programa |
| --- | --- | --- | --- |
| 1 | int userChoice = scanner.nextInt(); | userChoice = -3 |  |
| 2 | if (userChoice >= 0) | -3 >= 0 (false) |  |
| 3 | System.out.println("Não é positivo!"); |  | Não é positivo! |
| 4 | scanner.close(); |  |  |
</details>

<details>
  <summary>Exercício 9</summary>

  ## :dart: <a href=https://github.com/dievit/BD-Linguagem-de-programacao-I/blob/main/codes/Apples.java>Código 9</a>

  ### Caso 1: Número de maçãs menor que 12

| Passo | Instrução/Operação | Valor da Variável | Saída do Programa |
| --- | --- | --- | --- |
| 1 | `int userNumber = scanner.nextInt();` | `userNumber = 8` |  |
| 2 | `double duzia = userNumber * maisDoze;` | `duzia = 8 * 1 = 8.0` |  |
| 3 | `double menosDuzia = userNumber * menosDoze;` | `menosDuzia = 8 * 1.30 = 10.4` |  |
| 4 | `if (userNumber < 12)` | `8 < 12` (true) |  |
| 5 | `System.out.println("O valor da compra é: R$" + ...` |  | `O valor da compra é: R$10.40` |
| 6 | `scanner.close();` |  |  |

### Caso 2: Número de maçãs igual ou maior que 12

| Passo | Instrução/Operação | Valor da Variável | Saída do Programa |
| --- | --- | --- | --- |
| 1 | `int userNumber = scanner.nextInt();` | `userNumber = 15` |  |
| 2 | `double duzia = userNumber * maisDoze;` | `duzia = 15 * 1 = 15.0` |  |
| 3 | `double menosDuzia = userNumber * menosDoze;` | `menosDuzia = 15 * 1.30 = 19.5` |  |
| 4 | `if (userNumber < 12)` | `15 < 12` (false) |  |
| 5 | `System.out.println("O valor da compra é: R$" + ...` |  | `O valor da compra é: R$15.00` |
| 6 | `scanner.close();` |  |  |
</details>

<details>
  <summary>Exercício 10</summary>

  ## :dart: <a href=https://github.com/dievit/BD-Linguagem-de-programacao-I/blob/main/codes/StudentDegrees.java>Código 10</a>

  ### Caso 1: Média maior que 6 (Aluno Aprovado)

| Passo | Instrução/Operação | Valor da Variável | Saída do Programa |
| --- | --- | --- | --- |
| 1 | `double nota1 = scanner.nextDouble();` | `nota1 = 7.5` |  |
| 2 | `double nota2 = scanner.nextDouble();` | `nota2 = 8.0` |  |
| 3 | `double mediaFinal = (nota1 + nota2)/2;` | `mediaFinal = (7.5 + 8.0)/2 = 7.75` |  |
| 4 | `System.out.println("Nota 1: " + nota1);` |  | `Nota 1: 7.5` |
| 5 | `System.out.println("Nota 2: " + nota2);` |  | `Nota 2: 8.0` |
| 6 | `System.out.println("Média final: " + ...);` |  | `Média final: 7.75` |
| 7 | `if (mediaFinal > 6)` | `7.75 > 6` (true) |  |
| 8 | `System.out.println("Aluno Aprovado!");` |  | `Aluno Aprovado!` |
| 9 | `scanner.close();` |  |  |

### Caso 2: Média menor ou igual a 6 (Aluno Reprovado)

| Passo | Instrução/Operação | Valor da Variável | Saída do Programa |
| --- | --- | --- | --- |
| 1 | `double nota1 = scanner.nextDouble();` | `nota1 = 5.0` |  |
| 2 | `double nota2 = scanner.nextDouble();` | `nota2 = 6.0` |  |
| 3 | `double mediaFinal = (nota1 + nota2)/2;` | `mediaFinal = (5.0 + 6.0)/2 = 5.5` |  |
| 4 | `System.out.println("Nota 1: " + nota1);` |  | `Nota 1: 5.0` |
| 5 | `System.out.println("Nota 2: " + nota2);` |  | `Nota 2: 6.0` |
| 6 | `System.out.println("Média final: " + ...);` |  | `Média final: 5.50` |
| 7 | `if (mediaFinal > 6)` | `5.5 > 6` (false) |  |
| 8 | `System.out.println("Aluno Reprovado!");` |  | `Aluno Reprovado!` |
| 9 | `scanner.close();` |  |  |
</details>

<details>
  <summary>Exercício 11</summary>

  ## :dart: <a href=https://github.com/dievit/BD-Linguagem-de-programacao-I/blob/main/codes/CanYouVote.java>Código 11</a>

  ### Caso 1: Números Diferentes (Ordem Correta)

| Passo | Instrução/Operação | Valor da Variável | Saída do Programa |
| --- | --- | --- | --- |
| 1 | `int num1 = scanner.nextInt();` | `num1 = 5` |  |
| 2 | `int num2 = scanner.nextInt();` | `num2 = 8` |  |
| 3 | `while (num1 == num2)` | `5 == 8` (false) |  |
| 4 | `int maior = Math.max(num1, num2);` | `maior = 8` |  |
| 5 | `int menor = Math.min(num1, num2);` | `menor = 5` |  |
| 6 | `System.out.println("Em ordem: " + menor + "," + maior);` |  | `Em ordem: 5,8` |
| 7 | `scanner.close();` |  |  |

### Caso 2: Números Iguais (Repetição até Diferentes)

| Passo | Instrução/Operação | Valor da Variável | Saída do Programa |
| --- | --- | --- | --- |
| 1 | `int num1 = scanner.nextInt();` | `num1 = 7` |  |
| 2 | `int num2 = scanner.nextInt();` | `num2 = 7` |  |
| 3 | `while (num1 == num2)` | `7 == 7` (true) | `Você está roubando, digite um número diferente!` |
| 4 | `num2 = scanner.nextInt();` | `num2 = 9` |  |
| 5 | `while (num1 == num2)` | `7 == 9` (false) |  |
| 6 | `int maior = Math.max(num1, num2);` | `maior = 9` |  |
| 7 | `int menor = Math.min(num1, num2);` | `menor = 7` |  |
| 8 | `System.out.println("Em ordem: " + menor + "," + maior);` |  | `Em ordem: 7,9` |
| 9 | `scanner.close();` |  |  |
</details>

<details>
  <summary>Exercício 12</summary>

  ## :dart: <a href=https://github.com/dievit/BD-Linguagem-de-programacao-I/blob/main/codes/BigNumber.java>Código 12</a>

  ### Caso 1: Números Diferentes

| Passo | Instrução/Operação | Valor da Variável | Saída do Programa |
| --- | --- | --- | --- |
| 1 | `int num1 = scanner.nextInt();` | `num1 = 15` |  |
| 2 | `int num2 = scanner.nextInt();` | `num2 = 30` |  |
| 3 | `while (num1 == num2)` | `15 == 30` (false) |  |
| 4 | `int maior = Math.max(num1, num2);` | `maior = 30` |  |
| 5 | `System.out.println("O maior número é: " + maior);` |  | `O maior número é: 30` |
| 6 | `scanner.close();` |  |  |

### Caso 2: Números Iguais

| Passo | Instrução/Operação | Valor da Variável | Saída do Programa |
| --- | --- | --- | --- |
| 1 | `int num1 = scanner.nextInt();` | `num1 = 25` |  |
| 2 | `int num2 = scanner.nextInt();` | `num2 = 25` |  |
| 3 | `while (num1 == num2)` | `25 == 25` (true) | `Os números são iguais! Digite um número diferente:` |
| 4 | `num2 = scanner.nextInt();` | `num2 = 40` |  |
| 5 | `while (num1 == num2)` | `25 == 40` (false) |  |
| 6 | `int maior = Math.max(num1, num2);` | `maior = 40` |  |
| 7 | `System.out.println("O maior número é: " + maior);` |  | `O maior número é: 40` |
| 8 | `scanner.close();` |  |  |
</details>

<details>
  <summary>Exercício 13</summary>

  ## :dart: <a href=https://github.com/dievit/BD-Linguagem-de-programacao-I/blob/main/codes/InOrder.java>Código 13</a>

  ### Caso 1: Números Diferentes

| Passo | Ação | Valor das Variáveis | Saída do Programa |
| --- | --- | --- | --- |
| 1 | `int num1 = scanner.nextInt();` | `num1 = 10` |  |
| 2 | `int num2 = scanner.nextInt();` | `num2 = 20` |  |
| 3 | `while (num1 == num2)` | `10 == 20` (false) |  |
| 4 | `int maior = Math.max(num1, num2);` | `maior = 20` |  |
| 5 | `int menor = Math.min(num1, num2);` | `menor = 10` |  |
| 6 | `System.out.println("Em ordem: " + menor + "," + maior);` |  | `Em ordem: 10,20` |
| 7 | `scanner.close();` |  |  |

### Caso 2: Números Iguais

| Passo | Ação | Valor das Variáveis | Saída do Programa |
| --- | --- | --- | --- |
| 1 | `int num1 = scanner.nextInt();` | `num1 = 15` |  |
| 2 | `int num2 = scanner.nextInt();` | `num2 = 15` |  |
| 3 | `while (num1 == num2)` | `15 == 15` (true) | `Você está roubando, digite um número diferente!` |
| 4 | `num2 = scanner.nextInt();` (usuário digita `10`) | `num2 = 10` |  |
| 5 | `while (num1 == num2)` | `15 == 10` (false) |  |
| 6 | `int maior = Math.max(num1, num2);` | `maior = 15` |  |
| 7 | `int menor = Math.min(num1, num2);` | `menor = 10` |  |
| 8 | `System.out.println("Em ordem: " + menor + "," + maior);` |  | `Em ordem: 10,15` |
| 9 | `scanner.close();` |  |  |
</details>

<details>
  <summary>Exercício 14</summary>
  
## :dart: <a href=https://github.com/dievit/BD-Linguagem-de-programacao-I/blob/main/codes/ChessDuration.java>Código 14</a>
  
### Caso 1: Jogo Dentro do Mesmo Dia

| Passo | Ação | Valor das Variáveis | Saída do Programa |
| --- | --- | --- | --- |
| 1 | `int hora1 = scanner.nextInt();` | `hora1 = 14` |  |
| 2 | `int hora2 = scanner.nextInt();` | `hora2 = 17` |  |
| 3 | `hora2 >= hora1` | `17 >= 14` (true) |  |
| 4 | `horaTotal = hora2 - hora1;` | `horaTotal = 17 - 14` |  |
| 5 | `System.out.println("A duração do jogo foi de: " + horaTotal + " horas");` |  | `A duração do jogo foi de: 3 horas` |
| 6 | `scanner.close();` |  |  |

### Caso 2: Jogo Cruzando a Meia-Noite

| Passo | Ação | Valor das Variáveis | Saída do Programa |
| --- | --- | --- | --- |
| 1 | `int hora1 = scanner.nextInt();` | `hora1 = 22` |  |
| 2 | `int hora2 = scanner.nextInt();` | `hora2 = 3` |  |
| 3 | `hora2 >= hora1` | `3 >= 22` (false) |  |
| 4 | `horaTotal = (24 - hora1) + hora2;` | `horaTotal = (24 - 22) + 3` |  |
| 5 | `horaTotal = 2 + 3` | `horaTotal = 5` |  |
| 6 | `System.out.println("A duração do jogo foi de: " + horaTotal + " horas");` |  | `A duração do jogo foi de: 5 horas` |
| 7 | `scanner.close();` |  |  |
  
</details>

<details>
  <summary>Exercício 15</summary>

  ## :dart: <a href=https://github.com/dievit/BD-Linguagem-de-programacao-I/blob/main/codes/Overtime.java>Código 15</a>

  ### Caso 1: Horas Trabalhadas Acima de 40 Horas

| Passo | Ação | Valor das Variáveis | Saída do Programa |
| --- | --- | --- | --- |
| 1 | `String nome = scanner.nextLine();` | `nome = "Ana"` |  |
| 2 | `double valorHora = scanner.nextDouble();` | `valorHora = 20.0` |  |
| 3 | `double valorHoraExtra = valorHora * 1.5;` | `valorHoraExtra = 30.0` |  |
| 4 | `int horaTrabalhada = scanner.nextInt();` | `horaTrabalhada = 50` |  |
| 5 | `int horaExtra = Math.max(0, horaTrabalhada - 40);` | `horaExtra = 10` |  |
| 6 | `int horaNormal = (horaTrabalhada - horaExtra);` | `horaNormal = 40` |  |
| 7 | `System.out.println("Colaborador: " + nome);` |  | `Colaborador: Ana` |
| 8 | `System.out.println("Total de horas trabalhadas: " + horaTrabalhada);` |  | `Total de horas trabalhadas: 50` |
| 9 | `System.out.println("Total de horas extras: " + horaExtra);` |  | `Total de horas extras: 10` |
| 10 | `System.out.println("Valor total em horas extras: R$" + String.format("%.2f", horaExtra * valorHoraExtra));` |  | `Valor total em horas extras: R$300.00` |
| 11 | `System.out.println("Valor total do Salário sem as horas extras: R$" + String.format("%.2f", horaNormal * valorHora));` |  | `Valor total do Salário sem as horas extras: R$800.00` |
| 12 | `System.out.println("Valor total do Salário + Horas extras: R$" + String.format("%.2f", (horaNormal * valorHora) +(horaExtra * valorHoraExtra)));` |  | `Valor total do Salário + Horas extras: R$1100.00` |
| 13 | `scanner.close();` |  |  |

### Caso 2: Horas Trabalhadas Até 40 Horas

| Passo | Ação | Valor das Variáveis | Saída do Programa |
| --- | --- | --- | --- |
| 1 | `String nome = scanner.nextLine();` | `nome = "Carlos"` |  |
| 2 | `double valorHora = scanner.nextDouble();` | `valorHora = 25.0` |  |
| 3 | `double valorHoraExtra = valorHora * 1.5;` | `valorHoraExtra = 37.5` |  |
| 4 | `int horaTrabalhada = scanner.nextInt();` | `horaTrabalhada = 35` |  |
| 5 | `int horaExtra = Math.max(0, horaTrabalhada - 40);` | `horaExtra = 0` |  |
| 6 | `int horaNormal = (horaTrabalhada - horaExtra);` | `horaNormal = 35` |  |
| 7 | `System.out.println("Colaborador: " + nome);` |  | `Colaborador: Carlos` |
| 8 | `System.out.println("Total de horas trabalhadas: " + horaTrabalhada);` |  | `Total de horas trabalhadas: 35` |
| 9 | `System.out.println("Total de horas extras: " + horaExtra);` |  | `Total de horas extras: 0` |
| 10 | `System.out.println("Valor Total em horas extras: SEM HORA EXTRA!");` |  | `Valor Total em horas extras: SEM HORA EXTRA!` |
| 11 | `System.out.println("Valor total do Salário sem as horas extras: R$" + String.format("%.2f", horaNormal * valorHora));` |  | `Valor total do Salário sem as horas extras: R$875.00` |
| 12 | `System.out.println("Valor total do Salário + Horas extras: R$" + String.format("%.2f", (horaNormal * valorHora) +(horaExtra * valorHoraExtra)));` |  | `Valor total do Salário + Horas extras: R$875.00` |
| 13 | `scanner.close();` |  |  |
</details>

<details>
  <summary>Exercício 16</summary>

  ## :dart: <a href= https://github.com/dievit/BD-Linguagem-de-programacao-I/blob/main/codes/LP1.java>Código 17</a>
  
  ### Caso 1: Valores Positivos Diferentes

| Passo | Ação | Valor das Variáveis | Saída do Programa |
| --- | --- | --- | --- |
| 1 | `double mes1 = scanner.nextDouble();` | `mes1 = 200.50` |  |
| 2 | `double mes2 = scanner.nextDouble();` | `mes2 = 300.75` |  |
| 3 | `double mes3 = scanner.nextDouble();` | `mes3 = 150.25` |  |
| 4 | `double total = mes1 + mes2 + mes3;` | `total = 651.50` |  |
| 5 | `double media = (mes1 + mes2 + mes3) / 3;` | `media = 217.17` |  |
| 6 | `System.out.println("Despesa trimestral total: R$" + String.format("%.2f", total));` |  | `Despesa trimestral total: R$651.50` |
| 7 | `System.out.println("Despesa média mensal: R$" + String.format("%.2f", media));` |  | `Despesa média mensal: R$217.17` |
| 8 | `scanner.close();` |  |  |

### Caso 2: Valores Zero e Negativos

| Passo | Ação | Valor das Variáveis | Saída do Programa |
| --- | --- | --- | --- |
| 1 | `double mes1 = scanner.nextDouble();` | `mes1 = 0.00` |  |
| 2 | `double mes2 = scanner.nextDouble();` | `mes2 = -50.00` |  |
| 3 | `double mes3 = scanner.nextDouble();` | `mes3 = 100.00` |  |
| 4 | `double total = mes1 + mes2 + mes3;` | `total = 50.00` |  |
| 5 | `double media = (mes1 + mes2 + mes3) / 3;` | `media = 16.67` |  |
| 6 | `System.out.println("Despesa trimestral total: R$" + String.format("%.2f", total));` |  | `Despesa trimestral total: R$50.00` |
| 7 | `System.out.println("Despesa média mensal: R$" + String.format("%.2f", media));` |  | `Despesa média mensal: R$16.67` |
| 8 | `scanner.close();` |  |  |
</details>

<details>
  <summary>Exercício 17</summary>
  ### Caso 1: Valores Médios

| Passo | Ação | Valor das Variáveis | Saída do Programa |
| --- | --- | --- | --- |
| 1 | `double p1 = scanner.nextDouble();` | `p1 = 7.0` |  |
| 2 | `double e1 = scanner.nextDouble();` | `e1 = 6.5` |  |
| 3 | `double e2 = scanner.nextDouble();` | `e2 = 7.5` |  |
| 4 | `double api = scanner.nextDouble();` | `api = 8.0` |  |
| 5 | `double sub = scanner.nextDouble();` | `sub = 0.0` |  |
| 6 | `double x = scanner.nextDouble();` | `x = 1.0` |  |
| 7 | `double mediaLp1 = (p1 * 0.6 + ((e1 + e2) / 2) * 0.4) * 0.5 + (Math.max(((p1 * 0.6 + ((e1 + e2) / 2) * 0.4) - 5.9), 0) / ((p1 * 0.6 + ((e1 + e2) / 2) * 0.4) - 5.9)) * (api * 0.5) + x + (sub * 0.2);` | `mediaLp1 = 7.75` |  |
| 8 | `System.out.println("Média final de LP1: " + mediaLp1);` |  | `Média final de LP1: 7.75` |

### Caso 2: Valores Extremamente Baixos

| Passo | Ação | Valor das Variáveis | Saída do Programa |
| --- | --- | --- | --- |
| 1 | `double p1 = scanner.nextDouble();` | `p1 = 3.0` |  |
| 2 | `double e1 = scanner.nextDouble();` | `e1 = 2.5` |  |
| 3 | `double e2 = scanner.nextDouble();` | `e2 = 4.0` |  |
| 4 | `double api = scanner.nextDouble();` | `api = 5.0` |  |
| 5 | `double sub = scanner.nextDouble();` | `sub = 1.0` |  |
| 6 | `double x = scanner.nextDouble();` | `x = 0.0` |  |
| 7 | `double mediaLp1 = (p1 * 0.6 + ((e1 + e2) / 2) * 0.4) * 0.5 + (Math.max(((p1 * 0.6 + ((e1 + e2) / 2) * 0.4) - 5.9), 0) / ((p1 * 0.6 + ((e1 + e2) / 2) * 0.4) - 5.9)) * (api * 0.5) + x + (sub * 0.2);` | `mediaLp1 = 3.52` |  |
| 8 | `System.out.println("Média final de LP1: " + mediaLp1);` |  | `Média final de LP1: 3.52` |
</details>
