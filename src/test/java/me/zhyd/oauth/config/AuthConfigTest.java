package me.zhyd.oauth.config;

import me.zhyd.oauth.config.AuthConfig;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class AuthConfigTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.

  @Test
  public void constructorInputNotNullNotNullNotNullNotNullFalseNotNullNotNullOutputVoid() {

    // Arrange
    final String clientId = "3";
    final String clientSecret = "BAZ";
    final String redirectUri = "1a 2b 3c";
    final String alipayPublicKey = "1a 2b 3c";
    final boolean unionId = false;
    final String stackOverflowKey = "\'";
    final String agentId = "3";

    // Act, creating object to test constructor
    final AuthConfig authConfig = new AuthConfig(
        clientId, clientSecret, redirectUri, alipayPublicKey, unionId, stackOverflowKey, agentId);

    // Assert side effects
    Assert.assertEquals("BAZ", authConfig.getClientSecret());
    Assert.assertEquals("1a 2b 3c", authConfig.getAlipayPublicKey());
    Assert.assertEquals("3", authConfig.getAgentId());
    Assert.assertEquals("1a 2b 3c", authConfig.getRedirectUri());
    Assert.assertEquals("3", authConfig.getClientId());
    Assert.assertEquals("\'", authConfig.getStackOverflowKey());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getAgentIdOutputNull() {

    // Arrange
    final AuthConfig authConfig = new AuthConfig();

    // Act
    final String actual = authConfig.getAgentId();

    // Assert result
    Assert.assertNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void getAlipayPublicKeyOutputNull() {

    // Arrange
    final AuthConfig authConfig = new AuthConfig();

    // Act
    final String actual = authConfig.getAlipayPublicKey();

    // Assert result
    Assert.assertNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void getClientIdOutputNull() {

    // Arrange
    final AuthConfig authConfig = new AuthConfig();

    // Act
    final String actual = authConfig.getClientId();

    // Assert result
    Assert.assertNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void getClientSecretOutputNull() {

    // Arrange
    final AuthConfig authConfig = new AuthConfig();

    // Act
    final String actual = authConfig.getClientSecret();

    // Assert result
    Assert.assertNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void getRedirectUriOutputNull() {

    // Arrange
    final AuthConfig authConfig = new AuthConfig();

    // Act
    final String actual = authConfig.getRedirectUri();

    // Assert result
    Assert.assertNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void getStackOverflowKeyOutputNull() {

    // Arrange
    final AuthConfig authConfig = new AuthConfig();

    // Act
    final String actual = authConfig.getStackOverflowKey();

    // Assert result
    Assert.assertNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void isUnionIdOutputFalse() {

    // Arrange
    final AuthConfig authConfig = new AuthConfig();

    // Act
    final boolean actual = authConfig.isUnionId();

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void setAlipayPublicKeyInputNotNullOutputVoid() {

    // Arrange
    final AuthConfig authConfig = new AuthConfig();
    final String alipayPublicKey = "3";

    // Act
    authConfig.setAlipayPublicKey(alipayPublicKey);

    // Assert side effects
    Assert.assertEquals("3", authConfig.getAlipayPublicKey());
  }

  // Test written by Diffblue Cover.
  @Test
  public void setClientIdInputNotNullOutputVoid() {

    // Arrange
    final AuthConfig authConfig = new AuthConfig();
    final String clientId = "3";

    // Act
    authConfig.setClientId(clientId);

    // Assert side effects
    Assert.assertEquals("3", authConfig.getClientId());
  }

  // Test written by Diffblue Cover.
  @Test
  public void setClientSecretInputNotNullOutputVoid() {

    // Arrange
    final AuthConfig authConfig = new AuthConfig();
    final String clientSecret = "3";

    // Act
    authConfig.setClientSecret(clientSecret);

    // Assert side effects
    Assert.assertEquals("3", authConfig.getClientSecret());
  }

  // Test written by Diffblue Cover.
  @Test
  public void setRedirectUriInputNotNullOutputVoid() {

    // Arrange
    final AuthConfig authConfig = new AuthConfig();
    final String redirectUri = "3";

    // Act
    authConfig.setRedirectUri(redirectUri);

    // Assert side effects
    Assert.assertEquals("3", authConfig.getRedirectUri());
  }
}
