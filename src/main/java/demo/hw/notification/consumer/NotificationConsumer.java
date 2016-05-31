//package demo.hw.notification.consumer;
//
//import org.apache.cxf.wsn.client.Consumer;
//import org.apache.cxf.wsn.client.NotificationBroker;
//import org.apache.cxf.wsn.client.Subscription;
//import org.w3c.dom.Element;
//
//public final class NotificationConsumer {
//    private NotificationConsumer() {
//        //not constructed
//    }
//
//    public static void main(String[] args) throws Exception {
//        String wsnPort = "8080";
//        if (args.length > 0) {
//            wsnPort = args[0];
//        }
//
//        // Start a consumer that will listen for notification messages
//        // We'll just print the text content out for now.
//        Consumer consumer = new Consumer(message -> {
//            Object o = message.getMessage().getAny();
//            System.out.println(message.getMessage().getAny());
//            if (o instanceof Element) {
//                System.out.println(((Element) o).getTextContent());
//            }
//        }, "http://localhost:9001/MyConsumer");
//
//
//        // Create a subscription for a Topic on the broker
//        NotificationBroker notificationBroker
//                = new NotificationBroker("http://localhost:" + wsnPort + "/soap/mtosi/NotificationProducer");
//        Subscription subscription = notificationBroker.subscribe(consumer, "Alarms");
//
//
//        // Just sleep for a bit to pick up some incoming messages
//        Thread.sleep(60000);
//
//        // Cleanup and exit
//        subscription.unsubscribe();
//        consumer.stop();
//        System.exit(0);
//    }
//
//}
