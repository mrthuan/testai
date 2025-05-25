package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import com.adjust.sdk.network.ErrorCodes;
import com.facebook.ads.AdError;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzgj extends zzfl {
    private RandomAccessFile zza;
    private Uri zzb;
    private long zzc;
    private boolean zzd;

    public zzgj() {
        super(false);
    }

    @Override // com.google.android.gms.internal.ads.zzp
    public final int zza(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.zzc;
        if (j10 == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.zza;
            int i12 = zzet.zza;
            int read = randomAccessFile.read(bArr, i10, (int) Math.min(j10, i11));
            if (read > 0) {
                this.zzc -= read;
                zzg(read);
            }
            return read;
        } catch (IOException e10) {
            throw new zzgi(e10, AdError.SERVER_ERROR_CODE);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfs
    public final long zzb(zzfy zzfyVar) {
        boolean zzb;
        Uri uri = zzfyVar.zza;
        this.zzb = uri;
        zzi(zzfyVar);
        int i10 = AdError.INTERNAL_ERROR_2006;
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.zza = randomAccessFile;
            try {
                randomAccessFile.seek(zzfyVar.zze);
                long j10 = zzfyVar.zzf;
                if (j10 == -1) {
                    j10 = this.zza.length() - zzfyVar.zze;
                }
                this.zzc = j10;
                if (j10 >= 0) {
                    this.zzd = true;
                    zzj(zzfyVar);
                    return this.zzc;
                }
                throw new zzgi(null, null, AdError.REMOTE_ADS_SERVICE_ERROR);
            } catch (IOException e10) {
                throw new zzgi(e10, AdError.SERVER_ERROR_CODE);
            }
        } catch (FileNotFoundException e11) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                int i11 = zzet.zza;
                zzb = zzgh.zzb(e11.getCause());
                if (true != zzb) {
                    i10 = 2005;
                }
                throw new zzgi(e11, i10);
            }
            throw new zzgi(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e11, ErrorCodes.PROTOCOL_EXCEPTION);
        } catch (SecurityException e12) {
            throw new zzgi(e12, AdError.INTERNAL_ERROR_2006);
        } catch (RuntimeException e13) {
            throw new zzgi(e13, AdError.SERVER_ERROR_CODE);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfs
    public final Uri zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfs
    public final void zzd() {
        this.zzb = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.zza;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.zza = null;
                if (this.zzd) {
                    this.zzd = false;
                    zzh();
                }
            } catch (IOException e10) {
                throw new zzgi(e10, AdError.SERVER_ERROR_CODE);
            }
        } catch (Throwable th2) {
            this.zza = null;
            if (this.zzd) {
                this.zzd = false;
                zzh();
            }
            throw th2;
        }
    }
}
