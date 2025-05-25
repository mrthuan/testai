package com.tom_roush.fontbox.ttf;

import java.io.IOException;

/* loaded from: classes2.dex */
public class VerticalMetricsTable extends TTFTable {
    public static final String TAG = "vmtx";
    private short[] additionalTopSideBearing;
    private int[] advanceHeight;
    private int numVMetrics;
    private short[] topSideBearing;

    public VerticalMetricsTable(TrueTypeFont trueTypeFont) {
        super(trueTypeFont);
    }

    public int getAdvanceHeight(int i10) {
        if (i10 < this.numVMetrics) {
            return this.advanceHeight[i10];
        }
        int[] iArr = this.advanceHeight;
        return iArr[iArr.length - 1];
    }

    public int getTopSideBearing(int i10) {
        int i11 = this.numVMetrics;
        if (i10 < i11) {
            return this.topSideBearing[i10];
        }
        return this.additionalTopSideBearing[i10 - i11];
    }

    @Override // com.tom_roush.fontbox.ttf.TTFTable
    public void read(TrueTypeFont trueTypeFont, TTFDataStream tTFDataStream) {
        VerticalHeaderTable verticalHeader = trueTypeFont.getVerticalHeader();
        if (verticalHeader != null) {
            this.numVMetrics = verticalHeader.getNumberOfVMetrics();
            int numberOfGlyphs = trueTypeFont.getNumberOfGlyphs();
            int i10 = this.numVMetrics;
            this.advanceHeight = new int[i10];
            this.topSideBearing = new short[i10];
            int i11 = 0;
            for (int i12 = 0; i12 < this.numVMetrics; i12++) {
                this.advanceHeight[i12] = tTFDataStream.readUnsignedShort();
                this.topSideBearing[i12] = tTFDataStream.readSignedShort();
                i11 += 4;
            }
            if (i11 < getLength()) {
                int i13 = numberOfGlyphs - this.numVMetrics;
                if (i13 >= 0) {
                    numberOfGlyphs = i13;
                }
                this.additionalTopSideBearing = new short[numberOfGlyphs];
                for (int i14 = 0; i14 < numberOfGlyphs; i14++) {
                    if (i11 < getLength()) {
                        this.additionalTopSideBearing[i14] = tTFDataStream.readSignedShort();
                        i11 += 2;
                    }
                }
            }
            this.initialized = true;
            return;
        }
        throw new IOException("Could not get vhea table");
    }
}
