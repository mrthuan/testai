package ve;

import android.content.Context;
import android.os.Trace;
import androidx.activity.s;
import androidx.lifecycle.v;
import java.util.HashMap;
import java.util.Objects;

/* compiled from: FlutterEngineConnectionRegistry.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: b  reason: collision with root package name */
    public final io.flutter.embedding.engine.a f30804b;
    public final ze.a c;

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f30803a = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public final HashMap f30805d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public final HashMap f30806e = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    public final HashMap f30807f = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    public final HashMap f30808g = new HashMap();

    public a(Context context, io.flutter.embedding.engine.a aVar) {
        this.f30804b = aVar;
        we.a aVar2 = aVar.f18637a;
        v vVar = aVar.f18639d.f18812a;
        this.c = new ze.a(context, aVar2);
    }

    public final void a(io.flutter.plugins.pathprovider.a aVar) {
        Trace.beginSection(s.w("FlutterEngineConnectionRegistry#add ".concat(io.flutter.plugins.pathprovider.a.class.getSimpleName())));
        HashMap hashMap = this.f30803a;
        try {
            if (hashMap.containsKey(io.flutter.plugins.pathprovider.a.class)) {
                Objects.toString(this.f30804b);
                return;
            }
            hashMap.put(io.flutter.plugins.pathprovider.a.class, aVar);
            ze.a aVar2 = this.c;
            try {
                b.a.l(aVar2.f32369b, aVar);
            } catch (Exception unused) {
            }
            aVar.f18831a = aVar2.f32368a;
            if (aVar instanceof af.a) {
                this.f30805d.put(io.flutter.plugins.pathprovider.a.class, (af.a) aVar);
            }
            if (aVar instanceof df.a) {
                this.f30806e.put(io.flutter.plugins.pathprovider.a.class, (df.a) aVar);
            }
            if (aVar instanceof bf.a) {
                this.f30807f.put(io.flutter.plugins.pathprovider.a.class, (bf.a) aVar);
            }
            if (aVar instanceof cf.a) {
                this.f30808g.put(io.flutter.plugins.pathprovider.a.class, (cf.a) aVar);
            }
        } finally {
            Trace.endSection();
        }
    }
}
