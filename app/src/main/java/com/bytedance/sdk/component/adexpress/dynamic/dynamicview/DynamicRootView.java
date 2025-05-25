package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.cJ.iMK;
import com.bytedance.sdk.component.adexpress.cJ.pA;
import com.bytedance.sdk.component.adexpress.cJ.zc;
import com.bytedance.sdk.component.adexpress.dynamic.ac.ROR;
import com.bytedance.sdk.component.adexpress.dynamic.ac.hm;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class DynamicRootView extends FrameLayout implements com.bytedance.sdk.component.adexpress.dynamic.fl, com.bytedance.sdk.component.adexpress.theme.Qhi {
    private int ABk;
    private zc CJ;
    private List<com.bytedance.sdk.component.adexpress.dynamic.ac> Gm;
    private String HzH;
    protected final pA Qhi;
    private ThemeStatusBroadcastReceiver ROR;
    private com.bytedance.sdk.component.adexpress.dynamic.cJ Sf;
    private com.bytedance.sdk.component.adexpress.dynamic.fl.Qhi Tgh;
    private int WAv;

    /* renamed from: ac  reason: collision with root package name */
    public View f8211ac;
    boolean cJ;

    /* renamed from: fl  reason: collision with root package name */
    private DynamicBaseWidget f8212fl;

    /* renamed from: hm  reason: collision with root package name */
    private ViewGroup f8213hm;
    private Context hpZ;
    private int iMK;
    private Map<Integer, String> kYc;
    private iMK pA;

    /* renamed from: zc  reason: collision with root package name */
    private com.bytedance.sdk.component.adexpress.dynamic.Tgh f8214zc;

    public DynamicRootView(Context context, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, boolean z10, iMK imk, com.bytedance.sdk.component.adexpress.dynamic.fl.Qhi qhi) {
        super(context);
        this.f8213hm = null;
        this.WAv = 0;
        this.Gm = new ArrayList();
        this.ABk = 0;
        this.iMK = 0;
        this.hpZ = context;
        pA pAVar = new pA();
        this.Qhi = pAVar;
        pAVar.Qhi(2);
        this.Tgh = qhi;
        qhi.Qhi(this);
        this.ROR = themeStatusBroadcastReceiver;
        themeStatusBroadcastReceiver.Qhi(this);
        this.cJ = z10;
        this.pA = imk;
    }

    public void Qhi(hm hmVar, int i10) {
        this.f8212fl = Qhi(hmVar, this, i10);
        this.Qhi.Qhi(true);
        this.Qhi.Qhi(this.f8212fl.f8208fl);
        this.Qhi.cJ(this.f8212fl.Tgh);
        this.Qhi.Qhi(this.f8211ac);
        this.CJ.Qhi(this.Qhi);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.fl
    public void d_() {
        try {
            this.f8214zc.Qhi();
        } catch (Exception unused) {
        }
    }

    public String getBgColor() {
        return this.HzH;
    }

    public Map<Integer, String> getBgMaterialCenterCalcColor() {
        return this.kYc;
    }

    public com.bytedance.sdk.component.adexpress.dynamic.fl.Qhi getDynamicClickListener() {
        return this.Tgh;
    }

    public int getLogoUnionHeight() {
        return this.ABk;
    }

    public zc getRenderListener() {
        return this.CJ;
    }

    public iMK getRenderRequest() {
        return this.pA;
    }

    public int getScoreCountWithIcon() {
        return this.iMK;
    }

    public ViewGroup getTimeOut() {
        return this.f8213hm;
    }

    public List<com.bytedance.sdk.component.adexpress.dynamic.ac> getTimeOutListener() {
        return this.Gm;
    }

    public int getTimedown() {
        return this.WAv;
    }

    public void setBgColor(String str) {
        this.HzH = str;
    }

    public void setBgMaterialCenterCalcColor(Map<Integer, String> map) {
        this.kYc = map;
    }

    public void setDislikeView(View view) {
        this.Tgh.cJ(view);
    }

    public void setLogoUnionHeight(int i10) {
        this.ABk = i10;
    }

    public void setMuteListener(com.bytedance.sdk.component.adexpress.dynamic.cJ cJVar) {
        this.Sf = cJVar;
    }

    public void setRenderListener(zc zcVar) {
        this.CJ = zcVar;
        this.Tgh.Qhi(zcVar);
    }

    public void setScoreCountWithIcon(int i10) {
        this.iMK = i10;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.fl
    public void setSoundMute(boolean z10) {
        com.bytedance.sdk.component.adexpress.dynamic.cJ cJVar = this.Sf;
        if (cJVar != null) {
            cJVar.setSoundMute(z10);
        }
    }

    public void setTimeOut(ViewGroup viewGroup) {
        this.f8213hm = viewGroup;
    }

    public void setTimeOutListener(com.bytedance.sdk.component.adexpress.dynamic.ac acVar) {
        this.Gm.add(acVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.fl
    public void setTimeUpdate(int i10) {
        this.f8214zc.setTimeUpdate(i10);
    }

    public void setTimedown(int i10) {
        this.WAv = i10;
    }

    public void setVideoListener(com.bytedance.sdk.component.adexpress.dynamic.Tgh tgh) {
        this.f8214zc = tgh;
    }

    public DynamicBaseWidget Qhi(hm hmVar, ViewGroup viewGroup, int i10) {
        if (hmVar == null) {
            return null;
        }
        List<hm> Gm = hmVar.Gm();
        DynamicBaseWidget Qhi = com.bytedance.sdk.component.adexpress.dynamic.Qhi.cJ.Qhi(this.hpZ, this, hmVar);
        if (Qhi instanceof DynamicUnKnowView) {
            Qhi(i10 == 3 ? 128 : 118, "unknow widget");
            return null;
        }
        Qhi(hmVar);
        Qhi.ac();
        if (viewGroup != null) {
            viewGroup.addView(Qhi);
            Qhi(viewGroup, hmVar);
        }
        if (Gm == null || Gm.size() <= 0) {
            return null;
        }
        for (hm hmVar2 : Gm) {
            Qhi(hmVar2, Qhi, i10);
        }
        return Qhi;
    }

    private void Qhi(hm hmVar) {
        ROR fl2;
        com.bytedance.sdk.component.adexpress.dynamic.ac.Tgh WAv = hmVar.WAv();
        if (WAv == null || (fl2 = WAv.fl()) == null) {
            return;
        }
        this.Qhi.cJ(fl2.LcF());
    }

    private void Qhi(ViewGroup viewGroup, hm hmVar) {
        ViewGroup viewGroup2;
        if (viewGroup == null || (viewGroup2 = (ViewGroup) viewGroup.getParent()) == null || !hmVar.Dww()) {
            return;
        }
        viewGroup2.setClipChildren(false);
        viewGroup2.setClipToPadding(false);
        ViewGroup viewGroup3 = (ViewGroup) viewGroup2.getParent();
        if (viewGroup3 != null) {
            viewGroup3.setClipChildren(false);
            viewGroup3.setClipToPadding(false);
        }
    }

    public void Qhi(double d10, double d11, double d12, double d13, float f10) {
        this.Qhi.ac(d10);
        this.Qhi.CJ(d11);
        this.Qhi.fl(d12);
        this.Qhi.Tgh(d13);
        this.Qhi.Qhi(f10);
        this.Qhi.cJ(f10);
        this.Qhi.ac(f10);
        this.Qhi.CJ(f10);
    }

    public void Qhi(int i10, String str) {
        this.Qhi.Qhi(false);
        this.Qhi.cJ(i10);
        this.Qhi.Qhi(str);
        this.CJ.Qhi(this.Qhi);
    }

    @Override // com.bytedance.sdk.component.adexpress.theme.Qhi
    public void Qhi(int i10) {
        DynamicBaseWidget dynamicBaseWidget = this.f8212fl;
        if (dynamicBaseWidget == null) {
            return;
        }
        dynamicBaseWidget.Qhi(i10);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.fl
    public void Qhi(CharSequence charSequence, int i10, int i11, boolean z10) {
        for (int i12 = 0; i12 < this.Gm.size(); i12++) {
            if (this.Gm.get(i12) != null) {
                this.Gm.get(i12).Qhi(charSequence, i10 == 1, i11, z10);
            }
        }
    }
}
