package androidx.activity;

import androidx.activity.ComponentActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* compiled from: FullyDrawnReporter.kt */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f1816a;

    /* renamed from: b  reason: collision with root package name */
    public final cg.a<tf.d> f1817b;
    public final Object c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f1818d;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList f1819e;

    public m(ComponentActivity.e executor, c cVar) {
        kotlin.jvm.internal.g.e(executor, "executor");
        this.f1816a = executor;
        this.f1817b = cVar;
        this.c = new Object();
        this.f1819e = new ArrayList();
    }

    public final void a() {
        synchronized (this.c) {
            this.f1818d = true;
            Iterator it = this.f1819e.iterator();
            while (it.hasNext()) {
                ((cg.a) it.next()).invoke();
            }
            this.f1819e.clear();
            tf.d dVar = tf.d.f30009a;
        }
    }
}
