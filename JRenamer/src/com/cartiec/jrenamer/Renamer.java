/*
 */

package com.cartiec.jrenamer;

import java.util.LinkedList;
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
    
    /**
     * First Letter Uppercase
     * @param str
     * @return
     */
    public static String toFirstLetterUppercase(String str){
        String val = "";
        if (str == null) {
            return val;
        }
        int l = str.length();
        
        if(l > 0){
            String upp = str.substring(0,1).toUpperCase();
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
    public static String toFirstLetterWordUppercase(String str,String delim){
        StringTokenizer st = new StringTokenizer(str, delim,true);
        if (str == null) {
            return "";
        }
        
        StringBuilder sb = new StringBuilder();
        while (st.hasMoreTokens()){
           sb.append(toFirstLetterUppercase(st.nextToken()));
        }
        
        return sb.toString();
    }

    /**
     * Extension to Uppercase or Lowercase
     * @param str
     * @return
     */
    private static String toExtensionCase(String str,boolean upper){
        int l = str.length();
        int posPoint = str.indexOf(".");
        String val = str;
        if((posPoint > 0) && (posPoint < l - 2)){
            String ext = str.substring(posPoint);
            val = str.substring(0,posPoint) +
                  (upper ? ext.toUpperCase() : ext.toLowerCase());
        }
        
        return val;
    }
    
    /**
     * Extension to Uppercase
     * @param str
     * @return
     */
    public static String toExtensionUppercase(String str){
        return toExtensionCase(str, true);
    }
   
    /**
     * Extension to Lowercase
     * @param str
     * @return
     */
    public static String toExtensionLowercase(String str){
        return toExtensionCase(str, false);
    }
    
    public static String deleteAccents(String str){
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
            
    public static void main(String[] args) {
        //System.out.println(Renamer.toFirstLetterWordUppercase("hola.a.todos.los de aca",". "));
        System.out.println(Renamer.deleteAccents("áéíjfd  fgjh - ó Ú Á"));       
    }
}
