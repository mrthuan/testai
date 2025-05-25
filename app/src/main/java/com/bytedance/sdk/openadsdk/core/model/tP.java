package com.bytedance.sdk.openadsdk.core.model;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.utils.Jma;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MaterialMeta.java */
/* loaded from: classes.dex */
public abstract class tP {
    private long Qhi = 0;

    /* compiled from: MaterialMeta.java */
    /* loaded from: classes.dex */
    public static class Qhi {
        private String ABk;
        private String CJ;
        private String Gm;
        private String Qhi;
        private String ROR;
        private List<Integer> Sf;
        private String Tgh;
        private String WAv;

        /* renamed from: ac  reason: collision with root package name */
        private String f9114ac;
        private String cJ;

        /* renamed from: fl  reason: collision with root package name */
        private String f9115fl;

        /* renamed from: hm  reason: collision with root package name */
        private String f9116hm;

        /* renamed from: zc  reason: collision with root package name */
        private String f9117zc;

        public static com.bytedance.sdk.component.adexpress.Qhi.ac.fl Qhi(Qhi qhi, String str) {
            return com.bytedance.sdk.component.adexpress.Qhi.ac.fl.Qhi().Qhi(qhi.fl()).cJ(qhi.Tgh()).ac(qhi.ROR()).CJ(qhi.Sf()).fl(qhi.CJ()).Tgh(str);
        }

        public static com.bytedance.sdk.openadsdk.core.ugen.fl.Qhi cJ(Qhi qhi, String str) {
            return new com.bytedance.sdk.openadsdk.core.ugen.fl.Qhi().Qhi(qhi.fl()).cJ(qhi.pA()).ac(qhi.iMK()).CJ(qhi.hpZ()).fl(str);
        }

        public boolean ABk() {
            if (!TextUtils.isEmpty(this.f9116hm) && this.f9116hm.equals("v3")) {
                return true;
            }
            return false;
        }

        public String CJ() {
            return this.Tgh;
        }

        public String Gm() {
            return this.WAv;
        }

        public String ROR() {
            return this.f9114ac;
        }

        public String Sf() {
            return this.CJ;
        }

        public String Tgh() {
            return this.cJ;
        }

        public String WAv() {
            return this.ROR;
        }

        public List<Integer> ac() {
            return this.Sf;
        }

        public String fl() {
            return this.Qhi;
        }

        public String hm() {
            return this.f9115fl;
        }

        public String hpZ() {
            return this.ABk;
        }

        public String iMK() {
            return this.Gm;
        }

        public String pA() {
            return this.f9117zc;
        }

        public String zc() {
            return this.f9116hm;
        }

        public void CJ(String str) {
            this.f9114ac = str;
        }

        public void Gm(String str) {
            this.f9117zc = str;
        }

        public void ROR(String str) {
            this.ROR = str;
        }

        public void Sf(String str) {
            this.WAv = str;
        }

        public void Tgh(String str) {
            this.f9115fl = str;
        }

        public void WAv(String str) {
            this.Gm = str;
        }

        public void ac(String str) {
            this.cJ = str;
        }

        public void fl(String str) {
            this.CJ = str;
        }

        public void hm(String str) {
            this.f9116hm = str;
        }

        public void zc(String str) {
            this.ABk = str;
        }

        public void cJ(String str) {
            this.Qhi = str;
        }

        public void Qhi(List<Integer> list) {
            this.Sf = list;
        }

        public void Qhi(String str) {
            this.Tgh = str;
        }
    }

    public static boolean CJ(tP tPVar) {
        return (tPVar == null || tPVar.FQ() == null || tPVar.FQ().Qhi() != 1) ? false : true;
    }

    private static double Tgh(JSONObject jSONObject) {
        if (jSONObject != null) {
            return jSONObject.optDouble("pack_time", 0.0d);
        }
        return 0.0d;
    }

    public static boolean ac(tP tPVar) {
        return (tPVar == null || tPVar.FQ() == null || tPVar.FQ().CJ() != 7 || bxS.cJ(tPVar)) ? false : true;
    }

    public static boolean fl(tP tPVar) {
        if (tPVar == null) {
            return false;
        }
        int gga = tPVar.gga();
        return tPVar.IC() || gga == 5 || gga == 15 || gga == 50;
    }

