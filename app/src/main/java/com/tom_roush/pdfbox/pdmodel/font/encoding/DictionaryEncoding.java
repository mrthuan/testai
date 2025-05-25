package com.tom_roush.pdfbox.pdmodel.font.encoding;

import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSNumber;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class DictionaryEncoding extends Encoding {
    private final Encoding baseEncoding;
    private final Map<Integer, String> differences;
    private final COSDictionary encoding;

    public DictionaryEncoding(COSName cOSName, COSArray cOSArray) {
        this.differences = new HashMap();
        COSDictionary cOSDictionary = new COSDictionary();
        this.encoding = cOSDictionary;
        cOSDictionary.setItem(COSName.NAME, (COSBase) COSName.ENCODING);
        cOSDictionary.setItem(COSName.DIFFERENCES, (COSBase) cOSArray);
        if (cOSName != COSName.STANDARD_ENCODING) {
            cOSDictionary.setItem(COSName.BASE_ENCODING, (COSBase) cOSName);
            this.baseEncoding = Encoding.getInstance(cOSName);
        } else {
            this.baseEncoding = Encoding.getInstance(cOSName);
        }
        Encoding encoding = this.baseEncoding;
        if (encoding != null) {
            this.codeToName.putAll(encoding.codeToName);
            this.inverted.putAll(this.baseEncoding.inverted);
            applyDifferences();
            return;
        }
        throw new IllegalArgumentException("Invalid encoding: " + cOSName);
    }

    private void applyDifferences() {
        COSBase dictionaryObject = this.encoding.getDictionaryObject(COSName.DIFFERENCES);
        if (!(dictionaryObject instanceof COSArray)) {
            return;
        }
        COSArray cOSArray = (COSArray) dictionaryObject;
        int i10 = -1;
        for (int i11 = 0; i11 < cOSArray.size(); i11++) {
            COSBase object = cOSArray.getObject(i11);
            if (object instanceof COSNumber) {
                i10 = ((COSNumber) object).intValue();
            } else if (object instanceof COSName) {
                COSName cOSName = (COSName) object;
                overwrite(i10, cOSName.getName());
                this.differences.put(Integer.valueOf(i10), cOSName.getName());
                i10++;
            }
        }
    }

    public Encoding getBaseEncoding() {
        return this.baseEncoding;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSBase getCOSObject() {
        return this.encoding;
    }

    public Map<Integer, String> getDifferences() {
        return this.differences;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.encoding.Encoding
    public String getEncodingName() {
        if (this.baseEncoding == null) {
            return "differences";
        }
        return this.baseEncoding.getEncodingName() + " with differences";
    }

    public DictionaryEncoding(COSDictionary cOSDictionary) {
        this.differences = new HashMap();
        this.encoding = cOSDictionary;
        this.baseEncoding = null;
        applyDifferences();
    }

    public DictionaryEncoding(COSDictionary cOSDictionary, boolean z10, Encoding encoding) {
        this.differences = new HashMap();
        this.encoding = cOSDictionary;
        COSName cOSName = COSName.BASE_ENCODING;
        Encoding encoding2 = cOSDictionary.containsKey(cOSName) ? Encoding.getInstance(cOSDictionary.getCOSName(cOSName)) : null;
        if (encoding2 != null) {
            encoding = encoding2;
        } else if (z10) {
            encoding = StandardEncoding.INSTANCE;
        } else if (encoding == null) {
            throw new IllegalArgumentException("Symbolic fonts must have a built-in encoding");
        }
        this.baseEncoding = encoding;
        this.codeToName.putAll(encoding.codeToName);
        this.inverted.putAll(encoding.inverted);
        applyDifferences();
    }
}
