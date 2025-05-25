package com.tom_roush.pdfbox.pdmodel.interactive.digitalsignature;

import com.tom_roush.pdfbox.pdfwriter.COSWriter;
import java.io.Closeable;
import java.io.InputStream;

/* loaded from: classes2.dex */
public class SigningSupport implements ExternalSigningSupport, Closeable {
    private COSWriter cosWriter;

    public SigningSupport(COSWriter cOSWriter) {
        this.cosWriter = cOSWriter;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        COSWriter cOSWriter = this.cosWriter;
        if (cOSWriter != null) {
            try {
                cOSWriter.close();
            } finally {
                this.cosWriter = null;
            }
        }
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.digitalsignature.ExternalSigningSupport
    public InputStream getContent() {
        return this.cosWriter.getDataToSign();
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.digitalsignature.ExternalSigningSupport
    public void setSignature(byte[] bArr) {
        this.cosWriter.writeExternalSignature(bArr);
    }
}
