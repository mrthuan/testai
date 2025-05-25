package com.google.firebase.crashlytics.ndk;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.ndk.g;
import ja.d;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.zip.GZIPOutputStream;
import oa.c;
import oa.d0;
import org.json.JSONObject;

/* compiled from: CrashpadController.java */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: d  reason: collision with root package name */
    public static final Charset f13549d = Charset.forName("UTF-8");

    /* renamed from: a  reason: collision with root package name */
    public final Context f13550a;

    /* renamed from: b  reason: collision with root package name */
    public final f f13551b;
    public final ra.d c;

    public b(Context context, f fVar, ra.d dVar) {
        this.f13550a = context;
        this.f13551b = fVar;
        this.c = dVar;
    }

    public static String a(InputStream inputStream) {
        Base64.Encoder encoder;
        String encodeToString;
        if (inputStream == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream2);
                    gZIPOutputStream.write(byteArray);
                    gZIPOutputStream.finish();
                    encoder = Base64.getEncoder();
                    encodeToString = encoder.encodeToString(byteArrayOutputStream2.toByteArray());
                    gZIPOutputStream.close();
                    byteArrayOutputStream2.close();
                    return encodeToString;
                } catch (Throwable th2) {
                    try {
                        byteArrayOutputStream2.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        }
    }

    public static File c(File file, String str) {
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return null;
        }
        for (File file2 : listFiles) {
            if (file2.getName().endsWith(str)) {
                return file2;
            }
        }
        return null;
    }

    public static void g(ra.d dVar, String str, String str2, String str3) {
        BufferedWriter bufferedWriter;
        File file = new File(dVar.b(str), str3);
        BufferedWriter bufferedWriter2 = null;
        try {
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), f13549d));
        } catch (IOException unused) {
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            bufferedWriter.write(str2);
            file.toString();
            CommonUtils.a(bufferedWriter);
        } catch (IOException unused2) {
            bufferedWriter2 = bufferedWriter;
            file.toString();
            CommonUtils.a(bufferedWriter2);
        } catch (Throwable th3) {
            th = th3;
            bufferedWriter2 = bufferedWriter;
            file.toString();
            CommonUtils.a(bufferedWriter2);
            throw th;
        }
    }

    public final g b(String str) {
        List<Object> historicalProcessExitReasons;
        int importance;
        String processName;
        int reason;
        long timestamp;
        int pid;
        long pss;
        long rss;
        InputStream traceInputStream;
        int reason2;
        long timestamp2;
        ra.d dVar = this.c;
        File b10 = dVar.b(str);
        File file = new File(b10, "pending");
        file.getAbsolutePath();
        Log.isLoggable("FirebaseCrashlytics", 2);
        File c = c(file, ".dmp");
        if (c != null) {
            c.exists();
        }
        Log.isLoggable("FirebaseCrashlytics", 2);
        g.a aVar = new g.a();
        if (b10.exists() && file.exists()) {
            File c10 = c(file, ".dmp");
            oa.c cVar = null;
            String str2 = null;
            cVar = null;
            if (Build.VERSION.SDK_INT >= 31) {
                historicalProcessExitReasons = ((ActivityManager) this.f13550a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                long lastModified = dVar.c(str, "start-time").lastModified();
                ArrayList arrayList = new ArrayList();
                for (Object obj : historicalProcessExitReasons) {
                    ApplicationExitInfo d10 = androidx.window.layout.b.d(obj);
                    reason2 = d10.getReason();
                    if (reason2 == 5) {
                        timestamp2 = d10.getTimestamp();
                        if (timestamp2 >= lastModified) {
                            arrayList.add(d10);
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    ApplicationExitInfo d11 = androidx.window.layout.b.d(arrayList.get(0));
                    c.a aVar2 = new c.a();
                    importance = d11.getImportance();
                    aVar2.f22920d = Integer.valueOf(importance);
                    processName = d11.getProcessName();
                    aVar2.b(processName);
                    reason = d11.getReason();
                    aVar2.c = Integer.valueOf(reason);
                    timestamp = d11.getTimestamp();
                    aVar2.f22923g = Long.valueOf(timestamp);
                    pid = d11.getPid();
                    aVar2.f22918a = Integer.valueOf(pid);
                    pss = d11.getPss();
                    aVar2.f22921e = Long.valueOf(pss);
                    rss = d11.getRss();
                    aVar2.f22922f = Long.valueOf(rss);
                    try {
                        traceInputStream = d11.getTraceInputStream();
                        str2 = a(traceInputStream);
                    } catch (IOException unused) {
                    }
                    aVar2.f22924h = str2;
                    cVar = aVar2.a();
                }
            }
            aVar.f13563a = new g.b(c10, cVar);
            aVar.f13564b = c(b10, ".device_info");
            aVar.c = new File(b10, "session.json");
            aVar.f13565d = new File(b10, "app.json");
            aVar.f13566e = new File(b10, "device.json");
            aVar.f13567f = new File(b10, "os.json");
        }
        return new g(aVar);
    }

    public final void d(long j10, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("session_id", str);
        hashMap.put("generator", str2);
        hashMap.put("started_at_seconds", Long.valueOf(j10));
        g(this.c, str, new JSONObject(hashMap).toString(), "session.json");
    }

    public final void e(String str, d0.a aVar) {
        String a10 = aVar.a();
        String e10 = aVar.e();
        String f10 = aVar.f();
        String d10 = aVar.d();
        int b10 = aVar.b();
        ja.d c = aVar.c();
        if (c.f19075b == null) {
            c.f19075b = new d.a(c);
        }
        String str2 = c.f19075b.f19076a;
        ja.d c10 = aVar.c();
        if (c10.f19075b == null) {
            c10.f19075b = new d.a(c10);
        }
        String str3 = c10.f19075b.f19077b;
        HashMap hashMap = new HashMap();
        hashMap.put("app_identifier", a10);
        hashMap.put("version_code", e10);
        hashMap.put("version_name", f10);
        hashMap.put("install_uuid", d10);
        hashMap.put("delivery_mechanism", Integer.valueOf(b10));
        if (str2 == null) {
            str2 = "";
        }
        hashMap.put("development_platform", str2);
        if (str3 == null) {
            str3 = "";
        }
        hashMap.put("development_platform_version", str3);
        g(this.c, str, new JSONObject(hashMap).toString(), "app.json");
    }

    public final void f(String str, d0.b bVar) {
        int a10 = bVar.a();
        String f10 = bVar.f();
        int b10 = bVar.b();
        long i10 = bVar.i();
        long c = bVar.c();
        boolean d10 = bVar.d();
        int h10 = bVar.h();
        String e10 = bVar.e();
        String g10 = bVar.g();
        HashMap hashMap = new HashMap();
        hashMap.put("arch", Integer.valueOf(a10));
        hashMap.put("build_model", f10);
        hashMap.put("available_processors", Integer.valueOf(b10));
        hashMap.put("total_ram", Long.valueOf(i10));
        hashMap.put("disk_space", Long.valueOf(c));
        hashMap.put("is_emulator", Boolean.valueOf(d10));
        hashMap.put("state", Integer.valueOf(h10));
        hashMap.put("build_manufacturer", e10);
        hashMap.put("build_product", g10);
        g(this.c, str, new JSONObject(hashMap).toString(), "device.json");
    }

    public final void h(String str, d0.c cVar) {
        String c = cVar.c();
        String b10 = cVar.b();
        boolean a10 = cVar.a();
        HashMap hashMap = new HashMap();
        hashMap.put("version", c);
        hashMap.put("build_version", b10);
        hashMap.put("is_rooted", Boolean.valueOf(a10));
        g(this.c, str, new JSONObject(hashMap).toString(), "os.json");
    }
}
