package lib.zj.office.fc.util;

import java.io.IOException;
import java.io.InputStream;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;

/* loaded from: classes3.dex */
public class LittleEndian implements LittleEndianConsts {

    /* loaded from: classes3.dex */
    public static final class BufferUnderrunException extends IOException {
        public BufferUnderrunException() {
            super("buffer underrun");
        }
    }

    private LittleEndian() {
    }

    public static byte[] getByteArray(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return bArr2;
    }

    public static double getDouble(byte[] bArr, int i10) {
        return Double.longBitsToDouble(getLong(bArr, i10));
    }

    public static float getFloat(byte[] bArr, int i10) {
        return Float.intBitsToFloat(getInt(bArr, i10));
    }

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

    public static int getUnsignedByte(byte[] bArr, int i10) {
        return bArr[i10] & 255;
    }

    public static void putByte(byte[] bArr, int i10, int i11) {
        bArr[i10] = (byte) i11;
    }

    public static void putDouble(byte[] bArr, int i10, double d10) {
        putLong(bArr, i10, Double.doubleToLongBits(d10));
    }

    public static void putInt(byte[] bArr, int i10, int i11) {
        int i12 = i10 + 1;
        bArr[i10] = (byte) ((i11 >>> 0) & FunctionEval.FunctionID.EXTERNAL_FUNC);
        int i13 = i12 + 1;
        bArr[i12] = (byte) ((i11 >>> 8) & FunctionEval.FunctionID.EXTERNAL_FUNC);
        bArr[i13] = (byte) ((i11 >>> 16) & FunctionEval.FunctionID.EXTERNAL_FUNC);
        bArr[i13 + 1] = (byte) ((i11 >>> 24) & FunctionEval.FunctionID.EXTERNAL_FUNC);
    }

    public static void putLong(byte[] bArr, int i10, long j10) {
        int i11 = i10 + 8;
        while (i10 < i11) {
            bArr[i10] = (byte) (255 & j10);
            j10 >>= 8;
            i10++;
        }
    }

    public static void putShort(byte[] bArr, int i10, short s4) {
        bArr[i10] = (byte) ((s4 >>> 0) & FunctionEval.FunctionID.EXTERNAL_FUNC);
        bArr[i10 + 1] = (byte) ((s4 >>> 8) & FunctionEval.FunctionID.EXTERNAL_FUNC);
    }

    public static void putUShort(byte[] bArr, int i10, int i11) {
        bArr[i10] = (byte) ((i11 >>> 0) & FunctionEval.FunctionID.EXTERNAL_FUNC);
        bArr[i10 + 1] = (byte) ((i11 >>> 8) & FunctionEval.FunctionID.EXTERNAL_FUNC);
    }

    public static int readInt(InputStream inputStream) {
        int read = inputStream.read();
        int read2 = inputStream.read();
        int read3 = inputStream.read();
        int read4 = inputStream.read();
        if ((read | read2 | read3 | read4) >= 0) {
            return (read4 << 24) + (read3 << 16) + (read2 << 8) + (read << 0);
        }
        throw new BufferUnderrunException();
    }

    public static long readLong(InputStream inputStream) {
        int read = inputStream.read();
        int read2 = inputStream.read();
        int read3 = inputStream.read();
        int read4 = inputStream.read();
        int read5 = inputStream.read();
        int read6 = inputStream.read();
        int read7 = inputStream.read();
        int read8 = inputStream.read();
        if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) >= 0) {
            return (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8) + (read << 0);
        }
        throw new BufferUnderrunException();
    }

    public static short readShort(InputStream inputStream) {
        return (short) readUShort(inputStream);
    }

    public static int readUShort(InputStream inputStream) {
        int read = inputStream.read();
        int read2 = inputStream.read();
        if ((read | read2) >= 0) {
            return (read2 << 8) + (read << 0);
        }
        throw new BufferUnderrunException();
    }

    public static int ubyteToInt(byte b10) {
        return b10 & 255;
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

    public static void putShort(byte[] bArr, short s4) {
        putShort(bArr, 0, s4);
    }

    public static int getInt(byte[] bArr) {
        return getInt(bArr, 0);
    }

    public static void putInt(byte[] bArr, int i10) {
        putInt(bArr, 0, i10);
    }
}
