
Assignment 2: Java backend developer
Software required: Spring boot, Eclipse MySQL

Create a spring scheduler to download json data from link https://api.wazirx.com/sapi/v1/tickers/24hr and store it in mysql server database table CRYPTODATA.
All REST controller should be secured with http header "Authorization". You need to pass this http header from client code while calling your REST API. If this header present with some value then return the response.
Create a REST controller which supports GET method and return data from CRYPTODATA in CSV format
Create a REST controller with supports POST method and accepts a JSON request. Receive a json request which contains symbol to be searched and return a result in JSON format by searching table where symbol=something
