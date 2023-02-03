# ud-rxjava3
RxJava3 From Udemy
## Pre-requisites

- **IDE**: Intellij Idea
- **Course URL**: https://www.udemy.com/course/reactive-programming-in-java-using-rxjava-3x-reactivex


## Authors

- [@bhushan2005](https://www.github.com/bhushan2005)


## Documentation



## FAQ

1. How do you describe Observable pattern?  
 - The Subject or Observable is an object which can change state
 - The Observer is an object which is interested to get notified when Subject changes state.
 - The Subject maintains a list variable to keep track of all observers.
 - The Observer objects have a method which will be called by Subject when its state changes.
 - The Observable object will have a notifyObserver() method which will be called by itself when its state changes.
 - In this example, the state of subject is considered to be changed when a sold out book becomes in stock.

