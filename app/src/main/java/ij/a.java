package ij;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;
import lib.zj.pdfeditor.ReaderPDFCore;

/* compiled from: DrawPath.java */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: b  reason: collision with root package name */
    public int f18509b;

    /* renamed from: d  reason: collision with root package name */
    public float f18510d;

    /* renamed from: e  reason: collision with root package name */
    public int f18511e;

    /* renamed from: f  reason: collision with root package name */
    public PointF[][] f18512f;

    /* renamed from: g  reason: collision with root package name */
    public int[] f18513g;

    /* renamed from: h  reason: collision with root package name */
    public float[] f18514h;
    public ArrayList<b> c = new ArrayList<>();

    /* renamed from: a  reason: collision with root package name */
    public long f18508a = System.currentTimeMillis();

    /* compiled from: DrawPath.java */
    /* renamed from: ij.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0249a {

        /* renamed from: a  reason: collision with root package name */
        public final int f18515a;

        /* renamed from: b  reason: collision with root package name */
        public final ReaderPDFCore.CX_Status f18516b;
        public float[] c;

        public C0249a() {
        }

        public C0249a(int i10, ReaderPDFCore.CX_Status cX_Status) {
            this.f18515a = i10;
            this.f18516b = cX_Status;
        }
    }

    public final boolean a() {
        if (this.c.isEmpty()) {
            return false;
        }
        int size = this.c.size();
        this.f18512f = new PointF[size];
        this.f18513g = new int[size];
        this.f18514h = new float[size];
        for (int i10 = 0; i10 < this.c.size(); i10++) {
            b bVar = this.c.get(i10);
            if (bVar != null) {
                ArrayList arrayList = bVar.f18517a;
                if (!arrayList.isEmpty()) {
                    this.f18512f[i10] = (PointF[]) new ArrayList(arrayList).toArray(new PointF[0]);
                }
            }
            this.f18513g[i10] = this.f18511e;
            this.f18514h[i10] = this.f18510d;
        }
        return true;
    }

    public final boolean b() {
        b bVar;
        if (this.c.isEmpty() || (bVar = this.c.get(0)) == null) {
            return false;
        }
        return !bVar.f18517a.isEmpty();
    }

    /* compiled from: DrawPath.java */
    /* loaded from: classes3.dex */
    public static class b implements Cloneable {

        /* renamed from: a  reason: collision with root package name */
        public final ArrayList f18517a;

        public b() {
            this.f18517a = new ArrayList();
        }

        /* renamed from: a */
        public final b clone() {
            try {
                return (b) super.clone();
            } catch (CloneNotSupportedException e10) {
                throw new RuntimeException(e10);
            }
        }

        public b(List<PointF> list) {
            ArrayList arrayList = new ArrayList();
            this.f18517a = arrayList;
            arrayList.addAll(list);
        }
    }
}
