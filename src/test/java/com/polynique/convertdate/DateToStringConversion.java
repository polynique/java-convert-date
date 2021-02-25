package com.polynique.convertdate;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DateToStringConversion {

  public static String convertDateToString(Date date) {
    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
    return sdf.format(date);
  }

  @Test
  @DisplayName("Convert date to string")
  public void convertDateToStringTest() {
    Calendar calendar = Calendar.getInstance();
    calendar.set(2021, 11, 15);
    Date date = calendar.getTime();
    assertEquals("15-12-2021", convertDateToString(date));
  }
}
