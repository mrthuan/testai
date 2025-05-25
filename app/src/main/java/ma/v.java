package ma;

/* compiled from: CrashlyticsCore.java */
/* loaded from: classes2.dex */
public final class v implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ta.f f21937a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ w f21938b;

    public v(w wVar, com.google.firebase.crashlytics.internal.settings.a aVar) {
        this.f21938b = wVar;
        this.f21937a = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        w.a(this.f21938b, this.f21937a);
    }
}
