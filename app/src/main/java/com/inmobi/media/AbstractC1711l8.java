package com.inmobi.media;

import android.content.Context;
import android.view.View;
import com.inmobi.commons.core.configs.AdConfig;
import java.util.HashMap;
import java.util.LinkedList;

/* renamed from: com.inmobi.media.l8  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1711l8 {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedList f15287a = new LinkedList();

    /* renamed from: b  reason: collision with root package name */
    public int f15288b;
    public int c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ C1867x8 f15289d;

    public AbstractC1711l8(C1867x8 c1867x8) {
        this.f15289d = c1867x8;
    }

    public abstract View a(Context context);

    public void a(View view) {
        kotlin.jvm.internal.g.e(view, "view");
        HashMap hashMap = C1867x8.c;
        C1655h8.a(view);
        view.setOnClickListener(null);
        this.f15287a.addLast(view);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        this.f15289d.f15654a++;
    }

    public final String toString() {
        return "Size:" + this.f15287a.size() + " Miss Count:" + this.f15288b + " Hit Count:" + this.c;
    }

    public void a(View view, W6 asset, AdConfig adConfig) {
        kotlin.jvm.internal.g.e(view, "view");
        kotlin.jvm.internal.g.e(asset, "asset");
        kotlin.jvm.internal.g.e(adConfig, "adConfig");
        view.setVisibility(asset.f14806v);
        view.setOnClickListener(null);
    }
}
