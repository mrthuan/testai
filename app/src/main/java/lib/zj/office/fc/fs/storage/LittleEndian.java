package lib.zj.office.fc.fs.storage;

/* loaded from: classes3.dex */
public class LittleEndian {
    public static final int BYTE_SIZE = 1;
    public static final int DOUBLE_SIZE = 8;
    public static final int INT_SIZE = 4;
    public static final int LONG_SIZE = 8;
    public static final int SHORT_SIZE = 2;

    public static int getInt(byte[] bArr, int i10) {
        int i11 = i10 + 1;
        int i12 = i11 + 1;
        return ((bArr[i12 + 1] & 255) << 24) + ((bArr[i12] & 255) << 16) + ((bArr[i11] & 255) << 8) + ((bArr[i10] & 255) << 0);
    }

    public static long getLong(byte[] bArr, int i10) {
        long j10 = 0;
        for (int i11 = (i10 + 8) - 1; i11 >= i10; i11--) {
            j10 = (j10 << 8) | (bArr[i11] & 255);
        }
        return j10;
    }

    public static short getShort(byte[] bArr, int i10) {
        return (short) (((bArr[i10 + 1] & 255) << 8) + ((bArr[i10] & 255) << 0));
    }

    public static long getUInt(byte[] bArr, int i10) {
        return getInt(bArr, i10) & 4294967295L;
    }

    public static int getUShort(byte[] bArr, int i10) {
        return ((bArr[i10 + 1] & 255) << 8) + ((bArr[i10] & 255) << 0);
    }

    public static long getUInt(byte[] bArr) {
        return getUInt(bArr, 0);
    }

    public static short getShort(byte[] bArr) {
        return getShort(bArr, 0);
    }

    public static int getUShort(byte[] bArr) {
        return getUShort(bArr, 0);
    }

    public static int getInt(byte[] bArr) {
        return getInt(bArr, 0);
    }
}
