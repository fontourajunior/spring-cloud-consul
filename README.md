# Simple project with Spring Cloud Conul

This project has de function of create a simple project that read properties of a external repository. The project use docker run the following dependencies

  - Consul
  - Git2Consul (Oficil repository - `<link>` : <https://github.com/breser/git2consul>)

## Repository with properties
  - Create a repository in git, it must have a directory with the same name that was defined in "spring.application.name", and within that directory create a file named "data". this file must count the properties.
  
## Configuration
  - In the conig/config.json directory within the project, put id, name, and tag with the same name of  directory where the properties are.
  - In the git2consul.json file, enter the git address that contains properties, and inform which branch to use.
  ```json
  "url" : "https://github.com/fontourajunior/consul.git",
  "branches" : ["master"],
  ```
  
  Atention! The properties "spring.application.name", "spring.cloud.consul.config.name" found in the bootstrap.properties file must contain the same repository name within the external of git repository that has the properties.
  
# Dependencies to run project!

  - Docker (https://docs.docker.com/install/)
  - Docker Compose (https://docs.docker.com/compose/install/)

# Run project!

To start the project it is necessary to make a project clone, go to the project's root directory and start the docker container by calling the configured docker-compose in the project.

```sh
docker-compose up
```
