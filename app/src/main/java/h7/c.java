package h7;

import android.view.View;
import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import lib.zj.office.fc.hslf.record.SlideAtom;

/* compiled from: FlexLine.java */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: e  reason: collision with root package name */
    public int f18050e;

    /* renamed from: f  reason: collision with root package name */
    public int f18051f;

    /* renamed from: g  reason: collision with root package name */
    public int f18052g;

    /* renamed from: h  reason: collision with root package name */
    public int f18053h;

    /* renamed from: i  reason: collision with root package name */
    public int f18054i;

    /* renamed from: j  reason: collision with root package name */
    public float f18055j;

    /* renamed from: k  reason: collision with root package name */
    public float f18056k;

    /* renamed from: l  reason: collision with root package name */
    public int f18057l;

    /* renamed from: m  reason: collision with root package name */
    public int f18058m;

    /* renamed from: o  reason: collision with root package name */
    public int f18060o;

    /* renamed from: p  reason: collision with root package name */
    public int f18061p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f18062q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f18063r;

    /* renamed from: a  reason: collision with root package name */
    public int f18047a = Api.BaseClientBuilder.API_PRIORITY_OTHER;

    /* renamed from: b  reason: collision with root package name */
    public int f18048b = Api.BaseClientBuilder.API_PRIORITY_OTHER;
    public int c = SlideAtom.USES_MASTER_SLIDE_ID;

    /* renamed from: d  reason: collision with root package name */
    public int f18049d = SlideAtom.USES_MASTER_SLIDE_ID;

    /* renamed from: n  reason: collision with root package name */
    public final ArrayList f18059n = new ArrayList();

    public final void a(View view, int i10, int i11, int i12, int i13) {
        b bVar = (b) view.getLayoutParams();
        this.f18047a = Math.min(this.f18047a, (view.getLeft() - bVar.getMarginLeft()) - i10);
        this.f18048b = Math.min(this.f18048b, (view.getTop() - bVar.getMarginTop()) - i11);
        this.c = Math.max(this.c, bVar.getMarginRight() + view.getRight() + i12);
        this.f18049d = Math.max(this.f18049d, bVar.getMarginBottom() + view.getBottom() + i13);
    }
}
