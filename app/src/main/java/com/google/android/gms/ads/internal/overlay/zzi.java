package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.internal.ads.zzcej;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes.dex */
public final class zzi {

    /* renamed from: a  reason: collision with root package name */
    public final int f10302a;

    /* renamed from: b  reason: collision with root package name */
    public final ViewGroup.LayoutParams f10303b;
    public final ViewGroup c;

    /* renamed from: d  reason: collision with root package name */
    public final Context f10304d;

    public zzi(zzcej zzcejVar) {
        this.f10303b = zzcejVar.getLayoutParams();
        ViewParent parent = zzcejVar.getParent();
        this.f10304d = zzcejVar.zzE();
        if (parent != null && (parent instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) parent;
            this.c = viewGroup;
            this.f10302a = viewGroup.indexOfChild(zzcejVar.zzF());
            viewGroup.removeView(zzcejVar.zzF());
            zzcejVar.zzaq(true);
            return;
        }
        throw new zzg("Could not get the parent of the WebView for an overlay.");
    }
}
