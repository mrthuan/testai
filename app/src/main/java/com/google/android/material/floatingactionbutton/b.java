package com.google.android.material.floatingactionbutton;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

/* compiled from: ExtendedFloatingActionButton.java */
/* loaded from: classes2.dex */
public final class b implements ExtendedFloatingActionButton.i {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ExtendedFloatingActionButton.i f12526a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ExtendedFloatingActionButton f12527b;

    public b(ExtendedFloatingActionButton extendedFloatingActionButton, a aVar) {
        this.f12527b = extendedFloatingActionButton;
        this.f12526a = aVar;
    }

    @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.i
    public final int getHeight() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.f12527b;
        int i10 = extendedFloatingActionButton.H;
        ExtendedFloatingActionButton.i iVar = this.f12526a;
        if (i10 == -1) {
            if (!(extendedFloatingActionButton.getParent() instanceof View)) {
                return iVar.getHeight();
            }
            View view = (View) extendedFloatingActionButton.getParent();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null && layoutParams.height == -2) {
                return iVar.getHeight();
            }
            int i11 = 0;
            int paddingBottom = view.getPaddingBottom() + view.getPaddingTop() + 0;
            if ((extendedFloatingActionButton.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) extendedFloatingActionButton.getLayoutParams()) != null) {
                i11 = 0 + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
            }
            return (view.getHeight() - i11) - paddingBottom;
        } else if (i10 != 0 && i10 != -2) {
            return i10;
        } else {
            return iVar.getHeight();
        }
    }

    @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.i
    public final ViewGroup.LayoutParams getLayoutParams() {
        int i10 = this.f12527b.H;
        if (i10 == 0) {
            i10 = -2;
        }
        return new ViewGroup.LayoutParams(-1, i10);
    }

    @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.i
    public final int getPaddingEnd() {
        return this.f12527b.A;
    }

    @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.i
    public final int getPaddingStart() {
        return this.f12527b.f12496z;
    }

    @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.i
    public final int getWidth() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.f12527b;
        boolean z10 = extendedFloatingActionButton.getParent() instanceof View;
        ExtendedFloatingActionButton.i iVar = this.f12526a;
        if (!z10) {
            return iVar.getWidth();
        }
        View view = (View) extendedFloatingActionButton.getParent();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null && layoutParams.width == -2) {
            return iVar.getWidth();
        }
        int i10 = 0;
        int paddingRight = view.getPaddingRight() + view.getPaddingLeft() + 0;
        if ((extendedFloatingActionButton.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) extendedFloatingActionButton.getLayoutParams()) != null) {
            i10 = 0 + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
        }
        return (view.getWidth() - i10) - paddingRight;
    }
}
