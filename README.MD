## Gradle Docker CI Example

The idea of this project is to have boilerplate template of a gradle project that can be 
executed and test in a docker container.

The idea behind this is to allow to test and run an application in a controlled environment.
 
To run the application in the docker container just run:

```shell
~ $ gradlew dockerRun
```

To run the tests just run:

```shell
~ $ gradlew dockerTest
```

If you like to customize the docker image just edit docker/DOCKERFILE

This boilerplate could be used not only for any kind of application, jut modify the gradle
build to copy and run what ever you need in the container