# AndroidTest
Documentation de L'application

Pour le 1er écran, on trouve la liste des villes ajoutées par l’utilisateur.
Dans la liste, il y a un floating action button qui va donner la main à l'utilisateur pour ajouter une ville.
Il suffit de cliquer sur  le bouton plus  - >un nouvel écran qui s’affiche avec une zone de texte.
Qui donnait l’accès à l’utilisateur pour ajouter une ville. Après quand l'ajout avec succès en retourna directement à la liste des villes. Puis quand on va cliquer  sur l'item de la liste en affiche le détail a travers de la consommation de l’api d'openWeatherMap
L’architecture utilisée : 
Clean Architecture, MVVM,
Kotlin, Androidx, Mockito, Dagger pour tout ce qu'est injection .
Consommation de web Service, j’ai utilisé Retrofit , et pour L'enregistrement des données en local j’ai utilisé ROOM »SQLITE »
