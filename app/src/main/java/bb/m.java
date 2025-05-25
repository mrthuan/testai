package bb;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* compiled from: HeartBeatInfoStorage.java */
/* loaded from: classes2.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences f5403a;

    public m(Context context, String str) {
        this.f5403a = context.getSharedPreferences("FirebaseHeartBeat" + str, 0);
    }

    public final synchronized void a() {
        long j10 = this.f5403a.getLong("fire-count", 0L);
        String str = "";
        String str2 = null;
        for (Map.Entry<String, ?> entry : this.f5403a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                for (String str3 : (Set) entry.getValue()) {
                    if (str2 == null || str2.compareTo(str3) > 0) {
                        str = entry.getKey();
                        str2 = str3;
                    }
                }
            }
        }
        HashSet hashSet = new HashSet(this.f5403a.getStringSet(str, new HashSet()));
        hashSet.remove(str2);
        this.f5403a.edit().putStringSet(str, hashSet).putLong("fire-count", j10 - 1).commit();
    }

    public final synchronized void b() {
        SharedPreferences.Editor edit = this.f5403a.edit();
        for (Map.Entry<String, ?> entry : this.f5403a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                edit.remove(entry.getKey());
            }
        }
        edit.remove("fire-count");
        edit.commit();
    }

    public final synchronized ArrayList c() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (Map.Entry<String, ?> entry : this.f5403a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                arrayList.add(new a(entry.getKey(), new ArrayList((Set) entry.getValue())));
            }
        }
        l(System.currentTimeMillis());
        return arrayList;
    }

    public final synchronized String d(long j10) {
        Instant instant;
        ZoneOffset zoneOffset;
        OffsetDateTime atOffset;
        LocalDateTime localDateTime;
        DateTimeFormatter dateTimeFormatter;
        String format;
        if (Build.VERSION.SDK_INT >= 26) {
            instant = new Date(j10).toInstant();
            zoneOffset = ZoneOffset.UTC;
            atOffset = instant.atOffset(zoneOffset);
            localDateTime = atOffset.toLocalDateTime();
            dateTimeFormatter = DateTimeFormatter.ISO_LOCAL_DATE;
            format = localDateTime.format(dateTimeFormatter);
            return format;
        }
        return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j10));
    }

    public final synchronized String e(String str) {
        for (Map.Entry<String, ?> entry : this.f5403a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                for (String str2 : (Set) entry.getValue()) {
                    if (str.equals(str2)) {
                        return entry.getKey();
                    }
                }
                continue;
            }
        }
        return null;
    }

    public final synchronized boolean f(long j10, long j11) {
        return d(j10).equals(d(j11));
    }

    public final synchronized void g() {
        String d10 = d(System.currentTimeMillis());
        this.f5403a.edit().putString("last-used-date", d10).commit();
        h(d10);
    }

    public final synchronized void h(String str) {
        String e10 = e(str);
        if (e10 == null) {
            return;
        }
        HashSet hashSet = new HashSet(this.f5403a.getStringSet(e10, new HashSet()));
        hashSet.remove(str);
        if (hashSet.isEmpty()) {
            this.f5403a.edit().remove(e10).commit();
        } else {
            this.f5403a.edit().putStringSet(e10, hashSet).commit();
        }
    }

    public final synchronized boolean i(long j10) {
        return j(j10);
    }

    public final synchronized boolean j(long j10) {
        if (this.f5403a.contains("fire-global")) {
            if (!f(this.f5403a.getLong("fire-global", -1L), j10)) {
                this.f5403a.edit().putLong("fire-global", j10).commit();
                return true;
            }
            return false;
        }
        this.f5403a.edit().putLong("fire-global", j10).commit();
        return true;
    }

    public final synchronized void k(long j10, String str) {
        String d10 = d(j10);
        if (this.f5403a.getString("last-used-date", "").equals(d10)) {
            String e10 = e(d10);
            if (e10 == null) {
                return;
            }
            if (e10.equals(str)) {
                return;
            }
            m(str, d10);
            return;
        }
        long j11 = this.f5403a.getLong("fire-count", 0L);
        if (j11 + 1 == 30) {
            a();
            j11 = this.f5403a.getLong("fire-count", 0L);
        }
        HashSet hashSet = new HashSet(this.f5403a.getStringSet(str, new HashSet()));
        hashSet.add(d10);
        this.f5403a.edit().putStringSet(str, hashSet).putLong("fire-count", j11 + 1).putString("last-used-date", d10).commit();
    }

    public final synchronized void l(long j10) {
        this.f5403a.edit().putLong("fire-global", j10).commit();
    }

    public final synchronized void m(String str, String str2) {
        h(str2);
        HashSet hashSet = new HashSet(this.f5403a.getStringSet(str, new HashSet()));
        hashSet.add(str2);
        this.f5403a.edit().putStringSet(str, hashSet).commit();
    }
}
