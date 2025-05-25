package a8;

import com.google.android.gms.common.internal.Preconditions;
import java.io.IOException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.2 */
/* loaded from: classes2.dex */
public final class q implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final p f293a;

    /* renamed from: b  reason: collision with root package name */
    public final int f294b;
    public final Throwable c;

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f295d;

    /* renamed from: e  reason: collision with root package name */
    public final String f296e;

    /* renamed from: f  reason: collision with root package name */
    public final Map f297f;

    public /* synthetic */ q(String str, p pVar, int i10, IOException iOException, byte[] bArr, Map map) {
        Preconditions.j(pVar);
        this.f293a = pVar;
        this.f294b = i10;
        this.c = iOException;
        this.f295d = bArr;
        this.f296e = str;
        this.f297f = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f293a.b(this.f296e, this.f294b, this.c, this.f295d, this.f297f);
    }
}
