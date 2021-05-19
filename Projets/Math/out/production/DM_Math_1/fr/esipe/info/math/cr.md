# Compte rendu du DM 1 de Mathématiques
### Compte rendu effectué en binôme avec Guillaume DOMART

## Exercice 1
En janvier 2018, j'ai décidé d'investir dans 10 actions de 3 sociétés pour un total de 67€ :
Linux(10€ l'action)<br>
Oracle(5€ l'action)<br>
Eclipse(4€ l'action)<br>
En novembre 2018, l'action de Linux à doublé, celle d’Oracle a augmentée de 20 % et celle d'Eclipse a diminué de 50 %.
Mon portefeuille contient alors 104€

Quel est le nombre d'actions de chaque société achetée en janvier 2018.

## Exercice 11
Notre système d'équation va donc nous donner :

x + y + z = 10<br >
x * 10 + y * 5 + z * 4 = 67<br >
x * (10 * 2) + y * (5 * 1,2) + z* (4 * 0,5) = 104<br >

soit

x + y + z = 10<br >
10x + 5y + 4z = 67<br >
20x + 6y + 2z = 104<br >

Nous avons alors la matrice suivante

. [1, 1, 1] | [10] <br>
[10, 5, 4] | [67] <br>
[20, 6, 2] | [104]


Nous utilisons alors notre méthode de résolution d'équation linéaire et nous obtenons la solution suivante :

[4]<br >
[3]<br >
[3]<br >

Donc le nombre d'actions de Linux est de 4, celui d'Oracle de 3 et celui d'Eclipse de 3.
Investir autant dans Eclipse est selon nous, une mauvaise idée, mais on ne juge pas

## Exercice 12
La matrice D est une matrice symétrique qui n'est pas diagonale ce qui indique qu'elle n'est pas inversible.
De plus la matrice D est une matrice singulière car la première colonne x1 est égale à la première ligne x1.
Or les matrice singulières ne sont pas inversibles, donc D est bien une matrice inversible.

