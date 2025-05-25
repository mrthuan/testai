package com.tom_roush.pdfbox.filter;

import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.util.Hex;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes2.dex */
final class ASCIIHexFilter extends Filter {
    private static final int[] REVERSE_HEX = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, -1, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

    private boolean isEOD(int i10) {
        if (i10 == 62) {
            return true;
        }
        return false;
    }

    private boolean isWhitespace(int i10) {
        if (i10 != 0 && i10 != 9 && i10 != 10 && i10 != 12 && i10 != 13 && i10 != 32) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0037, code lost:
        r5.write(r7);
     */
    @Override // com.tom_roush.pdfbox.filter.Filter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.tom_roush.pdfbox.filter.DecodeResult decode(java.io.InputStream r4, java.io.OutputStream r5, com.tom_roush.pdfbox.cos.COSDictionary r6, int r7) {
        /*
            r3 = this;
        L0:
            int r7 = r4.read()
            r0 = -1
            if (r7 == r0) goto L3a
        L7:
            boolean r1 = r3.isWhitespace(r7)
            if (r1 == 0) goto L12
            int r7 = r4.read()
            goto L7
        L12:
            if (r7 == r0) goto L3a
            boolean r1 = r3.isEOD(r7)
            if (r1 == 0) goto L1b
            goto L3a
        L1b:
            int[] r1 = com.tom_roush.pdfbox.filter.ASCIIHexFilter.REVERSE_HEX
            r7 = r1[r7]
            int r7 = r7 * 16
            int r2 = r4.read()
            if (r2 == r0) goto L37
            boolean r0 = r3.isEOD(r2)
            if (r0 == 0) goto L2e
            goto L37
        L2e:
            if (r2 < 0) goto L33
            r0 = r1[r2]
            int r7 = r7 + r0
        L33:
            r5.write(r7)
            goto L0
        L37:
            r5.write(r7)
        L3a:
            r5.flush()
            com.tom_roush.pdfbox.filter.DecodeResult r4 = new com.tom_roush.pdfbox.filter.DecodeResult
            r4.<init>(r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tom_roush.pdfbox.filter.ASCIIHexFilter.decode(java.io.InputStream, java.io.OutputStream, com.tom_roush.pdfbox.cos.COSDictionary, int):com.tom_roush.pdfbox.filter.DecodeResult");
    }

    @Override // com.tom_roush.pdfbox.filter.Filter
    public void encode(InputStream inputStream, OutputStream outputStream, COSDictionary cOSDictionary) {
        while (true) {
            int read = inputStream.read();
            if (read != -1) {
                Hex.writeHexByte((byte) read, outputStream);
            } else {
                outputStream.flush();
                return;
            }
        }
    }
}
