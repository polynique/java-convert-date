package com.polynique.convertdate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StringToDateConversion {

  public static Date stringToDateConversion(String dateStr, String datePattern) throws ParseException {
    SimpleDateFormat sdf = new SimpleDateFormat(datePattern);
    return sdf.parse(dateStr);
  }

  @Test
  @DisplayName("Convert String to Date")
  public void stringToDateConversionTest() throws ParseException {
    String dateStr = "25-02-2021";
    String datePattern = "dd-MM-yyyy";
    Date date = stringToDateConversion(dateStr, datePattern);
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(date);
    assertNotNull(date);
    assertEquals(25, calendar.get(Calendar.DAY_OF_MONTH));
    assertEquals(1, calendar.get(Calendar.MONTH));
    assertEquals(2021, calendar.get(Calendar.YEAR));
  }
}
