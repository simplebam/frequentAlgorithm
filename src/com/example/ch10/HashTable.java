package com.example.ch10;

import java.math.BigInteger;

/**
 * Created by yueyue on 2017/7/31.
 */
public class HashTable {

    private Info[] hashTable;


    public HashTable(int size) {
        if (size <= 0) {
            size = 1000;
        }
        hashTable = new Info[size];
    }

    /*增删改查*/
    public void insert(Info info) {
        hashTable[hashCode(info.getKey())] = info;
    }

    public Info find(String key) {
        return hashTable[hashCode(key)];
    }


    public int hashCode(String key) {
        BigInteger hasValue = new BigInteger(String.valueOf(0));
        BigInteger pow27 = new BigInteger(String.valueOf(1));
        for (int i = key.length() - 1; i >= 0; i--) {
            BigInteger letter = new BigInteger(String.valueOf(key.charAt(i) - 96));
            hasValue = hasValue.add(letter.multiply(pow27));
            pow27 = pow27.multiply(new BigInteger(String.valueOf(27)));
        }

        return hasValue.mod(new BigInteger(String.valueOf(hashTable.length))).intValue();
    }
}
