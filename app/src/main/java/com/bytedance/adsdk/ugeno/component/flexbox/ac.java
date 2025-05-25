package com.bytedance.adsdk.ugeno.component.flexbox;

import android.view.View;
import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.List;
import lib.zj.office.fc.hslf.record.SlideAtom;

/* compiled from: FlexLine.java */
/* loaded from: classes.dex */
public class ac {
    int ABk;
    float Gm;
    boolean HzH;
    int ROR;
    int Sf;
    int Tgh;
    float WAv;

    /* renamed from: fl  reason: collision with root package name */
    int f7895fl;

    /* renamed from: hm  reason: collision with root package name */
    int f7896hm;
    int hpZ;
    boolean kYc;
    int pA;

    /* renamed from: zc  reason: collision with root package name */
    int f7897zc;
    int Qhi = Api.BaseClientBuilder.API_PRIORITY_OTHER;
    int cJ = Api.BaseClientBuilder.API_PRIORITY_OTHER;

    /* renamed from: ac  reason: collision with root package name */
    int f7894ac = SlideAtom.USES_MASTER_SLIDE_ID;
    int CJ = SlideAtom.USES_MASTER_SLIDE_ID;
    List<Integer> iMK = new ArrayList();

    public int Qhi() {
        return this.ROR;
    }

    public int cJ() {
        return this.Sf - this.f7896hm;
    }

    public void Qhi(View view, int i10, int i11, int i12, int i13) {
        cJ cJVar = (cJ) view.getLayoutParams();
        this.Qhi = Math.min(this.Qhi, (view.getLeft() - cJVar.ABk()) - i10);
        this.cJ = Math.min(this.cJ, (view.getTop() - cJVar.iMK()) - i11);
        this.f7894ac = Math.max(this.f7894ac, cJVar.pA() + view.getRight() + i12);
        this.CJ = Math.max(this.CJ, cJVar.hpZ() + view.getBottom() + i13);
    }
}
