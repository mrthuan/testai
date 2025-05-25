package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import com.inmobi.ads.exceptions.VastException;
import com.inmobi.commons.core.configs.AdConfig;
import com.inmobi.media.C1631fc;
import com.inmobi.media.InterfaceC1645gc;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutorService;
import org.json.JSONException;

/* renamed from: com.inmobi.media.fc  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1631fc {

    /* renamed from: a  reason: collision with root package name */
    public static final C1631fc f15077a = new C1631fc();

    /* renamed from: b  reason: collision with root package name */
    public static final tf.c f15078b = kotlin.a.a(C1617ec.f15042a);
    public static final tf.c c = kotlin.a.a(C1603dc.f15021a);

    public static void a(C1646h ad2, AdConfig adConfig, InterfaceC1645gc interfaceC1645gc, A4 a42) {
        kotlin.jvm.internal.g.e(ad2, "ad");
        kotlin.jvm.internal.g.e(adConfig, "adConfig");
        ((ExecutorService) f15078b.getValue()).execute(new qb.e0(1, ad2, adConfig, interfaceC1645gc, a42));
    }

    public static final void b(C1646h ad2, AdConfig adConfig, InterfaceC1645gc interfaceC1645gc, A4 a42) {
        kotlin.jvm.internal.g.e(ad2, "$ad");
        kotlin.jvm.internal.g.e(adConfig, "$adConfig");
        C1631fc c1631fc = f15077a;
        try {
            if (c1631fc.a(ad2.s(), interfaceC1645gc)) {
                C1646h a10 = AbstractC1832v.a(ad2, adConfig, a42);
                if (a10 == null) {
                    c1631fc.a(ad2, false, (short) 75);
                } else {
                    c1631fc.a(a10, true, (short) 0);
                }
            }
        } catch (VastException e10) {
            c1631fc.a(ad2, false, e10.getTelemetryErrorCode());
        } catch (JSONException unused) {
            c1631fc.a(ad2, false, (short) 58);
        }
    }

    public final synchronized boolean a(String str, InterfaceC1645gc interfaceC1645gc) {
        tf.c cVar = c;
        List list = (List) ((HashMap) cVar.getValue()).get(str);
        if (list != null) {
            list.add(new WeakReference(interfaceC1645gc));
            return false;
        }
        ((HashMap) cVar.getValue()).put(str, ge.a.J(new WeakReference(interfaceC1645gc)));
        return true;
    }

    public final synchronized void a(final C1646h c1646h, final boolean z10, final short s4) {
        List<WeakReference> list = (List) ((HashMap) c.getValue()).remove(c1646h.s());
        if (list != null) {
            for (WeakReference weakReference : list) {
                final InterfaceC1645gc interfaceC1645gc = (InterfaceC1645gc) weakReference.get();
                if (interfaceC1645gc != null) {
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: qb.s0
                        @Override // java.lang.Runnable
                        public final void run() {
                            C1631fc.a(InterfaceC1645gc.this, c1646h, z10, s4);
                        }
                    });
                }
            }
            tf.d dVar = tf.d.f30009a;
        }
    }

    public static final void a(InterfaceC1645gc interfaceC1645gc, C1646h ad2, boolean z10, short s4) {
        kotlin.jvm.internal.g.e(ad2, "$ad");
        interfaceC1645gc.a(ad2, z10, s4);
    }
}
