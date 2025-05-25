package com.tom_roush.pdfbox.pdfwriter;

import java.io.FilterOutputStream;
import java.io.OutputStream;

/* loaded from: classes2.dex */
public class COSStandardOutputStream extends FilterOutputStream {
    private boolean onNewLine;
    private long position;
    public static final byte[] CRLF = {13, 10};
    public static final byte[] LF = {10};
    public static final byte[] EOL = {10};

    public COSStandardOutputStream(OutputStream outputStream) {
        super(outputStream);
        this.position = 0L;
        this.onNewLine = false;
    }

    public long getPos() {
        return this.position;
    }

    public boolean isOnNewLine() {
        return this.onNewLine;
    }

    public void setOnNewLine(boolean z10) {
        this.onNewLine = z10;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) {
        setOnNewLine(false);
        ((FilterOutputStream) this).out.write(bArr, i10, i11);
        this.position += i11;
    }

    public void writeCRLF() {
        write(CRLF);
    }

    public void writeEOL() {
        if (!isOnNewLine()) {
            write(EOL);
            setOnNewLine(true);
        }
    }

    public void writeLF() {
        write(LF);
    }

    @Deprecated
    public COSStandardOutputStream(OutputStream outputStream, int i10) {
        super(outputStream);
        this.onNewLine = false;
        this.position = i10;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i10) {
        setOnNewLine(false);
        ((FilterOutputStream) this).out.write(i10);
        this.position++;
    }

    public COSStandardOutputStream(OutputStream outputStream, long j10) {
        super(outputStream);
        this.onNewLine = false;
        this.position = j10;
    }
}
