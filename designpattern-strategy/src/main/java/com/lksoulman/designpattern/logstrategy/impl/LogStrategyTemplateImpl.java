package com.lksoulman.designpattern.logstrategy.impl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import com.lksoulman.designpattern.logstrategy.LogStrategy;

/**
 * 实现日志策略的抽象模板，实现给消息添加时间
 * 
 * @author chengyz
 *
 */
public abstract class LogStrategyTemplateImpl implements LogStrategy {

  public final void log(String msg) {
    // 第一步：给消息添加记录日志的时间
    DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
    msg = df.format(new java.util.Date()) + " 内容是：" + msg;
    // 第二步：真正执行日志记录

    doLog(msg);
  }

  /**
   * 真正执行日志记录，让子类去具体实现
   * 
   * @param msg
   */
  protected abstract void doLog(String msg);
}
