package lib.zj.office.fc.util;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.util.zip.CRC32;

/* loaded from: classes3.dex */
public final class IOUtils {
    private static final POILogger logger = POILogFactory.getLogger(IOUtils.class);

    private IOUtils() {
    }

    public static long calculateChecksum(byte[] bArr) {
        CRC32 crc32 = new CRC32();
        crc32.update(bArr, 0, bArr.length);
        return crc32.getValue();
    }

    public static void closeQuietly(Closeable closeable) {
        try {
            closeable.close();
        } catch (Exception e10) {
            POILogger pOILogger = logger;
            int i10 = POILogger.ERROR;
            pOILogger.log(i10, (Object) ("Unable to close resource: " + e10), (Throwable) e10);
        }
    }

    public static void copy(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[4096];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                if (read > 0) {
                    outputStream.write(bArr, 0, read);
                }
            } else {
                return;
            }
        }
    }

    public static int readFully(InputStream inputStream, byte[] bArr) {
        return readFully(inputStream, bArr, 0, bArr.length);
    }

    public static byte[] toByteArray(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[4096];
        int i10 = 0;
        while (i10 != -1) {
            i10 = inputStream.read(bArr);
            if (i10 > 0) {
                byteArrayOutputStream.write(bArr, 0, i10);
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static int readFully(InputStream inputStream, byte[] bArr, int i10, int i11) {
        int i12 = 0;
        do {
            int read = inputStream.read(bArr, i10 + i12, i11 - i12);
            if (read < 0) {
                if (i12 == 0) {
                    return -1;
                }
                return i12;
            }
            i12 += read;
        } while (i12 != i11);
        return i12;
    }

    public static int readFully(ReadableByteChannel readableByteChannel, ByteBuffer byteBuffer) {
        int i10 = 0;
        do {
            int read = readableByteChannel.read(byteBuffer);
            if (read >= 0) {
                i10 += read;
                if (i10 == byteBuffer.capacity()) {
                    break;
                }
            } else if (i10 == 0) {
                return -1;
            } else {
                return i10;
            }
        } while (byteBuffer.position() != byteBuffer.capacity());
        return i10;
    }

    public static byte[] toByteArray(ByteBuffer byteBuffer, int i10) {
        if (byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            return byteBuffer.array();
        }
        byte[] bArr = new byte[i10];
        byteBuffer.get(bArr);
        return bArr;
    }
}
