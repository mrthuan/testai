package rh;

import lib.zj.office.pg.control.Presentation;

/* compiled from: Presentation.java */
/* loaded from: classes3.dex */
public final class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Presentation f29575a;

    public i(Presentation presentation) {
        this.f29575a = presentation;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f29575a.setViewVisible(true);
    }
}
