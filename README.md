# ud-rxjava3
RxJava3 From Udemy
## Pre-requisites

- **IDE**: Intellij Idea
- **Course URL**: https://www.udemy.com/course/reactive-programming-in-java-using-rxjava-3x-reactivex


## Authors

- [@bhushan2005](https://www.github.com/bhushan2005)


## Documentation

Different ways to create Observable.
1. create
2. just
3. fromIterable
4. range
5. interval
6. empty
7. never

There are some more but I have only put examples of above.  
Observable from empty() only calls onComplete() and not onNext() or onError().  
Observable from never() does not call anything.  
Observable from interval() runs in a seperate thread and emits events. Hence, we need to put Thread.sleep() in main
so that the main thread does not exit.

## FAQ
