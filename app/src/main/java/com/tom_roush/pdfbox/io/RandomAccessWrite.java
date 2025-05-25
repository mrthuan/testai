package com.tom_roush.pdfbox.io;

import java.io.Closeable;

/* loaded from: classes2.dex */
public interface RandomAccessWrite extends Closeable {
    void clear();

    void write(int i10);

    void write(byte[] bArr);

    void write(byte[] bArr, int i10, int i11);
}
