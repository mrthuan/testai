package com.tom_roush.pdfbox.filter;

import java.io.OutputStream;

/* loaded from: classes2.dex */
final class CCITTFaxEncoderStream extends OutputStream {
    private static final Code[] BLACK_NONTERMINATING_CODES;
    private static final Code[] BLACK_TERMINATING_CODES;
    private int[] changesCurrentRow;
    private int[] changesReferenceRow;
    private final int columns;
    private final int fillOrder;
    private final byte[] inputBuffer;
    private final int inputBufferLength;
    private final int rows;
    private final OutputStream stream;
    private static final Code[] WHITE_TERMINATING_CODES = new Code[64];
    private static final Code[] WHITE_NONTERMINATING_CODES = new Code[40];
    private int currentBufferLength = 0;
    private int currentRow = 0;
    private int changesCurrentRowLength = 0;
    private int changesReferenceRowLength = 0;
    private byte outputBuffer = 0;
    private byte outputBufferBitLength = 0;

    /* loaded from: classes2.dex */
    public static class Code {
        final int code;
        final int length;

        public /* synthetic */ Code(int i10, int i11, int i12) {
            this(i10, i11);
        }

        private Code(int i10, int i11) {
            this.code = i10;
            this.length = i11;
        }
    }

    static {
        for (int i10 = 0; i10 < CCITTFaxDecoderStream.WHITE_CODES.length; i10++) {
            int i11 = i10 + 4;
            int i12 = 0;
            while (true) {
                short[] sArr = CCITTFaxDecoderStream.WHITE_CODES[i10];
                if (i12 < sArr.length) {
                    short s4 = CCITTFaxDecoderStream.WHITE_RUN_LENGTHS[i10][i12];
                    short s10 = sArr[i12];
                    if (s4 < 64) {
                        WHITE_TERMINATING_CODES[s4] = new Code(s10, i11, 0);
                    } else {
                        WHITE_NONTERMINATING_CODES[(s4 / 64) - 1] = new Code(s10, i11, 0);
                    }
                    i12++;
                }
            }
        }
        BLACK_TERMINATING_CODES = new Code[64];
        BLACK_NONTERMINATING_CODES = new Code[40];
        for (int i13 = 0; i13 < CCITTFaxDecoderStream.BLACK_CODES.length; i13++) {
            int i14 = i13 + 2;
            int i15 = 0;
            while (true) {
                short[] sArr2 = CCITTFaxDecoderStream.BLACK_CODES[i13];
                if (i15 < sArr2.length) {
                    short s11 = CCITTFaxDecoderStream.BLACK_RUN_LENGTHS[i13][i15];
                    short s12 = sArr2[i15];
                    if (s11 < 64) {
                        BLACK_TERMINATING_CODES[s11] = new Code(s12, i14, 0);
                    } else {
                        BLACK_NONTERMINATING_CODES[(s11 / 64) - 1] = new Code(s12, i14, 0);
                    }
                    i15++;
                }
            }
        }
    }

    public CCITTFaxEncoderStream(OutputStream outputStream, int i10, int i11, int i12) {
        this.stream = outputStream;
        this.columns = i10;
        this.rows = i11;
        this.fillOrder = i12;
        this.changesReferenceRow = new int[i10];
        this.changesCurrentRow = new int[i10];
        int i13 = (i10 + 7) / 8;
        this.inputBufferLength = i13;
        this.inputBuffer = new byte[i13];
    }

    private void clearOutputBuffer() {
        this.outputBuffer = (byte) 0;
        this.outputBufferBitLength = (byte) 0;
    }

    private void encode2D() {
        boolean z10 = true;
        int i10 = 0;
        while (i10 < this.columns) {
            int[] nextChanges = getNextChanges(i10, z10);
            int[] nextRefChanges = getNextRefChanges(i10, z10);
            int i11 = nextChanges[0];
            int i12 = i11 - nextRefChanges[0];
            if (i11 > nextRefChanges[1]) {
                write(1, 4);
                i10 = nextRefChanges[1];
            } else if (i12 <= 3 && i12 >= -3) {
                switch (i12) {
                    case -3:
                        write(2, 7);
                        break;
                    case -2:
                        write(2, 6);
                        break;
                    case -1:
                        write(2, 3);
                        break;
                    case 0:
                        write(1, 1);
                        break;
                    case 1:
                        write(3, 3);
                        break;
                    case 2:
                        write(3, 6);
                        break;
                    case 3:
                        write(3, 7);
                        break;
                }
                z10 = !z10;
                i10 = nextRefChanges[0] + i12;
            } else {
                write(1, 3);
                writeRun(nextChanges[0] - i10, z10);
                writeRun(nextChanges[1] - nextChanges[0], !z10);
                i10 = nextChanges[1];
            }
        }
    }

