package pdf.pdfreader.viewer.editor.free.convert.opt;

import android.graphics.Bitmap;
import java.io.File;
import java.util.UUID;
import java.util.Vector;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.collections.j;

/* compiled from: OptImageTask.kt */
/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public ThreadPoolExecutor f24153a;

    /* renamed from: b  reason: collision with root package name */
    public final AtomicInteger f24154b = new AtomicInteger(0);
    public a c;

    public static void a(a aVar, int i10, Vector vector) {
        kotlin.jvm.internal.g.e(aVar, ea.a.p("a2NQbBViVmNr", "VtGxmGrR"));
        kotlin.jvm.internal.g.e(vector, ea.a.p("YXJScwFsOkklYQFlcw==", "3yE7tNUV"));
        aVar.b(i10, i10);
        if (vector.size() > 1) {
            j.j0(vector, new g());
        }
        aVar.a(vector);
    }

    public static ul.b b(ul.b bVar, File file, Bitmap bitmap) {
        boolean z10;
        try {
            File file2 = new File(bVar.f30404a);
            if (file2.exists() && file2.length() > 0 && file2.canRead()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                File absoluteFile = file.getAbsoluteFile();
                String str = File.separator;
                UUID randomUUID = UUID.randomUUID();
                String A0 = bg.b.A0(file2);
                File file3 = new File(absoluteFile + str + randomUUID + "." + A0);
                String absolutePath = file3.getAbsolutePath();
                kotlin.jvm.internal.g.d(absolutePath, ea.a.p("Wm0qZxZGC2wXLlViGm86dTBlYmEyaA==", "Mj3XSKNO"));
                pdf.pdfreader.viewer.editor.free.pic.utils.a.a(absolutePath, bitmap);
                String absolutePath2 = file3.getAbsolutePath();
                kotlin.jvm.internal.g.d(absolutePath2, ea.a.p("Wm0qZxZGC2wXLlViGm86dTBlYmEyaA==", "JlVpkawd"));
                return com.google.android.play.core.assetpacks.c.N(bVar, absolutePath2);
            }
            return null;
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }
}
