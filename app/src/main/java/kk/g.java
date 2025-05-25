package kk;

import java.nio.channels.WritableByteChannel;
import okio.ByteString;

/* compiled from: BufferedSink.kt */
/* loaded from: classes3.dex */
public interface g extends w, WritableByteChannel {
    g I();

    g K(String str);

    long M(y yVar);

    g P(long j10);

    g Z(ByteString byteString);

    g e0(int i10, int i11, byte[] bArr);

    @Override // kk.w, java.io.Flushable
    void flush();

    g h0(long j10);

    g write(byte[] bArr);

    g writeByte(int i10);

    g writeInt(int i10);

    g writeShort(int i10);

    f y();
}
