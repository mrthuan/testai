package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import com.facebook.ads.AdError;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import lib.zj.office.fc.openxml4j.opc.PackagingURIHelper;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzfk extends zzfl {
    private final AssetManager zza;
    private Uri zzb;
    private InputStream zzc;
    private long zzd;
    private boolean zze;

    public zzfk(Context context) {
        super(false);
        this.zza = context.getAssets();
    }

    @Override // com.google.android.gms.internal.ads.zzp
    public final int zza(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.zzd;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new zzfj(e10, AdError.SERVER_ERROR_CODE);
            }
        }
        InputStream inputStream = this.zzc;
        int i12 = zzet.zza;
        int read = inputStream.read(bArr, i10, i11);
        if (read == -1) {
            return -1;
        }
        long j11 = this.zzd;
        if (j11 != -1) {
            this.zzd = j11 - read;
        }
        zzg(read);
        return read;
    }

    @Override // com.google.android.gms.internal.ads.zzfs
    public final long zzb(zzfy zzfyVar) {
        int i10;
        try {
            Uri uri = zzfyVar.zza;
            this.zzb = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith(PackagingURIHelper.FORWARD_SLASH_STRING)) {
                path = path.substring(1);
            }
            zzi(zzfyVar);
            InputStream open = this.zza.open(path, 1);
            this.zzc = open;
            if (open.skip(zzfyVar.zze) >= zzfyVar.zze) {
                long j10 = zzfyVar.zzf;
                if (j10 != -1) {
                    this.zzd = j10;
                } else {
                    long available = this.zzc.available();
                    this.zzd = available;
                    if (available == 2147483647L) {
                        this.zzd = -1L;
                    }
                }
                this.zze = true;
                zzj(zzfyVar);
                return this.zzd;
            }
            throw new zzfj(null, AdError.REMOTE_ADS_SERVICE_ERROR);
        } catch (zzfj e10) {
            throw e10;
        } catch (IOException e11) {
            if (true != (e11 instanceof FileNotFoundException)) {
                i10 = AdError.SERVER_ERROR_CODE;
            } else {
                i10 = 2005;
            }
            throw new zzfj(e11, i10);
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
                InputStream inputStream = this.zzc;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.zzc = null;
                if (this.zze) {
                    this.zze = false;
                    zzh();
                }
            } catch (IOException e10) {
                throw new zzfj(e10, AdError.SERVER_ERROR_CODE);
            }
        } catch (Throwable th2) {
            this.zzc = null;
            if (this.zze) {
                this.zze = false;
                zzh();
            }
            throw th2;
        }
    }
}
