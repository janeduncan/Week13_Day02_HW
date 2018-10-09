# Homework: Files and Folders
📁📁📁📁📁📁📁📁📁📁📁📁📁

### Learning Objectives

- Understand the relationships
- Be able to implement one-to-many relationships between models with Spring JPA + Hibernate
- Be able to Spring Data REST to create the RESTful routes for a set of resources

## Brief

Create a one-to-many Spring application using annotations. Your application should have the following models: `Folders`, `Files` and `Users`. Users should have many folders, and folders should have many files.

### MVP

- Create a system to track files and folders:
  - A `File` should have:
     - a name
     - extension (e.g. txt, rb, java, ppt)
     - size
     - folder
  - A `User` should have:
     - name
     - a list of folders
  - A `Folder` should have:
     - a title
     - list of files

- Test with Data Loader, running the application and manually inspecting postgres
- Enable Spring Data REST to create the RESTful routes
- Test GET and POST routes using Insomia REST Client

## Planning

Draw a diagram detail the relationships between models.