    public abstract int ABk();

    public abstract void ABk(int i10);

    public abstract void ABk(String str);

    public abstract void CJ(int i10);

    public abstract void CJ(JSONObject jSONObject);

    public abstract void CJ(boolean z10);

    public abstract boolean CJ();

    public abstract int CQU();

    public abstract String CQU(String str);

    public abstract void CQU(int i10);

    public abstract String DS();

    public abstract boolean DaO();

    public abstract String Dq();

    public abstract int Dww();

    public abstract void Dww(int i10);

    public abstract void Dww(String str);

    public abstract int EBS();

    public abstract void EBS(int i10);

    public abstract void EBS(String str);

    public abstract String EGK();

    public abstract String Eh();

    public abstract void Eh(int i10);

    public abstract void Eh(String str);

    public abstract boolean Em();

    public abstract boolean Ewb();

    public abstract com.bykv.vk.openvk.component.video.api.ac.cJ FQ();

    public abstract void FQ(int i10);

    public abstract boolean GN();

    public abstract fl Gm();

    public abstract void Gm(int i10);

    public abstract void Gm(String str);

    public abstract Map<String, Object> Gy();

    public abstract String HLI();

    public abstract boolean HUk();

    public abstract boolean HWc();

    public abstract List<String> Hf();

    public abstract int Hy();

    public abstract int HzH();

    public abstract void HzH(int i10);

    public abstract void HzH(String str);

    public abstract boolean IC();

    public abstract String Jma();

    public abstract void Jma(int i10);

    public abstract JSONObject KW();

    public abstract com.bykv.vk.openvk.component.video.api.ac.cJ Ki();

    public abstract int LcF();

    public abstract boolean LpL();

    public abstract boolean Ls();

    public abstract String MIe();

    public abstract int MND();

    public abstract String MQ();

    public abstract void MQ(int i10);

    public abstract void MQ(String str);

    public abstract List<String> NBs();

    public abstract int NFd();

    public abstract void NFd(int i10);

    public abstract EBS NLs();

    public abstract com.bykv.vk.openvk.component.video.api.ac.cJ Ohm();

    public abstract float Oy();

    public abstract String PAe();

    public abstract void PAe(int i10);

    public abstract boolean PER();

    public abstract void Px();

    public abstract hpZ Qe();

    public abstract void Qhi(double d10);

    public abstract void Qhi(float f10);

    public abstract void Qhi(int i10);

    public abstract void Qhi(int i10, int i11);

    public abstract void Qhi(com.bykv.vk.openvk.component.video.api.ac.cJ cJVar);

    public abstract void Qhi(AdSlot adSlot);

    public abstract void Qhi(FilterWord filterWord);

    public abstract void Qhi(com.bytedance.sdk.openadsdk.core.ROR.Qhi qhi);

    public abstract void Qhi(ABk aBk);

    public abstract void Qhi(EBS ebs);

    public abstract void Qhi(Tgh tgh);

    public abstract void Qhi(WAv wAv);

    public abstract void Qhi(ac acVar);

    public abstract void Qhi(bxS bxs);

    public abstract void Qhi(fl flVar);

    public abstract void Qhi(hpZ hpz);

    public abstract void Qhi(iMK imk);

    public abstract void Qhi(kYc kyc);

    public abstract void Qhi(Qhi qhi);

    public abstract void Qhi(zc zcVar);

    public abstract void Qhi(com.bytedance.sdk.openadsdk.core.ugen.fl.Qhi qhi);

    public abstract void Qhi(Map<String, Object> map);

    public abstract void Qhi(boolean z10);

    public boolean Qhi() {
        int hpZ = hpZ();
        return (EBS() != 2 || hpZ == 5 || hpZ == 6 || hpZ == 19 || hpZ == 12) ? false : true;
    }

    public abstract String ROR();

    public abstract void ROR(int i10);

    public abstract void ROR(String str);

    public abstract void ROR(boolean z10);

    public abstract zc ReL();

    public abstract String Ri();

    public abstract int SL();

    public abstract int SNp();

    public abstract JSONObject SO();

    public abstract void Sf(int i10);

    public abstract void Sf(String str);

    public abstract void Sf(boolean z10);

