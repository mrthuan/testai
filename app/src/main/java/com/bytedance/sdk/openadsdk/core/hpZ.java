package com.bytedance.sdk.openadsdk.core;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.JProtect;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoMediaView;
import com.bytedance.sdk.openadsdk.core.EmptyView;
import com.bytedance.sdk.openadsdk.core.cJ.ac;
import com.bytedance.sdk.openadsdk.core.cJ.cJ;
import com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView;
import com.bytedance.sdk.openadsdk.utils.es;
import com.bytedance.sdk.openadsdk.utils.js;
import com.bytedance.sdk.openadsdk.utils.zn;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: InteractionManager.java */
/* loaded from: classes.dex */
public class hpZ {
    private com.bytedance.sdk.openadsdk.core.cJ.cJ ABk;
    private final PAGNativeAd CJ;
    private com.bykv.vk.openvk.component.video.api.CJ.fl Gm;
    private final com.bytedance.sdk.openadsdk.core.model.tP Qhi;
    private com.bytedance.sdk.openadsdk.apiImpl.feed.ROR ROR;
    private long Sf;
    private final String Tgh;
    private final com.bytedance.sdk.openadsdk.apiImpl.feed.Qhi WAv;

    /* renamed from: ac  reason: collision with root package name */
    private final Context f9045ac;
    private com.bytedance.sdk.openadsdk.pA.Qhi.Qhi.fl cJ;
    private com.bytedance.sdk.openadsdk.core.cJ.Qhi iMK;

    /* renamed from: fl  reason: collision with root package name */
    private List<View> f9046fl = new ArrayList();

    /* renamed from: hm  reason: collision with root package name */
    private final com.bytedance.sdk.openadsdk.cJ.Sf f9047hm = new com.bytedance.sdk.openadsdk.cJ.Sf();

    /* renamed from: zc  reason: collision with root package name */
    private final AtomicBoolean f9048zc = new AtomicBoolean(false);

    /* compiled from: InteractionManager.java */
    /* loaded from: classes.dex */
    public static class Qhi implements View.OnLayoutChangeListener {
        private final com.bytedance.sdk.openadsdk.cJ.Sf Qhi;
        private final ViewGroup cJ;

        public Qhi(com.bytedance.sdk.openadsdk.cJ.Sf sf2, ViewGroup viewGroup) {
            this.Qhi = sf2;
            this.cJ = viewGroup;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            this.Qhi.Qhi(System.currentTimeMillis(), sDy.Qhi(this.cJ));
        }
    }

    public hpZ(Context context, PAGNativeAd pAGNativeAd, com.bytedance.sdk.openadsdk.core.model.tP tPVar, String str, com.bytedance.sdk.openadsdk.apiImpl.feed.Qhi qhi) {
        this.CJ = pAGNativeAd;
        this.Qhi = tPVar;
        this.f9045ac = context;
        this.Tgh = str;
        this.WAv = qhi;
        if (tPVar.ip() == 4) {
            this.cJ = com.bytedance.sdk.openadsdk.pA.Qhi.Qhi.Tgh.Qhi(context, tPVar, str);
        }
    }

