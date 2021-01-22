package com.training.maven;

import org.springframework.util.StringUtils;

public class Main {
  public Main() {
  }

  public static void main(String[] var0) {
    String message = var0 != null && var0.length != 0 ? var0[0] : "Hello;World";
    String[] splittedMessage = StringUtils.split(message, ";");

    for (int i = 0; i < splittedMessage.length; ++i) {
      System.out.println(splittedMessage[i]);
    }
  }
}
