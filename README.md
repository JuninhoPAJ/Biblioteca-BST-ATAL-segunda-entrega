Documentação - Biblioteca-BST-ATAL (Segunda Entrega)
-----------------------------------------------------------------------------------------------
Sumário
1. Implementação das Técnicas e Estruturas Avançadas
1.1. Estrutura Utilizada: Árvore Binária de Busca (BST)
1.2. Métodos de Busca e Recomendação
1.3. Estrutura Modular

2. Justificativa das Escolhas
2.1. Escolha da Estrutura: Árvore Binária de Busca
2.2. Justificativa para Métodos de Recomendação
2.3. Comparação com Alternativas

3. Conclusão
-----------------------------------------------------------------------------------------------

1. Implementação das Técnicas e Estruturas Avançadas
1.1 Estrutura Utilizada: Árvore Binária de Busca (BST)
A estrutura escolhida para armazenar e organizar os livros foi a Árvore Binária de Busca (BST). Cada nó da árvore representa um livro e contém as seguintes informações:

Título (chave principal para ordenação e busca).
Autor.
Ano de publicação.
A árvore foi implementada com as seguintes propriedades:

Cada nó armazena um objeto da classe Livro.
Livros com títulos menores (em ordem alfabética) são armazenados no subárvore esquerda.
Livros com títulos maiores (em ordem alfabética) são armazenados no subárvore direita.
Operações principais implementadas na BST:

Adicionar Livro:
Adiciona um novo nó na árvore, respeitando as regras de ordenação.

Listar Livros em Ordem Alfabética:
Percorre a árvore em ordem (in-order traversal) para exibir os livros em ordem alfabética.

Buscar Livros por Autor:
Realiza uma travessia completa da árvore para encontrar todos os livros de um autor específico.

Buscar Livros por Ano:
Percorre a árvore e exibe os livros publicados em um ano específico.

Recomendar Livros por Intervalo de Anos:
Realiza uma travessia completa da árvore para listar livros cujo ano de publicação esteja dentro de um intervalo especificado.

1.2 Métodos de Busca e Recomendação
Busca por Autor:
Foi implementada como uma travessia em profundidade (DFS), verificando cada nó para encontrar livros cujo autor corresponda ao critério de busca.

Recomendação por Intervalo de Anos:
A lógica filtra nós cujos valores de ano estejam entre os limites fornecidos, percorrendo toda a árvore.

1.3 Estrutura Modular
Classe Livro: Representa os objetos armazenados na árvore, contendo título, autor e ano.
Classe NoArvore: Representa os nós da árvore, com ponteiros para os filhos esquerdo e direito.
Classe ArvoreBinariaDeBusca: Contém a lógica da árvore e métodos para as operações.
Classe GerenciadorLivros: Implementa o menu interativo para o usuário.
2. Justificativa das Escolhas
2.1 Escolha da Estrutura: Árvore Binária de Busca
A Árvore Binária de Busca foi escolhida por proporcionar:

Eficiência nas operações de busca e inserção:

Operações como adicionar, buscar e listar em ordem têm complexidade média O(log n) em árvores balanceadas.
Embora não tenha sido implementado um balanceamento explícito, a inserção ordenada garante um desempenho adequado para o volume esperado de dados.
Simplicidade na organização dos dados:

A BST permite organizar os livros de forma hierárquica, facilitando operações como listagem ordenada e buscas por critérios específicos.
Facilidade de Expansão:

A estrutura pode ser facilmente adaptada para incluir balanceamento (como AVL ou Red-Black Trees), caso o volume de dados cresça significativamente.
2.2 Justificativa para Métodos de Recomendação
Recomendação por Autor:

Permite ao usuário identificar facilmente livros relacionados a um autor específico, promovendo descoberta de conteúdos semelhantes.
Recomendação por Intervalo de Anos:

Oferece flexibilidade na pesquisa, permitindo a exploração de livros dentro de um contexto histórico ou período de tempo definido.
2.3 Comparação com Alternativas
Lista Sequencial (Primeira Entrega):
A lista sequencial, embora simples, não é eficiente para grandes volumes de dados devido à sua complexidade O(n) para busca e inserção.
A árvore binária de busca supera essas limitações, oferecendo uma estrutura mais eficiente e flexível.

Árvore Balanceada ou Grafos:
Uma árvore balanceada (AVL ou Red-Black Tree) seria uma escolha mais eficiente em termos de desempenho, mas a implementação seria mais complexa para o escopo do projeto atual.
Grafos, embora úteis para relações entre autores, são excessivamente complexos para representar a estrutura hierárquica de livros baseada em títulos.

3. Conclusão
A implementação com Árvore Binária de Busca atendeu aos requisitos do projeto, oferecendo uma estrutura eficiente e organizada para armazenar, buscar e recomendar livros. Essa escolha equilibra simplicidade, desempenho e potencial para futuras expansões, alinhando-se bem ao objetivo do sistema.