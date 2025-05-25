package com.tom_roush.pdfbox.filter;

import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.io.IOUtils;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes2.dex */
final class DCTFilter extends Filter {
    private static final String ADOBE = "Adobe";
    private static final int POS_TRANSFORM = 11;

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000b, code lost:
        if (r3 > 255.0f) goto L3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int clamp(float r3) {
        /*
            r2 = this;
            r0 = 0
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 >= 0) goto L7
        L5:
            r3 = r0
            goto Le
        L7:
            r0 = 1132396544(0x437f0000, float:255.0)
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 <= 0) goto Le
            goto L5
        Le:
            int r3 = (int) r3
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tom_roush.pdfbox.filter.DCTFilter.clamp(float):int");
    }

    @Override // com.tom_roush.pdfbox.filter.Filter
    public DecodeResult decode(InputStream inputStream, OutputStream outputStream, COSDictionary cOSDictionary, int i10, DecodeOptions decodeOptions) {
        IOUtils.copy(inputStream, outputStream);
        return new DecodeResult(cOSDictionary);
    }

    @Override // com.tom_roush.pdfbox.filter.Filter
    public void encode(InputStream inputStream, OutputStream outputStream, COSDictionary cOSDictionary) {
        throw new UnsupportedOperationException("DCTFilter encoding not implemented, use the JPEGFactory methods instead");
    }

    @Override // com.tom_roush.pdfbox.filter.Filter
    public DecodeResult decode(InputStream inputStream, OutputStream outputStream, COSDictionary cOSDictionary, int i10) {
        return decode(inputStream, outputStream, cOSDictionary, i10, DecodeOptions.DEFAULT);
    }
}
