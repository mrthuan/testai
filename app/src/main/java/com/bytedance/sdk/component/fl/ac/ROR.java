package com.bytedance.sdk.component.fl.ac;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;
import com.bytedance.sdk.component.fl.ABk;
import com.bytedance.sdk.component.fl.EBS;
import com.bytedance.sdk.component.fl.MQ;
import com.bytedance.sdk.component.fl.iMK;
import com.bytedance.sdk.component.fl.kYc;
import com.bytedance.sdk.component.fl.tP;
import java.io.File;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;

/* compiled from: LoadFactory.java */
/* loaded from: classes.dex */
public class ROR {
    private ABk ROR;
    private ExecutorService Sf;
    private com.bytedance.sdk.component.fl.fl Tgh;
    private final iMK cJ;

    /* renamed from: hm  reason: collision with root package name */
    private kYc f8395hm;
    private Map<String, List<ac>> Qhi = new ConcurrentHashMap();

    /* renamed from: ac  reason: collision with root package name */
    private Map<String, tP> f8393ac = new HashMap();
    private Map<String, MQ> CJ = new HashMap();

    /* renamed from: fl  reason: collision with root package name */
    private Map<String, com.bytedance.sdk.component.fl.ac> f8394fl = new HashMap();

    public ROR(Context context, iMK imk) {
        this.cJ = (iMK) hm.Qhi(imk);
        com.bytedance.sdk.component.fl.ac.Qhi.Qhi.Qhi(context, imk.hm());
    }

    private tP CJ(com.bytedance.sdk.component.fl.cJ cJVar) {
        tP fl2 = this.cJ.fl();
        if (fl2 != null) {
            return com.bytedance.sdk.component.fl.ac.Qhi.cJ.Qhi.Qhi(fl2);
        }
        return com.bytedance.sdk.component.fl.ac.Qhi.cJ.Qhi.Qhi(cJVar.cJ());
    }

    private ExecutorService Gm() {
        ExecutorService cJ = this.cJ.cJ();
        if (cJ != null) {
            return cJ;
        }
        return com.bytedance.sdk.component.fl.Qhi.ac.Qhi();
    }

    private com.bytedance.sdk.component.fl.ac Tgh(com.bytedance.sdk.component.fl.cJ cJVar) {
        com.bytedance.sdk.component.fl.ac ROR = this.cJ.ROR();
        return ROR != null ? ROR : new com.bytedance.sdk.component.fl.ac.Qhi.Qhi.cJ(cJVar.fl(), cJVar.Qhi(), Tgh());
    }

    private ABk WAv() {
        ABk Qhi = this.cJ.Qhi();
        if (Qhi != null) {
            return Qhi;
        }
        return com.bytedance.sdk.component.fl.Qhi.cJ.Qhi();
    }

    private MQ fl(com.bytedance.sdk.component.fl.cJ cJVar) {
        MQ Tgh = this.cJ.Tgh();
        return Tgh != null ? Tgh : com.bytedance.sdk.component.fl.ac.Qhi.cJ.Tgh.Qhi(cJVar.cJ());
    }

    private com.bytedance.sdk.component.fl.fl hm() {
        com.bytedance.sdk.component.fl.fl CJ = this.cJ.CJ();
        if (CJ == null) {
            return com.bytedance.sdk.component.fl.cJ.cJ.Qhi();
        }
        return CJ;
    }

    private kYc zc() {
        kYc Sf = this.cJ.Sf();
        if (Sf == null) {
            return new Sf();
        }
        return Sf;
    }

    public Collection<tP> Qhi() {
        return this.f8393ac.values();
    }

    public Map<String, List<ac>> ROR() {
        return this.Qhi;
    }

    public kYc Sf() {
        if (this.f8395hm == null) {
            this.f8395hm = zc();
        }
        return this.f8395hm;
    }

    public Collection<com.bytedance.sdk.component.fl.ac> ac() {
        return this.f8394fl.values();
    }

    public Collection<MQ> cJ() {
        return this.CJ.values();
    }

    public tP Qhi(com.bytedance.sdk.component.fl.cJ cJVar) {
        if (cJVar == null) {
            cJVar = com.bytedance.sdk.component.fl.ac.Qhi.Qhi.ROR();
        }
        String file = cJVar.fl().toString();
        tP tPVar = this.f8393ac.get(file);
        if (tPVar == null) {
            tP CJ = CJ(cJVar);
            this.f8393ac.put(file, CJ);
            return CJ;
        }
        return tPVar;
    }

    public com.bytedance.sdk.component.fl.ac ac(com.bytedance.sdk.component.fl.cJ cJVar) {
        if (cJVar == null) {
            cJVar = com.bytedance.sdk.component.fl.ac.Qhi.Qhi.ROR();
        }
        String file = cJVar.fl().toString();
        com.bytedance.sdk.component.fl.ac acVar = this.f8394fl.get(file);
        if (acVar == null) {
            com.bytedance.sdk.component.fl.ac Tgh = Tgh(cJVar);
            this.f8394fl.put(file, Tgh);
            return Tgh;
        }
        return acVar;
    }

    public MQ cJ(com.bytedance.sdk.component.fl.cJ cJVar) {
        if (cJVar == null) {
            cJVar = com.bytedance.sdk.component.fl.ac.Qhi.Qhi.ROR();
        }
        String file = cJVar.fl().toString();
        MQ mq = this.CJ.get(file);
        if (mq == null) {
            MQ fl2 = fl(cJVar);
            this.CJ.put(file, fl2);
            return fl2;
        }
        return mq;
    }

    public ExecutorService Tgh() {
        ExecutorService Qhi;
        EBS ac2 = this.cJ.ac();
        if (ac2 == null || (Qhi = ac2.Qhi()) == null) {
            if (this.Sf == null) {
                this.Sf = Gm();
            }
            return this.Sf;
        }
        return Qhi;
    }

    public ABk fl() {
        if (this.ROR == null) {
            this.ROR = WAv();
        }
        return this.ROR;
    }

    public com.bytedance.sdk.component.fl.fl CJ() {
        if (this.Tgh == null) {
            this.Tgh = hm();
        }
        return this.Tgh;
    }

    public com.bytedance.sdk.component.fl.ac Qhi(String str) {
        return ac(com.bytedance.sdk.component.fl.ac.Qhi.Qhi.Qhi(new File(str)));
    }

    public com.bytedance.sdk.component.fl.ac.cJ.Qhi Qhi(ac acVar) {
        ImageView.ScaleType CJ = acVar.CJ();
        if (CJ == null) {
            CJ = com.bytedance.sdk.component.fl.ac.cJ.Qhi.Qhi;
        }
        ImageView.ScaleType scaleType = CJ;
        Bitmap.Config Gm = acVar.Gm();
        if (Gm == null) {
            Gm = com.bytedance.sdk.component.fl.ac.cJ.Qhi.cJ;
        }
        return new com.bytedance.sdk.component.fl.ac.cJ.Qhi(acVar.cJ(), acVar.ac(), scaleType, Gm, acVar.ROR(), acVar.Sf());
    }
}
