package c6;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.UUID;

/* compiled from: SessionInfo.kt */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final Long f5620a;

    /* renamed from: b  reason: collision with root package name */
    public Long f5621b;
    public UUID c;

    /* renamed from: d  reason: collision with root package name */
    public int f5622d;

    /* renamed from: e  reason: collision with root package name */
    public Long f5623e;

    /* renamed from: f  reason: collision with root package name */
    public m f5624f;

    public k(Long l10, Long l11) {
        UUID randomUUID = UUID.randomUUID();
        kotlin.jvm.internal.g.d(randomUUID, "randomUUID()");
        this.f5620a = l10;
        this.f5621b = l11;
        this.c = randomUUID;
    }

    public final void a() {
        long j10;
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(com.facebook.d.a()).edit();
        long j11 = 0;
        Long l10 = this.f5620a;
        if (l10 != null) {
            j10 = l10.longValue();
        } else {
            j10 = 0;
        }
        edit.putLong("com.facebook.appevents.SessionInfo.sessionStartTime", j10);
        Long l11 = this.f5621b;
        if (l11 != null) {
            j11 = l11.longValue();
        }
        edit.putLong("com.facebook.appevents.SessionInfo.sessionEndTime", j11);
        edit.putInt("com.facebook.appevents.SessionInfo.interruptionCount", this.f5622d);
        edit.putString("com.facebook.appevents.SessionInfo.sessionId", this.c.toString());
        edit.apply();
        m mVar = this.f5624f;
        if (mVar != null && mVar != null) {
            SharedPreferences.Editor edit2 = PreferenceManager.getDefaultSharedPreferences(com.facebook.d.a()).edit();
            edit2.putString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", mVar.f5627a);
            edit2.putBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", mVar.f5628b);
            edit2.apply();
        }
    }
}
