package androidx.emoji2.text;

import android.graphics.Typeface;
import android.util.SparseArray;
import pdf.pdfreader.viewer.editor.free.utils.t0;

/* compiled from: MetadataRepo.java */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    public final h1.b f3658a;

    /* renamed from: b  reason: collision with root package name */
    public final char[] f3659b;
    public final a c = new a(1024);

    /* renamed from: d  reason: collision with root package name */
    public final Typeface f3660d;

    /* compiled from: MetadataRepo.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final SparseArray<a> f3661a;

        /* renamed from: b  reason: collision with root package name */
        public j f3662b;

        public a() {
            this(1);
        }

        public final void a(j jVar, int i10, int i11) {
            a aVar;
            int a10 = jVar.a(i10);
            SparseArray<a> sparseArray = this.f3661a;
            if (sparseArray == null) {
                aVar = null;
            } else {
                aVar = sparseArray.get(a10);
            }
            if (aVar == null) {
                aVar = new a();
                sparseArray.put(jVar.a(i10), aVar);
            }
            if (i11 > i10) {
                aVar.a(jVar, i10 + 1, i11);
            } else {
                aVar.f3662b = jVar;
            }
        }

        public a(int i10) {
            this.f3661a = new SparseArray<>(i10);
        }
    }

    public o(Typeface typeface, h1.b bVar) {
        int i10;
        int i11;
        int i12;
        boolean z10;
        this.f3660d = typeface;
        this.f3658a = bVar;
        int a10 = bVar.a(6);
        if (a10 != 0) {
            int i13 = a10 + bVar.f17947a;
            i10 = bVar.f17948b.getInt(bVar.f17948b.getInt(i13) + i13);
        } else {
            i10 = 0;
        }
        this.f3659b = new char[i10 * 2];
        int a11 = bVar.a(6);
        if (a11 != 0) {
            int i14 = a11 + bVar.f17947a;
            i11 = bVar.f17948b.getInt(bVar.f17948b.getInt(i14) + i14);
        } else {
            i11 = 0;
        }
        for (int i15 = 0; i15 < i11; i15++) {
            j jVar = new j(this, i15);
            h1.a c = jVar.c();
            int a12 = c.a(4);
            if (a12 != 0) {
                i12 = c.f17948b.getInt(a12 + c.f17947a);
            } else {
                i12 = 0;
            }
            Character.toChars(i12, this.f3659b, i15 * 2);
            if (jVar.b() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            t0.s("invalid metadata codepoint length", z10);
            this.c.a(jVar, 0, jVar.b() - 1);
        }
    }
}
