package me.zhyd.oauth.utils;

import me.zhyd.oauth.utils.StringUtils;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class StringUtilsTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @Test
  public void appendIfNotContainInputNotNullNotNullNotNullOutputNotNull() {

    // Arrange
    final String str = "1";
    final String appendStr = "2";
    final String otherwise = "3";

    // Act
    final String actual = StringUtils.appendIfNotContain(str, appendStr, otherwise);

    // Assert result
    Assert.assertEquals("12", actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void appendIfNotContainInputNotNullNotNullNotNullOutputNotNull2() {

    // Arrange
    final String str = "1";
    final String appendStr = "\'";
    final String otherwise = ",";

    // Act
    final String actual = StringUtils.appendIfNotContain(str, appendStr, otherwise);

    // Assert result
    Assert.assertEquals("1\'", actual);
  }

  // Test written by Diffblue Cover.

  @Test
  public void appendIfNotContainInputNotNullNotNullNotNullOutputNotNull3() {

    // Arrange
    final String str = "1234";
    final String appendStr = "2";
    final String otherwise = "3";

    // Act
    final String actual = StringUtils.appendIfNotContain(str, appendStr, otherwise);

    // Assert result
    Assert.assertEquals("12343", actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void appendIfNotContainInputNotNullNotNullNotNullOutputNotNull4() {

    // Arrange
    final String str = "1a 2b 3c";
    final String appendStr = "2";
    final String otherwise = ",";

    // Act
    final String actual = StringUtils.appendIfNotContain(str, appendStr, otherwise);

    // Assert result
    Assert.assertEquals("1a 2b 3c,", actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void appendIfNotContainInputNullNullNullOutputNull() {

    // Arrange
    final String str = null;
    final String appendStr = null;
    final String otherwise = null;

    // Act
    final String actual = StringUtils.appendIfNotContain(str, appendStr, otherwise);

    // Assert result
    Assert.assertNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void isEmptyInputNotNullOutputFalse() {

    // Arrange
    final String str = "A1B2C3";

    // Act
    final boolean actual = StringUtils.isEmpty(str);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void isEmptyInputNullOutputTrue0000d12f819e51fbedd() {

    // Arrange
    final String str = null;

    // Act
    final boolean actual = StringUtils.isEmpty(str);

    // Assert result
    Assert.assertTrue(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void isNotEmptyInputNotNullOutputTrue() {

    // Arrange
    final String str = "3";

    // Act
    final boolean actual = StringUtils.isNotEmpty(str);

    // Assert result
    Assert.assertTrue(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void isNotEmptyInputNullOutputFalse0006acf39cef6a2a968() {

    // Arrange
    final String str = null;

    // Act
    final boolean actual = StringUtils.isNotEmpty(str);

    // Assert result
    Assert.assertFalse(actual);
  }
}
