package com.bytedance.sdk.component.adexpress.dynamic.ac;

import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import com.inmobi.media.C1646h;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lib.zj.office.fc.openxml4j.opc.PackagingURIHelper;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: DynamicLayoutBrickValue.java */
/* loaded from: classes.dex */
public class ROR {
    private String ABk;
    private float CJ;
    private boolean CQU;
    private int DaO;
    private boolean Dq;
    private String Dww;
    private String EBS;
    private int EGK;
    private int Eh;
    private int FQ;
    private double Gm;
    private int Gy;
    private boolean HLI;
    private boolean HUk;
    private int HWc;
    private boolean Hf;
    private String HzH;
    private double IC;
    private String Jma;
    private String KW;
    private int Ki;
    private String LcF;
    private String Ls;
    private boolean MND;
    private String MQ;
    private boolean NBs;
    private double NFd;
    private boolean Ohm;
    private List<Qhi> Oy;
    private int PAe;
    private boolean PER;
    private int Px;
    private boolean Qe;
    private float Qhi;
    private float ROR;
    private int ReL;
    private String Ri;
    private int SL;
    private int SNp;
    private int SO;
    private float Sf;
    private boolean TKG;
    private float Tgh;
    private String Ug;
    private String Ura;
    private JSONObject VV;
    private int VnT;
    private float WAv;
    private int Wrw;
    private boolean XH;
    private int YB;
    private int YD;
    private double aP;

    /* renamed from: ac  reason: collision with root package name */
    private float f8179ac;
    private int bM;
    private String bxS;
    private float cJ;
    private JSONObject cJP;
    private String cjC;
    private boolean dI;
    private int dIT;
    private String dVA;
    private int eG;
    private String eN;
    private int es;
    private int et;

    /* renamed from: fl  reason: collision with root package name */
    private boolean f8180fl;
    private JSONObject gT;
    private int gga;

    /* renamed from: hm  reason: collision with root package name */
    private float f8181hm;
    private String hpZ;
    private String iMK;

    /* renamed from: ip  reason: collision with root package name */
    private int f8182ip;
    private int jPH;
    private String js;
    private String kYc;
    private String lB;
    private String lG;
    private int mZ;
    private int mz;

    /* renamed from: ne  reason: collision with root package name */
    private int f8183ne;
    private int oU;
    private int ots;
    private String pA;
    private String pF;
    private int pM;
    private int pv;
    private String qMt;
    private int rB;
    private String sDy;
    private String sRC;
    private long sqa = -1;
    private String tP;
    private boolean vml;
    private boolean wp;
    private double xyz;
    private int yN;
    private int yy;
    private boolean zTC;

    /* renamed from: zc  reason: collision with root package name */
    private double f8184zc;
    private JSONObject zjb;

    /* renamed from: zn  reason: collision with root package name */
    private boolean f8185zn;

    private void Eh(String str) {
        this.eN = str;
    }

