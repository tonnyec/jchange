/*
 */
package com.cartiec.jrenamer;

import java.util.StringTokenizer;

/**
 * Título: Util 
 * Descripción: Varias utilidades
 * Copyright: Copyright (c) 2008 - GPL License .
 * Este archivo se distribuye bajo licencia GPL de la Free Software Foundation GNU. 
 * @author Tonny
 */
public class Renamer {

    /**
     * UpperCase and  LowerCase some characters of String
     * @param str   Sting to convert
     * @param start index start >= 0
     * @param end   index end   <= str.length()
     * @param uppercase  true for Uppercase conversion
     * @return new String convert uppercase
     */
    private static String toUpperLowerCase(String str, int start, int end, boolean uppercase) {
        String val = str;
        if (start >= end) {
            return val;
        }

        if (str == null) {
            return val;
        }
        int l = str.length();

        if ((start >= 0) && (start < l)) {
            if (end >= l) {
                end = l - 1;
            }
            String c = str.substring(start, end);
            c = uppercase ? c.toUpperCase() : c.toLowerCase();
            String st = str.substring(0, start);
            String en = str.substring(end);
            val = st + c + en;
        }

        return val;
    }

    /**
     * UpperCase some characters of String
     * @param str   Sting to convert
     * @param start index start >= 0
     * @param end   index end   <= str.length()
     * @return new String convert uppercase
     */
    public static String toUpperCase(String str, int start, int end) {
        return toUpperLowerCase(str, start, end, true);
    }

    /**
     * LowerCase some characters of String
     * @param str   Sting to convert
     * @param start index start >= 0
     * @param end   index end   <= str.length()
     * @return new String convert uppercase
     */
    public static String toLowerCase(String str, int start, int end) {
        return toUpperLowerCase(str, start, end, false);
    }

    /**
     * First Letter Uppercase
     * @param str
     * @return
     */
    public static String toFirstLetterUppercase(String str) {
        String val = "";
        if (str == null) {
            return val;
        }
        int l = str.length();

        if (l > 0) {
            String upp = str.substring(0, 1).toUpperCase();
            String st = (l > 1) ? str.substring(1) : "";
            val = upp + st;
        }
        return val;
    }

    /**
     * First Letter Word Uppercase 
     * @param str
     * @param delim Ejm "_ .,"
     * @return
     */
    public static String toFirstLetterWordUppercase(String str, String delim) {
        StringTokenizer st = new StringTokenizer(str, delim, true);
        if (str == null) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        while (st.hasMoreTokens()) {
            sb.append(toFirstLetterUppercase(st.nextToken()));
        }

        return sb.toString();
    }

    /**
     * Extension to Uppercase or Lowercase
     * @param str
     * @return
     */
    private static String toExtensionCase(String str, boolean upper) {
        int l = str.length();
        int posPoint = str.lastIndexOf(".");
        String val = str;
        if ((posPoint > 0) && (posPoint < l - 2)) {
            String ext = str.substring(posPoint);
            val = str.substring(0, posPoint) +
                    (upper ? ext.toUpperCase() : ext.toLowerCase());
        }

        return val;
    }

    /**
     * Extension to Uppercase
     * @param str
     * @return
     */
    public static String toExtensionUppercase(String str) {
        return toExtensionCase(str, true);
    }

    /**
     * Extension to Lowercase
     * @param str
     * @return
     */
    public static String toExtensionLowercase(String str) {
        return toExtensionCase(str, false);
    }

    /**
     * delete Accents replace á for a
     * @param str
     * @return
     */
    public static String deleteAccents(String str) {
        String val = str.replace("á", "a");
        val = val.replace("é", "e");
        val = val.replace("í", "i");
        val = val.replace("ó", "o");
        val = val.replace("ú", "u");
        val = val.replace("Á", "A");
        val = val.replace("É", "E");
        val = val.replace("Í", "I");
        val = val.replace("Ó", "O");
        val = val.replace("Ú", "U");
        return val;
    }

    /**
     * delete Doble Spaces
     * @param str
     * @return
     */
    public static String deleteDobleSpaces(String str) {
        while (str.indexOf("  ") >= 0) {
            str = str.replaceAll("  ", " ");
        }
        return str;
    }

    /**
     * Insert chars in string
     * @param str
     * @param text
     * @param pos
     * @param toEnd
     * @return
     */
    public static String insert(String str, String text, int pos, boolean toEnd) {
        StringBuilder sb = new StringBuilder(str);
        int l = str.length();

        if (toEnd) {
            pos = l;
        }

        if ((pos >= 0) && (pos <= l)) {
            sb.insert(pos, text);
        }

        return sb.toString();
    }

    /**
     * Delete char from string
     * @param str
     * @param start
     * @param end
     * @param toEnd
     * @return
     */
    public static String delete(String str, int start, int end, boolean toEnd) {
        StringBuilder sb = new StringBuilder(str);
        int l = str.length();

        if (toEnd) {
            end = l;
        }

        if ((start >= 0) && (start <= l)) {
            if ((end >= 0) && (end <= l)) {
                if (start < end) {
                    sb.delete(start, end);
                }
            }
        }

        return sb.toString();
    }

    /**
     * 
     * @param max
     * @param digit
     * @return
     */
    public static String getCompleteIndex(int max, int digit) {
        String m = String.valueOf(max);
        String d = String.valueOf(digit);
        String v = "";
        int lM = m.length();
        int lD = d.length();

        for (int i = lD; i < lM; i++) {
            v += "0";
        }
        v = v + d;
        return v;
    }

    public static void main(String[] args) {
        System.out.println(Renamer.deleteDobleSpaces("H     o   l            a "));
    }
}
