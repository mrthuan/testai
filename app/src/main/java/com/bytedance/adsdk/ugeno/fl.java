package com.bytedance.adsdk.ugeno;

import android.content.Context;
import com.bytedance.adsdk.ugeno.core.Tgh;
import java.util.ArrayList;
import java.util.List;

/* compiled from: UGenoEnv.java */
/* loaded from: classes.dex */
public class fl {
    private static volatile fl Qhi;
    private Qhi CJ;

    /* renamed from: ac  reason: collision with root package name */
    private com.bytedance.adsdk.ugeno.core.ac f7947ac;
    private List<com.bytedance.adsdk.ugeno.core.cJ> cJ;

    private fl() {
    }

    public static fl Qhi() {
        if (Qhi == null) {
            synchronized (fl.class) {
                if (Qhi == null) {
                    Qhi = new fl();
                }
            }
        }
        return Qhi;
    }

    private void ac() {
        this.cJ = new ArrayList();
        this.cJ.addAll(new Tgh().Qhi());
        com.bytedance.adsdk.ugeno.core.ac acVar = this.f7947ac;
        if (acVar != null) {
            this.cJ.addAll(acVar.Qhi());
        }
        com.bytedance.adsdk.ugeno.core.fl.Qhi(this.cJ);
    }

    public Qhi cJ() {
        return this.CJ;
    }

    public void Qhi(Context context, com.bytedance.adsdk.ugeno.core.ac acVar, Qhi qhi) {
        this.f7947ac = acVar;
        this.CJ = qhi;
        ac();
    }
}
