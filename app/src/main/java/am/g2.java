package am;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: LayoutAiQuickEntranceTagBinding.java */
/* loaded from: classes3.dex */
public final class g2 implements i2.a {

    /* renamed from: a  reason: collision with root package name */
    public final View f933a;

    /* renamed from: b  reason: collision with root package name */
    public final AppCompatImageView f934b;
    public final RecyclerView c;

    /* renamed from: d  reason: collision with root package name */
    public final TextView f935d;

    public g2(View view, AppCompatImageView appCompatImageView, RecyclerView recyclerView, TextView textView) {
        this.f933a = view;
        this.f934b = appCompatImageView;
        this.c = recyclerView;
        this.f935d = textView;
    }

    @Override // i2.a
    public final View b() {
        return this.f933a;
    }
}
