package com.tom_roush.pdfbox.io;

import java.io.Closeable;

/* loaded from: classes2.dex */
public interface SequentialRead extends Closeable {
    int read();

    int read(byte[] bArr);

    int read(byte[] bArr, int i10, int i11);
}
