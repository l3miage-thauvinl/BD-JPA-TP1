# Compte Rendu TP1 JPA
## Exercice 1

### 1. Décrivez ce que vous observez en base de données lorsque l'on déclare une classe comme ClassTestJPA ?
Lorsque l'on déclare une classe tel que  ClassTestJPA, les noms d'attributs qui étaient en kamel case se transforment en snake case.
Et les types énumérés se transforment soit en chiffre soit en string (selon le type d'énumération choisie)
### 2. Quels sont les effets des propriétés ajoutées dans les @Column dans la classe ClassTestJPATwo ?
Quand on regarde dans les properties de la table JPATestTwo, et qu'on va dans l'onglet column, on voit bien que chaque attributs ont été ajoutés (unique et precision)
### 3.  À votre avis, dans quels cas est-il nécessaire de mettre les annotations @Column ?`
Il est utilise de mettre les annotation columns lorsque l'on se trouve dans le paradigme validate

