package com.tom_roush.fontbox.ttf;

/* loaded from: classes2.dex */
public class GlyfCompositeComp {
    protected static final short ARGS_ARE_XY_VALUES = 2;
    protected static final short ARG_1_AND_2_ARE_WORDS = 1;
    protected static final short MORE_COMPONENTS = 32;
    protected static final short ROUND_XY_TO_GRID = 4;
    protected static final short USE_MY_METRICS = 512;
    protected static final short WE_HAVE_AN_X_AND_Y_SCALE = 64;
    protected static final short WE_HAVE_A_SCALE = 8;
    protected static final short WE_HAVE_A_TWO_BY_TWO = 128;
    protected static final short WE_HAVE_INSTRUCTIONS = 256;
    private final short argument1;
    private final short argument2;
    private int firstContour;
    private int firstIndex;
    private final short flags;
    private final int glyphIndex;
    private int point1;
    private int point2;
    private double scale01;
    private double scale10;
    private double xscale;
    private int xtranslate;
    private double yscale;
    private int ytranslate;

    public GlyfCompositeComp(TTFDataStream tTFDataStream) {
        this.xscale = 1.0d;
        this.yscale = 1.0d;
        this.scale01 = 0.0d;
        this.scale10 = 0.0d;
        this.xtranslate = 0;
        this.ytranslate = 0;
        this.point1 = 0;
        this.point2 = 0;
        short readSignedShort = tTFDataStream.readSignedShort();
        this.flags = readSignedShort;
        this.glyphIndex = tTFDataStream.readUnsignedShort();
        if ((readSignedShort & 1) != 0) {
            this.argument1 = tTFDataStream.readSignedShort();
            this.argument2 = tTFDataStream.readSignedShort();
        } else {
            this.argument1 = (short) tTFDataStream.readSignedByte();
            this.argument2 = (short) tTFDataStream.readSignedByte();
        }
        if ((readSignedShort & 2) != 0) {
            this.xtranslate = this.argument1;
            this.ytranslate = this.argument2;
        } else {
            this.point1 = this.argument1;
            this.point2 = this.argument2;
        }
        if ((readSignedShort & 8) != 0) {
            double readSignedShort2 = tTFDataStream.readSignedShort() / 16384.0d;
            this.yscale = readSignedShort2;
            this.xscale = readSignedShort2;
        } else if ((readSignedShort & 64) != 0) {
            this.xscale = tTFDataStream.readSignedShort() / 16384.0d;
            this.yscale = tTFDataStream.readSignedShort() / 16384.0d;
        } else if ((readSignedShort & 128) != 0) {
            this.xscale = tTFDataStream.readSignedShort() / 16384.0d;
            this.scale01 = tTFDataStream.readSignedShort() / 16384.0d;
            this.scale10 = tTFDataStream.readSignedShort() / 16384.0d;
            this.yscale = tTFDataStream.readSignedShort() / 16384.0d;
        }
    }

    public short getArgument1() {
        return this.argument1;
    }

    public short getArgument2() {
        return this.argument2;
    }

    public int getFirstContour() {
        return this.firstContour;
    }

    public int getFirstIndex() {
        return this.firstIndex;
    }

    public short getFlags() {
        return this.flags;
    }

    public int getGlyphIndex() {
        return this.glyphIndex;
    }

    public double getScale01() {
        return this.scale01;
    }

    public double getScale10() {
        return this.scale10;
    }

    public double getXScale() {
        return this.xscale;
    }

    public int getXTranslate() {
        return this.xtranslate;
    }

    public double getYScale() {
        return this.yscale;
    }

    public int getYTranslate() {
        return this.ytranslate;
    }

    public int scaleX(int i10, int i11) {
        return Math.round((float) ((i11 * this.scale10) + (i10 * this.xscale)));
    }

    public int scaleY(int i10, int i11) {
        return Math.round((float) ((i11 * this.yscale) + (i10 * this.scale01)));
    }

    public void setFirstContour(int i10) {
        this.firstContour = i10;
    }

    public void setFirstIndex(int i10) {
        this.firstIndex = i10;
    }
}
