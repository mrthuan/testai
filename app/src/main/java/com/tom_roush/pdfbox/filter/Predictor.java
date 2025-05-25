package com.tom_roush.pdfbox.filter;

import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.util.Arrays;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;

/* loaded from: classes2.dex */
public final class Predictor {

    /* loaded from: classes2.dex */
    public static final class PredictorOutputStream extends FilterOutputStream {
        private final int bitsPerComponent;
        private final int colors;
        private final int columns;
        private byte[] currentRow;
        private int currentRowData;
        private byte[] lastRow;
        private int predictor;
        private final boolean predictorPerRow;
        private boolean predictorRead;
        private final int rowLength;

        public PredictorOutputStream(OutputStream outputStream, int i10, int i11, int i12, int i13) {
            super(outputStream);
            this.currentRowData = 0;
            this.predictorRead = false;
            this.predictor = i10;
            this.colors = i11;
            this.bitsPerComponent = i12;
            this.columns = i13;
            int calculateRowLength = Predictor.calculateRowLength(i11, i12, i13);
            this.rowLength = calculateRowLength;
            this.predictorPerRow = i10 >= 10;
            this.currentRow = new byte[calculateRowLength];
            this.lastRow = new byte[calculateRowLength];
        }

        private void decodeAndWriteRow() {
            Predictor.decodePredictorRow(this.predictor, this.colors, this.bitsPerComponent, this.columns, this.currentRow, this.lastRow);
            ((FilterOutputStream) this).out.write(this.currentRow);
            flipRows();
        }

