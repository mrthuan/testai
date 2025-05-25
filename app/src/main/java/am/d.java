package am;

import android.view.View;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: ActivityAiHistoryDetailBinding.java */
/* loaded from: classes3.dex */
public final class d implements i2.a {

    /* renamed from: a  reason: collision with root package name */
    public final ConstraintLayout f800a;

    /* renamed from: b  reason: collision with root package name */
    public final ConstraintLayout f801b;
    public final RecyclerView c;

    /* renamed from: d  reason: collision with root package name */
    public final Group f802d;

    /* renamed from: e  reason: collision with root package name */
    public final AppCompatImageView f803e;

    /* renamed from: f  reason: collision with root package name */
    public final AppCompatImageView f804f;

    /* renamed from: g  reason: collision with root package name */
    public final z f805g;

    /* renamed from: h  reason: collision with root package name */
    public final Space f806h;

    /* renamed from: i  reason: collision with root package name */
    public final TextView f807i;

    public d(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, RecyclerView recyclerView, Group group, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, z zVar, Space space, TextView textView) {
        this.f800a = constraintLayout;
        this.f801b = constraintLayout2;
        this.c = recyclerView;
        this.f802d = group;
        this.f803e = appCompatImageView;
        this.f804f = appCompatImageView2;
        this.f805g = zVar;
        this.f806h = space;
        this.f807i = textView;
    }

    @Override // i2.a
    public final View b() {
        return this.f800a;
    }
}
