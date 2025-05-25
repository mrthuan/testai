package com.airbnb.lottie;

import android.animation.Animator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.activity.s;
import androidx.appcompat.widget.AppCompatImageView;
import e3.f;
import e3.h;
import e3.i;
import e3.j;
import e3.k;
import e3.m;
import e3.n;
import e3.o;
import e3.r;
import e3.t;
import e3.u;
import e3.v;
import java.io.ByteArrayInputStream;
import java.io.InterruptedIOException;
import java.lang.ref.WeakReference;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import javax.net.ssl.SSLException;
import p3.g;
import pdf.pdfreader.viewer.editor.free.R;

/* loaded from: classes.dex */
public class LottieAnimationView extends AppCompatImageView {

    /* renamed from: v  reason: collision with root package name */
    public static final a f6013v = new a();

    /* renamed from: d  reason: collision with root package name */
    public final b f6014d;

    /* renamed from: e  reason: collision with root package name */
    public final c f6015e;

    /* renamed from: f  reason: collision with root package name */
    public m<Throwable> f6016f;

    /* renamed from: g  reason: collision with root package name */
    public int f6017g;

    /* renamed from: h  reason: collision with root package name */
    public final k f6018h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f6019i;

    /* renamed from: j  reason: collision with root package name */
    public String f6020j;

    /* renamed from: k  reason: collision with root package name */
    public int f6021k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f6022l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f6023m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f6024n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f6025o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f6026p;

    /* renamed from: q  reason: collision with root package name */
    public RenderMode f6027q;

    /* renamed from: r  reason: collision with root package name */
    public final HashSet f6028r;

    /* renamed from: s  reason: collision with root package name */
    public int f6029s;

    /* renamed from: t  reason: collision with root package name */
    public r<e3.e> f6030t;

    /* renamed from: u  reason: collision with root package name */
    public e3.e f6031u;

