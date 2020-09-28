# Title: Project 2: Improved the week of Animals and Zooemployees

**Team Members:** Fei Hu, Jie Wang

**Folder Map:** 

> class animal.java    

>> subclass Canine.java  

>>> subclass Wolf, Dog  

>> subclass Feline.java  

>>> subclass Tiger, Lion, Cat  

>> subclass  Pachyderm.java  

>>> subclass Hippo, Elephant, Rhino  

>> subclass  Ursidae.java  

>>> subclass Polarbear, Panda  

> ZooEmployee.java  

>> subclass ZooKeeper, class ZooAnnouncer, class ZooFoodServer

> Interface Observer.java

>> ZooAnnouncer.java 

> Interface Subject

>> ZooKeeper.java, ZooAnnounce.java

> ZooClock.java  



**Comments: **

Based on project 1, we improve the zoo animal system from following aspect: 1) Add roamBehavior based on Strategy pattern; 2) set ZooAnnouncer as an observer to observe ZooKeeper and ZooFoodServer at the same time through Observe patter; 3) Add class Zooclock to make sure time schedule.

For part 1), let each  animal has a romaBehavior which is a delegation for different kind of roaming ways for for types of animals. Set roamBehavior in each type of animal when construcing, like:

```java
    public Feline(String type, String name) {
    		super(type, name);
    		roamBehavior = new FelineRoam();
    	}
```

For part 2), set interface Subject:
```java
    public interface Subject {	
    	public void registerObserver(Observer o);
    	public void removeObserver(Observer o);
    	public void notifyObservers();
    }
```

and Observer:
```java
    public interface Observer {
    	public void update(String action);
    }
```

As ZooAnnouncer is a concrete Observer, it  implements Observer interface. As ZooKeeper and ZooFoodServer are concretes Subjects, they implement the Subject Interface. Every class of the three is a ZooEmployee, it also extends the super class. ZooAnnouncer registers it as a observer in bouth ZooKeeper and ZooFoodServer. When taking actions, ZooKeeper and ZooFoodServer update messages with ZooAnnouncer who will annouce the action according to requests. When there are no further events to announce for the day, the ZooAnnouncer should cease observing and leave.

For part 3), we set ZooClock to take charge of executiong schedule. The ZooClock maitains the current time increment, and let Zookeeper perform tasks at choosing time.  For example, when time hits 9am, the Zookeeper  calls every animals. 

In the test.java, we instantiate different animals like cat Charlie. From the first day to the seventh day, Zookeeper, ZooFoodServer, ZooAnnouncer performs tasks at certian time.


**Issues:**

1) The first issue is how to design observe pattern in this project. As ZooAnnouncer, ZooKeeper and ZooFoodServer are all subclasses of ZooEmployee, and the former need to observe the later two objects. The method is to let ZooAnnouncer extends ZooEmployee and implements Observer, ZooKeeper and ZooFoodServer extends ZooEmployee and implements Subjects. And in each function, use notifyObservers() to update messages with ZooAnnouncer.

2) How to realize ZooClock is another problem we faced. We were not sure how to call functions in this class. By moving functions like wakeUp_all(), rollCall_all() from test.java to ZooClock, whick makes it clear to set time schedule and still keeps the basic requets in project 1.

3) We don't want ZooAnnouncer print the action every time Zookeeper executes the same task. For example, Zookeeper wakes each animal up every day, but we only need the ZooAnnoucer print the first action, so we use if...else to let it works only for the first execution. And after completing all tasks, let the Announcer remove from the list, like:
```java
    worker0.removeObserver(zooAnnouncer);
```

**Instructions:**

According to above description, the running results come out from test.java which include animal initiation and main logic.
