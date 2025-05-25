package com.tom_roush.fontbox.ttf;

/* loaded from: classes2.dex */
public class TTFTable {
    private long checkSum;
    protected final TrueTypeFont font;
    protected volatile boolean initialized;
    private long length;
    private long offset;
    private String tag;

    public TTFTable(TrueTypeFont trueTypeFont) {
        this.font = trueTypeFont;
    }

    public long getCheckSum() {
        return this.checkSum;
    }

    public boolean getInitialized() {
        return this.initialized;
    }

    public long getLength() {
        return this.length;
    }

    public long getOffset() {
        return this.offset;
    }

    public String getTag() {
        return this.tag;
    }

    public void setCheckSum(long j10) {
        this.checkSum = j10;
    }

    public void setLength(long j10) {
        this.length = j10;
    }

    public void setOffset(long j10) {
        this.offset = j10;
    }

    public void setTag(String str) {
        this.tag = str;
    }

    public void read(TrueTypeFont trueTypeFont, TTFDataStream tTFDataStream) {
    }
}
