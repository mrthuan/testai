package com.tom_roush.fontbox.ttf;

import a0.a;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

/* loaded from: classes2.dex */
public class KerningSubtable {
    private static final int COVERAGE_CROSS_STREAM = 4;
    private static final int COVERAGE_CROSS_STREAM_SHIFT = 2;
    private static final int COVERAGE_FORMAT = 65280;
    private static final int COVERAGE_FORMAT_SHIFT = 8;
    private static final int COVERAGE_HORIZONTAL = 1;
    private static final int COVERAGE_HORIZONTAL_SHIFT = 0;
    private static final int COVERAGE_MINIMUMS = 2;
    private static final int COVERAGE_MINIMUMS_SHIFT = 1;
    private boolean crossStream;
    private boolean horizontal;
    private boolean minimums;
    private PairData pairs;

    /* loaded from: classes2.dex */
    public interface PairData {
        int getKerning(int i10, int i11);

        void read(TTFDataStream tTFDataStream);
    }

    /* loaded from: classes2.dex */
    public static class PairData0Format0 implements Comparator<int[]>, PairData {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private int[][] pairs;
        private int searchRange;

        private PairData0Format0() {
        }

        public /* synthetic */ PairData0Format0(int i10) {
            this();
        }

        @Override // com.tom_roush.fontbox.ttf.KerningSubtable.PairData
        public int getKerning(int i10, int i11) {
            int binarySearch = Arrays.binarySearch(this.pairs, new int[]{i10, i11, 0}, this);
            if (binarySearch < 0) {
                return 0;
            }
            return this.pairs[binarySearch][2];
        }

        @Override // com.tom_roush.fontbox.ttf.KerningSubtable.PairData
        public void read(TTFDataStream tTFDataStream) {
            int readUnsignedShort = tTFDataStream.readUnsignedShort();
            this.searchRange = tTFDataStream.readUnsignedShort() / 6;
            tTFDataStream.readUnsignedShort();
            tTFDataStream.readUnsignedShort();
            this.pairs = (int[][]) Array.newInstance(Integer.TYPE, readUnsignedShort, 3);
            for (int i10 = 0; i10 < readUnsignedShort; i10++) {
                int readUnsignedShort2 = tTFDataStream.readUnsignedShort();
                int readUnsignedShort3 = tTFDataStream.readUnsignedShort();
                short readSignedShort = tTFDataStream.readSignedShort();
                int[] iArr = this.pairs[i10];
                iArr[0] = readUnsignedShort2;
                iArr[1] = readUnsignedShort3;
                iArr[2] = readSignedShort;
            }
        }

        @Override // java.util.Comparator
        public int compare(int[] iArr, int[] iArr2) {
            int i10 = iArr[0];
            int i11 = iArr2[0];
            if (i10 < i11) {
                return -1;
            }
            if (i10 > i11) {
                return 1;
            }
            int i12 = iArr[1];
            int i13 = iArr2[1];
            if (i12 < i13) {
                return -1;
            }
            return i12 > i13 ? 1 : 0;
        }
    }

    private static int getBits(int i10, int i11, int i12) {
        return (i10 & i11) >> i12;
    }

    private static boolean isBitsSet(int i10, int i11, int i12) {
        if (getBits(i10, i11, i12) != 0) {
            return true;
        }
        return false;
    }

    private void readSubtable0(TTFDataStream tTFDataStream) {
        if (tTFDataStream.readUnsignedShort() != 0) {
            return;
        }
        int readUnsignedShort = tTFDataStream.readUnsignedShort();
        if (readUnsignedShort >= 6) {
            int readUnsignedShort2 = tTFDataStream.readUnsignedShort();
            if (isBitsSet(readUnsignedShort2, 1, 0)) {
                this.horizontal = true;
            }
            if (isBitsSet(readUnsignedShort2, 2, 1)) {
                this.minimums = true;
            }
            if (isBitsSet(readUnsignedShort2, 4, 2)) {
                this.crossStream = true;
            }
            int bits = getBits(readUnsignedShort2, COVERAGE_FORMAT, 8);
            if (bits == 0) {
                readSubtable0Format0(tTFDataStream);
                return;
            } else if (bits == 2) {
                readSubtable0Format2(tTFDataStream);
                return;
            } else {
                return;
            }
        }
        throw new IOException(a.g("Kerning sub-table too short, got ", readUnsignedShort, " bytes, expect 6 or more."));
    }

    private void readSubtable0Format0(TTFDataStream tTFDataStream) {
        PairData0Format0 pairData0Format0 = new PairData0Format0(0);
        this.pairs = pairData0Format0;
        pairData0Format0.read(tTFDataStream);
    }

    public int[] getKerning(int[] iArr) {
        int i10;
        if (this.pairs != null) {
            int length = iArr.length;
            int[] iArr2 = new int[length];
            int i11 = 0;
            while (i11 < length) {
                int i12 = iArr[i11];
                int i13 = i11 + 1;
                int i14 = i13;
                while (true) {
                    if (i14 >= length) {
                        i10 = -1;
                        break;
                    }
                    i10 = iArr[i14];
                    if (i10 >= 0) {
                        break;
                    }
                    i14++;
                }
                iArr2[i11] = getKerning(i12, i10);
                i11 = i13;
            }
            return iArr2;
        }
        return null;
    }

    public boolean isHorizontalKerning() {
        return isHorizontalKerning(false);
    }

    public void read(TTFDataStream tTFDataStream, int i10) {
        if (i10 == 0) {
            readSubtable0(tTFDataStream);
        } else if (i10 == 1) {
            readSubtable1(tTFDataStream);
        } else {
            throw new IllegalStateException();
        }
    }

    public boolean isHorizontalKerning(boolean z10) {
        if (this.horizontal && !this.minimums) {
            if (z10) {
                return this.crossStream;
            }
            return !this.crossStream;
        }
        return false;
    }

    public int getKerning(int i10, int i11) {
        PairData pairData = this.pairs;
        if (pairData == null) {
            return 0;
        }
        return pairData.getKerning(i10, i11);
    }

    private void readSubtable0Format2(TTFDataStream tTFDataStream) {
    }

    private void readSubtable1(TTFDataStream tTFDataStream) {
    }
}
