package ek;

import ek.d;
import java.io.IOException;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: TaskQueue.kt */
/* loaded from: classes3.dex */
public final class h extends bk.a {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ d.c f16722e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ boolean f16723f = false;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ t f16724g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(String str, d.c cVar, t tVar) {
        super(str, true);
        this.f16722e = cVar;
        this.f16724g = tVar;
    }

    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [ek.t, T] */
    /* JADX WARN: Type inference failed for: r2v3 */
    @Override // bk.a
    public final long a() {
        ?? r22;
        long a10;
        int i10;
        int i11;
        p[] pVarArr;
        d.c cVar = this.f16722e;
        boolean z10 = this.f16723f;
        t settings = this.f16724g;
        cVar.getClass();
        kotlin.jvm.internal.g.e(settings, "settings");
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        d dVar = cVar.f16706b;
        synchronized (dVar.f16694y) {
            synchronized (dVar) {
                t tVar = dVar.f16688s;
                if (z10) {
                    r22 = settings;
                } else {
                    t tVar2 = new t();
                    tVar2.b(tVar);
                    tVar2.b(settings);
                    r22 = tVar2;
                }
                ref$ObjectRef.element = r22;
                a10 = r22.a() - tVar.a();
                i10 = (a10 > 0L ? 1 : (a10 == 0L ? 0 : -1));
                i11 = 0;
                if (i10 != 0 && !dVar.c.isEmpty()) {
                    Object[] array = dVar.c.values().toArray(new p[0]);
                    if (array != null) {
                        pVarArr = (p[]) array;
                        t tVar3 = (t) ref$ObjectRef.element;
                        kotlin.jvm.internal.g.e(tVar3, "<set-?>");
                        dVar.f16688s = tVar3;
                        dVar.f16680k.c(new e(kotlin.jvm.internal.g.h(" onSettings", dVar.f16673d), dVar, ref$ObjectRef), 0L);
                        tf.d dVar2 = tf.d.f30009a;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                    }
                }
                pVarArr = null;
                t tVar32 = (t) ref$ObjectRef.element;
                kotlin.jvm.internal.g.e(tVar32, "<set-?>");
                dVar.f16688s = tVar32;
                dVar.f16680k.c(new e(kotlin.jvm.internal.g.h(" onSettings", dVar.f16673d), dVar, ref$ObjectRef), 0L);
                tf.d dVar22 = tf.d.f30009a;
            }
            try {
                dVar.f16694y.a((t) ref$ObjectRef.element);
            } catch (IOException e10) {
                dVar.b(e10);
            }
            tf.d dVar3 = tf.d.f30009a;
        }
        if (pVarArr != null) {
            int length = pVarArr.length;
            while (i11 < length) {
                p pVar = pVarArr[i11];
                i11++;
                synchronized (pVar) {
                    pVar.f16759f += a10;
                    if (i10 > 0) {
                        pVar.notifyAll();
                    }
                    tf.d dVar4 = tf.d.f30009a;
                }
            }
            return -1L;
        }
        return -1L;
    }
}
