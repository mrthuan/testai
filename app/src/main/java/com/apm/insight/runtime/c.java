package com.apm.insight.runtime;

import com.apm.insight.CrashType;
import com.apm.insight.ICrashCallback;
import com.apm.insight.IOOMCallback;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private final List<ICrashCallback> f6749a = new CopyOnWriteArrayList();

    /* renamed from: b  reason: collision with root package name */
    private final List<ICrashCallback> f6750b = new CopyOnWriteArrayList();
    private final List<ICrashCallback> c = new CopyOnWriteArrayList();

    /* renamed from: d  reason: collision with root package name */
    private final List<ICrashCallback> f6751d = new CopyOnWriteArrayList();

    /* renamed from: e  reason: collision with root package name */
    private final List<IOOMCallback> f6752e = new CopyOnWriteArrayList();

    /* renamed from: com.apm.insight.runtime.c$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f6753a;

        static {
            int[] iArr = new int[CrashType.values().length];
            f6753a = iArr;
            try {
                iArr[CrashType.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6753a[CrashType.ANR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6753a[CrashType.JAVA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6753a[CrashType.LAUNCH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6753a[CrashType.NATIVE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public List<IOOMCallback> a() {
        return this.f6752e;
    }

    public List<ICrashCallback> b() {
        return this.f6749a;
    }

    public List<ICrashCallback> c() {
        return this.f6750b;
    }

    public List<ICrashCallback> d() {
        return this.c;
    }

    public List<ICrashCallback> e() {
        return this.f6751d;
    }

    public void a(ICrashCallback iCrashCallback, CrashType crashType) {
        List<ICrashCallback> list;
        int i10 = AnonymousClass1.f6753a[crashType.ordinal()];
        if (i10 == 1) {
            this.f6749a.add(iCrashCallback);
            this.f6750b.add(iCrashCallback);
            this.c.add(iCrashCallback);
        } else if (i10 != 2) {
            if (i10 == 3) {
                list = this.f6750b;
            } else if (i10 == 4) {
                list = this.f6749a;
            } else if (i10 != 5) {
                return;
            } else {
                list = this.c;
            }
            list.add(iCrashCallback);
        }
        list = this.f6751d;
        list.add(iCrashCallback);
    }

    public void b(ICrashCallback iCrashCallback, CrashType crashType) {
        List<ICrashCallback> list;
        int i10 = AnonymousClass1.f6753a[crashType.ordinal()];
        if (i10 == 1) {
            this.f6749a.remove(iCrashCallback);
            this.f6750b.remove(iCrashCallback);
            this.c.remove(iCrashCallback);
        } else if (i10 != 2) {
            if (i10 == 3) {
                list = this.f6750b;
            } else if (i10 == 4) {
                list = this.f6749a;
            } else if (i10 != 5) {
                return;
            } else {
                list = this.c;
            }
            list.remove(iCrashCallback);
        }
        list = this.f6751d;
        list.remove(iCrashCallback);
    }

    public void a(IOOMCallback iOOMCallback) {
        this.f6752e.add(iOOMCallback);
    }

    public void b(IOOMCallback iOOMCallback) {
        this.f6752e.remove(iOOMCallback);
    }
}
