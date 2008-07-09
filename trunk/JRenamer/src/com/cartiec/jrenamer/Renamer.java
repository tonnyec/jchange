/*
 */

package com.cartiec.jrenamer;

/**
 * Título: Util 
 * Descripción: Varias utilidades
 * Copyright: Copyright (c) 2008 - GPL License .
 * Este archivo se distribuye bajo licencia GPL de la Free Software Foundation GNU. 
 * @author Tonny
 */
public class Renamer {
    /**
     * UpperCase some characters of String
     * @param str   Sting to convert
     * @param start index start >= 0
     * @param end   index end   <= str.length()
     * @return new String convert uppercase
     */
    public static String toUpperCase(String str,int start,int end){
        String val = "";
        if (str == null) {
            return val;
        }
        int l = str.length();
        
        if((start >= 0) && (end < l)){
            String upp = str.substring(start,end).toUpperCase();
            String st = str.substring(0,start);
            String en = str.substring(end);
            val = st + upp + en;
        }
        
        return val;
    }
    
    /**
     * LowerCase some characters of String
     * @param str   Sting to convert
     * @param start index start >= 0
     * @param end   index end   <= str.length()
     * @return new String convert uppercase
     */
    public static String toLowerCase(String str,int start,int end){
        String val = "";
        if (str == null) {
            return val;
        }
        int l = str.length();
        
        if((start >= 0) && (end < l)){
            String upp = str.substring(start,end).toUpperCase();
            String st = str.substring(0,start);
            String en = str.substring(end);
            val = st + upp + en;
        }
        
        return val;
    }
    
    
    public static void main(String[] args) {
        Renamer.toUpperCase("hola a todos los de aca", 7, 12);
    }
}
