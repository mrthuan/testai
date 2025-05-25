package y0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: AccessibilityClickableSpanCompat.java */
/* loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* renamed from: a  reason: collision with root package name */
    public final int f31947a;

    /* renamed from: b  reason: collision with root package name */
    public final f f31948b;
    public final int c;

    public a(int i10, f fVar, int i11) {
        this.f31947a = i10;
        this.f31948b = fVar;
        this.c = i11;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f31947a);
        this.f31948b.f31951a.performAction(this.c, bundle);
    }
}
