# Config Server Demo

### Steps

* Get Message: http://localhost:8080/message
* Change message's value in a-bootiful-client.properties
* git commit the change
* Validate change can be read by Config Server: http://localhost:8888/a-bootiful-client/default
* Refresh, POST: http://localhost:8080/actuator/refresh
* Re-visit Client App: http://localhost:8080/messageS

```
# Refresh through curl
# -d: Sends the specified data in a POST request to the HTTP server
curl localhost:8080/actuator/refresh -d {} -H "Content-Type: application/json"
```