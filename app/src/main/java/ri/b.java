package ri;

import lib.zj.office.system.beans.pagelist.APageListItem;

/* compiled from: APageListView.java */
/* loaded from: classes3.dex */
public final class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ APageListItem f29597a;

    public b(APageListItem aPageListItem) {
        this.f29597a = aPageListItem;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f29597a.f();
    }
}
