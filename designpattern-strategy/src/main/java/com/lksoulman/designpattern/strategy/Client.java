package com.lksoulman.designpattern.strategy;

import com.lksoulman.designpattern.strategy.impl.LargeCustomerStrategyImpl;

/**
 * 
 * 
 * @author chengyz
 *
 */
public class Client {

  public static void main(String[] args) {
    Strategy strategy = new LargeCustomerStrategyImpl();

    Price ctx = new Price(strategy);

    double quote = ctx.quote(1000);

    System.out.println("向客户报价： " + quote);

  }

}
