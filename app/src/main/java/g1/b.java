package g1;

import a9.g;
import android.view.View;
import g1.a;
import g1.b;
import java.util.ArrayList;
import lib.zj.office.fc.ss.util.CellUtil;

/* compiled from: DynamicAnimation.java */
/* loaded from: classes.dex */
public abstract class b<T extends b<T>> implements a.b {

    /* renamed from: l  reason: collision with root package name */
    public static final C0229b f17381l = new C0229b();

    /* renamed from: m  reason: collision with root package name */
    public static final c f17382m = new c();

    /* renamed from: n  reason: collision with root package name */
    public static final d f17383n = new d();

    /* renamed from: o  reason: collision with root package name */
    public static final e f17384o = new e();

    /* renamed from: p  reason: collision with root package name */
    public static final f f17385p = new f();

    /* renamed from: q  reason: collision with root package name */
    public static final a f17386q = new a();

    /* renamed from: a  reason: collision with root package name */
    public float f17387a;

    /* renamed from: b  reason: collision with root package name */
    public float f17388b;
    public boolean c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f17389d;

    /* renamed from: e  reason: collision with root package name */
    public final g1.c f17390e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f17391f;

    /* renamed from: g  reason: collision with root package name */
    public final float f17392g;

    /* renamed from: h  reason: collision with root package name */
    public long f17393h;

    /* renamed from: i  reason: collision with root package name */
    public final float f17394i;

    /* renamed from: j  reason: collision with root package name */
    public final ArrayList<h> f17395j;

    /* renamed from: k  reason: collision with root package name */
    public final ArrayList<i> f17396k;

    /* compiled from: DynamicAnimation.java */
    /* loaded from: classes.dex */
    public static class a extends j {
        public a() {
            super("alpha");
        }

        @Override // g1.c
        public final float c(Object obj) {
            return ((View) obj).getAlpha();
        }

        @Override // g1.c
        public final void e(Object obj, float f10) {
            ((View) obj).setAlpha(f10);
        }
    }

    /* compiled from: DynamicAnimation.java */
    /* renamed from: g1.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0229b extends j {
        public C0229b() {
            super("scaleX");
        }

        @Override // g1.c
        public final float c(Object obj) {
            return ((View) obj).getScaleX();
        }

        @Override // g1.c
        public final void e(Object obj, float f10) {
            ((View) obj).setScaleX(f10);
        }
    }

    /* compiled from: DynamicAnimation.java */
    /* loaded from: classes.dex */
    public static class c extends j {
        public c() {
            super("scaleY");
        }

        @Override // g1.c
        public final float c(Object obj) {
            return ((View) obj).getScaleY();
        }

        @Override // g1.c
        public final void e(Object obj, float f10) {
            ((View) obj).setScaleY(f10);
        }
    }

    /* compiled from: DynamicAnimation.java */
    /* loaded from: classes.dex */
    public static class d extends j {
        public d() {
            super(CellUtil.ROTATION);
        }

        @Override // g1.c
        public final float c(Object obj) {
            return ((View) obj).getRotation();
        }

        @Override // g1.c
        public final void e(Object obj, float f10) {
            ((View) obj).setRotation(f10);
        }
    }

    /* compiled from: DynamicAnimation.java */
    /* loaded from: classes.dex */
    public static class e extends j {
        public e() {
            super("rotationX");
        }

        @Override // g1.c
        public final float c(Object obj) {
            return ((View) obj).getRotationX();
        }

        @Override // g1.c
        public final void e(Object obj, float f10) {
            ((View) obj).setRotationX(f10);
        }
    }

    /* compiled from: DynamicAnimation.java */
    /* loaded from: classes.dex */
    public static class f extends j {
        public f() {
            super("rotationY");
        }

        @Override // g1.c
        public final float c(Object obj) {
            return ((View) obj).getRotationY();
        }

        @Override // g1.c
        public final void e(Object obj, float f10) {
            ((View) obj).setRotationY(f10);
        }
    }

    /* compiled from: DynamicAnimation.java */
    /* loaded from: classes.dex */
    public static class g {

        /* renamed from: a  reason: collision with root package name */
        public float f17397a;

        /* renamed from: b  reason: collision with root package name */
        public float f17398b;
    }

    /* compiled from: DynamicAnimation.java */
    /* loaded from: classes.dex */
    public interface h {
        void a();
    }

    /* compiled from: DynamicAnimation.java */
    /* loaded from: classes.dex */
    public interface i {
        void a();
    }

    /* compiled from: DynamicAnimation.java */
    /* loaded from: classes.dex */
    public static abstract class j extends g1.c {
    }

    public b(Object obj) {
        g.a aVar = a9.g.f420q;
        this.f17387a = 0.0f;
        this.f17388b = Float.MAX_VALUE;
        this.c = false;
        this.f17391f = false;
        this.f17392g = -3.4028235E38f;
        this.f17393h = 0L;
        this.f17395j = new ArrayList<>();
        this.f17396k = new ArrayList<>();
        this.f17389d = obj;
        this.f17390e = aVar;
        if (aVar != f17383n && aVar != f17384o && aVar != f17385p) {
            if (aVar == f17386q) {
                this.f17394i = 0.00390625f;
                return;
            } else if (aVar != f17381l && aVar != f17382m) {
                this.f17394i = 1.0f;
                return;
            } else {
                this.f17394i = 0.00390625f;
                return;
            }
        }
        this.f17394i = 0.1f;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00ec  */
    @Override // g1.a.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(long r26) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.b.a(long):boolean");
    }

    public final void b(float f10) {
        ArrayList<i> arrayList;
        this.f17390e.e(this.f17389d, f10);
        int i10 = 0;
        while (true) {
            arrayList = this.f17396k;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) != null) {
                arrayList.get(i10).a();
            }
            i10++;
        }
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                if (arrayList.get(size) == null) {
                    arrayList.remove(size);
                }
            } else {
                return;
            }
        }
    }
}
