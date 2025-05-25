package com.apm.insight.l;

import android.text.TextUtils;
import com.apm.insight.l.e;
import com.apm.insight.nativecrash.NativeImpl;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a  reason: collision with root package name */
    private static final StackTraceElement f6664a = new StackTraceElement("", "", "", 0);

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f6665a;

        /* renamed from: b  reason: collision with root package name */
        public int f6666b;

        public a(int i10, int i11) {
            this.f6665a = i10;
            this.f6666b = i11;
        }

        public JSONObject a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("start", this.f6665a);
                jSONObject.put("end", this.f6666b);
            } catch (Throwable unused) {
            }
            return jSONObject;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a(java.lang.String r8) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.io.File r0 = new java.io.File
            r0.<init>(r8)
            boolean r8 = r0.exists()
            if (r8 != 0) goto L14
            return r1
        L14:
            java.util.LinkedList r8 = new java.util.LinkedList
            r8.<init>()
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r4 = 10
            r5 = 0
            java.io.BufferedReader r6 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L5b
            java.io.FileReader r7 = new java.io.FileReader     // Catch: java.lang.Throwable -> L5b
            r7.<init>(r0)     // Catch: java.lang.Throwable -> L5b
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L5b
            r0 = r5
        L31:
            java.lang.String r1 = r6.readLine()     // Catch: java.lang.Throwable -> L5a
            if (r1 == 0) goto L56
            r7 = 256(0x100, float:3.59E-43)
            if (r0 > r7) goto L45
            r8.add(r1)     // Catch: java.lang.Throwable -> L5a
            r3.append(r1)     // Catch: java.lang.Throwable -> L5a
            r3.append(r4)     // Catch: java.lang.Throwable -> L5a
            goto L53
        L45:
            r2.add(r1)     // Catch: java.lang.Throwable -> L5a
            int r1 = r2.size()     // Catch: java.lang.Throwable -> L5a
            if (r1 <= r7) goto L53
            r2.poll()     // Catch: java.lang.Throwable -> L5a
            int r5 = r5 + 1
        L53:
            int r0 = r0 + 1
            goto L31
        L56:
            com.apm.insight.l.j.a(r6)
            goto L5e
        L5a:
            r1 = r6
        L5b:
            com.apm.insight.l.j.a(r1)
        L5e:
            boolean r8 = r2.isEmpty()
            if (r8 != 0) goto L8a
            if (r5 == 0) goto L73
            java.lang.String r8 = "\t... skip "
            r3.append(r8)
            r3.append(r5)
            java.lang.String r8 = " lines\n"
            r3.append(r8)
        L73:
            java.util.Iterator r8 = r2.iterator()
        L77:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L8a
            java.lang.Object r0 = r8.next()
            java.lang.String r0 = (java.lang.String) r0
            r3.append(r0)
            r3.append(r4)
            goto L77
        L8a:
            java.lang.String r8 = r3.toString()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.l.u.a(java.lang.String):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00d5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0029 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static org.json.JSONObject b(java.lang.String r16) {
        /*
            r0 = r16
            java.lang.String r1 = ")"
            java.lang.String r2 = "("
            r3 = 0
            java.util.Map r4 = java.lang.Thread.getAllStackTraces()     // Catch: java.lang.Throwable -> Le0
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Le0
            r5.<init>()     // Catch: java.lang.Throwable -> Le0
            if (r4 != 0) goto L13
            return r3
        L13:
            java.lang.String r6 = "thread_all_count"
            int r7 = r4.size()     // Catch: java.lang.Throwable -> Le0
            r5.put(r6, r7)     // Catch: java.lang.Throwable -> Le0
            org.json.JSONArray r6 = new org.json.JSONArray     // Catch: java.lang.Throwable -> Le0
            r6.<init>()     // Catch: java.lang.Throwable -> Le0
            java.util.Set r4 = r4.entrySet()     // Catch: java.lang.Throwable -> Le0
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> Le0
        L29:
            boolean r7 = r4.hasNext()     // Catch: java.lang.Throwable -> Le0
            if (r7 == 0) goto Lda
            java.lang.Object r7 = r4.next()     // Catch: java.lang.Throwable -> Le0
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7     // Catch: java.lang.Throwable -> Le0
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Le0
            r8.<init>()     // Catch: java.lang.Throwable -> Le0
            java.lang.Object r9 = r7.getKey()     // Catch: java.lang.Throwable -> Le0
            java.lang.Thread r9 = (java.lang.Thread) r9     // Catch: java.lang.Throwable -> Le0
            java.lang.String r10 = r9.getName()     // Catch: java.lang.Throwable -> Le0
            boolean r11 = c(r10)     // Catch: java.lang.Throwable -> Le0
            if (r11 != 0) goto L29
            if (r0 == 0) goto L5f
            boolean r11 = r0.equals(r10)     // Catch: java.lang.Throwable -> Le0
            if (r11 != 0) goto L29
            boolean r11 = r10.startsWith(r0)     // Catch: java.lang.Throwable -> Le0
            if (r11 != 0) goto L29
            boolean r10 = r10.endsWith(r0)     // Catch: java.lang.Throwable -> Le0
            if (r10 == 0) goto L5f
            goto L29
        L5f:
            java.lang.String r10 = "thread_name"
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Le0
            r11.<init>()     // Catch: java.lang.Throwable -> Le0
            java.lang.String r12 = r9.getName()     // Catch: java.lang.Throwable -> Le0
            r11.append(r12)     // Catch: java.lang.Throwable -> Le0
            r11.append(r2)     // Catch: java.lang.Throwable -> Le0
            long r12 = r9.getId()     // Catch: java.lang.Throwable -> Le0
            r11.append(r12)     // Catch: java.lang.Throwable -> Le0
            r11.append(r1)     // Catch: java.lang.Throwable -> Le0
            java.lang.String r9 = r11.toString()     // Catch: java.lang.Throwable -> Le0
            r8.put(r10, r9)     // Catch: java.lang.Throwable -> Le0
            java.lang.Object r7 = r7.getValue()     // Catch: java.lang.Throwable -> Le0
            java.lang.StackTraceElement[] r7 = (java.lang.StackTraceElement[]) r7     // Catch: java.lang.Throwable -> Le0
            if (r7 == 0) goto Ld2
            org.json.JSONArray r10 = new org.json.JSONArray     // Catch: java.lang.Throwable -> Le0
            r10.<init>()     // Catch: java.lang.Throwable -> Le0
            int r11 = r7.length     // Catch: java.lang.Throwable -> Le0
            r12 = 0
            r13 = r12
        L91:
            if (r13 >= r11) goto Lc4
            r14 = r7[r13]     // Catch: java.lang.Throwable -> Le0
            java.lang.String r15 = r14.getClassName()     // Catch: java.lang.Throwable -> Le0
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Le0
            r9.<init>()     // Catch: java.lang.Throwable -> Le0
            r9.append(r15)     // Catch: java.lang.Throwable -> Le0
            java.lang.String r15 = "."
            r9.append(r15)     // Catch: java.lang.Throwable -> Le0
            java.lang.String r15 = r14.getMethodName()     // Catch: java.lang.Throwable -> Le0
            r9.append(r15)     // Catch: java.lang.Throwable -> Le0
            r9.append(r2)     // Catch: java.lang.Throwable -> Le0
            int r14 = r14.getLineNumber()     // Catch: java.lang.Throwable -> Le0
            r9.append(r14)     // Catch: java.lang.Throwable -> Le0
            r9.append(r1)     // Catch: java.lang.Throwable -> Le0
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> Le0
            r10.put(r9)     // Catch: java.lang.Throwable -> Le0
            int r13 = r13 + 1
            goto L91
        Lc4:
            java.lang.String r7 = "thread_stack"
            r8.put(r7, r10)     // Catch: java.lang.Throwable -> Le0
            int r7 = r10.length()     // Catch: java.lang.Throwable -> Le0
            if (r7 <= 0) goto Ld0
            goto Ld2
        Ld0:
            r9 = r12
            goto Ld3
        Ld2:
            r9 = 1
        Ld3:
            if (r9 == 0) goto L29
            r6.put(r8)     // Catch: java.lang.Throwable -> Le0
            goto L29
        Lda:
            java.lang.String r0 = "thread_stacks"
            r5.put(r0, r6)     // Catch: java.lang.Throwable -> Le0
            return r5
        Le0:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.l.u.b(java.lang.String):org.json.JSONObject");
    }

    private static void c(Throwable th2, int i10) {
        if (th2 == null || i10 <= 0) {
            return;
        }
        b(th2, i10);
        for (StackTraceElement stackTraceElement : th2.getStackTrace()) {
            a(stackTraceElement, i10);
        }
        for (Throwable th3 : th2.getSuppressed()) {
            a(th3, i10, "Suppressed: ", "\t");
        }
        Throwable cause = th2.getCause();
        if (cause != null) {
            a(cause, i10, "Caused by: ", "");
        }
    }

    public static boolean d(Throwable th2) {
        if (th2 == null) {
            return false;
        }
        int i10 = 0;
        while (th2 != null) {
            try {
                if ((th2 instanceof OutOfMemoryError) && (th2.getMessage().contains("allocate") || th2.getMessage().contains("thrown"))) {
                    return true;
                }
                if (i10 > 20) {
                    return false;
                }
                i10++;
                th2 = th2.getCause();
            } catch (Throwable unused) {
                return true;
            }
        }
        return false;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:9:0x001b
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public static java.lang.String a(java.lang.Throwable r2) {
        /*
            java.io.StringWriter r0 = new java.io.StringWriter
            r0.<init>()
            java.io.PrintWriter r1 = new java.io.PrintWriter
            r1.<init>(r0)
            a(r2, r1)     // Catch: java.lang.Throwable -> L15
            java.lang.String r2 = r0.toString()     // Catch: java.lang.Throwable -> L15
            r1.close()
            return r2
        L15:
            java.lang.String r2 = ""
            r1.close()
            return r2
        L1b:
            r2 = move-exception
            r1.close()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.l.u.a(java.lang.Throwable):java.lang.String");
    }

    private static void b(Throwable th2, int i10) {
        th2.getClass();
        String localizedMessage = th2.getLocalizedMessage();
        try {
            a(th2.getClass().getName(), i10);
            if (localizedMessage != null) {
                a(": ", i10);
                a(localizedMessage, i10);
            }
            a("\n", i10);
        } catch (Throwable unused) {
        }
    }

    private static boolean c(String str) {
        Set<String> a10 = i.a();
        if (a10.contains(str)) {
            return true;
        }
        for (String str2 : a10) {
            if (!TextUtils.isEmpty(str) && str.startsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    public static String a(Throwable th2, Thread thread, PrintStream printStream, e.a aVar) {
        MessageDigest messageDigest;
        try {
            messageDigest = MessageDigest.getInstance("MD5");
        } catch (Throwable unused) {
            messageDigest = null;
        }
        e eVar = new e(printStream, messageDigest, aVar);
        try {
            a(th2, eVar);
        } catch (Throwable unused2) {
        }
        eVar.close();
        if (messageDigest != null) {
            return a(messageDigest.digest());
        }
        return null;
    }

    public static StackTraceElement[] b(Throwable th2) {
        ArrayList arrayList = new ArrayList();
        try {
            a(th2, arrayList);
        } catch (Throwable unused) {
        }
        return (StackTraceElement[]) arrayList.toArray(new StackTraceElement[arrayList.size()]);
    }

    public static boolean c(Throwable th2) {
        if (th2 == null) {
            return false;
        }
        int i10 = 0;
        while (th2 != null) {
            try {
                if (th2 instanceof OutOfMemoryError) {
                    return true;
                }
                if (i10 > 20) {
                    return false;
                }
                i10++;
                th2 = th2.getCause();
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    private static String a(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return "";
        }
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        char[] cArr2 = new char[bArr.length * 2];
        int i10 = 0;
        for (byte b10 : bArr) {
            int i11 = i10 + 1;
            cArr2[i10] = cArr[(b10 >>> 4) & 15];
            i10 = i11 + 1;
            cArr2[i11] = cArr[b10 & 15];
        }
        return new String(cArr2);
    }

    public static String a(StackTraceElement[] stackTraceElementArr) {
        StringBuilder sb2 = new StringBuilder();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            a(stackTraceElement, sb2);
        }
        return sb2.toString();
    }

    public static StringBuilder a(StackTraceElement stackTraceElement, StringBuilder sb2) {
        String className = stackTraceElement.getClassName();
        sb2.append("  at ");
        sb2.append(className);
        sb2.append(".");
        sb2.append(stackTraceElement.getMethodName());
        sb2.append("(");
        sb2.append(stackTraceElement.getFileName());
        sb2.append(":");
        sb2.append(stackTraceElement.getLineNumber());
        sb2.append(")\n");
        return sb2;
    }

    public static JSONArray a(StackTraceElement[] stackTraceElementArr, String[] strArr) {
        a aVar = new a(-1, -1);
        JSONArray jSONArray = new JSONArray();
        for (int i10 = 0; i10 < stackTraceElementArr.length; i10++) {
            if (aVar.f6665a == -1) {
                if (a(stackTraceElementArr[i10].getClassName(), strArr)) {
                    aVar.f6665a = i10;
                    aVar.f6666b = i10;
                }
            } else if (!a(stackTraceElementArr[i10].getClassName(), strArr)) {
                aVar.f6666b = i10;
                jSONArray.put(aVar.a());
                aVar = new a(-1, -1);
            }
        }
        if (aVar.f6665a != -1) {
            aVar.f6666b = stackTraceElementArr.length;
            jSONArray.put(aVar.a());
        }
        return jSONArray;
    }

    public static JSONArray a(String[] strArr, String[] strArr2) {
        a aVar = new a(-1, -1);
        JSONArray jSONArray = new JSONArray();
        for (int i10 = 0; i10 < strArr.length; i10++) {
            if (aVar.f6665a == -1) {
                if (a(strArr[i10], strArr2)) {
                    aVar.f6665a = i10;
                    aVar.f6666b = i10;
                }
            } else if (!a(strArr[i10], strArr2)) {
                aVar.f6666b = i10;
                jSONArray.put(aVar.a());
                aVar = new a(-1, -1);
            }
        }
        if (aVar.f6665a != -1) {
            aVar.f6666b = strArr.length;
            jSONArray.put(aVar.a());
        }
        return jSONArray;
    }

    private static void a(StackTraceElement stackTraceElement, int i10) {
        String str;
        String valueOf;
        try {
            a("\tat ", i10);
            a(stackTraceElement.getClassName(), i10);
            a(".", i10);
            a(stackTraceElement.getMethodName(), i10);
            if (!stackTraceElement.isNativeMethod()) {
                if (stackTraceElement.getFileName() != null) {
                    if (stackTraceElement.getLineNumber() >= 0) {
                        a("(", i10);
                        a(stackTraceElement.getFileName(), i10);
                        a(":", i10);
                        valueOf = String.valueOf(stackTraceElement.getLineNumber());
                    } else {
                        a("(", i10);
                        valueOf = stackTraceElement.getFileName();
                    }
                } else if (stackTraceElement.getLineNumber() >= 0) {
                    a("(Unknown Source:", i10);
                    valueOf = String.valueOf(stackTraceElement.getLineNumber());
                } else {
                    str = "(Unknown Source)";
                }
                a(valueOf, i10);
                a(")", i10);
                a("\n", i10);
            }
            str = "(Native Method)";
            a(str, i10);
            a("\n", i10);
        } catch (Throwable unused) {
        }
    }

    private static void a(String str, int i10) {
        NativeImpl.a(i10, str);
    }

    public static void a(Throwable th2, int i10) {
        try {
            c(th2, i10);
        } catch (Throwable unused) {
        }
    }

    private static void a(Throwable th2, int i10, String str, String str2) {
        StackTraceElement[] stackTrace = th2.getStackTrace();
        try {
            NativeImpl.a(i10, str2);
            NativeImpl.a(i10, str);
        } catch (Throwable unused) {
        }
        b(th2, i10);
        for (StackTraceElement stackTraceElement : stackTrace) {
            a(stackTraceElement, i10);
        }
        for (Throwable th3 : th2.getSuppressed()) {
            a(th3, i10, "Suppressed: ", a6.h.c(str2, "\t"));
        }
        Throwable cause = th2.getCause();
        if (cause != null) {
            a(cause, i10, "Caused by: ", str2);
        }
    }

    private static void a(Throwable th2, PrintWriter printWriter) {
        if (th2 == null || printWriter == null) {
            return;
        }
        Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        newSetFromMap.add(th2);
        printWriter.println(th2);
        StackTraceElement[] stackTrace = th2.getStackTrace();
        boolean z10 = stackTrace.length > 384;
        int length = stackTrace.length;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            StackTraceElement stackTraceElement = stackTrace[i10];
            if (z10 && i11 > 256) {
                StringBuilder sb2 = new StringBuilder("\t... skip ");
                sb2.append((stackTrace.length - i11) - 128);
                sb2.append(" lines");
                printWriter.println(sb2.toString());
                break;
            }
            printWriter.println("\tat " + stackTraceElement);
            i11++;
            i10++;
        }
        if (z10) {
            for (int length2 = stackTrace.length - 128; length2 < stackTrace.length; length2++) {
                printWriter.println("\tat " + stackTrace[length2]);
            }
        }
        for (Throwable th3 : th2.getSuppressed()) {
            a(th3, printWriter, stackTrace, "Suppressed: ", "\t", newSetFromMap, 128);
        }
        Throwable cause = th2.getCause();
        if (cause != null) {
            a(cause, printWriter, stackTrace, "Caused by: ", "", newSetFromMap, 128);
        }
    }

    private static void a(Throwable th2, PrintWriter printWriter, StackTraceElement[] stackTraceElementArr, String str, String str2, Set<Throwable> set, int i10) {
        if (set.contains(th2)) {
            printWriter.println("\t[CIRCULAR REFERENCE:" + th2 + "]");
            return;
        }
        set.add(th2);
        StackTraceElement[] stackTrace = th2.getStackTrace();
        boolean z10 = stackTrace.length > i10;
        printWriter.println(str2 + str + th2);
        int length = stackTrace.length;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i11 >= length) {
                break;
            }
            StackTraceElement stackTraceElement = stackTrace[i11];
            if (z10 && i12 > i10) {
                printWriter.println("\t... skip " + ((stackTrace.length - i12) - (i10 / 2)) + " lines");
                break;
            }
            printWriter.println("\tat " + stackTraceElement);
            i12++;
            i11++;
        }
        if (z10) {
            for (int length2 = stackTrace.length - (i10 / 2); length2 < stackTrace.length; length2++) {
                printWriter.println("\tat " + stackTrace[length2]);
            }
        }
        for (Throwable th3 : th2.getSuppressed()) {
            int i13 = i10 / 2;
            a(th3, printWriter, stackTrace, "Suppressed: ", a6.h.c(str2, "\t"), set, i13 > 10 ? i13 : 10);
        }
        Throwable cause = th2.getCause();
        if (cause != null) {
            int i14 = i10 / 2;
            a(cause, printWriter, stackTrace, "Caused by: ", str2, set, i14 > 10 ? i14 : 10);
        }
    }

    private static void a(Throwable th2, List<StackTraceElement> list) {
        if (th2 == null || list == null) {
            return;
        }
        Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        newSetFromMap.add(th2);
        list.add(f6664a);
        StackTraceElement[] stackTrace = th2.getStackTrace();
        boolean z10 = stackTrace.length > 384;
        int length = stackTrace.length;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            StackTraceElement stackTraceElement = stackTrace[i10];
            if (z10 && i11 > 256) {
                list.add(f6664a);
                break;
            }
            list.add(stackTraceElement);
            i11++;
            i10++;
        }
        if (z10) {
            for (int length2 = stackTrace.length - 128; length2 < stackTrace.length; length2++) {
                list.add(stackTrace[length2]);
            }
        }
        for (Throwable th3 : th2.getSuppressed()) {
            a(th3, list, stackTrace, "Suppressed: ", "\t", newSetFromMap, 128);
        }
        Throwable cause = th2.getCause();
        if (cause != null) {
            a(cause, list, stackTrace, "Caused by: ", "", newSetFromMap, 128);
        }
    }

    private static void a(Throwable th2, List<StackTraceElement> list, StackTraceElement[] stackTraceElementArr, String str, String str2, Set<Throwable> set, int i10) {
        if (set.contains(th2)) {
            list.add(f6664a);
            return;
        }
        set.add(th2);
        StackTraceElement[] stackTrace = th2.getStackTrace();
        boolean z10 = stackTrace.length > i10;
        list.add(f6664a);
        int length = stackTrace.length;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i11 >= length) {
                break;
            }
            StackTraceElement stackTraceElement = stackTrace[i11];
            if (z10 && i12 > i10) {
                list.add(f6664a);
                break;
            }
            list.add(stackTraceElement);
            i12++;
            i11++;
        }
        if (z10) {
            for (int length2 = stackTrace.length - (i10 / 2); length2 < stackTrace.length; length2++) {
                list.add(stackTrace[length2]);
            }
        }
        for (Throwable th3 : th2.getSuppressed()) {
            int i13 = i10 / 2;
            a(th3, list, stackTrace, "Suppressed: ", a6.h.c(str2, "\t"), set, i13 > 10 ? i13 : 10);
        }
        Throwable cause = th2.getCause();
        if (cause != null) {
            int i14 = i10 / 2;
            a(cause, list, stackTrace, "Caused by: ", str2, set, i14 > 10 ? i14 : 10);
        }
    }

    public static boolean a(String str, String[] strArr) {
        if (strArr != null && !TextUtils.isEmpty(str)) {
            for (String str2 : strArr) {
                if (str.contains(str2)) {
                    return true;
                }
            }
        }
        return false;
    }
}
