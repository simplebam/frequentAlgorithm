package com.example.ch12;

import java.math.BigInteger;

/**
 * Created by yueyue on 2017/8/2.
 */
public class HashTable {

    private LinkList[] arr;


    public HashTable() {
        arr = new LinkList[100];
    }

    public void insert(Info info) {
        String key = info.getKey();
        int hashValue = hashCode(key);
        if (arr[hashValue] == null) {
            arr[hashValue] = new LinkList();
        }
        arr[hashValue].insertFirst(info);
    }

    public Info find(String key) {
        int hashValue = hashCode(key);
        if (arr[hashValue] == null) {
            return null;
        }
        return arr[hashValue].find(key);
    }


    public Info delete(String key) {
        int hashValue = hashCode(key);
        if (arr[hashValue] == null) {
            return null;
        }
        return arr[hashValue].delete(key);
    }


    public int hashCode(String key) {
        BigInteger hashValue = new BigInteger(String.valueOf(0));
        BigInteger pow27 = new BigInteger(String.valueOf(1));
        for (int i = key.length() - 1; i >= 0; i--) {
            BigInteger letter = new BigInteger(String.valueOf(key.charAt(i) - 96));
            hashValue = hashValue.add(letter.multiply(pow27));
            pow27 = pow27.multiply(new BigInteger(String.valueOf(27)));
        }

        return hashValue.mod(new BigInteger(String.valueOf(arr.length))).intValue();
    }
}
