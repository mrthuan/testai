package r1;

import java.io.RandomAccessFile;
import java.util.zip.ZipException;

/* compiled from: ZipUtil.java */
/* loaded from: classes.dex */
public final class c {

    /* compiled from: ZipUtil.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public long f29433a;

        /* renamed from: b  reason: collision with root package name */
        public long f29434b;
    }

    public static a a(RandomAccessFile randomAccessFile) {
        long length = randomAccessFile.length() - 22;
        long j10 = 0;
        if (length >= 0) {
            long j11 = length - 65536;
            if (j11 >= 0) {
                j10 = j11;
            }
            int reverseBytes = Integer.reverseBytes(101010256);
            do {
                randomAccessFile.seek(length);
                if (randomAccessFile.readInt() == reverseBytes) {
                    randomAccessFile.skipBytes(2);
                    randomAccessFile.skipBytes(2);
                    randomAccessFile.skipBytes(2);
                    randomAccessFile.skipBytes(2);
                    a aVar = new a();
                    aVar.f29434b = Integer.reverseBytes(randomAccessFile.readInt()) & 4294967295L;
                    aVar.f29433a = Integer.reverseBytes(randomAccessFile.readInt()) & 4294967295L;
                    return aVar;
                }
                length--;
            } while (length >= j10);
            throw new ZipException("End Of Central Directory signature not found");
        }
        throw new ZipException("File too short to be a zip file: " + randomAccessFile.length());
    }
}
