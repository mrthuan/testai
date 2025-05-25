package pp;

import android.content.Context;
import java.util.Calendar;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.g;
import o2.i;
import p2.j;
import pdf.pdfreader.viewer.editor.free.utils.c1;
import pdf.pdfreader.viewer.editor.free.work.NotFinishedReaderWorker;
import pdf.pdfreader.viewer.editor.free.work.NotViewNewlyFileWorker;
import yn.b;
import yn.c;

/* compiled from: WorkManagerCenter.kt */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f28990a;

    /* renamed from: b  reason: collision with root package name */
    public static UUID f28991b;
    public static long c;

    /* renamed from: d  reason: collision with root package name */
    public static UUID f28992d;

    /* renamed from: e  reason: collision with root package name */
    public static long f28993e;

    static {
        ea.a.p("ZG85az5hDGEVZUZDDG4iZXI=", "S8qhHcNt");
        f28990a = new a();
    }

    public static long a(int i10, int i11) {
        long currentTimeMillis = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        calendar.set(11, i10);
        calendar.set(12, i11);
        calendar.set(13, 0);
        if (calendar.getTimeInMillis() <= currentTimeMillis) {
            calendar.add(6, 1);
        }
        long timeInMillis = calendar.getTimeInMillis() - System.currentTimeMillis();
        if (timeInMillis <= 0) {
            return -1L;
        }
        return timeInMillis;
    }

    public static final void b(Context context) {
        g.e(context, "context");
        if (b.f32194o.h0(context)) {
            return;
        }
        if (f28991b != null && Math.abs(System.currentTimeMillis() - c) < 60000) {
            return;
        }
        UUID uuid = f28991b;
        if (uuid != null) {
            try {
                j.e(context).c(uuid);
            } catch (Exception unused) {
            }
            f28991b = null;
        }
        int x4 = c1.x(context);
        int y10 = c1.y(context);
        f28990a.getClass();
        long a10 = a(x4, y10);
        if (a10 > 0) {
            i a11 = new i.a(NotFinishedReaderWorker.class).b(a10, TimeUnit.MILLISECONDS).a();
            ea.a.p("DXVebANlBigGbxJGXW4-c1BlNlIsYVJlloDXbjh0bE0GTHtJNEU3TwZENSkaYiJpVGR6KQ==", "fjO7gtMN");
            f28991b = a11.f22690a;
            try {
                j.e(context).b(a11);
                c = System.currentTimeMillis();
            } catch (Exception e10) {
                e10.printStackTrace();
                f28991b = null;
            }
        }
    }

    public static final void c(Context context) {
        g.e(context, "context");
        if (c.f32199o.h0(context)) {
            return;
        }
        if (f28992d != null && Math.abs(System.currentTimeMillis() - f28993e) < 60000) {
            return;
        }
        UUID uuid = f28992d;
        if (uuid != null) {
            try {
                j.e(context).c(uuid);
            } catch (Exception unused) {
            }
            f28992d = null;
        }
        int z10 = c1.z(context);
        int A = c1.A(context);
        f28990a.getClass();
        long a10 = a(z10, A);
        if (a10 > 0) {
            i a11 = new i.a(NotViewNewlyFileWorker.class).b(a10, TimeUnit.MILLISECONDS).a();
            ea.a.p("DXVYbB1lRSgUbz5WHGUfTlB3AnkDaQllgYDDbjB0H00GTH1JKkV0TxREGSlbYh1pWWRGKQ==", "XmcAceY1");
            f28992d = a11.f22690a;
            try {
                j.e(context).b(a11);
                f28993e = System.currentTimeMillis();
            } catch (Exception e10) {
                e10.printStackTrace();
                f28992d = null;
            }
        }
    }
}
