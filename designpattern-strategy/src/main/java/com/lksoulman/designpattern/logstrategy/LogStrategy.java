package com.lksoulman.designpattern.logstrategy;

/**
 * 日志记录策略的接口
 * 
 * @author chengyz
 *
 */
public interface LogStrategy {

  /**
   * 记录日志
   * 
   * @param msg
   */
  void log(String msg);
}
