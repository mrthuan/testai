package com.inmobi.media;

import android.app.Activity;
import android.view.OrientationEventListener;
import java.util.HashSet;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* renamed from: com.inmobi.media.n4  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1734n4 extends OrientationEventListener {

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ ig.h[] f15341d;

    /* renamed from: a  reason: collision with root package name */
    public final Activity f15342a;

    /* renamed from: b  reason: collision with root package name */
    public final HashSet f15343b;
    public final C1721m4 c;

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(C1734n4.class, "currentOrientation", "getCurrentOrientation()Lcom/inmobi/ads/rendering/orientation/Orientation;", 0);
        kotlin.jvm.internal.i.f19949a.getClass();
        f15341d = new ig.h[]{mutablePropertyReference1Impl};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1734n4(Activity activity) {
        super(activity);
        kotlin.jvm.internal.g.e(activity, "activity");
        this.f15342a = activity;
        this.f15343b = new HashSet();
        this.c = new C1721m4(AbstractC1600d9.a(AbstractC1692k3.g()), this);
    }

    public final void a(C1614e9 orientationProperties) {
        kotlin.jvm.internal.g.e(orientationProperties, "orientationProperties");
        try {
            if (!orientationProperties.f15029a) {
                String str = orientationProperties.f15030b;
                if (kotlin.jvm.internal.g.a(str, "landscape")) {
                    this.f15342a.setRequestedOrientation(6);
                } else if (kotlin.jvm.internal.g.a(str, "portrait")) {
                    this.f15342a.setRequestedOrientation(7);
                } else {
                    this.f15342a.setRequestedOrientation(13);
                }
            } else {
                this.f15342a.setRequestedOrientation(13);
            }
        } catch (IllegalStateException unused) {
        }
    }

    public final void b() {
        int i10 = this.f15342a.getResources().getConfiguration().orientation;
        byte g10 = AbstractC1692k3.g();
        int i11 = 1;
        if (g10 != 1 && g10 != 2 && (g10 == 3 || g10 == 4)) {
            i11 = 2;
        }
        if (i10 == i11) {
            this.c.setValue(this, f15341d[0], AbstractC1600d9.a(AbstractC1692k3.g()));
        }
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i10) {
        b();
    }

    public final void a() {
        if (this.f15343b.isEmpty()) {
            disable();
        } else {
            enable();
        }
    }
}
