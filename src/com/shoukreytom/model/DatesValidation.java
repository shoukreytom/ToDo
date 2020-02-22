package com.shoukreytom.model;

import java.time.LocalDate;

public class DatesValidation {

    public static boolean validate(LocalDate from, LocalDate to) {
        boolean nullCheck = from != null && to != null;
        boolean yearEquality = nullCheck && from.getYear() == to.getYear();
        boolean monthEquality = nullCheck && from.getMonthValue() == to.getMonthValue();
        boolean yearValid = nullCheck && (from.getYear() < to.getYear());
        boolean monthValid = nullCheck && (from.getMonthValue() < to.getMonthValue());
        boolean dayValid = nullCheck && (from.getDayOfMonth() < to.getDayOfMonth());
        if (yearValid) {
            return true;
        } else if (yearEquality && monthValid) {
            return true;
        } else if (yearEquality && monthEquality && dayValid) {
            return true;
        }else {
            return false;
        }
    }

}
