package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import b.b;
import pdf.pdfreader.viewer.editor.free.R;

/* loaded from: classes.dex */
public class CardView extends FrameLayout {

    /* renamed from: f  reason: collision with root package name */
    public static final int[] f2722f = {16842801};

    /* renamed from: g  reason: collision with root package name */
    public static final b f2723g = new b();

    /* renamed from: a  reason: collision with root package name */
    public boolean f2724a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f2725b;
    public final Rect c;

    /* renamed from: d  reason: collision with root package name */
    public final Rect f2726d;

    /* renamed from: e  reason: collision with root package name */
    public final a f2727e;

    /* loaded from: classes.dex */
    public class a implements x.a {

        /* renamed from: a  reason: collision with root package name */
        public Drawable f2728a;

        public a() {
        }

        public final void a(int i10, int i11, int i12, int i13) {
            CardView cardView = CardView.this;
            cardView.f2726d.set(i10, i11, i12, i13);
            Rect rect = cardView.c;
            CardView.super.setPadding(i10 + rect.left, i11 + rect.top, i12 + rect.right, i13 + rect.bottom);
        }
    }

    public CardView(Context context) {
        this(context, null);
    }

    public ColorStateList getCardBackgroundColor() {
        return ((x.b) this.f2727e.f2728a).f31410h;
    }

    public float getCardElevation() {
        return CardView.this.getElevation();
    }

    public int getContentPaddingBottom() {
        return this.c.bottom;
    }

    public int getContentPaddingLeft() {
        return this.c.left;
    }

    public int getContentPaddingRight() {
        return this.c.right;
    }

    public int getContentPaddingTop() {
        return this.c.top;
    }

    public float getMaxCardElevation() {
        return ((x.b) this.f2727e.f2728a).f31407e;
    }

    public boolean getPreventCornerOverlap() {
        return this.f2725b;
    }

    public float getRadius() {
        return ((x.b) this.f2727e.f2728a).f31404a;
    }

    public boolean getUseCompatPadding() {
        return this.f2724a;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    public void setCardBackgroundColor(int i10) {
        ColorStateList valueOf = ColorStateList.valueOf(i10);
        x.b bVar = (x.b) this.f2727e.f2728a;
        bVar.b(valueOf);
        bVar.invalidateSelf();
    }

    public void setCardElevation(float f10) {
        CardView.this.setElevation(f10);
    }

    public void setMaxCardElevation(float f10) {
        f2723g.W(this.f2727e, f10);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i10) {
        super.setMinimumHeight(i10);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i10) {
        super.setMinimumWidth(i10);
    }

    public void setPreventCornerOverlap(boolean z10) {
        if (z10 != this.f2725b) {
            this.f2725b = z10;
            b bVar = f2723g;
            a aVar = this.f2727e;
            bVar.W(aVar, ((x.b) aVar.f2728a).f31407e);
        }
    }

    public void setRadius(float f10) {
        x.b bVar = (x.b) this.f2727e.f2728a;
        if (f10 != bVar.f31404a) {
            bVar.f31404a = f10;
            bVar.c(null);
            bVar.invalidateSelf();
        }
    }

    public void setUseCompatPadding(boolean z10) {
        if (this.f2724a != z10) {
            this.f2724a = z10;
            b bVar = f2723g;
            a aVar = this.f2727e;
            bVar.W(aVar, ((x.b) aVar.f2728a).f31407e);
        }
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.cardViewStyle);
    }

    public CardView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        int color;
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.c = rect;
        this.f2726d = new Rect();
        a aVar = new a();
        this.f2727e = aVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, w.a.f30901a, i10, R.style.CardView);
        if (obtainStyledAttributes.hasValue(2)) {
            valueOf = obtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(f2722f);
            int color2 = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color2, fArr);
            if (fArr[2] > 0.5f) {
                color = getResources().getColor(R.color.cardview_light_background);
            } else {
                color = getResources().getColor(R.color.cardview_dark_background);
            }
            valueOf = ColorStateList.valueOf(color);
        }
        float dimension = obtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(5, 0.0f);
        this.f2724a = obtainStyledAttributes.getBoolean(7, false);
        this.f2725b = obtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        b bVar = f2723g;
        x.b bVar2 = new x.b(dimension, valueOf);
        aVar.f2728a = bVar2;
        setBackgroundDrawable(bVar2);
        setClipToOutline(true);
        setElevation(dimension2);
        bVar.W(aVar, dimension3);
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        x.b bVar = (x.b) this.f2727e.f2728a;
        bVar.b(colorStateList);
        bVar.invalidateSelf();
    }

    @Override // android.view.View
    public final void setPadding(int i10, int i11, int i12, int i13) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i10, int i11, int i12, int i13) {
    }
}
