package com.bytedance.sdk.component.ROR.ac;

import android.content.Context;
import java.util.HashMap;

/* compiled from: TncInstanceManager.java */
/* loaded from: classes.dex */
public class hm {
    private static volatile hm Qhi;

    /* renamed from: ac  reason: collision with root package name */
    private static HashMap<Integer, Qhi> f8017ac;
    private static HashMap<Integer, ROR> cJ;

    private hm() {
        cJ = new HashMap<>();
        f8017ac = new HashMap<>();
    }

    public static synchronized hm Qhi() {
        hm hmVar;
        synchronized (hm.class) {
            if (Qhi == null) {
                synchronized (hm.class) {
                    if (Qhi == null) {
                        Qhi = new hm();
                    }
                }
            }
            hmVar = Qhi;
        }
        return hmVar;
    }

    public ROR Qhi(int i10) {
        ROR ror = cJ.get(Integer.valueOf(i10));
        if (ror == null) {
            ROR ror2 = new ROR(i10);
            cJ.put(Integer.valueOf(i10), ror2);
            return ror2;
        }
        return ror;
    }

    public Qhi Qhi(int i10, Context context) {
        Qhi qhi = f8017ac.get(Integer.valueOf(i10));
        if (qhi == null) {
            Qhi qhi2 = new Qhi(context, i10);
            f8017ac.put(Integer.valueOf(i10), qhi2);
            return qhi2;
        }
        return qhi;
    }
}
