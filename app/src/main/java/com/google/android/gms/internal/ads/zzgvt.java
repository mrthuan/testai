package com.google.android.gms.internal.ads;

import java.io.FilterInputStream;
import java.io.InputStream;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
final class zzgvt extends FilterInputStream {
    private int zza;

    public zzgvt(InputStream inputStream, int i10) {
        super(inputStream);
        this.zza = i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        return Math.min(super.available(), this.zza);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        if (this.zza <= 0) {
            return -1;
        }
        int read = super.read();
        if (read >= 0) {
            this.zza--;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j10) {
        int skip = (int) super.skip(Math.min(j10, this.zza));
        if (skip >= 0) {
            this.zza -= skip;
        }
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) {
        int i12 = this.zza;
        if (i12 <= 0) {
            return -1;
        }
        int read = super.read(bArr, i10, Math.min(i11, i12));
        if (read >= 0) {
            this.zza -= read;
        }
        return read;
    }
}
