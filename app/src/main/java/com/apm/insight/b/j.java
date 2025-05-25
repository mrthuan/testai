package com.apm.insight.b;

import android.os.Looper;
import android.text.TextUtils;
import android.util.Printer;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    private static int f6433a = 5;

    /* renamed from: b  reason: collision with root package name */
    private static b f6434b;
    private static a c;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f6435d;

    /* renamed from: e  reason: collision with root package name */
    private static Printer f6436e;

    /* loaded from: classes.dex */
    public interface a {
        void a(long j10);
    }

    /* loaded from: classes.dex */
    public static class b implements Printer {

        /* renamed from: a  reason: collision with root package name */
        List<Printer> f6437a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        List<Printer> f6438b = new ArrayList();
        List<Printer> c = new ArrayList();

        /* renamed from: d  reason: collision with root package name */
        boolean f6439d = false;

        /* renamed from: e  reason: collision with root package name */
        boolean f6440e = false;

        @Override // android.util.Printer
        public void println(String str) {
            long j10;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (j.c != null) {
                j10 = System.currentTimeMillis();
            } else {
                j10 = 0;
            }
            if (str.charAt(0) == '>' && this.f6440e) {
                for (Printer printer : this.c) {
                    if (!this.f6437a.contains(printer)) {
                        this.f6437a.add(printer);
                    }
                }
                this.c.clear();
                this.f6440e = false;
            }
            this.f6437a.size();
            int unused = j.f6433a;
            for (Printer printer2 : this.f6437a) {
                if (printer2 != null) {
                    printer2.println(str);
                }
            }
            if (str.charAt(0) == '<' && this.f6439d) {
                for (Printer printer3 : this.f6438b) {
                    this.f6437a.remove(printer3);
                    this.c.remove(printer3);
                }
                this.f6438b.clear();
                this.f6439d = false;
            }
            if (j.c != null && j10 > 0) {
                j.c.a(System.currentTimeMillis() - j10);
            }
        }
    }

    public static void a() {
        if (f6435d) {
            return;
        }
        f6435d = true;
        f6434b = new b();
        Printer d10 = d();
        f6436e = d10;
        if (d10 != null) {
            f6434b.f6437a.add(d10);
        }
        if (com.apm.insight.i.r()) {
            Looper.getMainLooper().setMessageLogging(f6434b);
        }
    }

    private static Printer d() {
        try {
            Field declaredField = Class.forName("android.os.Looper").getDeclaredField("mLogging");
            declaredField.setAccessible(true);
            return (Printer) declaredField.get(Looper.getMainLooper());
        } catch (Exception unused) {
            return null;
        }
    }

    public static void a(Printer printer) {
        if (printer == null || f6434b.c.contains(printer)) {
            return;
        }
        f6434b.c.add(printer);
        f6434b.f6440e = true;
    }
}
