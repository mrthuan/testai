package com.inmobi.media;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.inmobi.media.k  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1688k {

    /* renamed from: a  reason: collision with root package name */
    public int f15240a;

    /* renamed from: b  reason: collision with root package name */
    public int f15241b;
    public String c;

    /* renamed from: d  reason: collision with root package name */
    public final WeakReference f15242d;

    /* renamed from: e  reason: collision with root package name */
    public final HashSet f15243e;

    /* renamed from: f  reason: collision with root package name */
    public final String f15244f;

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList f15245g;

    /* renamed from: h  reason: collision with root package name */
    public final Set f15246h;

    public C1688k(String batchId, Set rawAssets, Y0 listener, String str, int i10) {
        str = (i10 & 16) != 0 ? null : str;
        kotlin.jvm.internal.g.e(batchId, "batchId");
        kotlin.jvm.internal.g.e(rawAssets, "rawAssets");
        kotlin.jvm.internal.g.e(listener, "listener");
        this.f15242d = new WeakReference(listener);
        this.f15245g = new ArrayList();
        this.f15243e = new HashSet();
        this.f15246h = rawAssets;
        this.f15244f = str;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdAssetBatch{rawAssets=");
        sb2.append(this.f15246h);
        sb2.append(", batchDownloadSuccessCount=");
        sb2.append(this.f15240a);
        sb2.append(", batchDownloadFailureCount=");
        return androidx.activity.f.n(sb2, this.f15241b, '}');
    }
}
