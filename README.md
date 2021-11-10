## KenyaEmr Automated Testing Framework.
This is the Kenya EMR Automated testing Framework thats integrates both BDD with Cucumber and Fuctional Testing with Selenium using the Page Object Model design for high Maintainability ,Readability and Re-usability

[![Kenya Emr QA](https://github.com/kenyaEmr-contrib.qaframework/actions/workflow/qa.yml/badge.svg)](https://github.com/KenyaEmr-contrib.qaframework/actions/workflow/qa.yml)

## Installing dependencies 

    mvn clean install -DskipTests=true

    ## Configuration
- Set Your test configurations in [src/test/resources/test.properties](./src/test/resources/test.properties)

- See Feature files under [src/features/](./src/features/)

### Running tests

1. All Test Features

        mvn test