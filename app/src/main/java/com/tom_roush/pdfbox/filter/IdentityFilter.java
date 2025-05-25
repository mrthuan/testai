package com.tom_roush.pdfbox.filter;

import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.io.IOUtils;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes2.dex */
final class IdentityFilter extends Filter {
    @Override // com.tom_roush.pdfbox.filter.Filter
    public DecodeResult decode(InputStream inputStream, OutputStream outputStream, COSDictionary cOSDictionary, int i10) {
        IOUtils.copy(inputStream, outputStream);
        outputStream.flush();
        return new DecodeResult(cOSDictionary);
    }

    @Override // com.tom_roush.pdfbox.filter.Filter
    public void encode(InputStream inputStream, OutputStream outputStream, COSDictionary cOSDictionary) {
        IOUtils.copy(inputStream, outputStream);
        outputStream.flush();
    }
}
