package com.bytedance.sdk.openadsdk.core.cJ;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.component.utils.MQ;
import com.bytedance.sdk.openadsdk.api.PangleAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.core.HzH;
import com.bytedance.sdk.openadsdk.core.cJ.ac;
import com.bytedance.sdk.openadsdk.core.hm;
import com.bytedance.sdk.openadsdk.core.lB;
import com.bytedance.sdk.openadsdk.core.model.Gm;
import com.bytedance.sdk.openadsdk.core.model.bxS;
import com.bytedance.sdk.openadsdk.core.model.pA;
import com.bytedance.sdk.openadsdk.core.model.tP;
import com.bytedance.sdk.openadsdk.utils.iMK;
import com.bytedance.sdk.openadsdk.utils.js;
import com.bytedance.sdk.openadsdk.utils.zn;
import com.inmobi.media.C1646h;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: ClickListener.java */
/* loaded from: classes.dex */
public class cJ extends ac {
    private static int js = Integer.MIN_VALUE;
    protected PAGNativeAd ABk;
    protected Context CJ;
    protected Gm Gm;
    protected Map<String, Object> HzH;
    protected int MQ;
    private String Qhi;
    protected final String ROR;
    protected final int Sf;
    protected final tP Tgh;
    protected WeakReference<View> WAv;

    /* renamed from: ac  reason: collision with root package name */
    private boolean f9028ac;
    private WeakReference<Activity> cJ;

    /* renamed from: fl  reason: collision with root package name */
    public pA f9029fl;

    /* renamed from: hm  reason: collision with root package name */
    protected WeakReference<View> f9030hm;
    protected com.bytedance.sdk.openadsdk.pA.Qhi.Qhi.fl hpZ;
    protected com.bykv.vk.openvk.component.video.api.CJ.fl iMK;
    protected PangleAd kYc;
    protected boolean pA;
    protected com.bytedance.sdk.openadsdk.core.nativeexpress.Qhi tP;

    /* renamed from: zc  reason: collision with root package name */
    protected Qhi f9031zc;

    /* compiled from: ClickListener.java */
    /* loaded from: classes.dex */
    public interface Qhi {
        void Qhi(View view, int i10);
    }

    public cJ(Context context, tP tPVar, String str, int i10) {
        this.pA = false;
        this.MQ = 0;
        this.f9028ac = false;
        this.CJ = context;
        this.Tgh = tPVar;
        this.ROR = str;
        this.Sf = i10;
    }

    public void CJ(boolean z10) {
        this.pA = z10;
    }

    public boolean Qhi(Gm gm2, Map<String, Object> map) {
        return false;
    }

    public String Tgh() {
        return this.Qhi;
    }

    public void ac(int i10) {
        this.Eh = i10;
    }

    public void cJ(View view) {
        if (view == null) {
            return;
        }
        this.WAv = new WeakReference<>(view);
    }

    public View fl() {
        WeakReference<Activity> weakReference = this.cJ;
        if (weakReference != null && weakReference.get() != null) {
            View findViewById = this.cJ.get().findViewById(520093713);
            View findViewById2 = this.cJ.get().findViewById(520093713);
            if (findViewById == null) {
                return findViewById2;
            }
            return findViewById;
        }
        return null;
    }

    public static boolean ac(View view) {
        return 520093705 == view.getId() || 520093707 == view.getId() || 520093703 == view.getId() || Qhi(view.getContext()) == view.getId() || iMK.HUk == view.getId() || iMK.Ewb == view.getId();
    }

    public View CJ() {
        WeakReference<Activity> weakReference = this.cJ;
        if (weakReference == null || weakReference.get() == null) {
            return null;
        }
        return this.cJ.get().findViewById(16908290);
    }

    public void Qhi(com.bytedance.sdk.openadsdk.pA.Qhi.Qhi.fl flVar) {
        this.hpZ = flVar;
    }

    public void cJ(int i10) {
        this.aP = i10;
    }

