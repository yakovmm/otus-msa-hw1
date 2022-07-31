## Курс OTUS Microservice architect
### ДЗ №1 - «Основы работы с Kubernetes»

1. ```
   Создать минимальный сервис, который отвечает на порту 8000, 
   имеет http-метод GET /health/ RESPONSE: {"status": "OK"}
   Собрать локально образ приложения в докер.
   Запушить образ в docker hub
   ``` 
   `mvn clean package` – собирает исполняемый JAR-файл (при проверке делать не надо, сделано заранее)

   `docker build -t yakovmm/otus-msa-hw1:v1 -f docker/Dockerfile .` – собирает образ yakovmm/otus-msa-hw1:v1 (при проверке делать не надо, сделано заранее)

   `docker push yakovmm/otus-msa-hw1:v1` – пушит образ в docker hub (при проверке делать не надо, сделано заранее)


2. ```
   Написать манифесты для деплоя в k8s для этого сервиса. 
   Манифесты должны описывать сущности Deployment, Service, Ingress.
   В Deployment могут быть указаны Liveness, Readiness пробы.
   Количество реплик должно быть не меньше 2.
   Image контейнера должен быть указан с docker Hub.
   Хост в ингрессе должен быть arch.homework.
   В итоге, после применения манифестов GET запрос на http://arch.homework/health должен отдавать {“status”: “OK”}.
   ```
   
    `kubectl apply -f k8s/` – применяет манифесты

    При условии корректной настройки kubectl + /etc/hosts, по адресу http://arch.homework/health доступен healthcheck приложения 

    `postman/collection.json` - коллекция скриптов Postman для тестирования по всем адресам приложения
 
    `kubectl delete deployment/otus-msa-hw1 service/otus-msa-hw1 ingress/ingress-otus-msa-hw1 ingress/ingress-otus-msa-hw1-rewrite` – удаляет созданные сущности

3. ```
   В Ingress-е должно быть правило, которое форвардит все запросы с /otusapp/{student name}/* на сервис с rewrite-ом пути. Где {student name} - это имя студента
   ```
   
    Отдельный ингресс с рерайтом редиректит `http://arch.homework/otusapp/yakovmm/($1)` на `http://arch.homework/($1)`
---