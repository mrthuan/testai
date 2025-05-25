package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import a0.d;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.sdk.component.adexpress.CJ.CQU;
import com.bytedance.sdk.component.adexpress.CJ.Eh;
import com.bytedance.sdk.component.adexpress.CJ.bxS;
import com.bytedance.sdk.component.adexpress.CJ.kYc;
import com.bytedance.sdk.component.adexpress.cJ.iMK;
import com.bytedance.sdk.component.adexpress.dynamic.CJ.Gm;
import com.bytedance.sdk.component.adexpress.dynamic.ac.Sf;
import com.bytedance.sdk.component.adexpress.dynamic.ac.hm;
import com.bytedance.sdk.component.adexpress.dynamic.interact.InteractViewContainer;
import com.bytedance.sdk.component.adexpress.widget.GifView;
import com.bytedance.sdk.component.fl.HzH;
import com.bytedance.sdk.component.fl.zc;
import com.bytedance.sdk.component.utils.EBS;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class DynamicBaseWidgetImp extends DynamicBaseWidget {
    private static String MQ = "";
    private ImageView EBS;
    private Runnable Qhi;
    private Runnable cJ;
    private volatile boolean qMt;
    protected InteractViewContainer tP;

    public DynamicBaseWidgetImp(Context context, DynamicRootView dynamicRootView, hm hmVar) {
        super(context, dynamicRootView, hmVar);
        this.qMt = true;
        setTag(Integer.valueOf(getClickArea()));
        String cJ = hmVar.WAv().cJ();
        if ("logo-union".equals(cJ)) {
            dynamicRootView.setLogoUnionHeight(this.Sf - ((int) CQU.Qhi(context, this.f8210zc.Qhi() + this.f8210zc.cJ())));
        } else if ("scoreCountWithIcon".equals(cJ)) {
            dynamicRootView.setScoreCountWithIcon(this.Sf - ((int) CQU.Qhi(context, this.f8210zc.Qhi() + this.f8210zc.cJ())));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Drawable cJ(String str) {
        try {
            JSONArray jSONArray = new JSONArray(str);
            ArrayList arrayList = new ArrayList();
            String str2 = "";
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                if (jSONArray.getString(i10).startsWith("#")) {
                    arrayList.add(jSONArray.getString(i10));
                } else if (jSONArray.getString(i10).endsWith("deg")) {
                    str2 = jSONArray.getString(i10);
                }
            }
            if (arrayList.size() <= 0) {
                return null;
            }
            int[] iArr = new int[arrayList.size()];
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                iArr[i11] = Sf.Qhi(((String) arrayList.get(i11)).substring(0, 7));
            }
            GradientDrawable Qhi = Qhi(Qhi(str2), iArr);
            Qhi.setShape(0);
            Qhi.setCornerRadius(CQU.Qhi(this.Gm, this.f8210zc.pA()));
            return Qhi;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static String getBuildModel() {
        try {
            MQ = EBS.Qhi();
        } catch (Throwable unused) {
            MQ = Build.MODEL;
        }
        if (TextUtils.isEmpty(MQ)) {
            MQ = Build.MODEL;
        }
        return MQ;
    }

    public FrameLayout.LayoutParams getWidgetLayoutParams() {
        return new FrameLayout.LayoutParams(this.ROR, this.Sf);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fl
    public boolean hm() {
        String str;
        Drawable backgroundDrawable;
        DynamicRootView dynamicRootView;
        JSONObject optJSONObject;
        final View view = this.pA;
        if (view == null) {
            view = this;
        }
        setContentDescription(this.ABk.Qhi(this.f8210zc.Eh()));
        String et = this.f8210zc.et();
        String str2 = null;
        if (!TextUtils.isEmpty(et) && (dynamicRootView = this.iMK) != null && dynamicRootView.getRenderRequest() != null && this.iMK.getRenderRequest().ac() != null && (optJSONObject = this.iMK.getRenderRequest().ac().optJSONObject("creative")) != null) {
            str = Qhi(optJSONObject.opt(et));
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            str = this.f8210zc.qMt();
        }
        if (this.f8210zc.MQ()) {
            final int tP = this.f8210zc.tP();
            com.bytedance.sdk.component.adexpress.Qhi.Qhi.Qhi.Qhi().fl().Qhi(this.f8210zc.cJ).ac(2).Qhi(new com.bytedance.sdk.component.fl.hm() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp.3
                @Override // com.bytedance.sdk.component.fl.hm
                public Bitmap Qhi(Bitmap bitmap) {
                    return kYc.Qhi(DynamicBaseWidgetImp.this.Gm, bitmap, tP);
                }
            }).Qhi(new HzH<Bitmap>() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp.1
                @Override // com.bytedance.sdk.component.fl.HzH
                public void Qhi(int i10, String str3, Throwable th2) {
                }

                @Override // com.bytedance.sdk.component.fl.HzH
                public void Qhi(zc<Bitmap> zcVar) {
                    Bitmap cJ = zcVar.cJ();
                    if (cJ == null || zcVar.ac() == null) {
                        return;
                    }
                    view.setBackground(DynamicBaseWidgetImp.this.Qhi(cJ));
                }
            });
        } else if (!TextUtils.isEmpty(str)) {
            if (!str.startsWith("http:") && !str.startsWith("https:")) {
                DynamicRootView dynamicRootView2 = this.iMK;
                if (dynamicRootView2 != null && dynamicRootView2.getRenderRequest() != null) {
                    str2 = this.iMK.getRenderRequest().Dww();
                }
                str = Gm.cJ(str, str2);
            }
            com.bytedance.sdk.component.fl.Gm ac2 = com.bytedance.sdk.component.adexpress.Qhi.Qhi.Qhi.Qhi().fl().Qhi(str).ac(2);
            Qhi(ac2);
            if (!com.bytedance.sdk.component.adexpress.fl.cJ()) {
                if ((view instanceof FrameLayout) && d.j(this.ABk, "vessel")) {
                    if (Eh.cJ(str)) {
                        this.EBS = new GifView(this.Gm);
                    } else {
                        this.EBS = new ImageView(this.Gm);
                    }
                    ((FrameLayout) view).addView(this.EBS, new FrameLayout.LayoutParams(-1, -1));
                    ac2.ac(3).Qhi(new HzH() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp.4
                        @Override // com.bytedance.sdk.component.fl.HzH
                        public void Qhi(int i10, String str3, Throwable th2) {
                        }

                        @Override // com.bytedance.sdk.component.fl.HzH
                        public void Qhi(zc zcVar) {
                            Object cJ = zcVar.cJ();
                            if (cJ instanceof byte[]) {
                                DynamicBaseWidgetImp dynamicBaseWidgetImp = DynamicBaseWidgetImp.this;
                                bxS.Qhi(DynamicBaseWidgetImp.this.EBS, (byte[]) cJ, dynamicBaseWidgetImp.ROR, dynamicBaseWidgetImp.Sf);
                            }
                        }
                    });
                } else {
                    Qhi(ac2, view);
                }
            } else {
                ac2.Qhi(new HzH<Bitmap>() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp.5
                    @Override // com.bytedance.sdk.component.fl.HzH
                    public void Qhi(int i10, String str3, Throwable th2) {
                    }

                    @Override // com.bytedance.sdk.component.fl.HzH
                    public void Qhi(zc<Bitmap> zcVar) {
                        if (com.bytedance.sdk.component.adexpress.fl.cJ()) {
                            view.setBackground(new BitmapDrawable(zcVar.cJ()));
                            hm hmVar = DynamicBaseWidgetImp.this.ABk;
                            if (hmVar == null || hmVar.WAv() == null || 6 != DynamicBaseWidgetImp.this.ABk.WAv().Qhi() || view.getBackground() == null) {
                                return;
                            }
                            view.getBackground().setAutoMirrored(true);
                            return;
                        }
                        DynamicRootView dynamicRootView3 = DynamicBaseWidgetImp.this.iMK;
                        if (dynamicRootView3 == null) {
                            return;
                        }
                        if (!"open_ad".equals(dynamicRootView3.getRenderRequest().CJ()) && !"splash_ad".equals(DynamicBaseWidgetImp.this.iMK.getRenderRequest().CJ())) {
                            view.setBackground(new BitmapDrawable(zcVar.cJ()));
                        } else {
                            view.setBackground(new BitmapDrawable(zcVar.cJ()));
                        }
                    }
                });
            }
        }
        if (getBackground() == null && (backgroundDrawable = getBackgroundDrawable()) != null) {
            view.setBackground(backgroundDrawable);
        }
        if (this.f8210zc.NFd() > 0.0d) {
            postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp.6
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (DynamicBaseWidgetImp.this.f8210zc.js() > 0) {
                            DynamicBaseWidgetImp dynamicBaseWidgetImp = DynamicBaseWidgetImp.this;
                            Drawable cJ = dynamicBaseWidgetImp.cJ(dynamicBaseWidgetImp.iMK.getBgMaterialCenterCalcColor().get(Integer.valueOf(DynamicBaseWidgetImp.this.f8210zc.js())));
                            if (cJ == null) {
                                DynamicBaseWidgetImp dynamicBaseWidgetImp2 = DynamicBaseWidgetImp.this;
                                cJ = dynamicBaseWidgetImp2.Qhi(true, dynamicBaseWidgetImp2.iMK.getBgMaterialCenterCalcColor().get(Integer.valueOf(DynamicBaseWidgetImp.this.f8210zc.js())));
                            }
                            if (cJ != null) {
                                view.setBackground(cJ);
                                return;
                            }
                            View view2 = view;
                            DynamicBaseWidgetImp dynamicBaseWidgetImp3 = DynamicBaseWidgetImp.this;
                            view2.setBackground(dynamicBaseWidgetImp3.Qhi(true, dynamicBaseWidgetImp3.iMK.getBgColor()));
                        }
                    } catch (Exception unused) {
                    }
                }
            }, (long) (this.f8210zc.NFd() * 1000.0d));
        }
        View view2 = this.pA;
        if (view2 != null) {
            view2.setPadding((int) CQU.Qhi(this.Gm, this.f8210zc.ac()), (int) CQU.Qhi(this.Gm, this.f8210zc.cJ()), (int) CQU.Qhi(this.Gm, this.f8210zc.CJ()), (int) CQU.Qhi(this.Gm, this.f8210zc.Qhi()));
        }
        if (this.hpZ || this.f8210zc.iMK() > 0.0d) {
            setShouldInvisible(true);
            view.setVisibility(4);
            setVisibility(4);
        }
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        View view = this.pA;
        if (view == null) {
            view = this;
        }
        double MQ2 = this.ABk.WAv().fl().MQ();
        if (MQ2 < 90.0d && MQ2 > 0.0d) {
            com.bytedance.sdk.component.utils.Sf.cJ().postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp.8
                @Override // java.lang.Runnable
                public void run() {
                    DynamicBaseWidgetImp.this.setVisibility(8);
                }
            }, (long) (MQ2 * 1000.0d));
        }
        Qhi(this.ABk.WAv().fl().tP(), view);
        if (!TextUtils.isEmpty(this.f8210zc.ip())) {
            Qhi();
        }
        super.onAttachedToWindow();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            removeCallbacks(this.Qhi);
            removeCallbacks(this.cJ);
        } catch (Exception unused) {
        }
    }

    private String Qhi(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof JSONArray) {
            return Qhi(((JSONArray) obj).opt(0));
        }
        if (obj instanceof JSONObject) {
            return Qhi((Object) ((JSONObject) obj).optString(InMobiNetworkValues.URL));
        }
        return null;
    }

    private void Qhi(com.bytedance.sdk.component.fl.Gm gm2, final View view) {
        gm2.Qhi(new HzH<Bitmap>() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp.7
            @Override // com.bytedance.sdk.component.fl.HzH
            public void Qhi(int i10, String str, Throwable th2) {
            }

            @Override // com.bytedance.sdk.component.fl.HzH
            public void Qhi(zc<Bitmap> zcVar) {
                DynamicRootView dynamicRootView = DynamicBaseWidgetImp.this.iMK;
                if (dynamicRootView == null) {
                    return;
                }
                if (!"open_ad".equals(dynamicRootView.getRenderRequest().CJ()) && !"splash_ad".equals(DynamicBaseWidgetImp.this.iMK.getRenderRequest().CJ())) {
                    view.setBackground(new BitmapDrawable(zcVar.cJ()));
                } else if (com.bytedance.sdk.component.adexpress.fl.cJ()) {
                    view.setBackground(new Qhi(zcVar.cJ(), ((DynamicRoot) DynamicBaseWidgetImp.this.iMK.getChildAt(0)).Qhi));
                } else {
                    view.setBackground(new BitmapDrawable(zcVar.cJ()));
                }
            }
        });
    }

    private static void Qhi(com.bytedance.sdk.component.fl.Gm gm2) {
        if ("SMARTISAN".equals(Build.BRAND) && "SM901".equals(getBuildModel())) {
            gm2.Qhi(Bitmap.Config.ARGB_8888);
        }
    }

    private void Qhi(double d10, final View view) {
        if (d10 > 0.0d) {
            com.bytedance.sdk.component.utils.Sf.cJ().postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp.9
                @Override // java.lang.Runnable
                public void run() {
                    if (DynamicBaseWidgetImp.this.ABk.WAv().fl().pF() != null) {
                        return;
                    }
                    view.setVisibility(0);
                    DynamicBaseWidgetImp.this.setVisibility(0);
                }
            }, (long) (d10 * 1000.0d));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Qhi(ViewGroup viewGroup) {
        if (viewGroup == null || viewGroup.getChildCount() <= 0) {
            return;
        }
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            if (viewGroup.getChildAt(i10) instanceof InteractViewContainer) {
                viewGroup.removeViewAt(i10);
            }
        }
    }

    private void Qhi() {
        if (this.qMt) {
            int Qe = this.f8210zc.Qe();
            int YB = this.f8210zc.YB();
            Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp.10
                @Override // java.lang.Runnable
                public void run() {
                    DynamicRootView dynamicRootView = DynamicBaseWidgetImp.this.iMK;
                    if (dynamicRootView != null && dynamicRootView.getRenderRequest() != null) {
                        iMK renderRequest = DynamicBaseWidgetImp.this.iMK.getRenderRequest();
                        com.bytedance.sdk.component.adexpress.dynamic.ac.Gm gm2 = new com.bytedance.sdk.component.adexpress.dynamic.ac.Gm();
                        gm2.Qhi(renderRequest.pA());
                        gm2.cJ(renderRequest.hpZ());
                        gm2.ac(renderRequest.HzH());
                        gm2.Qhi(renderRequest.kYc());
                        gm2.cJ(renderRequest.tP());
                        gm2.ac(renderRequest.MQ());
                        gm2.CJ(renderRequest.qMt());
                        gm2.fl(renderRequest.EBS());
                        DynamicBaseWidgetImp dynamicBaseWidgetImp = DynamicBaseWidgetImp.this;
                        DynamicBaseWidgetImp dynamicBaseWidgetImp2 = DynamicBaseWidgetImp.this;
                        dynamicBaseWidgetImp.tP = new InteractViewContainer(dynamicBaseWidgetImp2.Gm, dynamicBaseWidgetImp2, dynamicBaseWidgetImp2.f8210zc, gm2, renderRequest);
                    } else {
                        DynamicBaseWidgetImp dynamicBaseWidgetImp3 = DynamicBaseWidgetImp.this;
                        DynamicBaseWidgetImp dynamicBaseWidgetImp4 = DynamicBaseWidgetImp.this;
                        dynamicBaseWidgetImp3.tP = new InteractViewContainer(dynamicBaseWidgetImp4.Gm, dynamicBaseWidgetImp4, dynamicBaseWidgetImp4.f8210zc);
                    }
                    DynamicBaseWidgetImp dynamicBaseWidgetImp5 = DynamicBaseWidgetImp.this;
                    dynamicBaseWidgetImp5.cJ(dynamicBaseWidgetImp5.tP);
                    if (DynamicBaseWidgetImp.this.getParent() instanceof ViewGroup) {
                        ((ViewGroup) DynamicBaseWidgetImp.this.getParent()).setClipChildren(false);
                    }
                    DynamicBaseWidgetImp.this.setClipChildren(false);
                    DynamicBaseWidgetImp.this.tP.setTag(2);
                    DynamicBaseWidgetImp dynamicBaseWidgetImp6 = DynamicBaseWidgetImp.this;
                    dynamicBaseWidgetImp6.Qhi((ViewGroup) dynamicBaseWidgetImp6);
                    DynamicBaseWidgetImp dynamicBaseWidgetImp7 = DynamicBaseWidgetImp.this;
                    dynamicBaseWidgetImp7.addView(dynamicBaseWidgetImp7.tP, new FrameLayout.LayoutParams(-1, -1));
                    DynamicBaseWidgetImp.this.tP.ac();
                }
            };
            this.Qhi = runnable;
            postDelayed(runnable, Qe * 1000);
            if (this.f8210zc.cjC() || YB >= Integer.MAX_VALUE || Qe >= YB) {
                return;
            }
            Runnable runnable2 = new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp.2
                @Override // java.lang.Runnable
                public void run() {
                    DynamicBaseWidgetImp dynamicBaseWidgetImp = DynamicBaseWidgetImp.this;
                    if (dynamicBaseWidgetImp.tP != null) {
                        dynamicBaseWidgetImp.qMt = false;
                        DynamicBaseWidgetImp.this.tP.CJ();
                        DynamicBaseWidgetImp.this.tP.setVisibility(4);
                        DynamicBaseWidgetImp dynamicBaseWidgetImp2 = DynamicBaseWidgetImp.this;
                        dynamicBaseWidgetImp2.removeView(dynamicBaseWidgetImp2.tP);
                    }
                }
            };
            this.cJ = runnable2;
            postDelayed(runnable2, YB * 1000);
        }
    }
}
