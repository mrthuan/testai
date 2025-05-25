package io.flutter.plugin.platform;

import android.view.View;

/* compiled from: PlatformPlugin.java */
/* loaded from: classes.dex */
public final class d implements View.OnSystemUiVisibilityChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ View f18805a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ b f18806b;

    public d(b bVar, View view) {
        this.f18806b = bVar;
        this.f18805a = view;
    }

    @Override // android.view.View.OnSystemUiVisibilityChangeListener
    public final void onSystemUiVisibilityChange(int i10) {
        this.f18805a.post(new c(this, i10, 0));
    }
}
