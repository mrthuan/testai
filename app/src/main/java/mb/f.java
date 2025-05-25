package mb;

import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;

/* compiled from: FirebaseRemoteConfigSettings.java */
/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final long f21973a;

    /* renamed from: b  reason: collision with root package name */
    public final long f21974b;

    /* compiled from: FirebaseRemoteConfigSettings.java */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public long f21975a = 60;

        /* renamed from: b  reason: collision with root package name */
        public long f21976b = ConfigFetchHandler.f13693j;

        public final void a(long j10) {
            if (j10 >= 0) {
                this.f21975a = j10;
                return;
            }
            throw new IllegalArgumentException(String.format("Fetch connection timeout has to be a non-negative number. %d is an invalid argument", Long.valueOf(j10)));
        }

        public final void b(long j10) {
            if (j10 >= 0) {
                this.f21976b = j10;
                return;
            }
            throw new IllegalArgumentException("Minimum interval between fetches has to be a non-negative number. " + j10 + " is an invalid argument");
        }
    }

    public f(a aVar) {
        this.f21973a = aVar.f21975a;
        this.f21974b = aVar.f21976b;
    }
}
