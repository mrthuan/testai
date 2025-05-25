package n3;

import android.content.Context;
import com.airbnb.lottie.network.FileExtension;
import com.google.android.play.core.assetpacks.s2;
import e3.e;
import e3.f;
import e3.p;
import e3.u;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.zip.ZipInputStream;
import p3.c;
import q3.b;
import q9.l;

/* compiled from: NetworkFetcher.java */
/* loaded from: classes.dex */
public final class a implements l {

    /* renamed from: a  reason: collision with root package name */
    public final Object f22331a;

    /* renamed from: b  reason: collision with root package name */
    public Object f22332b;
    public final Object c;

    public a(s2 s2Var, l lVar, l lVar2) {
        this.f22331a = s2Var;
        this.f22332b = lVar;
        this.c = lVar2;
    }

    public static String c(HttpURLConnection httpURLConnection) {
        httpURLConnection.getResponseCode();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            try {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        sb2.append(readLine);
                        sb2.append('\n');
                    } else {
                        try {
                            break;
                        } catch (Exception unused) {
                        }
                    }
                } catch (Throwable th2) {
                    try {
                        bufferedReader.close();
                    } catch (Exception unused2) {
                    }
                    throw th2;
                }
            } catch (Exception e10) {
                throw e10;
            }
        }
        bufferedReader.close();
        return sb2.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0041  */
    @Override // q9.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f22331a
            q9.m r0 = (q9.m) r0
            com.google.android.play.core.assetpacks.s2 r0 = (com.google.android.play.core.assetpacks.s2) r0
            android.content.Context r0 = r0.b()
            java.lang.Object r1 = r5.f22332b
            q9.m r1 = (q9.m) r1
            q9.e r1 = androidx.activity.s.j(r1)
            q9.k r2 = new q9.k
            r2.<init>(r1)
            java.lang.Object r1 = r5.c
            q9.m r1 = (q9.m) r1
            q9.e r1 = androidx.activity.s.j(r1)
            q9.k r3 = new q9.k
            r3.<init>(r1)
            android.content.pm.PackageManager r1 = r0.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3e
            java.lang.String r0 = r0.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3e
            r4 = 128(0x80, float:1.8E-43)
            android.content.pm.ApplicationInfo r0 = r1.getApplicationInfo(r0, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3e
            android.os.Bundle r0 = r0.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3e
            if (r0 != 0) goto L37
            goto L3e
        L37:
            java.lang.String r1 = "local_testing_dir"
            java.lang.String r0 = r0.getString(r1)
            goto L3f
        L3e:
            r0 = 0
        L3f:
            if (r0 != 0) goto L48
            java.lang.Object r0 = r2.a()
            com.google.android.play.core.assetpacks.t2 r0 = (com.google.android.play.core.assetpacks.t2) r0
            goto L4e
        L48:
            java.lang.Object r0 = r3.a()
            com.google.android.play.core.assetpacks.t2 r0 = (com.google.android.play.core.assetpacks.t2) r0
        L4e:
            o9.d.d(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n3.a.a():java.lang.Object");
    }

    public final p b() {
        c.a();
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL((String) this.f22332b).openConnection();
        httpURLConnection.setRequestMethod("GET");
        try {
            httpURLConnection.connect();
            if (httpURLConnection.getErrorStream() == null && httpURLConnection.getResponseCode() == 200) {
                p d10 = d(httpURLConnection);
                V v10 = d10.f16439a;
                c.a();
                return d10;
            }
            String c = c(httpURLConnection);
            return new p(new IllegalArgumentException("Unable to fetch " + ((String) this.f22332b) + ". Failed with " + httpURLConnection.getResponseCode() + "\n" + c));
        } catch (Exception e10) {
            return new p(e10);
        } finally {
            httpURLConnection.disconnect();
        }
    }

    public final p d(HttpURLConnection httpURLConnection) {
        FileExtension fileExtension;
        p<e> c;
        String contentType = httpURLConnection.getContentType();
        if (contentType == null) {
            contentType = "application/json";
        }
        boolean contains = contentType.contains("application/zip");
        Object obj = this.c;
        if (contains) {
            c.a();
            fileExtension = FileExtension.ZIP;
            androidx.core.content.e eVar = (androidx.core.content.e) obj;
            if (eVar == null) {
                c = f.f(new ZipInputStream(httpURLConnection.getInputStream()), null);
            } else {
                c = f.f(new ZipInputStream(new FileInputStream(eVar.l((String) this.f22332b, httpURLConnection.getInputStream(), fileExtension))), (String) this.f22332b);
            }
        } else {
            c.a();
            fileExtension = FileExtension.JSON;
            androidx.core.content.e eVar2 = (androidx.core.content.e) obj;
            if (eVar2 == null) {
                c = f.c(httpURLConnection.getInputStream(), null);
            } else {
                c = f.c(new FileInputStream(new File(eVar2.l((String) this.f22332b, httpURLConnection.getInputStream(), fileExtension).getAbsolutePath())), (String) this.f22332b);
            }
        }
        androidx.core.content.e eVar3 = (androidx.core.content.e) obj;
        if (eVar3 != null && c.f16439a != null) {
            eVar3.getClass();
            File file = new File(eVar3.i(), androidx.core.content.e.g((String) this.f22332b, fileExtension, true));
            File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
            boolean renameTo = file.renameTo(file2);
            file2.toString();
            c.a();
            if (!renameTo) {
                c.b("Unable to rename cache file " + file.getAbsolutePath() + " to " + file2.getAbsolutePath() + ".");
            }
        }
        return c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object e(Object obj, Object obj2) {
        b bVar = (b) this.f22331a;
        bVar.f29077a = obj;
        bVar.f29078b = obj2;
        return this.c;
    }

    public a(u uVar) {
        this.f22331a = new b();
        this.c = null;
        this.c = uVar;
    }

    public a(Context context, String str, String str2) {
        Context applicationContext = context.getApplicationContext();
        this.f22331a = applicationContext;
        this.f22332b = str;
        if (str2 == null) {
            this.c = null;
        } else {
            this.c = new androidx.core.content.e(applicationContext);
        }
    }
}
