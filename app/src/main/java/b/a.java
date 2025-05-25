package b;

import android.graphics.Path;
import android.graphics.Rect;
import com.google.android.gms.internal.ads.zzea;
import com.google.android.tools.d;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import ga.e;
import ga.r;
import gf.c;
import gf.j;
import java.util.Arrays;
import java.util.HashMap;
import kotlin.jvm.internal.g;
import lib.zj.office.fc.hssf.formula.eval.ValueEval;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements e {
    public static int b(Path path, float f10, float f11, Rect rect, int i10) {
        path.lineTo(f10, f11);
        return rect.centerX() - i10;
    }

    public static String c(String str, int i10) {
        return str + i10;
    }

    public static String d(String str, StringBuilder sb2) {
        sb2.append(be.a.c(str));
        return sb2.toString();
    }

    public static String e(ValueEval valueEval, StringBuilder sb2, String str) {
        sb2.append(valueEval.getClass().getName());
        sb2.append(str);
        return sb2.toString();
    }

    public static String f(Object[] objArr, int i10, String str, String str2) {
        String format = String.format(str, Arrays.copyOf(objArr, i10));
        g.d(format, str2);
        return format;
    }

    public static StringBuilder g(String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(str2);
        sb2.append(str3);
        return sb2;
    }

    public static void h(int i10, HashMap hashMap, String str, int i11, String str2, int i12, String str3, int i13, String str4) {
        hashMap.put(str, Integer.valueOf(i10));
        hashMap.put(str2, Integer.valueOf(i11));
        hashMap.put(str3, Integer.valueOf(i12));
        hashMap.put(str4, Integer.valueOf(i13));
    }

    public static /* synthetic */ void i(Object obj) {
        if (obj == null) {
            return;
        }
        throw new ClassCastException();
    }

    public static void j(String str, String str2, String str3) {
        zzea.zzf(str3, str2.concat(String.valueOf(str)));
    }

    public static void k(StringBuilder sb2, int i10, String str, String str2) {
        sb2.append(i10);
        sb2.append(str);
        sb2.append(str2);
    }

    public static void l(c cVar, io.flutter.plugins.pathprovider.a aVar) {
        new gf.b(cVar, "dev.flutter.pigeon.PathProviderApi.getTemporaryPath", new j(), cVar.b()).b(new androidx.appcompat.libconvert.helper.b(aVar, 8));
        new gf.b(cVar, "dev.flutter.pigeon.PathProviderApi.getApplicationSupportPath", new j(), cVar.b()).b(new d(aVar, 10));
        new gf.b(cVar, "dev.flutter.pigeon.PathProviderApi.getApplicationDocumentsPath", new j(), cVar.b()).b(new d9.g(aVar, 7));
        new gf.b(cVar, "dev.flutter.pigeon.PathProviderApi.getApplicationCachePath", new j(), cVar.b()).b(new androidx.appcompat.libconvert.a(aVar, 11));
        new gf.b(cVar, "dev.flutter.pigeon.PathProviderApi.getExternalStoragePath", new j(), cVar.b()).b(new h5.a(aVar, 10));
        new gf.b(cVar, "dev.flutter.pigeon.PathProviderApi.getExternalCachePaths", new j(), cVar.b()).b(new a1.e(aVar, 8));
        new gf.b(cVar, "dev.flutter.pigeon.PathProviderApi.getExternalStoragePaths", new j(), cVar.b()).b(new h5.e(aVar, 5));
    }

    @Override // ga.e
    public Object a(r rVar) {
        return ExecutorsRegistrar.f13493a.get();
    }
}
