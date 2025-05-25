package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import java.io.PrintWriter;

/* compiled from: FragmentHostCallback.java */
/* loaded from: classes.dex */
public abstract class z<E> extends w {

    /* renamed from: d  reason: collision with root package name */
    public final Activity f3961d;

    /* renamed from: e  reason: collision with root package name */
    public final Context f3962e;

    /* renamed from: f  reason: collision with root package name */
    public final Handler f3963f;

    /* renamed from: g  reason: collision with root package name */
    public final h0 f3964g;

    public z(u uVar) {
        Handler handler = new Handler();
        this.f3964g = new h0();
        this.f3961d = uVar;
        if (uVar != null) {
            this.f3962e = uVar;
            this.f3963f = handler;
            return;
        }
        throw new NullPointerException("context == null");
    }

    public abstract void J(PrintWriter printWriter, String[] strArr);

    public abstract u K();

    public abstract LayoutInflater L();

    public abstract void M();
}
