package com.tom_roush.harmony.javax.imageio.stream;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.nio.ByteOrder;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;

/* loaded from: classes2.dex */
public abstract class ImageOutputStreamImpl extends ImageInputStreamImpl implements ImageOutputStream {
    private final byte[] buff = new byte[8];

    public final void flushBits() {
        int i10;
        checkClosed();
        int i11 = this.bitOffset;
        if (i11 == 0) {
            return;
        }
        int read = read();
        if (read == -1) {
            i10 = 0;
            this.bitOffset = 0;
        } else {
            seek(getStreamPosition() - 1);
            i10 = ((-1) << (8 - i11)) & read;
        }
        write(i10);
    }

    @Override // com.tom_roush.harmony.javax.imageio.stream.ImageOutputStream, java.io.DataOutput
    public abstract void write(int i10);

    @Override // com.tom_roush.harmony.javax.imageio.stream.ImageOutputStream, java.io.DataOutput
    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // com.tom_roush.harmony.javax.imageio.stream.ImageOutputStream, java.io.DataOutput
    public abstract void write(byte[] bArr, int i10, int i11);

    @Override // com.tom_roush.harmony.javax.imageio.stream.ImageOutputStream
    public void writeBit(int i10) {
        writeBits(i10, 1);
    }

    @Override // com.tom_roush.harmony.javax.imageio.stream.ImageOutputStream
    public void writeBits(long j10, int i10) {
        int i11;
        int i12;
        checkClosed();
        int i13 = this.bitOffset;
        if (i13 > 0) {
            int read = read();
            if (read == -1) {
                read = 0;
            } else {
                seek(getStreamPosition() - 1);
            }
            int i14 = 8 - i13;
            if (i10 >= i14) {
                i10 -= i14;
                write((int) ((read & (~i12)) | ((j10 >> i10) & ((-1) >>> (32 - i14)))));
            } else {
                int i15 = i13 + i10;
                int i16 = 8 - i15;
                write((int) ((read & (~(i11 << i16))) | ((((-1) >>> i10) & j10) << i16)));
                seek(getStreamPosition() - 1);
                this.bitOffset = i15;
                i10 = 0;
            }
        }
        while (i10 > 7) {
            write((int) ((j10 >> (i10 - 8)) & ((long) FunctionEval.FunctionID.EXTERNAL_FUNC)));
            i10 -= 8;
        }
        if (i10 > 0) {
            write((int) ((j10 << (8 - i10)) & ((long) FunctionEval.FunctionID.EXTERNAL_FUNC)));
            seek(getStreamPosition() - 1);
            this.bitOffset = i10;
        }
    }

    @Override // com.tom_roush.harmony.javax.imageio.stream.ImageOutputStream, java.io.DataOutput
    public void writeBoolean(boolean z10) {
        write(z10 ? 1 : 0);
    }

    @Override // com.tom_roush.harmony.javax.imageio.stream.ImageOutputStream, java.io.DataOutput
    public void writeByte(int i10) {
        write(i10);
    }

    @Override // com.tom_roush.harmony.javax.imageio.stream.ImageOutputStream, java.io.DataOutput
    public void writeBytes(String str) {
        write(str.getBytes());
    }

    @Override // com.tom_roush.harmony.javax.imageio.stream.ImageOutputStream, java.io.DataOutput
    public void writeChar(int i10) {
        writeShort(i10);
    }

    @Override // com.tom_roush.harmony.javax.imageio.stream.ImageOutputStream, java.io.DataOutput
    public void writeChars(String str) {
        char[] charArray = str.toCharArray();
        writeChars(charArray, 0, charArray.length);
    }

    @Override // com.tom_roush.harmony.javax.imageio.stream.ImageOutputStream, java.io.DataOutput
    public void writeDouble(double d10) {
        writeLong(Double.doubleToLongBits(d10));
    }

