package com.tom_roush.pdfbox.pdmodel.interactive.digitalsignature;

import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSString;
import com.tom_roush.pdfbox.pdmodel.common.COSArrayList;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class PDSeedValueCertificate implements COSObjectable {
    public static final int FLAG_ISSUER = 2;
    public static final int FLAG_KEY_USAGE = 32;
    public static final int FLAG_OID = 4;
    public static final int FLAG_SUBJECT = 1;
    public static final int FLAG_SUBJECT_DN = 8;
    public static final int FLAG_URL = 64;
    private final COSDictionary dictionary;

    public PDSeedValueCertificate() {
        COSDictionary cOSDictionary = new COSDictionary();
        this.dictionary = cOSDictionary;
        cOSDictionary.setItem(COSName.TYPE, (COSBase) COSName.SV_CERT);
        cOSDictionary.setDirect(true);
    }

    private static COSArray convertListOfByteArraysToCOSArray(List<byte[]> list) {
        COSArray cOSArray = new COSArray();
        for (byte[] bArr : list) {
            cOSArray.add((COSBase) new COSString(bArr));
        }
        return cOSArray;
    }

    private static List<byte[]> getListOfByteArraysFromCOSArray(COSArray cOSArray) {
        LinkedList linkedList = new LinkedList();
        Iterator<COSBase> it = cOSArray.iterator();
        while (it.hasNext()) {
            COSBase next = it.next();
            if (next instanceof COSString) {
                linkedList.add(((COSString) next).getBytes());
            }
        }
        return linkedList;
    }

    public void addIssuer(byte[] bArr) {
        COSDictionary cOSDictionary = this.dictionary;
        COSName cOSName = COSName.ISSUER;
        COSArray cOSArray = cOSDictionary.getCOSArray(cOSName);
        if (cOSArray == null) {
            cOSArray = new COSArray();
        }
        cOSArray.add((COSBase) new COSString(bArr));
        this.dictionary.setItem(cOSName, (COSBase) cOSArray);
    }

    public void addKeyUsage(String str) {
        for (int i10 = 0; i10 < str.length(); i10++) {
            if ("01X".indexOf(str.charAt(i10)) == -1) {
                throw new IllegalArgumentException("characters can only be 0, 1, X");
            }
        }
        COSDictionary cOSDictionary = this.dictionary;
        COSName cOSName = COSName.KEY_USAGE;
        COSArray cOSArray = cOSDictionary.getCOSArray(cOSName);
        if (cOSArray == null) {
            cOSArray = new COSArray();
        }
        cOSArray.add((COSBase) new COSString(str));
        this.dictionary.setItem(cOSName, (COSBase) cOSArray);
    }

    public void addOID(byte[] bArr) {
        COSDictionary cOSDictionary = this.dictionary;
        COSName cOSName = COSName.OID;
        COSArray cOSArray = cOSDictionary.getCOSArray(cOSName);
        if (cOSArray == null) {
            cOSArray = new COSArray();
        }
        cOSArray.add((COSBase) new COSString(bArr));
        this.dictionary.setItem(cOSName, (COSBase) cOSArray);
    }

    public void addSubject(byte[] bArr) {
        COSDictionary cOSDictionary = this.dictionary;
        COSName cOSName = COSName.SUBJECT;
        COSArray cOSArray = cOSDictionary.getCOSArray(cOSName);
        if (cOSArray == null) {
            cOSArray = new COSArray();
        }
        cOSArray.add((COSBase) new COSString(bArr));
        this.dictionary.setItem(cOSName, (COSBase) cOSArray);
    }

    public List<byte[]> getIssuer() {
        COSArray cOSArray = this.dictionary.getCOSArray(COSName.ISSUER);
        if (cOSArray != null) {
            return getListOfByteArraysFromCOSArray(cOSArray);
        }
        return null;
    }

    public List<String> getKeyUsage() {
        COSArray cOSArray = this.dictionary.getCOSArray(COSName.KEY_USAGE);
        if (cOSArray != null) {
            LinkedList linkedList = new LinkedList();
            Iterator<COSBase> it = cOSArray.iterator();
            while (it.hasNext()) {
                COSBase next = it.next();
                if (next instanceof COSString) {
                    linkedList.add(((COSString) next).getString());
                }
            }
            return linkedList;
        }
        return null;
    }

    public List<byte[]> getOID() {
        COSArray cOSArray = this.dictionary.getCOSArray(COSName.OID);
        if (cOSArray != null) {
            return getListOfByteArraysFromCOSArray(cOSArray);
        }
        return null;
    }

    public List<byte[]> getSubject() {
        COSArray cOSArray = this.dictionary.getCOSArray(COSName.SUBJECT);
        if (cOSArray != null) {
            return getListOfByteArraysFromCOSArray(cOSArray);
        }
        return null;
    }

    public List<Map<String, String>> getSubjectDN() {
        COSArray cOSArray = this.dictionary.getCOSArray(COSName.SUBJECT_DN);
        if (cOSArray != null) {
            List<? extends COSBase> list = cOSArray.toList();
            LinkedList linkedList = new LinkedList();
            for (COSBase cOSBase : list) {
                if (cOSBase instanceof COSDictionary) {
                    COSDictionary cOSDictionary = (COSDictionary) cOSBase;
                    HashMap hashMap = new HashMap();
                    for (COSName cOSName : cOSDictionary.keySet()) {
                        hashMap.put(cOSName.getName(), cOSDictionary.getString(cOSName));
                    }
                    linkedList.add(hashMap);
                }
            }
            return linkedList;
        }
        return null;
    }

    public String getURL() {
        return this.dictionary.getString(COSName.URL);
    }

    public String getURLType() {
        return this.dictionary.getNameAsString(COSName.URL_TYPE);
    }

    public boolean isIssuerRequired() {
        return this.dictionary.getFlag(COSName.FF, 2);
    }

    public boolean isKeyUsageRequired() {
        return this.dictionary.getFlag(COSName.FF, 32);
    }

    public boolean isOIDRequired() {
        return this.dictionary.getFlag(COSName.FF, 4);
    }

    public boolean isSubjectDNRequired() {
        return this.dictionary.getFlag(COSName.FF, 8);
    }

    public boolean isSubjectRequired() {
        return this.dictionary.getFlag(COSName.FF, 1);
    }

    public boolean isURLRequired() {
        return this.dictionary.getFlag(COSName.FF, 64);
    }

    public void removeIssuer(byte[] bArr) {
        COSArray cOSArray = this.dictionary.getCOSArray(COSName.ISSUER);
        if (cOSArray != null) {
            cOSArray.remove(new COSString(bArr));
        }
    }

    public void removeKeyUsage(String str) {
        COSArray cOSArray = this.dictionary.getCOSArray(COSName.KEY_USAGE);
        if (cOSArray != null) {
            cOSArray.remove(new COSString(str));
        }
    }

    public void removeOID(byte[] bArr) {
        COSArray cOSArray = this.dictionary.getCOSArray(COSName.OID);
        if (cOSArray != null) {
            cOSArray.remove(new COSString(bArr));
        }
    }

    public void removeSubject(byte[] bArr) {
        COSArray cOSArray = this.dictionary.getCOSArray(COSName.SUBJECT);
        if (cOSArray != null) {
            cOSArray.remove(new COSString(bArr));
        }
    }

    public void setIssuer(List<byte[]> list) {
        this.dictionary.setItem(COSName.ISSUER, (COSBase) convertListOfByteArraysToCOSArray(list));
    }

    public void setIssuerRequired(boolean z10) {
        this.dictionary.setFlag(COSName.FF, 2, z10);
    }

    public void setKeyUsage(List<String> list) {
        this.dictionary.setItem(COSName.KEY_USAGE, (COSBase) COSArrayList.converterToCOSArray(list));
    }

    public void setKeyUsageRequired(boolean z10) {
        this.dictionary.setFlag(COSName.FF, 32, z10);
    }

    public void setOID(List<byte[]> list) {
        this.dictionary.setItem(COSName.OID, (COSBase) convertListOfByteArraysToCOSArray(list));
    }

    public void setOIDRequired(boolean z10) {
        this.dictionary.setFlag(COSName.FF, 4, z10);
    }

    public void setSubject(List<byte[]> list) {
        this.dictionary.setItem(COSName.SUBJECT, (COSBase) convertListOfByteArraysToCOSArray(list));
    }

    public void setSubjectDN(List<Map<String, String>> list) {
        LinkedList linkedList = new LinkedList();
        for (Map<String, String> map : list) {
            COSDictionary cOSDictionary = new COSDictionary();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                cOSDictionary.setItem(entry.getKey(), (COSBase) new COSString(entry.getValue()));
            }
            linkedList.add(cOSDictionary);
        }
        this.dictionary.setItem(COSName.SUBJECT_DN, (COSBase) COSArrayList.converterToCOSArray(linkedList));
    }

    public void setSubjectDNRequired(boolean z10) {
        this.dictionary.setFlag(COSName.FF, 8, z10);
    }

    public void setSubjectRequired(boolean z10) {
        this.dictionary.setFlag(COSName.FF, 1, z10);
    }

    public void setURL(String str) {
        this.dictionary.setString(COSName.URL, str);
    }

    public void setURLRequired(boolean z10) {
        this.dictionary.setFlag(COSName.FF, 64, z10);
    }

    public void setURLType(String str) {
        this.dictionary.setName(COSName.URL_TYPE, str);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSDictionary getCOSObject() {
        return this.dictionary;
    }

    public PDSeedValueCertificate(COSDictionary cOSDictionary) {
        this.dictionary = cOSDictionary;
        cOSDictionary.setDirect(true);
    }

    public void addKeyUsage(char c, char c10, char c11, char c12, char c13, char c14, char c15, char c16, char c17) {
        addKeyUsage("" + c + c10 + c11 + c12 + c13 + c14 + c15 + c16 + c17);
    }
}
