#  Selection Sort
## Ordenação por Seleção
> é um algoritmo de ordenação simples e intuitivo. A ideia básica é dividir a lista em duas
>  partes: uma parte já ordenada e outra parte que ainda não foi ordenada.
> A cada iteração, o algoritmo seleciona o menor (ou maior, dependendo da ordem desejada)
> elemento da parte não ordenada e o move para o final da parte ordenada.
***
Complexidade do Selection Sort:

  ### Complexidade de tempo:

  -  Melhor caso, pior caso e caso médio: O(n²), onde n é o número de elementos na lista.

  -  Isso ocorre porque, para cada elemento, o algoritmo precisa percorrer o restante da lista para encontrar o menor elemento.

  ### Complexidade de espaço:

  -  O(1), pois o algoritmo é in-place (não usa espaço adicional significativo).
***
### Vantagens:

+ Simples de implementar.

+ Requer pouca memória adicional.

### Desvantagens:

+ Ineficiente para listas grandes.

+ Não é estável (pode alterar a ordem de elementos iguais).
