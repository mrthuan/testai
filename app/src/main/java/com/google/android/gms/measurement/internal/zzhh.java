package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.2 */
@VisibleForTesting
/* loaded from: classes2.dex */
public final class zzhh {

    /* renamed from: a  reason: collision with root package name */
    public final Context f11810a;

    /* renamed from: b  reason: collision with root package name */
    public final String f11811b;
    public final String c;

    /* renamed from: d  reason: collision with root package name */
    public final String f11812d;

    /* renamed from: e  reason: collision with root package name */
    public final Boolean f11813e;

    /* renamed from: f  reason: collision with root package name */
    public final long f11814f;

    /* renamed from: g  reason: collision with root package name */
    public final com.google.android.gms.internal.measurement.zzcl f11815g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f11816h;

    /* renamed from: i  reason: collision with root package name */
    public final Long f11817i;

    /* renamed from: j  reason: collision with root package name */
    public final String f11818j;

    @VisibleForTesting
    public zzhh(Context context, com.google.android.gms.internal.measurement.zzcl zzclVar, Long l10) {
        this.f11816h = true;
        Preconditions.j(context);
        Context applicationContext = context.getApplicationContext();
        Preconditions.j(applicationContext);
        this.f11810a = applicationContext;
        this.f11817i = l10;
        if (zzclVar != null) {
            this.f11815g = zzclVar;
            this.f11811b = zzclVar.zzf;
            this.c = zzclVar.zze;
            this.f11812d = zzclVar.zzd;
            this.f11816h = zzclVar.zzc;
            this.f11814f = zzclVar.zzb;
            this.f11818j = zzclVar.zzh;
            Bundle bundle = zzclVar.zzg;
            if (bundle != null) {
                this.f11813e = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