        private void flipRows() {
            byte[] bArr = this.lastRow;
            this.lastRow = this.currentRow;
            this.currentRow = bArr;
            this.currentRowData = 0;
            this.predictorRead = false;
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
        public void flush() {
            int i10 = this.currentRowData;
            if (i10 > 0) {
                Arrays.fill(this.currentRow, i10, this.rowLength, (byte) 0);
                decodeAndWriteRow();
            }
            super.flush();
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr) {
            write(bArr, 0, bArr.length);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr, int i10, int i11) {
            int i12 = i11 + i10;
            while (i10 < i12) {
                if (this.predictorPerRow && this.currentRowData == 0 && !this.predictorRead) {
                    this.predictor = bArr[i10] + 10;
                    i10++;
                    this.predictorRead = true;
                } else {
                    int min = Math.min(this.rowLength - this.currentRowData, i12 - i10);
                    System.arraycopy(bArr, i10, this.currentRow, this.currentRowData, min);
                    int i13 = this.currentRowData + min;
                    this.currentRowData = i13;
                    i10 += min;
                    if (i13 == this.currentRow.length) {
                        decodeAndWriteRow();
                    }
                }
            }
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(int i10) {
            throw new UnsupportedOperationException("Not supported");
        }
    }

    private Predictor() {
    }

    public static int calcSetBitSeq(int i10, int i11, int i12, int i13) {
        int i14 = (1 << i12) - 1;
        return (i10 & (~(i14 << i11))) | ((i13 & i14) << i11);
    }

    public static int calculateRowLength(int i10, int i11, int i12) {
        return (((i10 * i11) * i12) + 7) / 8;
    }

    public static void decodePredictorRow(int i10, int i11, int i12, int i13, byte[] bArr, byte[] bArr2) {
        int i14;
        int i15;
        int i16;
        int i17;
        if (i10 == 1) {
            return;
        }
        int i18 = ((i11 * i12) + 7) / 8;
        int length = bArr.length;
        int i19 = 0;
        if (i10 != 2) {
            switch (i10) {
                case 11:
                    for (int i20 = i18; i20 < length; i20++) {
                        bArr[i20] = (byte) (bArr[i20] + bArr[i20 - i18]);
                    }
                    return;
                case 12:
                    break;
                case 13:
                    for (int i21 = 0; i21 < length; i21++) {
                        int i22 = bArr[i21] & 255;
                        int i23 = i21 - i18;
                        if (i23 >= 0) {
                            i15 = bArr[i23] & 255;
                        } else {
                            i15 = 0;
                        }
                        bArr[i21] = (byte) ((((i15 + (bArr2[i21] & 255)) / 2) + i22) & FunctionEval.FunctionID.EXTERNAL_FUNC);
                    }
                    return;
                case 14:
                    for (int i24 = 0; i24 < length; i24++) {
                        int i25 = bArr[i24] & 255;
                        int i26 = i24 - i18;
                        if (i26 >= 0) {
                            i16 = bArr[i26] & 255;
                        } else {
                            i16 = 0;
                        }
                        int i27 = bArr2[i24] & 255;
                        if (i26 >= 0) {
                            i17 = bArr2[i26] & 255;
                        } else {
                            i17 = 0;
                        }
                        int i28 = (i16 + i27) - i17;
                        int abs = Math.abs(i28 - i16);
                        int abs2 = Math.abs(i28 - i27);
                        int abs3 = Math.abs(i28 - i17);
                        if (abs <= abs2 && abs <= abs3) {
                            bArr[i24] = (byte) ((i25 + i16) & FunctionEval.FunctionID.EXTERNAL_FUNC);
                        } else if (abs2 <= abs3) {
                            bArr[i24] = (byte) ((i25 + i27) & FunctionEval.FunctionID.EXTERNAL_FUNC);
                        } else {
                            bArr[i24] = (byte) ((i25 + i17) & FunctionEval.FunctionID.EXTERNAL_FUNC);
                        }
                    }
                    return;
                default:
                    return;
            }
            while (i19 < length) {
                bArr[i19] = (byte) (((bArr[i19] & 255) + (bArr2[i19] & 255)) & FunctionEval.FunctionID.EXTERNAL_FUNC);
                i19++;
            }
        } else if (i12 == 8) {
            for (int i29 = i18; i29 < length; i29++) {
                bArr[i29] = (byte) ((bArr[i29] & 255) + (bArr[i29 - i18] & 255));
            }
        } else if (i12 == 16) {
            for (int i30 = i18; i30 < length; i30 += 2) {
                int i31 = i30 + 1;
                int i32 = i30 - i18;
                int i33 = ((bArr[i32] & 255) << 8) + (bArr[i32 + 1] & 255) + ((bArr[i30] & 255) << 8) + (bArr[i31] & 255);
                bArr[i30] = (byte) ((i33 >> 8) & FunctionEval.FunctionID.EXTERNAL_FUNC);
                bArr[i31] = (byte) (i33 & FunctionEval.FunctionID.EXTERNAL_FUNC);
            }
        } else if (i12 == 1 && i11 == 1) {
            while (i19 < length) {
                for (int i34 = 7; i34 >= 0; i34--) {
                    byte b10 = bArr[i19];
                    int i35 = (b10 >> i34) & 1;
                    if (i19 != 0 || i34 != 7) {
                        if (i34 == 7) {
                            i14 = bArr[i19 - 1];
                        } else {
                            i14 = b10 >> (i34 + 1);
                        }
                        if (((i35 + (i14 & 1)) & 1) == 0) {
                            bArr[i19] = (byte) (b10 & (~(1 << i34)));
                        } else {
                            bArr[i19] = (byte) (b10 | (1 << i34));
                        }
                    }
                }
                i19++;
            }
        } else {
            int i36 = i13 * i11;
            for (int i37 = i11; i37 < i36; i37++) {
                int i38 = i37 * i12;
                int i39 = i38 / 8;
                int i40 = (8 - (i38 % 8)) - i12;
                int i41 = (i37 - i11) * i12;
                bArr[i39] = (byte) calcSetBitSeq(bArr[i39], i40, i12, getBitSeq(bArr[i39], i40, i12) + getBitSeq(bArr[i41 / 8], (8 - (i41 % 8)) - i12, i12));
            }
        }
    }

    public static int getBitSeq(int i10, int i11, int i12) {
        return (i10 >>> i11) & ((1 << i12) - 1);
    }

    public static OutputStream wrapPredictor(OutputStream outputStream, COSDictionary cOSDictionary) {
        int i10 = cOSDictionary.getInt(COSName.PREDICTOR);
        if (i10 > 1) {
            return new PredictorOutputStream(outputStream, i10, Math.min(cOSDictionary.getInt(COSName.COLORS, 1), 32), cOSDictionary.getInt(COSName.BITS_PER_COMPONENT, 8), cOSDictionary.getInt(COSName.COLUMNS, 1));
        }
        return outputStream;
    }
}
