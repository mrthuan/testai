package f2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import java.util.WeakHashMap;
import x0.f0;
import x0.n0;

/* compiled from: ChangeBounds.java */
/* loaded from: classes.dex */
public final class b extends k {
    public static final c A;
    public static final d B;
    public static final e C;
    public static final f D;

    /* renamed from: y  reason: collision with root package name */
    public static final String[] f16991y = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: z  reason: collision with root package name */
    public static final C0217b f16992z;

    /* compiled from: ChangeBounds.java */
    /* loaded from: classes.dex */
    public static class a extends Property<Drawable, PointF> {

        /* renamed from: a  reason: collision with root package name */
        public final Rect f16993a;

        public a() {
            super(PointF.class, "boundsOrigin");
            this.f16993a = new Rect();
        }

        @Override // android.util.Property
        public final PointF get(Drawable drawable) {
            Rect rect = this.f16993a;
            drawable.copyBounds(rect);
            return new PointF(rect.left, rect.top);
        }

        @Override // android.util.Property
        public final void set(Drawable drawable, PointF pointF) {
            Drawable drawable2 = drawable;
            PointF pointF2 = pointF;
            Rect rect = this.f16993a;
            drawable2.copyBounds(rect);
            rect.offsetTo(Math.round(pointF2.x), Math.round(pointF2.y));
            drawable2.setBounds(rect);
        }
    }

    /* compiled from: ChangeBounds.java */
    /* renamed from: f2.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0217b extends Property<i, PointF> {
        public C0217b() {
            super(PointF.class, "topLeft");
        }

        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(i iVar) {
            return null;
        }

        @Override // android.util.Property
        public final void set(i iVar, PointF pointF) {
            i iVar2 = iVar;
            PointF pointF2 = pointF;
            iVar2.getClass();
            iVar2.f16996a = Math.round(pointF2.x);
            int round = Math.round(pointF2.y);
            iVar2.f16997b = round;
            int i10 = iVar2.f17000f + 1;
            iVar2.f17000f = i10;
            if (i10 == iVar2.f17001g) {
                w.a(iVar2.f16999e, iVar2.f16996a, round, iVar2.c, iVar2.f16998d);
                iVar2.f17000f = 0;
                iVar2.f17001g = 0;
            }
        }
    }

    /* compiled from: ChangeBounds.java */
    /* loaded from: classes.dex */
    public static class c extends Property<i, PointF> {
        public c() {
            super(PointF.class, "bottomRight");
        }

        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(i iVar) {
            return null;
        }

        @Override // android.util.Property
        public final void set(i iVar, PointF pointF) {
            i iVar2 = iVar;
            PointF pointF2 = pointF;
            iVar2.getClass();
            iVar2.c = Math.round(pointF2.x);
            int round = Math.round(pointF2.y);
            iVar2.f16998d = round;
            int i10 = iVar2.f17001g + 1;
            iVar2.f17001g = i10;
            if (iVar2.f17000f == i10) {
                w.a(iVar2.f16999e, iVar2.f16996a, iVar2.f16997b, iVar2.c, round);
                iVar2.f17000f = 0;
                iVar2.f17001g = 0;
            }
        }
    }

