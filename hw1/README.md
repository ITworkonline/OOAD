# Title: Project 1: the week of Animals and Zookeeper 

----**Team members**: Fei Hu, Jie Wang 

----**Folder map**: 
> animal.java    
>> Canine.java  
>>> class Wolf, Dog  
  
>> Feline.java  
>>> class Tiger, Lion, Cat  
  
>> Pachyderm.java  
>>> class Hippo, Elephant, Rhino  
  
>> Ursidae.java  
>>> class Polarbear, Panda  

> ZooEmployee.java  
>> abstract class ZooEmployee, class ZooKeeper


----**Comments**: The hardest part for us is to think how to construct such project. We have to define a Animal as a superclass. And then, let Canine, Feline, Pachyderm, and Ursidae to inhert some methods from their parent class. After that, we can design the specific animal species class inside of each category like Canine. Finally, we can define the Zookeeper class which get the abstract method from the ZooEmployee.


For this project, we have two main parts, animals and zookeeper.  

In the class of animal, we define the animal's type and name as the attributes so that when we easily initialize a new animal with its type and name as the identity. And we define the eat(), dig(), roam(), makeNoise(), charge(), wakeUp(), rollCall(), feed(), exercise(), and toSleep() methods. The reason that we build plenty of methods here is some animals don't have the unique behavior. For example, there is no difference for wakeUp behavior between a dog and a cat. So we just define it in the parent class. And some of the methods have the animal identity. We can just override in the following subclass.  

In animal's subclass, we define four different species. They can inherit attributes and methods from the animal class. And each of the species has some specific animals like cat, dog, etc... Some of the animals like dog, they have their own method called dig().  

In the class of ZooEmployee, we define it as the abstract class with some abstract methods. And then we define a ZooKeeper to extend the ZooEmployee and re-define the abstract method like this:  

```java
public void wakeUp() {
		System.out.println("Zookeeper wakes "+a.name+ " the "+ a.type + " up"  );
		a.wakeUp();
	}
```
----**Issues**:  

We also face some issues encountered in this project. For example, how to represent "25% chance the dog will dig instead of roaming"? To solve this, we generate a random variable between 0.00 to 1.00. So there will be 25% chance, it will be a number between 0.00-0.25. Here is the example for our code:  
```java
    Random rand = new Random();
    double c = rand.nextDouble();
    if(c>0.25) {
            worker.exercise();
            }else {
              instance.dig();
            }
 ```
----**Instruction of running**:  

All of our test script is in the test.java. It includes the new instances and main function. 




