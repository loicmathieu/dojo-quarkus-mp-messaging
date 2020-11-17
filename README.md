# dojo-quarkus-mp-messaging
A Quarkus dojo to experiment MicroProfile reactive messaging with Kafka

First, start the Kafka broker using the provided docker compose: 

```
docker-compose up
```

Then, you will develop an application with three components:

- [order-api](order-api): A REST API to manage orders, each time an order is created it will send a Kafka message with the new order.
- [order-enhancer](order-enhancer): A messaging component that listens to order messages and enhance them with user information.
- [search-api](search-api): A REST API to search for enhanced orders. It listens to enhanced order messages.

![Application schema](dojo-quarkus-messaging.png)

Before going to the various steps of the dojo, pleas take some time to read the following documentations:

- [Smallrye Reactive Messaging](https://smallrye.io/smallrye-reactive-messaging/smallrye-reactive-messaging/2.5/index.html)
- [Smallrye Reactive Messaging - Concepts](https://smallrye.io/smallrye-reactive-messaging/smallrye-reactive-messaging/2.5/concepts.html)

You can refer to the Quarkus [USING APACHE KAFKA WITH REACTIVE MESSAGING](https://quarkus.io/guides/kafka) guide at any time.

## Step 1

