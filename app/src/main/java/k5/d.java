package k5;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.UnknownHostException;

/* compiled from: XLog.java */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static c f19600a;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f19601b;

    public static void a(String str) {
        if (f19601b) {
            c cVar = f19600a;
            cVar.f19598a.getClass();
            cVar.a(3, str);
            return;
        }
        throw new IllegalStateException("Do you forget to initialize XLog?");
    }

    public static void b(String str, Throwable th2) {
        String str2;
        if (f19601b) {
            c cVar = f19600a;
            a aVar = cVar.f19598a;
            aVar.getClass();
            StringBuilder sb2 = new StringBuilder();
            String str3 = "";
            if (str == null || str.length() == 0) {
                str2 = "";
            } else {
                StringBuilder k10 = a0.a.k(str);
                k10.append(m5.c.f21821a);
                str2 = k10.toString();
            }
            sb2.append(str2);
            aVar.f19586b.getClass();
            int i10 = n5.a.f22339a;
            if (th2 != null) {
                Throwable th3 = th2;
                while (true) {
                    if (th3 != null) {
                        if (th3 instanceof UnknownHostException) {
                            break;
                        }
                        th3 = th3.getCause();
                    } else {
                        StringWriter stringWriter = new StringWriter();
                        PrintWriter printWriter = new PrintWriter(stringWriter);
                        th2.printStackTrace(printWriter);
                        printWriter.flush();
                        str3 = stringWriter.toString();
                        break;
                    }
                }
            }
            sb2.append(str3);
            cVar.a(6, sb2.toString());
            return;
        }
        throw new IllegalStateException("Do you forget to initialize XLog?");
    }
}
