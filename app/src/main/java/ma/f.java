package ma;

import android.os.Process;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: CLSUUID.java */
/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicLong f21892a = new AtomicLong(0);

    /* renamed from: b  reason: collision with root package name */
    public static String f21893b;

    public f(f0 f0Var) {
        String str;
        long time = new Date().getTime();
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt((int) (time / 1000));
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        byte[] array = allocate.array();
        byte[] a10 = a(time % 1000);
        byte[] a11 = a(f21892a.incrementAndGet());
        byte[] a12 = a(Integer.valueOf(Process.myPid()).shortValue());
        byte[] bArr = {array[0], array[1], array[2], array[3], a10[0], a10[1], a11[0], a11[1], a12[0], a12[1]};
        byte[] bytes = f0Var.c().getBytes();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(bytes);
            str = CommonUtils.h(messageDigest.digest());
        } catch (NoSuchAlgorithmException unused) {
            str = "";
        }
        String h10 = CommonUtils.h(bArr);
        Locale locale = Locale.US;
        f21893b = String.format(locale, "%s%s%s%s", h10.substring(0, 12), h10.substring(12, 16), h10.subSequence(16, 20), str.substring(0, 12)).toUpperCase(locale);
    }

    public static byte[] a(long j10) {
        ByteBuffer allocate = ByteBuffer.allocate(2);
        allocate.putShort((short) j10);
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        return allocate.array();
    }

    public final String toString() {
        return f21893b;
    }
}
