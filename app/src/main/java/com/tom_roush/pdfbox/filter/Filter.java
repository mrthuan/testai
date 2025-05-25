package com.tom_roush.pdfbox.filter;

import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes2.dex */
public abstract class Filter {
    public static final String SYSPROP_DEFLATELEVEL = "com.tom_roush.pdfbox.filter.deflatelevel";

    public static int getCompressionLevel() {
        int i10;
        try {
            i10 = Integer.parseInt(System.getProperty(SYSPROP_DEFLATELEVEL, "-1"));
        } catch (NumberFormatException e10) {
            e10.getMessage();
            i10 = -1;
        }
        return Math.max(-1, Math.min(9, i10));
    }

    public abstract DecodeResult decode(InputStream inputStream, OutputStream outputStream, COSDictionary cOSDictionary, int i10);

    public DecodeResult decode(InputStream inputStream, OutputStream outputStream, COSDictionary cOSDictionary, int i10, DecodeOptions decodeOptions) {
        return decode(inputStream, outputStream, cOSDictionary, i10);
    }

    public abstract void encode(InputStream inputStream, OutputStream outputStream, COSDictionary cOSDictionary);

    public final void encode(InputStream inputStream, OutputStream outputStream, COSDictionary cOSDictionary, int i10) {
        encode(inputStream, outputStream, cOSDictionary.asUnmodifiableDictionary());
    }

    public COSDictionary getDecodeParams(COSDictionary cOSDictionary, int i10) {
        COSBase dictionaryObject = cOSDictionary.getDictionaryObject(COSName.FILTER, COSName.F);
        COSBase dictionaryObject2 = cOSDictionary.getDictionaryObject(COSName.DECODE_PARMS, COSName.DP);
        if ((dictionaryObject instanceof COSName) && (dictionaryObject2 instanceof COSDictionary)) {
            return (COSDictionary) dictionaryObject2;
        }
        boolean z10 = dictionaryObject instanceof COSArray;
        if (z10 && (dictionaryObject2 instanceof COSArray)) {
            COSArray cOSArray = (COSArray) dictionaryObject2;
            if (i10 < cOSArray.size() && (cOSArray.getObject(i10) instanceof COSDictionary)) {
                return (COSDictionary) cOSArray.getObject(i10);
            }
        } else if (dictionaryObject2 != null && !z10) {
            boolean z11 = dictionaryObject2 instanceof COSArray;
        }
        return new COSDictionary();
    }
}
