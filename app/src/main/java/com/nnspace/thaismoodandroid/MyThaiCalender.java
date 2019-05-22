package com.nnspace.thaismoodandroid;

public class MyThaiCalender {
    public static final String[] monthOfYear = {"มกราคม", "กุมภาพันธ์", "มีนาคม", "เมษายม", "พฤษภาคม", "มิถุนายน", "กรกฎาคม", "สิงหาคม", "กันยายน", "ตุลาคม", "พฤศจิกายน", "ธันวาคม"};
    public static final String[] dayOfWeek = {"อาทิตย์", "จันทร์", "อังคาร", "พุธ", "พฤหัสบดี", "ศุกร์", "เสาร์"};

    public static String getMonthOfYear(int month){
        return monthOfYear[month];
    }

    public static String getDayOfWeek(int day){
        return dayOfWeek[day-1];
    }
}
