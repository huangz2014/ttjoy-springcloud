package com.ttjoy.gateway;

import org.testng.Assert;
import org.testng.annotations.Test;
import reactor.core.publisher.Flux;

import java.util.Arrays;
import java.util.List;

public class FluxTests {
    @Test
    public void test1(){
        Flux.generate(
                () -> 0,
                (state, sink) -> {
                    sink.next("3 X " + state + "=" + 3*state);
                    if (state == 10){
                        sink.complete();
                    }
                    return state+1;
                }
        ).subscribe(System.out::println);
        Assert.assertTrue(true);
    }

    @Test
    public void test2(){
        Flux.just("tom", "jack", "allen")
                .filter(s -> s.length() > 3)
                .map(s -> s.concat("@qq.com"))
                .subscribe(System.out::println);
        Assert.assertTrue(true);
    }


    @Test
    public void test3(){
        List<String> words = Arrays.asList("th", "qu");
        Flux.fromIterable(words)
                .flatMap(word -> {
                    System.out.println("Step1=" + word);
                    return Flux.fromArray(word.split(""));
                })
                .filter(s -> {
                    System.out.println("Stem2=" +s);
                    return true;
                })
                .filter(s -> {
                    System.out.println("Step3=" + s);
                    return true;
                })
                .subscribe(System.out::println);
        Assert.assertTrue(true);
    }
}
