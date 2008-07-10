/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cartiec.jrenamer;

import java.io.File;

/**
 * MyFile for Override toString method
 * @author Tonny
 */
public class MyFile extends File{

    public MyFile(File pathname) {
        super(pathname.getPath());
    }

    public MyFile(String parent, String child) {
        super(parent, child);
    }

    @Override
    public String toString() {
        String s = getName();
        return s.equals("") ? getPath() : s;
    }

    @Override
    public MyFile[] listFiles() {
        String[] ss = list();
        if (ss == null) {
            return null;
        }
        int n = ss.length;
        MyFile[] fs = new MyFile[n];
        for (int i = 0; i < n; i++) {
            fs[i] = new MyFile(this.getPath(), ss[i]);
        }
        return fs;
    }
}
