package v8;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import java.util.ArrayList;

/* compiled from: BaseMotionStrategy.java */
/* loaded from: classes2.dex */
public abstract class a implements h {

    /* renamed from: a  reason: collision with root package name */
    public final Context f30742a;

    /* renamed from: b  reason: collision with root package name */
    public final ExtendedFloatingActionButton f30743b;
    public final ArrayList<Animator.AnimatorListener> c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    public final k3.e f30744d;

    /* renamed from: e  reason: collision with root package name */
    public f8.h f30745e;

    /* renamed from: f  reason: collision with root package name */
    public f8.h f30746f;

    /* compiled from: BaseMotionStrategy.java */
    /* renamed from: v8.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0387a extends Property<ExtendedFloatingActionButton, Float> {
        public C0387a() {
            super(Float.class, "LABEL_OPACITY_PROPERTY");
        }

        @Override // android.util.Property
        public final Float get(ExtendedFloatingActionButton extendedFloatingActionButton) {
            ExtendedFloatingActionButton extendedFloatingActionButton2 = extendedFloatingActionButton;
            float alpha = (Color.alpha(extendedFloatingActionButton2.getCurrentTextColor()) / 255.0f) / Color.alpha(extendedFloatingActionButton2.F.getColorForState(extendedFloatingActionButton2.getDrawableState(), a.this.f30743b.F.getDefaultColor()));
            LinearInterpolator linearInterpolator = f8.b.f17141a;
            return Float.valueOf((alpha * 1.0f) + 0.0f);
        }

        @Override // android.util.Property
        public final void set(ExtendedFloatingActionButton extendedFloatingActionButton, Float f10) {
            ExtendedFloatingActionButton extendedFloatingActionButton2 = extendedFloatingActionButton;
            Float f11 = f10;
            int colorForState = extendedFloatingActionButton2.F.getColorForState(extendedFloatingActionButton2.getDrawableState(), a.this.f30743b.F.getDefaultColor());
            float floatValue = f11.floatValue();
            LinearInterpolator linearInterpolator = f8.b.f17141a;
            ColorStateList valueOf = ColorStateList.valueOf(Color.argb((int) (((((Color.alpha(colorForState) / 255.0f) - 0.0f) * floatValue) + 0.0f) * 255.0f), Color.red(colorForState), Color.green(colorForState), Color.blue(colorForState)));
            if (f11.floatValue() == 1.0f) {
                extendedFloatingActionButton2.f(extendedFloatingActionButton2.F);
            } else {
                extendedFloatingActionButton2.f(valueOf);
            }
        }
    }

    public a(ExtendedFloatingActionButton extendedFloatingActionButton, k3.e eVar) {
        this.f30743b = extendedFloatingActionButton;
        this.f30742a = extendedFloatingActionButton.getContext();
        this.f30744d = eVar;
    }

    @Override // v8.h
    public void b() {
        this.f30744d.f19557a = null;
    }

    @Override // v8.h
    public AnimatorSet g() {
        f8.h hVar = this.f30746f;
        if (hVar == null) {
            if (this.f30745e == null) {
                this.f30745e = f8.h.b(this.f30742a, c());
            }
            hVar = this.f30745e;
            hVar.getClass();
        }
        return h(hVar);
    }

    public final AnimatorSet h(f8.h hVar) {
        ArrayList arrayList = new ArrayList();
        boolean g10 = hVar.g("opacity");
        ExtendedFloatingActionButton extendedFloatingActionButton = this.f30743b;
        if (g10) {
            arrayList.add(hVar.d("opacity", extendedFloatingActionButton, View.ALPHA));
        }
        if (hVar.g("scale")) {
            arrayList.add(hVar.d("scale", extendedFloatingActionButton, View.SCALE_Y));
            arrayList.add(hVar.d("scale", extendedFloatingActionButton, View.SCALE_X));
        }
        if (hVar.g(InMobiNetworkValues.WIDTH)) {
            arrayList.add(hVar.d(InMobiNetworkValues.WIDTH, extendedFloatingActionButton, ExtendedFloatingActionButton.I));
        }
        if (hVar.g(InMobiNetworkValues.HEIGHT)) {
            arrayList.add(hVar.d(InMobiNetworkValues.HEIGHT, extendedFloatingActionButton, ExtendedFloatingActionButton.J));
        }
        if (hVar.g("paddingStart")) {
            arrayList.add(hVar.d("paddingStart", extendedFloatingActionButton, ExtendedFloatingActionButton.K));
        }
        if (hVar.g("paddingEnd")) {
            arrayList.add(hVar.d("paddingEnd", extendedFloatingActionButton, ExtendedFloatingActionButton.L));
        }
        if (hVar.g("labelOpacity")) {
            arrayList.add(hVar.d("labelOpacity", extendedFloatingActionButton, new C0387a()));
        }
        AnimatorSet animatorSet = new AnimatorSet();
        com.google.android.play.core.assetpacks.c.O(animatorSet, arrayList);
        return animatorSet;
    }
}
