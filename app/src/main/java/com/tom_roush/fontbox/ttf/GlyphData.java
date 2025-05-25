package com.tom_roush.fontbox.ttf;

import android.graphics.Path;
import com.tom_roush.fontbox.util.BoundingBox;

/* loaded from: classes2.dex */
public class GlyphData {
    private BoundingBox boundingBox = null;
    private GlyfDescript glyphDescription = null;
    private short numberOfContours;
    private short xMax;
    private short xMin;
    private short yMax;
    private short yMin;

    public BoundingBox getBoundingBox() {
        return this.boundingBox;
    }

    public GlyphDescription getDescription() {
        return this.glyphDescription;
    }

    public short getNumberOfContours() {
        return this.numberOfContours;
    }

    public Path getPath() {
        return new GlyphRenderer(this.glyphDescription).getPath();
    }

    public short getXMaximum() {
        return this.xMax;
    }

    public short getXMinimum() {
        return this.xMin;
    }

    public short getYMaximum() {
        return this.yMax;
    }

    public short getYMinimum() {
        return this.yMin;
    }

    public void initData(GlyphTable glyphTable, TTFDataStream tTFDataStream, int i10) {
        this.numberOfContours = tTFDataStream.readSignedShort();
        this.xMin = tTFDataStream.readSignedShort();
        this.yMin = tTFDataStream.readSignedShort();
        this.xMax = tTFDataStream.readSignedShort();
        short readSignedShort = tTFDataStream.readSignedShort();
        this.yMax = readSignedShort;
        this.boundingBox = new BoundingBox(this.xMin, this.yMin, this.xMax, readSignedShort);
        short s4 = this.numberOfContours;
        if (s4 >= 0) {
            this.glyphDescription = new GlyfSimpleDescript(s4, tTFDataStream, (short) (i10 - this.xMin));
        } else {
            this.glyphDescription = new GlyfCompositeDescript(tTFDataStream, glyphTable);
        }
    }

    public void initEmptyData() {
        this.glyphDescription = new GlyfSimpleDescript();
        this.boundingBox = new BoundingBox();
    }

    public void setBoundingBox(BoundingBox boundingBox) {
        this.boundingBox = boundingBox;
    }

    public void setNumberOfContours(short s4) {
        this.numberOfContours = s4;
    }
}
