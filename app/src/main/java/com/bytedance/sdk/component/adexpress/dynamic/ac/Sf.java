package com.bytedance.sdk.component.adexpress.dynamic.ac;

import android.graphics.Color;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import com.bytedance.sdk.component.adexpress.CJ.CQU;
import com.bytedance.sdk.component.adexpress.dynamic.CJ.ABk;
import com.inmobi.media.C1646h;
import org.json.JSONObject;

/* compiled from: DynamicLayoutNativeValue.java */
/* loaded from: classes.dex */
public class Sf {
    private ROR CJ;
    public int Qhi;
    private String Tgh;

    /* renamed from: ac  reason: collision with root package name */
    public JSONObject f8186ac;
    public String cJ;

    /* renamed from: fl  reason: collision with root package name */
    private Tgh f8187fl;

    public Sf(Tgh tgh) {
        this.f8187fl = tgh;
        this.Qhi = tgh.Qhi();
        this.cJ = tgh.ac();
        this.f8186ac = tgh.fl().EGK();
        this.Tgh = tgh.CJ();
        if (com.bytedance.sdk.component.adexpress.fl.ac() == 1) {
            this.CJ = tgh.ROR();
        } else {
            this.CJ = tgh.fl();
        }
        if (com.bytedance.sdk.component.adexpress.fl.cJ()) {
            this.CJ = tgh.fl();
        }
    }

    private boolean Oy() {
        if (com.bytedance.sdk.component.adexpress.fl.cJ()) {
            return false;
        }
        if ((TextUtils.isEmpty(this.cJ) || !this.cJ.contains("adx:")) && !ABk.cJ()) {
            return false;
        }
        return true;
    }

    private boolean SL() {
        if ((com.bytedance.sdk.component.adexpress.fl.cJ() && (this.f8187fl.cJ().contains("logo-union") || this.f8187fl.cJ().contains("logounion") || this.f8187fl.cJ().contains("logoad"))) || "logo-union".equals(this.f8187fl.cJ()) || "logounion".equals(this.f8187fl.cJ()) || "logoad".equals(this.f8187fl.cJ())) {
            return true;
        }
        return false;
    }

    public double ABk() {
        if (this.Qhi == 11) {
            try {
                double parseDouble = Double.parseDouble(this.cJ);
                if (!com.bytedance.sdk.component.adexpress.fl.cJ()) {
                    return (int) parseDouble;
                }
                return parseDouble;
            } catch (NumberFormatException unused) {
            }
        }
        return -1.0d;
    }

    public int CJ() {
        return (int) this.CJ.hpZ();
    }

    public String CQU() {
        return this.CJ.Ls();
    }

    public String Dq() {
        return this.CJ.NFd();
    }

    public String Dww() {
        return this.CJ.yN();
    }

    public boolean EBS() {
        return this.CJ.xyz();
    }

    public String EGK() {
        return this.CJ.Ki();
    }

    public int Eh() {
        String yN = this.CJ.yN();
        if (!"skip-with-time-skip-btn".equals(this.f8187fl.cJ()) && !"skip".equals(this.f8187fl.cJ()) && !TextUtils.equals("skip-with-countdowns-skip-btn", this.f8187fl.cJ())) {
            if (!"skip-with-time-countdown".equals(this.f8187fl.cJ()) && !"skip-with-time".equals(this.f8187fl.cJ())) {
                if (this.Qhi == 10 && TextUtils.equals(this.CJ.FQ(), C1646h.CLICK_BEACON)) {
                    return 5;
                }
                if (SL() && Oy()) {
                    return 0;
                }
                if (SL()) {
                    return 7;
                }
                if ("feedback-dislike".equals(this.f8187fl.cJ())) {
                    return 3;
                }
                if (!TextUtils.isEmpty(yN) && !yN.equals("none")) {
                    if (!yN.equals("video") && (this.f8187fl.Qhi() != 7 || !TextUtils.equals(yN, Constants.NORMAL))) {
                        if (yN.equals(Constants.NORMAL)) {
                            return 1;
                        }
                        if (!yN.equals("creative") && !"slide".equals(this.CJ.FQ())) {
                            return 0;
                        }
                        return 2;
                    } else if (com.bytedance.sdk.component.adexpress.fl.cJ() && this.f8187fl.fl() != null && this.f8187fl.fl().Ug()) {
                        return 11;
                    } else {
                        return 4;
                    }
                }
            }
            return 0;
        }
        return 6;
    }

    public int FQ() {
        return this.CJ.Ura();
    }

    public String Gm() {
        if (this.Qhi == 1) {
            return this.cJ;
        }
        return "";
    }

    public boolean Gy() {
        return this.CJ.cJP();
    }

    public int HLI() {
        return this.CJ.Jma();
    }

    public String Hf() {
        return this.CJ.gT();
    }

    public float HzH() {
        return this.CJ.zc();
    }

    public int Jma() {
        return this.CJ.CJ();
    }

    public int MND() {
        return this.CJ.Px();
    }

    public boolean MQ() {
        return this.CJ.SNp();
    }

    public String NBs() {
        return this.CJ.zTC();
    }

    public double NFd() {
        return this.CJ.Sf();
    }

    public int PAe() {
        return this.CJ.Ri();
    }

