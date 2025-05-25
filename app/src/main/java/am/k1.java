package am;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: ItemImageAdjustFilterBinding.java */
/* loaded from: classes3.dex */
public final class k1 implements i2.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1030a;

    /* renamed from: b  reason: collision with root package name */
    public final ConstraintLayout f1031b;
    public final View c;

    /* renamed from: d  reason: collision with root package name */
    public final AppCompatImageView f1032d;

    public /* synthetic */ k1(ConstraintLayout constraintLayout, View view, AppCompatImageView appCompatImageView, int i10) {
        this.f1030a = i10;
        this.f1031b = constraintLayout;
        this.c = view;
        this.f1032d = appCompatImageView;
    }

    public final ConstraintLayout a() {
        return this.f1031b;
    }

    @Override // i2.a
    public final View b() {
        int i10 = this.f1030a;
        ConstraintLayout constraintLayout = this.f1031b;
        switch (i10) {
            case 0:
            default:
                return constraintLayout;
        }
    }
}
