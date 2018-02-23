package com.internousdev.craftdenki.util;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;
import java.time.Year;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DateUtil {

	/**
	 * 現在時刻取得メソッド
	 *
	 * @return String
	 */
	public String getDate() {
		Date date = new Date();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

		return simpleDateFormat.format(date);
	}

	/**
	 * 今年から1900年までのInteger型のListを返すメソッド
	 * @return List<Integer>
	 */
	public static List<Integer> createYearList() {
		List<Integer> yearList = new ArrayList<>();
		int n = Year.now().getValue() ;
		for(int year = n; year >= 1900; year--) {
			yearList.add(year);
		}
		return yearList;
	}

	/**
	 *  1～12月の月末月初をMM/ddのString型のListを返すメソッド
	 * @return List<String>
	 */
	public static List<String> createMonthDayList(){
		List<String> monthDayList = new ArrayList<>();
		int d = 0;
		DateTimeFormatter f = DateTimeFormatter.ofPattern("MM/dd");
		for(int m = 1; m <= 12; m++) {
			MonthDay mdSta = MonthDay.of(m, 1);
			MonthDay mdEnd = MonthDay.of(m,Month.of(m).maxLength());
			monthDayList.add(mdSta.format(f));
			monthDayList.add(mdEnd.format(f));
		}
		return monthDayList;
	}

	/**
	 * Date→LocalDateに変換するメソッド
	 * @param date
	 * @return LocalDate
	 */
	public static LocalDate date2LocalDate(final Date date) {
		return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
	}

	/**
	 * String→LocalDateに変換するメソッド
	 * @param year
	 * @param monthDay
	 * @return
	 */
	public static LocalDate string2LocalDate(String year,String monthDay){
		String dateStr =year +"/" + monthDay;
		DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDate d = LocalDate.parse(dateStr,f);
		return d;
	}

	/**
	 * java.sql.Date→LocalDateに変換するメソッド
	 * @param sqlDate
	 * @return LocalDate
	 */
	public static LocalDate sqlDate2LocalDate(java.sql.Date sqlDate){
	    return sqlDate.toLocalDate();
	}
 }

