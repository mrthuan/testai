package ye;

import android.content.res.XmlResourceParser;
import org.json.JSONArray;

/* compiled from: ApplicationInfoLoader.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final String f32122a = d.class.getName().concat(".aot-shared-library-name");

    /* renamed from: b  reason: collision with root package name */
    public static final String f32123b = d.class.getName().concat(".vm-snapshot-data");
    public static final String c = d.class.getName().concat(".isolate-snapshot-data");

    /* renamed from: d  reason: collision with root package name */
    public static final String f32124d = d.class.getName().concat(".flutter-assets-dir");

    /* JADX WARN: Removed duplicated region for block: B:39:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static ye.b a(android.content.Context r10) {
        /*
            android.content.pm.PackageManager r0 = r10.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L9a
            java.lang.String r1 = r10.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L9a
            r2 = 128(0x80, float:1.8E-43)
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo(r1, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L9a
            ye.b r7 = new ye.b
            android.os.Bundle r1 = r0.metaData
            r2 = 0
            if (r1 != 0) goto L17
            r3 = r2
            goto L1e
        L17:
            java.lang.String r3 = ye.a.f32122a
            java.lang.String r1 = r1.getString(r3, r2)
            r3 = r1
        L1e:
            android.os.Bundle r1 = r0.metaData
            if (r1 != 0) goto L23
            goto L28
        L23:
            java.lang.String r4 = ye.a.f32123b
            r1.getString(r4, r2)
        L28:
            android.os.Bundle r1 = r0.metaData
            if (r1 != 0) goto L2d
            goto L32
        L2d:
            java.lang.String r4 = ye.a.c
            r1.getString(r4, r2)
        L32:
            android.os.Bundle r1 = r0.metaData
            if (r1 != 0) goto L38
            r4 = r2
            goto L3f
        L38:
            java.lang.String r4 = ye.a.f32124d
            java.lang.String r1 = r1.getString(r4, r2)
            r4 = r1
        L3f:
            android.os.Bundle r1 = r0.metaData
            r5 = 1
            if (r1 != 0) goto L45
            goto L81
        L45:
            java.lang.String r6 = "io.flutter.network-policy"
            r8 = 0
            int r1 = r1.getInt(r6, r8)
            if (r1 > 0) goto L4f
            goto L81
        L4f:
            org.json.JSONArray r6 = new org.json.JSONArray
            r6.<init>()
            android.content.res.Resources r10 = r10.getResources()     // Catch: java.lang.Throwable -> L81
            android.content.res.XmlResourceParser r10 = r10.getXml(r1)     // Catch: java.lang.Throwable -> L81
            r10.next()     // Catch: java.lang.Throwable -> L81
            int r1 = r10.getEventType()     // Catch: java.lang.Throwable -> L81
        L63:
            if (r1 == r5) goto L7c
            r9 = 2
            if (r1 != r9) goto L77
            java.lang.String r1 = r10.getName()     // Catch: java.lang.Throwable -> L81
            java.lang.String r9 = "domain-config"
            boolean r1 = r1.equals(r9)     // Catch: java.lang.Throwable -> L81
            if (r1 == 0) goto L77
            b(r10, r6, r8)     // Catch: java.lang.Throwable -> L81
        L77:
            int r1 = r10.next()     // Catch: java.lang.Throwable -> L81
            goto L63
        L7c:
            java.lang.String r10 = r6.toString()
            goto L82
        L81:
            r10 = r2
        L82:
            java.lang.String r6 = r0.nativeLibraryDir
            android.os.Bundle r0 = r0.metaData
            if (r0 != 0) goto L8a
            r0 = r5
            goto L90
        L8a:
            java.lang.String r1 = "io.flutter.automatically-register-plugins"
            boolean r0 = r0.getBoolean(r1, r5)
        L90:
            r1 = r7
            r2 = r3
            r3 = r4
            r4 = r10
            r5 = r6
            r6 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            return r7
        L9a:
            r10 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ye.a.a(android.content.Context):ye.b");
    }

    public static void b(XmlResourceParser xmlResourceParser, JSONArray jSONArray, boolean z10) {
        boolean attributeBooleanValue = xmlResourceParser.getAttributeBooleanValue(null, "cleartextTrafficPermitted", z10);
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 2) {
                if (xmlResourceParser.getName().equals("domain")) {
                    boolean attributeBooleanValue2 = xmlResourceParser.getAttributeBooleanValue(null, "includeSubdomains", false);
                    xmlResourceParser.next();
                    if (xmlResourceParser.getEventType() == 4) {
                        String trim = xmlResourceParser.getText().trim();
                        JSONArray jSONArray2 = new JSONArray();
                        jSONArray2.put(trim);
                        jSONArray2.put(attributeBooleanValue2);
                        jSONArray2.put(attributeBooleanValue);
                        jSONArray.put(jSONArray2);
                        xmlResourceParser.next();
                        if (xmlResourceParser.getEventType() != 3) {
                            throw new IllegalStateException("Expected end of domain tag");
                        }
                    } else {
                        throw new IllegalStateException("Expected text");
                    }
                } else if (xmlResourceParser.getName().equals("domain-config")) {
                    b(xmlResourceParser, jSONArray, attributeBooleanValue);
                } else {
                    String name = xmlResourceParser.getName();
                    int eventType = xmlResourceParser.getEventType();
                    while (true) {
                        if (eventType != 3 || xmlResourceParser.getName() != name) {
                            eventType = xmlResourceParser.next();
                        }
                    }
                }
            } else if (next == 3) {
                return;
            }
        }
    }
}
