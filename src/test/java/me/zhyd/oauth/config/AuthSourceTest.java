package me.zhyd.oauth.config;

import me.zhyd.oauth.config.AuthSource;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class AuthSourceTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @Test
  public void valueOfInputNotNullOutputIllegalArgumentException() {

    // Arrange
    final String name = "1234";

    // Act
    thrown.expect(IllegalArgumentException.class);
    AuthSource.valueOf(name);

    // The method is not expected to return due to exception thrown
  }
}
