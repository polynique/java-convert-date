package com.polynique.convertdate;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class DateStringToDifferentFormat {

    public static String convertDateStringToDifferentFormat(String dateStr) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat newSdf = new SimpleDateFormat("dd-MM-yyyy");
        Date temp = sdf.parse(dateStr);
        return newSdf.format(temp);
    }

    @Test
    @DisplayName("Convert date string to a different format")
    public void convertDateStringToDifferentFormatTest() throws ParseException {
        assertEquals("15-12-1991", convertDateStringToDifferentFormat("1991-12-15"));
    }
}
