package com.tom_roush.pdfbox.pdmodel.interactive.digitalsignature;

import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSInteger;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSString;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.Calendar;
import lib.zj.office.fc.codec.CharEncoding;

/* loaded from: classes2.dex */
public class PDSignature implements COSObjectable {
    private final COSDictionary dictionary;
    public static final COSName FILTER_ADOBE_PPKLITE = COSName.ADOBE_PPKLITE;
    public static final COSName FILTER_ENTRUST_PPKEF = COSName.ENTRUST_PPKEF;
    public static final COSName FILTER_CICI_SIGNIT = COSName.CICI_SIGNIT;
    public static final COSName FILTER_VERISIGN_PPKVS = COSName.VERISIGN_PPKVS;
    public static final COSName SUBFILTER_ADBE_X509_RSA_SHA1 = COSName.ADBE_X509_RSA_SHA1;
    public static final COSName SUBFILTER_ADBE_PKCS7_DETACHED = COSName.ADBE_PKCS7_DETACHED;
    public static final COSName SUBFILTER_ETSI_CADES_DETACHED = COSName.getPDFName("ETSI.CAdES.detached");
    public static final COSName SUBFILTER_ADBE_PKCS7_SHA1 = COSName.ADBE_PKCS7_SHA1;

    public PDSignature() {
        COSDictionary cOSDictionary = new COSDictionary();
        this.dictionary = cOSDictionary;
        cOSDictionary.setItem(COSName.TYPE, (COSBase) COSName.SIG);
    }

    private byte[] getConvertedContents(InputStream inputStream) {
        int i10;
        int i11;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(1024);
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                byte b10 = bArr[0];
                if (b10 != 60 && b10 != 40) {
                    i11 = 0;
                    i10 = read;
                } else {
                    i10 = read - 1;
                    i11 = 1;
                }
                byte b11 = bArr[read - 1];
                if (b11 == 62 || b11 == 41) {
                    i10--;
                }
                byteArrayOutputStream.write(bArr, i11, i10);
            } else {
                inputStream.close();
                return COSString.parseHex(byteArrayOutputStream.toString(CharEncoding.ISO_8859_1)).getBytes();
            }
        }
    }

    public int[] getByteRange() {
        COSArray cOSArray = this.dictionary.getCOSArray(COSName.BYTERANGE);
        if (cOSArray == null) {
            return new int[0];
        }
        int size = cOSArray.size();
        int[] iArr = new int[size];
        for (int i10 = 0; i10 < size; i10++) {
            iArr[i10] = cOSArray.getInt(i10);
        }
        return iArr;
    }

    public String getContactInfo() {
        return this.dictionary.getString(COSName.CONTACT_INFO);
    }

    public byte[] getContents() {
        COSBase dictionaryObject = this.dictionary.getDictionaryObject(COSName.CONTENTS);
        return dictionaryObject instanceof COSString ? ((COSString) dictionaryObject).getBytes() : new byte[0];
    }

    public String getFilter() {
        return this.dictionary.getNameAsString(COSName.FILTER);
    }

    public String getLocation() {
        return this.dictionary.getString(COSName.LOCATION);
    }

    public String getName() {
        return this.dictionary.getString(COSName.NAME);
    }

    public PDPropBuild getPropBuild() {
        COSDictionary cOSDictionary = this.dictionary.getCOSDictionary(COSName.PROP_BUILD);
        if (cOSDictionary != null) {
            return new PDPropBuild(cOSDictionary);
        }
        return null;
    }

    public String getReason() {
        return this.dictionary.getString(COSName.REASON);
    }

    public Calendar getSignDate() {
        return this.dictionary.getDate(COSName.M);
    }

    public byte[] getSignedContent(InputStream inputStream) {
        COSFilterInputStream cOSFilterInputStream;
        COSFilterInputStream cOSFilterInputStream2 = null;
        try {
            cOSFilterInputStream = new COSFilterInputStream(inputStream, getByteRange());
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            byte[] byteArray = cOSFilterInputStream.toByteArray();
            cOSFilterInputStream.close();
            return byteArray;
        } catch (Throwable th3) {
            th = th3;
            cOSFilterInputStream2 = cOSFilterInputStream;
            if (cOSFilterInputStream2 != null) {
                cOSFilterInputStream2.close();
            }
            throw th;
        }
    }

    public String getSubFilter() {
        return this.dictionary.getNameAsString(COSName.SUB_FILTER);
    }

    public void setByteRange(int[] iArr) {
        if (iArr.length != 4) {
            return;
        }
        COSArray cOSArray = new COSArray();
        for (int i10 : iArr) {
            cOSArray.add((COSBase) COSInteger.get(i10));
        }
        this.dictionary.setItem(COSName.BYTERANGE, (COSBase) cOSArray);
        cOSArray.setDirect(true);
    }

    public void setContactInfo(String str) {
        this.dictionary.setString(COSName.CONTACT_INFO, str);
    }

    public void setContents(byte[] bArr) {
        COSString cOSString = new COSString(bArr);
        cOSString.setForceHexForm(true);
        this.dictionary.setItem(COSName.CONTENTS, (COSBase) cOSString);
    }

    public void setFilter(COSName cOSName) {
        this.dictionary.setItem(COSName.FILTER, (COSBase) cOSName);
    }

    public void setLocation(String str) {
        this.dictionary.setString(COSName.LOCATION, str);
    }

    public void setName(String str) {
        this.dictionary.setString(COSName.NAME, str);
    }

    public void setPropBuild(PDPropBuild pDPropBuild) {
        this.dictionary.setItem(COSName.PROP_BUILD, pDPropBuild);
    }

    public void setReason(String str) {
        this.dictionary.setString(COSName.REASON, str);
    }

    public void setSignDate(Calendar calendar) {
        this.dictionary.setDate(COSName.M, calendar);
    }

    public void setSubFilter(COSName cOSName) {
        this.dictionary.setItem(COSName.SUB_FILTER, (COSBase) cOSName);
    }

    public void setType(COSName cOSName) {
        this.dictionary.setItem(COSName.TYPE, (COSBase) cOSName);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSDictionary getCOSObject() {
        return this.dictionary;
    }

    public PDSignature(COSDictionary cOSDictionary) {
        this.dictionary = cOSDictionary;
    }

    public byte[] getContents(InputStream inputStream) {
        int[] byteRange = getByteRange();
        int i10 = byteRange[0] + byteRange[1] + 1;
        return getConvertedContents(new COSFilterInputStream(inputStream, new int[]{i10, byteRange[2] - i10}));
    }

    public byte[] getSignedContent(byte[] bArr) {
        COSFilterInputStream cOSFilterInputStream;
        COSFilterInputStream cOSFilterInputStream2 = null;
        try {
            cOSFilterInputStream = new COSFilterInputStream(bArr, getByteRange());
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            byte[] byteArray = cOSFilterInputStream.toByteArray();
            cOSFilterInputStream.close();
            return byteArray;
        } catch (Throwable th3) {
            th = th3;
            cOSFilterInputStream2 = cOSFilterInputStream;
            if (cOSFilterInputStream2 != null) {
                cOSFilterInputStream2.close();
            }
            throw th;
        }
    }

    public byte[] getContents(byte[] bArr) {
        int[] byteRange = getByteRange();
        int i10 = byteRange[0] + byteRange[1] + 1;
        return getConvertedContents(new ByteArrayInputStream(bArr, i10, byteRange[2] - i10));
    }
}