    public boolean Sf() {
        return (TextUtils.isEmpty(Tgh()) || TextUtils.isEmpty(ROR())) ? false : true;
    }

    public abstract boolean TGC();

    public abstract int TKG();

    public abstract String Tgh();

    public abstract void Tgh(int i10);

    public abstract void Tgh(String str);

    public abstract void Tgh(boolean z10);

    public abstract boolean Ttc();

    public abstract int Ug();

    public abstract long Ura();

    public abstract boolean VV();

    public abstract List<FilterWord> VnT();

    public abstract Tgh WAv();

    public abstract void WAv(int i10);

    public abstract void WAv(String str);

    public abstract int Wrw();

    public abstract int XH();

    public abstract boolean Xx();

    public abstract int XyJ();

    public abstract boolean YAV();

    public abstract String YB();

    public abstract boolean YCN();

    public abstract int YD();

    public abstract boolean ZRq();

    public abstract int aP();

    public abstract void aP(int i10);

    public abstract void aP(String str);

    public abstract void ac(int i10);

    public abstract void ac(long j10);

    public abstract void ac(com.bykv.vk.openvk.component.video.api.ac.cJ cJVar);

    public abstract void ac(hpZ hpz);

    public abstract void ac(JSONObject jSONObject);

    public abstract void ac(boolean z10);

    public abstract com.bytedance.sdk.openadsdk.core.ugen.fl.Qhi af();

    public abstract String bIO();

    public abstract String bM();

    public abstract void bxS(int i10);

    public abstract void bxS(String str);

    public abstract boolean bxS();

    public abstract String cBj();

    public long cJ() {
        return this.Qhi;
    }

    public abstract void cJ(double d10);

    public abstract void cJ(int i10);

    public abstract void cJ(long j10);

    public abstract void cJ(com.bykv.vk.openvk.component.video.api.ac.cJ cJVar);

    public abstract void cJ(hpZ hpz);

    public abstract void cJ(com.bytedance.sdk.openadsdk.core.ugen.fl.Qhi qhi);

    public abstract void cJ(JSONObject jSONObject);

    public abstract void cJ(boolean z10);

    public abstract com.bytedance.sdk.openadsdk.core.ROR.Qhi cJP();

    public abstract boolean cfS();

    public abstract List<hpZ> cjC();

    public abstract boolean czB();

    public abstract List<String> dI();

    public abstract hpZ dIT();

    public abstract String dVA();

    public abstract iMK eG();

    public abstract int eN();

    public abstract boolean ejU();

    public abstract Qhi es();

    public abstract void es(int i10);

    public abstract JSONObject et();

    public abstract void fl(int i10);

    public abstract void fl(String str);

    public abstract void fl(boolean z10);

    public abstract boolean fl();

    public abstract long gSh();

    public abstract boolean gT();

    public abstract int gga();

    public abstract void gt();

    public abstract boolean hU();

    public abstract kYc hm();

    public abstract void hm(int i10);

    public abstract void hm(String str);

    public abstract void hm(boolean z10);

    public abstract int hpZ();

    public abstract void hpZ(int i10);

    public abstract void hpZ(String str);

    public abstract long iMK();

    public abstract void iMK(int i10);

    public abstract void iMK(String str);

    public abstract boolean iWr();

    public abstract void id();

    public abstract int ip();

    public abstract void ip(int i10);

    public abstract void is();

    public abstract int jN();

    public abstract boolean jPH();

    public abstract String jWV();

    public abstract void js(int i10);

    public abstract boolean js();

    public abstract int kYc();

    public abstract void kYc(int i10);

    public abstract void kYc(String str);

    public abstract AdSlot lB();

    public abstract void lB(int i10);

    public abstract int lG();

    public abstract void lG(int i10);

    public abstract JSONObject mZ();

    public abstract int mz();

    public abstract int nR();

    public abstract com.bytedance.sdk.component.widget.cJ.Qhi ne();

    public abstract String oU();

    public abstract String ots();

    public abstract bxS pA();

    public abstract void pA(int i10);

    public abstract void pA(String str);

    public abstract int pF();

    public abstract int pM();

    public abstract void pM(int i10);

    public abstract void pM(String str);

    public abstract ac pv();

    public abstract int qMt();

    public abstract void qMt(int i10);

    public abstract void qMt(String str);

