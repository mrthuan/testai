package kk;

import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;
import okio.ByteString;

/* compiled from: BufferedSource.kt */
/* loaded from: classes3.dex */
public interface h extends y, ReadableByteChannel {
    boolean E();

    long H(ByteString byteString);

    String J(long j10);

    boolean N(long j10, ByteString byteString);

    String O(Charset charset);

    boolean S(long j10);

    String V();

    int X(p pVar);

    ByteString e(long j10);

    void g0(long j10);

    long j0();

    byte readByte();

    int readInt();

    short readShort();

    void skip(long j10);

    f y();
}
