package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.activity.r;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.a;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import f0.g;
import f0.n;
import f0.u;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import lib.zj.office.fc.openxml4j.opc.ContentTypes;
import lib.zj.office.fc.openxml4j.opc.PackagingURIHelper;
import org.xmlpull.v1.XmlPullParserException;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: MotionScene.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final MotionLayout f3067a;

    /* renamed from: b  reason: collision with root package name */
    public g0.e f3068b;
    public b c;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList<b> f3069d;

    /* renamed from: e  reason: collision with root package name */
    public b f3070e;

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList<b> f3071f;

    /* renamed from: g  reason: collision with root package name */
    public final SparseArray<androidx.constraintlayout.widget.a> f3072g;

    /* renamed from: h  reason: collision with root package name */
    public final HashMap<String, Integer> f3073h;

    /* renamed from: i  reason: collision with root package name */
    public final SparseIntArray f3074i;

    /* renamed from: j  reason: collision with root package name */
    public int f3075j;

    /* renamed from: k  reason: collision with root package name */
    public int f3076k;

    /* renamed from: l  reason: collision with root package name */
    public MotionEvent f3077l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f3078m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f3079n;

    /* renamed from: o  reason: collision with root package name */
    public MotionLayout.g f3080o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f3081p;

    /* renamed from: q  reason: collision with root package name */
    public final e f3082q;

    /* renamed from: r  reason: collision with root package name */
    public float f3083r;

    /* renamed from: s  reason: collision with root package name */
    public float f3084s;

    /* compiled from: MotionScene.java */
    /* renamed from: androidx.constraintlayout.motion.widget.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class animation.InterpolatorC0010a implements Interpolator {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b0.c f3085a;

        public animation.InterpolatorC0010a(b0.c cVar) {
            this.f3085a = cVar;
        }

        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f10) {
            return (float) this.f3085a.a(f10);
        }
    }

    public a(Context context, MotionLayout motionLayout, int i10) {
        int eventType;
        b bVar;
        this.f3068b = null;
        this.c = null;
        ArrayList<b> arrayList = new ArrayList<>();
        this.f3069d = arrayList;
        this.f3070e = null;
        this.f3071f = new ArrayList<>();
        this.f3072g = new SparseArray<>();
        this.f3073h = new HashMap<>();
        this.f3074i = new SparseIntArray();
        this.f3075j = 400;
        this.f3076k = 0;
        this.f3078m = false;
        this.f3079n = false;
        this.f3067a = motionLayout;
        this.f3082q = new e(motionLayout);
        XmlResourceParser xml = context.getResources().getXml(i10);
        try {
            eventType = xml.getEventType();
            bVar = null;
        } catch (IOException e10) {
            e10.printStackTrace();
        } catch (XmlPullParserException e11) {
            e11.printStackTrace();
        }
        while (true) {
            char c = 1;
            if (eventType != 1) {
                if (eventType != 0) {
                    if (eventType != 2) {
                        continue;
                    } else {
                        String name = xml.getName();
                        switch (name.hashCode()) {
                            case -1349929691:
                                if (name.equals("ConstraintSet")) {
                                    c = 5;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -1239391468:
                                if (name.equals("KeyFrameSet")) {
                                    c = '\b';
                                    break;
                                }
                                c = 65535;
                                break;
                            case -687739768:
                                if (name.equals("Include")) {
                                    c = 7;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 61998586:
                                if (name.equals("ViewTransition")) {
                                    c = '\t';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 269306229:
                                if (name.equals("Transition")) {
                                    break;
                                }
                                c = 65535;
                                break;
                            case 312750793:
                                if (name.equals("OnClick")) {
                                    c = 3;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 327855227:
                                if (name.equals("OnSwipe")) {
                                    c = 2;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 793277014:
                                if (name.equals("MotionScene")) {
                                    c = 0;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1382829617:
                                if (name.equals("StateSet")) {
                                    c = 4;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1942574248:
                                if (name.equals("include")) {
                                    c = 6;
                                    break;
                                }
                                c = 65535;
                                break;
                            default:
                                c = 65535;
                                break;
                        }
                        switch (c) {
                            case 0:
                                l(context, xml);
                                continue;
                            case 1:
                                bVar = new b(this, context, xml);
                                arrayList.add(bVar);
                                if (this.c == null && !bVar.f3087b) {
                                    this.c = bVar;
                                    androidx.constraintlayout.motion.widget.b bVar2 = bVar.f3096l;
                                    if (bVar2 != null) {
                                        bVar2.c(this.f3081p);
                                    }
                                }
                                if (bVar.f3087b) {
                                    if (bVar.c == -1) {
                                        this.f3070e = bVar;
                                    } else {
                                        this.f3071f.add(bVar);
                                    }
                                    arrayList.remove(bVar);
                                    continue;
                                } else {
                                    continue;
                                }
                            case 2:
                                if (bVar == null) {
                                    context.getResources().getResourceEntryName(i10);
                                    xml.getLineNumber();
                                }
                                if (bVar != null) {
                                    bVar.f3096l = new androidx.constraintlayout.motion.widget.b(context, this.f3067a, xml);
                                    continue;
                                } else {
                                    continue;
                                }
                            case 3:
                                if (bVar != null) {
                                    bVar.f3097m.add(new b.View$OnClickListenerC0011a(context, bVar, xml));
                                    continue;
                                } else {
                                    continue;
                                }
                            case 4:
                                this.f3068b = new g0.e(context, xml);
                                continue;
                            case 5:
                                i(context, xml);
                                continue;
                            case 6:
                            case 7:
                                k(context, xml);
                                continue;
                            case '\b':
                                g gVar = new g(context, xml);
                                if (bVar != null) {
                                    bVar.f3095k.add(gVar);
                                    continue;
                                } else {
                                    continue;
                                }
                            case '\t':
                                d dVar = new d(context, xml);
                                e eVar = this.f3082q;
                                eVar.f3163b.add(dVar);
                                eVar.c = null;
                                int i11 = dVar.f3131b;
                                if (i11 == 4) {
                                    ConstraintLayout.getSharedValues().a(dVar.f3149u, new u());
                                    continue;
                                } else if (i11 == 5) {
                                    ConstraintLayout.getSharedValues().a(dVar.f3149u, new u());
                                    continue;
                                } else {
                                    continue;
                                }
                            default:
                                continue;
                        }
                    }
                } else {
                    xml.getName();
                    continue;
                }
                eventType = xml.next();
            } else {
                this.f3072g.put(R.id.motion_base, new androidx.constraintlayout.widget.a());
                this.f3073h.put("motion_base", Integer.valueOf((int) R.id.motion_base));
                return;
            }
        }
    }

    public final boolean a(int i10, MotionLayout motionLayout) {
        boolean z10;
        boolean z11;
        if (this.f3080o != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return false;
        }
        Iterator<b> it = this.f3069d.iterator();
        while (it.hasNext()) {
            b next = it.next();
            int i11 = next.f3098n;
            if (i11 != 0) {
                b bVar = this.c;
                if (bVar == next) {
                    if ((bVar.f3102r & 2) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        continue;
                    }
                }
                if (i10 == next.f3088d && (i11 == 4 || i11 == 2)) {
                    MotionLayout.TransitionState transitionState = MotionLayout.TransitionState.FINISHED;
                    motionLayout.setState(transitionState);
                    motionLayout.setTransition(next);
                    if (next.f3098n == 4) {
                        motionLayout.H();
                        motionLayout.setState(MotionLayout.TransitionState.SETUP);
                        motionLayout.setState(MotionLayout.TransitionState.MOVING);
                    } else {
                        motionLayout.setProgress(1.0f);
                        motionLayout.u(true);
                        motionLayout.setState(MotionLayout.TransitionState.SETUP);
                        motionLayout.setState(MotionLayout.TransitionState.MOVING);
                        motionLayout.setState(transitionState);
                        motionLayout.B();
                    }
                    return true;
                } else if (i10 == next.c && (i11 == 3 || i11 == 1)) {
                    MotionLayout.TransitionState transitionState2 = MotionLayout.TransitionState.FINISHED;
                    motionLayout.setState(transitionState2);
                    motionLayout.setTransition(next);
                    if (next.f3098n == 3) {
                        motionLayout.s(0.0f);
                        motionLayout.setState(MotionLayout.TransitionState.SETUP);
                        motionLayout.setState(MotionLayout.TransitionState.MOVING);
                    } else {
                        motionLayout.setProgress(0.0f);
                        motionLayout.u(true);
                        motionLayout.setState(MotionLayout.TransitionState.SETUP);
                        motionLayout.setState(MotionLayout.TransitionState.MOVING);
                        motionLayout.setState(transitionState2);
                        motionLayout.B();
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final androidx.constraintlayout.widget.a b(int i10) {
        int a10;
        SparseArray<androidx.constraintlayout.widget.a> sparseArray = this.f3072g;
        g0.e eVar = this.f3068b;
        if (eVar != null && (a10 = eVar.a(i10)) != -1) {
            i10 = a10;
        }
        if (sparseArray.get(i10) == null) {
            f0.a.c(this.f3067a.getContext(), i10);
            return sparseArray.get(sparseArray.keyAt(0));
        }
        return sparseArray.get(i10);
    }

    public final int c() {
        b bVar = this.c;
        if (bVar != null) {
            return bVar.f3092h;
        }
        return this.f3075j;
    }

    public final int d(Context context, String str) {
        int i10;
        if (str.contains(PackagingURIHelper.FORWARD_SLASH_STRING)) {
            i10 = context.getResources().getIdentifier(str.substring(str.indexOf(47) + 1), FacebookMediationAdapter.KEY_ID, context.getPackageName());
        } else {
            i10 = -1;
        }
        if (i10 == -1 && str.length() > 1) {
            return Integer.parseInt(str.substring(1));
        }
        return i10;
    }

    public final Interpolator e() {
        b bVar = this.c;
        int i10 = bVar.f3089e;
        if (i10 != -2) {
            if (i10 != -1) {
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 4) {
                                if (i10 != 5) {
                                    if (i10 != 6) {
                                        return null;
                                    }
                                    return new AnticipateInterpolator();
                                }
                                return new OvershootInterpolator();
                            }
                            return new BounceInterpolator();
                        }
                        return new DecelerateInterpolator();
                    }
                    return new AccelerateInterpolator();
                }
                return new AccelerateDecelerateInterpolator();
            }
            return new animation.InterpolatorC0010a(b0.c.c(bVar.f3090f));
        }
        return AnimationUtils.loadInterpolator(this.f3067a.getContext(), this.c.f3091g);
    }

    public final void f(n nVar) {
        b bVar = this.c;
        if (bVar == null) {
            b bVar2 = this.f3070e;
            if (bVar2 != null) {
                Iterator<g> it = bVar2.f3095k.iterator();
                while (it.hasNext()) {
                    it.next().a(nVar);
                }
                return;
            }
            return;
        }
        Iterator<g> it2 = bVar.f3095k.iterator();
        while (it2.hasNext()) {
            it2.next().a(nVar);
        }
    }

    public final float g() {
        androidx.constraintlayout.motion.widget.b bVar;
        b bVar2 = this.c;
        if (bVar2 != null && (bVar = bVar2.f3096l) != null) {
            return bVar.f3123t;
        }
        return 0.0f;
    }

    public final int h() {
        b bVar = this.c;
        if (bVar == null) {
            return -1;
        }
        return bVar.f3088d;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final int i(Context context, XmlResourceParser xmlResourceParser) {
        boolean z10;
        boolean z11;
        androidx.constraintlayout.widget.a aVar = new androidx.constraintlayout.widget.a();
        aVar.f3368e = false;
        int attributeCount = xmlResourceParser.getAttributeCount();
        int i10 = -1;
        int i11 = -1;
        for (int i12 = 0; i12 < attributeCount; i12++) {
            String attributeName = xmlResourceParser.getAttributeName(i12);
            String attributeValue = xmlResourceParser.getAttributeValue(i12);
            attributeName.getClass();
            switch (attributeName.hashCode()) {
                case -1496482599:
                    if (attributeName.equals("deriveConstraintsFrom")) {
                        z10 = false;
                        break;
                    }
                    z10 = true;
                    break;
                case -1153153640:
                    if (attributeName.equals("constraintRotate")) {
                        z10 = true;
                        break;
                    }
                    z10 = true;
                    break;
                case 3355:
                    if (attributeName.equals(FacebookMediationAdapter.KEY_ID)) {
                        z10 = true;
                        break;
                    }
                    z10 = true;
                    break;
                default:
                    z10 = true;
                    break;
            }
            switch (z10) {
                case false:
                    i11 = d(context, attributeValue);
                    break;
                case true:
                    try {
                        aVar.c = Integer.parseInt(attributeValue);
                        break;
                    } catch (NumberFormatException unused) {
                        attributeValue.getClass();
                        switch (attributeValue.hashCode()) {
                            case -768416914:
                                if (attributeValue.equals("x_left")) {
                                    z11 = false;
                                    break;
                                }
                                z11 = true;
                                break;
                            case 3317767:
                                if (attributeValue.equals("left")) {
                                    z11 = true;
                                    break;
                                }
                                z11 = true;
                                break;
                            case 3387192:
                                if (attributeValue.equals("none")) {
                                    z11 = true;
                                    break;
                                }
                                z11 = true;
                                break;
                            case 108511772:
                                if (attributeValue.equals("right")) {
                                    z11 = true;
                                    break;
                                }
                                z11 = true;
                                break;
                            case 1954540437:
                                if (attributeValue.equals("x_right")) {
                                    z11 = true;
                                    break;
                                }
                                z11 = true;
                                break;
                            default:
                                z11 = true;
                                break;
                        }
                        switch (z11) {
                            case false:
                                aVar.c = 4;
                                continue;
                            case true:
                                aVar.c = 2;
                                continue;
                            case true:
                                aVar.c = 0;
                                continue;
                            case true:
                                aVar.c = 1;
                                continue;
                            case true:
                                aVar.c = 3;
                                continue;
                        }
                    }
                case true:
                    i10 = d(context, attributeValue);
                    int indexOf = attributeValue.indexOf(47);
                    if (indexOf >= 0) {
                        attributeValue = attributeValue.substring(indexOf + 1);
                    }
                    this.f3073h.put(attributeValue, Integer.valueOf(i10));
                    aVar.f3365a = f0.a.c(context, i10);
                    break;
            }
        }
        if (i10 != -1) {
            int i13 = this.f3067a.K;
            aVar.n(context, xmlResourceParser);
            if (i11 != -1) {
                this.f3074i.put(i10, i11);
            }
            this.f3072g.put(i10, aVar);
        }
        return i10;
    }

    public final int j(Context context, int i10) {
        XmlResourceParser xml = context.getResources().getXml(i10);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                String name = xml.getName();
                if (2 == eventType && "ConstraintSet".equals(name)) {
                    return i(context, xml);
                }
            }
            return -1;
        } catch (IOException e10) {
            e10.printStackTrace();
            return -1;
        } catch (XmlPullParserException e11) {
            e11.printStackTrace();
            return -1;
        }
    }

    public final void k(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), g0.d.G);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = obtainStyledAttributes.getIndex(i10);
            if (index == 0) {
                j(context, obtainStyledAttributes.getResourceId(index, -1));
            }
        }
        obtainStyledAttributes.recycle();
    }

    public final void l(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), g0.d.f17359v);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = obtainStyledAttributes.getIndex(i10);
            if (index == 0) {
                int i11 = obtainStyledAttributes.getInt(index, this.f3075j);
                this.f3075j = i11;
                if (i11 < 8) {
                    this.f3075j = 8;
                }
            } else if (index == 1) {
                this.f3076k = obtainStyledAttributes.getInteger(index, 0);
            }
        }
        obtainStyledAttributes.recycle();
    }

    public final void m(int i10, MotionLayout motionLayout) {
        SparseArray<androidx.constraintlayout.widget.a> sparseArray = this.f3072g;
        androidx.constraintlayout.widget.a aVar = sparseArray.get(i10);
        aVar.f3366b = aVar.f3365a;
        int i11 = this.f3074i.get(i10);
        HashMap<Integer, a.C0012a> hashMap = aVar.f3369f;
        if (i11 > 0) {
            m(i11, motionLayout);
            androidx.constraintlayout.widget.a aVar2 = sparseArray.get(i11);
            if (aVar2 == null) {
                f0.a.c(this.f3067a.getContext(), i11);
                return;
            }
            aVar.f3366b += PackagingURIHelper.FORWARD_SLASH_STRING + aVar2.f3366b;
            HashMap<Integer, a.C0012a> hashMap2 = aVar2.f3369f;
            for (Integer num : hashMap2.keySet()) {
                int intValue = num.intValue();
                a.C0012a c0012a = hashMap2.get(num);
                if (!hashMap.containsKey(Integer.valueOf(intValue))) {
                    hashMap.put(Integer.valueOf(intValue), new a.C0012a());
                }
                a.C0012a c0012a2 = hashMap.get(Integer.valueOf(intValue));
                if (c0012a2 != null) {
                    a.b bVar = c0012a2.f3373e;
                    if (!bVar.f3391b) {
                        bVar.a(c0012a.f3373e);
                    }
                    a.d dVar = c0012a2.c;
                    if (!dVar.f3443a) {
                        a.d dVar2 = c0012a.c;
                        dVar.f3443a = dVar2.f3443a;
                        dVar.f3444b = dVar2.f3444b;
                        dVar.f3445d = dVar2.f3445d;
                        dVar.f3446e = dVar2.f3446e;
                        dVar.c = dVar2.c;
                    }
                    a.e eVar = c0012a2.f3374f;
                    if (!eVar.f3448a) {
                        eVar.a(c0012a.f3374f);
                    }
                    a.c cVar = c0012a2.f3372d;
                    if (!cVar.f3431a) {
                        cVar.a(c0012a.f3372d);
                    }
                    for (String str : c0012a.f3375g.keySet()) {
                        if (!c0012a2.f3375g.containsKey(str)) {
                            c0012a2.f3375g.put(str, c0012a.f3375g.get(str));
                        }
                    }
                }
            }
        } else {
            aVar.f3366b = r.g(new StringBuilder(), aVar.f3366b, "  layout");
            int childCount = motionLayout.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = motionLayout.getChildAt(i12);
                ConstraintLayout.b bVar2 = (ConstraintLayout.b) childAt.getLayoutParams();
                int id2 = childAt.getId();
                if (aVar.f3368e && id2 == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (!hashMap.containsKey(Integer.valueOf(id2))) {
                    hashMap.put(Integer.valueOf(id2), new a.C0012a());
                }
                a.C0012a c0012a3 = hashMap.get(Integer.valueOf(id2));
                if (c0012a3 != null) {
                    a.b bVar3 = c0012a3.f3373e;
                    if (!bVar3.f3391b) {
                        c0012a3.c(id2, bVar2);
                        if (childAt instanceof ConstraintHelper) {
                            bVar3.f3407j0 = ((ConstraintHelper) childAt).getReferencedIds();
                            if (childAt instanceof Barrier) {
                                Barrier barrier = (Barrier) childAt;
                                bVar3.f3417o0 = barrier.getAllowsGoneWidget();
                                bVar3.f3401g0 = barrier.getType();
                                bVar3.f3403h0 = barrier.getMargin();
                            }
                        }
                        bVar3.f3391b = true;
                    }
                    a.d dVar3 = c0012a3.c;
                    if (!dVar3.f3443a) {
                        dVar3.f3444b = childAt.getVisibility();
                        dVar3.f3445d = childAt.getAlpha();
                        dVar3.f3443a = true;
                    }
                    a.e eVar2 = c0012a3.f3374f;
                    if (!eVar2.f3448a) {
                        eVar2.f3448a = true;
                        eVar2.f3449b = childAt.getRotation();
                        eVar2.c = childAt.getRotationX();
                        eVar2.f3450d = childAt.getRotationY();
                        eVar2.f3451e = childAt.getScaleX();
                        eVar2.f3452f = childAt.getScaleY();
                        float pivotX = childAt.getPivotX();
                        float pivotY = childAt.getPivotY();
                        if (pivotX != 0.0d || pivotY != 0.0d) {
                            eVar2.f3453g = pivotX;
                            eVar2.f3454h = pivotY;
                        }
                        eVar2.f3456j = childAt.getTranslationX();
                        eVar2.f3457k = childAt.getTranslationY();
                        eVar2.f3458l = childAt.getTranslationZ();
                        if (eVar2.f3459m) {
                            eVar2.f3460n = childAt.getElevation();
                        }
                    }
                }
            }
        }
        for (a.C0012a c0012a4 : hashMap.values()) {
            if (c0012a4.f3376h != null) {
                if (c0012a4.f3371b != null) {
                    for (Integer num2 : hashMap.keySet()) {
                        a.C0012a l10 = aVar.l(num2.intValue());
                        String str2 = l10.f3373e.f3411l0;
                        if (str2 != null && c0012a4.f3371b.matches(str2)) {
                            c0012a4.f3376h.e(l10);
                            l10.f3375g.putAll((HashMap) c0012a4.f3375g.clone());
                        }
                    }
                } else {
                    c0012a4.f3376h.e(aVar.l(c0012a4.f3370a));
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0013, code lost:
        if (r2 != (-1)) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n(int r9, int r10) {
        /*
            r8 = this;
            g0.e r0 = r8.f3068b
            r1 = -1
            if (r0 == 0) goto L16
            int r0 = r0.a(r9)
            if (r0 == r1) goto Lc
            goto Ld
        Lc:
            r0 = r9
        Ld:
            g0.e r2 = r8.f3068b
            int r2 = r2.a(r10)
            if (r2 == r1) goto L17
            goto L18
        L16:
            r0 = r9
        L17:
            r2 = r10
        L18:
            androidx.constraintlayout.motion.widget.a$b r3 = r8.c
            if (r3 == 0) goto L25
            int r4 = r3.c
            if (r4 != r10) goto L25
            int r3 = r3.f3088d
            if (r3 != r9) goto L25
            return
        L25:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.a$b> r3 = r8.f3069d
            java.util.Iterator r4 = r3.iterator()
        L2b:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L51
            java.lang.Object r5 = r4.next()
            androidx.constraintlayout.motion.widget.a$b r5 = (androidx.constraintlayout.motion.widget.a.b) r5
            int r6 = r5.c
            if (r6 != r2) goto L3f
            int r7 = r5.f3088d
            if (r7 == r0) goto L45
        L3f:
            if (r6 != r10) goto L2b
            int r6 = r5.f3088d
            if (r6 != r9) goto L2b
        L45:
            r8.c = r5
            androidx.constraintlayout.motion.widget.b r9 = r5.f3096l
            if (r9 == 0) goto L50
            boolean r10 = r8.f3081p
            r9.c(r10)
        L50:
            return
        L51:
            androidx.constraintlayout.motion.widget.a$b r9 = r8.f3070e
            java.util.ArrayList<androidx.constraintlayout.motion.widget.a$b> r4 = r8.f3071f
            java.util.Iterator r4 = r4.iterator()
        L59:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L6b
            java.lang.Object r5 = r4.next()
            androidx.constraintlayout.motion.widget.a$b r5 = (androidx.constraintlayout.motion.widget.a.b) r5
            int r6 = r5.c
            if (r6 != r10) goto L59
            r9 = r5
            goto L59
        L6b:
            androidx.constraintlayout.motion.widget.a$b r10 = new androidx.constraintlayout.motion.widget.a$b
            r10.<init>(r8, r9)
            r10.f3088d = r0
            r10.c = r2
            if (r0 == r1) goto L79
            r3.add(r10)
        L79:
            r8.c = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.a.n(int, int):void");
    }

    public final boolean o() {
        Iterator<b> it = this.f3069d.iterator();
        while (it.hasNext()) {
            if (it.next().f3096l != null) {
                return true;
            }
        }
        b bVar = this.c;
        if (bVar != null && bVar.f3096l != null) {
            return true;
        }
        return false;
    }

    /* compiled from: MotionScene.java */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f3086a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f3087b;
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public int f3088d;

        /* renamed from: e  reason: collision with root package name */
        public int f3089e;

        /* renamed from: f  reason: collision with root package name */
        public String f3090f;

        /* renamed from: g  reason: collision with root package name */
        public int f3091g;

        /* renamed from: h  reason: collision with root package name */
        public int f3092h;

        /* renamed from: i  reason: collision with root package name */
        public float f3093i;

        /* renamed from: j  reason: collision with root package name */
        public final a f3094j;

        /* renamed from: k  reason: collision with root package name */
        public final ArrayList<g> f3095k;

        /* renamed from: l  reason: collision with root package name */
        public androidx.constraintlayout.motion.widget.b f3096l;

        /* renamed from: m  reason: collision with root package name */
        public final ArrayList<View$OnClickListenerC0011a> f3097m;

        /* renamed from: n  reason: collision with root package name */
        public int f3098n;

        /* renamed from: o  reason: collision with root package name */
        public boolean f3099o;

        /* renamed from: p  reason: collision with root package name */
        public int f3100p;

        /* renamed from: q  reason: collision with root package name */
        public int f3101q;

        /* renamed from: r  reason: collision with root package name */
        public int f3102r;

        /* compiled from: MotionScene.java */
        /* renamed from: androidx.constraintlayout.motion.widget.a$b$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class View$OnClickListenerC0011a implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            public final b f3103a;

            /* renamed from: b  reason: collision with root package name */
            public final int f3104b;
            public final int c;

            public View$OnClickListenerC0011a(Context context, b bVar, XmlResourceParser xmlResourceParser) {
                this.f3104b = -1;
                this.c = 17;
                this.f3103a = bVar;
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), g0.d.f17361x);
                int indexCount = obtainStyledAttributes.getIndexCount();
                for (int i10 = 0; i10 < indexCount; i10++) {
                    int index = obtainStyledAttributes.getIndex(i10);
                    if (index == 1) {
                        this.f3104b = obtainStyledAttributes.getResourceId(index, this.f3104b);
                    } else if (index == 0) {
                        this.c = obtainStyledAttributes.getInt(index, this.c);
                    }
                }
                obtainStyledAttributes.recycle();
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r8v2, types: [android.view.View] */
            public final void a(MotionLayout motionLayout, int i10, b bVar) {
                boolean z10;
                boolean z11;
                boolean z12;
                boolean z13;
                int i11 = this.f3104b;
                MotionLayout motionLayout2 = motionLayout;
                if (i11 != -1) {
                    motionLayout2 = motionLayout.findViewById(i11);
                }
                if (motionLayout2 == null) {
                    return;
                }
                int i12 = bVar.f3088d;
                int i13 = bVar.c;
                if (i12 == -1) {
                    motionLayout2.setOnClickListener(this);
                    return;
                }
                int i14 = this.c;
                int i15 = i14 & 1;
                boolean z14 = true;
                if (i15 != 0 && i10 == i12) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((i14 & 256) != 0 && i10 == i12) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                boolean z15 = z10 | z11;
                if (i15 != 0 && i10 == i12) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                boolean z16 = z12 | z15;
                if ((i14 & 16) != 0 && i10 == i13) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                boolean z17 = z16 | z13;
                if ((i14 & 4096) == 0 || i10 != i13) {
                    z14 = false;
                }
                if (z17 | z14) {
                    motionLayout2.setOnClickListener(this);
                }
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                boolean z10;
                boolean z11;
                boolean z12;
                int i10;
                b bVar = this.f3103a;
                a aVar = bVar.f3094j;
                MotionLayout motionLayout = aVar.f3067a;
                if (!motionLayout.f3033z) {
                    return;
                }
                if (bVar.f3088d == -1) {
                    int currentState = motionLayout.getCurrentState();
                    if (currentState == -1) {
                        int i11 = bVar.c;
                        if (!motionLayout.isAttachedToWindow()) {
                            if (motionLayout.f3024u0 == null) {
                                motionLayout.f3024u0 = new MotionLayout.h();
                            }
                            motionLayout.f3024u0.f3065d = i11;
                            return;
                        }
                        motionLayout.I(i11, -1);
                        return;
                    }
                    b bVar2 = new b(bVar.f3094j, bVar);
                    bVar2.f3088d = currentState;
                    bVar2.c = bVar.c;
                    motionLayout.setTransition(bVar2);
                    motionLayout.H();
                    return;
                }
                b bVar3 = aVar.c;
                int i12 = this.c;
                int i13 = i12 & 1;
                boolean z13 = true;
                if (i13 == 0 && (i12 & 256) == 0) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                int i14 = i12 & 16;
                if (i14 == 0 && (i12 & 4096) == 0) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (z10 && z11) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    if (bVar3 != bVar) {
                        motionLayout.setTransition(bVar);
                    }
                    if (motionLayout.getCurrentState() != motionLayout.getEndState() && motionLayout.getProgress() <= 0.5f) {
                        z11 = false;
                    } else {
                        z10 = false;
                    }
                }
                if (bVar != bVar3) {
                    int i15 = bVar.c;
                    int i16 = bVar.f3088d;
                    if (i16 != -1 ? !((i10 = motionLayout.f3025v) == i16 || i10 == i15) : motionLayout.f3025v == i15) {
                        z13 = false;
                    }
                }
                if (z13) {
                    if (z10 && i13 != 0) {
                        motionLayout.setTransition(bVar);
                        motionLayout.H();
                    } else if (z11 && i14 != 0) {
                        motionLayout.setTransition(bVar);
                        motionLayout.s(0.0f);
                    } else if (z10 && (i12 & 256) != 0) {
                        motionLayout.setTransition(bVar);
                        motionLayout.setProgress(1.0f);
                    } else if (z11 && (i12 & 4096) != 0) {
                        motionLayout.setTransition(bVar);
                        motionLayout.setProgress(0.0f);
                    }
                }
            }
        }

        public b(a aVar, b bVar) {
            this.f3086a = -1;
            this.f3087b = false;
            this.c = -1;
            this.f3088d = -1;
            this.f3089e = 0;
            this.f3090f = null;
            this.f3091g = -1;
            this.f3092h = 400;
            this.f3093i = 0.0f;
            this.f3095k = new ArrayList<>();
            this.f3096l = null;
            this.f3097m = new ArrayList<>();
            this.f3098n = 0;
            this.f3099o = false;
            this.f3100p = -1;
            this.f3101q = 0;
            this.f3102r = 0;
            this.f3094j = aVar;
            this.f3092h = aVar.f3075j;
            if (bVar != null) {
                this.f3100p = bVar.f3100p;
                this.f3089e = bVar.f3089e;
                this.f3090f = bVar.f3090f;
                this.f3091g = bVar.f3091g;
                this.f3092h = bVar.f3092h;
                this.f3095k = bVar.f3095k;
                this.f3093i = bVar.f3093i;
                this.f3101q = bVar.f3101q;
            }
        }

        public b(a aVar, int i10) {
            this.f3086a = -1;
            this.f3087b = false;
            this.c = -1;
            this.f3088d = -1;
            this.f3089e = 0;
            this.f3090f = null;
            this.f3091g = -1;
            this.f3092h = 400;
            this.f3093i = 0.0f;
            this.f3095k = new ArrayList<>();
            this.f3096l = null;
            this.f3097m = new ArrayList<>();
            this.f3098n = 0;
            this.f3099o = false;
            this.f3100p = -1;
            this.f3101q = 0;
            this.f3102r = 0;
            this.f3086a = -1;
            this.f3094j = aVar;
            this.f3088d = R.id.view_transition;
            this.c = i10;
            this.f3092h = aVar.f3075j;
            this.f3101q = aVar.f3076k;
        }

        public b(a aVar, Context context, XmlResourceParser xmlResourceParser) {
            this.f3086a = -1;
            this.f3087b = false;
            this.c = -1;
            this.f3088d = -1;
            this.f3089e = 0;
            this.f3090f = null;
            this.f3091g = -1;
            this.f3092h = 400;
            this.f3093i = 0.0f;
            this.f3095k = new ArrayList<>();
            this.f3096l = null;
            this.f3097m = new ArrayList<>();
            this.f3098n = 0;
            this.f3099o = false;
            this.f3100p = -1;
            this.f3101q = 0;
            this.f3102r = 0;
            this.f3092h = aVar.f3075j;
            this.f3101q = aVar.f3076k;
            this.f3094j = aVar;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), g0.d.D);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                SparseArray<androidx.constraintlayout.widget.a> sparseArray = aVar.f3072g;
                if (index == 2) {
                    this.c = obtainStyledAttributes.getResourceId(index, -1);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.c);
                    if ("layout".equals(resourceTypeName)) {
                        androidx.constraintlayout.widget.a aVar2 = new androidx.constraintlayout.widget.a();
                        aVar2.m(context, this.c);
                        sparseArray.append(this.c, aVar2);
                    } else if (ContentTypes.EXTENSION_XML.equals(resourceTypeName)) {
                        this.c = aVar.j(context, this.c);
                    }
                } else if (index == 3) {
                    this.f3088d = obtainStyledAttributes.getResourceId(index, this.f3088d);
                    String resourceTypeName2 = context.getResources().getResourceTypeName(this.f3088d);
                    if ("layout".equals(resourceTypeName2)) {
                        androidx.constraintlayout.widget.a aVar3 = new androidx.constraintlayout.widget.a();
                        aVar3.m(context, this.f3088d);
                        sparseArray.append(this.f3088d, aVar3);
                    } else if (ContentTypes.EXTENSION_XML.equals(resourceTypeName2)) {
                        this.f3088d = aVar.j(context, this.f3088d);
                    }
                } else if (index == 6) {
                    int i11 = obtainStyledAttributes.peekValue(index).type;
                    if (i11 == 1) {
                        int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                        this.f3091g = resourceId;
                        if (resourceId != -1) {
                            this.f3089e = -2;
                        }
                    } else if (i11 == 3) {
                        String string = obtainStyledAttributes.getString(index);
                        this.f3090f = string;
                        if (string != null) {
                            if (string.indexOf(PackagingURIHelper.FORWARD_SLASH_STRING) > 0) {
                                this.f3091g = obtainStyledAttributes.getResourceId(index, -1);
                                this.f3089e = -2;
                            } else {
                                this.f3089e = -1;
                            }
                        }
                    } else {
                        this.f3089e = obtainStyledAttributes.getInteger(index, this.f3089e);
                    }
                } else if (index == 4) {
                    int i12 = obtainStyledAttributes.getInt(index, this.f3092h);
                    this.f3092h = i12;
                    if (i12 < 8) {
                        this.f3092h = 8;
                    }
                } else if (index == 8) {
                    this.f3093i = obtainStyledAttributes.getFloat(index, this.f3093i);
                } else if (index == 1) {
                    this.f3098n = obtainStyledAttributes.getInteger(index, this.f3098n);
                } else if (index == 0) {
                    this.f3086a = obtainStyledAttributes.getResourceId(index, this.f3086a);
                } else if (index == 9) {
                    this.f3099o = obtainStyledAttributes.getBoolean(index, this.f3099o);
                } else if (index == 7) {
                    this.f3100p = obtainStyledAttributes.getInteger(index, -1);
                } else if (index == 5) {
                    this.f3101q = obtainStyledAttributes.getInteger(index, 0);
                } else if (index == 10) {
                    this.f3102r = obtainStyledAttributes.getInteger(index, 0);
                }
            }
            if (this.f3088d == -1) {
                this.f3087b = true;
            }
            obtainStyledAttributes.recycle();
        }
    }
}