    /* compiled from: ChangeBounds.java */
    /* loaded from: classes.dex */
    public static class d extends Property<View, PointF> {
        public d() {
            super(PointF.class, "bottomRight");
        }

        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public final void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            w.a(view2, view2.getLeft(), view2.getTop(), Math.round(pointF2.x), Math.round(pointF2.y));
        }
    }

    /* compiled from: ChangeBounds.java */
    /* loaded from: classes.dex */
    public static class e extends Property<View, PointF> {
        public e() {
            super(PointF.class, "topLeft");
        }

        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public final void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            w.a(view2, Math.round(pointF2.x), Math.round(pointF2.y), view2.getRight(), view2.getBottom());
        }
    }

    /* compiled from: ChangeBounds.java */
    /* loaded from: classes.dex */
    public static class f extends Property<View, PointF> {
        public f() {
            super(PointF.class, "position");
        }

        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public final void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            int round = Math.round(pointF2.x);
            int round2 = Math.round(pointF2.y);
            w.a(view2, round, round2, view2.getWidth() + round, view2.getHeight() + round2);
        }
    }

    /* compiled from: ChangeBounds.java */
    /* loaded from: classes.dex */
    public class g extends AnimatorListenerAdapter {
        private i mViewBounds;

        public g(i iVar) {
            this.mViewBounds = iVar;
        }
    }

    /* compiled from: ChangeBounds.java */
    /* loaded from: classes.dex */
    public class h extends n {

        /* renamed from: a  reason: collision with root package name */
        public boolean f16994a = false;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ViewGroup f16995b;

        public h(ViewGroup viewGroup) {
            this.f16995b = viewGroup;
        }

        @Override // f2.n, f2.k.d
        public final void a() {
            u.a(this.f16995b, false);
        }

        @Override // f2.n, f2.k.d
        public final void b() {
            u.a(this.f16995b, false);
            this.f16994a = true;
        }

        @Override // f2.k.d
        public final void c(k kVar) {
            if (!this.f16994a) {
                u.a(this.f16995b, false);
            }
            kVar.x(this);
        }

        @Override // f2.n, f2.k.d
        public final void e() {
            u.a(this.f16995b, true);
        }
    }

    /* compiled from: ChangeBounds.java */
    /* loaded from: classes.dex */
    public static class i {

        /* renamed from: a  reason: collision with root package name */
        public int f16996a;

        /* renamed from: b  reason: collision with root package name */
        public int f16997b;
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public int f16998d;

        /* renamed from: e  reason: collision with root package name */
        public final View f16999e;

        /* renamed from: f  reason: collision with root package name */
        public int f17000f;

        /* renamed from: g  reason: collision with root package name */
        public int f17001g;

        public i(View view) {
            this.f16999e = view;
        }
    }

    static {
        new a();
        f16992z = new C0217b();
        A = new c();
        B = new d();
        C = new e();
        D = new f();
    }

    public final void J(r rVar) {
        WeakHashMap<View, n0> weakHashMap = x0.f0.f31435a;
        View view = rVar.f17076b;
        if (f0.g.c(view) || view.getWidth() != 0 || view.getHeight() != 0) {
            HashMap hashMap = rVar.f17075a;
            hashMap.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            hashMap.put("android:changeBounds:parent", view.getParent());
        }
    }

    @Override // f2.k
    public final void e(r rVar) {
        J(rVar);
    }

    @Override // f2.k
    public final void h(r rVar) {
        J(rVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f2.k
    public final Animator l(ViewGroup viewGroup, r rVar, r rVar2) {
        int i10;
        b bVar;
        ObjectAnimator ofObject;
        if (rVar != null && rVar2 != null) {
            HashMap hashMap = rVar.f17075a;
            HashMap hashMap2 = rVar2.f17075a;
            ViewGroup viewGroup2 = (ViewGroup) hashMap.get("android:changeBounds:parent");
            ViewGroup viewGroup3 = (ViewGroup) hashMap2.get("android:changeBounds:parent");
            if (viewGroup2 != null && viewGroup3 != null) {
                Rect rect = (Rect) hashMap.get("android:changeBounds:bounds");
                Rect rect2 = (Rect) hashMap2.get("android:changeBounds:bounds");
                int i11 = rect.left;
                int i12 = rect2.left;
                int i13 = rect.top;
                int i14 = rect2.top;
                int i15 = rect.right;
                int i16 = rect2.right;
                int i17 = rect.bottom;
                int i18 = rect2.bottom;
                int i19 = i15 - i11;
                int i20 = i17 - i13;
                int i21 = i16 - i12;
                int i22 = i18 - i14;
                Rect rect3 = (Rect) hashMap.get("android:changeBounds:clip");
                Rect rect4 = (Rect) hashMap2.get("android:changeBounds:clip");
                if ((i19 != 0 && i20 != 0) || (i21 != 0 && i22 != 0)) {
                    if (i11 == i12 && i13 == i14) {
                        i10 = 0;
                    } else {
                        i10 = 1;
                    }
                    if (i15 != i16 || i17 != i18) {
                        i10++;
                    }
                } else {
                    i10 = 0;
                }
                if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
                    i10++;
                }
                int i23 = i10;
                if (i23 > 0) {
                    View view = rVar2.f17076b;
                    w.a(view, i11, i13, i15, i17);
                    if (i23 == 2) {
                        if (i19 == i21 && i20 == i22) {
                            bVar = this;
                            ofObject = ObjectAnimator.ofObject(view, D, (TypeConverter) null, bVar.f17055u.d(i11, i13, i12, i14));
                        } else {
                            bVar = this;
                            i iVar = new i(view);
                            ObjectAnimator ofObject2 = ObjectAnimator.ofObject(iVar, f16992z, (TypeConverter) null, bVar.f17055u.d(i11, i13, i12, i14));
                            ObjectAnimator ofObject3 = ObjectAnimator.ofObject(iVar, A, (TypeConverter) null, bVar.f17055u.d(i15, i17, i16, i18));
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.playTogether(ofObject2, ofObject3);
                            animatorSet.addListener(new g(iVar));
                            ofObject = animatorSet;
                        }
                    } else {
                        bVar = this;
                        if (i11 == i12 && i13 == i14) {
                            ofObject = ObjectAnimator.ofObject(view, B, (TypeConverter) null, bVar.f17055u.d(i15, i17, i16, i18));
                        } else {
                            ofObject = ObjectAnimator.ofObject(view, C, (TypeConverter) null, bVar.f17055u.d(i11, i13, i12, i14));
                        }
                    }
                    if (view.getParent() instanceof ViewGroup) {
                        ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                        u.a(viewGroup4, true);
                        bVar.a(new h(viewGroup4));
                    }
                    return ofObject;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    @Override // f2.k
    public final String[] r() {
        return f16991y;
    }
}
