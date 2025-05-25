package com.tom_roush.fontbox.ttf;

import java.io.IOException;

/* loaded from: classes2.dex */
public class HorizontalMetricsTable extends TTFTable {
    public static final String TAG = "hmtx";
    private int[] advanceWidth;
    private short[] leftSideBearing;
    private short[] nonHorizontalLeftSideBearing;
    private int numHMetrics;

    public HorizontalMetricsTable(TrueTypeFont trueTypeFont) {
        super(trueTypeFont);
    }

    public int getAdvanceWidth(int i10) {
        if (i10 < this.numHMetrics) {
            return this.advanceWidth[i10];
        }
        int[] iArr = this.advanceWidth;
        return iArr[iArr.length - 1];
    }

    public int getLeftSideBearing(int i10) {
        int i11 = this.numHMetrics;
        if (i10 < i11) {
            return this.leftSideBearing[i10];
        }
        return this.nonHorizontalLeftSideBearing[i10 - i11];
    }

    @Override // com.tom_roush.fontbox.ttf.TTFTable
    public void read(TrueTypeFont trueTypeFont, TTFDataStream tTFDataStream) {
        int i10;
        HorizontalHeaderTable horizontalHeader = trueTypeFont.getHorizontalHeader();
        if (horizontalHeader != null) {
            this.numHMetrics = horizontalHeader.getNumberOfHMetrics();
            int numberOfGlyphs = trueTypeFont.getNumberOfGlyphs();
            int i11 = this.numHMetrics;
            this.advanceWidth = new int[i11];
            this.leftSideBearing = new short[i11];
            int i12 = 0;
            int i13 = 0;
            while (true) {
                i10 = this.numHMetrics;
                if (i12 >= i10) {
                    break;
                }
                this.advanceWidth[i12] = tTFDataStream.readUnsignedShort();
                this.leftSideBearing[i12] = tTFDataStream.readSignedShort();
                i13 += 4;
                i12++;
            }
            int i14 = numberOfGlyphs - i10;
            if (i14 >= 0) {
                numberOfGlyphs = i14;
            }
            this.nonHorizontalLeftSideBearing = new short[numberOfGlyphs];
            if (i13 < getLength()) {
                for (int i15 = 0; i15 < numberOfGlyphs; i15++) {
                    if (i13 < getLength()) {
                        this.nonHorizontalLeftSideBearing[i15] = tTFDataStream.readSignedShort();
                        i13 += 2;
                    }
                }
            }
            this.initialized = true;
            return;
        }
        throw new IOException("Could not get hhea table");
    }
}
