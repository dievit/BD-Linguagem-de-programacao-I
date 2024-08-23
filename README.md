Bem-vindo(a) ao repositório de Linguagem de Programação I

Os exercícios estão listados abaixo juntamente com seus respectivos testes de mesa.

<details>
  <summary>Exercício 1</summary>

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
