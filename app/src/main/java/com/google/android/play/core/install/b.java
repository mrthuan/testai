package com.google.android.play.core.install;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* loaded from: classes2.dex */
public final class b extends InstallState {

    /* renamed from: a  reason: collision with root package name */
    public final int f13461a;

    /* renamed from: b  reason: collision with root package name */
    public final long f13462b;
    public final long c;

    /* renamed from: d  reason: collision with root package name */
    public final int f13463d;

    /* renamed from: e  reason: collision with root package name */
    public final String f13464e;

    public b(int i10, int i11, long j10, long j11, String str) {
        this.f13461a = i10;
        this.f13462b = j10;
        this.c = j11;
        this.f13463d = i11;
        if (str != null) {
            this.f13464e = str;
            return;
        }
        throw new NullPointerException("Null packageName");
    }

    @Override // com.google.android.play.core.install.InstallState
    public final long a() {
        return this.f13462b;
    }

    @Override // com.google.android.play.core.install.InstallState
    public final int b() {
        return this.f13463d;
    }

    @Override // com.google.android.play.core.install.InstallState
    public final int c() {
        return this.f13461a;
    }

    @Override // com.google.android.play.core.install.InstallState
    public final String d() {
        return this.f13464e;
    }

    @Override // com.google.android.play.core.install.InstallState
    public final long e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InstallState) {
            InstallState installState = (InstallState) obj;
            if (this.f13461a == installState.c() && this.f13462b == installState.a() && this.c == installState.e() && this.f13463d == installState.b() && this.f13464e.equals(installState.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f13462b;
        long j11 = this.c;
        return ((((((((this.f13461a ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f13463d) * 1000003) ^ this.f13464e.hashCode();
    }

    public final String toString() {
        return "InstallState{installStatus=" + this.f13461a + ", bytesDownloaded=" + this.f13462b + ", totalBytesToDownload=" + this.c + ", installErrorCode=" + this.f13463d + ", packageName=" + this.f13464e + "}";
    }
}
