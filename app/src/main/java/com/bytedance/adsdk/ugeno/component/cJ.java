package com.bytedance.adsdk.ugeno.component;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.adsdk.ugeno.ac;
import com.bytedance.adsdk.ugeno.cJ.Qhi;
import com.bytedance.adsdk.ugeno.cJ.fl;
import com.bytedance.adsdk.ugeno.component.Qhi;
import com.bytedance.adsdk.ugeno.core.ABk;
import com.bytedance.adsdk.ugeno.core.HzH;
import com.bytedance.adsdk.ugeno.core.IAnimation;
import com.bytedance.adsdk.ugeno.core.ROR;
import com.bytedance.adsdk.ugeno.core.Sf;
import com.bytedance.adsdk.ugeno.core.WAv;
import com.bytedance.adsdk.ugeno.core.cJ.Tgh;
import com.bytedance.adsdk.ugeno.core.hm;
import com.bytedance.adsdk.ugeno.core.iMK;
import com.bytedance.adsdk.ugeno.core.pA;
import com.bytedance.adsdk.ugeno.core.zc;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import com.inmobi.media.C1646h;
import com.tom_roush.fontbox.ttf.NamingTable;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: UGenWidget.java */
/* loaded from: classes.dex */
public abstract class cJ<T extends View> implements ac, iMK.Qhi, iMK.cJ {
    protected float ABk;
    protected JSONObject CJ;
    protected boolean CQU;
    private Tgh Dq;
    protected boolean Dww;
    protected float EBS;
    private boolean EGK;
    protected boolean Eh;
    protected float FQ;
    protected String Gm;
    private float Gy;
    private HzH HLI;
    private com.bytedance.adsdk.ugeno.core.cJ.cJ Hf;
    protected float HzH;
    protected float Jma;
    protected Map<Integer, zc> MND;
    protected float MQ;
    private com.bytedance.adsdk.ugeno.core.cJ.Qhi NBs;
    protected String NFd;
    protected boolean PAe;
    private float PER;
    private boolean Qe;
    private GradientDrawable Qhi;
    protected Qhi<ViewGroup> ROR;
    private boolean ReL;
    private boolean Ri;
    protected ROR.Qhi Sf;
    protected Qhi<ViewGroup> Tgh;
    private boolean Ura;
    private JSONObject VnT;
    protected String WAv;
    private Qhi.C0073Qhi YB;
    protected int aP;

    /* renamed from: ac  reason: collision with root package name */
    protected JSONObject f7875ac;
    protected float bxS;
    protected Context cJ;
    private com.bytedance.adsdk.ugeno.core.Qhi cjC;
    private hm dI;
    private String dIT;
    private String dVA;
    protected int es;

    /* renamed from: fl  reason: collision with root package name */
    protected T f7876fl;
    private boolean gga;

    /* renamed from: hm  reason: collision with root package name */
    protected WAv f7877hm;
    protected float hpZ;
    protected float iMK;

    /* renamed from: ip  reason: collision with root package name */
    protected Sf f7878ip;
    protected pA jPH;
    protected float js;
    protected float kYc;
    protected float lB;
    protected float lG;
    private boolean oU;
    private boolean ots;
    protected float pA;
    protected boolean pM;
    private boolean pv;
    protected float qMt;
    protected float sDy;
    protected float tP;
    protected iMK xyz;
    protected int yN;

    /* renamed from: zc  reason: collision with root package name */
    protected float f7879zc;
    private boolean zjb;

    /* renamed from: zn  reason: collision with root package name */
    protected float f7880zn;

    public cJ(Context context) {
        this(context, null);
    }

