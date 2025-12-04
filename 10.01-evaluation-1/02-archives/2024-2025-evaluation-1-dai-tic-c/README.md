# DAI-TIC-C - Évaluation 1

Cette évaluation porte sur les notions suivantes :

- Git, GitHub et Markdown
- Java, IntelliJ IDEA et Maven
- Entrées/sorties (IOs) avec Java
- Docker et Docker Compose
- Travail pratique 1

Vous pouvez répondre aux questions en français ou en anglais.

L'évaluation dure 1h. Une fois que vous avez terminé, veuillez marquer votre
évaluation comme terminée.

Validez avec le corps enseignant que le système a bien enregistré votre
évaluation. Vous pourrez ensuite quitter la salle de façon silencieuse.

Ressources autorisées :

- Une feuille de résumé (recto) papier avec vos propres notes

Toute tentative de tricherie sera sanctionnée avec la note 1.

---

## Question 1 (2 points)

Que signifie résoudre un conflit dans Git et comment cela se produit-il ?


<summary>Afficher la réponse</summary>

Resolving a conflict means manually adjusting/merging differences in a file (1 point) 
when two or more people have contributed changes to this file at the same time (1 point).



## Question 2 (2 points)

Expliquez pourquoi il est crucial de spécifier l'encodage des caractères lors de
la lecture ou de l'écriture de données textuelles en Java. Quelles pourraient
être les conséquences de ne pas le faire ?


<summary>Afficher la réponse</summary>

Specifying the character encoding ensures that the characters are Correctly interpreted when reading or writing data (1 point). 

Not specifying the encoding can result in unreadable characters or Encoding errors (1 point).



## Question 3 (1 points)

Vrai ou faux : La méthode `readLine()` renvoie une chaîne qui ne contient pas
les caractères de fin de ligne.


<summary>Afficher la réponse</summary>

Vrai (1 point)



## Question 4 (2 points)

Expliquez la différence entre le JDK et le JRE.


<summary>Afficher la réponse</summary>

The JDK (Java Development Kit) is required to develop applications Java (1 point), 
while the Java Runtime Environment (JRE) is required to run Java applications (1 point).



## Question 5 (8 points)

Écrivez un programme Java qui lit le contenu d'un fichier texte (par exemple,
`input.txt`), puis écrit son contenu dans un autre fichier texte (`output.txt`).
Assurez-vous d'utiliser toutes les bonnes pratiques vues en cours.

```java
class FileCopy {

  public static void main(String[] args) {
    // TODO: Implement the file copy program
  }
}
```


<summary>Afficher la réponse</summary>

```java
import java.io.*;
import java.nio.charset.StandardCharsets;

class FileCopy {

  public static void main(String[] args) {
    try ( // Try-with-resources to automatically close the resources (1 point)
        Reader reader = new FileReader("input.txt", StandardCharsets.UTF_8); // Use FileReader (0.5 point) with UTF-8 encoding (0.5 point)
        BufferedReader br = new BufferedReader(reader); // Use BufferedReader for efficiency (1 point)
        Writer writer = new FileWriter("output.txt", StandardCharsets.UTF_8); // Use FileWriter (0.5 point) with UTF-8 encoding (0.5 point)
        BufferedWriter bw = new BufferedWriter(writer) // Use BufferedWriter for efficiency (1 point)
    ) {
      int c;
      // Read the file character by character until the end of the file (1 point)
      while ((c = br.read()) != -1) {
        // Write the character to the output file (1 point)
        bw.write(c);
      }

      // Flush the buffer to ensure all data is written (1 point)
      bw.flush();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
```


## Question 6 (3 points)

Dans quel ordre devez-vous effectuer les étapes suivantes pour proposer une
nouvelle fonctionnalité dans un projet open source ?

1. Effectuez vos modifications, effectuez des commits et poussez-les aussi
   souvent que vous le souhaitez
2. Vous pouvez supprimer la branche ou le fork
3. Les mainteneurs examinent et mergent si tout est en ordre
4. Clonez ou forker le projet et basculez vers une nouvelle branche
5. Créez la pull request
6. Ouvrez une issue pour discuter de la fonctionnalité (facultatif, mais
   recommandé)


<summary>Afficher la réponse</summary>

1. 6
2. 4
3. 1
4. 5
5. 3
6. 2



## Question 7 (1 point)

Quel est l'objectif principal de Docker ?

1. Installer des systèmes d'exploitation
2. Gérer des bases de données
3. Fournir une plateforme de services de conteneurs
4. Créer des applications Web


