package lib.zj.office.fc.poifs.nio;

import java.io.OutputStream;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public abstract class DataSource {
    public abstract void close();

    public abstract void copyTo(OutputStream outputStream);

    public abstract ByteBuffer read(int i10, long j10);

    public abstract long size();

    public abstract void write(ByteBuffer byteBuffer, long j10);
}
