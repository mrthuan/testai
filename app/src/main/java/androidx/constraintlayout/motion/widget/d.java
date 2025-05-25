package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Rect;
import android.util.Xml;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.motion.widget.a;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.a;
import f0.g;
import f0.l;
import f0.n;
import f0.p;
import f0.s;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import l.t;
import lib.zj.office.fc.openxml4j.opc.PackagingURIHelper;
import org.xmlpull.v1.XmlPullParserException;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: ViewTransition.java */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public int f3130a;

    /* renamed from: e  reason: collision with root package name */
    public int f3133e;

    /* renamed from: f  reason: collision with root package name */
    public final g f3134f;

    /* renamed from: g  reason: collision with root package name */
    public final a.C0012a f3135g;

    /* renamed from: j  reason: collision with root package name */
    public int f3138j;

    /* renamed from: k  reason: collision with root package name */
    public String f3139k;

    /* renamed from: o  reason: collision with root package name */
    public final Context f3143o;

    /* renamed from: b  reason: collision with root package name */
    public int f3131b = -1;
    public boolean c = false;

    /* renamed from: d  reason: collision with root package name */
    public int f3132d = 0;

    /* renamed from: h  reason: collision with root package name */
    public int f3136h = -1;

    /* renamed from: i  reason: collision with root package name */
    public int f3137i = -1;

    /* renamed from: l  reason: collision with root package name */
    public int f3140l = 0;

    /* renamed from: m  reason: collision with root package name */
    public String f3141m = null;

    /* renamed from: n  reason: collision with root package name */
    public int f3142n = -1;

    /* renamed from: p  reason: collision with root package name */
    public int f3144p = -1;

    /* renamed from: q  reason: collision with root package name */
    public int f3145q = -1;

    /* renamed from: r  reason: collision with root package name */
    public int f3146r = -1;

    /* renamed from: s  reason: collision with root package name */
    public int f3147s = -1;

    /* renamed from: t  reason: collision with root package name */
    public int f3148t = -1;

    /* renamed from: u  reason: collision with root package name */
    public int f3149u = -1;

    /* compiled from: ViewTransition.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f3150a;

        /* renamed from: b  reason: collision with root package name */
        public final int f3151b;
        public final n c;

        /* renamed from: d  reason: collision with root package name */
        public final int f3152d;

        /* renamed from: f  reason: collision with root package name */
        public final e f3154f;

        /* renamed from: g  reason: collision with root package name */
        public final Interpolator f3155g;

        /* renamed from: i  reason: collision with root package name */
        public float f3157i;

        /* renamed from: j  reason: collision with root package name */
        public float f3158j;

        /* renamed from: m  reason: collision with root package name */
        public final boolean f3161m;

        /* renamed from: e  reason: collision with root package name */
        public final t f3153e = new t(1);

        /* renamed from: h  reason: collision with root package name */
        public boolean f3156h = false;

        /* renamed from: l  reason: collision with root package name */
        public final Rect f3160l = new Rect();

        /* renamed from: k  reason: collision with root package name */
        public long f3159k = System.nanoTime();

        public a(e eVar, n nVar, int i10, int i11, int i12, Interpolator interpolator, int i13, int i14) {
            float f10;
            this.f3161m = false;
            this.f3154f = eVar;
            this.c = nVar;
            this.f3152d = i11;
            if (eVar.f3164d == null) {
                eVar.f3164d = new ArrayList<>();
            }
            eVar.f3164d.add(this);
            this.f3155g = interpolator;
            this.f3150a = i13;
            this.f3151b = i14;
            if (i12 == 3) {
                this.f3161m = true;
            }
            if (i10 == 0) {
                f10 = Float.MAX_VALUE;
            } else {
                f10 = 1.0f / i10;
            }
            this.f3158j = f10;
            a();
        }

        public final void a() {
            float interpolation;
            boolean z10 = this.f3156h;
            int i10 = this.f3151b;
            int i11 = this.f3150a;
            e eVar = this.f3154f;
            Interpolator interpolator = this.f3155g;
            n nVar = this.c;
            if (z10) {
                long nanoTime = System.nanoTime();
                this.f3159k = nanoTime;
                float f10 = this.f3157i - (((float) ((nanoTime - this.f3159k) * 1.0E-6d)) * this.f3158j);
                this.f3157i = f10;
                if (f10 < 0.0f) {
                    this.f3157i = 0.0f;
                }
                float f11 = this.f3157i;
                if (interpolator != null) {
                    f11 = interpolator.getInterpolation(f11);
                }
                boolean e10 = nVar.e(f11, nanoTime, nVar.f16945b, this.f3153e);
                if (this.f3157i <= 0.0f) {
                    if (i11 != -1) {
                        nVar.f16945b.setTag(i11, Long.valueOf(System.nanoTime()));
                    }
                    if (i10 != -1) {
                        nVar.f16945b.setTag(i10, null);
                    }
                    eVar.f3165e.add(this);
                }
                if (this.f3157i > 0.0f || e10) {
                    eVar.f3162a.invalidate();
                    return;
                }
                return;
            }
            long nanoTime2 = System.nanoTime();
            this.f3159k = nanoTime2;
            float f12 = (((float) ((nanoTime2 - this.f3159k) * 1.0E-6d)) * this.f3158j) + this.f3157i;
            this.f3157i = f12;
            if (f12 >= 1.0f) {
                this.f3157i = 1.0f;
            }
            if (interpolator == null) {
                interpolation = this.f3157i;
            } else {
                interpolation = interpolator.getInterpolation(this.f3157i);
            }
            boolean e11 = nVar.e(interpolation, nanoTime2, nVar.f16945b, this.f3153e);
            if (this.f3157i >= 1.0f) {
                if (i11 != -1) {
                    nVar.f16945b.setTag(i11, Long.valueOf(System.nanoTime()));
                }
                if (i10 != -1) {
                    nVar.f16945b.setTag(i10, null);
                }
                if (!this.f3161m) {
                    eVar.f3165e.add(this);
                }
            }
            if (this.f3157i < 1.0f || e11) {
                eVar.f3162a.invalidate();
            }
        }

        public final void b() {
            float f10;
            this.f3156h = true;
            int i10 = this.f3152d;
            if (i10 != -1) {
                if (i10 == 0) {
                    f10 = Float.MAX_VALUE;
                } else {
                    f10 = 1.0f / i10;
                }
                this.f3158j = f10;
            }
            this.f3154f.f3162a.invalidate();
            this.f3159k = System.nanoTime();
        }
    }

    public d(Context context, XmlResourceParser xmlResourceParser) {
        boolean z10;
        this.f3143o = context;
        try {
            int eventType = xmlResourceParser.getEventType();
            while (eventType != 1) {
                if (eventType != 2) {
                    if (eventType != 3) {
                        continue;
                    } else if ("ViewTransition".equals(xmlResourceParser.getName())) {
                        return;
                    }
                } else {
                    String name = xmlResourceParser.getName();
                    switch (name.hashCode()) {
                        case -1962203927:
                            if (name.equals("ConstraintOverride")) {
                                z10 = true;
                                break;
                            }
                            z10 = true;
                            break;
                        case -1239391468:
                            if (name.equals("KeyFrameSet")) {
                                z10 = true;
                                break;
                            }
                            z10 = true;
                            break;
                        case 61998586:
                            if (name.equals("ViewTransition")) {
                                z10 = false;
                                break;
                            }
                            z10 = true;
                            break;
                        case 366511058:
                            if (name.equals("CustomMethod")) {
                                z10 = true;
                                break;
                            }
                            z10 = true;
                            break;
                        case 1791837707:
                            if (name.equals("CustomAttribute")) {
                                z10 = true;
                                break;
                            }
                            z10 = true;
                            break;
                        default:
                            z10 = true;
                            break;
                    }
                    if (z10) {
                        if (!z10) {
                            if (!z10) {
                                if (!z10 && !z10) {
                                    f0.a.a();
                                    xmlResourceParser.getLineNumber();
                                } else {
                                    ConstraintAttribute.d(context, xmlResourceParser, this.f3135g.f3375g);
                                }
                            } else {
                                this.f3135g = androidx.constraintlayout.widget.a.d(context, xmlResourceParser);
                            }
                        } else {
                            this.f3134f = new g(context, xmlResourceParser);
                        }
                    } else {
                        d(context, xmlResourceParser);
                    }
                }
                eventType = xmlResourceParser.next();
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        } catch (XmlPullParserException e11) {
            e11.printStackTrace();
        }
    }

    public final void a(e eVar, MotionLayout motionLayout, int i10, androidx.constraintlayout.widget.a aVar, View... viewArr) {
        int[] constraintSetIds;
        androidx.constraintlayout.widget.a b10;
        Interpolator loadInterpolator;
        f0.t tVar;
        if (this.c) {
            return;
        }
        int i11 = this.f3133e;
        g gVar = this.f3134f;
        if (i11 == 2) {
            View view = viewArr[0];
            n nVar = new n(view);
            p pVar = nVar.f16948f;
            pVar.c = 0.0f;
            pVar.f16972d = 0.0f;
            nVar.H = true;
            pVar.d(view.getX(), view.getY(), view.getWidth(), view.getHeight());
            nVar.f16949g.d(view.getX(), view.getY(), view.getWidth(), view.getHeight());
            l lVar = nVar.f16950h;
            lVar.getClass();
            view.getX();
            view.getY();
            view.getWidth();
            view.getHeight();
            lVar.b(view);
            l lVar2 = nVar.f16951i;
            lVar2.getClass();
            view.getX();
            view.getY();
            view.getWidth();
            view.getHeight();
            lVar2.b(view);
            ArrayList<f0.d> arrayList = gVar.f16876a.get(-1);
            if (arrayList != null) {
                nVar.f16965w.addAll(arrayList);
            }
            nVar.h(motionLayout.getWidth(), motionLayout.getHeight(), System.nanoTime());
            int i12 = this.f3136h;
            int i13 = this.f3137i;
            int i14 = this.f3131b;
            Context context = motionLayout.getContext();
            int i15 = this.f3140l;
            if (i15 != -2) {
                if (i15 != -1) {
                    if (i15 != 0) {
                        if (i15 != 1) {
                            if (i15 != 2) {
                                if (i15 != 4) {
                                    if (i15 != 5) {
                                        if (i15 != 6) {
                                            loadInterpolator = null;
                                        } else {
                                            loadInterpolator = new AnticipateInterpolator();
                                        }
                                    } else {
                                        loadInterpolator = new OvershootInterpolator();
                                    }
                                } else {
                                    loadInterpolator = new BounceInterpolator();
                                }
                            } else {
                                loadInterpolator = new DecelerateInterpolator();
                            }
                        } else {
                            loadInterpolator = new AccelerateInterpolator();
                        }
                    } else {
                        loadInterpolator = new AccelerateDecelerateInterpolator();
                    }
                } else {
                    tVar = new f0.t(b0.c.c(this.f3141m));
                    new a(eVar, nVar, i12, i13, i14, tVar, this.f3144p, this.f3145q);
                    return;
                }
            } else {
                loadInterpolator = AnimationUtils.loadInterpolator(context, this.f3142n);
            }
            tVar = loadInterpolator;
            new a(eVar, nVar, i12, i13, i14, tVar, this.f3144p, this.f3145q);
            return;
        }
        a.C0012a c0012a = this.f3135g;
        if (i11 == 1) {
            for (int i16 : motionLayout.getConstraintSetIds()) {
                if (i16 != i10) {
                    androidx.constraintlayout.motion.widget.a aVar2 = motionLayout.f3015q;
                    if (aVar2 == null) {
                        b10 = null;
                    } else {
                        b10 = aVar2.b(i16);
                    }
                    for (View view2 : viewArr) {
                        a.C0012a l10 = b10.l(view2.getId());
                        if (c0012a != null) {
                            a.C0012a.C0013a c0013a = c0012a.f3376h;
                            if (c0013a != null) {
                                c0013a.e(l10);
                            }
                            l10.f3375g.putAll(c0012a.f3375g);
                        }
                    }
                }
            }
        }
        androidx.constraintlayout.widget.a aVar3 = new androidx.constraintlayout.widget.a();
        HashMap<Integer, a.C0012a> hashMap = aVar3.f3369f;
        hashMap.clear();
        for (Integer num : aVar.f3369f.keySet()) {
            a.C0012a c0012a2 = aVar.f3369f.get(num);
            if (c0012a2 != null) {
                hashMap.put(num, c0012a2.clone());
            }
        }
        for (View view3 : viewArr) {
            a.C0012a l11 = aVar3.l(view3.getId());
            if (c0012a != null) {
                a.C0012a.C0013a c0013a2 = c0012a.f3376h;
                if (c0013a2 != null) {
                    c0013a2.e(l11);
                }
                l11.f3375g.putAll(c0012a.f3375g);
            }
        }
        motionLayout.J(i10, aVar3);
        motionLayout.J(R.id.view_transition, aVar);
        motionLayout.E(R.id.view_transition);
        a.b bVar = new a.b(motionLayout.f3015q, i10);
        for (View view4 : viewArr) {
            int i17 = this.f3136h;
            if (i17 != -1) {
                bVar.f3092h = Math.max(i17, 8);
            }
            bVar.f3100p = this.f3132d;
            int i18 = this.f3140l;
            String str = this.f3141m;
            int i19 = this.f3142n;
            bVar.f3089e = i18;
            bVar.f3090f = str;
            bVar.f3091g = i19;
            int id2 = view4.getId();
            if (gVar != null) {
                g gVar2 = new g();
                Iterator<f0.d> it = gVar.f16876a.get(-1).iterator();
                while (it.hasNext()) {
                    f0.d clone = it.next().clone();
                    clone.f16837b = id2;
                    gVar2.b(clone);
                }
                bVar.f3095k.add(gVar2);
            }
        }
        motionLayout.setTransition(bVar);
        s sVar = new s(0, this, viewArr);
        motionLayout.s(1.0f);
        motionLayout.f3026v0 = sVar;
    }

    public final boolean b(View view) {
        boolean z10;
        boolean z11;
        int i10 = this.f3146r;
        if (i10 == -1 || view.getTag(i10) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i11 = this.f3147s;
        if (i11 == -1 || view.getTag(i11) == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z10 || !z11) {
            return false;
        }
        return true;
    }

    public final boolean c(View view) {
        String str;
        if (view == null) {
            return false;
        }
        if ((this.f3138j == -1 && this.f3139k == null) || !b(view)) {
            return false;
        }
        if (view.getId() == this.f3138j) {
            return true;
        }
        if (this.f3139k == null || !(view.getLayoutParams() instanceof ConstraintLayout.b) || (str = ((ConstraintLayout.b) view.getLayoutParams()).Y) == null || !str.matches(this.f3139k)) {
            return false;
        }
        return true;
    }

    public final void d(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), g0.d.F);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = obtainStyledAttributes.getIndex(i10);
            if (index == 0) {
                this.f3130a = obtainStyledAttributes.getResourceId(index, this.f3130a);
            } else if (index == 8) {
                if (MotionLayout.F0) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, this.f3138j);
                    this.f3138j = resourceId;
                    if (resourceId == -1) {
                        this.f3139k = obtainStyledAttributes.getString(index);
                    }
                } else if (obtainStyledAttributes.peekValue(index).type == 3) {
                    this.f3139k = obtainStyledAttributes.getString(index);
                } else {
                    this.f3138j = obtainStyledAttributes.getResourceId(index, this.f3138j);
                }
            } else if (index == 9) {
                this.f3131b = obtainStyledAttributes.getInt(index, this.f3131b);
            } else if (index == 12) {
                this.c = obtainStyledAttributes.getBoolean(index, this.c);
            } else if (index == 10) {
                this.f3132d = obtainStyledAttributes.getInt(index, this.f3132d);
            } else if (index == 4) {
                this.f3136h = obtainStyledAttributes.getInt(index, this.f3136h);
            } else if (index == 13) {
                this.f3137i = obtainStyledAttributes.getInt(index, this.f3137i);
            } else if (index == 14) {
                this.f3133e = obtainStyledAttributes.getInt(index, this.f3133e);
            } else if (index == 7) {
                int i11 = obtainStyledAttributes.peekValue(index).type;
                if (i11 == 1) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, -1);
                    this.f3142n = resourceId2;
                    if (resourceId2 != -1) {
                        this.f3140l = -2;
                    }
                } else if (i11 == 3) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f3141m = string;
                    if (string != null && string.indexOf(PackagingURIHelper.FORWARD_SLASH_STRING) > 0) {
                        this.f3142n = obtainStyledAttributes.getResourceId(index, -1);
                        this.f3140l = -2;
                    } else {
                        this.f3140l = -1;
                    }
                } else {
                    this.f3140l = obtainStyledAttributes.getInteger(index, this.f3140l);
                }
            } else if (index == 11) {
                this.f3144p = obtainStyledAttributes.getResourceId(index, this.f3144p);
            } else if (index == 3) {
                this.f3145q = obtainStyledAttributes.getResourceId(index, this.f3145q);
            } else if (index == 6) {
                this.f3146r = obtainStyledAttributes.getResourceId(index, this.f3146r);
            } else if (index == 5) {
                this.f3147s = obtainStyledAttributes.getResourceId(index, this.f3147s);
            } else if (index == 2) {
                this.f3149u = obtainStyledAttributes.getResourceId(index, this.f3149u);
            } else if (index == 1) {
                this.f3148t = obtainStyledAttributes.getInteger(index, this.f3148t);
            }
        }
        obtainStyledAttributes.recycle();
    }

    public final String toString() {
        return "ViewTransition(" + f0.a.c(this.f3143o, this.f3130a) + ")";
    }
}
