package com.pingcap.ignite.examples;

public class JDBCConnection {

  public static String igniteCacheName = "data";
  public static String igniteUrl = "jdbc:ignite:cfg://cache=" + igniteCacheName + "@file:///./config/example-save-to-ignite.xml";
  public static String igniteTableName = "data";

}
