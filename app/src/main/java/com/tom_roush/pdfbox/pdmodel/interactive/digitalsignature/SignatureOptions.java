package com.tom_roush.pdfbox.pdmodel.interactive.digitalsignature;

import com.tom_roush.pdfbox.cos.COSDocument;
import com.tom_roush.pdfbox.io.RandomAccessBuffer;
import com.tom_roush.pdfbox.io.RandomAccessBufferedFileInputStream;
import com.tom_roush.pdfbox.io.RandomAccessRead;
import com.tom_roush.pdfbox.pdfparser.PDFParser;
import com.tom_roush.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSigProperties;
import java.io.Closeable;
import java.io.File;
import java.io.InputStream;

/* loaded from: classes2.dex */
public class SignatureOptions implements Closeable {
    public static final int DEFAULT_SIGNATURE_SIZE = 9472;
    private int preferredSignatureSize;
    private COSDocument visualSignature;
    private RandomAccessRead pdfSource = null;
    private int pageNo = 0;

    private void initFromRandomAccessRead(RandomAccessRead randomAccessRead) {
        this.pdfSource = randomAccessRead;
        PDFParser pDFParser = new PDFParser(this.pdfSource);
        pDFParser.parse();
        this.visualSignature = pDFParser.getDocument();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        COSDocument cOSDocument = this.visualSignature;
        if (cOSDocument != null) {
            cOSDocument.close();
        }
        RandomAccessRead randomAccessRead = this.pdfSource;
        if (randomAccessRead != null) {
            randomAccessRead.close();
        }
    }

    public int getPage() {
        return this.pageNo;
    }

    public int getPreferredSignatureSize() {
        return this.preferredSignatureSize;
    }

    public COSDocument getVisualSignature() {
        return this.visualSignature;
    }

    public void setPage(int i10) {
        this.pageNo = i10;
    }

    public void setPreferredSignatureSize(int i10) {
        if (i10 > 0) {
            this.preferredSignatureSize = i10;
        }
    }

    public void setVisualSignature(File file) {
        initFromRandomAccessRead(new RandomAccessBufferedFileInputStream(file));
    }

    public void setVisualSignature(InputStream inputStream) {
        initFromRandomAccessRead(new RandomAccessBuffer(inputStream));
    }

    public void setVisualSignature(PDVisibleSigProperties pDVisibleSigProperties) {
        setVisualSignature(pDVisibleSigProperties.getVisibleSignature());
    }
}
