package com.mak;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StreamTest {
    
    //Create stream
    List<String> names;

    @BeforeEach
    void setUp() {
        names = Arrays.asList("Bob", "Charlie", "David", "Alice");
    }
    @Test
    void testStreamForeach() {
        String[] names1 = {"Alice", "Bob", "Charlie"};
        Stream.of(names1).forEach(System.out::println);
        names.stream().forEach(System.out::println);
    }

    @Test
    void testStreamSorted() {
        names.stream().sorted().forEach(System.out::println);
    }

    @Test
    void testStreamFilter() {
        List<String> filtered = names.stream()
            .filter(name -> name.startsWith("A") || name.startsWith("B"))
            .sorted()
            .collect(Collectors.toList());

        System.out.println(filtered);
    }
    @Test
    void testStreamFilterMapped() {
        List<String> filteredAndMappedList = names.stream()
            .filter(name -> name.startsWith("A") || name.startsWith("B"))
            .map(String::toUpperCase)
            .sorted()
            .collect(Collectors.toList());

        System.out.println(filteredAndMappedList);
    }
        
}


