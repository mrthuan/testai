package o2;

import androidx.work.ListenableWorker;
import androidx.work.OverwritingInputMerger;
import o2.m;

/* compiled from: OneTimeWorkRequest.java */
/* loaded from: classes.dex */
public final class i extends m {

    /* compiled from: OneTimeWorkRequest.java */
    /* loaded from: classes.dex */
    public static final class a extends m.a<a, i> {
        public a(Class<? extends ListenableWorker> cls) {
            super(cls);
            this.f22693b.f31560d = OverwritingInputMerger.class.getName();
        }
    }

    public i(a aVar) {
        super(aVar.f22692a, aVar.f22693b, aVar.c);
    }
}
