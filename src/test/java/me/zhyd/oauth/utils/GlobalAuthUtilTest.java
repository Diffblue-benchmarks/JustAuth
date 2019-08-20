package me.zhyd.oauth.utils;

import me.zhyd.oauth.utils.GlobalAuthUtil;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.util.HashMap;
import java.util.Map;

public class GlobalAuthUtilTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @Test
  public void generateDingTalkSignatureInputNotNullNullOutputNullPointerException() {

    // Arrange
    final String secretKey = "\u0002~";
    final String timestamp = null;

    // Act
    thrown.expect(NullPointerException.class);
    GlobalAuthUtil.generateDingTalkSignature(secretKey, timestamp);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void generateDingTalkSignatureInputNullNotNullOutputNullPointerException() {

    // Arrange
    final String secretKey = null;
    final String timestamp = "\u0080";

    // Act
    thrown.expect(NullPointerException.class);
    GlobalAuthUtil.generateDingTalkSignature(secretKey, timestamp);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void isHttpProtocolInputNotNullOutputFalse() {

    // Arrange
    final String url = ",";

    // Act
    final boolean actual = GlobalAuthUtil.isHttpProtocol(url);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void isHttpProtocolInputNullOutputFalse() {

    // Arrange
    final String url = null;

    // Act
    final boolean actual = GlobalAuthUtil.isHttpProtocol(url);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void isHttpsProtocolInputNotNullOutputFalse() {

    // Arrange
    final String url = ",";

    // Act
    final boolean actual = GlobalAuthUtil.isHttpsProtocol(url);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void isHttpsProtocolInputNullOutputFalse000d54ba5d5e751f216() {

    // Arrange
    final String url = null;

    // Act
    final boolean actual = GlobalAuthUtil.isHttpsProtocol(url);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void isLocalHostInputNotNullOutputFalse() {

    // Arrange
    final String url = "3";

    // Act
    final boolean actual = GlobalAuthUtil.isLocalHost(url);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void isLocalHostInputNullOutputTrue0002f024b92aa03501a() {

    // Arrange
    final String url = null;

    // Act
    final boolean actual = GlobalAuthUtil.isLocalHost(url);

    // Assert result
    Assert.assertTrue(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void parseStringToMapInputNotNullOutput0() {

    // Arrange
    final String accessTokenStr = "a\'b\'c";

    // Act
    final Map<String, String> actual = GlobalAuthUtil.parseStringToMap(accessTokenStr);

    // Assert result
    final HashMap<String, String> hashMap = new HashMap<String, String>();
    Assert.assertEquals(hashMap, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void parseStringToMapInputNotNullOutput02() {

    // Arrange
    final String accessTokenStr = "1a 2b 3c";

    // Act
    final Map<String, String> actual = GlobalAuthUtil.parseStringToMap(accessTokenStr);

    // Assert result
    final HashMap<String, String> hashMap = new HashMap<String, String>();
    Assert.assertEquals(hashMap, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void urlDecodeInputNullOutputNotNull000bea0bb79f583fa70() {

    // Arrange
    final String value = null;

    // Act
    final String actual = GlobalAuthUtil.urlDecode(value);

    // Assert result
    Assert.assertEquals("", actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void urlEncodeInputNullOutputNotNull000cc2f9dbc69f1a10b() {

    // Arrange
    final String value = null;

    // Act
    final String actual = GlobalAuthUtil.urlEncode(value);

    // Assert result
    Assert.assertEquals("", actual);
  }
}
