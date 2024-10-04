# Naeptune-Manager

Bienvenue dans le backend de l'application de gestion du BDE Junia ! 

Cette application est constituée:
* D'une application backend en java
* D'une application d'authentification (à venir)


## L'organisation du code 
On utilise une [architecture hexagonale](https://medium.com/@faroukymedia/de-la-th%C3%A9orie-%C3%A0-la-pratique-spring-boot-architecture-hexagonale-et-ddd-pour-des-applications-f1110d83bced): 
* `domain` contient le coeur métier de l'application
* `infra` contient le setup, toute la partie technique de connexion aux autres applications (auth, bdd)
* `data` contient la partie repo, en communication avec la base de données
* `presentation` contient la couche de présentation de l'application, en l'occurrence les contrôleurs et points d'entrée API. Pour les contrôleurs, on utilise des interfaces (partie API), qui permettent de séparer la liste des endpoints de l'implémentation (c'est plus pratique pour la maintenance).

## Standards de code 

### Test-driven development
 Cette application est développée en [TDD](https://blog.hubspot.fr/website/test-driven-development). C'est optionnel (vous n'êtes pas obligé de développer en TDD pour contribuer, mais le code écrit doit être testé à la livraison pour pouvoir être mergé

### Workflow git
* Branche main : contient le code à jour. Ne pas pousser directement dans main
* Créer de nouvelles branches pour chaque fonctionnalité et créer des merge request pour merger le code svp merci.
* Idéalement, les MR sont relues avant d'être mergées.
* Idéalement, utiliser la syntaxe [conventional commits](https://www.conventionalcommits.org/en/v1.0.0/) pour rédiger les messages de commits.