    @Override // com.tom_roush.harmony.javax.imageio.stream.ImageOutputStream
    public void writeDoubles(double[] dArr, int i10, int i11) {
        if (i10 >= 0 && i11 >= 0 && i10 + i11 <= dArr.length) {
            for (int i12 = 0; i12 < i11; i12++) {
                writeDouble(dArr[i10 + i12]);
            }
            return;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // com.tom_roush.harmony.javax.imageio.stream.ImageOutputStream, java.io.DataOutput
    public void writeFloat(float f10) {
        writeInt(Float.floatToIntBits(f10));
    }

    @Override // com.tom_roush.harmony.javax.imageio.stream.ImageOutputStream
    public void writeFloats(float[] fArr, int i10, int i11) {
        if (i10 >= 0 && i11 >= 0 && i10 + i11 <= fArr.length) {
            for (int i12 = 0; i12 < i11; i12++) {
                writeFloat(fArr[i10 + i12]);
            }
            return;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // com.tom_roush.harmony.javax.imageio.stream.ImageOutputStream, java.io.DataOutput
    public void writeInt(int i10) {
        if (this.byteOrder == ByteOrder.BIG_ENDIAN) {
            byte[] bArr = this.buff;
            bArr[0] = (byte) (i10 >> 24);
            bArr[1] = (byte) (i10 >> 16);
            bArr[2] = (byte) (i10 >> 8);
            bArr[3] = (byte) i10;
        } else {
            byte[] bArr2 = this.buff;
            bArr2[3] = (byte) (i10 >> 24);
            bArr2[2] = (byte) (i10 >> 16);
            bArr2[1] = (byte) (i10 >> 8);
            bArr2[0] = (byte) i10;
        }
        write(this.buff, 0, 4);
    }

    @Override // com.tom_roush.harmony.javax.imageio.stream.ImageOutputStream
    public void writeInts(int[] iArr, int i10, int i11) {
        if (i10 >= 0 && i11 >= 0 && i10 + i11 <= iArr.length) {
            for (int i12 = 0; i12 < i11; i12++) {
                writeInt(iArr[i10 + i12]);
            }
            return;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // com.tom_roush.harmony.javax.imageio.stream.ImageOutputStream, java.io.DataOutput
    public void writeLong(long j10) {
        if (this.byteOrder == ByteOrder.BIG_ENDIAN) {
            byte[] bArr = this.buff;
            bArr[0] = (byte) (j10 >> 56);
            bArr[1] = (byte) (j10 >> 48);
            bArr[2] = (byte) (j10 >> 40);
            bArr[3] = (byte) (j10 >> 32);
            bArr[4] = (byte) (j10 >> 24);
            bArr[5] = (byte) (j10 >> 16);
            bArr[6] = (byte) (j10 >> 8);
            bArr[7] = (byte) j10;
        } else {
            byte[] bArr2 = this.buff;
            bArr2[7] = (byte) (j10 >> 56);
            bArr2[6] = (byte) (j10 >> 48);
            bArr2[5] = (byte) (j10 >> 40);
            bArr2[4] = (byte) (j10 >> 32);
            bArr2[3] = (byte) (j10 >> 24);
            bArr2[2] = (byte) (j10 >> 16);
            bArr2[1] = (byte) (j10 >> 8);
            bArr2[0] = (byte) j10;
        }
        write(this.buff, 0, 8);
    }

    @Override // com.tom_roush.harmony.javax.imageio.stream.ImageOutputStream
    public void writeLongs(long[] jArr, int i10, int i11) {
        if (i10 >= 0 && i11 >= 0 && i10 + i11 <= jArr.length) {
            for (int i12 = 0; i12 < i11; i12++) {
                writeLong(jArr[i10 + i12]);
            }
            return;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // com.tom_roush.harmony.javax.imageio.stream.ImageOutputStream, java.io.DataOutput
    public void writeShort(int i10) {
        if (this.byteOrder == ByteOrder.BIG_ENDIAN) {
            byte[] bArr = this.buff;
            bArr[0] = (byte) (i10 >> 8);
            bArr[1] = (byte) i10;
        } else {
            byte[] bArr2 = this.buff;
            bArr2[1] = (byte) (i10 >> 8);
            bArr2[0] = (byte) i10;
        }
        write(this.buff, 0, 2);
    }

    @Override // com.tom_roush.harmony.javax.imageio.stream.ImageOutputStream
    public void writeShorts(short[] sArr, int i10, int i11) {
        if (i10 >= 0 && i11 >= 0 && i10 + i11 <= sArr.length) {
            for (int i12 = 0; i12 < i11; i12++) {
                writeShort(sArr[i10 + i12]);
            }
            return;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // com.tom_roush.harmony.javax.imageio.stream.ImageOutputStream, java.io.DataOutput
    public void writeUTF(String str) {
        ByteOrder byteOrder = getByteOrder();
        setByteOrder(ByteOrder.BIG_ENDIAN);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        new DataOutputStream(byteArrayOutputStream).writeUTF(str);
        write(byteArrayOutputStream.toByteArray(), 0, byteArrayOutputStream.size());
        setByteOrder(byteOrder);
    }

    @Override // com.tom_roush.harmony.javax.imageio.stream.ImageOutputStream
    public void writeChars(char[] cArr, int i10, int i11) {
        if (i10 < 0 || i11 < 0 || i10 + i11 > cArr.length) {
            throw new IndexOutOfBoundsException();
        }
        for (int i12 = 0; i12 < i11; i12++) {
            writeShort(cArr[i10 + i12]);
        }
    }
}
