package com.tom_roush.fontbox.cff;

import android.graphics.Path;
import b.a;
import com.tom_roush.fontbox.EncodedFont;
import com.tom_roush.fontbox.type1.Type1CharStringReader;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public class CFFType1Font extends CFFFont implements EncodedFont {
    private CFFEncoding encoding;
    private final Map<String, Object> privateDict = new LinkedHashMap();
    private final Map<Integer, Type2CharString> charStringCache = new ConcurrentHashMap();
    private final PrivateType1CharStringReader reader = new PrivateType1CharStringReader(this, 0);

    /* loaded from: classes2.dex */
    public class PrivateType1CharStringReader implements Type1CharStringReader {
        public /* synthetic */ PrivateType1CharStringReader(CFFType1Font cFFType1Font, int i10) {
            this();
        }

        @Override // com.tom_roush.fontbox.type1.Type1CharStringReader
        public Type1CharString getType1CharString(String str) {
            return CFFType1Font.this.getType1CharString(str);
        }

        private PrivateType1CharStringReader() {
        }
    }

    private int getDefaultWidthX() {
        Number number = (Number) getProperty("defaultWidthX");
        if (number == null) {
            return 1000;
        }
        return number.intValue();
    }

    private byte[][] getLocalSubrIndex() {
        return (byte[][]) this.privateDict.get("Subrs");
    }

    private int getNominalWidthX() {
        Number number = (Number) getProperty("nominalWidthX");
        if (number == null) {
            return 0;
        }
        return number.intValue();
    }

    private Object getProperty(String str) {
        Object obj = this.topDict.get(str);
        if (obj != null) {
            return obj;
        }
        return this.privateDict.get(str);
    }

    public void addToPrivateDict(String str, Object obj) {
        if (obj != null) {
            this.privateDict.put(str, obj);
        }
    }

    @Override // com.tom_roush.fontbox.cff.CFFFont, com.tom_roush.fontbox.FontBoxFont
    public List<Number> getFontMatrix() {
        return (List) this.topDict.get("FontMatrix");
    }

    @Override // com.tom_roush.fontbox.FontBoxFont
    public Path getPath(String str) {
        return getType1CharString(str).getPath();
    }

    public Map<String, Object> getPrivateDict() {
        return this.privateDict;
    }

    public Type1CharString getType1CharString(String str) {
        return getType2CharString(nameToGID(str), str);
    }

    @Override // com.tom_roush.fontbox.cff.CFFFont
    public Type2CharString getType2CharString(int i10) {
        return getType2CharString(i10, a.c("GID+", i10));
    }

    @Override // com.tom_roush.fontbox.FontBoxFont
    public float getWidth(String str) {
        return getType1CharString(str).getWidth();
    }

    @Override // com.tom_roush.fontbox.FontBoxFont
    public boolean hasGlyph(String str) {
        if (this.charset.getGIDForSID(this.charset.getSID(str)) != 0) {
            return true;
        }
        return false;
    }

    public int nameToGID(String str) {
        return this.charset.getGIDForSID(this.charset.getSID(str));
    }

    public void setEncoding(CFFEncoding cFFEncoding) {
        this.encoding = cFFEncoding;
    }

    @Override // com.tom_roush.fontbox.EncodedFont
    public CFFEncoding getEncoding() {
        return this.encoding;
    }

    private Type2CharString getType2CharString(int i10, String str) {
        Type2CharString type2CharString = this.charStringCache.get(Integer.valueOf(i10));
        if (type2CharString == null) {
            byte[][] bArr = this.charStrings;
            byte[] bArr2 = i10 < bArr.length ? bArr[i10] : null;
            if (bArr2 == null) {
                bArr2 = bArr[0];
            }
            Type2CharString type2CharString2 = new Type2CharString(this.reader, this.fontName, str, i10, new Type2CharStringParser(this.fontName, str).parse(bArr2, this.globalSubrIndex, getLocalSubrIndex()), getDefaultWidthX(), getNominalWidthX());
            this.charStringCache.put(Integer.valueOf(i10), type2CharString2);
            return type2CharString2;
        }
        return type2CharString;
    }
}
