package com.bytedance.sdk.component.adexpress.dynamic.CJ;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.cJ.iMK;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ComputeRuler.java */
/* loaded from: classes.dex */
public class ac {
    private double ROR;
    private String Sf;
    private int Tgh;

    /* renamed from: fl  reason: collision with root package name */
    private double f8162fl;

    /* renamed from: hm  reason: collision with root package name */
    private iMK f8163hm;
    public Map<String, C0086ac> Qhi = new HashMap();
    public Map<String, C0086ac> cJ = new HashMap();

    /* renamed from: ac  reason: collision with root package name */
    public Map<String, C0086ac> f8161ac = new HashMap();
    private double CJ = Math.random();

    /* compiled from: ComputeRuler.java */
    /* loaded from: classes.dex */
    public static class Qhi implements Cloneable {
        float Qhi;

        /* renamed from: ac  reason: collision with root package name */
        float f8164ac;
        boolean cJ;

        public Object clone() {
            try {
                return (Qhi) super.clone();
            } catch (CloneNotSupportedException unused) {
                return null;
            }
        }
    }

    /* compiled from: ComputeRuler.java */
    /* renamed from: com.bytedance.sdk.component.adexpress.dynamic.CJ.ac$ac  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0086ac {
        float Qhi;
        float cJ;

        public C0086ac() {
        }

        public C0086ac(float f10, float f11) {
            this.Qhi = f10;
            this.cJ = f11;
        }

        public String toString() {
            return "UnitSize{width=" + this.Qhi + ", height=" + this.cJ + '}';
        }
    }

    /* compiled from: ComputeRuler.java */
    /* loaded from: classes.dex */
    public static class cJ {
        double CJ;
        float Qhi;

        /* renamed from: ac  reason: collision with root package name */
        int f8165ac;
        int cJ;

        /* renamed from: fl  reason: collision with root package name */
        float f8166fl;

