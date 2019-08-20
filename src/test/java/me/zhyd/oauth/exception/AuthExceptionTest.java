package me.zhyd.oauth.exception;

import me.zhyd.oauth.enums.AuthResponseStatus;
import me.zhyd.oauth.exception.AuthException;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class AuthExceptionTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @Test
  public void getErrorCodeOutputZero() {

    // Arrange
    final AuthException authException = new AuthException(AuthResponseStatus.ILLEGAL_CODE);

    // Act
    final int actual = authException.getErrorCode();

    // Assert result
    Assert.assertEquals(0, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void getErrorMsgOutputNull() {

    // Arrange
    final AuthException authException = new AuthException(AuthResponseStatus.ILLEGAL_CODE);

    // Act
    final String actual = authException.getErrorMsg();

    // Assert result
    Assert.assertNull(actual);
  }
}
