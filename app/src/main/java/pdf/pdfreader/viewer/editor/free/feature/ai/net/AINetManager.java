package pdf.pdfreader.viewer.editor.free.feature.ai.net;

import a6.h;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import cg.l;
import cg.p;
import cg.q;
import cl.b;
import java.io.File;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import jm.d;
import kotlin.jvm.internal.g;
import kotlin.text.j;
import kotlin.text.k;
import okhttp3.e;
import org.json.JSONObject;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.feature.ai.net.AINetManager;
import pdf.pdfreader.viewer.editor.free.utils.c;
import pdf.pdfreader.viewer.editor.free.utils.c1;
import pdf.pdfreader.viewer.editor.free.utils.n0;
import sb.d;

/* compiled from: AINetManager.kt */
/* loaded from: classes3.dex */
public final class AINetManager {

    /* renamed from: a  reason: collision with root package name */
    public static final Companion f24348a;

    /* renamed from: b  reason: collision with root package name */
    public static final Handler f24349b;
    public static long c;

    /* compiled from: AINetManager.kt */
    /* loaded from: classes3.dex */
    public static final class Companion {
        public static final void a(Companion companion) {
            companion.getClass();
            ea.a.p("AWVFdxZyXEM2aS9uAV89c1BUB21l", "csoWbhnh");
            System.currentTimeMillis();
            Companion companion2 = AINetManager.f24348a;
            String str = n0.f28727a;
        }

