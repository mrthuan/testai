package lib.zj.office.fc.util;

import java.io.FilterInputStream;
import java.io.InputStream;

/* loaded from: classes3.dex */
public class CloseIgnoringInputStream extends FilterInputStream {
    public CloseIgnoringInputStream(InputStream inputStream) {
        super(inputStream);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
