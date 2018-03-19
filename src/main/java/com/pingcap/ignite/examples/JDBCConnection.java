package com.pingcap.ignite.examples;

public class JDBCConnection {

  public static String igniteCacheName = "data";
  public static String igniteUrl = "jdbc:ignite:cfg://cache=" + igniteCacheName + "@file:///./config/example-save-to-ignite.xml";
  public static String igniteTableName = "data";

  public void work() {
    // Register JDBC driver.
    try {
      Class.forName("org.apache.ignite.IgniteJdbcDriver");
    } catch (Exception e) {
      // handle the error
      System.out.println("Load Exception: " + e.getMessage());
      return;
    }

    // Opening a connection.
    try {

//      Connection conn = DriverManager.getConnection(igniteUrl);
//
//      System.out.println("Connection set");
//
//      Statement stmt = conn.createStatement();
//
//      ResultSet rs = stmt.executeQuery("select * from " + igniteTableName + " limit 10");
//
//      System.out.println("execute ok");
//
//      while(rs.next()) {
//        System.out.println(rs.getInt(2));
//        System.out.println(rs.getInt(3));
//      }
//
//      System.out.println("read ok");
//
//      stmt.execute("delete from " + igniteTableName);
//
//      PreparedStatement pstmt = conn.prepareStatement("INSERT INTO " + igniteTableName + " VALUES(?, ?)");
//
//      // Adding the data.
//      for (int i = 1; i < 100; i++) {
//        // Inserting a Person object with a Long key.
//        pstmt.setLong(1, i);
//        pstmt.setLong(2, i);
//
//        pstmt.execute();
//      }

//      conn.close();
    } catch (Exception e) {
      e.printStackTrace();
      System.out.println("Run Exception: " + e.getMessage());
    }

  }
}
