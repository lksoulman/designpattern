package com.lksoulman.designpattern.paymentstrategy.impl;

import com.lksoulman.designpattern.paymentstrategy.PaymentContext;
import com.lksoulman.designpattern.paymentstrategy.PaymentStrategy;

/**
 * 美元现金支付
 * 
 * @author chengyz
 *
 */
public class DollarCashImpl implements PaymentStrategy {
  
  @Override
  public void pay(PaymentContext ctx) {
    System.out.println("现在给" + ctx.getUserName() + "美元现金支付" + ctx.getMoney() + "元");
  }
}
