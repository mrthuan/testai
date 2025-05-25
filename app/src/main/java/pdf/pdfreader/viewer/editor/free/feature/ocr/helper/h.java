package pdf.pdfreader.viewer.editor.free.feature.ocr.helper;

import java.util.Vector;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: OCRTransportImageTask.kt */
/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public ThreadPoolExecutor f25085a;

    /* renamed from: b  reason: collision with root package name */
    public final AtomicInteger f25086b = new AtomicInteger(0);
    public k<um.a> c;

    /* renamed from: d  reason: collision with root package name */
    public long f25087d;

    public static void a(k kVar, int i10, Vector vector) {
        kotlin.jvm.internal.g.e(kVar, ea.a.p("F2MqbB9iA2Nr", "0UcF631Q"));
        kotlin.jvm.internal.g.e(vector, ea.a.p("F3IucwZsFkkfYVNlcw==", "GYalzFSu"));
        kVar.c();
        if (vector.size() > 1) {
            kotlin.collections.j.j0(vector, new g());
        }
        kVar.g(vector);
    }
}
