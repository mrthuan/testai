package com.bumptech.glide.request;

import com.bumptech.glide.request.RequestCoordinator;
import l4.b;

/* compiled from: ThumbnailRequestCoordinator.java */
/* loaded from: classes.dex */
public final class a implements RequestCoordinator, b {

    /* renamed from: a  reason: collision with root package name */
    public final RequestCoordinator f7098a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f7099b;
    public volatile b c;

    /* renamed from: d  reason: collision with root package name */
    public volatile b f7100d;

    /* renamed from: e  reason: collision with root package name */
    public RequestCoordinator.RequestState f7101e;

    /* renamed from: f  reason: collision with root package name */
    public RequestCoordinator.RequestState f7102f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f7103g;

    public a(Object obj) {
        RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
        this.f7101e = requestState;
        this.f7102f = requestState;
        this.f7099b = obj;
        this.f7098a = null;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator, l4.b
    public final boolean a() {
        boolean z10;
        synchronized (this.f7099b) {
            if (!this.f7100d.a() && !this.c.a()) {
                z10 = false;
            }
            z10 = true;
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public final RequestCoordinator b() {
        RequestCoordinator requestCoordinator;
        synchronized (this.f7099b) {
            RequestCoordinator requestCoordinator2 = this.f7098a;
            if (requestCoordinator2 != null) {
                requestCoordinator = requestCoordinator2.b();
            } else {
                requestCoordinator = this;
            }
        }
        return requestCoordinator;
    }

    @Override // l4.b
    public final boolean c(b bVar) {
        if (!(bVar instanceof a)) {
            return false;
        }
        a aVar = (a) bVar;
        if (this.c == null) {
            if (aVar.c != null) {
                return false;
            }
        } else if (!this.c.c(aVar.c)) {
            return false;
        }
        if (this.f7100d == null) {
            if (aVar.f7100d != null) {
                return false;
            }
        } else if (!this.f7100d.c(aVar.f7100d)) {
            return false;
        }
        return true;
    }

    @Override // l4.b
    public final void clear() {
        synchronized (this.f7099b) {
            this.f7103g = false;
            RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
            this.f7101e = requestState;
            this.f7102f = requestState;
            this.f7100d.clear();
            this.c.clear();
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public final void d(b bVar) {
        synchronized (this.f7099b) {
            if (!bVar.equals(this.c)) {
                this.f7102f = RequestCoordinator.RequestState.FAILED;
                return;
            }
            this.f7101e = RequestCoordinator.RequestState.FAILED;
            RequestCoordinator requestCoordinator = this.f7098a;
            if (requestCoordinator != null) {
                requestCoordinator.d(this);
            }
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public final boolean e(b bVar) {
        boolean z10;
        boolean z11;
        synchronized (this.f7099b) {
            RequestCoordinator requestCoordinator = this.f7098a;
            z10 = false;
            if (requestCoordinator != null && !requestCoordinator.e(this)) {
                z11 = false;
                if (z11 && bVar.equals(this.c) && !a()) {
                    z10 = true;
                }
            }
            z11 = true;
            if (z11) {
                z10 = true;
            }
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public final boolean f(b bVar) {
        boolean z10;
        boolean z11;
        synchronized (this.f7099b) {
            RequestCoordinator requestCoordinator = this.f7098a;
            z10 = false;
            if (requestCoordinator != null && !requestCoordinator.f(this)) {
                z11 = false;
                if (z11 && (bVar.equals(this.c) || this.f7101e != RequestCoordinator.RequestState.SUCCESS)) {
                    z10 = true;
                }
            }
            z11 = true;
            if (z11) {
                z10 = true;
            }
        }
        return z10;
    }

    @Override // l4.b
    public final boolean g() {
        boolean z10;
        synchronized (this.f7099b) {
            if (this.f7101e == RequestCoordinator.RequestState.CLEARED) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    @Override // l4.b
    public final void h() {
        synchronized (this.f7099b) {
            this.f7103g = true;
            if (this.f7101e != RequestCoordinator.RequestState.SUCCESS) {
                RequestCoordinator.RequestState requestState = this.f7102f;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
                if (requestState != requestState2) {
                    this.f7102f = requestState2;
                    this.f7100d.h();
                }
            }
            if (this.f7103g) {
                RequestCoordinator.RequestState requestState3 = this.f7101e;
                RequestCoordinator.RequestState requestState4 = RequestCoordinator.RequestState.RUNNING;
                if (requestState3 != requestState4) {
                    this.f7101e = requestState4;
                    this.c.h();
                }
            }
            this.f7103g = false;
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public final boolean i(b bVar) {
        boolean z10;
        boolean z11;
        synchronized (this.f7099b) {
            RequestCoordinator requestCoordinator = this.f7098a;
            z10 = false;
            if (requestCoordinator != null && !requestCoordinator.i(this)) {
                z11 = false;
                if (z11 && bVar.equals(this.c) && this.f7101e != RequestCoordinator.RequestState.PAUSED) {
                    z10 = true;
                }
            }
            z11 = true;
            if (z11) {
                z10 = true;
            }
        }
        return z10;
    }

    @Override // l4.b
    public final boolean isRunning() {
        boolean z10;
        synchronized (this.f7099b) {
            if (this.f7101e == RequestCoordinator.RequestState.RUNNING) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    @Override // l4.b
    public final boolean j() {
        boolean z10;
        synchronized (this.f7099b) {
            if (this.f7101e == RequestCoordinator.RequestState.SUCCESS) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public final void k(b bVar) {
        synchronized (this.f7099b) {
            if (bVar.equals(this.f7100d)) {
                this.f7102f = RequestCoordinator.RequestState.SUCCESS;
                return;
            }
            this.f7101e = RequestCoordinator.RequestState.SUCCESS;
            RequestCoordinator requestCoordinator = this.f7098a;
            if (requestCoordinator != null) {
                requestCoordinator.k(this);
            }
            if (!this.f7102f.isComplete()) {
                this.f7100d.clear();
            }
        }
    }

    @Override // l4.b
    public final void pause() {
        synchronized (this.f7099b) {
            if (!this.f7102f.isComplete()) {
                this.f7102f = RequestCoordinator.RequestState.PAUSED;
                this.f7100d.pause();
            }
            if (!this.f7101e.isComplete()) {
                this.f7101e = RequestCoordinator.RequestState.PAUSED;
                this.c.pause();
            }
        }
    }
}
