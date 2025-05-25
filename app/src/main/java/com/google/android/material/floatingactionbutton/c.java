package com.google.android.material.floatingactionbutton;

import android.view.ViewGroup;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

/* compiled from: ExtendedFloatingActionButton.java */
/* loaded from: classes2.dex */
public final class c implements ExtendedFloatingActionButton.i {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ExtendedFloatingActionButton.i f12528a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ExtendedFloatingActionButton.i f12529b;
    public final /* synthetic */ ExtendedFloatingActionButton c;

    public c(ExtendedFloatingActionButton extendedFloatingActionButton, b bVar, a aVar) {
        this.c = extendedFloatingActionButton;
        this.f12528a = bVar;
        this.f12529b = aVar;
    }

    @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.i
    public final int getHeight() {
        int i10 = this.c.H;
        if (i10 == -1) {
            return this.f12528a.getHeight();
        }
        if (i10 != 0 && i10 != -2) {
            return i10;
        }
        return this.f12529b.getHeight();
    }

    @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.i
    public final ViewGroup.LayoutParams getLayoutParams() {
        ExtendedFloatingActionButton extendedFloatingActionButton = this.c;
        int i10 = extendedFloatingActionButton.G;
        int i11 = -2;
        if (i10 == 0) {
            i10 = -2;
        }
        int i12 = extendedFloatingActionButton.H;
        if (i12 != 0) {
            i11 = i12;
        }
        return new ViewGroup.LayoutParams(i10, i11);
    }

    @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.i
    public final int getPaddingEnd() {
        return this.c.A;
    }

    @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.i
    public final int getPaddingStart() {
        return this.c.f12496z;
    }

    @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.i
    public final int getWidth() {
        int i10 = this.c.G;
        if (i10 == -1) {
            return this.f12528a.getWidth();
        }
        if (i10 != 0 && i10 != -2) {
            return i10;
        }
        return this.f12529b.getWidth();
    }
}
