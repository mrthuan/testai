package com.inmobi.media;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import com.inmobi.commons.core.configs.AdConfig;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* renamed from: com.inmobi.media.kc  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1701kc {

    /* renamed from: a  reason: collision with root package name */
    public final r f15271a;

    /* renamed from: b  reason: collision with root package name */
    public C1788r7 f15272b;
    public WeakReference c;

    /* renamed from: d  reason: collision with root package name */
    public final AdConfig f15273d;

    public AbstractC1701kc(r container) {
        kotlin.jvm.internal.g.e(container, "container");
        this.f15271a = container;
        this.f15273d = container.getAdConfig();
    }

    public abstract View a(View view, ViewGroup viewGroup, boolean z10);

    public void a() {
        WeakReference weakReference = this.c;
        if (weakReference != null) {
            weakReference.clear();
        }
    }

    public abstract void a(byte b10);

    public abstract void a(Context context, byte b10);

    public abstract void a(View view);

    public abstract void a(View view, FriendlyObstructionPurpose friendlyObstructionPurpose);

    public abstract void a(HashMap hashMap);

    public View b() {
        WeakReference weakReference = this.c;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public C1788r7 c() {
        return this.f15272b;
    }

    public View d() {
        return null;
    }

    public abstract void e();
}
