package com.tom_roush.fontbox.cff;

import com.tom_roush.fontbox.util.Charsets;
import java.io.EOFException;
import java.io.IOException;

/* loaded from: classes2.dex */
public class DataInput {
    private int bufferPosition = 0;
    private byte[] inputBuffer;

    public DataInput(byte[] bArr) {
        this.inputBuffer = bArr;
    }

    private int peek(int i10) {
        try {
            return this.inputBuffer[this.bufferPosition + i10] & 255;
        } catch (RuntimeException unused) {
            return -1;
        }
    }

    private int read() {
        try {
            byte[] bArr = this.inputBuffer;
            int i10 = this.bufferPosition;
            int i11 = bArr[i10] & 255;
            this.bufferPosition = i10 + 1;
            return i11;
        } catch (RuntimeException unused) {
            return -1;
        }
    }

    public int getPosition() {
        return this.bufferPosition;
    }

    public String getString() {
        return new String(this.inputBuffer, Charsets.ISO_8859_1);
    }

    public boolean hasRemaining() {
        if (this.bufferPosition < this.inputBuffer.length) {
            return true;
        }
        return false;
    }

    public int length() {
        return this.inputBuffer.length;
    }

    public int peekUnsignedByte(int i10) {
        int peek = peek(i10);
        if (peek >= 0) {
            return peek;
        }
        throw new EOFException();
    }

    public byte readByte() {
        try {
            byte[] bArr = this.inputBuffer;
            int i10 = this.bufferPosition;
            byte b10 = bArr[i10];
            this.bufferPosition = i10 + 1;
            return b10;
        } catch (RuntimeException unused) {
            return (byte) -1;
        }
    }

    public byte[] readBytes(int i10) {
        if (i10 >= 0) {
            byte[] bArr = this.inputBuffer;
            int length = bArr.length;
            int i11 = this.bufferPosition;
            if (length - i11 >= i10) {
                byte[] bArr2 = new byte[i10];
                System.arraycopy(bArr, i11, bArr2, 0, i10);
                this.bufferPosition += i10;
                return bArr2;
            }
            throw new EOFException();
        }
        throw new IOException("length is negative");
    }

    public int readInt() {
        int read = read();
        int read2 = read();
        int read3 = read();
        int read4 = read();
        if ((read | read2 | read3 | read4) >= 0) {
            return (read << 24) | (read2 << 16) | (read3 << 8) | read4;
        }
        throw new EOFException();
    }

    public short readShort() {
        return (short) readUnsignedShort();
    }

    public int readUnsignedByte() {
        int read = read();
        if (read >= 0) {
            return read;
        }
        throw new EOFException();
    }

    public int readUnsignedShort() {
        int read = read();
        int read2 = read();
        if ((read | read2) >= 0) {
            return (read << 8) | read2;
        }
        throw new EOFException();
    }

    public void setPosition(int i10) {
        this.bufferPosition = i10;
    }
}