    /* loaded from: classes.dex */
    public class a implements m<Throwable> {
        @Override // e3.m
        public final void onResult(Throwable th2) {
            boolean z10;
            Throwable th3 = th2;
            g.a aVar = g.f23679a;
            if (!(th3 instanceof SocketException) && !(th3 instanceof ClosedChannelException) && !(th3 instanceof InterruptedIOException) && !(th3 instanceof ProtocolException) && !(th3 instanceof SSLException) && !(th3 instanceof UnknownHostException) && !(th3 instanceof UnknownServiceException)) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                p3.c.f23668a.getClass();
                HashSet hashSet = p3.b.f23667a;
                if (!hashSet.contains("Unable to load composition.")) {
                    hashSet.add("Unable to load composition.");
                    return;
                }
                return;
            }
            throw new IllegalStateException("Unable to parse composition", th3);
        }
    }

    /* loaded from: classes.dex */
    public class b implements m<e3.e> {
        public b() {
        }

        @Override // e3.m
        public final void onResult(e3.e eVar) {
            LottieAnimationView.this.setComposition(eVar);
        }
    }

    /* loaded from: classes.dex */
    public class c implements m<Throwable> {
        public c() {
        }

        @Override // e3.m
        public final void onResult(Throwable th2) {
            Throwable th3 = th2;
            LottieAnimationView lottieAnimationView = LottieAnimationView.this;
            int i10 = lottieAnimationView.f6017g;
            if (i10 != 0) {
                lottieAnimationView.setImageResource(i10);
            }
            m mVar = lottieAnimationView.f6016f;
            if (mVar == null) {
                mVar = LottieAnimationView.f6013v;
            }
            mVar.onResult(th3);
        }
    }

    /* loaded from: classes.dex */
    public static /* synthetic */ class d {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f6034a;

        static {
            int[] iArr = new int[RenderMode.values().length];
            f6034a = iArr;
            try {
                iArr[RenderMode.HARDWARE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6034a[RenderMode.SOFTWARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6034a[RenderMode.AUTOMATIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static class e extends View.BaseSavedState {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        public String f6035a;

        /* renamed from: b  reason: collision with root package name */
        public int f6036b;
        public float c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f6037d;

        /* renamed from: e  reason: collision with root package name */
        public String f6038e;

        /* renamed from: f  reason: collision with root package name */
        public int f6039f;

        /* renamed from: g  reason: collision with root package name */
        public int f6040g;

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<e> {
            @Override // android.os.Parcelable.Creator
            public final e createFromParcel(Parcel parcel) {
                return new e(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final e[] newArray(int i10) {
                return new e[i10];
            }
        }

        public e(Parcel parcel) {
            super(parcel);
            this.f6035a = parcel.readString();
            this.c = parcel.readFloat();
            this.f6037d = parcel.readInt() == 1;
            this.f6038e = parcel.readString();
            this.f6039f = parcel.readInt();
            this.f6040g = parcel.readInt();
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeString(this.f6035a);
            parcel.writeFloat(this.c);
            parcel.writeInt(this.f6037d ? 1 : 0);
            parcel.writeString(this.f6038e);
            parcel.writeInt(this.f6039f);
            parcel.writeInt(this.f6040g);
        }
    }

    public LottieAnimationView(Context context) {
        super(context);
        this.f6014d = new b();
        this.f6015e = new c();
        this.f6017g = 0;
        this.f6018h = new k();
        this.f6022l = false;
        this.f6023m = false;
        this.f6024n = false;
        this.f6025o = false;
        this.f6026p = true;
        this.f6027q = RenderMode.AUTOMATIC;
        this.f6028r = new HashSet();
        this.f6029s = 0;
        g(null, R.attr.lottieAnimationViewStyle);
    }

    private void setCompositionTask(r<e3.e> rVar) {
        this.f6031u = null;
        this.f6018h.c();
        e();
        b bVar = this.f6014d;
        synchronized (rVar) {
            if (rVar.f16445d != null && rVar.f16445d.f16439a != null) {
                bVar.onResult(rVar.f16445d.f16439a);
            }
            rVar.f16443a.add(bVar);
        }
        rVar.b(this.f6015e);
        this.f6030t = rVar;
    }

    @Override // android.view.View
    public final void buildDrawingCache(boolean z10) {
        this.f6029s++;
        super.buildDrawingCache(z10);
        if (this.f6029s == 1 && getWidth() > 0 && getHeight() > 0 && getLayerType() == 1 && getDrawingCache(z10) == null) {
            setRenderMode(RenderMode.HARDWARE);
        }
        this.f6029s--;
        s.y();
    }

    public final void c(Animator.AnimatorListener animatorListener) {
        this.f6018h.c.addListener(animatorListener);
    }

    public final void d() {
        this.f6024n = false;
        this.f6023m = false;
        this.f6022l = false;
        k kVar = this.f6018h;
        kVar.f16373g.clear();
        kVar.c.cancel();
        f();
    }

    public final void e() {
        r<e3.e> rVar = this.f6030t;
        if (rVar != null) {
            b bVar = this.f6014d;
            synchronized (rVar) {
                rVar.f16443a.remove(bVar);
            }
            this.f6030t.c(this.f6015e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0039, code lost:
        if (r3 != false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f() {
        /*
            r6 = this;
            int[] r0 = com.airbnb.lottie.LottieAnimationView.d.f6034a
            com.airbnb.lottie.RenderMode r1 = r6.f6027q
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 2
            r2 = 1
            if (r0 == r2) goto L3b
            if (r0 == r1) goto L13
            r3 = 3
            if (r0 == r3) goto L15
        L13:
            r1 = r2
            goto L3b
        L15:
            e3.e r0 = r6.f6031u
            r3 = 0
            if (r0 == 0) goto L25
            boolean r4 = r0.f16353n
            if (r4 == 0) goto L25
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 28
            if (r4 >= r5) goto L25
            goto L39
        L25:
            if (r0 == 0) goto L2d
            int r0 = r0.f16354o
            r4 = 4
            if (r0 <= r4) goto L2d
            goto L39
        L2d:
            int r0 = android.os.Build.VERSION.SDK_INT
            r4 = 24
            if (r0 == r4) goto L39
            r4 = 25
            if (r0 != r4) goto L38
            goto L39
        L38:
            r3 = r2
        L39:
            if (r3 == 0) goto L13
        L3b:
            int r0 = r6.getLayerType()
            if (r1 == r0) goto L45
            r0 = 0
            r6.setLayerType(r1, r0)
        L45:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.LottieAnimationView.f():void");
    }

    public final void g(AttributeSet attributeSet, int i10) {
        String string;
        boolean z10 = false;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, t.f16449a, i10, 0);
        this.f6026p = obtainStyledAttributes.getBoolean(1, true);
        boolean hasValue = obtainStyledAttributes.hasValue(9);
        boolean hasValue2 = obtainStyledAttributes.hasValue(5);
        boolean hasValue3 = obtainStyledAttributes.hasValue(15);
        if (hasValue && hasValue2) {
            throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
        }
        if (hasValue) {
            int resourceId = obtainStyledAttributes.getResourceId(9, 0);
            if (resourceId != 0) {
                setAnimation(resourceId);
            }
        } else if (hasValue2) {
            String string2 = obtainStyledAttributes.getString(5);
            if (string2 != null) {
                setAnimation(string2);
            }
        } else if (hasValue3 && (string = obtainStyledAttributes.getString(15)) != null) {
            setAnimationFromUrl(string);
        }
        setFallbackResource(obtainStyledAttributes.getResourceId(4, 0));
        if (obtainStyledAttributes.getBoolean(0, false)) {
            this.f6024n = true;
            this.f6025o = true;
        }
        boolean z11 = obtainStyledAttributes.getBoolean(7, false);
        k kVar = this.f6018h;
        if (z11) {
            kVar.c.setRepeatCount(-1);
        }
        if (obtainStyledAttributes.hasValue(12)) {
            setRepeatMode(obtainStyledAttributes.getInt(12, 1));
        }
        if (obtainStyledAttributes.hasValue(11)) {
            setRepeatCount(obtainStyledAttributes.getInt(11, -1));
        }
        if (obtainStyledAttributes.hasValue(14)) {
            setSpeed(obtainStyledAttributes.getFloat(14, 1.0f));
        }
        setImageAssetsFolder(obtainStyledAttributes.getString(6));
        setProgress(obtainStyledAttributes.getFloat(8, 0.0f));
        boolean z12 = obtainStyledAttributes.getBoolean(3, false);
        if (kVar.f16378l != z12) {
            kVar.f16378l = z12;
            if (kVar.f16369b != null) {
                kVar.b();
            }
        }
        if (obtainStyledAttributes.hasValue(2)) {
            kVar.a(new j3.d("**"), o.C, new n3.a(new u(obtainStyledAttributes.getColor(2, 0))));
        }
        if (obtainStyledAttributes.hasValue(13)) {
            kVar.f16370d = obtainStyledAttributes.getFloat(13, 1.0f);
            kVar.q();
        }
        if (obtainStyledAttributes.hasValue(10)) {
            RenderMode renderMode = RenderMode.AUTOMATIC;
            int i11 = obtainStyledAttributes.getInt(10, renderMode.ordinal());
            if (i11 >= RenderMode.values().length) {
                i11 = renderMode.ordinal();
            }
            setRenderMode(RenderMode.values()[i11]);
        }
        if (getScaleType() != null) {
            kVar.f16374h = getScaleType();
        }
        obtainStyledAttributes.recycle();
        Context context = getContext();
        g.a aVar = g.f23679a;
        if (Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f) != 0.0f) {
            z10 = true;
        }
        kVar.f16371e = Boolean.valueOf(z10).booleanValue();
        f();
        this.f6019i = true;
    }

    public e3.e getComposition() {
        return this.f6031u;
    }

    public long getDuration() {
        e3.e eVar = this.f6031u;
        if (eVar != null) {
            return eVar.b();
        }
        return 0L;
    }

    public int getFrame() {
        return (int) this.f6018h.c.f23671f;
    }

    public String getImageAssetsFolder() {
        return this.f6018h.f16376j;
    }

    public float getMaxFrame() {
        return this.f6018h.c.d();
    }

    public float getMinFrame() {
        return this.f6018h.c.e();
    }

    public e3.s getPerformanceTracker() {
        e3.e eVar = this.f6018h.f16369b;
        if (eVar != null) {
            return eVar.f16341a;
        }
        return null;
    }

    public float getProgress() {
        p3.d dVar = this.f6018h.c;
        e3.e eVar = dVar.f23675j;
        if (eVar == null) {
            return 0.0f;
        }
        float f10 = dVar.f23671f;
        float f11 = eVar.f16350k;
        return (f10 - f11) / (eVar.f16351l - f11);
    }

    public int getRepeatCount() {
        return this.f6018h.c.getRepeatCount();
    }

    public int getRepeatMode() {
        return this.f6018h.c.getRepeatMode();
    }

    public float getScale() {
        return this.f6018h.f16370d;
    }

    public float getSpeed() {
        return this.f6018h.c.c;
    }

    public final boolean h() {
        p3.d dVar = this.f6018h.c;
        if (dVar == null) {
            return false;
        }
        return dVar.f23676k;
    }

    public final void i() {
        this.f6025o = false;
        this.f6024n = false;
        this.f6023m = false;
        this.f6022l = false;
        k kVar = this.f6018h;
        kVar.f16373g.clear();
        kVar.c.g(true);
        f();
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        k kVar = this.f6018h;
        if (drawable2 == kVar) {
            super.invalidateDrawable(kVar);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    public final void j() {
        if (isShown()) {
            this.f6018h.e();
            f();
            return;
        }
        this.f6022l = true;
    }

    public final void k(int i10, int i11) {
        this.f6018h.k(i10, i11);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isInEditMode()) {
            if (this.f6025o || this.f6024n) {
                j();
                this.f6025o = false;
                this.f6024n = false;
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        if (h()) {
            d();
            this.f6024n = true;
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof e)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        e eVar = (e) parcelable;
        super.onRestoreInstanceState(eVar.getSuperState());
        String str = eVar.f6035a;
        this.f6020j = str;
        if (!TextUtils.isEmpty(str)) {
            setAnimation(this.f6020j);
        }
        int i10 = eVar.f6036b;
        this.f6021k = i10;
        if (i10 != 0) {
            setAnimation(i10);
        }
        setProgress(eVar.c);
        if (eVar.f6037d) {
            j();
        }
        this.f6018h.f16376j = eVar.f6038e;
        setRepeatMode(eVar.f6039f);
        setRepeatCount(eVar.f6040g);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
        if (r6.f6024n != false) goto L15;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.os.Parcelable onSaveInstanceState() {
        /*
            r6 = this;
            android.os.Parcelable r0 = super.onSaveInstanceState()
            com.airbnb.lottie.LottieAnimationView$e r1 = new com.airbnb.lottie.LottieAnimationView$e
            r1.<init>(r0)
            java.lang.String r0 = r6.f6020j
            r1.f6035a = r0
            int r0 = r6.f6021k
            r1.f6036b = r0
            e3.k r0 = r6.f6018h
            p3.d r2 = r0.c
            e3.e r3 = r2.f23675j
            if (r3 != 0) goto L1b
            r3 = 0
            goto L25
        L1b:
            float r4 = r2.f23671f
            float r5 = r3.f16350k
            float r4 = r4 - r5
            float r3 = r3.f16351l
            float r3 = r3 - r5
            float r3 = r4 / r3
        L25:
            r1.c = r3
            r3 = 0
            if (r2 != 0) goto L2c
            r2 = r3
            goto L2e
        L2c:
            boolean r2 = r2.f23676k
        L2e:
            if (r2 != 0) goto L3c
            java.util.WeakHashMap<android.view.View, x0.n0> r2 = x0.f0.f31435a
            boolean r2 = x0.f0.g.b(r6)
            if (r2 != 0) goto L3d
            boolean r2 = r6.f6024n
            if (r2 == 0) goto L3d
        L3c:
            r3 = 1
        L3d:
            r1.f6037d = r3
            java.lang.String r2 = r0.f16376j
            r1.f6038e = r2
            p3.d r0 = r0.c
            int r2 = r0.getRepeatMode()
            r1.f6039f = r2
            int r0 = r0.getRepeatCount()
            r1.f6040g = r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.LottieAnimationView.onSaveInstanceState():android.os.Parcelable");
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i10) {
        if (!this.f6019i) {
            return;
        }
        if (isShown()) {
            if (this.f6023m) {
                if (isShown()) {
                    this.f6018h.f();
                    f();
                } else {
                    this.f6022l = false;
                    this.f6023m = true;
                }
            } else if (this.f6022l) {
                j();
            }
            this.f6023m = false;
            this.f6022l = false;
        } else if (h()) {
            i();
            this.f6023m = true;
        }
    }

    public void setAnimation(int i10) {
        r<e3.e> a10;
        r<e3.e> rVar;
        this.f6021k = i10;
        this.f6020j = null;
        if (isInEditMode()) {
            rVar = new r<>(new e3.c(this, i10), true);
        } else {
            if (this.f6026p) {
                Context context = getContext();
                String h10 = f.h(context, i10);
                a10 = f.a(h10, new i(new WeakReference(context), context.getApplicationContext(), i10, h10));
            } else {
                Context context2 = getContext();
                HashMap hashMap = f.f16355a;
                a10 = f.a(null, new i(new WeakReference(context2), context2.getApplicationContext(), i10, null));
            }
            rVar = a10;
        }
        setCompositionTask(rVar);
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        setCompositionTask(f.a(null, new j(new ByteArrayInputStream(str.getBytes()))));
    }

    public void setAnimationFromUrl(String str) {
        r<e3.e> a10;
        if (this.f6026p) {
            Context context = getContext();
            HashMap hashMap = f.f16355a;
            String h10 = a0.a.h("url_", str);
            a10 = f.a(h10, new e3.g(context, str, h10));
        } else {
            a10 = f.a(null, new e3.g(getContext(), str, null));
        }
        setCompositionTask(a10);
    }

    public void setApplyingOpacityToLayersEnabled(boolean z10) {
        this.f6018h.f16382p = z10;
    }

    public void setCacheComposition(boolean z10) {
        this.f6026p = z10;
    }

    public void setComposition(e3.e eVar) {
        k kVar = this.f6018h;
        kVar.setCallback(this);
        this.f6031u = eVar;
        boolean z10 = false;
        if (kVar.f16369b != eVar) {
            kVar.f16384r = false;
            kVar.c();
            kVar.f16369b = eVar;
            kVar.b();
            p3.d dVar = kVar.c;
            if (dVar.f23675j == null) {
                z10 = true;
            }
            dVar.f23675j = eVar;
            if (z10) {
                dVar.i((int) Math.max(dVar.f23673h, eVar.f16350k), (int) Math.min(dVar.f23674i, eVar.f16351l));
            } else {
                dVar.i((int) eVar.f16350k, (int) eVar.f16351l);
            }
            float f10 = dVar.f23671f;
            dVar.f23671f = 0.0f;
            dVar.h((int) f10);
            dVar.c();
            kVar.p(dVar.getAnimatedFraction());
            kVar.f16370d = kVar.f16370d;
            kVar.q();
            kVar.q();
            ArrayList<k.o> arrayList = kVar.f16373g;
            Iterator it = new ArrayList(arrayList).iterator();
            while (it.hasNext()) {
                ((k.o) it.next()).run();
                it.remove();
            }
            arrayList.clear();
            eVar.f16341a.f16447a = kVar.f16381o;
            Drawable.Callback callback = kVar.getCallback();
            if (callback instanceof ImageView) {
                ImageView imageView = (ImageView) callback;
                imageView.setImageDrawable(null);
                imageView.setImageDrawable(kVar);
            }
            z10 = true;
        }
        f();
        if (getDrawable() == kVar && !z10) {
            return;
        }
        onVisibilityChanged(this, getVisibility());
        requestLayout();
        Iterator it2 = this.f6028r.iterator();
        while (it2.hasNext()) {
            ((n) it2.next()).a();
        }
    }

    public void setFailureListener(m<Throwable> mVar) {
        this.f6016f = mVar;
    }

    public void setFallbackResource(int i10) {
        this.f6017g = i10;
    }

    public void setFontAssetDelegate(e3.a aVar) {
        i3.a aVar2 = this.f6018h.f16377k;
    }

    public void setFrame(int i10) {
        this.f6018h.g(i10);
    }

    public void setImageAssetDelegate(e3.b bVar) {
        i3.b bVar2 = this.f6018h.f16375i;
    }

    public void setImageAssetsFolder(String str) {
        this.f6018h.f16376j = str;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        e();
        super.setImageBitmap(bitmap);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        e();
        super.setImageDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i10) {
        e();
        super.setImageResource(i10);
    }

    public void setMaxFrame(int i10) {
        this.f6018h.h(i10);
    }

    public void setMaxProgress(float f10) {
        this.f6018h.j(f10);
    }

    public void setMinAndMaxFrame(String str) {
        this.f6018h.l(str);
    }

    public void setMinFrame(int i10) {
        this.f6018h.m(i10);
    }

    public void setMinProgress(float f10) {
        this.f6018h.o(f10);
    }

    public void setPerformanceTrackingEnabled(boolean z10) {
        k kVar = this.f6018h;
        kVar.f16381o = z10;
        e3.e eVar = kVar.f16369b;
        if (eVar != null) {
            eVar.f16341a.f16447a = z10;
        }
    }

    public void setProgress(float f10) {
        this.f6018h.p(f10);
    }

    public void setRenderMode(RenderMode renderMode) {
        this.f6027q = renderMode;
        f();
    }

    public void setRepeatCount(int i10) {
        this.f6018h.c.setRepeatCount(i10);
    }

    public void setRepeatMode(int i10) {
        this.f6018h.c.setRepeatMode(i10);
    }

    public void setSafeMode(boolean z10) {
        this.f6018h.f16372f = z10;
    }

    public void setScale(float f10) {
        k kVar = this.f6018h;
        kVar.f16370d = f10;
        kVar.q();
        if (getDrawable() == kVar) {
            setImageDrawable(null);
            setImageDrawable(kVar);
        }
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        super.setScaleType(scaleType);
        k kVar = this.f6018h;
        if (kVar != null) {
            kVar.f16374h = scaleType;
        }
    }

    public void setSpeed(float f10) {
        this.f6018h.c.c = f10;
    }

    public void setTextDelegate(v vVar) {
        this.f6018h.getClass();
    }

    public void setMaxFrame(String str) {
        this.f6018h.i(str);
    }

    public void setMinFrame(String str) {
        this.f6018h.n(str);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6014d = new b();
        this.f6015e = new c();
        this.f6017g = 0;
        this.f6018h = new k();
        this.f6022l = false;
        this.f6023m = false;
        this.f6024n = false;
        this.f6025o = false;
        this.f6026p = true;
        this.f6027q = RenderMode.AUTOMATIC;
        this.f6028r = new HashSet();
        this.f6029s = 0;
        g(attributeSet, R.attr.lottieAnimationViewStyle);
    }

    public void setAnimation(String str) {
        r<e3.e> a10;
        r<e3.e> rVar;
        this.f6020j = str;
        this.f6021k = 0;
        if (isInEditMode()) {
            rVar = new r<>(new e3.d(this, str), true);
        } else {
            if (this.f6026p) {
                Context context = getContext();
                HashMap hashMap = f.f16355a;
                String h10 = a0.a.h("asset_", str);
                a10 = f.a(h10, new h(context.getApplicationContext(), str, h10));
            } else {
                Context context2 = getContext();
                HashMap hashMap2 = f.f16355a;
                a10 = f.a(null, new h(context2.getApplicationContext(), str, null));
            }
            rVar = a10;
        }
        setCompositionTask(rVar);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f6014d = new b();
        this.f6015e = new c();
        this.f6017g = 0;
        this.f6018h = new k();
        this.f6022l = false;
        this.f6023m = false;
        this.f6024n = false;
        this.f6025o = false;
        this.f6026p = true;
        this.f6027q = RenderMode.AUTOMATIC;
        this.f6028r = new HashSet();
        this.f6029s = 0;
        g(attributeSet, i10);
    }
}
