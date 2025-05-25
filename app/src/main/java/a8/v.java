package a8;

import android.content.SharedPreferences;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzai;
import com.google.android.gms.measurement.internal.zzeh;
import com.google.android.gms.measurement.internal.zzeu;
import com.google.android.gms.measurement.internal.zzfd;
import com.google.android.gms.measurement.internal.zzfe;
import com.google.android.gms.measurement.internal.zzff;
import com.google.android.gms.measurement.internal.zzfh;
import com.google.android.gms.measurement.internal.zzfi;
import com.google.android.gms.measurement.internal.zzge;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.2 */
/* loaded from: classes2.dex */
public final class v extends l0 {

    /* renamed from: x  reason: collision with root package name */
    public static final Pair f340x = new Pair("", 0L);
    public SharedPreferences c;

    /* renamed from: d  reason: collision with root package name */
    public zzfh f341d;

    /* renamed from: e  reason: collision with root package name */
    public final zzff f342e;

    /* renamed from: f  reason: collision with root package name */
    public final zzfi f343f;

    /* renamed from: g  reason: collision with root package name */
    public String f344g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f345h;

    /* renamed from: i  reason: collision with root package name */
    public long f346i;

    /* renamed from: j  reason: collision with root package name */
    public final zzff f347j;

    /* renamed from: k  reason: collision with root package name */
    public final zzfd f348k;

    /* renamed from: l  reason: collision with root package name */
    public final zzfi f349l;

    /* renamed from: m  reason: collision with root package name */
    public final zzfd f350m;

    /* renamed from: n  reason: collision with root package name */
    public final zzff f351n;

    /* renamed from: o  reason: collision with root package name */
    public final zzff f352o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f353p;

    /* renamed from: q  reason: collision with root package name */
    public final zzfd f354q;

    /* renamed from: r  reason: collision with root package name */
    public final zzfd f355r;

    /* renamed from: s  reason: collision with root package name */
    public final zzff f356s;

    /* renamed from: t  reason: collision with root package name */
    public final zzfi f357t;

    /* renamed from: u  reason: collision with root package name */
    public final zzfi f358u;

    /* renamed from: v  reason: collision with root package name */
    public final zzff f359v;

    /* renamed from: w  reason: collision with root package name */
    public final zzfe f360w;

    public v(zzge zzgeVar) {
        super(zzgeVar);
        this.f347j = new zzff(this, "session_timeout", 1800000L);
        this.f348k = new zzfd(this, "start_new_session", true);
        this.f351n = new zzff(this, "last_pause_time", 0L);
        this.f352o = new zzff(this, "session_id", 0L);
        this.f349l = new zzfi(this, "non_personalized_ads");
        this.f350m = new zzfd(this, "allow_remote_dynamite", false);
        this.f342e = new zzff(this, "first_open_time", 0L);
        new zzff(this, "app_install_time", 0L);
        this.f343f = new zzfi(this, "app_instance_id");
        this.f354q = new zzfd(this, "app_backgrounded", false);
        this.f355r = new zzfd(this, "deep_link_retrieval_complete", false);
        this.f356s = new zzff(this, "deep_link_retrieval_attempts", 0L);
        this.f357t = new zzfi(this, "firebase_feature_rollouts");
        this.f358u = new zzfi(this, "deferred_attribution_cache");
        this.f359v = new zzff(this, "deferred_attribution_cache_timestamp", 0L);
        this.f360w = new zzfe(this);
    }

    @Override // a8.l0
    public final boolean n() {
        return true;
    }

    public final SharedPreferences q() {
        m();
        o();
        Preconditions.j(this.c);
        return this.c;
    }

    public final void r() {
        zzge zzgeVar = (zzge) this.f3529a;
        SharedPreferences sharedPreferences = zzgeVar.f11773a.getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.c = sharedPreferences;
        boolean z10 = sharedPreferences.getBoolean("has_been_opened", false);
        this.f353p = z10;
        if (!z10) {
            SharedPreferences.Editor edit = this.c.edit();
            edit.putBoolean("has_been_opened", true);
            edit.apply();
        }
        zzgeVar.getClass();
        this.f341d = new zzfh(this, Math.max(0L, ((Long) zzeh.f11645d.a(null)).longValue()));
    }

    public final zzai s() {
        m();
        return zzai.b(q().getString("consent_settings", "G1"));
    }

    public final Boolean t() {
        m();
        if (q().contains("measurement_enabled")) {
            return Boolean.valueOf(q().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    public final void u(Boolean bool) {
        m();
        SharedPreferences.Editor edit = q().edit();
        if (bool != null) {
            edit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            edit.remove("measurement_enabled");
        }
        edit.apply();
    }

    public final void v(boolean z10) {
        m();
        zzeu zzeuVar = ((zzge) this.f3529a).f11780i;
        zzge.f(zzeuVar);
        zzeuVar.f11720n.b(Boolean.valueOf(z10), "App measurement setting deferred collection");
        SharedPreferences.Editor edit = q().edit();
        edit.putBoolean("deferred_analytics_collection", z10);
        edit.apply();
    }

    public final boolean w(long j10) {
        if (j10 - this.f347j.a() > this.f351n.a()) {
            return true;
        }
        return false;
    }

    public final boolean x(int i10) {
        int i11 = q().getInt("consent_source", 100);
        zzai zzaiVar = zzai.f11530b;
        if (i10 <= i11) {
            return true;
        }
        return false;
    }
}
