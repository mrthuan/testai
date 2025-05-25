package com.bytedance.sdk.openadsdk.core.ROR;

import androidx.activity.r;
import com.bytedance.sdk.openadsdk.core.ROR.ac.Qhi;
import com.bytedance.sdk.openadsdk.core.ROR.cJ.ac;
import com.bytedance.sdk.openadsdk.core.model.tP;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: VastResource.java */
/* loaded from: classes.dex */
public class ac {
    protected Qhi.cJ CJ;
    protected int Qhi;
    protected List<com.bytedance.sdk.openadsdk.core.ROR.cJ.ac> ROR;
    protected String Sf;
    protected List<com.bytedance.sdk.openadsdk.core.ROR.cJ.ac> Tgh;
    private String WAv;

    /* renamed from: ac  reason: collision with root package name */
    protected Qhi.EnumC0113Qhi f8961ac;
    protected int cJ;

    /* renamed from: fl  reason: collision with root package name */
    protected String f8962fl;

    /* renamed from: zc  reason: collision with root package name */
    private tP f8964zc;
    private final AtomicBoolean Gm = new AtomicBoolean(false);

    /* renamed from: hm  reason: collision with root package name */
    protected String f8963hm = "endcard_click";

    /* compiled from: VastResource.java */
    /* renamed from: com.bytedance.sdk.openadsdk.core.ROR.ac$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] Qhi;

        static {
            int[] iArr = new int[Qhi.cJ.values().length];
            Qhi = iArr;
            try {
                iArr[Qhi.cJ.STATIC_RESOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Qhi[Qhi.cJ.HTML_RESOURCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                Qhi[Qhi.cJ.IFRAME_RESOURCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public ac(int i10, int i11, Qhi.EnumC0113Qhi enumC0113Qhi, Qhi.cJ cJVar, String str, List<com.bytedance.sdk.openadsdk.core.ROR.cJ.ac> list, List<com.bytedance.sdk.openadsdk.core.ROR.cJ.ac> list2, String str2) {
        this.Tgh = new ArrayList();
        this.ROR = new ArrayList();
        this.Qhi = i10;
        this.cJ = i11;
        this.f8961ac = enumC0113Qhi;
        this.CJ = cJVar;
        this.f8962fl = str;
        this.Tgh = list;
        this.ROR = list2;
        this.Sf = str2;
    }

    public String CJ() {
        int i10 = AnonymousClass1.Qhi[this.CJ.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    StringBuilder sb2 = new StringBuilder("<iframe frameborder=\"0\" scrolling=\"no\" marginheight=\"0\" marginwidth=\"0\" style=\"border: 0px; margin: 0px;\" width=\"");
                    sb2.append(this.Qhi);
                    sb2.append("\" height=\"");
                    sb2.append(this.cJ);
                    sb2.append("\" src=\"");
                    return r.g(sb2, this.f8962fl, "\"></iframe>");
                }
                return null;
            }
            return this.f8962fl;
        }
        Qhi.EnumC0113Qhi enumC0113Qhi = this.f8961ac;
        if (enumC0113Qhi == Qhi.EnumC0113Qhi.IMAGE) {
            return r.g(new StringBuilder("<html><head></head><body style=\"margin:0;padding:0\"><img src=\""), this.f8962fl, "\" width=\"100%\" style=\"max-width:100%;max-height:100%;\" /></body></html>");
        }
        if (enumC0113Qhi == Qhi.EnumC0113Qhi.JAVASCRIPT) {
            return r.g(new StringBuilder("<script src=\""), this.f8962fl, "\"></script>");
        }
        return null;
    }

    public void Qhi(long j10) {
        com.bytedance.sdk.openadsdk.core.ROR.cJ.ac.Qhi(this.Tgh, null, j10, this.WAv, new ac.cJ(this.f8963hm, this.f8964zc));
    }

    public String Tgh() {
        return this.f8962fl;
    }

    public int ac() {
        return this.cJ;
    }

    public int cJ() {
        return this.Qhi;
    }

    public String fl() {
        if (this.CJ == Qhi.cJ.STATIC_RESOURCE && this.f8961ac == Qhi.EnumC0113Qhi.IMAGE) {
            return this.f8962fl;
        }
        return null;
    }

    public static float Qhi(int i10, int i11, int i12, int i13, Qhi.cJ cJVar, Qhi.EnumC0113Qhi enumC0113Qhi) {
        if (i11 == 0 || i13 == 0) {
            return 0.0f;
        }
        float f10 = i10;
        float f11 = i12;
        return Qhi(cJVar, enumC0113Qhi) / ((Math.abs((f10 - f11) / f10) + Math.abs((f10 / i11) - (f11 / i13))) + 1.0f);
    }

    public void cJ(long j10) {
        if (this.Gm.compareAndSet(false, true)) {
            com.bytedance.sdk.openadsdk.core.ROR.cJ.ac.cJ(this.ROR, null, j10, this.WAv);
        }
    }

    public static ac cJ(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        int optInt = jSONObject.optInt(InMobiNetworkValues.WIDTH);
        int optInt2 = jSONObject.optInt(InMobiNetworkValues.HEIGHT);
        String optString = jSONObject.optString("creativeType", Qhi.EnumC0113Qhi.NONE.toString());
        String optString2 = jSONObject.optString("resourceType", Qhi.cJ.HTML_RESOURCE.toString());
        String optString3 = jSONObject.optString("contentUrl");
        String optString4 = jSONObject.optString("clickThroughUri");
        JSONArray optJSONArray = jSONObject.optJSONArray("clickTrackers");
        JSONArray optJSONArray2 = jSONObject.optJSONArray("creativeViewTrackers");
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
            arrayList.add(new ac.Qhi(optJSONArray.optString(i10)).Qhi());
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i11 = 0; i11 < optJSONArray2.length(); i11++) {
            arrayList2.add(new ac.Qhi(optJSONArray2.optString(i11)).Qhi());
        }
        return new ac(optInt, optInt2, Qhi.EnumC0113Qhi.valueOf(optString), Qhi.cJ.valueOf(optString2), optString3, arrayList, arrayList2, optString4);
    }

    private static float Qhi(Qhi.cJ cJVar, Qhi.EnumC0113Qhi enumC0113Qhi) {
        int i10 = AnonymousClass1.Qhi[cJVar.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                return i10 != 3 ? 0.0f : 1.0f;
            }
            return 1.2f;
        } else if (Qhi.EnumC0113Qhi.JAVASCRIPT.equals(enumC0113Qhi)) {
            return 1.0f;
        } else {
            return Qhi.EnumC0113Qhi.IMAGE.equals(enumC0113Qhi) ? 0.8f : 0.0f;
        }
    }

    public void Qhi(String str) {
        this.WAv = str;
    }

    public JSONObject Qhi() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(InMobiNetworkValues.WIDTH, this.Qhi);
        jSONObject.put(InMobiNetworkValues.HEIGHT, this.cJ);
        jSONObject.put("creativeType", this.f8961ac.toString());
        jSONObject.put("resourceType", this.CJ.toString());
        jSONObject.put("contentUrl", this.f8962fl);
        jSONObject.put("clickThroughUri", this.Sf);
        jSONObject.put("clickTrackers", com.bytedance.sdk.openadsdk.core.ROR.cJ.ac.Qhi(this.Tgh));
        jSONObject.put("creativeViewTrackers", com.bytedance.sdk.openadsdk.core.ROR.cJ.ac.Qhi(this.ROR));
        return jSONObject;
    }

    public void Qhi(tP tPVar) {
        this.f8964zc = tPVar;
    }
}