    private EmptyView CJ(ViewGroup viewGroup) {
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt instanceof EmptyView) {
                return (EmptyView) childAt;
            }
        }
        return null;
    }

    private void ac(ViewGroup viewGroup) {
        com.bytedance.sdk.openadsdk.core.model.tP tPVar;
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.f9046fl != null) {
                JSONArray jSONArray = new JSONArray();
                for (View view : this.f9046fl) {
                    if (view != null) {
                        JSONObject jSONObject2 = new JSONObject();
                        try {
                            jSONObject2.put(InMobiNetworkValues.WIDTH, view.getWidth());
                            jSONObject2.put(InMobiNetworkValues.HEIGHT, view.getHeight());
                            jSONObject2.put("alpha", view.getAlpha());
                        } catch (Throwable unused) {
                        }
                        jSONArray.put(jSONObject2);
                    }
                }
                jSONObject.put("image_view", jSONArray.toString());
            }
            if (viewGroup != null) {
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put(InMobiNetworkValues.WIDTH, viewGroup.getWidth());
                    jSONObject3.put(InMobiNetworkValues.HEIGHT, viewGroup.getHeight());
                    jSONObject3.put("alpha", viewGroup.getAlpha());
                } catch (Throwable unused2) {
                }
                jSONObject.put("root_view", jSONObject3.toString());
            }
            PAGMediaView Sf = this.WAv.Sf();
            if (Sf != null) {
                JSONObject jSONObject4 = new JSONObject();
                try {
                    jSONObject4.put(InMobiNetworkValues.WIDTH, zn.ac(this.f9045ac, Sf.getWidth()) * 1.0f);
                    jSONObject4.put(InMobiNetworkValues.HEIGHT, zn.ac(this.f9045ac, Sf.getHeight()) * 1.0f);
                } catch (Throwable unused3) {
                }
                jSONObject.put("media_view", jSONObject4.toString());
            }
            NativeExpressView cJ = this.WAv.cJ();
            if (cJ != null && (tPVar = this.Qhi) != null) {
                jSONObject.put("dynamic_show_type", tPVar.CQU());
                cJ.Qhi(jSONObject, this.Qhi);
            }
            com.bytedance.sdk.openadsdk.cJ.ac.Qhi(this.Qhi, this.Tgh, jSONObject);
        } catch (JSONException e10) {
            com.bytedance.sdk.component.utils.ABk.Qhi("InteractionManager", "onShowFun json error", e10);
        }
    }

    private EmptyView cJ(ViewGroup viewGroup, List<View> list, List<View> list2, List<View> list3, com.bytedance.sdk.openadsdk.apiImpl.feed.ROR ror) {
        this.ROR = ror;
        viewGroup.addOnLayoutChangeListener(new Qhi(this.f9047hm, viewGroup));
        this.f9046fl = list;
        EmptyView CJ = CJ(viewGroup);
        if (CJ == null) {
            CJ = new EmptyView(this.f9045ac, viewGroup);
            viewGroup.addView(CJ);
        }
        CJ.Qhi();
        CJ.setRefClickViews(list2);
        if (list != null) {
            for (View view : this.f9046fl) {
                if (view != null) {
                    view.setTag(520093762, Boolean.TRUE);
                }
            }
            if (list3 != null) {
                list3.addAll(list);
            }
        }
        CJ.setRefCreativeViews(list3);
        return CJ;
    }

    public com.bytedance.sdk.openadsdk.cJ.Sf Qhi() {
        return this.f9047hm;
    }

    public void Qhi(View view, int i10) {
        com.bytedance.sdk.openadsdk.apiImpl.feed.ROR ror = this.ROR;
        if (ror != null) {
            ror.onAdClicked();
        }
    }

    public void Qhi(ViewGroup viewGroup, List<View> list, List<View> list2, List<View> list3, View view, com.bytedance.sdk.openadsdk.apiImpl.feed.ROR ror) {
        Qhi(viewGroup, list, list2, list3, ror);
        Qhi(viewGroup, view);
        Qhi(viewGroup, list2, list3);
    }

    private void Qhi(ViewGroup viewGroup, List<View> list, List<View> list2, List<View> list3, com.bytedance.sdk.openadsdk.apiImpl.feed.ROR ror) {
        this.ROR = ror;
        viewGroup.addOnLayoutChangeListener(new Qhi(this.f9047hm, viewGroup));
        this.f9046fl = list;
        Qhi(list2, (com.bytedance.sdk.openadsdk.core.cJ.ac) null);
        if (list != null) {
            for (View view : this.f9046fl) {
                if (view != null) {
                    view.setTag(520093762, Boolean.TRUE);
                }
            }
            if (list3 != null) {
                list3.addAll(list);
            }
        }
        Qhi(list3, (com.bytedance.sdk.openadsdk.core.cJ.ac) null);
    }

    private void cJ(com.bytedance.sdk.openadsdk.core.cJ.cJ cJVar, com.bytedance.sdk.openadsdk.core.cJ.Qhi qhi) {
        com.bytedance.sdk.openadsdk.apiImpl.feed.Qhi qhi2 = this.WAv;
        if (qhi2 != null && qhi2.cJ() != null) {
            NativeExpressView cJ = this.WAv.cJ();
            if ((cJVar instanceof com.bytedance.sdk.openadsdk.core.nativeexpress.Sf) && (qhi instanceof com.bytedance.sdk.openadsdk.core.nativeexpress.ROR)) {
                cJ.setClickListener((com.bytedance.sdk.openadsdk.core.nativeexpress.Sf) cJVar);
                cJ.setClickCreativeListener((com.bytedance.sdk.openadsdk.core.nativeexpress.ROR) qhi);
            }
            cJ.setJsbLandingPageOpenListener(new com.bytedance.sdk.openadsdk.core.widget.ac() { // from class: com.bytedance.sdk.openadsdk.core.hpZ.3
                @Override // com.bytedance.sdk.openadsdk.core.widget.ac
                public void Qhi() {
                    if (hpZ.this.ROR != null) {
                        hpZ.this.ROR.onAdClicked();
                    }
                }
            });
        }
        com.bytedance.sdk.openadsdk.apiImpl.feed.Qhi qhi3 = this.WAv;
        if (qhi3 != null && qhi3.Qhi() != null) {
            this.WAv.Qhi().setOnClickListener(qhi);
            this.WAv.Qhi().setOnTouchListener(qhi);
        }
        com.bytedance.sdk.openadsdk.apiImpl.feed.Qhi qhi4 = this.WAv;
        if (qhi4 != null) {
            qhi4.Qhi(qhi);
            this.WAv.Qhi(cJVar);
        }
    }

    private void Qhi(List<View> list, com.bytedance.sdk.openadsdk.core.cJ.ac acVar) {
        if (com.bytedance.sdk.component.utils.Gm.cJ(list)) {
            for (View view : list) {
                if (view != null) {
                    view.setOnClickListener(acVar);
                    view.setOnTouchListener(acVar);
                }
            }
        }
    }

    public void Qhi(com.bykv.vk.openvk.component.video.api.CJ.fl flVar) {
        this.Gm = flVar;
        com.bytedance.sdk.openadsdk.core.cJ.cJ cJVar = this.ABk;
        if (cJVar != null) {
            cJVar.Qhi(flVar);
        }
        com.bytedance.sdk.openadsdk.core.cJ.Qhi qhi = this.iMK;
        if (qhi != null) {
            qhi.Qhi(flVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cJ(ViewGroup viewGroup) {
        this.f9047hm.Qhi(System.currentTimeMillis(), sDy.Qhi(viewGroup));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cJ() {
        if (this.Sf > 0) {
            com.bytedance.sdk.openadsdk.cJ.ac.Qhi(String.valueOf(SystemClock.elapsedRealtime() - this.Sf), this.Qhi, this.Tgh, this.f9047hm);
            this.Sf = 0L;
        }
    }

    private void Qhi(ViewGroup viewGroup, View view) {
        HashMap hashMap = new HashMap();
        hashMap.put("click_scence", 1);
        Context Qhi2 = viewGroup != null ? com.bytedance.sdk.component.utils.cJ.Qhi(viewGroup) : null;
        if (Qhi2 == null) {
            Qhi2 = this.f9045ac;
        }
        if (this.Qhi.EBS() == 2) {
            com.bytedance.sdk.openadsdk.core.model.tP tPVar = this.Qhi;
            String str = this.Tgh;
            this.ABk = new com.bytedance.sdk.openadsdk.core.nativeexpress.Sf(Qhi2, tPVar, str, js.Qhi(str));
        } else {
            com.bytedance.sdk.openadsdk.core.model.tP tPVar2 = this.Qhi;
            String str2 = this.Tgh;
            this.ABk = new com.bytedance.sdk.openadsdk.core.cJ.cJ(Qhi2, tPVar2, str2, js.Qhi(str2));
        }
        this.ABk.Qhi(viewGroup);
        this.ABk.Qhi(this.Gm);
        this.ABk.cJ(view);
        this.ABk.Qhi(this.cJ);
        this.ABk.Qhi(this.CJ);
        this.ABk.Qhi(hashMap);
        this.ABk.Qhi(new cJ.Qhi() { // from class: com.bytedance.sdk.openadsdk.core.hpZ.1
            @Override // com.bytedance.sdk.openadsdk.core.cJ.cJ.Qhi
            public void Qhi(View view2, int i10) {
                if (hpZ.this.ROR != null) {
                    hpZ.this.ROR.onAdClicked();
                }
            }
        });
        if (this.Qhi.EBS() == 2) {
            Context context = this.f9045ac;
            com.bytedance.sdk.openadsdk.core.model.tP tPVar3 = this.Qhi;
            String str3 = this.Tgh;
            this.iMK = new com.bytedance.sdk.openadsdk.core.nativeexpress.ROR(context, tPVar3, str3, js.Qhi(str3));
        } else {
            Context context2 = this.f9045ac;
            com.bytedance.sdk.openadsdk.core.model.tP tPVar4 = this.Qhi;
            String str4 = this.Tgh;
            this.iMK = new com.bytedance.sdk.openadsdk.core.cJ.Qhi(context2, tPVar4, str4, js.Qhi(str4));
        }
        this.iMK.Qhi(viewGroup);
        this.iMK.Qhi(this.Gm);
        this.iMK.cJ(view);
        this.iMK.Qhi(this.cJ);
        this.iMK.Qhi(this.CJ);
        this.iMK.Qhi(hashMap);
        this.iMK.Qhi(new cJ.Qhi() { // from class: com.bytedance.sdk.openadsdk.core.hpZ.2
            @Override // com.bytedance.sdk.openadsdk.core.cJ.cJ.Qhi
            public void Qhi(View view2, int i10) {
                if (hpZ.this.ROR != null) {
                    hpZ.this.ROR.onAdClicked();
                }
                com.bytedance.sdk.openadsdk.MQ.Qhi.Tgh.Qhi(hpZ.this.Qhi, 9);
                hpZ.this.WAv.ABk();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cJ(ViewGroup viewGroup, View view) {
        if (this.f9048zc.get()) {
            return;
        }
        this.f9048zc.set(true);
        if (this.CJ instanceof com.bytedance.sdk.openadsdk.apiImpl.feed.feedexpress.cJ) {
            NativeExpressView cJ = this.WAv.cJ();
            if (cJ != null) {
                cJ.Sf();
            }
            ((com.bytedance.sdk.openadsdk.apiImpl.feed.feedexpress.cJ) this.CJ).Qhi(true);
        }
        this.f9047hm.Qhi(System.currentTimeMillis(), sDy.Qhi(viewGroup));
        this.Sf = SystemClock.elapsedRealtime();
        ac(viewGroup);
        com.bytedance.sdk.openadsdk.apiImpl.feed.ROR ror = this.ROR;
        if (ror != null) {
            ror.Qhi(this.CJ);
        }
        if (this.Qhi.PER()) {
            js.Qhi(this.Qhi, view);
        }
        if (this.Qhi.cJP() != null) {
            this.Qhi.cJP().Qhi().Qhi(0L);
        }
    }

    private void Qhi(ViewGroup viewGroup, EmptyView emptyView, List<View> list, List<View> list2) {
        com.bytedance.sdk.openadsdk.core.cJ.cJ cJVar = this.ABk;
        if (cJVar == null || this.iMK == null) {
            return;
        }
        emptyView.Qhi(list, cJVar);
        emptyView.Qhi(list2, this.iMK);
        Qhi(this.ABk, this.iMK);
        Qhi(emptyView, viewGroup);
    }

    private void Qhi(ViewGroup viewGroup, List<View> list, List<View> list2) {
        com.bytedance.sdk.openadsdk.core.cJ.cJ cJVar = this.ABk;
        if (cJVar == null || this.iMK == null) {
            return;
        }
        Qhi(list, cJVar);
        Qhi(list2, this.iMK);
        Qhi(this.ABk, this.iMK);
        Qhi(viewGroup);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void Qhi(com.bytedance.sdk.openadsdk.core.cJ.cJ cJVar, com.bytedance.sdk.openadsdk.core.cJ.Qhi qhi) {
        if (this.Qhi.EBS() == 2) {
            cJ(cJVar, qhi);
        } else {
            Qhi(qhi);
        }
    }

    private void Qhi(com.bytedance.sdk.openadsdk.core.cJ.Qhi qhi) {
        if (com.bytedance.sdk.openadsdk.core.settings.HzH.YD().CJ(String.valueOf(this.Qhi.Hy()))) {
            com.bytedance.sdk.openadsdk.apiImpl.feed.Qhi qhi2 = this.WAv;
            if (qhi2 != null && qhi2.Qhi() != null) {
                this.WAv.Qhi().setOnClickListener(qhi);
                this.WAv.Qhi().setOnTouchListener(qhi);
            }
            com.bytedance.sdk.openadsdk.apiImpl.feed.Qhi qhi3 = this.WAv;
            if (qhi3 != null) {
                qhi3.Qhi(qhi);
                return;
            }
            return;
        }
        com.bytedance.sdk.openadsdk.apiImpl.feed.Qhi qhi4 = this.WAv;
        if (qhi4 != null && qhi4.Qhi() != null) {
            PAGMediaView Qhi2 = this.WAv.Qhi();
            com.bytedance.sdk.openadsdk.core.cJ.ac acVar = new com.bytedance.sdk.openadsdk.core.cJ.ac() { // from class: com.bytedance.sdk.openadsdk.core.hpZ.4
                @Override // com.bytedance.sdk.openadsdk.core.cJ.ac
                public void Qhi(View view, float f10, float f11, float f12, float f13, SparseArray<ac.Qhi> sparseArray, boolean z10) {
                    if (view instanceof PAGVideoMediaView) {
                        ((PAGVideoMediaView) view).handleInterruptVideo();
                    }
                }
            };
            Qhi2.setOnClickListener(acVar);
            Qhi2.setOnTouchListener(acVar);
        }
        com.bytedance.sdk.openadsdk.apiImpl.feed.Qhi qhi5 = this.WAv;
        if (qhi5 != null) {
            qhi5.Qhi((com.bytedance.sdk.openadsdk.core.cJ.Qhi) null);
        }
    }

    private void Qhi(EmptyView emptyView, final ViewGroup viewGroup) {
        emptyView.setCallback(new EmptyView.Qhi() { // from class: com.bytedance.sdk.openadsdk.core.hpZ.5
            @Override // com.bytedance.sdk.openadsdk.core.EmptyView.Qhi
            public void Qhi(boolean z10) {
                hpZ.this.Qhi(z10, viewGroup);
            }

            @Override // com.bytedance.sdk.openadsdk.core.EmptyView.Qhi
            public void cJ() {
                hpZ.this.cJ();
            }

            @Override // com.bytedance.sdk.openadsdk.core.EmptyView.Qhi
            public void Qhi() {
                hpZ.this.cJ(viewGroup);
            }

            @Override // com.bytedance.sdk.openadsdk.core.EmptyView.Qhi
            @JProtect
            public void Qhi(View view) {
                hpZ.this.cJ(viewGroup, view);
            }
        });
    }

    private void Qhi(final ViewGroup viewGroup) {
        es.Qhi(viewGroup, true, 5, new es.cJ() { // from class: com.bytedance.sdk.openadsdk.core.hpZ.6
            @Override // com.bytedance.sdk.openadsdk.utils.es.cJ
            public void Qhi(boolean z10) {
                hpZ.this.Qhi(z10, viewGroup);
            }

            @Override // com.bytedance.sdk.openadsdk.utils.es.cJ
            public void cJ() {
                hpZ.this.cJ();
            }

            @Override // com.bytedance.sdk.openadsdk.utils.es.cJ
            public void Qhi() {
                hpZ.this.cJ(viewGroup);
            }

            @Override // com.bytedance.sdk.openadsdk.utils.es.cJ
            public void Qhi(View view, boolean z10) {
                if (z10) {
                    hpZ.this.cJ(viewGroup, view);
                }
            }
        }, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Qhi(boolean z10, ViewGroup viewGroup) {
        if (z10 && this.Qhi.qb() && !this.Qhi.ZRq()) {
            this.Qhi.ROR(true);
            com.bytedance.sdk.openadsdk.core.model.tP tPVar = this.Qhi;
            com.bytedance.sdk.openadsdk.cJ.ac.Qhi(tPVar, this.Tgh, tPVar.up());
        }
        if (!z10 && this.Sf > 0) {
            String valueOf = String.valueOf(SystemClock.elapsedRealtime() - this.Sf);
            this.f9047hm.Qhi(System.currentTimeMillis(), sDy.Qhi(viewGroup));
            com.bytedance.sdk.openadsdk.cJ.ac.Qhi(valueOf, this.Qhi, this.Tgh, this.f9047hm);
            this.Sf = 0L;
            return;
        }
        this.f9047hm.Qhi(System.currentTimeMillis(), sDy.Qhi(viewGroup));
        this.Sf = SystemClock.elapsedRealtime();
    }
}