    public void Qhi(com.bytedance.sdk.openadsdk.core.nativeexpress.Qhi qhi) {
        this.tP = qhi;
    }

    public void CJ(int i10) {
        this.MQ = i10;
    }

    public void Qhi(PAGNativeAd pAGNativeAd) {
        this.ABk = pAGNativeAd;
    }

    public void Qhi(PangleAd pangleAd) {
        this.kYc = pangleAd;
    }

    public void Qhi(com.bykv.vk.openvk.component.video.api.CJ.fl flVar) {
        this.iMK = flVar;
    }

    public void Qhi(Qhi qhi) {
        this.f9031zc = qhi;
    }

    public void Qhi(Activity activity) {
        if (activity == null) {
            return;
        }
        this.cJ = new WeakReference<>(activity);
    }

    public cJ(Context context, tP tPVar, String str, int i10, boolean z10) {
        this(context, tPVar, str, i10);
        this.f9028ac = z10;
    }

    public void Qhi(View view) {
        if (view == null) {
            return;
        }
        this.f9030hm = new WeakReference<>(view);
    }

    public void Qhi(Map<String, Object> map) {
        Map<String, Object> map2 = this.HzH;
        if (map2 != null) {
            map2.putAll(map);
            map.putAll(this.HzH);
        }
        this.HzH = map;
    }

