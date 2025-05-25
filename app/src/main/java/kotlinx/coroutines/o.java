package kotlinx.coroutines;

import java.util.concurrent.CancellationException;

/* compiled from: CancellableContinuationImpl.kt */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    public final Object f20214a;

    /* renamed from: b  reason: collision with root package name */
    public final e f20215b;
    public final cg.l<Throwable, tf.d> c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f20216d;

    /* renamed from: e  reason: collision with root package name */
    public final Throwable f20217e;

    /* JADX WARN: Multi-variable type inference failed */
    public o(Object obj, e eVar, cg.l<? super Throwable, tf.d> lVar, Object obj2, Throwable th2) {
        this.f20214a = obj;
        this.f20215b = eVar;
        this.c = lVar;
        this.f20216d = obj2;
        this.f20217e = th2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Throwable] */
    public static o a(o oVar, e eVar, CancellationException cancellationException, int i10) {
        Object obj;
        cg.l<Throwable, tf.d> lVar;
        Object obj2 = null;
        if ((i10 & 1) != 0) {
            obj = oVar.f20214a;
        } else {
            obj = null;
        }
        if ((i10 & 2) != 0) {
            eVar = oVar.f20215b;
        }
        e eVar2 = eVar;
        if ((i10 & 4) != 0) {
            lVar = oVar.c;
        } else {
            lVar = null;
        }
        if ((i10 & 8) != 0) {
            obj2 = oVar.f20216d;
        }
        Object obj3 = obj2;
        CancellationException cancellationException2 = cancellationException;
        if ((i10 & 16) != 0) {
            cancellationException2 = oVar.f20217e;
        }
        oVar.getClass();
        return new o(obj, eVar2, lVar, obj3, cancellationException2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (kotlin.jvm.internal.g.a(this.f20214a, oVar.f20214a) && kotlin.jvm.internal.g.a(this.f20215b, oVar.f20215b) && kotlin.jvm.internal.g.a(this.c, oVar.c) && kotlin.jvm.internal.g.a(this.f20216d, oVar.f20216d) && kotlin.jvm.internal.g.a(this.f20217e, oVar.f20217e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int i10 = 0;
        Object obj = this.f20214a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i11 = hashCode * 31;
        e eVar = this.f20215b;
        if (eVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = eVar.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        cg.l<Throwable, tf.d> lVar = this.c;
        if (lVar == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = lVar.hashCode();
        }
        int i13 = (i12 + hashCode3) * 31;
        Object obj2 = this.f20216d;
        if (obj2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = obj2.hashCode();
        }
        int i14 = (i13 + hashCode4) * 31;
        Throwable th2 = this.f20217e;
        if (th2 != null) {
            i10 = th2.hashCode();
        }
        return i14 + i10;
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f20214a + ", cancelHandler=" + this.f20215b + ", onCancellation=" + this.c + ", idempotentResume=" + this.f20216d + ", cancelCause=" + this.f20217e + ')';
    }

    public /* synthetic */ o(Object obj, e eVar, cg.l lVar, CancellationException cancellationException, int i10) {
        this(obj, (i10 & 2) != 0 ? null : eVar, (i10 & 4) != 0 ? null : lVar, (Object) null, (i10 & 16) != 0 ? null : cancellationException);
    }
}
