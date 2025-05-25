package com.inmobi.media;

import java.util.TimerTask;

/* renamed from: com.inmobi.media.wb  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1857wb extends TimerTask {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C1870xb f15600a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ byte f15601b;

    public C1857wb(C1870xb c1870xb, byte b10) {
        this.f15600a = c1870xb;
        this.f15601b = b10;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.f15600a.a(this.f15601b);
    }
}