    public void Qhi(int i10) {
        this.NFd = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5, types: [android.content.Context] */
    @Override // com.bytedance.sdk.openadsdk.core.cJ.ac
    public void Qhi(View view, float f10, float f11, float f12, float f13, SparseArray<ac.Qhi> sparseArray, boolean z10) {
        int i10;
        boolean z11;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        tP tPVar;
        if (this.CJ == null) {
            this.CJ = HzH.Qhi();
        }
        if ((this.f9028ac || !Qhi(view, 1, f10, f11, f12, f13, sparseArray, z10)) && this.CJ != null) {
            pA pAVar = this.f9029fl;
            if (pAVar != null) {
                int i11 = pAVar.f9105zc;
                JSONObject jSONObject3 = pAVar.ABk;
                JSONObject jSONObject4 = pAVar.HzH;
                z11 = pAVar.kYc;
                i10 = i11;
                jSONObject = jSONObject3;
                jSONObject2 = jSONObject4;
            } else {
                i10 = -1;
                z11 = false;
                jSONObject = null;
                jSONObject2 = null;
            }
            long j10 = this.CQU;
            long j11 = this.pM;
            WeakReference<View> weakReference = this.f9030hm;
            View view2 = weakReference == null ? null : weakReference.get();
            WeakReference<View> weakReference2 = this.WAv;
            Gm Qhi2 = Qhi(f10, f11, f12, f13, sparseArray, j10, j11, view2, weakReference2 == null ? null : weakReference2.get(), Tgh(), zn.fl(this.CJ), zn.ROR(this.CJ), zn.Tgh(this.CJ), i10, jSONObject, jSONObject2);
            this.Gm = Qhi2;
            if (Qhi(Qhi2, this.HzH)) {
                return;
            }
            if (this.iMK != null) {
                if (this.HzH == null) {
                    this.HzH = new HashMap();
                }
                this.HzH.put("duration", Long.valueOf(this.iMK.fl()));
            }
            if (!this.f9028ac && !z11) {
                Qhi qhi = this.f9031zc;
                if (qhi != null) {
                    qhi.Qhi(view, -1);
                }
                if (Qhi(view, z10)) {
                    boolean cJ = bxS.cJ(this.Tgh);
                    String Qhi3 = cJ ? this.ROR : js.Qhi(this.Sf);
                    if (view != null) {
                        try {
                            if (((Boolean) view.getTag(520093762)).booleanValue()) {
                                lB.Qhi(true);
                            }
                        } catch (Exception unused) {
                        }
                    }
                    Activity Qhi4 = view != null ? com.bytedance.sdk.component.utils.cJ.Qhi(view) : null;
                    boolean Qhi5 = lB.Qhi(Qhi4 == null ? this.CJ : Qhi4, this.Tgh, this.Sf, this.ABk, this.kYc, Qhi3, this.hpZ, cJ, 0);
                    lB.Qhi(false);
                    if (Qhi5 || (tPVar = this.Tgh) == null || tPVar.ReL() == null || this.Tgh.ReL().ac() != 2) {
                        tP tPVar2 = this.Tgh;
                        if (tPVar2 != null && !Qhi5 && TextUtils.isEmpty(tPVar2.YB()) && com.bytedance.sdk.openadsdk.cJ.cJ.Qhi(this.ROR)) {
                            com.bytedance.sdk.openadsdk.pA.Qhi.Qhi.Tgh.Qhi(this.CJ, this.Tgh, this.ROR).CJ();
                        }
                        com.bytedance.sdk.openadsdk.cJ.ac.Qhi(C1646h.CLICK_BEACON, this.Tgh, this.Gm, this.ROR, Qhi5, this.HzH, z10 ? 1 : 2);
                        return;
                    }
                    return;
                }
                return;
            }
            com.bytedance.sdk.openadsdk.cJ.ac.Qhi(C1646h.CLICK_BEACON, this.Tgh, this.Gm, this.ROR, true, this.HzH, z10 ? 1 : 2);
        }
    }

    public boolean Qhi(View view, boolean z10) {
        return Qhi(view, this.Tgh, z10);
    }

    public static boolean Qhi(View view, tP tPVar, boolean z10) {
        if (view != null && tPVar != null) {
            try {
                int i10 = com.bytedance.sdk.component.adexpress.dynamic.Qhi.MQ;
                String valueOf = String.valueOf(view.getTag(i10));
                if (view.getTag(i10) != null && !TextUtils.isEmpty(valueOf)) {
                    if (C1646h.CLICK_BEACON.equals(valueOf)) {
                        return z10;
                    }
                    return true;
                }
            } catch (Exception unused) {
            }
            if (ac(view)) {
                return tPVar.tP() != 1 || z10;
            } else if (tPVar.kYc() == 1 && !z10) {
                return false;
            }
        }
        return true;
    }

    public Gm Qhi(float f10, float f11, float f12, float f13, SparseArray<ac.Qhi> sparseArray, long j10, long j11, View view, View view2, String str, float f14, int i10, float f15, int i11, JSONObject jSONObject, JSONObject jSONObject2) {
        return new Gm.Qhi().Tgh(f10).fl(f11).CJ(f12).ac(f13).cJ(j10).Qhi(j11).cJ(zn.Qhi(view)).Qhi(zn.Qhi(view2)).ac(zn.ac(view)).CJ(zn.ac(view2)).CJ(this.Eh).fl(this.aP).Tgh(this.NFd).Qhi(sparseArray).cJ(hm.cJ().Qhi() ? 1 : 2).Qhi(str).Qhi(f14).ac(i10).cJ(f15).Qhi(i11).Qhi(jSONObject).cJ(jSONObject2).Qhi();
    }

    public boolean Qhi(View view, int i10, float f10, float f11, float f12, float f13, SparseArray<ac.Qhi> sparseArray, boolean z10) {
        if (this.tP != null) {
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            WeakReference<View> weakReference = this.WAv;
            if (weakReference != null) {
                iArr = zn.Qhi(weakReference.get());
                iArr2 = zn.ac(this.WAv.get());
            }
            this.tP.Qhi(view, i10, new pA.Qhi().CJ(f10).ac(f11).cJ(f12).Qhi(f13).cJ(this.CQU).Qhi(this.pM).ac(iArr[0]).CJ(iArr[1]).fl(iArr2[0]).Tgh(iArr2[1]).Qhi(sparseArray).Qhi(z10).Qhi());
            return true;
        }
        return false;
    }

    private static int Qhi(Context context) {
        if (js == Integer.MIN_VALUE) {
            js = MQ.fl(context, "btn_native_creative");
        }
        return js;
    }

    public void Qhi(String str) {
        this.Qhi = str;
    }
}