    public int PER() {
        return this.CJ.HUk();
    }

    public int Qe() {
        return this.CJ.IC();
    }

    public int Qhi() {
        return (int) this.CJ.iMK();
    }

    public int ROR() {
        return Qhi(this.CJ.EBS());
    }

    public int ReL() {
        return this.CJ.bM();
    }

    public int Ri() {
        return this.CJ.Wrw();
    }

    public int Sf() {
        String qMt = this.CJ.qMt();
        if ("left".equals(qMt)) {
            return 17;
        }
        if ("center".equals(qMt)) {
            return 4;
        }
        if ("right".equals(qMt)) {
            return 3;
        }
        return 2;
    }

    public String Tgh() {
        if (this.Qhi == 0) {
            if (!TextUtils.isEmpty(this.cJ)) {
                return this.cJ;
            }
            return this.f8186ac.optString(CQU.ac(com.bytedance.sdk.component.adexpress.fl.Qhi()));
        }
        return "";
    }

    public int Ura() {
        return this.CJ.TKG();
    }

    public boolean VnT() {
        return this.CJ.XH();
    }

    public String WAv() {
        int i10 = this.Qhi;
        if (i10 != 2 && i10 != 13) {
            return "";
        }
        return this.cJ;
    }

    public int YB() {
        return this.CJ.mZ();
    }

    public int aP() {
        return Qhi(this.CJ.bxS());
    }

    public int ac() {
        return (int) this.CJ.pA();
    }

    public int bxS() {
        return this.CJ.jPH();
    }

    public int cJ() {
        return (int) this.CJ.HzH();
    }

    public boolean cjC() {
        return this.CJ.cJP();
    }

    public boolean dI() {
        return this.CJ.ABk();
    }

    public int dIT() {
        return this.CJ.ne();
    }

    public boolean dVA() {
        return this.CJ.lB();
    }

    public String es() {
        return this.CJ.FQ();
    }

    public String et() {
        return this.CJ.CQU();
    }

    public float fl() {
        return this.CJ.kYc();
    }

    public String gga() {
        return this.CJ.SO();
    }

    public int hm() {
        int Sf = Sf();
        if (Sf == 4) {
            return 17;
        }
        if (Sf == 3) {
            return 8388613;
        }
        return 8388611;
    }

    public int hpZ() {
        return Qhi(this.CJ.pM());
    }

    public double iMK() {
        return this.CJ.tP();
    }

    public String ip() {
        return this.CJ.es();
    }

    public int jPH() {
        return this.CJ.ROR();
    }

    public int js() {
        return this.CJ.hm();
    }

    public int kYc() {
        return this.CJ.HWc();
    }

    public int lB() {
        return this.CJ.cJ();
    }

    public int lG() {
        return this.CJ.fl();
    }

    public double oU() {
        return this.CJ.js();
    }

    public int ots() {
        return this.CJ.lG();
    }

    public float pA() {
        return this.CJ.Gm();
    }

    public long pM() {
        return this.CJ.KW();
    }

    public double pv() {
        return this.CJ.zn();
    }

    public String qMt() {
        return this.CJ.Dww();
    }

    public int sDy() {
        return this.CJ.ac();
    }

    public int tP() {
        return this.CJ.YD();
    }

    public boolean xyz() {
        return this.CJ.vml();
    }

    public boolean yN() {
        return this.CJ.VnT();
    }

    public String zc() {
        return this.Tgh;
    }

    public String zjb() {
        return this.CJ.sDy();
    }

    public String zn() {
        return this.CJ.WAv();
    }

    public static float[] cJ(String str) {
        String[] split = str.substring(str.indexOf("(") + 1, str.indexOf(")")).split(",");
        return (split == null || split.length != 4) ? new float[]{0.0f, 0.0f, 0.0f, 0.0f} : new float[]{Float.parseFloat(split[0]), Float.parseFloat(split[1]), Float.parseFloat(split[2]), Float.parseFloat(split[3])};
    }

    public void Qhi(float f10) {
        this.CJ.Qhi(f10);
    }

    public static int Qhi(String str) {
        String[] split;
        if (TextUtils.isEmpty(str)) {
            return -16777216;
        }
        if (str.equals("transparent")) {
            return 0;
        }
        if (str.charAt(0) == '#' && str.length() == 7) {
            return Color.parseColor(str);
        }
        if (str.charAt(0) == '#' && str.length() == 9) {
            return Color.parseColor(str);
        }
        if (str.startsWith("rgba") && (split = str.substring(str.indexOf("(") + 1, str.indexOf(")")).split(",")) != null) {
            try {
                if (split.length == 4) {
                    return (((int) ((Float.parseFloat(split[3]) * 255.0f) + 0.5f)) << 24) | (((int) Float.parseFloat(split[0])) << 16) | (((int) Float.parseFloat(split[1])) << 8) | ((int) Float.parseFloat(split[2])) | 0;
                }
            } catch (NumberFormatException unused) {
                return 0;
            }
        }
        return -16777216;
    }

    public boolean Qhi(int i10) {
        Tgh tgh = this.f8187fl;
        if (tgh == null) {
            return false;
        }
        if (i10 == 1) {
            this.CJ = tgh.ROR();
        } else {
            this.CJ = tgh.fl();
        }
        return this.CJ != null;
    }
}
