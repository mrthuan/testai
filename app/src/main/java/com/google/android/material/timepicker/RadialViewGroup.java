package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.a;
import f9.h;
import f9.k;
import f9.m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import pdf.pdfreader.viewer.editor.free.R;
import x0.f0;
import x0.n0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class RadialViewGroup extends ConstraintLayout {

    /* renamed from: q  reason: collision with root package name */
    public final a f13121q;

    /* renamed from: r  reason: collision with root package name */
    public int f13122r;

    /* renamed from: s  reason: collision with root package name */
    public h f13123s;

    public RadialViewGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        if (view.getId() == -1) {
            WeakHashMap<View, n0> weakHashMap = f0.f31435a;
            view.setId(f0.e.a());
        }
        Handler handler = getHandler();
        if (handler != null) {
            a aVar = this.f13121q;
            handler.removeCallbacks(aVar);
            handler.post(aVar);
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        r();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            a aVar = this.f13121q;
            handler.removeCallbacks(aVar);
            handler.post(aVar);
        }
    }

    public void r() {
        int i10;
        androidx.constraintlayout.widget.a aVar = new androidx.constraintlayout.widget.a();
        aVar.f(this);
        HashMap hashMap = new HashMap();
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getId() != R.id.circle_center && !"skip".equals(childAt.getTag())) {
                int i12 = (Integer) childAt.getTag(R.id.material_clock_level);
                if (i12 == null) {
                    i12 = 1;
                }
                if (!hashMap.containsKey(i12)) {
                    hashMap.put(i12, new ArrayList());
                }
                ((List) hashMap.get(i12)).add(childAt);
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            List<View> list = (List) entry.getValue();
            if (((Integer) entry.getKey()).intValue() == 2) {
                i10 = Math.round(this.f13122r * 0.66f);
            } else {
                i10 = this.f13122r;
            }
            float f10 = 0.0f;
            for (View view : list) {
                a.b bVar = aVar.k(view.getId()).f3373e;
                bVar.A = R.id.circle_center;
                bVar.B = i10;
                bVar.C = f10;
                f10 += 360.0f / list.size();
            }
        }
        aVar.b(this);
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i10) {
        this.f13123s.n(ColorStateList.valueOf(i10));
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [com.google.android.material.timepicker.a] */
    public RadialViewGroup(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        h hVar = new h();
        this.f13123s = hVar;
        k kVar = new k(0.5f);
        m mVar = hVar.f17164a.f17186a;
        mVar.getClass();
        m.a aVar = new m.a(mVar);
        aVar.f17226e = kVar;
        aVar.f17227f = kVar;
        aVar.f17228g = kVar;
        aVar.f17229h = kVar;
        hVar.setShapeAppearanceModel(new m(aVar));
        this.f13123s.n(ColorStateList.valueOf(-1));
        h hVar2 = this.f13123s;
        WeakHashMap<View, n0> weakHashMap = f0.f31435a;
        f0.d.q(this, hVar2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e8.a.P, i10, 0);
        this.f13122r = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f13121q = new Runnable() { // from class: com.google.android.material.timepicker.a
            @Override // java.lang.Runnable
            public final void run() {
                RadialViewGroup.this.r();
            }
        };
        obtainStyledAttributes.recycle();
    }
}
