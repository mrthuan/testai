package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.ads.AdError;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzfp extends zzfl {
    private final ContentResolver zza;
    private Uri zzb;
    private AssetFileDescriptor zzc;
    private FileInputStream zzd;
    private long zze;
    private boolean zzf;

    public zzfp(Context context) {
        super(false);
        this.zza = context.getContentResolver();
    }

    @Override // com.google.android.gms.internal.ads.zzp
    public final int zza(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.zze;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new zzfo(e10, AdError.SERVER_ERROR_CODE);
            }
        }
        FileInputStream fileInputStream = this.zzd;
        int i12 = zzet.zza;
        int read = fileInputStream.read(bArr, i10, i11);
        if (read == -1) {
            return -1;
        }
        long j11 = this.zze;
        if (j11 != -1) {
            this.zze = j11 - read;
        }
        zzg(read);
        return read;
    }

    @Override // com.google.android.gms.internal.ads.zzfs
    public final long zzb(zzfy zzfyVar) {
        int i10;
        AssetFileDescriptor openAssetFileDescriptor;
        long j10;
        try {
            try {
                Uri normalizeScheme = zzfyVar.zza.normalizeScheme();
                this.zzb = normalizeScheme;
                zzi(zzfyVar);
                if ("content".equals(normalizeScheme.getScheme())) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                    openAssetFileDescriptor = this.zza.openTypedAssetFileDescriptor(normalizeScheme, "*/*", bundle);
                } else {
                    openAssetFileDescriptor = this.zza.openAssetFileDescriptor(normalizeScheme, "r");
                }
                this.zzc = openAssetFileDescriptor;
                if (openAssetFileDescriptor != null) {
                    long length = openAssetFileDescriptor.getLength();
                    FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
                    this.zzd = fileInputStream;
                    int i11 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
                    if (i11 != 0 && zzfyVar.zze > length) {
                        throw new zzfo(null, AdError.REMOTE_ADS_SERVICE_ERROR);
                    }
                    long startOffset = openAssetFileDescriptor.getStartOffset();
                    long skip = fileInputStream.skip(zzfyVar.zze + startOffset) - startOffset;
                    if (skip == zzfyVar.zze) {
                        if (i11 == 0) {
                            FileChannel channel = fileInputStream.getChannel();
                            long size = channel.size();
                            if (size == 0) {
                                this.zze = -1L;
                                j10 = -1;
                            } else {
                                j10 = size - channel.position();
                                this.zze = j10;
                                if (j10 < 0) {
                                    throw new zzfo(null, AdError.REMOTE_ADS_SERVICE_ERROR);
                                }
                            }
                        } else {
                            j10 = length - skip;
                            this.zze = j10;
                            if (j10 < 0) {
                                throw new zzfo(null, AdError.REMOTE_ADS_SERVICE_ERROR);
                            }
                        }
                        long j11 = zzfyVar.zzf;
                        if (j11 != -1) {
                            if (j10 != -1) {
                                j11 = Math.min(j10, j11);
                            }
                            this.zze = j11;
                        }
                        this.zzf = true;
                        zzj(zzfyVar);
                        long j12 = zzfyVar.zzf;
                        if (j12 != -1) {
                            return j12;
                        }
                        return this.zze;
                    }
                    throw new zzfo(null, AdError.REMOTE_ADS_SERVICE_ERROR);
                }
                IOException iOException = new IOException("Could not open file descriptor for: ".concat(String.valueOf(normalizeScheme)));
                i10 = AdError.SERVER_ERROR_CODE;
                try {
                    throw new zzfo(iOException, AdError.SERVER_ERROR_CODE);
                } catch (IOException e10) {
                    e = e10;
                    if (true == (e instanceof FileNotFoundException)) {
                        i10 = 2005;
                    }
                    throw new zzfo(e, i10);
                }
            } catch (IOException e11) {
                e = e11;
                i10 = AdError.SERVER_ERROR_CODE;
            }
        } catch (zzfo e12) {
            throw e12;
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
                FileInputStream fileInputStream = this.zzd;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.zzd = null;
                try {
                    AssetFileDescriptor assetFileDescriptor = this.zzc;
                    if (assetFileDescriptor != null) {
                        assetFileDescriptor.close();
                    }
                } catch (IOException e10) {
                    throw new zzfo(e10, AdError.SERVER_ERROR_CODE);
                }
            } finally {
                this.zzc = null;
                if (this.zzf) {
                    this.zzf = false;
                    zzh();
                }
            }
        } catch (IOException e11) {
            throw new zzfo(e11, AdError.SERVER_ERROR_CODE);
        }
    }
}