    private void Sf() {
        if (TextUtils.isEmpty(this.NFd)) {
            this.Qhi.setShape(0);
            if (this.Qe) {
                Qhi.C0073Qhi c0073Qhi = this.YB;
                if (c0073Qhi != null) {
                    this.Qhi.setOrientation(c0073Qhi.Qhi);
                    if (Build.VERSION.SDK_INT >= 29) {
                        GradientDrawable gradientDrawable = this.Qhi;
                        Qhi.C0073Qhi c0073Qhi2 = this.YB;
                        gradientDrawable.setColors(c0073Qhi2.cJ, c0073Qhi2.f7871ac);
                    } else {
                        this.Qhi.setColors(this.YB.cJ);
                    }
                }
            } else {
                this.Qhi.setColor(this.aP);
            }
            this.Qhi.setCornerRadius(this.sDy);
            this.Qhi.setStroke((int) this.f7880zn, this.es);
            this.f7876fl.setBackground(this.Qhi);
        } else if (this.NFd.startsWith("local://")) {
            String replace = this.NFd.replace("local://", "");
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inPreferredConfig = Bitmap.Config.RGB_565;
                options.inPurgeable = true;
                options.inInputShareable = true;
                this.f7876fl.setBackground(new BitmapDrawable(this.cJ.getResources(), BitmapFactory.decodeStream(this.cJ.getResources().openRawResource(fl.cJ(this.cJ, replace)), null, options)));
            } catch (Throwable unused) {
            }
        }
    }

    public Qhi ABk() {
        return this.Tgh;
    }

    public JSONObject Gm() {
        return this.f7875ac;
    }

    public int HzH() {
        return (int) this.ABk;
    }

    public void Qhi(JSONObject jSONObject) {
        JSONObject jSONObject2;
        this.CJ = jSONObject;
        JSONObject jSONObject3 = this.f7875ac;
        if (jSONObject3 == null) {
            return;
        }
        Iterator<String> keys = jSONObject3.keys();
        Qhi<ViewGroup> qhi = this.Tgh;
        Qhi.C0074Qhi Sf = qhi instanceof Qhi ? qhi.Sf() : null;
        while (keys.hasNext()) {
            String next = keys.next();
            String Qhi = com.bytedance.adsdk.ugeno.Qhi.ac.Qhi(this.f7875ac.optString(next), jSONObject);
            Qhi(next, Qhi);
            if (Sf != null) {
                Sf.Qhi(this.cJ, next, Qhi);
            }
        }
        if (Sf != null) {
            Qhi(Sf.Qhi());
        }
        JSONObject jSONObject4 = this.VnT;
        if (jSONObject4 == null || (jSONObject2 = this.CJ) == null) {
            return;
        }
        try {
            jSONObject2.put("i18n", jSONObject4);
            Objects.toString(this.VnT);
        } catch (JSONException unused) {
        }
    }

    @Override // com.bytedance.adsdk.ugeno.ac
    public void ROR() {
        hm hmVar = this.dI;
        if (hmVar != null) {
            hmVar.cJ();
        }
    }

    @Override // com.bytedance.adsdk.ugeno.ac
    public void Tgh() {
        com.bytedance.adsdk.ugeno.core.Qhi qhi = this.cjC;
        if (qhi != null) {
            hm hmVar = new hm(this.f7876fl, qhi);
            this.dI = hmVar;
            hmVar.Qhi();
        }
        if (this.Hf != null && cJ(10)) {
            this.Hf.Qhi();
        }
        if (this.Dq != null && cJ(9)) {
            this.Dq.Qhi();
        }
    }

    public JSONObject WAv() {
        return this.CJ;
    }

    public T ac() {
        return null;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void cJ() {
        final com.bytedance.adsdk.ugeno.core.cJ.fl flVar;
        Sf();
        this.f7876fl.setAlpha(this.PER);
        this.f7876fl.setPadding((int) (this.Dww ? this.MQ : this.tP), (int) (this.pM ? this.EBS : this.tP), (int) (this.CQU ? this.qMt : this.tP), (int) (this.Eh ? this.bxS : this.tP));
        this.f7876fl.setVisibility(this.yN);
        ROR.Qhi qhi = this.Sf;
        if (qhi != null && TextUtils.isEmpty(qhi.cJ())) {
            this.f7876fl.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.adsdk.ugeno.component.cJ.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    cJ cJVar = cJ.this;
                    if (cJVar.f7878ip != null) {
                        boolean unused = cJVar.gga;
                    }
                }
            });
        } else if (cJ(1) && !this.zjb) {
            this.f7876fl.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.adsdk.ugeno.component.cJ.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    cJ cJVar = cJ.this;
                    if (cJVar.xyz != null && cJVar.gga) {
                        cJ cJVar2 = cJ.this;
                        cJ cJVar3 = cJ.this;
                        cJVar2.xyz.Qhi(cJVar2.MND.get(1), cJVar3, cJVar3);
                    }
                }
            });
        }
        final com.bytedance.adsdk.ugeno.core.cJ.ac acVar = null;
        if (this.xyz == null || !cJ(4)) {
            flVar = null;
        } else if (cJ(1)) {
            this.ots = true;
            flVar = new com.bytedance.adsdk.ugeno.core.cJ.fl(this.cJ, this.MND.get(4), this.MND.get(1), this.ots);
        } else {
            flVar = new com.bytedance.adsdk.ugeno.core.cJ.fl(this.cJ, this.MND.get(4), this.ots);
        }
        if (this.xyz != null && cJ(1) && this.zjb) {
            acVar = new com.bytedance.adsdk.ugeno.core.cJ.ac(this.cJ, this.MND.get(1));
        }
        if (this.xyz != null && cJ(3)) {
            this.NBs = new com.bytedance.adsdk.ugeno.core.cJ.Qhi(this.cJ);
            new Object() { // from class: com.bytedance.adsdk.ugeno.component.cJ.3
            };
        }
        if (this.xyz != null && cJ(9)) {
            Tgh tgh = new Tgh(this.cJ, this.MND.get(9), this);
            this.Dq = tgh;
            tgh.Qhi(this.xyz);
        }
        if (cJ(10)) {
            com.bytedance.adsdk.ugeno.core.cJ.cJ cJVar = new com.bytedance.adsdk.ugeno.core.cJ.cJ(this.cJ, this.MND.get(10), this);
            this.Hf = cJVar;
            cJVar.Qhi(this.xyz);
        }
        this.f7876fl.setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.adsdk.ugeno.component.cJ.4
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                com.bytedance.adsdk.ugeno.core.cJ.fl flVar2;
                cJ cJVar2;
                iMK imk;
                com.bytedance.adsdk.ugeno.core.cJ.ac acVar2;
                cJ cJVar3 = cJ.this;
                pA pAVar = cJVar3.jPH;
                if (pAVar != null) {
                    pAVar.Qhi(cJVar3, motionEvent);
                }
                if (cJ.this.cJ(17) && motionEvent.getAction() == 0) {
                    cJ cJVar4 = cJ.this;
                    cJ cJVar5 = cJ.this;
                    cJVar4.xyz.Qhi(cJVar4.MND.get(17), cJVar5, cJVar5);
                }
                if (cJ.this.cJ(1) && cJ.this.zjb && (imk = (cJVar2 = cJ.this).xyz) != null && (acVar2 = acVar) != null) {
                    return acVar2.Qhi(imk, cJVar2, motionEvent);
                }
                cJ cJVar6 = cJ.this;
                iMK imk2 = cJVar6.xyz;
                if (imk2 != null && (flVar2 = flVar) != null) {
                    return flVar2.Qhi(imk2, cJVar6, motionEvent);
                }
                return false;
            }
        });
        Qhi();
    }

    @Override // com.bytedance.adsdk.ugeno.ac
    public void fl() {
        if (this.HLI != null && !this.ReL) {
            this.ReL = true;
        }
    }

    public T hm() {
        return this.f7876fl;
    }

    public int hpZ() {
        return (int) this.f7879zc;
    }

    public String iMK() {
        return this.WAv;
    }

    public boolean kYc() {
        return this.PAe;
    }

    public String pA() {
        return this.Gm;
    }

    public ROR.Qhi zc() {
        return this.Sf;
    }

    public cJ(Context context, Qhi<ViewGroup> qhi) {
        this.f7879zc = -2.0f;
        this.ABk = -2.0f;
        this.yN = 0;
        this.PAe = true;
        this.gga = true;
        this.Ri = false;
        this.Ura = false;
        this.PER = 1.0f;
        this.Gy = 12.0f;
        this.cJ = context;
        this.Tgh = qhi;
        this.MND = new HashMap();
        this.Qhi = new GradientDrawable();
        this.f7876fl = ac();
    }

    public void CJ(String str) {
        this.Gm = str;
    }

    @Override // com.bytedance.adsdk.ugeno.ac
    public void CJ() {
        if (this.HLI == null || this.oU) {
            return;
        }
        this.oU = true;
    }

    public void ac(int i10) {
        this.f7876fl.setVisibility(i10);
    }

    public void ac(String str) {
        this.WAv = str;
    }

    private void Qhi() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.WAv);
        sb2.append(":");
        sb2.append(this.Gm);
        sb2.append(":");
        if (cJ(1)) {
            sb2.append("1:");
            zc zcVar = this.MND.get(1);
            if (zcVar != null && zcVar.ac() != null) {
                sb2.append(zcVar.ac().optString("type"));
            }
        } else {
            sb2.append(PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES);
        }
        this.f7876fl.setContentDescription(sb2);
    }

    public void Qhi(HzH hzH) {
        this.HLI = hzH;
    }

    public void Qhi(pA pAVar) {
        this.jPH = pAVar;
    }

    public void Qhi(iMK imk) {
        this.xyz = imk;
    }

    public void Qhi(ViewGroup.LayoutParams layoutParams) {
        T t4 = this.f7876fl;
        if (t4 != null) {
            t4.setLayoutParams(layoutParams);
        }
    }

    public void Qhi(ROR.Qhi qhi) {
        this.Sf = qhi;
    }

    public cJ<T> Qhi(String str) {
        if (TextUtils.isEmpty(this.WAv) || !TextUtils.equals(this.WAv, str)) {
            return null;
        }
        return this;
    }

    public boolean cJ(int i10) {
        Map<Integer, zc> map = this.MND;
        return map != null && map.containsKey(Integer.valueOf(i10));
    }

    public void Qhi(Qhi qhi) {
        this.Tgh = qhi;
    }

    public void cJ(JSONObject jSONObject) {
        this.f7875ac = jSONObject;
    }

    public void Qhi(WAv wAv) {
        this.f7877hm = wAv;
    }

    public cJ<T> cJ(String str) {
        return Qhi(str);
    }

    public void Qhi(Sf sf2) {
        this.f7878ip = sf2;
    }

    public void cJ(String str, String str2) {
        if (!TextUtils.isEmpty(str2) && this.MND != null) {
            try {
                int Qhi = ABk.Qhi(str).Qhi();
                zc zcVar = new zc();
                zcVar.Qhi(Qhi);
                zcVar.Qhi(this);
                JSONObject jSONObject = new JSONObject(str2);
                if (Qhi == 3) {
                    try {
                        this.Gy = Float.parseFloat(com.bytedance.adsdk.ugeno.Qhi.ac.Qhi(jSONObject.optString("shakeAmplitude"), this.CJ));
                    } catch (NumberFormatException unused) {
                        this.Gy = 12.0f;
                    }
                }
                iMK imk = this.xyz;
                if (!(imk instanceof com.bytedance.adsdk.ugeno.core.Qhi.Qhi)) {
                    Qhi(Qhi, jSONObject, zcVar);
                } else if (!((com.bytedance.adsdk.ugeno.core.Qhi.Qhi) imk).Qhi()) {
                    Qhi(Qhi, jSONObject, zcVar);
                } else {
                    zcVar.Qhi(jSONObject);
                    this.MND.put(Integer.valueOf(Qhi), zcVar);
                }
            } catch (JSONException unused2) {
            }
        }
    }

    public void Qhi(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1964681502:
                if (str.equals("clickable")) {
                    c = 0;
                    break;
                }
                break;
            case -1501175880:
                if (str.equals("paddingLeft")) {
                    c = 1;
                    break;
                }
                break;
            case -1351184668:
                if (str.equals("onDelay")) {
                    c = 2;
                    break;
                }
                break;
            case -1337252761:
                if (str.equals("onShake")) {
                    c = 3;
                    break;
                }
                break;
            case -1337126126:
                if (str.equals("onSlide")) {
                    c = 4;
                    break;
                }
                break;
            case -1336288090:
                if (str.equals("onTimer")) {
                    c = 5;
                    break;
                }
                break;
            case -1332194002:
                if (str.equals("background")) {
                    c = 6;
                    break;
                }
                break;
            case -1267206133:
                if (str.equals("opacity")) {
                    c = 7;
                    break;
                }
                break;
            case -1221029593:
                if (str.equals(InMobiNetworkValues.HEIGHT)) {
                    c = '\b';
                    break;
                }
                break;
            case -1081309778:
                if (str.equals("margin")) {
                    c = '\t';
                    break;
                }
                break;
            case -1055029545:
                if (str.equals("borderRightTopRadius")) {
                    c = '\n';
                    break;
                }
                break;
            case -1044792121:
                if (str.equals("marginTop")) {
                    c = 11;
                    break;
                }
                break;
            case -1013407967:
                if (str.equals("onDown")) {
                    c = '\f';
                    break;
                }
                break;
            case -933876756:
                if (str.equals("backgroundDrawable")) {
                    c = '\r';
                    break;
                }
                break;
            case -806339567:
                if (str.equals("padding")) {
                    c = 14;
                    break;
                }
                break;
            case -681357156:
                if (str.equals("triggerFunc")) {
                    c = 15;
                    break;
                }
                break;
            case -289173127:
                if (str.equals("marginBottom")) {
                    c = 16;
                    break;
                }
                break;
            case -179345264:
                if (str.equals("borderLeftBottomRadius")) {
                    c = 17;
                    break;
                }
                break;
            case 3355:
                if (str.equals(FacebookMediationAdapter.KEY_ID)) {
                    c = 18;
                    break;
                }
                break;
            case 3176990:
                if (str.equals("i18n")) {
                    c = 19;
                    break;
                }
                break;
            case 3373707:
                if (str.equals(NamingTable.TAG)) {
                    c = 20;
                    break;
                }
                break;
            case 90130308:
                if (str.equals("paddingTop")) {
                    c = 21;
                    break;
                }
                break;
            case 94750088:
                if (str.equals(C1646h.CLICK_BEACON)) {
                    c = 22;
                    break;
                }
                break;
            case 105871684:
                if (str.equals("onTap")) {
                    c = 23;
                    break;
                }
                break;
            case 108285963:
                if (str.equals("ratio")) {
                    c = 24;
                    break;
                }
                break;
            case 113126854:
                if (str.equals(InMobiNetworkValues.WIDTH)) {
                    c = 25;
                    break;
                }
                break;
            case 202355100:
                if (str.equals("paddingBottom")) {
                    c = 26;
                    break;
                }
                break;
            case 320386138:
                if (str.equals("onLoadMore")) {
                    c = 27;
                    break;
                }
                break;
            case 713848971:
                if (str.equals("paddingRight")) {
                    c = 28;
                    break;
                }
                break;
            case 722830999:
                if (str.equals("borderColor")) {
                    c = 29;
                    break;
                }
                break;
            case 741115130:
                if (str.equals("borderWidth")) {
                    c = 30;
                    break;
                }
                break;
            case 843948038:
                if (str.equals("onExposure")) {
                    c = 31;
                    break;
                }
                break;
            case 975087886:
                if (str.equals("marginRight")) {
                    c = ' ';
                    break;
                }
                break;
            case 1087723621:
                if (str.equals("onAnimation")) {
                    c = '!';
                    break;
                }
                break;
            case 1151851515:
                if (str.equals("animatorSet")) {
                    c = '\"';
                    break;
                }
                break;
            case 1158381436:
                if (str.equals("onPullToRefresh")) {
                    c = '#';
                    break;
                }
                break;
            case 1259700532:
                if (str.equals("borderLeftTopRadius")) {
                    c = '$';
                    break;
                }
                break;
            case 1349188574:
                if (str.equals("borderRadius")) {
                    c = '%';
                    break;
                }
                break;
            case 1490730380:
                if (str.equals("onScroll")) {
                    c = '&';
                    break;
                }
                break;
            case 1685004456:
                if (str.equals("onLongTap")) {
                    c = '\'';
                    break;
                }
                break;
            case 1691835405:
                if (str.equals("borderRightBottomRadius")) {
                    c = '(';
                    break;
                }
                break;
            case 1941332754:
                if (str.equals("visibility")) {
                    c = ')';
                    break;
                }
                break;
            case 1970934485:
                if (str.equals("marginLeft")) {
                    c = '*';
                    break;
                }
                break;
            case 1997542747:
                if (str.equals("availability")) {
                    c = '+';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                this.gga = com.bytedance.adsdk.ugeno.cJ.ac.Qhi(str2, true);
                return;
            case 1:
                this.MQ = com.bytedance.adsdk.ugeno.cJ.hm.Qhi(this.cJ, str2);
                this.Dww = true;
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case '\f':
            case 23:
            case 27:
            case 31:
            case '!':
            case '#':
            case '&':
            case '\'':
                cJ(str, str2);
                return;
            case 6:
                if (com.bytedance.adsdk.ugeno.cJ.Qhi.ac(str2)) {
                    this.Qe = true;
                    this.YB = com.bytedance.adsdk.ugeno.cJ.Qhi.cJ(str2);
                    return;
                }
                this.aP = com.bytedance.adsdk.ugeno.cJ.Qhi.Qhi(str2);
                this.Qe = false;
                return;
            case 7:
                this.PER = com.bytedance.adsdk.ugeno.cJ.ac.Qhi(str2, 1.0f);
                return;
            case '\b':
                if (TextUtils.equals(str2, "match_parent")) {
                    this.ABk = -1.0f;
                } else if (TextUtils.equals(str2, "wrap_content")) {
                    this.ABk = -2.0f;
                } else {
                    this.ABk = com.bytedance.adsdk.ugeno.cJ.hm.Qhi(this.cJ, str2);
                }
                this.Ura = true;
                return;
            case '\t':
                this.iMK = com.bytedance.adsdk.ugeno.cJ.hm.Qhi(this.cJ, str2);
                return;
            case '\n':
                this.Jma = com.bytedance.adsdk.ugeno.cJ.hm.Qhi(this.cJ, str2);
                return;
            case 11:
                this.HzH = com.bytedance.adsdk.ugeno.cJ.hm.Qhi(this.cJ, str2);
                return;
            case '\r':
                this.NFd = str2;
                return;
            case 14:
                this.tP = com.bytedance.adsdk.ugeno.cJ.hm.Qhi(this.cJ, str2);
                return;
            case 15:
                this.dVA = str2;
                return;
            case 16:
                this.kYc = com.bytedance.adsdk.ugeno.cJ.hm.Qhi(this.cJ, str2);
                return;
            case 17:
                this.lG = com.bytedance.adsdk.ugeno.cJ.hm.Qhi(this.cJ, str2);
                return;
            case 18:
                this.WAv = str2;
                return;
            case 19:
                this.VnT = com.bytedance.adsdk.ugeno.cJ.cJ.Qhi(str2, (JSONObject) null);
                return;
            case 20:
                this.Gm = str2;
                return;
            case 21:
                this.EBS = com.bytedance.adsdk.ugeno.cJ.hm.Qhi(this.cJ, str2);
                this.pM = true;
                return;
            case 22:
                this.dIT = str2;
                return;
            case 24:
                this.FQ = com.bytedance.adsdk.ugeno.cJ.ac.Qhi(str2, 0.0f);
                return;
            case 25:
                if (TextUtils.equals(str2, "match_parent")) {
                    this.f7879zc = -1.0f;
                } else if (TextUtils.equals(str2, "wrap_content")) {
                    this.f7879zc = -2.0f;
                } else {
                    this.f7879zc = com.bytedance.adsdk.ugeno.cJ.hm.Qhi(this.cJ, str2);
                }
                this.Ri = true;
                return;
            case 26:
                this.bxS = com.bytedance.adsdk.ugeno.cJ.hm.Qhi(this.cJ, str2);
                this.Eh = true;
                return;
            case 28:
                this.qMt = com.bytedance.adsdk.ugeno.cJ.hm.Qhi(this.cJ, str2);
                this.CQU = true;
                return;
            case 29:
                this.es = com.bytedance.adsdk.ugeno.cJ.Qhi.Qhi(str2);
                return;
            case 30:
                this.f7880zn = com.bytedance.adsdk.ugeno.cJ.hm.Qhi(this.cJ, str2);
                return;
            case ' ':
                this.hpZ = com.bytedance.adsdk.ugeno.cJ.hm.Qhi(this.cJ, str2);
                return;
            case '\"':
                this.cjC = com.bytedance.adsdk.ugeno.core.Qhi.Qhi(str2, this);
                return;
            case '$':
                this.lB = com.bytedance.adsdk.ugeno.cJ.hm.Qhi(this.cJ, str2);
                return;
            case '%':
                this.sDy = com.bytedance.adsdk.ugeno.cJ.hm.Qhi(this.cJ, str2);
                return;
            case '(':
                this.js = com.bytedance.adsdk.ugeno.cJ.hm.Qhi(this.cJ, str2);
                return;
            case ')':
                if (TextUtils.equals("visible", str2)) {
                    this.yN = 0;
                    return;
                } else if (TextUtils.equals("invisible", str2)) {
                    this.yN = 4;
                    return;
                } else if (TextUtils.equals("gone", str2)) {
                    this.yN = 8;
                    return;
                } else {
                    return;
                }
            case '*':
                this.pA = com.bytedance.adsdk.ugeno.cJ.hm.Qhi(this.cJ, str2);
                return;
            case '+':
                this.PAe = !TextUtils.equals(str2, "unavailable");
                return;
            default:
                return;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.ac
    public void cJ(int i10, int i11, int i12, int i13) {
        hm hmVar = this.dI;
        if (hmVar != null) {
            hmVar.Qhi(i10, i11);
        }
    }

    public cJ cJ(cJ cJVar) {
        return (cJVar.ABk() == null && (cJVar instanceof Qhi)) ? cJVar : cJ(cJVar.ABk());
    }

    @Deprecated
    public void Qhi(int i10, JSONObject jSONObject, zc zcVar) {
        JSONObject optJSONObject = jSONObject.optJSONObject("success");
        if (optJSONObject != null) {
            zc zcVar2 = new zc();
            zcVar2.Qhi(optJSONObject);
            zcVar2.Qhi(this);
            zcVar.Qhi(zcVar2);
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("fail");
        if (optJSONObject2 != null) {
            zc zcVar3 = new zc();
            zcVar3.Qhi(optJSONObject2);
            zcVar3.Qhi(this);
            zcVar.cJ(zcVar3);
        }
        zcVar.Qhi(jSONObject);
        this.MND.put(Integer.valueOf(i10), zcVar);
    }

    @Override // com.bytedance.adsdk.ugeno.ac
    public int[] Qhi(int i10, int i11) {
        if (this.FQ > 0.0f) {
            if (this.Ri) {
                int size = View.MeasureSpec.getSize(i10);
                float f10 = this.FQ;
                if (f10 != 0.0f) {
                    i11 = View.MeasureSpec.makeMeasureSpec((int) (size / f10), 1073741824);
                }
            } else if (this.Ura) {
                int size2 = View.MeasureSpec.getSize(i11);
                float f11 = this.FQ;
                if (f11 != 0.0f) {
                    i10 = View.MeasureSpec.makeMeasureSpec((int) (size2 * f11), 1073741824);
                }
            }
        }
        if (this.HLI != null && !this.pv) {
            this.pv = true;
        }
        return new int[]{i10, i11};
    }

    @Override // com.bytedance.adsdk.ugeno.ac
    public void Qhi(int i10, int i11, int i12, int i13) {
        if (this.HLI == null || this.EGK) {
            return;
        }
        this.EGK = true;
    }

    @Override // com.bytedance.adsdk.ugeno.ac
    public void Qhi(Canvas canvas, IAnimation iAnimation) {
        hm hmVar = this.dI;
        if (hmVar != null) {
            hmVar.Qhi(canvas, iAnimation);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.core.iMK.cJ
    public void Qhi(zc zcVar) {
        Qhi<ViewGroup> qhi;
        cJ<T> cJ;
        if (zcVar == null || zcVar.ac() == null || !TextUtils.equals(zcVar.ac().optString("type"), "onDismiss")) {
            return;
        }
        String optString = zcVar.ac().optString("nodeId");
        ac(8);
        this.ROR = (Qhi) cJ(this);
        if (TextUtils.isEmpty(optString) || (qhi = this.ROR) == null || (cJ = qhi.cJ(optString)) == null) {
            return;
        }
        cJ.ac(8);
    }
}
