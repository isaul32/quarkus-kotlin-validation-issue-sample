# Quarkus Kotlin validation issue sample

## Start server

```shell script
quarkus dev
```

## Kotlin

```shell script
curl -i -X POST http://localhost:8080/book -H 'Content-Type: application/json' -d '{"id": 1, "title": "test"}'

# HTTP/1.1 200 OK
# Content-Type: application/octet-stream
# content-length: 2
#
# OK
```

This is the wrong answer.

## Java

```shell script
curl -i -X POST http://localhost:8080/car -H 'Content-Type: application/json' -d '{"id": 1, "title": "test"}'

# HTTP/1.1 400 Bad Request
# validation-exception: true
# Content-Type: application/json
# content-length: 205
#
# {"exception":null,"propertyViolations":[],"classViolations":[],"parameterViolations":[{"constraintType":"PARAMETER","path":"addCar.car.id","message":"must be null","value":"1"}],"returnValueViolations":[]}
```

This is the correct answer.
