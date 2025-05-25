package com.tom_roush.pdfbox.filter;

import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.io.IOUtils;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes2.dex */
final class ASCII85Filter extends Filter {
    @Override // com.tom_roush.pdfbox.filter.Filter
    public DecodeResult decode(InputStream inputStream, OutputStream outputStream, COSDictionary cOSDictionary, int i10) {
        ASCII85InputStream aSCII85InputStream;
        ASCII85InputStream aSCII85InputStream2 = null;
        try {
            aSCII85InputStream = new ASCII85InputStream(inputStream);
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            IOUtils.copy(aSCII85InputStream, outputStream);
            outputStream.flush();
            IOUtils.closeQuietly(aSCII85InputStream);
            return new DecodeResult(cOSDictionary);
        } catch (Throwable th3) {
            th = th3;
            aSCII85InputStream2 = aSCII85InputStream;
            IOUtils.closeQuietly(aSCII85InputStream2);
            throw th;
        }
    }

    @Override // com.tom_roush.pdfbox.filter.Filter
    public void encode(InputStream inputStream, OutputStream outputStream, COSDictionary cOSDictionary) {
        ASCII85OutputStream aSCII85OutputStream = new ASCII85OutputStream(outputStream);
        IOUtils.copy(inputStream, aSCII85OutputStream);
        aSCII85OutputStream.close();
        outputStream.flush();
    }
}
