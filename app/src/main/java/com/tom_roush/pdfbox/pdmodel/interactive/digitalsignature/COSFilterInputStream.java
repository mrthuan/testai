package com.tom_roush.pdfbox.pdmodel.interactive.digitalsignature;

import com.tom_roush.pdfbox.io.IOUtils;
import java.io.ByteArrayInputStream;
import java.io.FilterInputStream;
import java.io.InputStream;

/* loaded from: classes2.dex */
public class COSFilterInputStream extends FilterInputStream {
    private long position;
    private int range;
    private int[][] ranges;

    public COSFilterInputStream(InputStream inputStream, int[] iArr) {
        super(inputStream);
        this.position = 0L;
        calculateRanges(iArr);
    }

    private void calculateRanges(int[] iArr) {
        this.ranges = new int[iArr.length / 2];
        for (int i10 = 0; i10 < iArr.length / 2; i10++) {
            int[][] iArr2 = this.ranges;
            int i11 = i10 * 2;
            int i12 = iArr[i11];
            iArr2[i10] = new int[]{i12, iArr[i11 + 1] + i12};
        }
        this.range = -1;
    }

    private long getRemaining() {
        return this.ranges[this.range][1] - this.position;
    }

    private boolean nextRange() {
        int i10 = this.range;
        if (i10 + 1 >= this.ranges.length) {
            return false;
        }
        this.range = i10 + 1;
        while (true) {
            long j10 = this.position;
            int i11 = this.ranges[this.range][0];
            if (j10 >= i11) {
                return true;
            }
            this.position += super.skip(i11 - j10);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        if ((this.range == -1 || getRemaining() <= 0) && !nextRange()) {
            return -1;
        }
        int read = super.read();
        this.position++;
        return read;
    }

    public byte[] toByteArray() {
        return IOUtils.toByteArray(this);
    }

    public COSFilterInputStream(byte[] bArr, int[] iArr) {
        this(new ByteArrayInputStream(bArr), iArr);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        if ((this.range == -1 || getRemaining() <= 0) && !nextRange()) {
            return -1;
        }
        int read = super.read(bArr, i10, (int) Math.min(i11, getRemaining()));
        this.position += read;
        return read;
    }
}
