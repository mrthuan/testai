package c7;

import com.google.auto.value.AutoValue;
import lib.zj.office.fc.hpsf.Constants;

/* compiled from: EventStoreConfig.java */
@AutoValue
/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    public static final a f5635a;

    static {
        String str;
        Long l10 = 10485760L;
        Integer num = 200;
        Integer valueOf = Integer.valueOf((int) Constants.CP_MAC_ROMAN);
        Long l11 = 604800000L;
        Integer num2 = 81920;
        if (l10 == null) {
            str = " maxStorageSizeInBytes";
        } else {
            str = "";
        }
        if (num == null) {
            str = str.concat(" loadBatchSize");
        }
        if (valueOf == null) {
            str = a6.h.c(str, " criticalSectionEnterTimeoutMs");
        }
        if (l11 == null) {
            str = a6.h.c(str, " eventCleanUpAge");
        }
        if (num2 == null) {
            str = a6.h.c(str, " maxBlobByteSizePerRow");
        }
        if (str.isEmpty()) {
            f5635a = new a(l10.longValue(), num.intValue(), valueOf.intValue(), l11.longValue(), num2.intValue());
            return;
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public abstract int a();

    public abstract long b();

    public abstract int c();

    public abstract int d();

    public abstract long e();
}
