package com.tom_roush.fontbox.ttf;

/* loaded from: classes2.dex */
public class VerticalHeaderTable extends TTFTable {
    public static final String TAG = "vhea";
    private int advanceHeightMax;
    private short ascender;
    private short caretOffset;
    private short caretSlopeRise;
    private short caretSlopeRun;
    private short descender;
    private short lineGap;
    private short metricDataFormat;
    private short minBottomSideBearing;
    private short minTopSideBearing;
    private int numberOfVMetrics;
    private short reserved1;
    private short reserved2;
    private short reserved3;
    private short reserved4;
    private float version;
    private short yMaxExtent;

    public VerticalHeaderTable(TrueTypeFont trueTypeFont) {
        super(trueTypeFont);
    }

    public int getAdvanceHeightMax() {
        return this.advanceHeightMax;
    }

    public short getAscender() {
        return this.ascender;
    }

    public short getCaretOffset() {
        return this.caretOffset;
    }

    public short getCaretSlopeRise() {
        return this.caretSlopeRise;
    }

    public short getCaretSlopeRun() {
        return this.caretSlopeRun;
    }

    public short getDescender() {
        return this.descender;
    }

    public short getLineGap() {
        return this.lineGap;
    }

    public short getMetricDataFormat() {
        return this.metricDataFormat;
    }

    public short getMinBottomSideBearing() {
        return this.minBottomSideBearing;
    }

    public short getMinTopSideBearing() {
        return this.minTopSideBearing;
    }

    public int getNumberOfVMetrics() {
        return this.numberOfVMetrics;
    }

    public short getReserved1() {
        return this.reserved1;
    }

    public short getReserved2() {
        return this.reserved2;
    }

    public short getReserved3() {
        return this.reserved3;
    }

    public short getReserved4() {
        return this.reserved4;
    }

    public float getVersion() {
        return this.version;
    }

    public short getYMaxExtent() {
        return this.yMaxExtent;
    }

    @Override // com.tom_roush.fontbox.ttf.TTFTable
    public void read(TrueTypeFont trueTypeFont, TTFDataStream tTFDataStream) {
        this.version = tTFDataStream.read32Fixed();
        this.ascender = tTFDataStream.readSignedShort();
        this.descender = tTFDataStream.readSignedShort();
        this.lineGap = tTFDataStream.readSignedShort();
        this.advanceHeightMax = tTFDataStream.readUnsignedShort();
        this.minTopSideBearing = tTFDataStream.readSignedShort();
        this.minBottomSideBearing = tTFDataStream.readSignedShort();
        this.yMaxExtent = tTFDataStream.readSignedShort();
        this.caretSlopeRise = tTFDataStream.readSignedShort();
        this.caretSlopeRun = tTFDataStream.readSignedShort();
        this.caretOffset = tTFDataStream.readSignedShort();
        this.reserved1 = tTFDataStream.readSignedShort();
        this.reserved2 = tTFDataStream.readSignedShort();
        this.reserved3 = tTFDataStream.readSignedShort();
        this.reserved4 = tTFDataStream.readSignedShort();
        this.metricDataFormat = tTFDataStream.readSignedShort();
        this.numberOfVMetrics = tTFDataStream.readUnsignedShort();
        this.initialized = true;
    }
}