    public abstract boolean qb();

    public abstract boolean rB();

    public abstract boolean rP();

    public abstract WAv sDy();

    public abstract void sDy(int i10);

    public abstract long sRC();

    public abstract boolean smJ();

    public abstract int sqa();

    public abstract int tP();

    public abstract void tP(int i10);

    public abstract void tP(String str);

    public abstract int tcw();

    public abstract Jma up();

    public abstract String usK();

    public abstract boolean uyf();

    public abstract int vml();

    public abstract void wI();

    public abstract String wa();

    public abstract JSONObject wp();

    public abstract com.bytedance.sdk.openadsdk.core.ugen.fl.Qhi wv();

    public abstract void xyz(int i10);

    public abstract boolean xyz();

    public abstract double yBk();

    public abstract int yN();

    public abstract void yN(int i10);

    public abstract boolean yoW();

    public abstract int yt();

    public abstract String yy();

    public abstract int zTC();

    public abstract int zc();

    public abstract void zc(int i10);

    public abstract void zc(String str);

    public abstract String zjb();

    public abstract int zn();

    public abstract void zn(int i10);

    public static JSONObject ac(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return new JSONObject(str);
            } catch (JSONException e10) {
                com.bytedance.sdk.component.utils.ABk.Qhi("MaterialMeta", e10.getMessage());
            }
        }
        return null;
    }

    public static boolean cJ(tP tPVar) {
        return (Qhi(tPVar) || ac(tPVar)) ? false : true;
    }

    public static int CJ(String str) {
        return Qhi(ac(str));
    }

    public static double cJ(String str) {
        return Tgh(ac(str));
    }

    private static long fl(JSONObject jSONObject) {
        if (jSONObject != null) {
            return jSONObject.optLong("uid", 0L);
        }
        return 0L;
    }

    public void Qhi(long j10) {
        this.Qhi = j10;
    }

    public static boolean Qhi(tP tPVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        if (Qhi(tPVar) || z13 || tPVar == null || tPVar.FQ() == null || TextUtils.isEmpty(tPVar.FQ().zc())) {
            return false;
        }
        return ac(tPVar) ? z12 : (tPVar.FQ() == null || tPVar.FQ().Qhi() != 1) ? z10 : z11;
    }

    public static tP ac() {
        return new Dww();
    }

    public static String cJ(Context context, tP tPVar) {
        if (context != null && tPVar != null) {
            try {
                if (tPVar.ip() == 8) {
                    String Qhi2 = com.bytedance.sdk.openadsdk.core.act.Qhi.Qhi(context);
                    if (TextUtils.isEmpty(Qhi2)) {
                        return null;
                    }
                    return Qhi2;
                }
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.ABk.Qhi("MaterialMeta", th2.getMessage());
            }
        }
        return null;
    }

    public static boolean Qhi(tP tPVar) {
        return (tPVar == null || tPVar.FQ() == null || tPVar.FQ().CJ() != 1) ? false : true;
    }

    public static com.bytedance.sdk.openadsdk.core.video.Qhi.cJ Qhi(String str, tP tPVar) {
        tPVar.js(0);
        int sqa = tPVar.sqa();
        int i10 = 3;
        if (sqa == 3) {
            i10 = 4;
        } else if (sqa == 7) {
            i10 = 1;
        } else if (sqa == 8) {
            i10 = 2;
        }
        return new com.bytedance.sdk.openadsdk.core.video.Qhi.cJ(str, tPVar.Ohm(), tPVar.Ki(), tPVar.zTC(), tPVar.LcF(), i10);
    }

    public static long Qhi(String str) {
        return fl(ac(str));
    }

    public static int Qhi(JSONObject jSONObject) {
        if (jSONObject != null) {
            return jSONObject.optInt("ut", 0);
        }
        return 0;
    }

    public static String Qhi(Context context, tP tPVar) {
        if (context == null || tPVar == null || !((tPVar.sqa() == 8 || tPVar.sqa() == 7) && tPVar.js())) {
            return null;
        }
        String cJ = cJ(context, tPVar);
        if (TextUtils.isEmpty(cJ) || com.bytedance.sdk.openadsdk.core.act.Qhi.Qhi() != 1) {
            return null;
        }
        return cJ;
    }
}
