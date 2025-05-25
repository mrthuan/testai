package com.bytedance.sdk.component.ROR;

import a6.h;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.sdk.component.ROR.CJ.Sf;
import com.bytedance.sdk.component.ROR.ac.Sf;
import com.bytedance.sdk.component.ROR.cJ.fl;
import com.bytedance.sdk.component.cJ.Qhi.hm;
import com.bytedance.sdk.component.cJ.Qhi.zc;
import com.bytedance.sdk.component.utils.kYc;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import lib.zj.office.fc.hpsf.Constants;

/* compiled from: NetClient.java */
/* loaded from: classes.dex */
public class Qhi {
    private zc Qhi;

    /* renamed from: ac  reason: collision with root package name */
    private int f8000ac;
    private Sf cJ;

    /* compiled from: NetClient.java */
    /* renamed from: com.bytedance.sdk.component.ROR.Qhi$Qhi  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0078Qhi {
        private Bundle ROR;
        private Set<String> Tgh;
        boolean CJ = true;

        /* renamed from: fl  reason: collision with root package name */
        final List<hm> f8002fl = new ArrayList();
        int Qhi = Constants.CP_MAC_ROMAN;
        int cJ = Constants.CP_MAC_ROMAN;

        /* renamed from: ac  reason: collision with root package name */
        int f8001ac = Constants.CP_MAC_ROMAN;

        public C0078Qhi ac(long j10, TimeUnit timeUnit) {
            this.f8001ac = Qhi("timeout", j10, timeUnit);
            return this;
        }

        public C0078Qhi Qhi(long j10, TimeUnit timeUnit) {
            this.Qhi = Qhi("timeout", j10, timeUnit);
            return this;
        }

        public C0078Qhi cJ(long j10, TimeUnit timeUnit) {
            this.cJ = Qhi("timeout", j10, timeUnit);
            return this;
        }

        public C0078Qhi Qhi(boolean z10) {
            this.CJ = z10;
            return this;
        }

        private static int Qhi(String str, long j10, TimeUnit timeUnit) {
            int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
            if (i10 >= 0) {
                if (timeUnit != null) {
                    long millis = timeUnit.toMillis(j10);
                    if (millis <= 2147483647L) {
                        if (millis != 0 || i10 <= 0) {
                            return (int) millis;
                        }
                        throw new IllegalArgumentException(h.c(str, " too small."));
                    }
                    throw new IllegalArgumentException(h.c(str, " too large."));
                }
                throw new NullPointerException("unit == null");
            }
            throw new IllegalArgumentException(h.c(str, " < 0"));
        }

        public Qhi Qhi() {
            return new Qhi(this);
        }
    }

    public com.bytedance.sdk.component.ROR.cJ.Qhi CJ() {
        return new com.bytedance.sdk.component.ROR.cJ.Qhi(this.Qhi);
    }

    public void Qhi(Context context, boolean z10, com.bytedance.sdk.component.ROR.ac.cJ cJVar) {
        if (context == null) {
            throw new IllegalArgumentException("tryInitAdTTNet context is null");
        }
        if (cJVar != null) {
            int Qhi = cJVar.Qhi();
            this.f8000ac = Qhi;
            Sf sf2 = this.cJ;
            if (sf2 != null) {
                sf2.Qhi(Qhi);
            }
            com.bytedance.sdk.component.ROR.ac.hm.Qhi().Qhi(this.f8000ac).Qhi(z10);
            com.bytedance.sdk.component.ROR.ac.hm.Qhi().Qhi(this.f8000ac).Qhi(cJVar);
            com.bytedance.sdk.component.ROR.ac.hm.Qhi().Qhi(this.f8000ac).Qhi(context, kYc.Qhi(context));
            return;
        }
        throw new IllegalArgumentException("tryInitAdTTNet ITTAdNetDepend is null");
    }

    public com.bytedance.sdk.component.ROR.cJ.cJ ac() {
        return new com.bytedance.sdk.component.ROR.cJ.cJ(this.Qhi);
    }

    public fl cJ() {
        return new fl(this.Qhi);
    }

    public zc fl() {
        return this.Qhi;
    }

    private Qhi(C0078Qhi c0078Qhi) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        zc.Qhi cJ = new zc.Qhi().Qhi(c0078Qhi.Qhi, timeUnit).ac(c0078Qhi.f8001ac, timeUnit).cJ(c0078Qhi.cJ, timeUnit);
        if (c0078Qhi.CJ) {
            Sf sf2 = new Sf();
            this.cJ = sf2;
            cJ.Qhi(sf2);
        }
        List<hm> list = c0078Qhi.f8002fl;
        if (list != null && list.size() > 0) {
            for (hm hmVar : c0078Qhi.f8002fl) {
                cJ.Qhi(hmVar);
            }
        }
        if (c0078Qhi.ROR != null) {
            Bundle unused = c0078Qhi.ROR;
        }
        Set unused2 = c0078Qhi.Tgh;
        this.Qhi = cJ.Qhi();
    }

    public void Qhi(Context context, boolean z10) {
        com.bytedance.sdk.component.ROR.ac.Qhi.cJ(true);
        if (Qhi(context) || (!kYc.Qhi(context) && z10)) {
            com.bytedance.sdk.component.ROR.ac.hm.Qhi().Qhi(this.f8000ac, context).CJ();
            com.bytedance.sdk.component.ROR.ac.hm.Qhi().Qhi(this.f8000ac, context).Qhi();
        }
        if (kYc.Qhi(context)) {
            com.bytedance.sdk.component.ROR.ac.hm.Qhi().Qhi(this.f8000ac, context).CJ();
            com.bytedance.sdk.component.ROR.ac.hm.Qhi().Qhi(this.f8000ac, context).Qhi();
        }
    }

    public static void Qhi() {
        com.bytedance.sdk.component.ROR.CJ.Sf.Qhi(Sf.Qhi.DEBUG);
    }

    private static boolean Qhi(Context context) {
        String cJ = kYc.cJ(context);
        if (cJ != null) {
            return cJ.endsWith(":push") || cJ.endsWith(":pushservice");
        }
        return false;
    }
}
