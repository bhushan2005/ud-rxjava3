package bt.rx.udrxjava3;

import io.reactivex.rxjava3.core.Observable;
public class HelloWorld {

    public static void main (String[] args) {

        Observable<String> source = Observable.create(
                e -> {
                    e.onNext("Hello");
                    e.onNext("World");
                });
        source.subscribe(e -> System.out.println("Observer 1 "+e));
        source.subscribe(e -> System.out.println("Observer 2 "+e));
    }

}
