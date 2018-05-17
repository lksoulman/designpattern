package com.lksoulman.designpattern.strategy.impl;

import com.lksoulman.designpattern.strategy.Strategy;

/**
 * 具体算法实现，为大客户计算应报的价格
 * 
 * @author chengyz
 *
 */
public class LargeCustomerStrategyImpl implements Strategy {

  @Override
  public double calcPrice(double goodsPrice) {
    System.out.println("对于大客户，统一折扣10%");
    return goodsPrice * (1 - 0.1);
  }

}
