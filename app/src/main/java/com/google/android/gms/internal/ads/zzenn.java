package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzenn implements zzevo {
    private final zzgcu zza;
    private final zzgcu zzb;
    private final Context zzc;
    private final zzffg zzd;
    private final View zze;

    public zzenn(zzgcu zzgcuVar, zzgcu zzgcuVar2, Context context, zzffg zzffgVar, ViewGroup viewGroup) {
        this.zza = zzgcuVar;
        this.zzb = zzgcuVar2;
        this.zzc = context;
        this.zzd = zzffgVar;
        this.zze = viewGroup;
    }

    private final List zze() {
        int i10;
        ArrayList arrayList = new ArrayList();
        View view = this.zze;
        while (view != null) {
            ViewParent parent = view.getParent();
            if (parent == null) {
                break;
            }
            if (parent instanceof ViewGroup) {
                i10 = ((ViewGroup) parent).indexOfChild(view);
            } else {
                i10 = -1;
            }
            Bundle bundle = new Bundle();
            bundle.putString("type", parent.getClass().getName());
            bundle.putInt("index_of_child", i10);
            arrayList.add(bundle);
            if (!(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final int zza() {
        return 3;
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final y9.a zzb() {
        zzbbw.zza(this.zzc);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzkf)).booleanValue()) {
            return this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzenl
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return zzenn.this.zzc();
                }
            });
        }
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzenm
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzenn.this.zzd();
            }
        });
    }

    public final /* synthetic */ zzeno zzc() {
        return new zzeno(this.zzc, this.zzd.zze, zze());
    }

    public final /* synthetic */ zzeno zzd() {
        return new zzeno(this.zzc, this.zzd.zze, zze());
    }
}
