package bt.rx.udrxjava3;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.Consumer;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static io.reactivex.rxjava3.core.Maybe.empty;

public class CreatingObservable {

    public static void main (String[] args) throws InterruptedException {

        // create
        System.out.println("Test using create()");
        Observable<Integer> source = Observable.create(
                e -> {
                    e.onNext(10);
                    e.onNext(11);
                    e.onNext(12);
                    e.onComplete();
                }
        );


        source.subscribe(System.out::println);

        //just
        System.out.println("Test using just()");
        Observable<Integer> just = Observable.just(10, 11, 12);
        just.subscribe(System.out::println);

        //fromIterable
        System.out.println("Test using fromIterable()");
        List<String> list = List.of("Ram", "Shyam", "Mike");
        Observable<String> fromIterable = Observable.fromIterable(list);
        fromIterable.subscribe(System.out::println);

        //range
        System.out.println("Test using range()");
        Observable.range(3,10)
                .subscribe(System.out::println);

        //interval
        System.out.println("Test using interval()");
        Observable.interval(1, TimeUnit.SECONDS)
                .subscribe(System.out::println);

        Thread.sleep(5000);

        //empty
        System.out.println("Test using empty()");
        Observable.empty()
                .subscribe( t -> System.out.println("Now onNext"),
                        Throwable::printStackTrace,
                        () -> System.out.println("Now OnComplete"));

        //never
        System.out.println("Test using never()");
        Observable.never()
                .subscribe( t -> System.out.println("Now onNext"),
                        Throwable::printStackTrace,
                        () -> System.out.println("New OnComplete"));
    }

}
