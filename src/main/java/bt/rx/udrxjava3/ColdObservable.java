package bt.rx.udrxjava3;

import io.reactivex.rxjava3.core.Observable;

import java.util.ArrayList;
import java.util.List;

public class ColdObservable {

    public static void main (String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(16);
        list.add(17);
        list.add(18);

        Observable<Integer> source = Observable.fromIterable(list);

        source.subscribe(System.out::println);
        list.add(19);
        source.subscribe(System.out::println);

    }


}
