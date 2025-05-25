package com.bytedance.sdk.openadsdk.core.model;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.model.tP;
import com.bytedance.sdk.openadsdk.utils.Jma;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import com.tom_roush.fontbox.ttf.NamingTable;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: SingleMaterialMeta.java */
/* loaded from: classes.dex */
public class Dww extends tP {
    private String ABk;
    private int CQU;
    private String DaO;
    private JSONObject Dq;
    private zc Dww;
    private String Eh;
    private Tgh Em;
    private com.bykv.vk.openvk.component.video.api.ac.cJ FQ;
    private hpZ Gm;
    private String Gy;
    private int HLI;
    private boolean Hy;
    private String HzH;
    private kYc IC;
    private long Jma;
    private String KW;
    private String Ki;
    private fl LcF;
    private String Ls;
    private boolean MND;
    private String MQ;
    private boolean Ohm;
    private boolean PAe;
    private String PER;
    private Map<String, Object> Qe;
    private int ROR;
    private String SNp;
    private int SO;
    private int Sf;
    private iMK Ug;
    private int Ura;
    private volatile boolean VV;
    private JSONObject VnT;
    private hpZ WAv;
    private int XH;
    private int YAV;
    private tP.Qhi YB;
    private int YCN;
    private int YD;
    private String aP;
    private String bIO;
    private String bM;
    private ac bxS;
    public long cJ;
    private bxS cJP;
    private boolean cfS;
    private String cjC;
    private int dIT;
    private int eG;
    private com.bytedance.sdk.openadsdk.core.ugen.fl.Qhi eN;
    private boolean ejU;
    private com.bykv.vk.openvk.component.video.api.ac.cJ es;
    private ABk et;
    private com.bytedance.sdk.openadsdk.core.ROR.Qhi gT;

    /* renamed from: hm  reason: collision with root package name */
    private int f9056hm;
    private String hpZ;
    private boolean iWr;

    /* renamed from: ip  reason: collision with root package name */
    private boolean f9057ip;
    private int jPH;
    private String jWV;
    private int js;
    private String kYc;
    private int mZ;
    private int mz;
    private int nR;

    /* renamed from: ne  reason: collision with root package name */
    private String f9058ne;
    private AdSlot ots;
    private JSONObject pF;
    private String pM;
    private String pv;
    private int qMt;

    /* renamed from: qb  reason: collision with root package name */
    private EBS f9059qb;
    private int rB;
    private com.bytedance.sdk.openadsdk.core.ugen.fl.Qhi sRC;
    private int smJ;
    private boolean sqa;
    private String tP;
    private int vml;
    private int wp;
    private boolean xyz;
    private com.bykv.vk.openvk.component.video.api.ac.cJ yN;
    private String zTC;

    /* renamed from: zc  reason: collision with root package name */
    private String f9060zc;

    /* renamed from: zn  reason: collision with root package name */
    private int f9061zn;

    /* renamed from: ac  reason: collision with root package name */
    private final List<hpZ> f9054ac = new ArrayList();
    private final List<String> CJ = new ArrayList();

    /* renamed from: fl  reason: collision with root package name */
    private final List<FilterWord> f9055fl = new ArrayList();
    private final Jma Tgh = Jma.cJ();
    public boolean Qhi = false;
    private List<String> iMK = new ArrayList();
    private List<String> pA = new ArrayList();
    private String EBS = PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES;
    private String NFd = "";
    private int sDy = 0;
    private int lB = 2;
    private int lG = 0;
    private int Hf = 0;
    private int NBs = 1;
    private WAv dI = new WAv();
    private int dVA = -200;
    private int zjb = 0;
    private int oU = 1;
    private int ReL = 0;
    private int EGK = 0;
    private int gga = 0;
    private int Ri = 1;
    private int SL = 1;
    private float Oy = 100.0f;
    private int HUk = 2;
    private int TKG = 1;
    private int Wrw = 0;
    private int Px = -1;
    private long HWc = -1;
    private int yy = 0;
    private boolean rP = false;
    private int LpL = 0;
    private int yBk = 50;
    private int Ewb = -1;

    private com.bytedance.sdk.openadsdk.core.ugen.fl.Qhi MAG() {
        tP.Qhi es = es();
        if (es == null) {
            return null;
        }
        return tP.Qhi.cJ(es, String.valueOf(Hy()));
    }

    public static boolean Tgh(tP tPVar) {
        if (tPVar == null) {
            return false;
        }
        int gga = tPVar.gga();
        return tPVar.IC() || gga == 5 || gga == 15 || gga == 50;
    }

