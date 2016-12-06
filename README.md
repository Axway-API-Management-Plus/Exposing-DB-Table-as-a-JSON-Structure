# Description
Axway API Gateway propose a “JDBC” Filter that can be used to query the database. 
However, by default, the filter returns a Java structure (HashMap / Array / Scalar)
The following groovy script is used to query the database and return the results as a JSON structure


## API Management Version Compatibilty
This artefact was successfully tested for the following versions:
- 7.4.1


## Install

Sample Policy to authenticate a user against a database with hashed and salted password
![alt text][Screenshot2]
[Screenshot2]: https://github.com/Axway-API-Management/Exposing-DB-Table-as-a-JSON-Structure/blob/master/Readme/Screenshot2.png  "Screenshot2"   

## Usage

Some remarks about the JSON conversion : 
- This is done by a Groovy script (one line)
- This is a built-in feature of Groovy (so, no code to maintain)


![alt text][Screenshot1]
[Screenshot1]: https://github.com/Axway-API-Management/Exposing-DB-Table-as-a-JSON-Structure/blob/master/Readme/Screenshot1.png  "Screenshot1"   

  

## Bug and Caveats

Nothing identified

## Contributing

Please read [Contributing.md] (https://github.com/Axway-API-Management/Common/blob/master/Contributing.md) for details on our code of conduct, and the process for submitting pull requests to us.

## Team

![alt text][Axwaylogo] Axway Team

[Axwaylogo]: https://github.com/Axway-API-Management/Common/blob/master/img/AxwayLogoSmall.png  "Axway logo"


## License
Apache License 2.0 (refer to document [license] (/LICENSE))
