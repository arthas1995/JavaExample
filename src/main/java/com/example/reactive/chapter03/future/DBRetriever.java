package com.example.reactive.chapter03.future;

/**
 * @author: Arthas
 * @date: 2019-01-10 21:46
 * @description:
 */
public interface DBRetriever {

    Customer getCustomer(long customerId);
}