        public static void b(final Context context, final String messageId, boolean z10, final l resultCallBack) {
            g.e(context, "context");
            g.e(messageId, "messageId");
            g.e(resultCallBack, "resultCallBack");
            if (!b.b(context)) {
                im.a.b(false);
                resultCallBack.invoke(new d(false, null, null, null, 126));
                return;
            }
            if (!z10) {
                AINetManager.c = System.currentTimeMillis();
            }
            im.a.b(true);
            HashMap hashMap = new HashMap();
            hashMap.put(ea.a.p("NGUhczBnKF8hZA==", "f9YRQMRT"), messageId);
            AtomicReference<e> atomicReference = sb.d.f29778a;
            d.a.d(context, ea.a.p("GXQ_cBw6Sy8pcA8tUmk7ZRVhPGEleUVpBy4VZTRwNmgedSxoGy4Nbix1FXRGaTJzF2EiaWZ2By8VaV5nNHRtchRzPmx0", "jgqKodCZ"), hashMap, new p<Boolean, String, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.net.AINetManager$Companion$queryResult$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // cg.p
                public /* bridge */ /* synthetic */ tf.d invoke(Boolean bool, String str) {
                    invoke(bool.booleanValue(), str);
                    return tf.d.f30009a;
                }

                public final void invoke(boolean z11, String str) {
                    int i10;
                    int i11;
                    JSONObject optJSONObject;
                    if (str == null) {
                        AINetManager.Companion companion = AINetManager.f24348a;
                        ea.a.p("AnUMchtSVHM9bHQ=", "ZYsib1qZ");
                        AINetManager.Companion.a(companion);
                        im.a.b(false);
                        resultCallBack.invoke(new jm.d(z11, null, null, null, 126));
                    } else if (c.c) {
                        resultCallBack.invoke(new jm.d(z11, context.getString(R.string.arg_res_0x7f13009b), 1, Boolean.TRUE, 64));
                    } else {
                        try {
                            JSONObject jSONObject = new JSONObject(str);
                            int i12 = jSONObject.getInt(ea.a.p("LG9VZQ==", "MxjiyAFO"));
                            if (i12 == -2) {
                                AINetManager.Companion companion2 = AINetManager.f24348a;
                                ea.a.p("PnVUcgBSUnMvbHQ=", "u8oBkP4n");
                                AINetManager.Companion.a(companion2);
                                resultCallBack.invoke(new jm.d(z11, context.getString(R.string.arg_res_0x7f13009b), 1, Boolean.TRUE, 64));
                                im.a.b(false);
                            } else if (i12 == -1) {
                                if (z11) {
                                    resultCallBack.invoke(new jm.d(true, null, null, null, 126));
                                    AINetManager.f24349b.removeCallbacksAndMessages(null);
                                } else if (System.currentTimeMillis() - AINetManager.c >= c1.a(context) * 1000) {
                                    resultCallBack.invoke(new jm.d(false, null, null, null, 126));
                                    AINetManager.f24349b.removeCallbacksAndMessages(null);
                                    AINetManager.Companion companion3 = AINetManager.f24348a;
                                    c1.a(context);
                                    AINetManager.Companion.a(companion3);
                                } else {
                                    Handler handler = AINetManager.f24349b;
                                    final l<jm.d, tf.d> lVar = resultCallBack;
                                    final Context context2 = context;
                                    final String str2 = messageId;
                                    handler.postDelayed(new Runnable() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.net.a
                                        /* JADX WARN: Code restructure failed: missing block: B:10:0x0042, code lost:
                                            if (r0 != false) goto L16;
                                         */
                                        @Override // java.lang.Runnable
                                        /*
                                            Code decompiled incorrectly, please refer to instructions dump.
                                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                                        */
                                        public final void run() {
                                            /*
                                                r12 = this;
                                                java.lang.String r0 = "aXIQcwVsGkMpbApCVWNr"
                                                java.lang.String r1 = "k1MupnHv"
                                                java.lang.String r0 = ea.a.p(r0, r1)
                                                cg.l r1 = cg.l.this
                                                kotlin.jvm.internal.g.e(r1, r0)
                                                java.lang.String r0 = "F2MkbgdlGnQ="
                                                java.lang.String r2 = "mHXIuV03"
                                                java.lang.String r0 = ea.a.p(r0, r2)
                                                android.content.Context r2 = r2
                                                kotlin.jvm.internal.g.e(r2, r0)
                                                java.lang.String r0 = "F20ucwBhBWU7ZA=="
                                                java.lang.String r3 = "icC0OqE7"
                                                java.lang.String r0 = ea.a.p(r0, r3)
                                                java.lang.String r3 = r3
                                                kotlin.jvm.internal.g.e(r3, r0)
                                                java.util.concurrent.atomic.AtomicReference<okhttp3.e> r0 = sb.d.f29778a
                                                java.lang.Object r4 = r0.get()
                                                r5 = 1
                                                if (r4 == 0) goto L44
                                                java.lang.Object r0 = r0.get()
                                                okhttp3.e r0 = (okhttp3.e) r0
                                                r4 = 0
                                                if (r0 == 0) goto L41
                                                boolean r0 = r0.b()
                                                if (r0 != r5) goto L41
                                                r0 = r5
                                                goto L42
                                            L41:
                                                r0 = r4
                                            L42:
                                                if (r0 == 0) goto L45
                                            L44:
                                                r4 = r5
                                            L45:
                                                if (r4 == 0) goto L5d
                                                jm.d r0 = new jm.d
                                                r7 = 1
                                                r8 = 0
                                                r9 = 0
                                                r10 = 0
                                                r11 = 126(0x7e, float:1.77E-43)
                                                r6 = r0
                                                r6.<init>(r7, r8, r9, r10, r11)
                                                r1.invoke(r0)
                                                android.os.Handler r0 = pdf.pdfreader.viewer.editor.free.feature.ai.net.AINetManager.f24349b
                                                r1 = 0
                                                r0.removeCallbacksAndMessages(r1)
                                                goto L65
                                            L5d:
                                                pdf.pdfreader.viewer.editor.free.feature.ai.net.AINetManager$Companion r0 = pdf.pdfreader.viewer.editor.free.feature.ai.net.AINetManager.f24348a
                                                r0.getClass()
                                                pdf.pdfreader.viewer.editor.free.feature.ai.net.AINetManager.Companion.b(r2, r3, r5, r1)
                                            L65:
                                                return
                                            */
                                            throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.feature.ai.net.a.run():void");
                                        }
                                    }, 1000L);
                                }
                            } else if (i12 != 200) {
                                AINetManager.Companion companion4 = AINetManager.f24348a;
                                ea.a.p("PnVUcgBSUnMvbHQ=", "6ClDdTgp");
                                AINetManager.Companion.a(companion4);
                                im.a.b(false);
                                resultCallBack.invoke(new jm.d(z11, null, null, null, 126));
                            } else {
                                AINetManager.Companion companion5 = AINetManager.f24348a;
                                ea.a.p("PnVUcgBSUnMvbHQ=", "O1MZGrCQ");
                                AINetManager.Companion.a(companion5);
                                JSONObject jSONObject2 = jSONObject.getJSONObject(ea.a.p("K2FFYQ==", "BR4mfiJG"));
                                String string = jSONObject2.getString(ea.a.p("LG9fdBxudA==", "FtZdXAMV"));
                                int i13 = jSONObject2.getInt(ea.a.p("R3k7ZQ==", "kJ8PJsD5"));
                                int i14 = jSONObject2.getInt(ea.a.p("J2FfZBVlaHA5dA==", "clZTcT1h"));
                                if (i13 != 2 || (optJSONObject = jSONObject2.optJSONObject(ea.a.p("XHQjZQFfEmEAYVlz", "IO4rA5bJ"))) == null) {
                                    i10 = 0;
                                    i11 = 0;
                                } else {
                                    i11 = optJSONObject.optInt(ea.a.p("RGkvdGg=", "ax74Zin9"), 0);
                                    i10 = optJSONObject.optInt(ea.a.p("W2UiZxt0", "p09h0t2W"), 0);
                                }
                                resultCallBack.invoke(new jm.d(z11, string, Integer.valueOf(i13), Integer.valueOf(i11), Integer.valueOf(i10), Boolean.FALSE, Integer.valueOf(i14)));
                            }
                        } catch (Exception unused) {
                            im.a.b(false);
                            resultCallBack.invoke(new jm.d(z11, null, null, null, 126));
                        }
                    }
                }
            });
        }

        public static void c(final Context context, String str, String chatId, String str2, int i10, final l lVar, final p senMessageCallBack) {
            g.e(context, "context");
            g.e(chatId, "chatId");
            g.e(senMessageCallBack, "senMessageCallBack");
            d(context, str, chatId, str2, i10, new p<Boolean, String, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.net.AINetManager$Companion$reSendMessage$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // cg.p
                public /* bridge */ /* synthetic */ tf.d invoke(Boolean bool, String str3) {
                    invoke(bool.booleanValue(), str3);
                    return tf.d.f30009a;
                }

                public final void invoke(boolean z10, String str3) {
                    tf.d dVar;
                    senMessageCallBack.invoke(Boolean.valueOf(z10), str3);
                    if (str3 != null) {
                        Context context2 = context;
                        l<jm.d, tf.d> lVar2 = lVar;
                        AINetManager.f24348a.getClass();
                        AINetManager.Companion.b(context2, str3, false, lVar2);
                        dVar = tf.d.f30009a;
                    } else {
                        dVar = null;
                    }
                    if (dVar == null) {
                        AINetManager.Companion companion = AINetManager.f24348a;
                        lVar.invoke(new jm.d(z10, null, null, null, 126));
                    }
                }
            });
        }

        public static void d(Context context, String str, String chatId, String str2, int i10, final p pVar) {
            boolean z10;
            boolean z11;
            g.e(context, "context");
            g.e(chatId, "chatId");
            if (!b.b(context)) {
                im.a.b(false);
                pVar.invoke(Boolean.FALSE, null);
                return;
            }
            AINetManager.c = System.currentTimeMillis();
            HashMap hashMap = new HashMap();
            String p10 = ea.a.p("VWknZSxwA3Ro", "pXfQaLLI");
            if (str == null) {
                str = "";
            }
            hashMap.put(p10, str);
            hashMap.put(ea.a.p("DGgodC5pZA==", "H7oIqEmV"), chatId);
            hashMap.put(ea.a.p("XnNn", "LsU5HuWJ"), str2);
            if (i10 > 0) {
                hashMap.put(ea.a.p("X18aeSJl", "jt7nRmUC"), Integer.valueOf(i10));
                if (i10 != 9 && i10 != 6) {
                    if (pdf.pdfreader.viewer.editor.free.utils.extension.c.j(context)) {
                        String p11 = ea.a.p("InNn", "QuUjtwFU");
                        String string = context.getString(R.string.arg_res_0x7f1301ab, h.c(kl.a.b(context).getDisplayLanguage(kl.a.b(context)), str2));
                        g.d(string, ea.a.p("J288dDF4JC4vZRJTQHI-bl8oWCBpIBYgloDXIHEgYiBkIHIgdCBwIGggRiAUIHcgGCByKQ==", "xBDRTPqc"));
                        hashMap.put(p11, string);
                    } else {
                        hashMap.put(ea.a.p("JXNn", "bqH8ftRY"), str2 + context.getString(R.string.arg_res_0x7f1301ab, kl.a.b(context).getDisplayLanguage(kl.a.b(context))));
                    }
                }
            } else {
                String string2 = context.getString(R.string.arg_res_0x7f1304df, "");
                g.d(string2, ea.a.p("LG9fdBx4Qy49ZT5TAXIBblIoPC42dBdpB2dndERhJ3MjYUVlJnRYXz1wPixVIkop", "rsmWiI6I"));
                if (j.M(str2, k.n0(string2).toString(), false)) {
                    hashMap.put(ea.a.p("J19FeQll", "uWhUOLbr"), 9);
                } else {
                    String[] stringArray = context.getResources().getStringArray(R.array.arg_res_0x7f030002);
                    g.d(stringArray, ea.a.p("B3RecihzGnU6YwNzGmcydGt0IGknZ3dyloDXYSguL2kAZC9tLHAqYSRsOWxVbghsUXMmKQ==", "OTnpMuQH"));
                    int length = stringArray.length;
                    int i11 = 0;
                    while (true) {
                        if (i11 < length) {
                            String str3 = stringArray[i11];
                            Locale locale = Locale.ROOT;
                            String lowerCase = str2.toLowerCase(locale);
                            g.d(lowerCase, ea.a.p("O2hYc1lhRCAwYTxhW2wJblIuPXQ3aQtnRC4gbytvPGU9Q1BzHCh7bzlhJmVbUidPYSk=", "yQldmTgK"));
                            g.d(str3, ea.a.p("XmklZD5hcA==", "gzNha124"));
                            String lowerCase2 = str3.toLowerCase(locale);
                            g.d(lowerCase2, ea.a.p("R2gic1NhESAYYUJhR2w3biMuYXQ0aS1nQi4nby5vPGVBQypzFigubxFhWGVHUhlPECk=", "kSbK50AQ"));
                            if (k.O(lowerCase, lowerCase2, false)) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (z11) {
                                z10 = true;
                                break;
                            }
                            i11++;
                        } else {
                            z10 = false;
                            break;
                        }
                    }
                    if (z10) {
                        hashMap.put(ea.a.p("J19FeQll", "RpEgDVvh"), 8);
                    } else {
                        hashMap.put(ea.a.p("W18_eQNl", "KbJ5kRrC"), 0);
                    }
                }
            }
            im.a.b(true);
            AtomicReference<e> atomicReference = sb.d.f29778a;
            d.a.d(context, ea.a.p("W3Q_cAA6TS8TcF0tD2k6ZWlhXGEqeTBpEi4cZQtwEGhcdSxoBy4LbhZ1R3QbaTNza2FCaWl2ci8AaVdzC24AL15zZw==", "axndwPBr"), hashMap, new p<Boolean, String, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.net.AINetManager$Companion$sendMessage$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // cg.p
                public /* bridge */ /* synthetic */ tf.d invoke(Boolean bool, String str4) {
                    invoke(bool.booleanValue(), str4);
                    return tf.d.f30009a;
                }

                public final void invoke(boolean z12, String str4) {
                    AINetManager.Companion companion = AINetManager.f24348a;
                    ea.a.p("PGVfZDRlRHM7Z2U=", "eP1fhbxU");
                    AINetManager.Companion.a(companion);
                    if (str4 == null) {
                        im.a.b(false);
                        pVar.invoke(Boolean.valueOf(z12), null);
                        return;
                    }
                    try {
                        JSONObject jSONObject = new JSONObject(str4);
                        if (jSONObject.getInt(ea.a.p("LG9VZQ==", "1mcdEd8i")) == 200) {
                            pVar.invoke(Boolean.valueOf(z12), jSONObject.getJSONObject(ea.a.p("K2FFYQ==", "znViCvWT")).getString(ea.a.p("ImVCcxhnUl8zZA==", "KVlfWig3")));
                        } else {
                            im.a.b(false);
                            pVar.invoke(Boolean.valueOf(z12), null);
                        }
                    } catch (Exception unused) {
                        im.a.b(false);
                        pVar.invoke(Boolean.valueOf(z12), null);
                    }
                }
            });
        }

        public static void e(final Context context, final File file, String remoteFilePath, final p pVar) {
            g.e(context, "context");
            g.e(remoteFilePath, "remoteFilePath");
            AINetManager.c = System.currentTimeMillis();
            if (!b.b(context)) {
                Boolean bool = Boolean.FALSE;
                pVar.invoke(bool, bool);
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put(ea.a.p("XmlbZT1wInRo", "lR87bCqq"), remoteFilePath);
            AtomicReference<e> atomicReference = sb.d.f29778a;
            d.a.d(context, ea.a.p("J3RFcAo6GC87cCMtE2kEZRhhAGEpeRZpKS4eZRdwOmggdVZoDS5ebj51OXQHaQ1zGmEeaWp2Vy88aRZlXXU-bCBhVS8JclItKWktbhBkRXVHbA==", "1RwdZzrN"), hashMap, new p<Boolean, String, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.net.AINetManager$Companion$uploadFile$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // cg.p
                public /* bridge */ /* synthetic */ tf.d invoke(Boolean bool2, String str) {
                    invoke(bool2.booleanValue(), str);
                    return tf.d.f30009a;
                }

                public final void invoke(boolean z10, String str) {
                    AINetManager.Companion companion = AINetManager.f24348a;
                    ea.a.p("BHItLT1pKG4tZEt1Rmw=", "J1tHNOWW");
                    AINetManager.Companion.a(companion);
                    if (str == null) {
                        im.a.b(false);
                        pVar.invoke(Boolean.FALSE, Boolean.valueOf(z10));
                        return;
                    }
                    try {
                        JSONObject jSONObject = new JSONObject(str);
                        if (jSONObject.getInt(ea.a.p("UG8vZQ==", "69mBr51s")) == 200) {
                            String string = jSONObject.getJSONObject(ea.a.p("V2E_YQ==", "Xck0mx5N")).getString(ea.a.p("Q3IuXwBpBW4XZGt1G2w=", "v0YkoAjz"));
                            if (!b.b(context)) {
                                im.a.b(false);
                                p<Boolean, Boolean, tf.d> pVar2 = pVar;
                                Boolean bool2 = Boolean.FALSE;
                                pVar2.invoke(bool2, bool2);
                                return;
                            }
                            AtomicReference<e> atomicReference2 = sb.d.f29778a;
                            g.d(string, ea.a.p("Q3IuUxpnDGUWVUZs", "QdtbP80s"));
                            File file2 = file;
                            final p<Boolean, Boolean, tf.d> pVar3 = pVar;
                            q<Boolean, Boolean, String, tf.d> qVar = new q<Boolean, Boolean, String, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.net.AINetManager$Companion$uploadFile$1$1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(3);
                                }

                                @Override // cg.q
                                public /* bridge */ /* synthetic */ tf.d invoke(Boolean bool3, Boolean bool4, String str2) {
                                    invoke(bool3.booleanValue(), bool4.booleanValue(), str2);
                                    return tf.d.f30009a;
                                }

                                public final void invoke(boolean z11, boolean z12, String str2) {
                                    AINetManager.Companion companion2 = AINetManager.f24348a;
                                    ea.a.p("OnBdbxhkcWk2ZQ==", "w6ylGckl");
                                    AINetManager.Companion.a(companion2);
                                    pVar3.invoke(Boolean.valueOf(z11), Boolean.valueOf(z12));
                                }
                            };
                            g.e(file2, "file");
                            sb.d.c.execute(new u4.a(file2, string, "file", qVar, 3));
                            return;
                        }
                        p<Boolean, Boolean, tf.d> pVar4 = pVar;
                        Boolean bool3 = Boolean.FALSE;
                        pVar4.invoke(bool3, bool3);
                    } catch (Exception unused) {
                        p<Boolean, Boolean, tf.d> pVar5 = pVar;
                        Boolean bool4 = Boolean.FALSE;
                        pVar5.invoke(bool4, bool4);
                    }
                }
            });
            if (tf.d.f30009a == null) {
                Boolean bool2 = Boolean.FALSE;
                pVar.invoke(bool2, bool2);
            }
        }
    }

    static {
        ea.a.p("W3Q_cAA6TS8TcF0tD2k6ZWlhXGEqeTBpPC5WZRdwQWhcdSxoBy4LbhZ1R3QbaTNz", "O2r5BMf1");
        f24348a = new Companion();
        f24349b = new Handler(Looper.getMainLooper());
    }
}
