
```sh
docker run --rm --hostname my-rabbit --name some-rabbit -p 8080:15672 -p 5672:5672  rabbitmq:3-management


http://localhost:8080

guest:guest

```


```sh
POST /api/product


{
	"product" : "book",
	"price":10,
	"buyer":"Lucas",
	"phone":"12345678"
}

```



ProducerService.java


```java

 public void sendProductMessage(String id) {
        Map<String, String> actionmap = new HashMap<>();
        actionmap.put("id", id);
        log.info("Sending the index request through queue message");
        rabbitTemplate.convertAndSend(SpringBootApplication.SFG_MESSAGE_QUEUE, actionmap);
    }
    
```



MessageListener


```java

  public void receiveMessage(Product product) {
       // .getClass().log.info("Received <" + message + ">");
        String productname =  product.getProduct();
        System.out.println("product >>> "+productname);
        log.info("Message processed...");
    }
    
```




