# 📚 Book API

Une API REST simple pour gérer des livres, créée avec **Spring Boot** et une base de données **SQLite**. Cette API permet d’effectuer les opérations CRUD (Create, Read, Update, Delete) sur des livres.

## 🛠️ Technologies utilisées

- **Java 17**
- **Spring Boot 3**
- **Spring Data JPA**
- **SQLite**
- **Springdoc OpenAPI (Swagger UI)**

## ✨ Fonctionnalités

- **Ajouter un livre** : Enregistrer un nouveau livre avec un titre et un auteur.
- **Consulter un livre** : Obtenir les détails d’un livre spécifique via son `id`.
- **Lister les livres** : Obtenir la liste de tous les livres enregistrés.
- **Mettre à jour un livre** : Modifier les informations d’un livre existant.
- **Supprimer un livre** : Supprimer un livre de la base de données.


## 📄 Endpoints de l'API

Les principaux endpoints disponibles sont :

| Méthode | Endpoint      | Description              | Exemple de corps de requête |
|---------|---------------|--------------------------|-----------------------------|
| GET     | `/api/books`  | Récupérer tous les livres | _N/A_                       |
| GET     | `/api/books/{id}` | Récupérer un livre par son ID | _N/A_                   |
| POST    | `/api/books`  | Ajouter un nouveau livre | `{"title": "1984", "author": "George Orwell"}` |
| PUT     | `/api/books/{id}` | Mettre à jour un livre existant | `{"title": "Animal Farm", "author": "George Orwell"}` |
| DELETE  | `/api/books/{id}` | Supprimer un livre     | _N/A_                       |

## ⚙️ Configuration

### Fichier `application.properties`

Voici une configuration minimale pour utiliser SQLite :

```properties
spring.datasource.url=jdbc:sqlite:database.db
spring.datasource.driver-class-name=org.sqlite.JDBC
spring.jpa.database-platform=org.hibernate.dialect.SQLiteDialect
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

## 🚀 Lancer l'application

1. Clone ce repository.
2. Assure-toi d’avoir **Java 21** et **Maven** installés sur ta machine.
3. Exécute la commande suivante pour démarrer l’application :
   ```
   ./mvnw spring-boot:run
   ```
4. L’application sera disponible sur `http://localhost:8080`.

## 🧭 Documentation API

La documentation interactive de l’API est disponible via **Swagger UI** à l’adresse suivante :  
`http://localhost:8080/swagger-ui.html`