    private static double fl(JSONObject jSONObject) {
        if (jSONObject != null) {
            return jSONObject.optDouble("pack_time", 0.0d);
        }
        return 0.0d;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public int ABk() {
        if (czB()) {
            return 5;
        }
        if (gT()) {
            return 4;
        }
        fl flVar = this.LcF;
        if (flVar == null) {
            return 1;
        }
        return flVar.cJ();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public boolean CJ() {
        return this.PAe;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public int CQU() {
        return this.Hf;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public String DS() {
        JSONObject KW;
        if (this.bIO == null && (KW = KW()) != null) {
            this.bIO = KW.optString("cid", "");
        }
        return this.bIO;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public boolean DaO() {
        if (this.f9054ac.isEmpty()) {
            return false;
        }
        if (this.CQU == 4 && this.f9054ac.size() < 3) {
            return false;
        }
        for (hpZ hpz : this.f9054ac) {
            if (!hpz.fl()) {
                return false;
            }
        }
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public String Dq() {
        return this.ABk;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public int Dww() {
        return this.gga;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public int EBS() {
        int i10 = this.Sf;
        if (i10 == 5 || i10 == 6 || i10 == 33) {
            return 1;
        }
        if (Ewb()) {
            return 2;
        }
        return this.lB;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public String EGK() {
        return this.aP;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public void Eh(String str) {
        this.Ls = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public boolean Em() {
        if (IC() && !qb()) {
            int nextInt = new Random().nextInt(100);
            iMK imk = this.Ug;
            if (imk != null && nextInt < imk.ac()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public boolean Ewb() {
        if (lB() == null || lB().getDurationSlotType() != 8 || !gT()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public void FQ(int i10) {
        this.mz = i10;
    }

    public int Fj() {
        return this.Ura;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public boolean GN() {
        return this.Qhi;
    }

    public int Gf() {
        return this.HLI;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public fl Gm() {
        return this.LcF;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public Map<String, Object> Gy() {
        return this.Qe;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public String HLI() {
        return this.EBS;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public boolean HUk() {
        return this.rP;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public boolean HWc() {
        return this.VV;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public List<String> Hf() {
        return this.iMK;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public int Hy() {
        JSONObject KW = KW();
        if (KW == null) {
            return 0;
        }
        return KW.optInt("rit", 0);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public int HzH() {
        return this.f9056hm;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public boolean IC() {
        int i10 = this.yy;
        if ((i10 == 1 || i10 == 3) && cJP() != null) {
            return true;
        }
        return false;
    }

    public int JHs() {
        return this.smJ;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public String Jma() {
        return this.cjC;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public JSONObject KW() {
        if (this.Dq == null) {
            try {
                if (!TextUtils.isEmpty(this.aP)) {
                    this.Dq = new JSONObject(this.aP);
                }
            } catch (JSONException e10) {
                com.bytedance.sdk.component.utils.ABk.Qhi("MaterialMeta", e10.getMessage());
            }
        }
        return this.Dq;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public com.bykv.vk.openvk.component.video.api.ac.cJ Ki() {
        return this.yN;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public int LcF() {
        return this.vml;
    }

    public int Ln() {
        return this.YAV;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public boolean LpL() {
        if (sqa() == 7) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public boolean Ls() {
        com.bykv.vk.openvk.component.video.api.ac.cJ cJVar = this.es;
        if (cJVar == null || cJVar.tP() != 1) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public String MIe() {
        return this.Ki;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public int MND() {
        return this.YCN;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public String MQ() {
        return this.NFd;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public List<String> NBs() {
        return this.pA;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public int NFd() {
        if (IC()) {
            return 5;
        }
        if (Oy() != 100.0f || EBS() == 2) {
            return 0;
        }
        return this.zjb;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public EBS NLs() {
        return this.f9059qb;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public com.bykv.vk.openvk.component.video.api.ac.cJ Ohm() {
        return this.FQ;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public float Oy() {
        if (this.Oy <= 0.0f) {
            this.Oy = 100.0f;
        }
        return (this.Oy * 1000.0f) / 1000.0f;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public void PAe(int i10) {
        this.LpL = i10;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public boolean PER() {
        return this.MND;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public void Px() {
        this.VV = true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public hpZ Qe() {
        return this.Gm;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public void Qhi(boolean z10) {
        this.PAe = z10;
    }

    public String Qk() {
        return this.MQ;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public String ROR() {
        return this.zTC;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public zc ReL() {
        return this.Dww;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public String Ri() {
        return this.Gy;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public int SL() {
        if (this.SL != 2) {
            this.SL = 1;
        }
        return this.SL;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public int SNp() {
        return this.YD;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public JSONObject SO() {
        JSONObject mZ = mZ();
        JSONObject kYc = com.bytedance.sdk.openadsdk.core.settings.HzH.YD().kYc(String.valueOf(Hy()));
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(mZ);
            jSONObject.put("creatives", jSONArray);
            jSONObject.put("did", 1);
            jSONObject.put("processing_time_ms", 100);
            jSONObject.put("request_id", "aaaaaaaa-aaaa-aaaa-aaaa-aaaaaaaaaaaa");
            jSONObject.put("s_receive_ts", 1);
            jSONObject.put("s_send_ts", 1);
            jSONObject.put("status_code", 20000);
            jSONObject.put("core_settings", kYc);
        } catch (JSONException e10) {
            com.bytedance.sdk.component.utils.ABk.Qhi("MaterialMeta", "toJsonObjPlus", e10.getMessage());
        }
        return jSONObject;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public boolean Sf() {
        return (TextUtils.isEmpty(Tgh()) || TextUtils.isEmpty(ROR())) ? false : true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public boolean TGC() {
        if (this.Px <= 0) {
            this.Px = sqa();
        }
        int i10 = this.Px;
        if ((i10 == 7 || i10 == 8) && !Tgh(this) && HzH() != 21 && this.nR == 1) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public int TKG() {
        int i10 = this.mZ;
        if (i10 > 0) {
            return i10;
        }
        return 20;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public boolean Ttc() {
        return this.sqa;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public int Ug() {
        return this.jPH;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public long Ura() {
        return this.Jma;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public boolean VV() {
        if (this.wp == 1) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public List<FilterWord> VnT() {
        return this.f9055fl;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public Tgh WAv() {
        return this.Em;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public int Wrw() {
        return this.SO;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public int XH() {
        return this.rB;
    }

    public int XJ() {
        return this.ReL;
    }

    public int Xw() {
        return this.oU;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public boolean Xx() {
        return this.iWr;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public int XyJ() {
        try {
            JSONObject KW = KW();
            if (KW == null) {
                return 0;
            }
            return KW.optInt("rec_clk", 0);
        } catch (Exception unused) {
            return 0;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public boolean YAV() {
        iMK imk;
        if (!IC() || qb() || (imk = this.Ug) == null || imk.Qhi() != 1) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public String YB() {
        return this.f9060zc;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002d A[RETURN] */
    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean YCN() {
        /*
            r3 = this;
            boolean r0 = r3.qb()
            r1 = 0
            if (r0 != 0) goto L2f
            java.util.Random r0 = new java.util.Random
            r0.<init>()
            r2 = 100
            int r0 = r0.nextInt(r2)
            boolean r2 = r3.IC()
            if (r2 == 0) goto L21
            com.bytedance.sdk.openadsdk.core.model.iMK r2 = r3.Ug
            if (r2 == 0) goto L2a
            int r2 = r2.cJ()
            goto L2b
        L21:
            boolean r2 = com.bytedance.sdk.openadsdk.core.model.bxS.cJ(r3)
            if (r2 != 0) goto L2a
            int r2 = r3.mz
            goto L2b
        L2a:
            r2 = r1
        L2b:
            if (r0 >= r2) goto L2f
            r0 = 1
            return r0
        L2f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.model.Dww.YCN():boolean");
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public int YD() {
        return this.eG;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public boolean ZRq() {
        return this.Ohm;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public void aP(String str) {
        this.jWV = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public void ac(boolean z10) {
        this.xyz = z10;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public com.bytedance.sdk.openadsdk.core.ugen.fl.Qhi af() {
        return this.eN;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public String bIO() {
        ac pv = pv();
        if (pv != null && !TextUtils.isEmpty(pv.Qhi())) {
            return pv.Qhi();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public String bM() {
        return this.bM;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public boolean bxS() {
        return this.ReL == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public String cBj() {
        return this.Ls;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public void cJ(boolean z10) {
        this.f9057ip = z10;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public com.bytedance.sdk.openadsdk.core.ROR.Qhi cJP() {
        return this.gT;
    }

    public com.bytedance.sdk.component.adexpress.Qhi.ac.fl cR() {
        tP.Qhi es = es();
        if (es == null) {
            return null;
        }
        return tP.Qhi.Qhi(es, String.valueOf(Hy()));
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public boolean cfS() {
        if (sqa() == 5) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public List<hpZ> cjC() {
        return this.f9054ac;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public boolean czB() {
        List<Integer> ac2;
        if (es() != null && (ac2 = es().ac()) != null && ac2.contains(57)) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public List<String> dI() {
        return this.CJ;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public hpZ dIT() {
        return this.WAv;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public String dVA() {
        return this.hpZ;
    }

    public String dzV() {
        return this.pv;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public iMK eG() {
        return this.Ug;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public int eN() {
        return this.Px;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public boolean ejU() {
        if (sqa() == 1) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            tP tPVar = (tP) obj;
            if (this.EBS.equals(tPVar.HLI()) && this.aP.equals(tPVar.EGK())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public tP.Qhi es() {
        return this.YB;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public JSONObject et() {
        return this.VnT;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public long gSh() {
        return this.cJ;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public boolean gT() {
        if (this.yy == 2) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public int gga() {
        return this.CQU;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public void gt() {
        this.iWr = true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public boolean hU() {
        return this.Hy;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public kYc hm() {
        return this.IC;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public int hpZ() {
        return this.Sf;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public long iMK() {
        fl flVar = this.LcF;
        if (flVar == null) {
            return 0L;
        }
        return flVar.ac();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public boolean iWr() {
        if (sqa() == 8) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public void id() {
        this.ejU = true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public void ip(int i10) {
        this.yBk = i10;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public void is() {
        com.bykv.vk.openvk.component.video.api.ac.cJ cJVar = this.es;
        if (cJVar != null && !TextUtils.isEmpty(cJVar.zc())) {
            try {
                if (this.es.zc().contains("style_id")) {
                    this.sqa = true;
                    this.KW = Uri.parse(this.es.zc()).getQueryParameters("style_id").get(0);
                    return;
                }
                this.sqa = false;
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.ABk.cJ(th2.getMessage());
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public int jN() {
        return this.LpL;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public boolean jPH() {
        if (this.YAV == 1) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public String jWV() {
        JSONObject KW;
        String str = this.SNp;
        if (TextUtils.isEmpty(str) && (KW = KW()) != null) {
            str = KW.optString("req_id", "");
            NFd(str);
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public boolean js() {
        return skK() == 100 || this.Sf == 20;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public int kYc() {
        return this.TKG;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public AdSlot lB() {
        return this.ots;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public int lG() {
        return this.dVA;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public JSONObject mZ() {
        JSONObject ac2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("interaction_type", ip());
            jSONObject.put("is_arbitrage_sample", JHs());
            jSONObject.put("interaction_method", HzH());
            jSONObject.put("is_arbitrage", Ln());
            jSONObject.put("arbitrage_strategy", MND());
            jSONObject.put("target_url", YB());
            jSONObject.put("app_log_url", oU());
            jSONObject.put("gecko_id", Ri());
            jSONObject.put("extension", wp());
            jSONObject.put("ad_id", HLI());
            jSONObject.put("source", PAe());
            jSONObject.put("app_name", Qk());
            jSONObject.put("screenshot", PER());
            jSONObject.put("dislike_control", qOm());
            jSONObject.put("play_bar_show_time", lG());
            jSONObject.put("play_bar_style", NFd());
            jSONObject.put("if_block_lp", XJ());
            jSONObject.put("cache_sort", vk());
            jSONObject.put("if_sp_cache", Fj());
            jSONObject.put("render_control", EBS());
            jSONObject.put("mrc_report", this.wp);
            jSONObject.put("isMrcReportFinish", this.VV);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(InMobiNetworkValues.CTA, tP());
            jSONObject2.put("other", kYc());
            jSONObject.put("set_click_type", jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("reward_name", MQ());
            jSONObject3.put("reward_amount", qMt());
            jSONObject.put("reward_data", jSONObject3);
            if (!TextUtils.isEmpty(Tgh()) && !TextUtils.isEmpty(ROR())) {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("adchoices_icon", Tgh());
                jSONObject4.put("adchoices_url", ROR());
                jSONObject.put("dsp_adchoices", jSONObject4);
            }
            hpZ dIT = dIT();
            if (dIT != null && !TextUtils.isEmpty(dIT.Qhi())) {
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.put(InMobiNetworkValues.URL, dIT.Qhi());
                jSONObject5.put(InMobiNetworkValues.HEIGHT, dIT.ac());
                jSONObject5.put(InMobiNetworkValues.WIDTH, dIT.cJ());
                jSONObject.put(InMobiNetworkValues.ICON, jSONObject5);
            }
            hpZ Qe = Qe();
            if (Qe != null && !TextUtils.isEmpty(Qe.Qhi())) {
                JSONObject jSONObject6 = new JSONObject();
                jSONObject6.put(InMobiNetworkValues.URL, Qe.Qhi());
                jSONObject6.put(InMobiNetworkValues.HEIGHT, Qe.ac());
                jSONObject6.put(InMobiNetworkValues.WIDTH, Qe.cJ());
                jSONObject.put("cover_image", jSONObject6);
            }
            JSONObject et = et();
            if (et != null) {
                jSONObject.put("session_params", et);
            }
            WAv sDy = sDy();
            if (sDy != null) {
                JSONObject jSONObject7 = new JSONObject();
                jSONObject7.put("click_upper_content_area", sDy.Qhi);
                jSONObject7.put("click_upper_non_content_area", sDy.cJ);
                jSONObject7.put("click_lower_content_area", sDy.f9084ac);
                jSONObject7.put("click_lower_non_content_area", sDy.CJ);
                jSONObject7.put("click_button_area", sDy.f9085fl);
                jSONObject7.put("click_video_area", sDy.Tgh);
                jSONObject.put("click_area", jSONObject7);
            }
            Tgh WAv = WAv();
            if (WAv != null) {
                jSONObject.put("arbitrage_interceptor_params", WAv.Tgh());
            }
            AdSlot lB = lB();
            if (lB != null) {
                jSONObject.put("adslot", lB.toJsonObj());
            }
            List<hpZ> cjC = cjC();
            if (cjC != null) {
                JSONArray jSONArray = new JSONArray();
                for (hpZ hpz : cjC) {
                    JSONObject jSONObject8 = new JSONObject();
                    jSONObject8.put(InMobiNetworkValues.URL, hpz.Qhi());
                    jSONObject8.put(InMobiNetworkValues.HEIGHT, hpz.ac());
                    jSONObject8.put(InMobiNetworkValues.WIDTH, hpz.cJ());
                    jSONObject8.put("image_preview", hpz.Tgh());
                    jSONObject8.put("image_key", hpz.ROR());
                    jSONArray.put(jSONObject8);
                }
                jSONObject.put("image", jSONArray);
            }
            List<String> Hf = Hf();
            if (Hf != null) {
                JSONArray jSONArray2 = new JSONArray();
                for (String str : Hf) {
                    jSONArray2.put(str);
                }
                jSONObject.put("show_url", jSONArray2);
            }
            List<String> NBs = NBs();
            if (NBs != null) {
                JSONArray jSONArray3 = new JSONArray();
                for (String str2 : NBs) {
                    jSONArray3.put(str2);
                }
                jSONObject.put("click_url", jSONArray3);
            }
            List<String> dI = dI();
            if (dI != null) {
                JSONArray jSONArray4 = new JSONArray();
                for (String str3 : dI) {
                    jSONArray4.put(str3);
                }
                jSONObject.put("play_start", jSONArray4);
            }
            jSONObject.put("phone_num", Dq());
            jSONObject.put(InMobiNetworkValues.TITLE, dVA());
            jSONObject.put(InMobiNetworkValues.DESCRIPTION, zjb());
            jSONObject.put("ext", EGK());
            jSONObject.put("image_mode", gga());
            jSONObject.put("cover_click_area", skK());
            jSONObject.put("intercept_flag", Gf());
            jSONObject.put("button_text", ots());
            jSONObject.put("ad_logo", Xw());
            jSONObject.put("video_adaptation", aP());
            jSONObject.put("feed_video_opentype", Dww());
            jSONObject.put("orientation", SL());
            jSONObject.put("aspect_ratio", Oy());
            ac pv = pv();
            if (pv != null) {
                JSONObject jSONObject9 = new JSONObject();
                jSONObject9.put("app_name", pv.cJ());
                jSONObject9.put(InMobiNetworkValues.PACKAGE_NAME, pv.ac());
                jSONObject9.put("download_url", pv.Qhi());
                jSONObject9.put("score", pv.CJ());
                jSONObject9.put("comment_num", pv.fl());
                jSONObject9.put("app_size", pv.Tgh());
                jSONObject9.put("app_category", pv.ROR());
                jSONObject.put("app", jSONObject9);
            }
            zc ReL = ReL();
            if (ReL != null) {
                JSONObject jSONObject10 = new JSONObject();
                jSONObject10.put("deeplink_url", ReL.Qhi());
                jSONObject10.put("fallback_url", ReL.cJ());
                jSONObject10.put("fallback_type", ReL.ac());
                jSONObject.put("deep_link", jSONObject10);
            }
            EBS NLs = NLs();
            if (NLs != null && (ac2 = NLs.ac()) != null) {
                jSONObject.put("oem", ac2);
            }
            List<FilterWord> VnT = VnT();
            if (VnT != null) {
                JSONArray jSONArray5 = new JSONArray();
                for (FilterWord filterWord : VnT) {
                    JSONObject cJ = cJ(filterWord);
                    if (cJ != null) {
                        jSONArray5.put(cJ);
                    }
                }
                jSONObject.put("filter_words", jSONArray5);
            }
            pA().Qhi(jSONObject);
            jSONObject.put("count_down", rzb());
            jSONObject.put("expiration_time", Ura());
            com.bykv.vk.openvk.component.video.api.ac.cJ Ohm = Ohm();
            if (Ohm != null) {
                jSONObject.put("video", Ohm.kYc());
            }
            com.bykv.vk.openvk.component.video.api.ac.cJ Ki = Ki();
            if (Ki != null) {
                jSONObject.put("h265_video", Ki.kYc());
            }
            jSONObject.put("video_encode_type", LcF());
            JSONObject jSONObject11 = new JSONObject();
            jSONObject11.put("if_send_click", yN());
            jSONObject.put("download_conf", jSONObject11);
            if (Gy() != null) {
                JSONObject jSONObject12 = new JSONObject();
                Set<Map.Entry<String, Object>> entrySet = Gy().entrySet();
                if (!entrySet.isEmpty()) {
                    for (Map.Entry<String, Object> entry : entrySet) {
                        jSONObject12.put(entry.getKey(), entry.getValue());
                    }
                }
                jSONObject.put("media_ext", jSONObject12);
            }
            tP.Qhi es = es();
            if (es != null) {
                JSONObject jSONObject13 = new JSONObject();
                jSONObject13.put(FacebookMediationAdapter.KEY_ID, es.fl());
                jSONObject13.put("md5", es.Tgh());
                jSONObject13.put(InMobiNetworkValues.URL, es.ROR());
                jSONObject13.put("data", es.Sf());
                jSONObject13.put("diff_data", es.hm());
                jSONObject13.put("version", es.CJ());
                jSONObject13.put("dynamic_creative", es.WAv());
                jSONObject13.put("engine_version", es.zc());
                jSONObject13.put("ugen_data", es.hpZ());
                jSONObject13.put("ugen_md5", es.pA());
                jSONObject13.put("ugen_url", es.iMK());
                jSONObject.put("tpl_info", jSONObject13);
            }
            jSONObject.put("creative_extra", Jma());
            jSONObject.put("market_url", dzV());
            jSONObject.put("auction_price", Eh());
            jSONObject.put("ad_info", mvd());
            jSONObject.put("is_package_open", XH());
            jSONObject.put("playable_duration_time", TKG());
            jSONObject.put("playable_endcard_close_time", Wrw());
            jSONObject.put("endcard_close_time", vml());
            JSONObject jSONObject14 = new JSONObject();
            jSONObject14.put("render_sequence", CQU());
            jSONObject14.put("backup_render_control", pM());
            jSONObject14.put("reserve_time", SNp());
            jSONObject14.put("render_thread", YD());
            jSONObject.put("render", jSONObject14);
            if (this.IC == null) {
                kYc kyc = new kYc();
                this.IC = kyc;
                kyc.Qhi("");
                this.IC.Qhi(10L);
                this.IC.cJ(20L);
                this.IC.ac(10L);
                this.IC.CJ(20L);
            }
            JSONObject jSONObject15 = new JSONObject();
            jSONObject15.put("onlylp_loading_maxtime", this.IC.Qhi());
            jSONObject15.put("straight_lp_showtime", this.IC.cJ());
            jSONObject15.put("onlyagg_loading_maxtime", this.IC.ac());
            jSONObject15.put("straight_agg_showtime", this.IC.CJ());
            jSONObject15.put("loading_text", this.IC.fl());
            jSONObject.put("interaction_method_params", jSONObject15);
            JSONObject jSONObject16 = new JSONObject();
            jSONObject16.put("splash_clickarea", zc());
            jSONObject16.put("splash_layout_id", ABk());
            jSONObject16.put("load_wait_time", iMK());
            jSONObject.put("splash_control", jSONObject16);
            if (gT()) {
                jSONObject.put("dsp_html", this.bM);
            }
            if (IC()) {
                jSONObject.put("vast_json", this.gT.WAv());
            }
            jSONObject.put("dsp_material_type", nR());
            jSONObject.put("deep_link_appname", this.tP);
            jSONObject.put("landing_page_download_clicktype", this.qMt);
            iMK imk = this.Ug;
            if (imk != null) {
                jSONObject.put("dsp_style", imk.fl());
            }
            jSONObject.put("jump_probability", this.mz);
            jSONObject.put("identificationOverlayContent", this.Ls);
            if (this.eN != null) {
                JSONObject jSONObject17 = new JSONObject();
                jSONObject17.put("endcard", this.eN.Qhi(this.sRC));
                jSONObject.put("ugen", jSONObject17);
            }
            jSONObject.put("preload_h5_type", jN());
            jSONObject.put("hasReportShow", this.cfS);
            jSONObject.put("endcard_creative", this.jWV);
            jSONObject.put("image_stay", this.nR);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public String mvd() {
        return this.DaO;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public int mz() {
        return this.qMt;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public int nR() {
        return this.yy;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public com.bytedance.sdk.component.widget.cJ.Qhi ne() {
        com.bytedance.sdk.component.widget.cJ.Qhi qhi = new com.bytedance.sdk.component.widget.cJ.Qhi();
        qhi.Qhi(this.dIT);
        qhi.cJ(this.EBS);
        qhi.Qhi(EGK());
        return qhi;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public String oU() {
        return this.Eh;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public String ots() {
        if (!TextUtils.isEmpty(this.kYc)) {
            return this.kYc;
        }
        Context Qhi = com.bytedance.sdk.openadsdk.core.HzH.Qhi();
        int ip2 = ip();
        if (ip2 != 2 && ip2 != 3) {
            if (ip2 != 4) {
                if (ip2 != 8) {
                    return this.kYc;
                }
            } else if (Qhi != null) {
                return com.bytedance.sdk.component.utils.MQ.Qhi(Qhi, "tt_video_download_apk");
            } else {
                return this.kYc;
            }
        }
        if (Qhi != null) {
            return com.bytedance.sdk.component.utils.MQ.Qhi(Qhi, "tt_video_mobile_go_detail");
        }
        return this.kYc;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public bxS pA() {
        return this.cJP;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public int pF() {
        JSONObject jSONObject = this.pF;
        if (jSONObject == null) {
            return 0;
        }
        return jSONObject.optInt("easy_playable_skip_duration", 0);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public void pM(String str) {
        this.Ki = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public ac pv() {
        return this.bxS;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public int qMt() {
        return this.sDy;
    }

    public int qOm() {
        return this.lG;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public boolean qb() {
        if (this.Tgh.Qhi > 0) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public boolean rB() {
        if (IC() || qOm() != 1) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public boolean rP() {
        if (sqa() != 3 && sqa() != 4) {
            return false;
        }
        return true;
    }

    public int rzb() {
        return this.js;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public WAv sDy() {
        return this.dI;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public long sRC() {
        if (this.HWc < 0) {
            JSONObject KW = KW();
            if (KW != null) {
                this.HWc = KW.optLong("ad_id", 0L);
            } else {
                this.HWc = 0L;
            }
        }
        return this.HWc;
    }

    public int skK() {
        return this.f9061zn;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public boolean smJ() {
        int i10 = this.Sf;
        if ((i10 == 2 || i10 == 1) && 3 == this.ROR) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public int sqa() {
        if (this.Px < 0) {
            JSONObject KW = KW();
            if (KW != null) {
                this.Px = KW.optInt("ad_slot_type", 0);
            } else {
                this.Px = 0;
            }
        }
        return this.Px;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public int tP() {
        return this.HUk;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public int tcw() {
        if (this.Ewb < 0) {
            try {
                JSONObject KW = KW();
                if (KW != null) {
                    this.Ewb = KW.optInt("is_drop_to_retargeting_sample", 0);
                } else {
                    this.Ewb = 0;
                }
            } catch (Throwable unused) {
                this.Ewb = 0;
            }
        }
        return this.Ewb;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public Jma up() {
        return this.Tgh;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public String usK() {
        return this.jWV;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public boolean uyf() {
        return this.cfS;
    }

    public int vk() {
        return this.Ri;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public int vml() {
        return this.XH;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public void wI() {
        this.Tgh.CJ();
        ROR(false);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public String wa() {
        return this.KW;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public JSONObject wp() {
        return this.pF;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public com.bytedance.sdk.openadsdk.core.ugen.fl.Qhi wv() {
        return this.sRC;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public void xyz(int i10) {
        this.nR = i10;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public double yBk() {
        return fl(KW());
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public int yN() {
        ABk aBk = this.et;
        if (aBk == null) {
            return 0;
        }
        return aBk.Qhi();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public boolean yoW() {
        return this.ejU;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public int yt() {
        return this.yBk;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public String yy() {
        return this.tP;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public int zTC() {
        return this.Wrw;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public int zc() {
        fl flVar = this.LcF;
        if (flVar == null) {
            return 2;
        }
        return flVar.Qhi();
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public String zjb() {
        return this.HzH;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public int zn() {
        return this.dIT;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public void CJ(int i10) {
        this.lB = i10;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public void CQU(int i10) {
        this.lG = i10;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public void Dww(int i10) {
        this.SL = i10;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public String Eh() {
        return this.PER;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public com.bykv.vk.openvk.component.video.api.ac.cJ FQ() {
        return this.es;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public void Gm(int i10) {
        this.zjb = i10;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public void HzH(int i10) {
        this.dIT = i10;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public void Jma(int i10) {
        this.jPH = i10;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public void MQ(int i10) {
        this.YAV = i10;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public String PAe() {
        return this.pM;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public void Qhi(Tgh tgh) {
        this.Em = tgh;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public void ROR(boolean z10) {
        this.Ohm = z10;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public void Sf(boolean z10) {
        this.cfS = z10;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public void WAv(int i10) {
        this.oU = i10;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public int aP() {
        return this.EGK;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public void ac(int i10) {
        this.sDy = i10;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public void bxS(int i10) {
        this.js = i10;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public void cJ(com.bytedance.sdk.openadsdk.core.ugen.fl.Qhi qhi) {
        this.sRC = qhi;
        com.bytedance.sdk.openadsdk.core.ugen.Qhi.cJ.Qhi().Qhi(qhi, "endcard");
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public void es(int i10) {
        this.qMt = i10;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public boolean fl() {
        return this.f9057ip;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public void hm(boolean z10) {
        this.Hy = z10;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public void hpZ(int i10) {
        this.f9061zn = i10;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public void iMK(int i10) {
        this.Ri = i10;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public int ip() {
        return this.ROR;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public void js(int i10) {
        this.Wrw = i10;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public void kYc(int i10) {
        this.smJ = i10;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public void lB(int i10) {
        this.YD = Math.max(0, i10);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public void lG(int i10) {
        this.eG = i10;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public void pA(int i10) {
        this.Ura = i10;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public int pM() {
        return this.NBs;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public void qMt(int i10) {
        this.YCN = i10;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public void sDy(int i10) {
        this.wp = i10;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public void tP(int i10) {
        this.ROR = i10;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public boolean xyz() {
        return this.smJ == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public void yN(int i10) {
        this.yy = i10;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public void zc(int i10) {
        this.HLI = i10;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public void zn(int i10) {
        this.vml = i10;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public void CJ(boolean z10) {
        this.MND = z10;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public String CQU(String str) {
        JSONObject KW = KW();
        return KW != null ? KW.optString("rit", str) : str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public void Dww(String str) {
        this.tP = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public void Eh(int i10) {
        this.mZ = i10;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public void Gm(String str) {
        this.pM = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public void HzH(String str) {
        this.kYc = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public void MQ(String str) {
        this.aP = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public void Qhi(kYc kyc) {
        this.IC = kyc;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public void ROR(String str) {
        this.NFd = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public void Sf(String str) {
        this.DaO = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public String Tgh() {
        return this.f9058ne;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public void WAv(String str) {
        this.cjC = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public void aP(int i10) {
        this.SO = i10;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public void ac(hpZ hpz) {
        this.f9054ac.add(hpz);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public void bxS(String str) {
        this.bM = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public void fl(String str) {
        this.f9058ne = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public void hm(String str) {
        this.PER = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public void hpZ(String str) {
        this.HzH = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public void iMK(String str) {
        this.ABk = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public void kYc(String str) {
        this.EBS = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public void pA(String str) {
        this.hpZ = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public void pM(int i10) {
        this.rB = i10;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public void qMt(String str) {
        this.Gy = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public void tP(String str) {
        this.Eh = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public void zc(String str) {
        this.MQ = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public void ABk(int i10) {
        this.dVA = i10;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public void CJ(JSONObject jSONObject) {
        this.pF = jSONObject;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public void EBS(int i10) {
        this.CQU = i10;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public void NFd(int i10) {
        this.XH = i10;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public void Qhi(com.bytedance.sdk.openadsdk.core.ugen.fl.Qhi qhi) {
        this.eN = qhi;
        com.bytedance.sdk.openadsdk.core.ugen.Qhi.cJ.Qhi().Qhi(qhi, "endcard");
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public void ROR(int i10) {
        this.Hf = i10;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public void Sf(int i10) {
        this.NBs = i10;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public void Tgh(String str) {
        this.zTC = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public void ac(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.ROR = 4;
        this.EBS = jSONObject.optString(FacebookMediationAdapter.KEY_ID);
        this.pM = jSONObject.optString("source");
        ac acVar = new ac();
        this.bxS = acVar;
        acVar.ac(jSONObject.optString("pkg_name"));
        this.bxS.cJ(jSONObject.optString(NamingTable.TAG));
        this.bxS.Qhi(jSONObject.optString("download_url"));
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public void cJ(int i10) {
        this.Sf = i10;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public void fl(int i10) {
        this.ReL = i10;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public void hm(int i10) {
        this.EGK = i10;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public void ABk(String str) {
        this.f9060zc = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public void EBS(String str) {
        this.pv = str;
    }

    public void NFd(String str) {
        this.SNp = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public void Tgh(int i10) {
        this.gga = i10;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public void cJ(double d10) {
        if (d10 != 2.0d && d10 != 1.0d) {
            this.HUk = 2;
        } else {
            this.HUk = (int) d10;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public void fl(boolean z10) {
        this.rP = z10;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public void Qhi(fl flVar) {
        this.LcF = flVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public void Tgh(boolean z10) {
        this.Qhi = z10;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public void Qhi(bxS bxs) {
        this.cJP = bxs;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public void cJ(hpZ hpz) {
        this.Gm = hpz;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public void Qhi(int i10) {
        Qhi(i10, -1);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public void cJ(long j10) {
        this.Jma = j10;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public void Qhi(int i10, int i11) {
        this.f9056hm = i10;
        this.Sf = i10;
        if (this.ots == null) {
            this.Sf = 0;
            return;
        }
        if (i11 <= 0) {
            i11 = sqa();
        }
        if (this.ots.getNativeAdType() != 3 && this.ots.getDurationSlotType() != 3 && i11 != 3) {
            if (this.ots.getNativeAdType() != 7 && this.ots.getNativeAdType() != 8 && this.ots.getDurationSlotType() != 7 && this.ots.getDurationSlotType() != 8 && i11 != 7 && i11 != 8) {
                if (bxS.cJ(this)) {
                    this.Sf = 4;
                    return;
                }
                if (this.f9056hm == 4 && !bxS.cJ(this)) {
                    this.Sf = 0;
                }
                if (i10 >= 5) {
                    this.Sf = 0;
                    return;
                } else if (this.f9056hm == 2 && ip() != 3) {
                    this.Sf = 0;
                    return;
                } else if (i10 == 0 || (i10 == 1 && ip() != 3)) {
                    this.Sf = 0;
                    return;
                } else {
                    return;
                }
            } else if (bxS.Gm(this)) {
                this.Sf = 12;
                return;
            } else if (bxS.cJ(this)) {
                this.Sf = 9;
                return;
            } else {
                if (this.f9056hm == 5 && !HzH.ac(this)) {
                    this.Sf = 7;
                }
                if (this.f9056hm == 6 && !HzH.cJ(this)) {
                    this.Sf = 7;
                }
                if (this.f9056hm == 8 && skK() != 100) {
                    this.Sf = 7;
                }
                if (this.f9056hm == 19 && TextUtils.isEmpty(this.f9060zc)) {
                    this.Sf = 7;
                }
                if (this.f9056hm == 20 && TextUtils.isEmpty(this.f9060zc)) {
                    this.Sf = 7;
                }
                if (i10 < 5) {
                    this.Sf = 7;
                    return;
                }
                return;
            }
        }
        this.Sf = 14;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public void cJ(JSONObject jSONObject) {
        this.VnT = jSONObject;
    }

    private JSONObject cJ(FilterWord filterWord) {
        if (filterWord == null) {
            return null;
        }
        try {
            if (filterWord.isValid()) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(FacebookMediationAdapter.KEY_ID, filterWord.getId());
                jSONObject.put(NamingTable.TAG, filterWord.getName());
                jSONObject.put("is_selected", filterWord.getIsSelected());
                if (filterWord.hasSecondOptions()) {
                    JSONArray jSONArray = new JSONArray();
                    for (FilterWord filterWord2 : filterWord.getOptions()) {
                        jSONArray.put(cJ(filterWord2));
                    }
                    if (jSONArray.length() > 0) {
                        jSONObject.put("options", jSONArray);
                    }
                }
                return jSONObject;
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public void ac(com.bykv.vk.openvk.component.video.api.ac.cJ cJVar) {
        this.yN = cJVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public void ac(long j10) {
        this.cJ = j10;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public void cJ(com.bykv.vk.openvk.component.video.api.ac.cJ cJVar) {
        this.FQ = cJVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public void Qhi(double d10) {
        if (d10 != 2.0d && d10 != 1.0d) {
            this.TKG = 1;
        } else {
            this.TKG = (int) d10;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public void Qhi(WAv wAv) {
        this.dI = wAv;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public void Qhi(AdSlot adSlot) {
        this.ots = adSlot;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public void Qhi(tP.Qhi qhi) {
        this.YB = qhi;
        com.bytedance.sdk.component.adexpress.Qhi.ac.fl cR = cR();
        if (cR != null && !this.YB.ABk()) {
            com.bytedance.sdk.component.adexpress.Qhi.cJ.cJ.Qhi(cR);
        }
        if (qhi == null || TextUtils.isEmpty(qhi.iMK())) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.ugen.Qhi.cJ.Qhi().Qhi(MAG(), "ad");
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public void Qhi(com.bykv.vk.openvk.component.video.api.ac.cJ cJVar) {
        this.es = cJVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public void Qhi(ABk aBk) {
        this.et = aBk;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public void Qhi(hpZ hpz) {
        this.WAv = hpz;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public void Qhi(ac acVar) {
        this.bxS = acVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public void Qhi(zc zcVar) {
        this.Dww = zcVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public void Qhi(FilterWord filterWord) {
        this.f9055fl.add(filterWord);
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public void Qhi(Map<String, Object> map) {
        this.Qe = map;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public void Qhi(float f10) {
        this.Oy = f10;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public void Qhi(com.bytedance.sdk.openadsdk.core.ROR.Qhi qhi) {
        this.gT = qhi;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public void Qhi(iMK imk) {
        this.Ug = imk;
    }

    @Override // com.bytedance.sdk.openadsdk.core.model.tP
    public void Qhi(EBS ebs) {
        this.f9059qb = ebs;
    }
}
