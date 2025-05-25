package com.tom_roush.pdfbox.filter;

import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.io.IOUtils;
import java.io.InputStream;
import java.io.OutputStream;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class CCITTFaxFilter extends Filter {
    private void invertBitmap(byte[] bArr) {
        int length = bArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            bArr[i10] = (byte) ((~bArr[i10]) & FunctionEval.FunctionID.EXTERNAL_FUNC);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0061, code lost:
        if (r15 != 1) goto L21;
     */
    @Override // com.tom_roush.pdfbox.filter.Filter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.tom_roush.pdfbox.filter.DecodeResult decode(java.io.InputStream r19, java.io.OutputStream r20, com.tom_roush.pdfbox.cos.COSDictionary r21, int r22) {
        /*
            Method dump skipped, instructions count: 197
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tom_roush.pdfbox.filter.CCITTFaxFilter.decode(java.io.InputStream, java.io.OutputStream, com.tom_roush.pdfbox.cos.COSDictionary, int):com.tom_roush.pdfbox.filter.DecodeResult");
    }

    @Override // com.tom_roush.pdfbox.filter.Filter
    public void encode(InputStream inputStream, OutputStream outputStream, COSDictionary cOSDictionary) {
        IOUtils.copy(inputStream, new CCITTFaxEncoderStream(outputStream, cOSDictionary.getInt(COSName.COLUMNS), cOSDictionary.getInt(COSName.ROWS), 1));
    }

    public void readFromDecoderStream(CCITTFaxDecoderStream cCITTFaxDecoderStream, byte[] bArr) {
        int i10 = 0;
        do {
            int read = cCITTFaxDecoderStream.read(bArr, i10, bArr.length - i10);
            if (read > -1) {
                i10 += read;
            } else {
                return;
            }
        } while (i10 < bArr.length);
    }
}
