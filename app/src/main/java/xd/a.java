package xd;

import ae.e;
import android.content.Context;
import de.d;

/* compiled from: Promoter.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f31647a = false;

    /* renamed from: b  reason: collision with root package name */
    public static int f31648b = 0;
    public static d c = null;

    /* renamed from: d  reason: collision with root package name */
    public static int f31649d = -1;

    /* renamed from: e  reason: collision with root package name */
    public static e f31650e = null;

    /* renamed from: f  reason: collision with root package name */
    public static String f31651f = "";

    /* compiled from: Promoter.java */
    /* renamed from: xd.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0409a {

        /* renamed from: a  reason: collision with root package name */
        public String f31652a;

        /* renamed from: b  reason: collision with root package name */
        public int f31653b;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:1|(3:2|3|(1:5))|7|(1:9)|10|(2:11|12)|(7:14|15|16|17|(1:68)|20|(2:22|(2:32|(1:64)(5:36|37|(5:39|40|41|(1:43)(1:46)|(1:45))|49|(2:57|59)(1:60)))(2:26|(1:31)(2:28|29)))(2:66|67))|73|16|17|(0)|68|20|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b9, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ba, code lost:
        r0.printStackTrace();
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x015d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(android.app.Activity r18, xd.a.C0409a r19) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: xd.a.a(android.app.Activity, xd.a$a):void");
    }

    public static boolean b(Context context) {
        int i10;
        boolean z10;
        if (f31649d == -1) {
            if (!de.e.i(context).getBoolean("mute_voice", false)) {
                if (de.e.d(context, null, "isMuted", 0) == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    i10 = 0;
                    f31649d = i10;
                }
            }
            i10 = 1;
            f31649d = i10;
        }
        if (f31649d != 1) {
            return false;
        }
        return true;
    }
}
