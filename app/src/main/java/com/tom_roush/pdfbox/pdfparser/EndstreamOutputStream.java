package com.tom_roush.pdfbox.pdfparser;

import java.io.BufferedOutputStream;
import java.io.OutputStream;

/* loaded from: classes2.dex */
class EndstreamOutputStream extends BufferedOutputStream {
    private boolean hasCR;
    private boolean hasLF;
    private boolean mustFilter;
    private int pos;

    public EndstreamOutputStream(OutputStream outputStream) {
        super(outputStream);
        this.hasCR = false;
        this.hasLF = false;
        this.pos = 0;
        this.mustFilter = true;
    }

    @Override // java.io.BufferedOutputStream, java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public synchronized void flush() {
        if (this.hasCR && !this.hasLF) {
            super.write(13);
            this.pos++;
        }
        this.hasCR = false;
        this.hasLF = false;
        super.flush();
    }

    @Override // java.io.BufferedOutputStream, java.io.FilterOutputStream, java.io.OutputStream
    public synchronized void write(byte[] bArr, int i10, int i11) {
        if (this.pos == 0 && i11 > 10) {
            this.mustFilter = false;
            for (int i12 = 0; i12 < 10; i12++) {
                byte b10 = bArr[i12];
                if (b10 >= 9 && (b10 <= 10 || b10 >= 32 || b10 == 13)) {
                }
                this.mustFilter = true;
                break;
            }
        }
        if (this.mustFilter) {
            if (this.hasCR) {
                this.hasCR = false;
                if (!this.hasLF && i11 == 1 && bArr[i10] == 10) {
                    return;
                }
                super.write(13);
            }
            if (this.hasLF) {
                super.write(10);
                this.hasLF = false;
            }
            if (i11 > 0) {
                byte b11 = bArr[(i10 + i11) - 1];
                if (b11 == 13) {
                    this.hasCR = true;
                } else if (b11 == 10) {
                    this.hasLF = true;
                    i11--;
                    if (i11 > 0 && bArr[(i10 + i11) - 1] == 13) {
                        this.hasCR = true;
                    }
                }
                i11--;
            }
        }
        super.write(bArr, i10, i11);
        this.pos += i11;
    }
}
