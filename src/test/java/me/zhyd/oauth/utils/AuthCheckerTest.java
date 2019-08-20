package me.zhyd.oauth.utils;

import me.zhyd.oauth.config.AuthConfig;
import me.zhyd.oauth.config.AuthSource;
import me.zhyd.oauth.utils.AuthChecker;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class AuthCheckerTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @Test
  public void checkConfigInputNullNullOutputNullPointerException() {

    // Arrange
    final AuthConfig config = null;
    final AuthSource source = null;

    // Act
    thrown.expect(NullPointerException.class);
    AuthChecker.checkConfig(config, source);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void isSupportedAuthInputNotNullNullOutputFalse() {

    // Arrange
    final AuthConfig config = new AuthConfig();
    final AuthSource source = null;

    // Act
    final boolean actual = AuthChecker.isSupportedAuth(config, source);

    // Assert result
    Assert.assertFalse(actual);
  }
}
