package e3;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import lib.zj.office.fc.openxml4j.opc.PackagingURIHelper;
import p3.g;

/* compiled from: LottieCompositionFactory.java */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap f16355a = new HashMap();

    /* compiled from: LottieCompositionFactory.java */
    /* loaded from: classes.dex */
    public class a implements m<e> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f16356a;

        public a(String str) {
            this.f16356a = str;
        }

        @Override // e3.m
        public final void onResult(e eVar) {
            f.f16355a.remove(this.f16356a);
        }
    }

    /* compiled from: LottieCompositionFactory.java */
    /* loaded from: classes.dex */
    public class b implements m<Throwable> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f16357a;

        public b(String str) {
            this.f16357a = str;
        }

        @Override // e3.m
        public final void onResult(Throwable th2) {
            f.f16355a.remove(this.f16357a);
        }
    }

    /* compiled from: LottieCompositionFactory.java */
    /* loaded from: classes.dex */
    public class c implements Callable<p<e>> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ e f16358a;

        public c(e eVar) {
            this.f16358a = eVar;
        }

        @Override // java.util.concurrent.Callable
        public final p<e> call() {
            return new p<>(this.f16358a);
        }
    }

    public static r<e> a(String str, Callable<p<e>> callable) {
        e eVar;
        if (str == null) {
            eVar = null;
        } else {
            eVar = j3.f.f19034b.f19035a.get(str);
        }
        if (eVar != null) {
            return new r<>(new c(eVar), false);
        }
        HashMap hashMap = f16355a;
        if (str != null && hashMap.containsKey(str)) {
            return (r) hashMap.get(str);
        }
        r<e> rVar = new r<>(callable, false);
        if (str != null) {
            a aVar = new a(str);
            synchronized (rVar) {
                if (rVar.f16445d != null && rVar.f16445d.f16439a != null) {
                    aVar.onResult(rVar.f16445d.f16439a);
                }
                rVar.f16443a.add(aVar);
            }
            rVar.b(new b(str));
            hashMap.put(str, rVar);
        }
        return rVar;
    }

    public static p<e> b(Context context, String str, String str2) {
        try {
            if (str.endsWith(".zip")) {
                return f(new ZipInputStream(context.getAssets().open(str)), str2);
            }
            return c(context.getAssets().open(str), str2);
        } catch (IOException e10) {
            return new p<>(e10);
        }
    }

    public static p<e> c(InputStream inputStream, String str) {
        try {
            kk.t m10 = ge.a.m(ge.a.Z(inputStream));
            String[] strArr = JsonReader.f6153e;
            return d(new com.airbnb.lottie.parser.moshi.a(m10), str, true);
        } finally {
            p3.g.b(inputStream);
        }
    }

    public static p d(com.airbnb.lottie.parser.moshi.a aVar, String str, boolean z10) {
        try {
            try {
                e a10 = o3.q.a(aVar);
                if (str != null) {
                    j3.f.f19034b.f19035a.put(str, a10);
                }
                p pVar = new p(a10);
                if (z10) {
                    p3.g.b(aVar);
                }
                return pVar;
            } catch (Exception e10) {
                p pVar2 = new p(e10);
                if (z10) {
                    p3.g.b(aVar);
                }
                return pVar2;
            }
        } catch (Throwable th2) {
            if (z10) {
                p3.g.b(aVar);
            }
            throw th2;
        }
    }

    public static p<e> e(Context context, int i10, String str) {
        try {
            return c(context.getResources().openRawResource(i10), str);
        } catch (Resources.NotFoundException e10) {
            return new p<>(e10);
        }
    }

    public static p<e> f(ZipInputStream zipInputStream, String str) {
        try {
            return g(zipInputStream, str);
        } finally {
            p3.g.b(zipInputStream);
        }
    }

    public static p<e> g(ZipInputStream zipInputStream, String str) {
        l lVar;
        String[] split;
        HashMap hashMap = new HashMap();
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            e eVar = null;
            while (nextEntry != null) {
                String name = nextEntry.getName();
                if (name.contains("__MACOSX")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().contains(".json")) {
                    kk.t m10 = ge.a.m(ge.a.Z(zipInputStream));
                    String[] strArr = JsonReader.f6153e;
                    eVar = (e) d(new com.airbnb.lottie.parser.moshi.a(m10), null, false).f16439a;
                } else {
                    if (!name.contains(".png") && !name.contains(".webp")) {
                        zipInputStream.closeEntry();
                    }
                    hashMap.put(name.split(PackagingURIHelper.FORWARD_SLASH_STRING)[split.length - 1], BitmapFactory.decodeStream(zipInputStream));
                }
                nextEntry = zipInputStream.getNextEntry();
            }
            if (eVar == null) {
                return new p<>(new IllegalArgumentException("Unable to parse composition"));
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                String str2 = (String) entry.getKey();
                Iterator<l> it = eVar.f16343d.values().iterator();
                while (true) {
                    if (it.hasNext()) {
                        lVar = it.next();
                        if (lVar.c.equals(str2)) {
                            break;
                        }
                    } else {
                        lVar = null;
                        break;
                    }
                }
                if (lVar != null) {
                    Bitmap bitmap = (Bitmap) entry.getValue();
                    g.a aVar = p3.g.f23679a;
                    int width = bitmap.getWidth();
                    int i10 = lVar.f16411a;
                    int i11 = lVar.f16412b;
                    if (width != i10 || bitmap.getHeight() != i11) {
                        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i10, i11, true);
                        bitmap.recycle();
                        bitmap = createScaledBitmap;
                    }
                    lVar.f16413d = bitmap;
                }
            }
            for (Map.Entry<String, l> entry2 : eVar.f16343d.entrySet()) {
                if (entry2.getValue().f16413d == null) {
                    return new p<>(new IllegalStateException("There is no image for " + entry2.getValue().c));
                }
            }
            if (str != null) {
                j3.f.f19034b.f19035a.put(str, eVar);
            }
            return new p<>(eVar);
        } catch (IOException e10) {
            return new p<>(e10);
        }
    }

    public static String h(Context context, int i10) {
        boolean z10;
        String str;
        StringBuilder sb2 = new StringBuilder("rawRes");
        if ((context.getResources().getConfiguration().uiMode & 48) == 32) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            str = "_night_";
        } else {
            str = "_day_";
        }
        sb2.append(str);
        sb2.append(i10);
        return sb2.toString();
    }
}
