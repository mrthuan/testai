package com.tom_roush.pdfbox.io;

import java.io.Closeable;

/* loaded from: classes2.dex */
public interface RandomAccessRead extends Closeable {
    int available();

    long getPosition();

    boolean isClosed();

    boolean isEOF();

    long length();

    int peek();

    int read();

    int read(byte[] bArr);

    int read(byte[] bArr, int i10, int i11);

    byte[] readFully(int i10);

    void rewind(int i10);

    void seek(long j10);
}
