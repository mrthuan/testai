package com.bykv.vk.openvk.component.video.Qhi.cJ;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* compiled from: RandomAccessFileWrapper.java */
/* loaded from: classes.dex */
class hm {
    private final RandomAccessFile Qhi;

    /* compiled from: RandomAccessFileWrapper.java */
    /* loaded from: classes.dex */
    public static class Qhi extends Exception {
        public Qhi(Throwable th2) {
            super(th2);
        }
    }

    public hm(File file, String str) {
        try {
            this.Qhi = new RandomAccessFile(file, str);
        } catch (FileNotFoundException e10) {
            throw new Qhi(e10);
        }
    }

    public void Qhi(long j10) {
        try {
            this.Qhi.seek(j10);
        } catch (IOException e10) {
            throw new Qhi(e10);
        }
    }

    public void Qhi(byte[] bArr, int i10, int i11) {
        try {
            this.Qhi.write(bArr, i10, i11);
        } catch (IOException e10) {
            throw new Qhi(e10);
        }
    }

    public int Qhi(byte[] bArr) {
        try {
            return this.Qhi.read(bArr);
        } catch (IOException e10) {
            throw new Qhi(e10);
        }
    }

    public void Qhi() {
        com.bykv.vk.openvk.component.video.Qhi.ac.Qhi.Qhi(this.Qhi);
    }
}
