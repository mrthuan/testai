package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.internal.ads.zzbfa;
import com.google.android.gms.internal.ads.zzbfx;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes.dex */
public final class zzep implements MediaContent {

    /* renamed from: a  reason: collision with root package name */
    public final zzbfa f10181a;

    /* renamed from: b  reason: collision with root package name */
    public final zzbfx f10182b;

    public zzep(zzbfa zzbfaVar, zzbfx zzbfxVar) {
        new VideoController();
        this.f10181a = zzbfaVar;
        this.f10182b = zzbfxVar;
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final boolean a() {
        try {
            return this.f10181a.zzl();
        } catch (RemoteException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.g(6);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final float getAspectRatio() {
        try {
            return this.f10181a.zze();
        } catch (RemoteException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.g(6);
            return 0.0f;
        }
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final zzbfx zza() {
        return this.f10182b;
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final boolean zzb() {
        try {
            return this.f10181a.zzk();
        } catch (RemoteException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.g(6);
            return false;
        }
    }
}
