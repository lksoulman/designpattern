package com.lksoulman.designpattern.logstrategy.impl;

/**
 * 把日志记录到文件
 * 
 * @author chengyz
 *
 */
public class FileLogImpl extends LogStrategyTemplateImpl {

  @Override
  protected void doLog(String msg) {
    System.out.println(" 现在把  " + msg + " 记录到文件中 ");
  }

}