<summary>Afficher la réponse</summary>

Fournir une plateforme de services de conteneurs (1 point)



## Question 8 (4 points)

Rédigez un document Markdown qui présente les points suivants:

- Un titre "Mes langues préférés"
- Un paragraphe avec une brève introduction fictive
- Une image fictive de votre langue préféré
- Une liste à puces ordonnée de 2-3 langues fictives
- Un sous-titre "Niveau de maîtrise"
- Un tableau avec les colonnes suivantes et qui comporte trois données fictives:
  - Langue
  - Niveau


<summary>Afficher la réponse</summary>

```markdown
# Mes langues préférées (0.5 point)

Ceci est une introduction fictive. (0.5 point)

![Langue préférée](https://example.com/image.jpg) (0.5 point)

1. Langue 1 (0.5 point)
2. Langue 2
3. Langue 3

## Niveau de maîtrise (0.5 point)

| Langue (0.5 point)   | Niveau (0.5 point) |
| -------------------- | ------------------ |
| Langue 1 (0.5 point) | Avancé             |
| Langue 2             | Intermédiaire      |
| Langue 3             | Débutant           |
```



## Question 9 (2 points)

Pourquoi est-il recommandé d'utiliser un gestionnaire de versions Java ?


<summary>Afficher la réponse</summary>
A version manager allows you to install and switch between different Java versions (1 point), 
ensuring compatibility with the used by other developers in a project (1 point).



## Question 10 (1 points)

Vrai ou faux : L'utilisation de try-with-resources ne garantit pas que les
ressources sont fermées même en cas d'erreur.

<details>
<summary>Afficher la réponse</summary>

Faux (1 point)

</details>

## Question 11 (3 points)

Qu'est-ce que Maven et à quoi sert-il ?


<summary>Afficher la réponse</summary>

Maven is a dependency management and automation tool (0.5 points). 

Maven defines a standard file structure (0.5 points) and allows you to manage external dependencies (0.5 points) as well as plugins (0.5 points). 

Maven defines a compilation process (0.5 points) for a build Java Applications (0.5 points)

## Question 12 (8 points)

Des erreurs et des mauvaises pratiques se sont glissées dans le code suivant.
Identifiez-les et proposez une correction.

```java
    OutputStream fos = new FileOutputStream(filename);

    try {
      for (int i = 0; i < 10; i++) {
        filename.write(1);
      }
    } catch (IOException e) {
      System.err.println("Error: " + e.getMessage());
    }
```


<summary>Afficher la réponse</summary>

```java
    // Commentaires
    OutputStream fos = new FileOutputStream(filename); // Initialisation à l'extérieur du bloc try (1 point) + Non-buffered (1 point)

    try {
      for (int i = 0; i < 10; i++) {
        filename.write(1); // Il écrit dans filename au lieu de fos (1 point)
      }
    } catch (IOException e) {
      System.err.println("Error: " + e.getMessage());
    } // Il manque le finally pour fermer le flux (1 point)
```

```java
    // Corrections
    OutputStream fos = null;
    BufferedOutputStream bos = null;

    try {
      fos = new FileOutputStream(filename);
      bos = new BufferedOutputStream(fos);

      for (int i = 0; i < 10; i++) {
        bos.write(1);
      }
    } catch (IOException e) {
      System.err.println("Error: " + e.getMessage());
    } finally {
      if (bos != null) {
        try {
          bos.close();
        } catch (IOException e) {
          System.err.println("Error: " + e.getMessage());
        }
      }
    }
```



## Question 13 (1 point)

Quel est l'objectif principal de l'encodage UTF-8 ?

1. Supporter plusieurs alphabets
2. Mapper 128 valeurs binaires à 128 caractères
3. Encoder des caractères en ASCII
4. Supporter des emojis


<summary>Afficher la réponse</summary>

Supporter plusieurs alphabets (1 point)



## Question 14 (2 points)

Expliquez la différence entre `git clone` et `git push`.


<summary>Afficher la réponse</summary>

'git clone' creates a local copy of a remote repository (1 point), 
while 'git push' pushes local changes to the remote repository (1 dot).



## Question 15 (1 point)

Quel est l'objectif de la spécification OCI ?

1. Définir un standard pour la gestion des systèmes d'exploitation
2. Définir un standard pour les images de conteneurs
3. Gérer les mises à jour de Docker
4. Aucune de ces réponses


<summary>Afficher la réponse</summary>

Définir un standard pour les images de conteneurs (1 point)


