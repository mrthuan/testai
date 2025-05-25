package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Process;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzevd implements zzevo {
    private final zzgcu zza;
    private final Context zzb;
    private final VersionInfoParcel zzc;
    private final String zzd;

    public zzevd(zzgcu zzgcuVar, Context context, VersionInfoParcel versionInfoParcel, String str) {
        this.zza = zzgcuVar;
        this.zzb = context;
        this.zzc = versionInfoParcel;
        this.zzd = str;
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final int zza() {
        return 35;
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final y9.a zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzevc
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzevd.this.zzc();
            }
        });
    }

    public final zzeve zzc() {
        boolean z10;
        int i10;
        boolean d10 = Wrappers.a(this.zzb).d();
        com.google.android.gms.ads.internal.util.zzt zztVar = com.google.android.gms.ads.internal.zzu.B.c;
        boolean d11 = com.google.android.gms.ads.internal.util.zzt.d(this.zzb);
        String str = this.zzc.f10345a;
        int myUid = Process.myUid();
        if (myUid != 0 && myUid != 1000) {
            z10 = false;
        } else {
            z10 = true;
        }
        ApplicationInfo applicationInfo = this.zzb.getApplicationInfo();
        if (applicationInfo == null) {
            i10 = 0;
        } else {
            i10 = applicationInfo.targetSdkVersion;
        }
        Context context = this.zzb;
        return new zzeve(d10, d11, str, z10, i10, DynamiteModule.d(context, ModuleDescriptor.MODULE_ID, false), DynamiteModule.a(context, ModuleDescriptor.MODULE_ID), this.zzd);
    }
}
