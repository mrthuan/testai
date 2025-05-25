package com.bytedance.sdk.openadsdk.core;

import android.text.TextUtils;
import java.util.concurrent.ConcurrentHashMap;
import lib.zj.office.fc.openxml4j.opc.PackagingURIHelper;

/* compiled from: RitInfo.java */
/* loaded from: classes.dex */
public class bxS {
    public static ConcurrentHashMap<Integer, bxS> Qhi = new ConcurrentHashMap<>();
    private int CJ;
    private String Tgh;

    /* renamed from: fl  reason: collision with root package name */
    private int f9013fl;
    private String cJ = "";

    /* renamed from: ac  reason: collision with root package name */
    private String f9012ac = "";

    private void Tgh() {
        this.cJ = "";
        this.f9012ac = "";
        this.CJ = 0;
        this.f9013fl = 0;
    }

    public int CJ() {
        return this.CJ;
    }

    public String Qhi() {
        return this.Tgh;
    }

    public String ac() {
        return this.f9012ac;
    }

    public String cJ() {
        return this.cJ;
    }

    public int fl() {
        return this.f9013fl;
    }

    public static void ac(int i10) {
        bxS bxs;
        if (i10 == 0) {
            return;
        }
        if (Qhi == null) {
            Qhi = new ConcurrentHashMap<>();
        }
        if (!Qhi.containsKey(Integer.valueOf(i10)) || (bxs = Qhi.get(Integer.valueOf(i10))) == null) {
            return;
        }
        bxs.cJ(1);
    }

    public void Qhi(int i10) {
        this.CJ = i10;
    }

    public void cJ(int i10) {
        this.f9013fl = i10;
    }

    public static void cJ(com.bytedance.sdk.openadsdk.core.model.tP tPVar) {
        if (tPVar == null || TextUtils.isEmpty(tPVar.EGK())) {
            return;
        }
        Integer valueOf = Integer.valueOf(tPVar.Hy());
        if (valueOf.intValue() == 0) {
            return;
        }
        if (Qhi == null) {
            Qhi = new ConcurrentHashMap<>();
        }
        bxS bxs = Qhi.containsKey(valueOf) ? Qhi.get(valueOf) : null;
        if (bxs == null) {
            bxs = new bxS();
        }
        String jWV = tPVar.jWV();
        if (TextUtils.isEmpty(jWV) || !jWV.equals(bxs.Qhi())) {
            bxs.Tgh();
            bxs.Qhi(tPVar);
            Qhi.put(valueOf, bxs);
        }
    }

    public void Qhi(com.bytedance.sdk.openadsdk.core.model.tP tPVar) {
        if (tPVar != null) {
            String jWV = tPVar.jWV();
            if (!TextUtils.isEmpty(jWV)) {
                this.Tgh = jWV;
            }
            String YB = tPVar.YB();
            if (TextUtils.isEmpty(YB) && tPVar.IC()) {
                YB = tPVar.cJP().hm();
            }
            if (!TextUtils.isEmpty(YB)) {
                String[] split = YB.split(PackagingURIHelper.FORWARD_SLASH_STRING);
                if (split.length >= 3) {
                    this.cJ = split[2];
                }
            }
            if (tPVar.pv() == null || TextUtils.isEmpty(tPVar.pv().ac())) {
                return;
            }
            this.f9012ac = tPVar.pv().ac();
        }
    }

    public static void ac(com.bytedance.sdk.openadsdk.core.model.tP tPVar) {
        bxS bxs;
        if (tPVar == null) {
            return;
        }
        Integer valueOf = Integer.valueOf(tPVar.Hy());
        if (valueOf.intValue() == 0) {
            return;
        }
        if (Qhi == null) {
            Qhi = new ConcurrentHashMap<>();
        }
        if (!Qhi.containsKey(valueOf) || (bxs = Qhi.get(valueOf)) == null) {
            return;
        }
        bxs.Qhi(1);
    }
}
