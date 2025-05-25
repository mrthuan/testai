package ho;

import android.content.Context;
import android.graphics.Bitmap;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import jp.co.cyberagent.android.gpuimage.GPUImage;
import pdf.pdfreader.viewer.editor.free.scan.group.enumerate.AdjustableType;
import pdf.pdfreader.viewer.editor.free.scan.group.enumerate.GroupAiFilterType;

/* compiled from: BaseGroupAiFilter.kt */
/* loaded from: classes3.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public final Context f18383a;

    /* renamed from: b  reason: collision with root package name */
    public String f18384b;
    public final ArrayList<a> c;

    /* renamed from: d  reason: collision with root package name */
    public final GPUImage f18385d;

    /* renamed from: e  reason: collision with root package name */
    public WeakReference<Bitmap> f18386e;

    /* compiled from: BaseGroupAiFilter.kt */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final AdjustableType f18387a;

        /* renamed from: b  reason: collision with root package name */
        public final ko.a f18388b;

        public a(AdjustableType adjustableType, ko.a aVar) {
            kotlin.jvm.internal.g.e(adjustableType, ea.a.p("R3k7ZQ==", "0PUK4DzO"));
            ea.a.p("DGQodUR0E2IkZSdpcmk7dF1y", "EkmB7rpb");
            this.f18387a = adjustableType;
            this.f18388b = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f18387a == aVar.f18387a && kotlin.jvm.internal.g.a(this.f18388b, aVar.f18388b)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f18388b.hashCode() + (this.f18387a.hashCode() * 31);
        }

        public final String toString() {
            return "AdjustableAiFilterModel(type=" + this.f18387a + ", adjustableAiFilter=" + this.f18388b + ")";
        }
    }

    public b(Context context) {
        kotlin.jvm.internal.g.e(context, ea.a.p("UG8ldBZ4dA==", "7pNRSwNE"));
        this.f18383a = context;
        this.f18384b = "";
        this.c = new ArrayList<>(3);
        this.f18385d = new GPUImage(context);
        c();
    }

    public final Bitmap a(Context context, Bitmap bitmap) {
        GPUImage gPUImage = this.f18385d;
        kotlin.jvm.internal.g.e(context, "context");
        kotlin.jvm.internal.g.e(bitmap, "bitmap");
        try {
            Bitmap e10 = e(context, bitmap);
            this.f18386e = new WeakReference<>(e10);
            ArrayList arrayList = new ArrayList();
            Iterator<a> it = this.c.iterator();
            while (it.hasNext()) {
                ko.a aVar = it.next().f18388b;
                kotlin.jvm.internal.g.c(aVar, ea.a.p("XXUnbFNjA24cb0AgC2V2YyVzRiAyb2NuDW4ZbhRsPyBHeTtlU2oSLhFvGmMQYjNyJWdXbjIuIm4GcltpBS40cEZpJmEUZUxmG2xAZRsuEVARSV9hIWUFaQ50UXI=", "b4aSpPeD"));
                arrayList.add((rf.e) aVar);
            }
            gPUImage.c(new rf.f(arrayList));
            Bitmap a10 = gPUImage.a(e10);
            kotlin.jvm.internal.g.d(a10, ea.a.p("KHBESRRhUGV0Zy90N2kcbVRwOWkxaCNpPXQPcgxwBGwmZVUoG2lDbTtwDGkZdA1yKQ==", "uVyYQjMt"));
            return a10;
        } catch (Throwable th2) {
            th2.printStackTrace();
            return bitmap;
        }
    }

    public abstract GroupAiFilterType b();

    public abstract void c();

    public final b d() {
        GroupAiFilterType b10 = b();
        kotlin.jvm.internal.g.e(b10, "<this>");
        Context context = this.f18383a;
        kotlin.jvm.internal.g.e(context, "context");
        return go.a.a(context, b10);
    }

    public Bitmap e(Context context, Bitmap bitmap) {
        kotlin.jvm.internal.g.e(context, "context");
        kotlin.jvm.internal.g.e(bitmap, "bitmap");
        return bitmap;
    }
}
