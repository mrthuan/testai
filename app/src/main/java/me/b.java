package me;

import android.content.Context;
import android.view.View;
import eo.d;
import l.p;

/* compiled from: BaseRateDialog.java */
/* loaded from: classes.dex */
public final class b implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ne.a f21993a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f21994b;
    public final /* synthetic */ oe.a c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ d f21995d;

    public b(f fVar, ne.a aVar, Context context, d.a aVar2) {
        this.f21995d = fVar;
        this.f21993a = aVar;
        this.f21994b = context;
        this.c = aVar2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        d dVar = this.f21995d;
        dVar.f22006k.dismiss();
        int i10 = dVar.f22008m;
        oe.a aVar = this.c;
        if (i10 > 4) {
            ne.a aVar2 = this.f21993a;
            if (aVar2.f22445h) {
                g.a(this.f21994b, aVar2);
            }
            if (aVar != null) {
                aVar.e(dVar.f22008m);
                aVar.c();
            }
            p pVar = dVar.f22006k;
            if (pVar != null && pVar.isShowing()) {
                dVar.f22006k.dismiss();
            }
        } else if (aVar != null) {
            aVar.d();
            aVar.c();
        }
    }
}
