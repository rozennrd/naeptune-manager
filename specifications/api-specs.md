# Introduction et Préambule

Le texte suivant sert à démarrer le projet. Les spécifications suivante sont susceptible de changer/évoluer au cours du projet. Il s'agit d'une description d'une estimation des fonctionnalités pour l'api. Il ne s'agit pas d'une conception de l'API, la description des données de constitue pas la définition d'une entité. La responsabilité de la conception appartient au concepteur/développeur.

# Général
	- gestion de compte utilisateur et authentification
	- gestion des stocks et des ventes

#  Définition

1. Gestion des comptes
	- gestion de role (admin, modérateur, utilisateur)
	- création/supression de compte par les admins
	- modification de son propre compte (plus pour les admins)
	- lecture des utilisateurs pour les admins 

2. Gestions des stocks
	- ajout de produit
	- suppression de produit
	- update de produit
	- lecture de produit

3. Gestions des vents
	- ajout/supression d'une vente (update du stock)
	- suppression d'une vente (update du stock)
	- update d'une vente (update du stock)

# Les données

On estime que une vente est caractérisé par:
	- une liste de ProduitVente
	- un prix total
	- un acheteur (utilisateur)

On estime que une ProduitVente est caractérisé par:
	- un produit
	- une quantite
	- un prix total
	- une date et une heure

On estime qu'un produit est caractérisé par:
	- un stock
	- un stock idéal
	- un nom
	- un prix adherent
	- un prix non adherent

On estime qu'un utilisateur est caractérisé par:
	- un nom
	- un prenom
	- un mail
	- un booleen indiquant s'il est adhérent
	- la promotion
	- un sexe
	- photo
