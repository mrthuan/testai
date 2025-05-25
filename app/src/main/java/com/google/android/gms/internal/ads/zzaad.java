package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzaad extends Surface {
    private static int zzb;
    private static boolean zzc;
    public final boolean zza;
    private final zzaab zzd;
    private boolean zze;

    public /* synthetic */ zzaad(zzaab zzaabVar, SurfaceTexture surfaceTexture, boolean z10, zzaac zzaacVar) {
        super(surfaceTexture);
        this.zzd = zzaabVar;
        this.zza = z10;
    }

    public static zzaad zza(Context context, boolean z10) {
        int i10 = 0;
        boolean z11 = true;
        if (z10 && !zzb(context)) {
            z11 = false;
        }
        zzdi.zzf(z11);
        zzaab zzaabVar = new zzaab();
        if (z10) {
            i10 = zzb;
        }
        return zzaabVar.zza(i10);
    }

    public static synchronized boolean zzb(Context context) {
        int i10;
        int i11;
        synchronized (zzaad.class) {
            if (!zzc) {
                if (zzdr.zzb(context)) {
                    if (zzdr.zzc()) {
                        i11 = 1;
                    } else {
                        i11 = 2;
                    }
                } else {
                    i11 = 0;
                }
                zzb = i11;
                zzc = true;
            }
            i10 = zzb;
        }
        if (i10 == 0) {
            return false;
        }
        return true;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.zzd) {
            if (!this.zze) {
                this.zzd.zzb();
                this.zze = true;
            }
        }
    }
}