    private void encodeRow() {
        boolean z10;
        this.currentRow++;
        int[] iArr = this.changesReferenceRow;
        this.changesReferenceRow = this.changesCurrentRow;
        this.changesCurrentRow = iArr;
        this.changesReferenceRowLength = this.changesCurrentRowLength;
        this.changesCurrentRowLength = 0;
        boolean z11 = true;
        for (int i10 = 0; i10 < this.columns; i10++) {
            if (((this.inputBuffer[i10 / 8] >> (7 - (i10 % 8))) & 1) == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 == z11) {
                int[] iArr2 = this.changesCurrentRow;
                int i11 = this.changesCurrentRowLength;
                iArr2[i11] = i10;
                this.changesCurrentRowLength = i11 + 1;
                z11 = !z11;
            }
        }
        encodeRowType6();
        if (this.currentRow == this.rows) {
            writeEOL();
            writeEOL();
            fill();
        }
    }

    private void encodeRowType6() {
        encode2D();
    }

    private void fill() {
        if (this.outputBufferBitLength != 0) {
            this.stream.write(this.outputBuffer);
        }
        clearOutputBuffer();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001a, code lost:
        r0[0] = r5;
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
        if (r2 >= r3) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0020, code lost:
        r0[1] = r4[r2];
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int[] getNextChanges(int r7, boolean r8) {
        /*
            r6 = this;
            int r0 = r6.columns
            int[] r0 = new int[]{r0, r0}
            r1 = 0
            r2 = r1
        L8:
            int r3 = r6.changesCurrentRowLength
            if (r2 >= r3) goto L24
            int[] r4 = r6.changesCurrentRow
            r5 = r4[r2]
            if (r7 < r5) goto L1a
            if (r7 != 0) goto L17
            if (r8 == 0) goto L17
            goto L1a
        L17:
            int r2 = r2 + 1
            goto L8
        L1a:
            r0[r1] = r5
            r7 = 1
            int r2 = r2 + r7
            if (r2 >= r3) goto L24
            r8 = r4[r2]
            r0[r7] = r8
        L24:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tom_roush.pdfbox.filter.CCITTFaxEncoderStream.getNextChanges(int, boolean):int[]");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001a, code lost:
        r0[0] = r4;
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
        if (r7 >= r2) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0020, code lost:
        r0[1] = r3[r7];
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int[] getNextRefChanges(int r6, boolean r7) {
        /*
            r5 = this;
            int r0 = r5.columns
            int[] r0 = new int[]{r0, r0}
            r1 = 1
            r7 = r7 ^ r1
        L8:
            int r2 = r5.changesReferenceRowLength
            if (r7 >= r2) goto L24
            int[] r3 = r5.changesReferenceRow
            r4 = r3[r7]
            if (r4 > r6) goto L1a
            if (r6 != 0) goto L17
            if (r7 != 0) goto L17
            goto L1a
        L17:
            int r7 = r7 + 2
            goto L8
        L1a:
            r6 = 0
            r0[r6] = r4
            int r7 = r7 + r1
            if (r7 >= r2) goto L24
            r6 = r3[r7]
            r0[r1] = r6
        L24:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tom_roush.pdfbox.filter.CCITTFaxEncoderStream.getNextRefChanges(int, boolean):int[]");
    }

    private void writeEOL() {
        write(1, 12);
    }

    private void writeRun(int i10, boolean z10) {
        Code[] codeArr;
        Code code;
        int i11 = i10 / 64;
        if (z10) {
            codeArr = WHITE_NONTERMINATING_CODES;
        } else {
            codeArr = BLACK_NONTERMINATING_CODES;
        }
        while (i11 > 0) {
            if (i11 >= codeArr.length) {
                write(codeArr[codeArr.length - 1].code, codeArr[codeArr.length - 1].length);
                i11 -= codeArr.length;
            } else {
                Code code2 = codeArr[i11 - 1];
                write(code2.code, code2.length);
                i11 = 0;
            }
        }
        if (z10) {
            code = WHITE_TERMINATING_CODES[i10 % 64];
        } else {
            code = BLACK_TERMINATING_CODES[i10 % 64];
        }
        write(code.code, code.length);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.stream.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        this.stream.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i10) {
        byte[] bArr = this.inputBuffer;
        int i11 = this.currentBufferLength;
        bArr[i11] = (byte) i10;
        int i12 = i11 + 1;
        this.currentBufferLength = i12;
        if (i12 == this.inputBufferLength) {
            encodeRow();
            this.currentBufferLength = 0;
        }
    }

    private void write(int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            boolean z10 = ((i10 >> ((i11 - i12) - 1)) & 1) == 1;
            if (this.fillOrder == 1) {
                this.outputBuffer = (byte) ((z10 ? 1 << (7 - (this.outputBufferBitLength % 8)) : 0) | this.outputBuffer);
            } else {
                this.outputBuffer = (byte) ((z10 ? 1 << (this.outputBufferBitLength % 8) : 0) | this.outputBuffer);
            }
            byte b10 = (byte) (this.outputBufferBitLength + 1);
            this.outputBufferBitLength = b10;
            if (b10 == 8) {
                this.stream.write(this.outputBuffer);
                clearOutputBuffer();
            }
        }
    }
}
