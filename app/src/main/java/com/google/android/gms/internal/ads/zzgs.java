package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import com.adjust.sdk.network.ErrorCodes;
import com.facebook.ads.AdError;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.util.List;
import lib.zj.office.fc.openxml4j.opc.PackagingURIHelper;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzgs extends zzfl {
    private final Context zza;
    private zzfy zzb;
    private AssetFileDescriptor zzc;
    private InputStream zzd;
    private long zze;
    private boolean zzf;

    public zzgs(Context context) {
        super(false);
        this.zza = context.getApplicationContext();
    }

    @Deprecated
    public static Uri buildRawResourceUri(int i10) {
        return Uri.parse("rawresource:///" + i10);
    }

    private static int zzk(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            throw new zzgr("Resource identifier must be an integer.", null, ErrorCodes.PROTOCOL_EXCEPTION);
        }
    }

    private static AssetFileDescriptor zzl(Context context, zzfy zzfyVar) {
        String host;
        Resources resourcesForApplication;
        int identifier;
        Uri normalizeScheme = zzfyVar.zza.normalizeScheme();
        if (TextUtils.equals("rawresource", normalizeScheme.getScheme())) {
            resourcesForApplication = context.getResources();
            List<String> pathSegments = normalizeScheme.getPathSegments();
            if (pathSegments.size() == 1) {
                identifier = zzk(pathSegments.get(0));
            } else {
                throw new zzgr(b.a.c("rawresource:// URI must have exactly one path element, found ", pathSegments.size()));
            }
        } else if (TextUtils.equals("android.resource", normalizeScheme.getScheme())) {
            String path = normalizeScheme.getPath();
            path.getClass();
            if (path.startsWith(PackagingURIHelper.FORWARD_SLASH_STRING)) {
                path = path.substring(1);
            }
            if (TextUtils.isEmpty(normalizeScheme.getHost())) {
                host = context.getPackageName();
            } else {
                host = normalizeScheme.getHost();
            }
            if (host.equals(context.getPackageName())) {
                resourcesForApplication = context.getResources();
            } else {
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication(host);
                } catch (PackageManager.NameNotFoundException e10) {
                    throw new zzgr("Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", e10, 2005);
                }
            }
            if (path.matches("\\d+")) {
                identifier = zzk(path);
            } else {
                identifier = resourcesForApplication.getIdentifier(androidx.activity.f.m(host, ":", path), "raw", null);
                if (identifier == 0) {
                    throw new zzgr("Resource not found.", null, 2005);
                }
            }
        } else {
            throw new zzgr(a6.h.d("Unsupported URI scheme (", normalizeScheme.getScheme(), "). Only android.resource is supported."), null, ErrorCodes.PROTOCOL_EXCEPTION);
        }
        try {
            AssetFileDescriptor openRawResourceFd = resourcesForApplication.openRawResourceFd(identifier);
            if (openRawResourceFd != null) {
                return openRawResourceFd;
            }
            throw new zzgr("Resource is compressed: ".concat(String.valueOf(normalizeScheme)), null, AdError.SERVER_ERROR_CODE);
        } catch (Resources.NotFoundException e11) {
            throw new zzgr(null, e11, 2005);
        }
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
                throw new zzgr(null, e10, AdError.SERVER_ERROR_CODE);
            }
        }
        InputStream inputStream = this.zzd;
        int i12 = zzet.zza;
        int read = inputStream.read(bArr, i10, i11);
        if (read == -1) {
            if (this.zze == -1) {
                return -1;
            }
            throw new zzgr("End of stream reached having not read sufficient data.", new EOFException(), AdError.SERVER_ERROR_CODE);
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
        long j10;
        this.zzb = zzfyVar;
        zzi(zzfyVar);
        AssetFileDescriptor zzl = zzl(this.zza, zzfyVar);
        this.zzc = zzl;
        long length = zzl.getLength();
        FileInputStream fileInputStream = new FileInputStream(this.zzc.getFileDescriptor());
        this.zzd = fileInputStream;
        int i10 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
        if (i10 != 0) {
            try {
                if (zzfyVar.zze > length) {
                    throw new zzgr(null, null, AdError.REMOTE_ADS_SERVICE_ERROR);
                }
            } catch (zzgr e10) {
                throw e10;
            } catch (IOException e11) {
                throw new zzgr(null, e11, AdError.SERVER_ERROR_CODE);
            }
        }
        long startOffset = this.zzc.getStartOffset();
        long skip = fileInputStream.skip(zzfyVar.zze + startOffset) - startOffset;
        if (skip == zzfyVar.zze) {
            if (i10 == 0) {
                FileChannel channel = fileInputStream.getChannel();
                if (channel.size() == 0) {
                    this.zze = -1L;
                    j10 = -1;
                } else {
                    j10 = channel.size() - channel.position();
                    this.zze = j10;
                    if (j10 < 0) {
                        throw new zzgr(null, null, AdError.REMOTE_ADS_SERVICE_ERROR);
                    }
                }
            } else {
                j10 = length - skip;
                this.zze = j10;
                if (j10 < 0) {
                    throw new zzft(AdError.REMOTE_ADS_SERVICE_ERROR);
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
        throw new zzgr(null, null, AdError.REMOTE_ADS_SERVICE_ERROR);
    }

    @Override // com.google.android.gms.internal.ads.zzfs
    public final Uri zzc() {
        zzfy zzfyVar = this.zzb;
        if (zzfyVar != null) {
            return zzfyVar.zza;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfs
    public final void zzd() {
        this.zzb = null;
        try {
            try {
                InputStream inputStream = this.zzd;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.zzd = null;
                try {
                    AssetFileDescriptor assetFileDescriptor = this.zzc;
                    if (assetFileDescriptor != null) {
                        assetFileDescriptor.close();
                    }
                } catch (IOException e10) {
                    throw new zzgr(null, e10, AdError.SERVER_ERROR_CODE);
                }
            } finally {
                this.zzc = null;
                if (this.zzf) {
                    this.zzf = false;
                    zzh();
                }
            }
        } catch (IOException e11) {
            throw new zzgr(null, e11, AdError.SERVER_ERROR_CODE);
        }
    }
}
