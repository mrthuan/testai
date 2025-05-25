package com.iab.omid.library.inmobi.adsession;

import android.view.View;
import com.iab.omid.library.inmobi.internal.c;
import com.iab.omid.library.inmobi.internal.e;
import com.iab.omid.library.inmobi.internal.f;
import com.iab.omid.library.inmobi.internal.i;
import com.iab.omid.library.inmobi.publisher.AdSessionStatePublisher;
import com.iab.omid.library.inmobi.publisher.b;
import com.iab.omid.library.inmobi.utils.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class a extends AdSession {

    /* renamed from: a  reason: collision with root package name */
    private final AdSessionContext f13931a;

    /* renamed from: b  reason: collision with root package name */
    private final AdSessionConfiguration f13932b;
    private final f c;

    /* renamed from: d  reason: collision with root package name */
    private com.iab.omid.library.inmobi.weakreference.a f13933d;

    /* renamed from: e  reason: collision with root package name */
    private AdSessionStatePublisher f13934e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f13935f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f13936g;

    /* renamed from: h  reason: collision with root package name */
    private final String f13937h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f13938i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f13939j;

    /* renamed from: k  reason: collision with root package name */
    private PossibleObstructionListener f13940k;

    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this(adSessionConfiguration, adSessionContext, UUID.randomUUID().toString());
    }

    private void a() {
        if (this.f13938i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    private void b() {
        if (this.f13939j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    @Override // com.iab.omid.library.inmobi.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        if (this.f13936g) {
            return;
        }
        this.c.a(view, friendlyObstructionPurpose, str);
    }

    public View c() {
        return this.f13933d.get();
    }

    public List<e> d() {
        return this.c.a();
    }

    public boolean e() {
        if (this.f13940k != null) {
            return true;
        }
        return false;
    }

    @Override // com.iab.omid.library.inmobi.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (!this.f13936g) {
            g.a(errorType, "Error type is null");
            g.a(str, "Message is null");
            getAdSessionStatePublisher().a(errorType, str);
            return;
        }
        throw new IllegalStateException("AdSession is finished");
    }

    public boolean f() {
        if (this.f13935f && !this.f13936g) {
            return true;
        }
        return false;
    }

    @Override // com.iab.omid.library.inmobi.adsession.AdSession
    public void finish() {
        if (this.f13936g) {
            return;
        }
        this.f13933d.clear();
        removeAllFriendlyObstructions();
        this.f13936g = true;
        getAdSessionStatePublisher().f();
        c.c().b(this);
        getAdSessionStatePublisher().b();
        this.f13934e = null;
        this.f13940k = null;
    }

    public boolean g() {
        return this.f13936g;
    }

    @Override // com.iab.omid.library.inmobi.adsession.AdSession
    public String getAdSessionId() {
        return this.f13937h;
    }

    @Override // com.iab.omid.library.inmobi.adsession.AdSession
    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.f13934e;
    }

    public boolean h() {
        return this.f13932b.isNativeImpressionOwner();
    }

    public boolean i() {
        return this.f13932b.isNativeMediaEventsOwner();
    }

    public boolean j() {
        return this.f13935f;
    }

    public void k() {
        a();
        getAdSessionStatePublisher().g();
        this.f13938i = true;
    }

    public void l() {
        b();
        getAdSessionStatePublisher().h();
        this.f13939j = true;
    }

    @Override // com.iab.omid.library.inmobi.adsession.AdSession
    public void registerAdView(View view) {
        if (this.f13936g) {
            return;
        }
        g.a(view, "AdView is null");
        if (c() == view) {
            return;
        }
        b(view);
        getAdSessionStatePublisher().a();
        a(view);
    }

    @Override // com.iab.omid.library.inmobi.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if (this.f13936g) {
            return;
        }
        this.c.b();
    }

    @Override // com.iab.omid.library.inmobi.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.f13936g) {
            return;
        }
        this.c.c(view);
    }

    @Override // com.iab.omid.library.inmobi.adsession.AdSession
    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.f13940k = possibleObstructionListener;
    }

    @Override // com.iab.omid.library.inmobi.adsession.AdSession
    public void start() {
        if (this.f13935f) {
            return;
        }
        this.f13935f = true;
        c.c().c(this);
        this.f13934e.a(i.c().b());
        this.f13934e.a(com.iab.omid.library.inmobi.internal.a.a().b());
        this.f13934e.a(this, this.f13931a);
    }

    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext, String str) {
        this.c = new f();
        this.f13935f = false;
        this.f13936g = false;
        this.f13932b = adSessionConfiguration;
        this.f13931a = adSessionContext;
        this.f13937h = str;
        b(null);
        this.f13934e = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new com.iab.omid.library.inmobi.publisher.a(str, adSessionContext.getWebView()) : new b(str, adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f13934e.i();
        c.c().a(this);
        this.f13934e.a(adSessionConfiguration);
    }

    private void a(View view) {
        Collection<a> b10 = c.c().b();
        if (b10 == null || b10.isEmpty()) {
            return;
        }
        for (a aVar : b10) {
            if (aVar != this && aVar.c() == view) {
                aVar.f13933d.clear();
            }
        }
    }

    private void b(View view) {
        this.f13933d = new com.iab.omid.library.inmobi.weakreference.a(view);
    }

    public void a(List<com.iab.omid.library.inmobi.weakreference.a> list) {
        if (e()) {
            ArrayList arrayList = new ArrayList();
            for (com.iab.omid.library.inmobi.weakreference.a aVar : list) {
                View view = aVar.get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.f13940k.onPossibleObstructionsDetected(this.f13937h, arrayList);
        }
    }

    public void a(JSONObject jSONObject) {
        b();
        getAdSessionStatePublisher().a(jSONObject);
        this.f13939j = true;
    }
}
