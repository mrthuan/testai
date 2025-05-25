package fo;

import androidx.lifecycle.w;
import kotlin.jvm.internal.g;

/* compiled from: FileModelRepo.kt */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final w<nl.a> f17316a;

    /* renamed from: b  reason: collision with root package name */
    public static final w f17317b;

    static {
        w<nl.a> wVar = new w<>(null);
        f17316a = wVar;
        f17317b = wVar;
    }

    public static final void a(long j10, String fileType, String params) {
        g.e(fileType, "fileType");
        g.e(params, "params");
        f17316a.j(new nl.a(j10, fileType, params));
    }
}
