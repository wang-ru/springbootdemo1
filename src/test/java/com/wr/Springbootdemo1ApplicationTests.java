package com.wr;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.propertyeditors.CurrencyEditor;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.format.number.CurrencyStyleFormatter;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.ParseException;
import java.util.Locale;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Springbootdemo1ApplicationTests {

	@Test
	public void contextLoads() {

	}
    @Test
    public void test1() throws ParseException {
        CurrencyStyleFormatter formatter = new CurrencyStyleFormatter();
        formatter.setFractionDigits(2);
        formatter.setRoundingMode(RoundingMode.CEILING);
        Assert.assertEquals(new BigDecimal("123.13"),formatter.parse("$123.125", Locale.US));
        DateFormatter dateFormatter = new DateFormatter();
    }
}
