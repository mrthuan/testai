package com.inmobi.media;

import android.os.SystemClock;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* renamed from: com.inmobi.media.h4  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC1651h4 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final String f15123a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f15124b;
    public final WeakReference c;

    public RunnableC1651h4(C1665i4 impressionTracker) {
        kotlin.jvm.internal.g.e(impressionTracker, "impressionTracker");
        this.f15123a = "h4";
        this.f15124b = new ArrayList();
        this.c = new WeakReference(impressionTracker);
    }

    @Override // java.lang.Runnable
    public final void run() {
        kotlin.jvm.internal.g.b(this.f15123a);
        C1665i4 c1665i4 = (C1665i4) this.c.get();
        if (c1665i4 != null) {
            for (Map.Entry entry : c1665i4.f15183b.entrySet()) {
                View view = (View) entry.getKey();
                C1637g4 c1637g4 = (C1637g4) entry.getValue();
                kotlin.jvm.internal.g.b(this.f15123a);
                Objects.toString(c1637g4);
                if (SystemClock.uptimeMillis() - c1637g4.f15094d >= c1637g4.c) {
                    kotlin.jvm.internal.g.b(this.f15123a);
                    c1665i4.f15188h.a(view, c1637g4.f15092a);
                    this.f15124b.add(view);
                }
            }
            Iterator it = this.f15124b.iterator();
            while (it.hasNext()) {
                c1665i4.a((View) it.next());
            }
            this.f15124b.clear();
            if ((!c1665i4.f15183b.isEmpty()) && !c1665i4.f15185e.hasMessages(0)) {
                c1665i4.f15185e.postDelayed(c1665i4.f15186f, c1665i4.f15187g);
            }
        }
    }
}
