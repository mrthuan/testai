package p4;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ByteBufferUtil.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f23684a = 0;

    /* compiled from: ByteBufferUtil.java */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f23687a;

        /* renamed from: b  reason: collision with root package name */
        public final int f23688b;
        public final byte[] c;

        public b(byte[] bArr, int i10, int i11) {
            this.c = bArr;
            this.f23687a = i10;
            this.f23688b = i11;
        }
    }

    static {
        new AtomicReference();
    }

    public static MappedByteBuffer a(File file) {
        RandomAccessFile randomAccessFile;
        Throwable th2;
        FileChannel fileChannel;
        FileChannel fileChannel2 = null;
        try {
            long length = file.length();
            if (length <= 2147483647L) {
                if (length != 0) {
                    randomAccessFile = new RandomAccessFile(file, "r");
                    try {
                        fileChannel = randomAccessFile.getChannel();
                    } catch (Throwable th3) {
                        th2 = th3;
                        fileChannel = null;
                    }
                    try {
                        MappedByteBuffer load = fileChannel.map(FileChannel.MapMode.READ_ONLY, 0L, length).load();
                        try {
                            fileChannel.close();
                        } catch (IOException unused) {
                        }
                        try {
                            randomAccessFile.close();
                        } catch (IOException unused2) {
                        }
                        return load;
                    } catch (Throwable th4) {
                        th2 = th4;
                        Throwable th5 = th2;
                        fileChannel2 = fileChannel;
                        th = th5;
                        if (fileChannel2 != null) {
                            try {
                                fileChannel2.close();
                            } catch (IOException unused3) {
                            }
                        }
                        if (randomAccessFile != null) {
                            try {
                                randomAccessFile.close();
                            } catch (IOException unused4) {
                            }
                        }
                        throw th;
                    }
                }
                throw new IOException("File unsuitable for memory mapping");
            }
            throw new IOException("File too large to map into memory");
        } catch (Throwable th6) {
            th = th6;
            randomAccessFile = null;
        }
    }

    public static void b(ByteBuffer byteBuffer, File file) {
        RandomAccessFile randomAccessFile;
        byteBuffer.position(0);
        FileChannel fileChannel = null;
        try {
            randomAccessFile = new RandomAccessFile(file, "rw");
        } catch (Throwable th2) {
            th = th2;
            randomAccessFile = null;
        }
        try {
            fileChannel = randomAccessFile.getChannel();
            fileChannel.write(byteBuffer);
            fileChannel.force(false);
            fileChannel.close();
            randomAccessFile.close();
            try {
                fileChannel.close();
            } catch (IOException unused) {
            }
            try {
                randomAccessFile.close();
            } catch (IOException unused2) {
            }
        } catch (Throwable th3) {
            th = th3;
            if (fileChannel != null) {
                try {
                    fileChannel.close();
                } catch (IOException unused3) {
                }
            }
            if (randomAccessFile != null) {
                try {
                    randomAccessFile.close();
                } catch (IOException unused4) {
                }
            }
            throw th;
        }
    }

    /* compiled from: ByteBufferUtil.java */
    /* renamed from: p4.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0324a extends InputStream {

        /* renamed from: a  reason: collision with root package name */
        public final ByteBuffer f23685a;

        /* renamed from: b  reason: collision with root package name */
        public int f23686b = -1;

        public C0324a(ByteBuffer byteBuffer) {
            this.f23685a = byteBuffer;
        }

        @Override // java.io.InputStream
        public final int available() {
            return this.f23685a.remaining();
        }

        @Override // java.io.InputStream
        public final synchronized void mark(int i10) {
            this.f23686b = this.f23685a.position();
        }

        @Override // java.io.InputStream
        public final boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public final int read() {
            ByteBuffer byteBuffer = this.f23685a;
            if (byteBuffer.hasRemaining()) {
                return byteBuffer.get() & 255;
            }
            return -1;
        }

        @Override // java.io.InputStream
        public final synchronized void reset() {
            int i10 = this.f23686b;
            if (i10 != -1) {
                this.f23685a.position(i10);
            } else {
                throw new IOException("Cannot reset to unset mark position");
            }
        }

        @Override // java.io.InputStream
        public final long skip(long j10) {
            ByteBuffer byteBuffer = this.f23685a;
            if (!byteBuffer.hasRemaining()) {
                return -1L;
            }
            long min = Math.min(j10, available());
            byteBuffer.position((int) (byteBuffer.position() + min));
            return min;
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i10, int i11) {
            ByteBuffer byteBuffer = this.f23685a;
            if (byteBuffer.hasRemaining()) {
                int min = Math.min(i11, available());
                byteBuffer.get(bArr, i10, min);
                return min;
            }
            return -1;
        }
    }
}
