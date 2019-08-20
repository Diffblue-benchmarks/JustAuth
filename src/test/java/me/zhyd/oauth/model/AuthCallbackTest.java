package me.zhyd.oauth.model;

import me.zhyd.oauth.model.AuthCallback;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class AuthCallbackTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @Test
  public void getAuth_codeOutputNull() {

    // Arrange
    final AuthCallback authCallback = new AuthCallback();

    // Act
    final String actual = authCallback.getAuth_code();

    // Assert result
    Assert.assertNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void getAuthorization_codeOutputNull() {

    // Arrange
    final AuthCallback authCallback = new AuthCallback();

    // Act
    final String actual = authCallback.getAuthorization_code();

    // Assert result
    Assert.assertNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void getCodeOutputNull() {

    // Arrange
    final AuthCallback authCallback = new AuthCallback();

    // Act
    final String actual = authCallback.getCode();

    // Assert result
    Assert.assertNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void getStateOutputNull() {

    // Arrange
    final AuthCallback authCallback = new AuthCallback();

    // Act
    final String actual = authCallback.getState();

    // Assert result
    Assert.assertNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void setAuth_codeInputNotNullOutputVoid() {

    // Arrange
    final AuthCallback authCallback = new AuthCallback();
    final String auth_code = "3";

    // Act
    authCallback.setAuth_code(auth_code);

    // Assert side effects
    Assert.assertEquals("3", authCallback.getAuth_code());
  }

  // Test written by Diffblue Cover.
  @Test
  public void setAuthorization_codeInputNotNullOutputVoid() {

    // Arrange
    final AuthCallback authCallback = new AuthCallback();
    final String authorization_code = "3";

    // Act
    authCallback.setAuthorization_code(authorization_code);

    // Assert side effects
    Assert.assertEquals("3", authCallback.getAuthorization_code());
  }

  // Test written by Diffblue Cover.
  @Test
  public void setCodeInputNotNullOutputVoid() {

    // Arrange
    final AuthCallback authCallback = new AuthCallback();
    final String code = "3";

    // Act
    authCallback.setCode(code);

    // Assert side effects
    Assert.assertEquals("3", authCallback.getCode());
  }

  // Test written by Diffblue Cover.
  @Test
  public void setStateInputNotNullOutputVoid() {

    // Arrange
    final AuthCallback authCallback = new AuthCallback();
    final String state = "3";

    // Act
    authCallback.setState(state);

    // Assert side effects
    Assert.assertEquals("3", authCallback.getState());
  }
}
