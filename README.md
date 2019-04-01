# jboss-poc

Spring Boot application on Java EE Container (JBoss).

## How to start?

In order to start the POC use:

```bash
$ git clone https://github.com/alobaton/jboss-poc.git

$ cd jboss-poc
$ mvn clean install
```

Update your `standalone/deployments/standalone.xml` file. See [Deploy a WAR File in JBoss](https://www.baeldung.com/jboss-war-deploy)

Now open your browser at http://localhost:8080/hello-world

## Contributors

[<img alt="alobaton" src="https://avatars1.githubusercontent.com/u/9356067?s=460&v=4" width="117">](https://github.com/alobaton)

## License

[MIT](https://github.com/alobaton/jboss-poc/blob/master/LICENSE)