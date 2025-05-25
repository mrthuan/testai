package nh;

import java.io.PrintStream;
import lib.zj.office.fc.ss.usermodel.ErrorConstants;

/* compiled from: ErrorConstant.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: b  reason: collision with root package name */
    public static final a f22481b = new a(0);
    public static final a c = new a(7);

    /* renamed from: d  reason: collision with root package name */
    public static final a f22482d = new a(15);

    /* renamed from: e  reason: collision with root package name */
    public static final a f22483e = new a(23);

    /* renamed from: f  reason: collision with root package name */
    public static final a f22484f = new a(29);

    /* renamed from: g  reason: collision with root package name */
    public static final a f22485g = new a(36);

    /* renamed from: h  reason: collision with root package name */
    public static final a f22486h = new a(42);

    /* renamed from: a  reason: collision with root package name */
    public final int f22487a;

    public a(int i10) {
        this.f22487a = i10;
    }

    public static a b(int i10) {
        if (i10 != 0) {
            if (i10 != 7) {
                if (i10 != 15) {
                    if (i10 != 23) {
                        if (i10 != 29) {
                            if (i10 != 36) {
                                if (i10 != 42) {
                                    PrintStream printStream = System.err;
                                    printStream.println("Warning - unexpected error code (" + i10 + ")");
                                    return new a(i10);
                                }
                                return f22486h;
                            }
                            return f22485g;
                        }
                        return f22484f;
                    }
                    return f22483e;
                }
                return f22482d;
            }
            return c;
        }
        return f22481b;
    }

    public final String a() {
        int i10 = this.f22487a;
        if (ErrorConstants.isValidCode(i10)) {
            return ErrorConstants.getText(i10);
        }
        return a0.a.g("unknown error code (", i10, ")");
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer(64);
        stringBuffer.append(a.class.getName());
        stringBuffer.append(" [");
        stringBuffer.append(a());
        stringBuffer.append("]");
        return stringBuffer.toString();
    }
}
