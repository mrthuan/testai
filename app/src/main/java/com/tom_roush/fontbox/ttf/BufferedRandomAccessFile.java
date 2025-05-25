package com.tom_roush.fontbox.ttf;

import java.io.File;
import java.io.RandomAccessFile;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;

/* loaded from: classes2.dex */
public class BufferedRandomAccessFile extends RandomAccessFile {
    private final int BUFSIZE;
    private int bufend;
    private final byte[] buffer;
    private int bufpos;
    private long realpos;

    public BufferedRandomAccessFile(String str, String str2, int i10) {
        super(str, str2);
        this.bufend = 0;
        this.bufpos = 0;
        this.realpos = 0L;
        this.BUFSIZE = i10;
        this.buffer = new byte[i10];
    }

    private int fillBuffer() {
        int read = super.read(this.buffer, 0, this.BUFSIZE);
        if (read >= 0) {
            this.realpos += read;
            this.bufend = read;
            this.bufpos = 0;
        }
        return read;
    }

    private void invalidate() {
        this.bufend = 0;
        this.bufpos = 0;
        this.realpos = super.getFilePointer();
    }

    @Override // java.io.RandomAccessFile
    public long getFilePointer() {
        return (this.realpos - this.bufend) + this.bufpos;
    }

    @Override // java.io.RandomAccessFile
    public final int read() {
        if ((this.bufpos < this.bufend || fillBuffer() >= 0) && this.bufend != 0) {
            byte[] bArr = this.buffer;
            int i10 = this.bufpos;
            this.bufpos = i10 + 1;
            return (bArr[i10] + 256) & FunctionEval.FunctionID.EXTERNAL_FUNC;
        }
        return -1;
    }

    @Override // java.io.RandomAccessFile
    public void seek(long j10) {
        int i10;
        int i11 = (int) (this.realpos - j10);
        if (i11 >= 0 && i11 <= (i10 = this.bufend)) {
            this.bufpos = i10 - i11;
            return;
        }
        super.seek(j10);
        invalidate();
    }

    @Override // java.io.RandomAccessFile
    public int read(byte[] bArr, int i10, int i11) {
        int i12 = 0;
        while (true) {
            int i13 = this.bufend;
            int i14 = this.bufpos;
            int i15 = i13 - i14;
            if (i11 <= i15) {
                System.arraycopy(this.buffer, i14, bArr, i10, i11);
                this.bufpos += i11;
                return i12 + i11;
            }
            System.arraycopy(this.buffer, i14, bArr, i10, i15);
            i12 += i15;
            this.bufpos += i15;
            if (fillBuffer() <= 0) {
                if (i12 == 0) {
                    return -1;
                }
                return i12;
            }
            i10 += i15;
            i11 -= i15;
        }
    }

    public BufferedRandomAccessFile(File file, String str, int i10) {
        super(file, str);
        this.bufend = 0;
        this.bufpos = 0;
        this.realpos = 0L;
        this.BUFSIZE = i10;
        this.buffer = new byte[i10];
    }
}
