package com.iab.omid.library.bytedance2.adsession;

import android.view.View;
import com.iab.omid.library.bytedance2.internal.c;
import com.iab.omid.library.bytedance2.internal.e;
import com.iab.omid.library.bytedance2.internal.h;
import com.iab.omid.library.bytedance2.publisher.AdSessionStatePublisher;
import com.iab.omid.library.bytedance2.publisher.b;
import com.iab.omid.library.bytedance2.utils.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class a extends AdSession {

    /* renamed from: l  reason: collision with root package name */
    private static final Pattern f13823l = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: a  reason: collision with root package name */
    private final AdSessionContext f13824a;

    /* renamed from: b  reason: collision with root package name */
    private final AdSessionConfiguration f13825b;

    /* renamed from: d  reason: collision with root package name */
    private com.iab.omid.library.bytedance2.weakreference.a f13826d;

    /* renamed from: e  reason: collision with root package name */
    private AdSessionStatePublisher f13827e;

    /* renamed from: i  reason: collision with root package name */
    private boolean f13831i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f13832j;

    /* renamed from: k  reason: collision with root package name */
    private PossibleObstructionListener f13833k;
    private final List<e> c = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    private boolean f13828f = false;

    /* renamed from: g  reason: collision with root package name */
    private boolean f13829g = false;

    /* renamed from: h  reason: collision with root package name */
    private final String f13830h = UUID.randomUUID().toString();

    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        AdSessionStatePublisher aVar;
        this.f13825b = adSessionConfiguration;
        this.f13824a = adSessionContext;
        d(null);
        if (adSessionContext.getAdSessionContextType() != AdSessionContextType.HTML && adSessionContext.getAdSessionContextType() != AdSessionContextType.JAVASCRIPT) {
            aVar = new b(adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        } else {
            aVar = new com.iab.omid.library.bytedance2.publisher.a(adSessionContext.getWebView());
        }
        this.f13827e = aVar;
        this.f13827e.i();
        c.c().a(this);
        this.f13827e.a(adSessionConfiguration);
    }

    private void a() {
        if (this.f13831i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    private e b(View view) {
        for (e eVar : this.c) {
            if (eVar.c().get() == view) {
                return eVar;
            }
        }
        return null;
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        if (this.f13829g) {
            return;
        }
        a(view);
        a(str);
        if (b(view) == null) {
            this.c.add(new e(view, friendlyObstructionPurpose, str));
        }
    }

    public View c() {
        return this.f13826d.get();
    }

    public List<e> d() {
        return this.c;
    }

    public boolean e() {
        if (this.f13833k != null) {
            return true;
        }
        return false;
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (!this.f13829g) {
            g.a(errorType, "Error type is null");
            g.a(str, "Message is null");
            getAdSessionStatePublisher().a(errorType, str);
            return;
        }
        throw new IllegalStateException("AdSession is finished");
    }

    public boolean f() {
        if (this.f13828f && !this.f13829g) {
            return true;
        }
        return false;
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public void finish() {
        if (this.f13829g) {
            return;
        }
        this.f13826d.clear();
        removeAllFriendlyObstructions();
        this.f13829g = true;
        getAdSessionStatePublisher().f();
        c.c().b(this);
        getAdSessionStatePublisher().b();
        this.f13827e = null;
        this.f13833k = null;
    }

    public boolean g() {
        return this.f13829g;
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public String getAdSessionId() {
        return this.f13830h;
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.f13827e;
    }

    public boolean h() {
        return this.f13825b.isNativeImpressionOwner();
    }

    public boolean i() {
        return this.f13825b.isNativeMediaEventsOwner();
    }

    public boolean j() {
        return this.f13828f;
    }

    public void k() {
        a();
        getAdSessionStatePublisher().g();
        this.f13831i = true;
    }

    public void l() {
        b();
        getAdSessionStatePublisher().h();
        this.f13832j = true;
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public void registerAdView(View view) {
        if (this.f13829g) {
            return;
        }
        g.a(view, "AdView is null");
        if (c() == view) {
            return;
        }
        d(view);
        getAdSessionStatePublisher().a();
        c(view);
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if (this.f13829g) {
            return;
        }
        this.c.clear();
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.f13829g) {
            return;
        }
        a(view);
        e b10 = b(view);
        if (b10 != null) {
            this.c.remove(b10);
        }
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.f13833k = possibleObstructionListener;
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public void start() {
        if (this.f13828f) {
            return;
        }
        this.f13828f = true;
        c.c().c(this);
        this.f13827e.a(h.c().b());
        this.f13827e.a(com.iab.omid.library.bytedance2.internal.a.a().b());
        this.f13827e.a(this, this.f13824a);
    }

    private static void a(View view) {
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
    }

    private void b() {
        if (this.f13832j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    private void c(View view) {
        Collection<a> b10 = c.c().b();
        if (b10 == null || b10.isEmpty()) {
            return;
        }
        for (a aVar : b10) {
            if (aVar != this && aVar.c() == view) {
                aVar.f13826d.clear();
            }
        }
    }

    private void d(View view) {
        this.f13826d = new com.iab.omid.library.bytedance2.weakreference.a(view);
    }

    private void a(String str) {
        if (str != null) {
            if (str.length() > 50) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason over 50 characters in length");
            }
            if (!f13823l.matcher(str).matches()) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
            }
        }
    }

    public void a(List<com.iab.omid.library.bytedance2.weakreference.a> list) {
        if (e()) {
            ArrayList arrayList = new ArrayList();
            for (com.iab.omid.library.bytedance2.weakreference.a aVar : list) {
                View view = aVar.get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.f13833k.onPossibleObstructionsDetected(this.f13830h, arrayList);
        }
    }

    public void a(JSONObject jSONObject) {
        b();
        getAdSessionStatePublisher().a(jSONObject);
        this.f13832j = true;
    }
}
