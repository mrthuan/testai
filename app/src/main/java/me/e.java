package me;

import androidx.appcompat.widget.StarCheckView;
import java.util.List;

/* compiled from: RateDialog.java */
/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ pe.a f22013a;

    public e(pe.a aVar) {
        this.f22013a = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pe.a aVar = this.f22013a;
        List<StarCheckView> list = aVar.f28928b;
        if (list != null && aVar.c < 0) {
            aVar.f28929d = false;
            aVar.a();
            aVar.d(0, list.size() - 1, true);
        }
    }
}
