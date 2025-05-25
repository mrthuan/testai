package ij;

import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
import lib.zj.pdfeditor.Annotation;
import lib.zj.pdfeditor.text.AdjustActionInfo;
import lib.zj.pdfeditor.text.PDFFreeTextEditView;

/* compiled from: EditAction.java */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public int f18518a;

    /* renamed from: b  reason: collision with root package name */
    public final Annotation.Type f18519b;
    public final PointF[] c;

    /* renamed from: d  reason: collision with root package name */
    public RectF f18520d;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList<a> f18521e;

    /* renamed from: f  reason: collision with root package name */
    public final AdjustActionInfo f18522f;

    /* renamed from: g  reason: collision with root package name */
    public final PDFFreeTextEditView f18523g;

    /* renamed from: h  reason: collision with root package name */
    public final float f18524h;

    /* renamed from: i  reason: collision with root package name */
    public float f18525i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f18526j;

    /* renamed from: k  reason: collision with root package name */
    public int f18527k;

    /* renamed from: l  reason: collision with root package name */
    public int f18528l;

    public b() {
        this.f18521e = new ArrayList<>();
        this.f18526j = false;
        this.f18527k = 0;
        this.f18528l = 0;
    }

    public b(Annotation.Type type, PointF[] pointFArr) {
        this.f18521e = new ArrayList<>();
        this.f18526j = false;
        this.f18527k = 0;
        this.f18528l = 0;
        this.f18519b = type;
        this.c = pointFArr;
    }

    public b(Annotation.Type type, a aVar) {
        ArrayList<a> arrayList = new ArrayList<>();
        this.f18521e = arrayList;
        this.f18526j = false;
        this.f18527k = 0;
        this.f18528l = 0;
        this.f18519b = type;
        arrayList.add(aVar);
    }

    public b(Annotation.Type type, List<a> list) {
        ArrayList<a> arrayList = new ArrayList<>();
        this.f18521e = arrayList;
        this.f18526j = false;
        this.f18527k = 0;
        this.f18528l = 0;
        this.f18519b = type;
        arrayList.addAll(list);
    }

    public b(Annotation.Type type, PDFFreeTextEditView pDFFreeTextEditView, AdjustActionInfo adjustActionInfo, float f10, float f11) {
        this.f18521e = new ArrayList<>();
        this.f18526j = false;
        this.f18527k = 0;
        this.f18528l = 0;
        this.f18519b = type;
        this.f18523g = pDFFreeTextEditView;
        this.f18522f = adjustActionInfo;
        this.f18524h = f10;
        this.f18525i = f11;
    }
}
