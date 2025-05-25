package com.bytedance.adsdk.ugeno.component;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.adsdk.ugeno.cJ.hm;
import com.bytedance.adsdk.ugeno.component.flexbox.FlexboxLayout;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import java.util.ArrayList;
import java.util.List;

/* compiled from: UGLayoutWidget.java */
/* loaded from: classes.dex */
public class Qhi<E extends ViewGroup> extends cJ {
    protected List<cJ<View>> Qhi;

    public Qhi(Context context) {
        this(context, null);
    }

    public void Qhi(cJ cJVar) {
        if (cJVar == null) {
            return;
        }
        this.Qhi.add(cJVar);
        View hm2 = cJVar.hm();
        if (hm2 != null) {
            ((ViewGroup) this.f7876fl).addView(hm2);
        }
    }

    public C0074Qhi Sf() {
        return new C0074Qhi();
    }

    @Override // com.bytedance.adsdk.ugeno.component.cJ
    public void cJ() {
        super.cJ();
    }

    public Qhi(Context context, Qhi qhi) {
        super(context, qhi);
        this.Qhi = new ArrayList();
    }

    public List<cJ<View>> Qhi() {
        return this.Qhi;
    }

    @Override // com.bytedance.adsdk.ugeno.component.cJ
    public cJ Qhi(String str) {
        cJ<View> cJ;
        if (TextUtils.isEmpty(str) || !TextUtils.equals(str, this.WAv)) {
            for (cJ<View> cJVar : this.Qhi) {
                if (cJVar != null && (cJ = cJVar.cJ(str)) != null) {
                    return cJ;
                }
            }
            return null;
        }
        return this;
    }

    /* compiled from: UGLayoutWidget.java */
    /* renamed from: com.bytedance.adsdk.ugeno.component.Qhi$Qhi  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0074Qhi {
        protected float CJ;
        protected float Qhi;
        protected float ROR;
        protected ViewGroup.LayoutParams Sf;
        protected float Tgh;

        /* renamed from: ac  reason: collision with root package name */
        protected float f7873ac;
        protected float cJ;

        /* renamed from: fl  reason: collision with root package name */
        protected float f7874fl;

        public void Qhi(Context context, String str, String str2) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            str.getClass();
            char c = 65535;
            switch (str.hashCode()) {
                case -1221029593:
                    if (str.equals(InMobiNetworkValues.HEIGHT)) {
                        c = 0;
                        break;
                    }
                    break;
                case -1081309778:
                    if (str.equals("margin")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1044792121:
                    if (str.equals("marginTop")) {
                        c = 2;
                        break;
                    }
                    break;
                case -289173127:
                    if (str.equals("marginBottom")) {
                        c = 3;
                        break;
                    }
                    break;
                case 113126854:
                    if (str.equals(InMobiNetworkValues.WIDTH)) {
                        c = 4;
                        break;
                    }
                    break;
                case 975087886:
                    if (str.equals("marginRight")) {
                        c = 5;
                        break;
                    }
                    break;
                case 1970934485:
                    if (str.equals("marginLeft")) {
                        c = 6;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    if (TextUtils.equals(str2, "match_parent")) {
                        this.cJ = -1.0f;
                        return;
                    } else if (TextUtils.equals(str2, "wrap_content")) {
                        this.cJ = -2.0f;
                        return;
                    } else {
                        this.cJ = hm.Qhi(context, str2);
                        return;
                    }
                case 1:
                    this.f7873ac = hm.Qhi(context, str2);
                    return;
                case 2:
                    this.Tgh = hm.Qhi(context, str2);
                    return;
                case 3:
                    this.ROR = hm.Qhi(context, str2);
                    return;
                case 4:
                    if (TextUtils.equals(str2, "match_parent")) {
                        this.Qhi = -1.0f;
                        return;
                    } else if (TextUtils.equals(str2, "wrap_content")) {
                        this.Qhi = -2.0f;
                        return;
                    } else {
                        this.Qhi = hm.Qhi(context, str2);
                        return;
                    }
                case 5:
                    this.f7874fl = hm.Qhi(context, str2);
                    return;
                case 6:
                    this.CJ = hm.Qhi(context, str2);
                    return;
                default:
                    return;
            }
        }

        public ViewGroup.LayoutParams Qhi() {
            FlexboxLayout.Qhi qhi = new FlexboxLayout.Qhi((int) this.Qhi, (int) this.cJ);
            ((ViewGroup.MarginLayoutParams) qhi).leftMargin = (int) this.CJ;
            ((ViewGroup.MarginLayoutParams) qhi).rightMargin = (int) this.f7874fl;
            ((ViewGroup.MarginLayoutParams) qhi).topMargin = (int) this.Tgh;
            ((ViewGroup.MarginLayoutParams) qhi).bottomMargin = (int) this.ROR;
            return qhi;
        }
    }
}