        public static JSONObject Qhi(cJ cJVar) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("fontSize", cJVar.Qhi);
                jSONObject.put("letterSpacing", cJVar.cJ);
                jSONObject.put("lineHeight", cJVar.CJ);
                jSONObject.put("maxWidth", cJVar.f8166fl);
                jSONObject.put("fontWeight", cJVar.f8165ac);
            } catch (JSONException unused) {
            }
            return jSONObject;
        }
    }

    public ac(double d10, int i10, double d11, String str, iMK imk) {
        this.f8162fl = d10;
        this.Tgh = i10;
        this.ROR = d11;
        this.Sf = str;
        this.f8163hm = imk;
    }

    private C0086ac Tgh(com.bytedance.sdk.component.adexpress.dynamic.ac.hm hmVar, float f10, float f11) {
        new C0086ac();
        com.bytedance.sdk.component.adexpress.dynamic.ac.ROR fl2 = hmVar.WAv().fl();
        hmVar.WAv().ac();
        fl2.Hf();
        float kYc = fl2.kYc();
        int Dq = fl2.Dq();
        double cjC = fl2.cjC();
        int NBs = fl2.NBs();
        boolean xyz = fl2.xyz();
        boolean dI = fl2.dI();
        int jPH = fl2.jPH();
        cJ cJVar = new cJ();
        cJVar.Qhi = kYc;
        cJVar.cJ = Dq;
        cJVar.f8165ac = NBs;
        cJVar.CJ = cjC;
        cJVar.f8166fl = f10;
        return Qhi(hmVar.WAv().ac(), cJVar, xyz, dI, jPH, hmVar);
    }

    private C0086ac fl(com.bytedance.sdk.component.adexpress.dynamic.ac.hm hmVar, float f10, float f11) {
        String str = hmVar.ac() + "_" + f10 + "_" + f11;
        if (this.f8161ac.containsKey(str)) {
            return this.f8161ac.get(str);
        }
        C0086ac Tgh = Tgh(hmVar, f10, f11);
        this.f8161ac.put(str, Tgh);
        return Tgh;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.bytedance.sdk.component.adexpress.dynamic.CJ.ac.C0086ac CJ(com.bytedance.sdk.component.adexpress.dynamic.ac.hm r21, float r22, float r23) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.adexpress.dynamic.CJ.ac.CJ(com.bytedance.sdk.component.adexpress.dynamic.ac.hm, float, float):com.bytedance.sdk.component.adexpress.dynamic.CJ.ac$ac");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.bytedance.sdk.component.adexpress.dynamic.CJ.ac.C0086ac Qhi(com.bytedance.sdk.component.adexpress.dynamic.ac.hm r13, float r14, float r15) {
        /*
            r12 = this;
            com.bytedance.sdk.component.adexpress.dynamic.ac.Tgh r0 = r13.WAv()
            java.lang.String r0 = r0.ac()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = 0
            if (r0 == 0) goto L23
            com.bytedance.sdk.component.adexpress.dynamic.ac.Tgh r0 = r13.WAv()
            com.bytedance.sdk.component.adexpress.dynamic.ac.ROR r0 = r0.fl()
            java.lang.String r0 = r0.ReL()
            if (r0 != 0) goto L23
            com.bytedance.sdk.component.adexpress.dynamic.CJ.ac$ac r13 = new com.bytedance.sdk.component.adexpress.dynamic.CJ.ac$ac
            r13.<init>(r1, r1)
            return r13
        L23:
            java.lang.String r0 = "creative-playable-bait"
            boolean r0 = a0.d.j(r13, r0)
            if (r0 == 0) goto L31
            com.bytedance.sdk.component.adexpress.dynamic.CJ.ac$ac r13 = new com.bytedance.sdk.component.adexpress.dynamic.CJ.ac$ac
            r13.<init>(r1, r1)
            return r13
        L31:
            float r0 = r13.Sf()
            float r1 = r13.hm()
            com.bytedance.sdk.component.adexpress.dynamic.ac.Tgh r2 = r13.WAv()
            com.bytedance.sdk.component.adexpress.dynamic.ac.ROR r2 = r2.fl()
            java.lang.String r3 = r2.aP()
            java.lang.String r2 = r2.Eh()
            int r4 = r13.ABk()
            float r4 = (float) r4
            int r5 = r13.iMK()
            float r5 = (float) r5
            float r6 = r13.pA()
            float r7 = r13.hpZ()
            java.lang.String r8 = "fixed"
            boolean r9 = android.text.TextUtils.equals(r3, r8)
            java.lang.String r10 = "flex"
            java.lang.String r11 = "auto"
            if (r9 == 0) goto L7c
            float r14 = java.lang.Math.min(r0, r14)
            boolean r0 = android.text.TextUtils.equals(r2, r11)
            if (r0 == 0) goto Laf
            float r0 = r14 - r6
            float r1 = r15 - r7
            com.bytedance.sdk.component.adexpress.dynamic.CJ.ac$ac r13 = r12.cJ(r13, r0, r1)
            float r13 = r13.cJ
            goto Lab
        L7c:
            boolean r9 = android.text.TextUtils.equals(r3, r11)
            if (r9 == 0) goto L95
            float r14 = r14 - r6
            float r0 = r15 - r7
            com.bytedance.sdk.component.adexpress.dynamic.CJ.ac$ac r13 = r12.cJ(r13, r14, r0)
            float r14 = r13.Qhi
            float r14 = r14 + r6
            boolean r0 = android.text.TextUtils.equals(r2, r11)
            if (r0 == 0) goto Laf
            float r13 = r13.cJ
            goto Lab
        L95:
            boolean r3 = android.text.TextUtils.equals(r3, r10)
            if (r3 == 0) goto Lae
            boolean r0 = android.text.TextUtils.equals(r2, r11)
            if (r0 == 0) goto Laf
            float r0 = r14 - r6
            float r1 = r15 - r7
            com.bytedance.sdk.component.adexpress.dynamic.CJ.ac$ac r13 = r12.cJ(r13, r0, r1)
            float r13 = r13.cJ
        Lab:
            float r1 = r13 + r7
            goto Laf
        Lae:
            r14 = r0
        Laf:
            java.lang.String r13 = "scale"
            boolean r13 = android.text.TextUtils.equals(r2, r13)
            if (r13 == 0) goto Ld1
            float r13 = r14 - r4
            float r13 = r13 / r1
            int r13 = java.lang.Math.round(r13)
            float r13 = (float) r13
            float r13 = r13 + r5
            int r0 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r0 <= 0) goto Lcf
            float r13 = r15 - r5
            float r13 = r13 * r1
            int r13 = java.lang.Math.round(r13)
            float r13 = (float) r13
            float r14 = r13 + r4
            goto Le5
        Lcf:
            r15 = r13
            goto Le5
        Ld1:
            boolean r13 = android.text.TextUtils.equals(r2, r8)
            if (r13 == 0) goto Ldd
            float r1 = r1 + r5
            float r15 = java.lang.Math.min(r1, r15)
            goto Le5
        Ldd:
            boolean r13 = android.text.TextUtils.equals(r2, r10)
            if (r13 == 0) goto Le4
            goto Le5
        Le4:
            r15 = r1
        Le5:
            com.bytedance.sdk.component.adexpress.dynamic.CJ.ac$ac r13 = new com.bytedance.sdk.component.adexpress.dynamic.CJ.ac$ac
            r13.<init>()
            r13.Qhi = r14
            r13.cJ = r15
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.adexpress.dynamic.CJ.ac.Qhi(com.bytedance.sdk.component.adexpress.dynamic.ac.hm, float, float):com.bytedance.sdk.component.adexpress.dynamic.CJ.ac$ac");
    }

    public C0086ac ac(com.bytedance.sdk.component.adexpress.dynamic.ac.hm hmVar, float f10, float f11) {
        if (hmVar == null) {
            return null;
        }
        C0086ac Qhi2 = Qhi(hmVar);
        if (Qhi2 == null || (Qhi2.Qhi == 0.0f && Qhi2.cJ == 0.0f)) {
            C0086ac CJ = CJ(hmVar, f10, f11);
            Qhi(hmVar, CJ);
            return CJ;
        }
        return Qhi2;
    }

    public C0086ac cJ(com.bytedance.sdk.component.adexpress.dynamic.ac.hm hmVar, float f10, float f11) {
        C0086ac c0086ac = new C0086ac();
        if (hmVar.WAv().fl() == null) {
            return c0086ac;
        }
        C0086ac fl2 = fl(hmVar, f10, f11);
        float f12 = fl2.Qhi;
        float f13 = fl2.cJ;
        c0086ac.Qhi = Math.min(f12, f10);
        c0086ac.cJ = Math.min(f13, f11);
        return c0086ac;
    }

    private C0086ac ac(List<com.bytedance.sdk.component.adexpress.dynamic.ac.hm> list, float f10, float f11) {
        float f12;
        CJ(list);
        C0086ac c0086ac = new C0086ac();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (com.bytedance.sdk.component.adexpress.dynamic.ac.hm hmVar : list) {
            com.bytedance.sdk.component.adexpress.dynamic.ac.ROR fl2 = hmVar.WAv().fl();
            if (fl2.dVA() == 1 || fl2.dVA() == 2) {
                arrayList.add(hmVar);
            }
            if (fl2.dVA() != 1 && fl2.dVA() != 2) {
                arrayList2.add(hmVar);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ac((com.bytedance.sdk.component.adexpress.dynamic.ac.hm) it.next(), f10, f11);
        }
        if (arrayList2.size() <= 0) {
            return c0086ac;
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(Float.valueOf(ac((com.bytedance.sdk.component.adexpress.dynamic.ac.hm) it2.next(), f10, f11).Qhi));
        }
        ArrayList arrayList4 = new ArrayList();
        int i10 = 0;
        while (true) {
            if (i10 >= arrayList2.size()) {
                break;
            }
            com.bytedance.sdk.component.adexpress.dynamic.ac.hm hmVar2 = (com.bytedance.sdk.component.adexpress.dynamic.ac.hm) arrayList2.get(i10);
            String aP = hmVar2.WAv().fl().aP();
            float Sf = hmVar2.Sf();
            boolean equals = TextUtils.equals(aP, "flex");
            if (TextUtils.equals(aP, "auto")) {
                List<List<com.bytedance.sdk.component.adexpress.dynamic.ac.hm>> HzH = hmVar2.HzH();
                if (HzH != null && HzH.size() > 0) {
                    for (List<com.bytedance.sdk.component.adexpress.dynamic.ac.hm> list2 : HzH) {
                        if (cJ(list2)) {
                            equals = true;
                            break;
                        }
                    }
                }
                equals = false;
            }
            Qhi qhi = new Qhi();
            if (!equals) {
                Sf = ((Float) arrayList3.get(i10)).floatValue();
            }
            qhi.Qhi = Sf;
            qhi.cJ = !equals;
            if (equals) {
                f12 = ((Float) arrayList3.get(i10)).floatValue();
            }
            qhi.f8164ac = f12;
            arrayList4.add(qhi);
            i10++;
        }
        Qhi(arrayList4, f10, arrayList2);
        List<Qhi> Qhi2 = zc.Qhi(f10, arrayList4);
        float f13 = 0.0f;
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            f13 += Qhi2.get(i11).Qhi;
            if (((Float) arrayList3.get(i11)).floatValue() != Qhi2.get(i11).Qhi) {
                CJ((com.bytedance.sdk.component.adexpress.dynamic.ac.hm) arrayList2.get(i11));
            }
        }
        Iterator it3 = arrayList2.iterator();
        int i12 = 0;
        boolean z10 = false;
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            i12++;
            if (!cJ((com.bytedance.sdk.component.adexpress.dynamic.ac.hm) it3.next())) {
                z10 = false;
                break;
            } else if (i12 == arrayList2.size()) {
                z10 = true;
            }
        }
        f12 = z10 ? f11 : 0.0f;
        ArrayList arrayList5 = new ArrayList();
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            com.bytedance.sdk.component.adexpress.dynamic.ac.hm hmVar3 = (com.bytedance.sdk.component.adexpress.dynamic.ac.hm) arrayList2.get(i13);
            C0086ac ac2 = ac(hmVar3, Qhi2.get(i13).Qhi, f11);
            if (!cJ(hmVar3)) {
                f12 = Math.max(f12, ac2.cJ);
            }
            arrayList5.add(ac2);
        }
        ArrayList arrayList6 = new ArrayList();
        Iterator it4 = arrayList5.iterator();
        while (it4.hasNext()) {
            arrayList6.add(Float.valueOf(((C0086ac) it4.next()).cJ));
        }
        if (!z10) {
            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                com.bytedance.sdk.component.adexpress.dynamic.ac.hm hmVar4 = (com.bytedance.sdk.component.adexpress.dynamic.ac.hm) arrayList2.get(i14);
                if (cJ(hmVar4) && ((Float) arrayList6.get(i14)).floatValue() != f12) {
                    CJ(hmVar4);
                    ac(hmVar4, Qhi2.get(i14).Qhi, f12);
                }
            }
        }
        c0086ac.Qhi = f13;
        c0086ac.cJ = f12;
        return c0086ac;
    }

    private boolean cJ(List<com.bytedance.sdk.component.adexpress.dynamic.ac.hm> list) {
        boolean z10;
        List<List<com.bytedance.sdk.component.adexpress.dynamic.ac.hm>> HzH;
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.ac.hm> it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                if (TextUtils.equals(it.next().WAv().fl().aP(), "flex")) {
                    z10 = true;
                    break;
                }
            } else {
                z10 = false;
                break;
            }
        }
        if (z10) {
            return true;
        }
        while (true) {
            boolean z11 = false;
            for (com.bytedance.sdk.component.adexpress.dynamic.ac.hm hmVar : list) {
                if (TextUtils.equals(hmVar.WAv().fl().aP(), "auto") && (HzH = hmVar.HzH()) != null) {
                    int i10 = 0;
                    for (List<com.bytedance.sdk.component.adexpress.dynamic.ac.hm> list2 : HzH) {
                        i10++;
                        if (!cJ(list2)) {
                            break;
                        } else if (i10 == list2.size()) {
                            z11 = true;
                        }
                    }
                    continue;
                }
            }
            return z11;
        }
    }

    private String fl(com.bytedance.sdk.component.adexpress.dynamic.ac.hm hmVar) {
        return hmVar.ac();
    }

    private C0086ac cJ(List<com.bytedance.sdk.component.adexpress.dynamic.ac.hm> list, float f10, float f11) {
        C0086ac Qhi2 = Qhi(list);
        if (Qhi2 == null || (Qhi2.Qhi == 0.0f && Qhi2.cJ == 0.0f)) {
            C0086ac ac2 = ac(list, f10, f11);
            Qhi(list, ac2);
            return ac2;
        }
        return Qhi2;
    }

    private boolean cJ(com.bytedance.sdk.component.adexpress.dynamic.ac.hm hmVar) {
        if (hmVar == null) {
            return false;
        }
        if (TextUtils.equals(hmVar.WAv().fl().Eh(), "flex")) {
            return true;
        }
        return ac(hmVar);
    }

    private void CJ(com.bytedance.sdk.component.adexpress.dynamic.ac.hm hmVar) {
        this.Qhi.remove(fl(hmVar));
        List<List<com.bytedance.sdk.component.adexpress.dynamic.ac.hm>> HzH = hmVar.HzH();
        if (HzH == null || HzH.size() <= 0) {
            return;
        }
        for (List<com.bytedance.sdk.component.adexpress.dynamic.ac.hm> list : HzH) {
            ac(list);
        }
    }

    private String CJ(List<com.bytedance.sdk.component.adexpress.dynamic.ac.hm> list) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < list.size(); i10++) {
            String ac2 = list.get(i10).ac();
            if (i10 < list.size() - 1) {
                sb2.append(ac2);
                sb2.append("-");
            } else {
                sb2.append(ac2);
            }
        }
        return sb2.toString();
    }

    private boolean ac(com.bytedance.sdk.component.adexpress.dynamic.ac.hm hmVar) {
        List<List<com.bytedance.sdk.component.adexpress.dynamic.ac.hm>> HzH;
        if (!hmVar.kYc() && TextUtils.equals(hmVar.WAv().fl().Eh(), "auto") && (HzH = hmVar.HzH()) != null && HzH.size() > 0) {
            if (HzH.size() == 1) {
                for (com.bytedance.sdk.component.adexpress.dynamic.ac.hm hmVar2 : HzH.get(0)) {
                    if (!cJ(hmVar2)) {
                        return false;
                    }
                }
                return true;
            }
            for (List<com.bytedance.sdk.component.adexpress.dynamic.ac.hm> list : HzH) {
                if (Qhi(list, true)) {
                    return true;
                }
            }
        }
        return false;
    }

    private void ac(List<com.bytedance.sdk.component.adexpress.dynamic.ac.hm> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        this.cJ.remove(CJ(list));
        for (com.bytedance.sdk.component.adexpress.dynamic.ac.hm hmVar : list) {
            CJ(hmVar);
        }
    }

    private C0086ac Qhi(String str, cJ cJVar, boolean z10, boolean z11, int i10, com.bytedance.sdk.component.adexpress.dynamic.ac.hm hmVar) {
        return ABk.Qhi(str, hmVar.WAv().cJ(), cJ.Qhi(cJVar).toString(), z10, z11, i10, hmVar, this.f8162fl, this.Tgh, this.ROR, this.Sf, this.f8163hm);
    }

    private void Qhi(List<List<com.bytedance.sdk.component.adexpress.dynamic.ac.hm>> list, float f10, float f11) {
        if (list == null || list.size() <= 0) {
            return;
        }
        boolean z10 = false;
        for (List<com.bytedance.sdk.component.adexpress.dynamic.ac.hm> list2 : list) {
            if (Qhi(list2, false)) {
                z10 = true;
            }
        }
        ArrayList arrayList = new ArrayList();
        for (List<com.bytedance.sdk.component.adexpress.dynamic.ac.hm> list3 : list) {
            Qhi qhi = new Qhi();
            boolean Qhi2 = Qhi(list3, !z10);
            qhi.Qhi = Qhi2 ? 1.0f : cJ(list3, f10, f11).cJ;
            qhi.cJ = !Qhi2;
            arrayList.add(qhi);
        }
        List<Qhi> Qhi3 = zc.Qhi(f11, arrayList);
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (((Qhi) arrayList.get(i10)).Qhi != Qhi3.get(i10).Qhi) {
                List<com.bytedance.sdk.component.adexpress.dynamic.ac.hm> list4 = list.get(i10);
                ac(list4);
                cJ(list4, f10, Qhi3.get(i10).Qhi);
            }
        }
    }

    private boolean Qhi(List<com.bytedance.sdk.component.adexpress.dynamic.ac.hm> list, boolean z10) {
        boolean z11;
        for (com.bytedance.sdk.component.adexpress.dynamic.ac.hm hmVar : list) {
            com.bytedance.sdk.component.adexpress.dynamic.ac.ROR fl2 = hmVar.WAv().fl();
            String Eh = fl2.Eh();
            if (TextUtils.equals(Eh, "flex") || (z10 && ((TextUtils.equals(fl2.aP(), "flex") && TextUtils.equals(fl2.Eh(), "scale") && com.bytedance.sdk.component.adexpress.dynamic.ac.Tgh.Qhi.get(hmVar.WAv().cJ()).intValue() == 7) || TextUtils.equals(Eh, "flex")))) {
                z11 = true;
                break;
            }
        }
        z11 = false;
        if (z11) {
            return true;
        }
        for (com.bytedance.sdk.component.adexpress.dynamic.ac.hm hmVar2 : list) {
            if (ac(hmVar2)) {
                return true;
            }
        }
        return false;
    }

    private void Qhi(List<Qhi> list, float f10, List<com.bytedance.sdk.component.adexpress.dynamic.ac.hm> list2) {
        float f11 = 0.0f;
        for (Qhi qhi : list) {
            if (qhi.cJ) {
                f11 += qhi.Qhi;
            }
        }
        if (f11 > f10) {
            int i10 = 0;
            for (int i11 = 0; i11 < list2.size(); i11++) {
                if (list.get(i11).cJ && list2.get(i11).EBS()) {
                    i10++;
                }
            }
            if (i10 > 0) {
                float ceil = (float) (Math.ceil(((f11 - f10) / i10) * 1000.0f) / 1000.0d);
                for (int i12 = 0; i12 < list2.size(); i12++) {
                    Qhi qhi2 = list.get(i12);
                    if (qhi2.cJ && list2.get(i12).EBS()) {
                        qhi2.Qhi -= ceil;
                    }
                }
            }
        }
    }

    public void Qhi() {
        this.f8161ac.clear();
        this.Qhi.clear();
        this.cJ.clear();
    }

    public C0086ac Qhi(com.bytedance.sdk.component.adexpress.dynamic.ac.hm hmVar) {
        return this.Qhi.get(fl(hmVar));
    }

    public C0086ac Qhi(List<com.bytedance.sdk.component.adexpress.dynamic.ac.hm> list) {
        return this.cJ.get(CJ(list));
    }

    private void Qhi(com.bytedance.sdk.component.adexpress.dynamic.ac.hm hmVar, C0086ac c0086ac) {
        this.Qhi.put(fl(hmVar), c0086ac);
    }

    private void Qhi(List<com.bytedance.sdk.component.adexpress.dynamic.ac.hm> list, C0086ac c0086ac) {
        this.cJ.put(CJ(list), c0086ac);
    }
}