    public static ROR Qhi(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        ROR ror = new ROR();
        ror.cJ(jSONObject.optString("adType", "embeded"));
        ror.pA(jSONObject.optString("clickArea", "creative"));
        ror.hpZ(jSONObject.optString("clickTigger", C1646h.CLICK_BEACON));
        ror.ac(jSONObject.optString("fontFamily", "PingFangSC"));
        ror.CJ(jSONObject.optString("textAlign", "left"));
        ror.fl(jSONObject.optString("color", "#999999"));
        ror.Tgh(jSONObject.optString("bgColor", "transparent"));
        ror.ROR(jSONObject.optString("bgImgUrl", ""));
        ror.Eh(jSONObject.optString("bgImgData", ""));
        ror.Sf(jSONObject.optString("borderColor", "#000000"));
        ror.hm(jSONObject.optString("borderStyle", "solid"));
        ror.WAv(jSONObject.optString("heightMode", "auto"));
        ror.Gm(jSONObject.optString("widthMode", "fixed"));
        ror.zc(jSONObject.optString("interactText", ""));
        ror.ac(jSONObject.optBoolean("isShowBgControl", false));
        ror.ABk(jSONObject.optString("interactBgColor", ""));
        JSONObject optJSONObject = jSONObject.optJSONObject("interactPosition");
        if (optJSONObject != null) {
            ror.ROR(optJSONObject.optInt("translateY", 0));
            ror.Sf(optJSONObject.optInt("translateX", 0));
            ror.CJ(optJSONObject.optDouble("scaleX", 0.0d));
            ror.fl(optJSONObject.optDouble("scaleY", 0.0d));
        }
        ror.iMK(jSONObject.optString("interactType", ""));
        ror.fl(jSONObject.optInt("interactSlideDirection", -1));
        ror.HzH(jSONObject.optString("justifyHorizontal", "space-around"));
        ror.kYc(jSONObject.optString("justifyVertical", "flex-start"));
        ror.cJ(jSONObject.optDouble("timingStart"));
        ror.ac(jSONObject.optDouble("timingEnd"));
        ror.CJ((float) jSONObject.optDouble(InMobiNetworkValues.WIDTH, 0.0d));
        ror.ac((float) jSONObject.optDouble(InMobiNetworkValues.HEIGHT, 0.0d));
        ror.Qhi((float) jSONObject.optDouble("borderRadius", 0.0d));
        ror.cJ((float) jSONObject.optDouble("borderSize", 0.0d));
        ror.cJ(jSONObject.optBoolean("interactValidate", false));
        ror.hm((float) jSONObject.optDouble("fontSize", 0.0d));
        ror.fl((float) jSONObject.optDouble("paddingBottom", 0.0d));
        ror.Tgh((float) jSONObject.optDouble("paddingLeft", 0.0d));
        ror.ROR((float) jSONObject.optDouble("paddingRight", 0.0d));
        ror.Sf((float) jSONObject.optDouble("paddingTop", 0.0d));
        ror.CJ(jSONObject.optBoolean("lineFeed", false));
        ror.hm(jSONObject.optInt("lineCount", 0));
        ror.Tgh(jSONObject.optDouble("lineHeight", 1.2d));
        ror.iMK(jSONObject.optInt("letterSpacing", 0));
        ror.fl(jSONObject.optBoolean("isDataFixed", false));
        ror.pA(jSONObject.optInt("fontWeight"));
        ror.Tgh(jSONObject.optBoolean("lineLimit"));
        ror.hpZ(jSONObject.optInt("position"));
        ror.tP(jSONObject.optString("align"));
        ror.ROR(jSONObject.optBoolean("useLeft"));
        ror.Sf(jSONObject.optBoolean("useRight"));
        ror.hm(jSONObject.optBoolean("useTop"));
        ror.WAv(jSONObject.optBoolean("useBottom"));
        ror.MQ(jSONObject.optString("data"));
        ror.cJ(jSONObject.optJSONObject("i18n"));
        ror.zc(jSONObject.optInt("marginLeft"));
        ror.ABk(jSONObject.optInt("marginRight"));
        ror.WAv(jSONObject.optInt("marginTop"));
        ror.Gm(jSONObject.optInt("marginBottom"));
        ror.HzH(jSONObject.optInt("tagMaxCount"));
        ror.Gm(jSONObject.optBoolean("allowTextFlow"));
        ror.kYc(jSONObject.optInt("textFlowType"));
        ror.tP(jSONObject.optInt("textFlowDuration"));
        ror.MQ(jSONObject.optInt("left"));
        ror.qMt(jSONObject.optInt("right"));
        ror.EBS(jSONObject.optInt("top"));
        ror.bxS(jSONObject.optInt("bottom"));
        ror.qMt(jSONObject.optString("alignItems", "flex-start"));
        ror.EBS(jSONObject.optString("direction", ""));
        ror.Qhi(jSONObject.optBoolean("loop", false));
        ror.Dww(jSONObject.optInt("zIndex"));
        ror.NFd(jSONObject.optInt("interactVisibleTime"));
        ror.CQU(jSONObject.optInt("interactHiddenTime"));
        ror.ABk(jSONObject.optBoolean("interactEnableMask"));
        ror.iMK(jSONObject.optBoolean("interactWontHide"));
        ror.Qhi(jSONObject.optString("bgGradient"));
        ror.lB(jSONObject.optInt("areaType"));
        ror.lG(jSONObject.optInt("interactSlideThreshold", 0));
        ror.zn(jSONObject.optInt("interactBottomDistance", com.bytedance.sdk.component.adexpress.fl.cJ() ? 0 : 120));
        ror.kYc(jSONObject.optBoolean("openPlayableLandingPage", false));
        ror.ac(jSONObject.optJSONObject("video"));
        ror.CJ(jSONObject.optJSONObject("image"));
        ror.Jma(jSONObject.optInt("borderShadowExtent"));
        ror.pA(jSONObject.optBoolean("bgGauseBlur"));
        ror.js(jSONObject.optInt("bgGauseBlurRadius"));
        ror.hpZ(jSONObject.optBoolean("showTimeProgress", false));
        ror.HzH(jSONObject.optBoolean("showPlayButton", false));
        ror.Qhi(jSONObject.optDouble("bgColorCg", 0.0d));
        ror.Tgh(jSONObject.optInt("bgMaterialCenterCalcColor", 0));
        ror.cJ(jSONObject.optInt("borderTopLeftRadius", 0));
        ror.Qhi(jSONObject.optInt("borderTopRightRadius", 0));
        ror.CJ(jSONObject.optInt("borderBottomLeftRadius", 0));
        ror.ac(jSONObject.optInt("borderBottomRightRadius", 0));
        ror.fl(jSONObject.optJSONObject("interactI18n"));
        ror.Dww(jSONObject.optString("imageObjectFit"));
        ror.CQU(jSONObject.optString("interactTitle"));
        ror.sDy(jSONObject.optInt("interactTextPositionTop"));
        ror.bxS(jSONObject.optString("imageLottieTosPath"));
        ror.zc(jSONObject.optBoolean("animationsLoop"));
        ror.pM(jSONObject.optInt("lottieAppNameMaxLength"));
        ror.aP(jSONObject.optInt("lottieAdDescMaxLength"));
        ror.Eh(jSONObject.optInt("lottieAdTitleMaxLength"));
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("animations");
            if (optJSONArray != null) {
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                    JSONObject jSONObject2 = optJSONArray.getJSONObject(i10);
                    Qhi qhi = new Qhi();
                    qhi.ac(jSONObject2.optString("animationType"));
                    qhi.Qhi(jSONObject2.optDouble("animationDuration"));
                    qhi.cJ(jSONObject2.optDouble("animationScaleX"));
                    qhi.ac(jSONObject2.optDouble("animationScaleY"));
                    qhi.CJ(jSONObject2.optString("animationTimeFunction"));
                    qhi.CJ(jSONObject2.optDouble("animationDelay"));
                    qhi.Tgh(jSONObject2.optInt("animationIterationCount"));
                    qhi.fl(jSONObject2.optString("animationDirection"));
                    qhi.fl(jSONObject2.optDouble("animationInterval"));
                    qhi.Qhi(jSONObject2.optInt("animationBorderWidth"));
                    qhi.Qhi(jSONObject2.optLong("key"));
                    qhi.cJ(jSONObject2.optInt("animationEffectWidth"));
                    qhi.ac(jSONObject2.optInt("animationSwing", 1));
                    qhi.CJ(jSONObject2.optInt("animationTranslateX"));
                    qhi.fl(jSONObject2.optInt("animationTranslateY"));
                    qhi.cJ(jSONObject2.optString("animationRippleBackgroundColor"));
                    qhi.Qhi(jSONObject2.optString("animationScaleDirection"));
                    qhi.ROR(jSONObject2.optInt("animationFadeStart"));
                    qhi.Sf(jSONObject2.optInt("animationFadeEnd"));
                    qhi.Tgh(jSONObject2.optString("animationFillMode"));
                    qhi.hm(jSONObject2.optInt("animationBounceHeight"));
                    if (ror.tP() > 0.0d) {
                        qhi.CJ(qhi.iMK() + ror.tP());
                    }
                    arrayList.add(qhi);
                }
                ror.Qhi(arrayList);
            }
            if (jSONObject.has("triggerSlideMinDistance")) {
                ror.pM(jSONObject.optString("triggerSlideDirection", PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES));
                ror.Qhi(jSONObject.optLong("triggerSlideMinDistance", 0L));
            }
        } catch (Exception unused) {
        }
        return ror;
    }

    public boolean ABk() {
        return this.f8180fl;
    }

    public int CJ() {
        return this.YD;
    }

    public String CQU() {
        return this.eN;
    }

    public String DaO() {
        return this.Ura;
    }

    public int Dq() {
        return this.jPH;
    }

    public String Dww() {
        return this.kYc;
    }

    public String EBS() {
        return this.hpZ;
    }

    public JSONObject EGK() {
        return this.zjb;
    }

    public String FQ() {
        return this.lG;
    }

    public float Gm() {
        return this.Qhi;
    }

    public int Gy() {
        return this.EGK;
    }

    public boolean HLI() {
        return this.Hf;
    }

    public int HUk() {
        return this.Ki;
    }

    public int HWc() {
        return this.mZ;
    }

    public boolean Hf() {
        return this.MND;
    }

    public float HzH() {
        return this.f8181hm;
    }

    public int IC() {
        return this.SL;
    }

    public int Jma() {
        return this.Eh;
    }

    public long KW() {
        return this.sqa;
    }

    public String Ki() {
        return this.Ls;
    }

    public boolean LcF() {
        return this.vml;
    }

    public String Ls() {
        return this.KW;
    }

    public int MND() {
        return this.yN;
    }

    public double MQ() {
        return this.f8184zc;
    }

    public int NBs() {
        return this.dIT;
    }

    public String NFd() {
        return this.bxS;
    }

    public JSONObject Ohm() {
        return this.gT;
    }

    public String Oy() {
        return this.Ri;
    }

    public String PAe() {
        return this.Jma;
    }

    public int PER() {
        return this.ReL;
    }

    public int Px() {
        return this.rB;
    }

    public int Qe() {
        return this.PAe;
    }

    public int ROR() {
        return this.bM;
    }

    public String ReL() {
        return this.dVA;
    }

    public int Ri() {
        return this.oU;
    }

    public int SL() {
        return this.VnT;
    }

    public boolean SNp() {
        return this.XH;
    }

    public String SO() {
        return this.LcF;
    }

    public double Sf() {
        return this.IC;
    }

    public int TKG() {
        return this.yy;
    }

    public JSONObject Tgh() {
        return this.VV;
    }

    public boolean Ug() {
        return this.TKG;
    }

    public int Ura() {
        return this.pv;
    }

    public int VV() {
        return this.DaO;
    }

    public boolean VnT() {
        return this.HLI;
    }

    public String WAv() {
        return this.sRC;
    }

    public int Wrw() {
        return this.mz;
    }

    public boolean XH() {
        return this.Ohm;
    }

    public int YB() {
        return this.f8182ip;
    }

    public int YD() {
        return this.SO;
    }

    public String aP() {
        return this.EBS;
    }

    public int ac() {
        return this.SNp;
    }

    public int bM() {
        return this.f8183ne;
    }

    public String bxS() {
        return this.HzH;
    }

    public int cJ() {
        return this.HWc;
    }

    public boolean cJP() {
        return this.wp;
    }

    public double cjC() {
        return this.xyz;
    }

    public boolean dI() {
        return this.Qe;
    }

    public int dIT() {
        return this.FQ;
    }

    public int dVA() {
        return this.YB;
    }

    public boolean eG() {
        return this.HUk;
    }

    public String es() {
        return this.sDy;
    }

    public int et() {
        return this.gga;
    }

    public int fl() {
        return this.eG;
    }

    public String gT() {
        return this.Ug;
    }

    public int gga() {
        return this.ots;
    }

    public int hm() {
        return this.Px;
    }

    public float hpZ() {
        return this.Sf;
    }

    public float iMK() {
        return this.Tgh;
    }

    public String ip() {
        return this.js;
    }

    public int jPH() {
        return this.es;
    }

    public double js() {
        return this.aP;
    }

    public float kYc() {
        return this.WAv;
    }

    public boolean lB() {
        return this.CQU;
    }

    public int lG() {
        return this.pM;
    }

    public int mZ() {
        return this.et;
    }

    public void mz() {
        Qhi(this, this.gT);
    }

    public int ne() {
        return this.Wrw;
    }

    public boolean oU() {
        return this.NBs;
    }

    public boolean ots() {
        return this.Dq;
    }

    public float pA() {
        return this.ROR;
    }

    public List<Qhi> pF() {
        return this.Oy;
    }

    public String pM() {
        return this.tP;
    }

    public boolean pv() {
        return this.dI;
    }

    public String qMt() {
        return this.pA;
    }

    public int rB() {
        return this.Gy;
    }

    public String sDy() {
        return this.Dww;
    }

    public double tP() {
        return this.Gm;
    }

    public boolean vml() {
        return this.zTC;
    }

    public int wp() {
        List<Qhi> list = this.Oy;
        if (list != null) {
            for (Qhi qhi : list) {
                if ("translate".equals(qhi.hm()) && qhi.ROR() < 0) {
                    return -qhi.ROR();
                }
            }
            return 0;
        }
        return 0;
    }

    public boolean xyz() {
        return this.f8185zn;
    }

    public String yN() {
        return this.lB;
    }

    public void yy() {
        Qhi(this, this.cJP);
    }

    public String zTC() {
        return this.pF;
    }

    public float zc() {
        return this.cJ;
    }

    public String zjb() {
        return this.cjC;
    }

    public double zn() {
        return this.NFd;
    }

    public void ABk(String str) {
        this.Dww = str;
    }

    public void CJ(int i10) {
        this.eG = i10;
    }

    public void CQU(int i10) {
        this.et = i10;
    }

    public void Dww(int i10) {
        this.Gy = i10;
    }

    public void EBS(int i10) {
        this.gga = i10;
    }

    public String Eh() {
        return this.qMt;
    }

    public void Gm(String str) {
        this.EBS = str;
    }

    public void HzH(String str) {
        this.Jma = str;
    }

    public void Jma(int i10) {
        this.mZ = i10;
    }

    public void MQ(String str) {
        this.dVA = str;
    }

    public void NFd(int i10) {
        this.SL = i10;
    }

    public void ROR(float f10) {
        this.Sf = f10;
    }

    public void Sf(float f10) {
        this.f8181hm = f10;
    }

    public void Tgh(int i10) {
        this.Px = i10;
    }

    public void WAv(String str) {
        this.qMt = str;
    }

    public void aP(int i10) {
        this.mz = i10;
    }

    public void ac(int i10) {
        this.YD = i10;
    }

    public void bxS(int i10) {
        this.VnT = i10;
    }

    public void cJ(int i10) {
        this.SNp = i10;
    }

    public void fl(int i10) {
        this.bM = i10;
    }

    public void hm(float f10) {
        this.WAv = f10;
    }

    public void hpZ(String str) {
        this.lG = str;
    }

    public void iMK(String str) {
        this.sDy = str;
    }

    public void js(int i10) {
        this.SO = i10;
    }

    public void kYc(String str) {
        this.js = str;
    }

    public void lB(int i10) {
        this.DaO = i10;
    }

    public void lG(int i10) {
        this.rB = i10;
    }

    public void pA(String str) {
        this.lB = str;
    }

    public void pM(int i10) {
        this.Ki = i10;
    }

    public void qMt(int i10) {
        this.EGK = i10;
    }

    public void sDy(int i10) {
        this.f8183ne = i10;
    }

    public void tP(String str) {
        this.cjC = str;
    }

    public void zc(String str) {
        this.bxS = str;
    }

    public void zn(int i10) {
        this.Wrw = i10;
    }

    public void ABk(int i10) {
        this.f8182ip = i10;
    }

    public void CJ(float f10) {
        this.CJ = f10;
    }

    public void CQU(String str) {
        this.Ls = str;
    }

    public void Dww(String str) {
        this.Ug = str;
    }

    public void EBS(String str) {
        this.Ura = str;
    }

    public void Eh(int i10) {
        this.yy = i10;
    }

    public void Gm(int i10) {
        this.FQ = i10;
    }

    public void HzH(int i10) {
        this.ots = i10;
    }

    public void MQ(int i10) {
        this.ReL = i10;
    }

    public void ROR(String str) {
        this.kYc = str;
    }

    public void Sf(String str) {
        this.tP = str;
    }

    public void Tgh(float f10) {
        this.ROR = f10;
    }

    public void WAv(int i10) {
        this.yN = i10;
    }

    public void ac(float f10) {
        this.f8179ac = f10;
    }

    public void bxS(String str) {
        this.LcF = str;
    }

    public void cJ(float f10) {
        this.cJ = f10;
    }

    public void fl(float f10) {
        this.Tgh = f10;
    }

    public void hm(String str) {
        this.MQ = str;
    }

    public void hpZ(int i10) {
        this.YB = i10;
    }

    public void iMK(int i10) {
        this.jPH = i10;
    }

    public void kYc(int i10) {
        this.oU = i10;
    }

    public void pA(int i10) {
        this.dIT = i10;
    }

    public void pM(String str) {
        this.KW = str;
    }

    public void qMt(String str) {
        this.Ri = str;
    }

    public void tP(int i10) {
        this.pv = i10;
    }

    public void zc(int i10) {
        this.PAe = i10;
    }

    public void ABk(boolean z10) {
        this.zTC = z10;
    }

    public void CJ(String str) {
        this.pA = str;
    }

    public void Gm(boolean z10) {
        this.HLI = z10;
    }

    public void HzH(boolean z10) {
        this.TKG = z10;
    }

    public void ROR(int i10) {
        this.pM = i10;
    }

    public void Sf(int i10) {
        this.Eh = i10;
    }

    public void Tgh(String str) {
        this.HzH = str;
    }

    public void WAv(boolean z10) {
        this.dI = z10;
    }

    public void ac(double d10) {
        this.f8184zc = d10;
    }

    public void cJ(boolean z10) {
        this.f8180fl = z10;
    }

    public void fl(String str) {
        this.hpZ = str;
    }

    public void hm(int i10) {
        this.es = i10;
    }

    public void hpZ(boolean z10) {
        this.HUk = z10;
    }

    public void iMK(boolean z10) {
        this.wp = z10;
    }

    public void kYc(boolean z10) {
        this.vml = z10;
    }

    public void pA(boolean z10) {
        this.XH = z10;
    }

    public void zc(boolean z10) {
        this.Ohm = z10;
    }

    public void CJ(double d10) {
        this.aP = d10;
    }

    public void ROR(boolean z10) {
        this.Dq = z10;
    }

    public void Sf(boolean z10) {
        this.Hf = z10;
    }

    public void Tgh(double d10) {
        this.xyz = d10;
    }

    public void ac(String str) {
        this.iMK = str;
    }

    public void cJ(double d10) {
        this.Gm = d10;
    }

    public void fl(double d10) {
        this.NFd = d10;
    }

    public void hm(boolean z10) {
        this.NBs = z10;
    }

    public void CJ(boolean z10) {
        this.f8185zn = z10;
    }

    public void Tgh(boolean z10) {
        this.Qe = z10;
    }

    public void ac(boolean z10) {
        this.CQU = z10;
    }

    public void cJ(String str) {
        this.ABk = str;
    }

    public void fl(boolean z10) {
        this.MND = z10;
    }

    public void CJ(JSONObject jSONObject) {
        this.gT = jSONObject;
    }

    public void ac(JSONObject jSONObject) {
        this.cJP = jSONObject;
    }

    public void cJ(JSONObject jSONObject) {
        this.zjb = jSONObject;
    }

    public void fl(JSONObject jSONObject) {
        this.VV = jSONObject;
    }

    public boolean Qhi() {
        return this.PER;
    }

    public void Qhi(boolean z10) {
        this.PER = z10;
    }

    public void Qhi(int i10) {
        this.HWc = i10;
    }

    public void Qhi(double d10) {
        this.IC = d10;
    }

    public void Qhi(String str) {
        this.sRC = str;
    }

    public void Qhi(float f10) {
        this.Qhi = f10;
    }

    public void Qhi(List<Qhi> list) {
        this.Oy = list;
    }

    public void Qhi(long j10) {
        this.sqa = j10;
    }

    private void Qhi(ROR ror, JSONObject jSONObject) {
        if (ror == null || jSONObject == null) {
            return;
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            next.getClass();
            char c = 65535;
            switch (next.hashCode()) {
                case -2067713583:
                    if (next.equals("isShowBgControl")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1965619659:
                    if (next.equals("clickArea")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1912831834:
                    if (next.equals("triggerSlideDirection")) {
                        c = 2;
                        break;
                    }
                    break;
                case -1885934767:
                    if (next.equals("bgImgUrl")) {
                        c = 3;
                        break;
                    }
                    break;
                case -1822062213:
                    if (next.equals("lineCount")) {
                        c = 4;
                        break;
                    }
                    break;
                case -1821293778:
                    if (next.equals("openPlayableLandingPage")) {
                        c = 5;
                        break;
                    }
                    break;
                case -1813937113:
                    if (next.equals("lineLimit")) {
                        c = 6;
                        break;
                    }
                    break;
                case -1578250488:
                    if (next.equals("interactBgColor")) {
                        c = 7;
                        break;
                    }
                    break;
                case -1501175880:
                    if (next.equals("paddingLeft")) {
                        c = '\b';
                        break;
                    }
                    break;
                case -1422965251:
                    if (next.equals("adType")) {
                        c = '\t';
                        break;
                    }
                    break;
                case -1383228885:
                    if (next.equals("bottom")) {
                        c = '\n';
                        break;
                    }
                    break;
                case -1224696685:
                    if (next.equals("fontFamily")) {
                        c = 11;
                        break;
                    }
                    break;
                case -1221029593:
                    if (next.equals(InMobiNetworkValues.HEIGHT)) {
                        c = '\f';
                        break;
                    }
                    break;
                case -1065511464:
                    if (next.equals("textAlign")) {
                        c = '\r';
                        break;
                    }
                    break;
                case -1063257157:
                    if (next.equals("alignItems")) {
                        c = 14;
                        break;
                    }
                    break;
                case -1046708884:
                    if (next.equals("interactValidate")) {
                        c = 15;
                        break;
                    }
                    break;
                case -1044792121:
                    if (next.equals("marginTop")) {
                        c = 16;
                        break;
                    }
                    break;
                case -1019884910:
                    if (next.equals("useBottom")) {
                        c = 17;
                        break;
                    }
                    break;
                case -1005195314:
                    if (next.equals("triggerSlideMinDistance")) {
                        c = 18;
                        break;
                    }
                    break;
                case -962590849:
                    if (next.equals("direction")) {
                        c = 19;
                        break;
                    }
                    break;
                case -912366651:
                    if (next.equals("tagMaxCount")) {
                        c = 20;
                        break;
                    }
                    break;
                case -848877971:
                    if (next.equals("interactHiddenTime")) {
                        c = 21;
                        break;
                    }
                    break;
                case -836058546:
                    if (next.equals("useTop")) {
                        c = 22;
                        break;
                    }
                    break;
                case -734428249:
                    if (next.equals("fontWeight")) {
                        c = 23;
                        break;
                    }
                    break;
                case -731417480:
                    if (next.equals("zIndex")) {
                        c = 24;
                        break;
                    }
                    break;
                case -709393864:
                    if (next.equals("timingStart")) {
                        c = 25;
                        break;
                    }
                    break;
                case -515807685:
                    if (next.equals("lineHeight")) {
                        c = 26;
                        break;
                    }
                    break;
                case -321658193:
                    if (next.equals("textFlowDuration")) {
                        c = 27;
                        break;
                    }
                    break;
                case -295409451:
                    if (next.equals("useRight")) {
                        c = 28;
                        break;
                    }
                    break;
                case -289173127:
                    if (next.equals("marginBottom")) {
                        c = 29;
                        break;
                    }
                    break;
                case -204859874:
                    if (next.equals("bgColor")) {
                        c = 30;
                        break;
                    }
                    break;
                case -148259282:
                    if (next.equals("useLeft")) {
                        c = 31;
                        break;
                    }
                    break;
                case -51738487:
                    if (next.equals("widthMode")) {
                        c = ' ';
                        break;
                    }
                    break;
                case 115029:
                    if (next.equals("top")) {
                        c = '!';
                        break;
                    }
                    break;
                case 3076010:
                    if (next.equals("data")) {
                        c = '\"';
                        break;
                    }
                    break;
                case 3317767:
                    if (next.equals("left")) {
                        c = '#';
                        break;
                    }
                    break;
                case 3327652:
                    if (next.equals("loop")) {
                        c = '$';
                        break;
                    }
                    break;
                case 90130308:
                    if (next.equals("paddingTop")) {
                        c = '%';
                        break;
                    }
                    break;
                case 92903173:
                    if (next.equals("align")) {
                        c = '&';
                        break;
                    }
                    break;
                case 94842723:
                    if (next.equals("color")) {
                        c = '\'';
                        break;
                    }
                    break;
                case 108511772:
                    if (next.equals("right")) {
                        c = '(';
                        break;
                    }
                    break;
                case 113126854:
                    if (next.equals(InMobiNetworkValues.WIDTH)) {
                        c = ')';
                        break;
                    }
                    break;
                case 164611121:
                    if (next.equals("timingEnd")) {
                        c = '*';
                        break;
                    }
                    break;
                case 202355100:
                    if (next.equals("paddingBottom")) {
                        c = '+';
                        break;
                    }
                    break;
                case 247204452:
                    if (next.equals("allowTextFlow")) {
                        c = ',';
                        break;
                    }
                    break;
                case 302841174:
                    if (next.equals("interactWontHide")) {
                        c = '-';
                        break;
                    }
                    break;
                case 365601008:
                    if (next.equals("fontSize")) {
                        c = '.';
                        break;
                    }
                    break;
                case 428975654:
                    if (next.equals("justifyVertical")) {
                        c = PackagingURIHelper.FORWARD_SLASH_CHAR;
                        break;
                    }
                    break;
                case 439444041:
                    if (next.equals("interactVisibleTime")) {
                        c = '0';
                        break;
                    }
                    break;
                case 713848971:
                    if (next.equals("paddingRight")) {
                        c = '1';
                        break;
                    }
                    break;
                case 722830999:
                    if (next.equals("borderColor")) {
                        c = '2';
                        break;
                    }
                    break;
                case 737768677:
                    if (next.equals("borderStyle")) {
                        c = '3';
                        break;
                    }
                    break;
                case 747804969:
                    if (next.equals("position")) {
                        c = '4';
                        break;
                    }
                    break;
                case 791643104:
                    if (next.equals("isDataFixed")) {
                        c = '5';
                        break;
                    }
                    break;
                case 975087886:
                    if (next.equals("marginRight")) {
                        c = '6';
                        break;
                    }
                    break;
                case 1110826708:
                    if (next.equals("justifyHorizontal")) {
                        c = '7';
                        break;
                    }
                    break;
                case 1122368895:
                    if (next.equals("interactPosition")) {
                        c = '8';
                        break;
                    }
                    break;
                case 1188229042:
                    if (next.equals("lineFeed")) {
                        c = '9';
                        break;
                    }
                    break;
                case 1332036739:
                    if (next.equals("interactText")) {
                        c = ':';
                        break;
                    }
                    break;
                case 1332055696:
                    if (next.equals("interactType")) {
                        c = ';';
                        break;
                    }
                    break;
                case 1349188574:
                    if (next.equals("borderRadius")) {
                        c = '<';
                        break;
                    }
                    break;
                case 1360828714:
                    if (next.equals("clickTigger")) {
                        c = '=';
                        break;
                    }
                    break;
                case 1490178922:
                    if (next.equals("heightMode")) {
                        c = '>';
                        break;
                    }
                    break;
                case 1761274325:
                    if (next.equals("textFlowType")) {
                        c = '?';
                        break;
                    }
                    break;
                case 1824903757:
                    if (next.equals("borderSize")) {
                        c = '@';
                        break;
                    }
                    break;
                case 1970934485:
                    if (next.equals("marginLeft")) {
                        c = 'A';
                        break;
                    }
                    break;
                case 2111078717:
                    if (next.equals("letterSpacing")) {
                        c = 'B';
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    ror.ac(jSONObject.optBoolean(next, false));
                    break;
                case 1:
                    ror.pA(jSONObject.optString(next));
                    break;
                case 2:
                    ror.pM(jSONObject.optString(next));
                    break;
                case 3:
                    ror.ROR(jSONObject.optString(next));
                    break;
                case 4:
                    ror.hm(jSONObject.optInt(next));
                    break;
                case 5:
                    ror.kYc(jSONObject.optBoolean(next));
                    break;
                case 6:
                    ror.Tgh(jSONObject.optBoolean(next));
                    break;
                case 7:
                    ror.ABk(jSONObject.optString(next));
                    break;
                case '\b':
                    ror.Tgh((float) jSONObject.optDouble(next));
                    break;
                case '\t':
                    ror.cJ(jSONObject.optString(next));
                    break;
                case '\n':
                    ror.bxS(jSONObject.optInt(next));
                    break;
                case 11:
                    ror.ac(jSONObject.optString(next));
                    break;
                case '\f':
                    ror.ac((float) jSONObject.optDouble(next));
                    break;
                case '\r':
                    ror.CJ(jSONObject.optString(next));
                    break;
                case 14:
                    ror.qMt(jSONObject.optString(next));
                    break;
                case 15:
                    ror.cJ(jSONObject.optBoolean(next));
                    break;
                case 16:
                    ror.WAv(jSONObject.optInt(next));
                    break;
                case 17:
                    ror.WAv(jSONObject.optBoolean(next));
                    break;
                case 18:
                    ror.Qhi(jSONObject.optLong(next));
                    break;
                case 19:
                    ror.EBS(jSONObject.optString(next));
                    break;
                case 20:
                    ror.HzH(jSONObject.optInt(next));
                    break;
                case 21:
                    ror.CQU(jSONObject.optInt(next));
                    break;
                case 22:
                    ror.hm(jSONObject.optBoolean(next));
                    break;
                case 23:
                    ror.pA(jSONObject.optInt(next));
                    break;
                case 24:
                    ror.Dww(jSONObject.optInt(next));
                    break;
                case 25:
                    ror.cJ(jSONObject.optDouble(next));
                    break;
                case 26:
                    ror.Tgh(jSONObject.optDouble(next));
                    break;
                case 27:
                    ror.tP(jSONObject.optInt(next));
                    break;
                case 28:
                    ror.Sf(jSONObject.optBoolean(next));
                    break;
                case 29:
                    ror.Gm(jSONObject.optInt(next));
                    break;
                case 30:
                    ror.Tgh(jSONObject.optString(next));
                    break;
                case 31:
                    ror.ROR(jSONObject.optBoolean(next));
                    break;
                case ' ':
                    ror.Gm(jSONObject.optString(next));
                    break;
                case '!':
                    ror.EBS(jSONObject.optInt(next));
                    break;
                case '\"':
                    ror.MQ(jSONObject.optString(next));
                    break;
                case '#':
                    ror.MQ(jSONObject.optInt(next));
                    break;
                case '$':
                    ror.Qhi(jSONObject.optBoolean(next));
                    break;
                case '%':
                    ror.Sf((float) jSONObject.optDouble(next));
                    break;
                case '&':
                    ror.tP(jSONObject.optString(next));
                    break;
                case '\'':
                    ror.fl(jSONObject.optString(next));
                    break;
                case '(':
                    ror.qMt(jSONObject.optInt(next));
                    break;
                case ')':
                    ror.CJ((float) jSONObject.optDouble(next));
                    break;
                case '*':
                    ror.ac(jSONObject.optDouble(next));
                    break;
                case '+':
                    ror.fl((float) jSONObject.optDouble(next));
                    break;
                case ',':
                    ror.Gm(jSONObject.optBoolean(next));
                    break;
                case '-':
                    ror.iMK(jSONObject.optBoolean(next));
                    break;
                case '.':
                    ror.hm((float) jSONObject.optDouble(next));
                    break;
                case '/':
                    ror.kYc(jSONObject.optString(next));
                    break;
                case '0':
                    ror.NFd(jSONObject.optInt(next));
                    break;
                case '1':
                    ror.ROR((float) jSONObject.optDouble(next));
                    break;
                case '2':
                    ror.Sf(jSONObject.optString(next));
                    break;
                case '3':
                    ror.hm(jSONObject.optString(next));
                    break;
                case '4':
                    ror.hpZ(jSONObject.optInt(next));
                    break;
                case '5':
                    ror.fl(jSONObject.optBoolean(next));
                    break;
                case '6':
                    ror.ABk(jSONObject.optInt(next));
                    break;
                case '7':
                    ror.HzH(jSONObject.optString(next));
                    break;
                case '8':
                    JSONObject optJSONObject = jSONObject.optJSONObject(next);
                    if (optJSONObject == null) {
                        break;
                    } else {
                        ror.ROR(optJSONObject.optInt("translateY", 0));
                        ror.Sf(optJSONObject.optInt("translateX", 0));
                        ror.CJ(optJSONObject.optDouble("scaleX", 0.0d));
                        ror.fl(optJSONObject.optDouble("scaleY", 0.0d));
                        break;
                    }
                case '9':
                    ror.CJ(jSONObject.optBoolean(next));
                    break;
                case ':':
                    ror.zc(jSONObject.optString(next));
                    break;
                case ';':
                    ror.iMK(jSONObject.optString(next));
                    break;
                case '<':
                    ror.Qhi((float) jSONObject.optDouble(next));
                    break;
                case '=':
                    ror.hpZ(jSONObject.optString(next));
                    break;
                case '>':
                    ror.WAv(jSONObject.optString(next));
                    break;
                case '?':
                    ror.kYc(jSONObject.optInt(next));
                    break;
                case '@':
                    ror.cJ((float) jSONObject.optDouble(next));
                    break;
                case 'A':
                    ror.zc(jSONObject.optInt(next));
                    break;
                case 'B':
                    ror.iMK(jSONObject.optInt(next));
                    break;
            }
        }
    }
}
