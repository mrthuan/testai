package ra;

import a6.h;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
import oa.l;
import ta.f;

/* compiled from: CrashlyticsReportPersistence.java */
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: d  reason: collision with root package name */
    public static final Charset f29488d = Charset.forName("UTF-8");

    /* renamed from: e  reason: collision with root package name */
    public static final int f29489e = 15;

    /* renamed from: f  reason: collision with root package name */
    public static final pa.a f29490f = new pa.a();

    /* renamed from: g  reason: collision with root package name */
    public static final j6.a f29491g = new j6.a(1);

    /* renamed from: h  reason: collision with root package name */
    public static final h6.b f29492h = new h6.b(1);

    /* renamed from: a  reason: collision with root package name */
    public final AtomicInteger f29493a = new AtomicInteger(0);

    /* renamed from: b  reason: collision with root package name */
    public final d f29494b;
    public final f c;

    public c(d dVar, com.google.firebase.crashlytics.internal.settings.a aVar) {
        this.f29494b = dVar;
        this.c = aVar;
    }

    public static void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    public static String d(File file) {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int read = fileInputStream.read(bArr);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    String str = new String(byteArrayOutputStream.toByteArray(), f29488d);
                    fileInputStream.close();
                    return str;
                }
            } catch (Throwable th2) {
                try {
                    fileInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    public static void e(File file, String str) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f29488d);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (Throwable th2) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList();
        d dVar = this.f29494b;
        arrayList.addAll(d.f(dVar.f29498e.listFiles()));
        arrayList.addAll(d.f(dVar.f29499f.listFiles()));
        j6.a aVar = f29491g;
        Collections.sort(arrayList, aVar);
        List f10 = d.f(dVar.f29497d.listFiles());
        Collections.sort(f10, aVar);
        arrayList.addAll(f10);
        return arrayList;
    }

    public final void c(l lVar, String str, boolean z10) {
        String str2;
        d dVar = this.f29494b;
        int i10 = ((com.google.firebase.crashlytics.internal.settings.a) this.c).b().f29977a.f29984a;
        f29490f.getClass();
        ya.d dVar2 = pa.a.f23839a;
        dVar2.getClass();
        StringWriter stringWriter = new StringWriter();
        try {
            dVar2.a(lVar, stringWriter);
        } catch (IOException unused) {
        }
        String stringWriter2 = stringWriter.toString();
        String format = String.format(Locale.US, "%010d", Integer.valueOf(this.f29493a.getAndIncrement()));
        if (z10) {
            str2 = "_";
        } else {
            str2 = "";
        }
        try {
            e(dVar.c(str, h.d("event", format, str2)), stringWriter2);
        } catch (IOException unused2) {
        }
        a aVar = new a();
        dVar.getClass();
        File file = new File(dVar.c, str);
        file.mkdirs();
        List<File> f10 = d.f(file.listFiles(aVar));
        Collections.sort(f10, new b(0));
        int size = f10.size();
        for (File file2 : f10) {
            if (size > i10) {
                d.e(file2);
                size--;
            } else {
                return;
            }
        }
    }
}
