package com.lksoulman.designpattern.strategy.impl;

import com.lksoulman.designpattern.strategy.Strategy;

/**
 * 具体算法实现，为新客户或者是普通客户计算应报的价格
 * 
 * @author chengyz
 *
 */
public class NormalCustomerStrategyImpl implements Strategy {

  @Override
  public double calcPrice(double goodsPrice) {
    System.out.println("对于新客户或者是普通客户，没有折扣");
    return goodsPrice;
  }

}
