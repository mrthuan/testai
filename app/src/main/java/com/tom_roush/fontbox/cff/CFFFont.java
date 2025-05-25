package com.tom_roush.fontbox.cff;

import com.tom_roush.fontbox.FontBoxFont;
import com.tom_roush.fontbox.afm.AFMParser;
import com.tom_roush.fontbox.cff.CFFParser;
import com.tom_roush.fontbox.util.BoundingBox;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class CFFFont implements FontBoxFont {
    protected byte[][] charStrings;
    protected CFFCharset charset;
    protected String fontName;
    protected byte[][] globalSubrIndex;
    private CFFParser.ByteSource source;
    protected final Map<String, Object> topDict = new LinkedHashMap();

    public void addValueToTopDict(String str, Object obj) {
        if (obj != null) {
            this.topDict.put(str, obj);
        }
    }

    public final List<byte[]> getCharStringBytes() {
        return Arrays.asList(this.charStrings);
    }

    public CFFCharset getCharset() {
        return this.charset;
    }

    public byte[] getData() {
        return this.source.getBytes();
    }

    @Override // com.tom_roush.fontbox.FontBoxFont
    public BoundingBox getFontBBox() {
        return new BoundingBox((List) this.topDict.get(AFMParser.FONT_BBOX));
    }

    @Override // com.tom_roush.fontbox.FontBoxFont
    public abstract List<Number> getFontMatrix();

    public List<byte[]> getGlobalSubrIndex() {
        return Arrays.asList(this.globalSubrIndex);
    }

    @Override // com.tom_roush.fontbox.FontBoxFont
    public String getName() {
        return this.fontName;
    }

    public int getNumCharStrings() {
        return this.charStrings.length;
    }

    public Map<String, Object> getTopDict() {
        return this.topDict;
    }

    public abstract Type2CharString getType2CharString(int i10);

    public void setCharset(CFFCharset cFFCharset) {
        this.charset = cFFCharset;
    }

    public final void setData(CFFParser.ByteSource byteSource) {
        this.source = byteSource;
    }

    public void setGlobalSubrIndex(byte[][] bArr) {
        this.globalSubrIndex = bArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setName(String str) {
        this.fontName = str;
    }

    public String toString() {
        return getClass().getSimpleName() + "[name=" + this.fontName + ", topDict=" + this.topDict + ", charset=" + this.charset + ", charStrings=" + Arrays.deepToString(this.charStrings) + "]";
    }
}
