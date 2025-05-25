package km;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.util.ArrayList;
import java.util.UUID;
import pdf.pdfreader.viewer.editor.free.feature.ai.db.AIAnswerContent;

/* compiled from: AIChatInfo.java */
/* loaded from: classes3.dex */
public final class a {
    public int A;
    public boolean B;
    public String C;
    public String D;
    public String E;
    public int F;
    public int G;
    public int H;
    public boolean I;
    public boolean J;
    public boolean K;

    /* renamed from: b  reason: collision with root package name */
    public String f19873b;

    /* renamed from: d  reason: collision with root package name */
    public long f19874d;

    /* renamed from: e  reason: collision with root package name */
    public int f19875e;

    /* renamed from: f  reason: collision with root package name */
    public String f19876f;

    /* renamed from: g  reason: collision with root package name */
    public String f19877g;

    /* renamed from: h  reason: collision with root package name */
    public String f19878h;

    /* renamed from: i  reason: collision with root package name */
    public int f19879i;

    /* renamed from: j  reason: collision with root package name */
    public long f19880j;

    /* renamed from: l  reason: collision with root package name */
    public int f19882l;

    /* renamed from: m  reason: collision with root package name */
    public String f19883m;

    /* renamed from: n  reason: collision with root package name */
    public long f19884n;

    /* renamed from: o  reason: collision with root package name */
    public long f19885o;

    /* renamed from: p  reason: collision with root package name */
    public a f19886p;

    /* renamed from: r  reason: collision with root package name */
    public String f19888r;

    /* renamed from: u  reason: collision with root package name */
    public int f19891u;

    /* renamed from: z  reason: collision with root package name */
    public int f19896z;

    /* renamed from: a  reason: collision with root package name */
    public long f19872a = 0;
    public String c = UUID.randomUUID().toString();

    /* renamed from: k  reason: collision with root package name */
    public int f19881k = PglCryptUtils.LOAD_SO_FAILED;

    /* renamed from: q  reason: collision with root package name */
    public int f19887q = 0;

    /* renamed from: s  reason: collision with root package name */
    public int f19889s = 202;

    /* renamed from: t  reason: collision with root package name */
    public boolean f19890t = false;

    /* renamed from: v  reason: collision with root package name */
    public int f19892v = 1;

    /* renamed from: w  reason: collision with root package name */
    public final ArrayList f19893w = new ArrayList();

    /* renamed from: x  reason: collision with root package name */
    public int f19894x = TTAdConstant.AD_ID_IS_NULL_CODE;

    /* renamed from: y  reason: collision with root package name */
    public boolean f19895y = false;

    public final void a(int i10, int i11, int i12, String str) {
        ArrayList arrayList = this.f19893w;
        arrayList.add(new AIAnswerContent(this.f19872a, this.f19874d, str, i10, i11, i12));
        this.f19892v = arrayList.size();
    }

    public final void b(CharSequence charSequence) {
        ArrayList arrayList = this.f19893w;
        if (!arrayList.isEmpty()) {
            ((AIAnswerContent) arrayList.get(arrayList.size() - 1)).setSpanStr(charSequence);
        }
    }
}
