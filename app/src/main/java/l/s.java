package l;

import android.content.Context;
import android.util.Xml;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: AppLocalesStorageHelper.java */
/* loaded from: classes.dex */
public final class s {

    /* compiled from: AppLocalesStorageHelper.java */
    /* loaded from: classes.dex */
    public static class a implements Executor {

        /* renamed from: a  reason: collision with root package name */
        public final Object f20371a = new Object();

        /* renamed from: b  reason: collision with root package name */
        public final ArrayDeque f20372b = new ArrayDeque();
        public final Executor c;

        /* renamed from: d  reason: collision with root package name */
        public Runnable f20373d;

        public a(b bVar) {
            this.c = bVar;
        }

        public final void a() {
            synchronized (this.f20371a) {
                Runnable runnable = (Runnable) this.f20372b.poll();
                this.f20373d = runnable;
                if (runnable != null) {
                    this.c.execute(runnable);
                }
            }
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            synchronized (this.f20371a) {
                this.f20372b.add(new r(0, this, runnable));
                if (this.f20373d == null) {
                    a();
                }
            }
        }
    }

    /* compiled from: AppLocalesStorageHelper.java */
    /* loaded from: classes.dex */
    public static class b implements Executor {
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            new Thread(runnable).start();
        }
    }

    public static void a(Context context, String str) {
        if (str.equals("")) {
            context.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
            return;
        }
        try {
            FileOutputStream openFileOutput = context.openFileOutput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file", 0);
            XmlSerializer newSerializer = Xml.newSerializer();
            try {
                newSerializer.setOutput(openFileOutput, null);
                newSerializer.startDocument("UTF-8", Boolean.TRUE);
                newSerializer.startTag(null, "locales");
                newSerializer.attribute(null, "application_locales", str);
                newSerializer.endTag(null, "locales");
                newSerializer.endDocument();
                if (openFileOutput == null) {
                    return;
                }
            } catch (Exception unused) {
                if (openFileOutput == null) {
                    return;
                }
            } catch (Throwable th2) {
                if (openFileOutput != null) {
                    try {
                        openFileOutput.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th2;
            }
            try {
                openFileOutput.close();
            } catch (IOException unused3) {
            }
        } catch (FileNotFoundException unused4) {
            String.format("Storing App Locales : FileNotFoundException: Cannot open file %s for writing ", "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0037, code lost:
        r1 = r3.getAttributeValue(null, "application_locales");
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
        if (r2 != null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0040, code lost:
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004b, code lost:
        if (r2 != null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0052, code lost:
        if (r1.isEmpty() != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0055, code lost:
        r8.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0058, code lost:
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String b(android.content.Context r8) {
        /*
            java.lang.String r0 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            java.lang.String r1 = ""
            java.io.FileInputStream r2 = r8.openFileInput(r0)     // Catch: java.io.FileNotFoundException -> L58
            org.xmlpull.v1.XmlPullParser r3 = android.util.Xml.newPullParser()     // Catch: java.lang.Throwable -> L44 java.lang.Throwable -> L4b
            java.lang.String r4 = "UTF-8"
            r3.setInput(r2, r4)     // Catch: java.lang.Throwable -> L44 java.lang.Throwable -> L4b
            int r4 = r3.getDepth()     // Catch: java.lang.Throwable -> L44 java.lang.Throwable -> L4b
        L15:
            int r5 = r3.next()     // Catch: java.lang.Throwable -> L44 java.lang.Throwable -> L4b
            r6 = 1
            if (r5 == r6) goto L3e
            r6 = 3
            if (r5 != r6) goto L25
            int r7 = r3.getDepth()     // Catch: java.lang.Throwable -> L44 java.lang.Throwable -> L4b
            if (r7 <= r4) goto L3e
        L25:
            if (r5 == r6) goto L15
            r6 = 4
            if (r5 != r6) goto L2b
            goto L15
        L2b:
            java.lang.String r5 = r3.getName()     // Catch: java.lang.Throwable -> L44 java.lang.Throwable -> L4b
            java.lang.String r6 = "locales"
            boolean r5 = r5.equals(r6)     // Catch: java.lang.Throwable -> L44 java.lang.Throwable -> L4b
            if (r5 == 0) goto L15
            java.lang.String r4 = "application_locales"
            r5 = 0
            java.lang.String r1 = r3.getAttributeValue(r5, r4)     // Catch: java.lang.Throwable -> L44 java.lang.Throwable -> L4b
        L3e:
            if (r2 == 0) goto L4e
        L40:
            r2.close()     // Catch: java.io.IOException -> L4e
            goto L4e
        L44:
            r8 = move-exception
            if (r2 == 0) goto L4a
            r2.close()     // Catch: java.io.IOException -> L4a
        L4a:
            throw r8
        L4b:
            if (r2 == 0) goto L4e
            goto L40
        L4e:
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L55
            goto L58
        L55:
            r8.deleteFile(r0)
        L58:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l.s.b(android.content.Context):java.lang.String");
    }
}
