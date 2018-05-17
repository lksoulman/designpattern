package com.lksoulman.designpattern.paymentstrategy.impl;

import com.lksoulman.designpattern.paymentstrategy.PaymentContext;
import com.lksoulman.designpattern.paymentstrategy.PaymentStrategy;

/**
 * 支付到银行卡
 * 
 * @author chengyz
 *
 */
public class Card2Impl implements PaymentStrategy {

  /**
   * 帐号信息
   */
  private String account = "";
  /**
   * 构造方法，传入帐号信息
   * @param account 帐号信息
   */
  public Card2Impl(String account){
      this.account = account;
  }
  
  @Override
  public void pay(PaymentContext ctx) {
      System.out.println("现在给"+ctx.getUserName()+"的"+this.account+"帐号支付了"+ctx.getMoney()+"元");
      //连接银行，进行转帐，就不去管了
  }

}
