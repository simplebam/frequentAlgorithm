package com.example.ch11;


import java.math.BigInteger;

/**
 * Created by yueyue on 2017/7/31.
 */
public class HashTable {

    private Info[] arr;

    private int count;//计步器

    public HashTable(int size) {
        if (size <= 0) {
            size = 1000;
        }
        arr = new Info[size];
    }


    /*增删改查*/
    public void insert(Info info) {
        int hashValue = hashCode(info.getKey());
        while (arr[hashValue] != null && arr[hashValue].getName() != null) {
            //有值情况下继续
            hashValue++;
            hashValue = hashValue % arr.length;
        }

        System.out.println("hashValue:" + hashValue);
        arr[hashValue] = info;

    }

    public Info search(String key) {
        int hashValue = hashCode(key);
        while (arr[hashValue] != null) {
            if (arr[hashValue].getKey().equals(key)) {
                return arr[hashValue];
            }
            hashValue++;
            hashValue = hashValue % arr.length;
        }

        return null;
    }


    public Info delete(String key) {
        int hashValue = hashCode(key);
        while (arr[hashValue] != null) {
            if (arr[hashValue].getKey().equals(key)) {
                Info temp = arr[hashValue];
                arr[hashValue].setName(null);
                return temp;
            }
            hashValue++;
            hashValue = hashValue / arr.length;
        }
        return null;
    }


    public int hashCode(String key) {
        BigInteger hasValue = new BigInteger(String.valueOf(0));
        BigInteger pow27 = new BigInteger(String.valueOf(1));
        for (int i = key.length() - 1; i >= 0; i--) {
            BigInteger letter = new BigInteger(String.valueOf(key.charAt(i) - 96));
            hasValue = hasValue.add(letter.multiply(pow27));
            pow27 = pow27.multiply(new BigInteger(String.valueOf(27)));
        }

        return hasValue.mod(new BigInteger(String.valueOf(arr.length))).intValue();
    }


    public void display() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
