package com.tom_roush.fontbox.ttf;

import java.util.Calendar;

/* loaded from: classes2.dex */
public class HeaderTable extends TTFTable {
    public static final int MAC_STYLE_BOLD = 1;
    public static final int MAC_STYLE_ITALIC = 2;
    public static final String TAG = "head";
    private long checkSumAdjustment;
    private Calendar created;
    private int flags;
    private short fontDirectionHint;
    private float fontRevision;
    private short glyphDataFormat;
    private short indexToLocFormat;
    private int lowestRecPPEM;
    private int macStyle;
    private long magicNumber;
    private Calendar modified;
    private int unitsPerEm;
    private float version;
    private short xMax;
    private short xMin;
    private short yMax;
    private short yMin;

    public HeaderTable(TrueTypeFont trueTypeFont) {
        super(trueTypeFont);
    }

    public long getCheckSumAdjustment() {
        return this.checkSumAdjustment;
    }

    public Calendar getCreated() {
        return this.created;
    }

    public int getFlags() {
        return this.flags;
    }

    public short getFontDirectionHint() {
        return this.fontDirectionHint;
    }

    public float getFontRevision() {
        return this.fontRevision;
    }

    public short getGlyphDataFormat() {
        return this.glyphDataFormat;
    }

    public short getIndexToLocFormat() {
        return this.indexToLocFormat;
    }

    public int getLowestRecPPEM() {
        return this.lowestRecPPEM;
    }

    public int getMacStyle() {
        return this.macStyle;
    }

    public long getMagicNumber() {
        return this.magicNumber;
    }

    public Calendar getModified() {
        return this.modified;
    }

    public int getUnitsPerEm() {
        return this.unitsPerEm;
    }

    public float getVersion() {
        return this.version;
    }

    public short getXMax() {
        return this.xMax;
    }

    public short getXMin() {
        return this.xMin;
    }

    public short getYMax() {
        return this.yMax;
    }

    public short getYMin() {
        return this.yMin;
    }

    @Override // com.tom_roush.fontbox.ttf.TTFTable
    public void read(TrueTypeFont trueTypeFont, TTFDataStream tTFDataStream) {
        this.version = tTFDataStream.read32Fixed();
        this.fontRevision = tTFDataStream.read32Fixed();
        this.checkSumAdjustment = tTFDataStream.readUnsignedInt();
        this.magicNumber = tTFDataStream.readUnsignedInt();
        this.flags = tTFDataStream.readUnsignedShort();
        this.unitsPerEm = tTFDataStream.readUnsignedShort();
        this.created = tTFDataStream.readInternationalDate();
        this.modified = tTFDataStream.readInternationalDate();
        this.xMin = tTFDataStream.readSignedShort();
        this.yMin = tTFDataStream.readSignedShort();
        this.xMax = tTFDataStream.readSignedShort();
        this.yMax = tTFDataStream.readSignedShort();
        this.macStyle = tTFDataStream.readUnsignedShort();
        this.lowestRecPPEM = tTFDataStream.readUnsignedShort();
        this.fontDirectionHint = tTFDataStream.readSignedShort();
        this.indexToLocFormat = tTFDataStream.readSignedShort();
        this.glyphDataFormat = tTFDataStream.readSignedShort();
        this.initialized = true;
    }

    public void setCheckSumAdjustment(long j10) {
        this.checkSumAdjustment = j10;
    }

    public void setCreated(Calendar calendar) {
        this.created = calendar;
    }

    public void setFlags(int i10) {
        this.flags = i10;
    }

    public void setFontDirectionHint(short s4) {
        this.fontDirectionHint = s4;
    }

    public void setFontRevision(float f10) {
        this.fontRevision = f10;
    }

    public void setGlyphDataFormat(short s4) {
        this.glyphDataFormat = s4;
    }

    public void setIndexToLocFormat(short s4) {
        this.indexToLocFormat = s4;
    }

    public void setLowestRecPPEM(int i10) {
        this.lowestRecPPEM = i10;
    }

    public void setMacStyle(int i10) {
        this.macStyle = i10;
    }

    public void setMagicNumber(long j10) {
        this.magicNumber = j10;
    }

    public void setModified(Calendar calendar) {
        this.modified = calendar;
    }

    public void setUnitsPerEm(int i10) {
        this.unitsPerEm = i10;
    }

    public void setVersion(float f10) {
        this.version = f10;
    }

    public void setXMax(short s4) {
        this.xMax = s4;
    }

    public void setXMin(short s4) {
        this.xMin = s4;
    }

    public void setYMax(short s4) {
        this.yMax = s4;
    }

    public void setYMin(short s4) {
        this.yMin = s4;
    }
}
