package com.apm.insight.k;

import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes.dex */
public class m extends GZIPOutputStream {
    public m(OutputStream outputStream) {
        super(outputStream);
    }

    public void a() {
        super.close();
    }

    public void b() {
        super.finish();
    }

    @Override // java.util.zip.DeflaterOutputStream, java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // java.util.zip.GZIPOutputStream, java.util.zip.DeflaterOutputStream
    public void finish() {
    }
}
