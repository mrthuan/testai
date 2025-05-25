package com.tom_roush.pdfbox.pdfparser;

import java.io.Closeable;

/* loaded from: classes2.dex */
interface SequentialSource extends Closeable {
    long getPosition();

    boolean isEOF();

    int peek();

    int read();

    int read(byte[] bArr);

    int read(byte[] bArr, int i10, int i11);

    byte[] readFully(int i10);

    void unread(int i10);

    void unread(byte[] bArr);

    void unread(byte[] bArr, int i10, int i11);
}
