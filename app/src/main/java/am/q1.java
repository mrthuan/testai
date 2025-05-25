package am;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: ItemOcrAdjustPreviewBinding.java */
/* loaded from: classes3.dex */
public final class q1 implements i2.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1346a;

    /* renamed from: b  reason: collision with root package name */
    public final View f1347b;
    public final View c;

    /* renamed from: d  reason: collision with root package name */
    public final View f1348d;

    public /* synthetic */ q1(ConstraintLayout constraintLayout, View view, View view2, int i10) {
        this.f1346a = i10;
        this.f1347b = constraintLayout;
        this.c = view;
        this.f1348d = view2;
    }

    @Override // i2.a
    public final View b() {
        int i10 = this.f1346a;
        View view = this.f1347b;
        switch (i10) {
            case 0:
                return (ConstraintLayout) view;
            default:
                return view;
        }
    }
}
