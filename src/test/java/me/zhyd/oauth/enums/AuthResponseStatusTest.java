package me.zhyd.oauth.enums;

import me.zhyd.oauth.enums.AuthResponseStatus;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class AuthResponseStatusTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @Test
  public void getCodeOutputPositive() {

    // Arrange
    final AuthResponseStatus authResponseStatus = AuthResponseStatus.ILLEGAL_CODE;

    // Act
    final int actual = authResponseStatus.getCode();

    // Assert result
    Assert.assertEquals(5008, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void getMsgOutputNotNull() {

    // Arrange
    final AuthResponseStatus authResponseStatus = AuthResponseStatus.ILLEGAL_CODE;

    // Act
    final String actual = authResponseStatus.getMsg();

    // Assert result
    Assert.assertEquals("Illegal code", actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void valueOfInputNotNullOutputIllegalArgumentException() {

    // Arrange
    final String name = "1234";

    // Act
    thrown.expect(IllegalArgumentException.class);
    AuthResponseStatus.valueOf(name);

    // The method is not expected to return due to exception thrown
  }
}
