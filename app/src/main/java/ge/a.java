package ge;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.inputmethod.InputMethodManager;
import android.webkit.MimeTypeMap;
import androidx.activity.s;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.g0;
import com.android.billingclient.api.a0;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.assetpacks.b1;
import com.google.firebase.analytics.FirebaseAnalytics;
import gj.l;
import i4.k;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.logging.Logger;
import kk.n;
import kk.o;
import kk.r;
import kk.t;
import kk.w;
import kk.x;
import kk.y;
import kk.z;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.coroutines.CoroutineContext;
import kotlin.random.Random;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.internal.ThreadContextKt;
import kotlinx.coroutines.n0;
import kotlinx.coroutines.o1;
import kotlinx.coroutines.q;
import kotlinx.coroutines.q1;
import kotlinx.coroutines.y0;
import lh.p;
import lib.zj.office.java.awt.Rectangle;
import okhttp3.j;
import okio.SegmentedByteString;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.utils.FileMimeTypeEnum;
import pdf.pdfreader.viewer.editor.free.utils.t1;

/* compiled from: Analytics.java */
/* loaded from: classes.dex */
public class a implements k, Continuation, j, pdf.pdfreader.viewer.editor.free.data.c, pdf.pdfreader.viewer.editor.free.data.d, x3.a {

    /* renamed from: a  reason: collision with root package name */
    public static int f17751a = -1;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f17752b = false;
    public static String c;

    /* renamed from: d  reason: collision with root package name */
    public static long f17753d;

    /* renamed from: i  reason: collision with root package name */
    public static u0.a f17758i;

    /* renamed from: n  reason: collision with root package name */
    public static a f17763n;

    /* renamed from: e  reason: collision with root package name */
    public static final b1 f17754e = new b1();

    /* renamed from: f  reason: collision with root package name */
    public static final Object[] f17755f = new Object[0];

    /* renamed from: g  reason: collision with root package name */
    public static final a0 f17756g = new a0("UNDEFINED", 8);

    /* renamed from: h  reason: collision with root package name */
    public static final a0 f17757h = new a0("REUSABLE_CLAIMED", 8);

    /* renamed from: j  reason: collision with root package name */
    public static final float[][] f17759j = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    /* renamed from: k  reason: collision with root package name */
    public static final float[][] f17760k = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* renamed from: l  reason: collision with root package name */
    public static final float[] f17761l = {95.047f, 100.0f, 108.883f};

    /* renamed from: m  reason: collision with root package name */
    public static final float[][] f17762m = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    public /* synthetic */ a(int i10) {
    }

    public static final int A(List list) {
        kotlin.jvm.internal.g.e(list, "<this>");
        return list.size() - 1;
    }

    public static int[] B(Context context) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(ea.a.p("dDgHMA8-Bj52Plg-Cj5pPgY-bFQmdFdsJmEcPT0=", "mHD418gC"));
        sb2.append((g.d().e() / 1024) / 1024);
        sb2.append(ea.a.p("dXIuZSFhDz09", "ku0c2laJ"));
        g.d().getClass();
        sb2.append((g.a(context) / 1024) / 1024);
        t1.b(sb2.toString());
        int[] iArr = {1, 1};
        g.d().getClass();
        int a10 = ((int) ((g.a(context) / 1024) / 1024)) - 200;
        if (a10 < 1000) {
            return iArr;
        }
        if (a10 < 2000) {
            iArr[0] = 2;
            iArr[1] = 2;
            return iArr;
        } else if (a10 < 4000) {
            iArr[0] = 3;
            iArr[1] = 4;
            return iArr;
        } else {
            iArr[0] = 4;
            iArr[1] = 6;
            return iArr;
        }
    }

    public static int C(float f10) {
        boolean z10;
        float f11;
        boolean z11;
        float f12;
        if (f10 < 1.0f) {
            return -16777216;
        }
        if (f10 > 99.0f) {
            return -1;
        }
        float f13 = (f10 + 16.0f) / 116.0f;
        if (f10 > 8.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            f11 = f13 * f13 * f13;
        } else {
            f11 = f10 / 903.2963f;
        }
        float f14 = f13 * f13 * f13;
        if (f14 > 0.008856452f) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            f12 = f14;
        } else {
            f12 = ((f13 * 116.0f) - 16.0f) / 903.2963f;
        }
        if (!z11) {
            f14 = ((f13 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = f17761l;
        return o0.a.a(f12 * fArr[0], f11 * fArr[1], f14 * fArr[2]);
    }

    public static final boolean D(AssertionError assertionError) {
        boolean z10;
        Logger logger = o.f19839a;
        if (assertionError.getCause() == null) {
            return false;
        }
        String message = assertionError.getMessage();
        if (message != null) {
            z10 = kotlin.text.k.O(message, "getsockname failed", false);
        } else {
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        return true;
    }

    public static boolean E(int i10, CharSequence charSequence) {
        if (i10 < charSequence.length()) {
            char charAt = charSequence.charAt(i10);
            switch (charAt) {
                case '!':
                case '\"':
                case '#':
                case '$':
                case '%':
                case '&':
                case '\'':
                case '(':
                case ')':
                case '*':
                case '+':
                case ',':
                case '-':
                case '.':
                case '/':
                    return true;
                default:
                    switch (charAt) {
                        case ':':
                        case ';':
                        case '<':
                        case '=':
                        case '>':
                        case '?':
                        case '@':
                            return true;
                        default:
                            switch (charAt) {
                                case '[':
                                case '\\':
                                case ']':
                                case '^':
                                case '_':
                                case '`':
                                    return true;
                                default:
                                    switch (charAt) {
                                        case '{':
                                        case '|':
                                        case '}':
                                        case '~':
                                            return true;
                                        default:
                                            return false;
                                    }
                            }
                    }
            }
        }
        return false;
    }

    public static boolean F(String str) {
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
        if (TextUtils.isEmpty(fileExtensionFromUrl)) {
            if (str.contains(ea.a.p("Lg==", "skpMyRhz"))) {
                fileExtensionFromUrl = str.substring(str.lastIndexOf(ea.a.p("Lg==", "kgtWY2zS")) + 1, str.length());
            } else {
                fileExtensionFromUrl = "";
            }
        }
        return fileExtensionFromUrl.equalsIgnoreCase(ea.a.p("Dmlm", "99ifEkfT"));
    }

    public static float G(int i10) {
        float pow;
        float f10 = i10 / 255.0f;
        if (f10 <= 0.04045f) {
            pow = f10 / 12.92f;
        } else {
            pow = (float) Math.pow((f10 + 0.055f) / 1.055f, 2.4000000953674316d);
        }
        return pow * 100.0f;
    }

    public static final List H(Object obj) {
        List singletonList = Collections.singletonList(obj);
        kotlin.jvm.internal.g.d(singletonList, "singletonList(element)");
        return singletonList;
    }

    public static final List I(Object... elements) {
        kotlin.jvm.internal.g.e(elements, "elements");
        if (elements.length > 0) {
            return kotlin.collections.f.v(elements);
        }
        return EmptyList.INSTANCE;
    }

    public static final ArrayList J(Object... elements) {
        kotlin.jvm.internal.g.e(elements, "elements");
        if (elements.length == 0) {
            return new ArrayList();
        }
        return new ArrayList(new kotlin.collections.d(elements, true));
    }

    public static final List K(List list) {
        int size = list.size();
        if (size != 0) {
            if (size == 1) {
                return H(list.get(0));
            }
            return list;
        }
        return EmptyList.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0596  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x05df  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0b42  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0b4f  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0b53  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0b60  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void L(lh.c r46, lib.zj.office.fc.dom4j.Element r47, eh.b r48, boolean r49, eh.b r50, lib.zj.office.fc.dom4j.Element r51, lib.zj.office.java.awt.Rectangle r52) {
        /*
            Method dump skipped, instructions count: 2948
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ge.a.L(lh.c, lib.zj.office.fc.dom4j.Element, eh.b, boolean, eh.b, lib.zj.office.fc.dom4j.Element, lib.zj.office.java.awt.Rectangle):void");
    }

    public static void M(gj.f fVar, p pVar, ai.f fVar2) {
        ai.e eVar;
        ai.e eVar2;
        ai.e eVar3;
        ai.e eVar4;
        ai.e eVar5;
        ai.e eVar6;
        ai.e eVar7;
        ai.e eVar8;
        byte b10 = pVar.f20647s;
        byte b11 = pVar.f20648t;
        if (b10 == 1) {
            float f10 = pVar.f20649u / 1000.0f;
            if (b11 == 2) {
                fVar.f480b = Math.round(fVar2.f509a * f10);
            } else if (b11 == 1) {
                int i10 = fVar2.f512e;
                fVar.f480b = Math.round(((fVar2.f509a - i10) - fVar2.f513f) * f10) + i10;
            } else if (b11 == 4) {
                fVar.f480b = Math.round(fVar2.f512e * f10);
            } else if (b11 == 5) {
                int i11 = fVar2.f509a;
                int i12 = fVar2.f513f;
                fVar.f480b = Math.round(i12 * f10) + (i11 - i12);
            } else if (b11 == 9) {
                ai.e eVar9 = fVar.f489l;
                if (eVar9 != null && eVar9.j() != null && fVar.f489l.j().j() != null) {
                    if (((gj.k) fVar.f489l.j().j()).f17858q % 2 == 1) {
                        int i13 = fVar2.f509a;
                        int i14 = fVar2.f513f;
                        fVar.f480b = Math.round(i14 * f10) + (i13 - i14);
                    } else {
                        fVar.f480b = Math.round(fVar2.f512e * f10);
                    }
                }
            } else if (b11 == 8) {
                if (((gj.k) fVar.f489l.j().j()).f17858q % 2 == 1) {
                    fVar.f480b = Math.round(fVar2.f512e * f10);
                } else {
                    int i15 = fVar2.f509a;
                    int i16 = fVar2.f513f;
                    fVar.f480b = Math.round(i16 * f10) + (i15 - i16);
                }
            }
        } else {
            byte b12 = pVar.f20650v;
            if (b12 == 0) {
                Rectangle bounds = pVar.getBounds();
                byte b13 = pVar.f20648t;
                if (b13 != 1 && b13 != 10 && b13 != 0 && b13 != 3) {
                    if (b13 != 2 && b13 != 4) {
                        if (b13 == 5) {
                            fVar.f480b = (fVar2.f509a - fVar2.f513f) + bounds.f20688x;
                        } else if (b13 == 9) {
                            ai.e eVar10 = fVar.f489l;
                            if (eVar10 != null && eVar10.j() != null && fVar.f489l.j().j() != null) {
                                if (((gj.k) fVar.f489l.j().j()).f17858q % 2 == 1) {
                                    fVar.f480b = (fVar2.f509a - fVar2.f513f) + bounds.f20688x;
                                } else {
                                    fVar.f480b = bounds.f20688x;
                                }
                            }
                        } else if (b13 == 8 && (eVar5 = fVar.f489l) != null && eVar5.j() != null && fVar.f489l.j().j() != null) {
                            if (((gj.k) fVar.f489l.j().j()).f17858q % 2 == 1) {
                                fVar.f480b = bounds.f20688x;
                            } else {
                                fVar.f480b = (fVar2.f509a - fVar2.f513f) + bounds.f20688x;
                            }
                        }
                    } else {
                        fVar.f480b = bounds.f20688x;
                    }
                } else {
                    fVar.f480b = fVar2.f512e + bounds.f20688x;
                }
            } else if (b12 == 1) {
                pVar.getBounds();
                byte b14 = pVar.f20648t;
                if (b14 != 1 && b14 != 10 && b14 != 0 && b14 != 3) {
                    if (b14 != 2 && b14 != 4) {
                        if (b14 == 5) {
                            fVar.f480b = fVar2.f509a - fVar2.f513f;
                        } else if (b14 == 9) {
                            ai.e eVar11 = fVar.f489l;
                            if (eVar11 != null && eVar11.j() != null && fVar.f489l.j().j() != null) {
                                if (((gj.k) fVar.f489l.j().j()).f17858q % 2 == 1) {
                                    fVar.f480b = fVar2.f509a - fVar2.f513f;
                                } else {
                                    fVar.f480b = 0;
                                }
                            }
                        } else if (b14 == 8 && (eVar4 = fVar.f489l) != null && eVar4.j() != null && fVar.f489l.j().j() != null) {
                            if (((gj.k) fVar.f489l.j().j()).f17858q % 2 == 1) {
                                fVar.f480b = 0;
                            } else {
                                fVar.f480b = fVar2.f509a - fVar2.f513f;
                            }
                        }
                    } else {
                        fVar.f480b = 0;
                    }
                } else {
                    fVar.f480b = fVar2.f512e;
                }
            } else if (b12 == 2) {
                int i17 = pVar.getBounds().width / 2;
                byte b15 = pVar.f20648t;
                if (b15 == 2) {
                    fVar.f480b = (fVar2.f509a / 2) - i17;
                } else if (b15 != 1 && b15 != 0) {
                    if (b15 == 3) {
                        fVar.f480b = fVar2.f512e - i17;
                    } else if (b15 == 4) {
                        fVar.f480b = (fVar2.f512e / 2) - i17;
                    } else if (b15 == 5) {
                        fVar.f480b = (fVar2.f509a - (fVar2.f513f / 2)) - i17;
                    } else if (b15 == 9) {
                        ai.e eVar12 = fVar.f489l;
                        if (eVar12 != null && eVar12.j() != null && fVar.f489l.j().j() != null) {
                            if (((gj.k) fVar.f489l.j().j()).f17858q % 2 == 1) {
                                fVar.f480b = (fVar2.f509a - (fVar2.f513f / 2)) - i17;
                            } else {
                                fVar.f480b = (fVar2.f512e / 2) - i17;
                            }
                        }
                    } else if (b15 == 8 && (eVar3 = fVar.f489l) != null && eVar3.j() != null && fVar.f489l.j().j() != null) {
                        if (((gj.k) fVar.f489l.j().j()).f17858q % 2 == 1) {
                            fVar.f480b = (fVar2.f512e / 2) - i17;
                        } else {
                            fVar.f480b = (fVar2.f509a - (fVar2.f513f / 2)) - i17;
                        }
                    }
                } else {
                    int i18 = fVar2.f512e;
                    fVar.f480b = ((((fVar2.f509a - i18) - fVar2.f513f) / 2) + i18) - i17;
                }
            } else if (b12 == 3) {
                Rectangle bounds2 = pVar.getBounds();
                byte b16 = pVar.f20648t;
                if (b16 != 2 && b16 != 5) {
                    if (b16 != 1 && b16 != 0) {
                        if (b16 != 3 && b16 != 4) {
                            if (b16 == 9) {
                                ai.e eVar13 = fVar.f489l;
                                if (eVar13 != null && eVar13.j() != null && fVar.f489l.j().j() != null) {
                                    if (((gj.k) fVar.f489l.j().j()).f17858q % 2 == 1) {
                                        fVar.f480b = fVar2.f509a - bounds2.width;
                                    } else {
                                        fVar.f480b = fVar2.f512e - bounds2.width;
                                    }
                                }
                            } else if (b16 == 8 && (eVar2 = fVar.f489l) != null && eVar2.j() != null && fVar.f489l.j().j() != null) {
                                if (((gj.k) fVar.f489l.j().j()).f17858q % 2 == 1) {
                                    fVar.f480b = fVar2.f512e - bounds2.width;
                                } else {
                                    fVar.f480b = fVar2.f509a - bounds2.width;
                                }
                            }
                        } else {
                            fVar.f480b = fVar2.f512e - bounds2.width;
                        }
                    } else {
                        fVar.f480b = (fVar2.f509a - fVar2.f513f) - bounds2.width;
                    }
                } else {
                    fVar.f480b = fVar2.f509a - bounds2.width;
                }
            } else if (b12 == 6) {
                ai.e eVar14 = fVar.f489l;
                if (eVar14 != null && eVar14.j() != null && fVar.f489l.j().j() != null) {
                    Rectangle bounds3 = pVar.getBounds();
                    byte b17 = pVar.f20648t;
                    if (((gj.k) fVar.f489l.j().j()).f17858q % 2 == 1) {
                        if (b17 == 2) {
                            fVar.f480b = 0;
                        } else if (b17 == 1) {
                            fVar.f480b = fVar2.f512e;
                        }
                    } else if (b17 == 2) {
                        fVar.f480b = fVar2.f509a - bounds3.width;
                    } else if (b17 == 1) {
                        fVar.f480b = (fVar2.f509a - fVar2.f513f) - bounds3.width;
                    }
                }
            } else if (b12 == 7 && (eVar = fVar.f489l) != null && eVar.j() != null && fVar.f489l.j().j() != null) {
                Rectangle bounds4 = pVar.getBounds();
                byte b18 = pVar.f20648t;
                if (((gj.k) fVar.f489l.j().j()).f17858q % 2 == 1) {
                    if (b18 == 2) {
                        fVar.f480b = fVar2.f509a - bounds4.width;
                    } else if (b18 == 1) {
                        fVar.f480b = (fVar2.f509a - fVar2.f513f) - bounds4.width;
                    }
                } else if (b18 == 2) {
                    fVar.f480b = 0;
                } else if (b18 == 1) {
                    fVar.f480b = fVar2.f512e;
                }
            }
        }
        byte b19 = pVar.f20651w;
        byte b20 = pVar.f20652x;
        if (b19 == 1) {
            float f11 = pVar.f20653y / 1000.0f;
            if (b20 == 2) {
                fVar.c = Math.round(fVar2.f510b * f11);
                return;
            } else if (b20 == 1) {
                int i19 = fVar2.c;
                fVar.c = Math.round(((fVar2.f510b - i19) - fVar2.f511d) * f11) + i19;
                return;
            } else if (b20 == 6) {
                fVar.c = Math.round(fVar2.c * f11);
                return;
            } else if (b20 == 7) {
                int i20 = fVar2.f510b;
                int i21 = fVar2.f511d;
                fVar.c = Math.round(i21 * f11) + (i20 - i21);
                return;
            } else if ((b20 == 9 || b20 == 8) && (eVar8 = fVar.f489l) != null && eVar8.j() != null && fVar.f489l.j().j() != null) {
                if (((gj.k) fVar.f489l.j().j()).f17858q % 2 == 1) {
                    fVar.c = Math.round(fVar2.c * f11);
                    return;
                }
                int i22 = fVar2.f510b;
                int i23 = fVar2.f511d;
                fVar.c = Math.round(i23 * f11) + (i22 - i23);
                return;
            } else {
                return;
            }
        }
        byte b21 = pVar.f20654z;
        if (b21 == 0) {
            Rectangle bounds5 = pVar.getBounds();
            byte b22 = pVar.f20652x;
            if (b22 != 2 && b22 != 6) {
                if (b22 != 8 && b22 != 9) {
                    if (b22 == 1) {
                        fVar.c = fVar2.c + bounds5.f20689y;
                        return;
                    } else if (b22 != 10 && b22 != 11) {
                        if (b22 == 7) {
                            fVar.c = (fVar2.f510b - fVar2.f511d) + bounds5.f20689y;
                            return;
                        }
                        return;
                    } else {
                        ai.e eVar15 = fVar.f489l;
                        if (eVar15 != null && (eVar15.j() instanceof l)) {
                            fVar.c = ((l) fVar.f489l.j()).c + bounds5.f20689y;
                            return;
                        }
                        return;
                    }
                }
                ai.e eVar16 = fVar.f489l;
                if (eVar16 != null && eVar16.j() != null && fVar.f489l.j().j() != null) {
                    if (((gj.k) fVar.f489l.j().j()).f17858q % 2 == 1) {
                        fVar.c = bounds5.f20689y;
                        return;
                    } else {
                        fVar.c = (fVar2.f510b - fVar2.f511d) + bounds5.f20689y;
                        return;
                    }
                }
                return;
            }
            fVar.c = bounds5.f20689y;
        } else if (b21 == 4) {
            pVar.getBounds();
            byte b23 = pVar.f20652x;
            if (b23 != 2 && b23 != 6) {
                if (b23 != 8 && b23 != 9) {
                    if (b23 == 1) {
                        fVar.c = fVar2.c;
                        return;
                    } else if (b23 != 10 && b23 != 11) {
                        if (b23 == 7) {
                            fVar.c = fVar2.f510b - fVar2.f511d;
                            return;
                        }
                        return;
                    } else {
                        ai.e eVar17 = fVar.f489l;
                        if (eVar17 != null && (eVar17.j() instanceof l)) {
                            fVar.c = ((l) fVar.f489l.j()).c;
                            return;
                        }
                        return;
                    }
                }
                ai.e eVar18 = fVar.f489l;
                if (eVar18 != null && eVar18.j() != null && fVar.f489l.j().j() != null) {
                    if (((gj.k) fVar.f489l.j().j()).f17858q % 2 == 1) {
                        fVar.c = 0;
                        return;
                    } else {
                        fVar.c = fVar2.f510b - fVar2.f511d;
                        return;
                    }
                }
                return;
            }
            fVar.c = 0;
        } else if (b21 == 2) {
            Rectangle bounds6 = pVar.getBounds();
            byte b24 = pVar.f20652x;
            int i24 = bounds6.height / 2;
            if (b24 == 2) {
                fVar.c = (fVar2.f510b / 2) - i24;
            } else if (b24 == 1) {
                int i25 = fVar2.c;
                fVar.c = ((((fVar2.f510b - i25) - fVar2.f511d) / 2) + i25) - i24;
            } else if (b24 == 6) {
                fVar.c = (fVar2.c / 2) - i24;
            } else if (b24 != 8 && b24 != 9) {
                if (b24 == 7) {
                    fVar.c = (fVar2.f510b - (fVar2.f511d / 2)) - i24;
                } else if ((b24 == 10 || b24 == 11) && (eVar7 = fVar.f489l) != null && (eVar7.j() instanceof l)) {
                    fVar.c = ((l) fVar.f489l.j()).c - i24;
                }
            } else {
                ai.e eVar19 = fVar.f489l;
                if (eVar19 != null && eVar19.j() != null && fVar.f489l.j().j() != null) {
                    if (((gj.k) fVar.f489l.j().j()).f17858q % 2 == 1) {
                        fVar.c = (fVar2.c / 2) - i24;
                    } else {
                        fVar.c = (fVar2.f510b - (fVar2.f511d / 2)) - i24;
                    }
                }
            }
        } else if (b21 == 5) {
            Rectangle bounds7 = pVar.getBounds();
            byte b25 = pVar.f20652x;
            if (b25 != 2 && b25 != 7) {
                if (b25 == 1) {
                    fVar.c = (fVar2.f510b - fVar2.f511d) - bounds7.height;
                    return;
                } else if (b25 != 10 && b25 != 11) {
                    if (b25 == 6) {
                        fVar.c = fVar2.c - bounds7.height;
                        return;
                    } else if ((b25 == 8 || b25 == 9) && (eVar6 = fVar.f489l) != null && eVar6.j() != null && fVar.f489l.j().j() != null) {
                        if (((gj.k) fVar.f489l.j().j()).f17858q % 2 == 1) {
                            fVar.c = fVar2.c - bounds7.height;
                            return;
                        } else {
                            fVar.c = fVar2.f510b - bounds7.height;
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    ai.e eVar20 = fVar.f489l;
                    if (eVar20 != null && (eVar20.j() instanceof l)) {
                        l lVar = (l) fVar.f489l.j();
                        fVar.c = (lVar.c + lVar.f482e) - bounds7.height;
                        return;
                    }
                    return;
                }
            }
            fVar.c = fVar2.f510b - bounds7.height;
        } else if (b21 == 6) {
            Rectangle bounds8 = pVar.getBounds();
            byte b26 = pVar.f20652x;
            ai.e eVar21 = fVar.f489l;
            if (eVar21 != null && eVar21.j() != null && fVar.f489l.j().j() != null) {
                if (((gj.k) fVar.f489l.j().j()).f17858q % 2 == 1) {
                    if (b26 == 2) {
                        fVar.c = fVar2.f516i / 2;
                    } else if (b26 == 1) {
                        fVar.c = fVar2.c;
                    } else if (b26 != 10 && b26 != 11) {
                        if (b26 == 6) {
                            fVar.c = 0;
                        } else if (b26 == 7) {
                            fVar.c = fVar2.f510b - fVar2.f511d;
                        } else if (b26 == 8 || b26 == 9) {
                            fVar.c = 0;
                        }
                    } else {
                        fVar.c = ((l) fVar.f489l.j()).c;
                    }
                } else if (b26 == 2) {
                    fVar.c = fVar2.f510b - fVar2.f517j;
                } else if (b26 == 1) {
                    fVar.c = (fVar2.f510b - fVar2.f511d) - bounds8.height;
                } else if (b26 != 10 && b26 != 11) {
                    if (b26 == 6) {
                        fVar.c = fVar2.c - bounds8.height;
                    } else if (b26 == 7) {
                        fVar.c = fVar2.f510b - bounds8.height;
                    } else if (b26 == 8 || b26 == 9) {
                        fVar.c = fVar2.f510b - bounds8.height;
                    }
                } else {
                    l lVar2 = (l) fVar.f489l.j();
                    fVar.c = (lVar2.c + lVar2.f482e) - bounds8.height;
                }
            }
        } else if (b21 == 7) {
            Rectangle bounds9 = pVar.getBounds();
            byte b27 = pVar.f20652x;
            ai.e eVar22 = fVar.f489l;
            if (eVar22 != null && eVar22.j() != null && fVar.f489l.j().j() != null) {
                if (((gj.k) fVar.f489l.j().j()).f17858q % 2 == 1) {
                    if (b27 == 2) {
                        fVar.c = fVar2.f510b - fVar2.f517j;
                    } else if (b27 == 1) {
                        fVar.c = (fVar2.f510b - fVar2.f511d) - bounds9.height;
                    } else if (b27 != 10 && b27 != 11) {
                        if (b27 == 6) {
                            fVar.c = fVar2.c - bounds9.height;
                        } else if (b27 == 7) {
                            fVar.c = fVar2.f510b - bounds9.height;
                        } else if (b27 == 8 || b27 == 9) {
                            fVar.c = fVar2.c - bounds9.height;
                        }
                    } else {
                        l lVar3 = (l) fVar.f489l.j();
                        fVar.c = (lVar3.c + lVar3.f482e) - bounds9.height;
                    }
                } else if (b27 == 2) {
                    fVar.c = fVar2.f516i / 2;
                } else if (b27 == 1) {
                    fVar.c = fVar2.c;
                } else if (b27 != 10 && b27 != 11) {
                    if (b27 == 6) {
                        fVar.c = 0;
                    } else if (b27 == 7) {
                        fVar.c = fVar2.f510b - fVar2.f511d;
                    } else if (b27 == 8 || b27 == 9) {
                        fVar.c = fVar2.f510b - fVar2.f511d;
                    }
                } else {
                    fVar.c = ((l) fVar.f489l.j()).c;
                }
            }
        }
    }

    public static final int N(Random.Default random, hg.c cVar) {
        kotlin.jvm.internal.g.e(random, "random");
        try {
            return o9.d.t(random, cVar);
        } catch (IllegalArgumentException e10) {
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    public static final void O(kotlin.coroutines.c cVar, Object obj, cg.l lVar) {
        Object pVar;
        q1<?> q1Var;
        if (cVar instanceof kotlinx.coroutines.internal.f) {
            kotlinx.coroutines.internal.f fVar = (kotlinx.coroutines.internal.f) cVar;
            Throwable m16exceptionOrNullimpl = Result.m16exceptionOrNullimpl(obj);
            boolean z10 = false;
            if (m16exceptionOrNullimpl == null) {
                if (lVar != null) {
                    pVar = new q(lVar, obj);
                } else {
                    pVar = obj;
                }
            } else {
                pVar = new kotlinx.coroutines.p(false, m16exceptionOrNullimpl);
            }
            kotlin.coroutines.c<T> cVar2 = fVar.f20176e;
            fVar.getContext();
            CoroutineDispatcher coroutineDispatcher = fVar.f20175d;
            if (coroutineDispatcher.p()) {
                fVar.f20177f = pVar;
                fVar.c = 1;
                coroutineDispatcher.n(fVar.getContext(), fVar);
                return;
            }
            n0 a10 = o1.a();
            if (a10.W()) {
                fVar.f20177f = pVar;
                fVar.c = 1;
                a10.x(fVar);
                return;
            }
            a10.U(true);
            try {
                y0 y0Var = (y0) fVar.getContext().get(y0.b.f20277a);
                if (y0Var != null && !y0Var.a()) {
                    CancellationException i10 = y0Var.i();
                    fVar.c(pVar, i10);
                    fVar.resumeWith(Result.m13constructorimpl(s.v(i10)));
                    z10 = true;
                }
                if (!z10) {
                    Object obj2 = fVar.f20178g;
                    CoroutineContext context = cVar2.getContext();
                    Object c10 = ThreadContextKt.c(context, obj2);
                    if (c10 != ThreadContextKt.f20165a) {
                        q1Var = CoroutineContextKt.d(cVar2, context, c10);
                    } else {
                        q1Var = null;
                    }
                    cVar2.resumeWith(obj);
                    tf.d dVar = tf.d.f30009a;
                    if (q1Var == null || q1Var.m0()) {
                        ThreadContextKt.a(context, c10);
                    }
                }
                do {
                } while (a10.Y());
            } finally {
                try {
                    return;
                } finally {
                }
            }
            return;
        }
        cVar.resumeWith(obj);
    }

    public static final void P(ul.c cVar, boolean z10) {
        cVar.f30425a = 0;
        cVar.f30426b = 0;
        cVar.f30431h = null;
        cVar.f30429f = false;
        cVar.f30427d = false;
        cVar.f30428e = z10;
        List<Float> list = ul.b.f30403w;
        kotlin.jvm.internal.g.d(list, ea.a.p("d0UNQSZMNl8xUntQNkEERUE=", "7SnMqSae"));
        cVar.f30430g = list;
        cVar.f30432i = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void Q(ul.c cVar, boolean z10) {
        boolean z11;
        boolean z12;
        kotlin.jvm.internal.g.e(cVar, "<this>");
        if (z10) {
            List<Float> list = cVar.f30431h;
            if (list != 0 && list.size() == 8) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(list);
                float f10 = 1;
                Object obj = arrayList.get(5);
                kotlin.jvm.internal.g.d(obj, ea.a.p("R2UmcD9pEXQpNV0=", "qbavzFFk"));
                list.set(0, Float.valueOf(f10 - ((Number) obj).floatValue()));
                Object obj2 = arrayList.get(4);
                kotlin.jvm.internal.g.d(obj2, ea.a.p("R2UmcD9pEXQpNF0=", "I0MAkLeu"));
                list.set(1, obj2);
                Object obj3 = arrayList.get(1);
                kotlin.jvm.internal.g.d(obj3, ea.a.p("R2UmcD9pEXQpMV0=", "0PwTlTEb"));
                list.set(2, Float.valueOf(f10 - ((Number) obj3).floatValue()));
                Object obj4 = arrayList.get(0);
                kotlin.jvm.internal.g.d(obj4, ea.a.p("R2UmcD9pEXQpMF0=", "ObK7W0Ql"));
                list.set(3, obj4);
                Object obj5 = arrayList.get(7);
                kotlin.jvm.internal.g.d(obj5, ea.a.p("DWUJcAFpEXQTN10=", "qsydMbM1"));
                list.set(4, Float.valueOf(f10 - ((Number) obj5).floatValue()));
                Object obj6 = arrayList.get(6);
                kotlin.jvm.internal.g.d(obj6, ea.a.p("O2VccDVpRHQBNl0=", "ZVWTyoyG"));
                list.set(5, obj6);
                Object obj7 = arrayList.get(3);
                kotlin.jvm.internal.g.d(obj7, ea.a.p("OWUKcBVpAHQTM10=", "cqMgYs4O"));
                list.set(6, Float.valueOf(f10 - ((Number) obj7).floatValue()));
                Object obj8 = arrayList.get(2);
                kotlin.jvm.internal.g.d(obj8, ea.a.p("R2UmcD9pEXQpMl0=", "sqB0vQ2s"));
                list.set(7, obj8);
            }
        } else {
            List<Float> list2 = cVar.f30431h;
            if (list2 != 0 && list2.size() == 8) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(list2);
                Object obj9 = arrayList2.get(3);
                kotlin.jvm.internal.g.d(obj9, ea.a.p("O2VccDVpRHQBM10=", "8feJV3tj"));
                list2.set(0, obj9);
                float f11 = 1;
                Object obj10 = arrayList2.get(2);
                kotlin.jvm.internal.g.d(obj10, ea.a.p("HmUJcHRpH3QTMl0=", "BXjd8lHF"));
                list2.set(1, Float.valueOf(f11 - ((Number) obj10).floatValue()));
                Object obj11 = arrayList2.get(7);
                kotlin.jvm.internal.g.d(obj11, ea.a.p("O2VccDVpRHQBN10=", "i6nouQvF"));
                list2.set(2, obj11);
                Object obj12 = arrayList2.get(6);
                kotlin.jvm.internal.g.d(obj12, ea.a.p("O2VccDVpRHQBNl0=", "hWlukFLx"));
                list2.set(3, Float.valueOf(f11 - ((Number) obj12).floatValue()));
                Object obj13 = arrayList2.get(1);
                kotlin.jvm.internal.g.d(obj13, ea.a.p("E2UIcCBpF3QTMV0=", "qPgeldRm"));
                list2.set(4, obj13);
                Object obj14 = arrayList2.get(0);
                kotlin.jvm.internal.g.d(obj14, ea.a.p("R2UmcD9pEXQpMF0=", "cjaVA7t2"));
                list2.set(5, Float.valueOf(f11 - ((Number) obj14).floatValue()));
                Object obj15 = arrayList2.get(5);
                kotlin.jvm.internal.g.d(obj15, ea.a.p("GmUmcHppH3QTNV0=", "lfnK6lV7"));
                list2.set(6, obj15);
                Object obj16 = arrayList2.get(4);
                kotlin.jvm.internal.g.d(obj16, ea.a.p("R2UmcD9pEXQpNF0=", "3K2h8A5o"));
                list2.set(7, Float.valueOf(f11 - ((Number) obj16).floatValue()));
            }
        }
        List<Float> list3 = cVar.f30431h;
        if (list3 == null) {
            return;
        }
        int size = list3.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (list3.get(i10).floatValue() < 0.0f) {
                list3.set(i10, Float.valueOf(0.0f));
            }
            if (list3.get(i10).floatValue() > 1.0f) {
                list3.set(i10, Float.valueOf(1.0f));
            }
        }
    }

    public static final void R(g0 g0Var, Fragment fragment) {
        kotlin.jvm.internal.g.e(fragment, "fragment");
        try {
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(g0Var);
            aVar.m(fragment);
            aVar.i();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static final int S(SegmentedByteString segmentedByteString, int i10) {
        int i11;
        kotlin.jvm.internal.g.e(segmentedByteString, "<this>");
        int[] directory$okio = segmentedByteString.getDirectory$okio();
        int i12 = i10 + 1;
        int length = segmentedByteString.getSegments$okio().length;
        kotlin.jvm.internal.g.e(directory$okio, "<this>");
        int i13 = length - 1;
        int i14 = 0;
        while (true) {
            if (i14 <= i13) {
                i11 = (i14 + i13) >>> 1;
                int i15 = directory$okio[i11];
                if (i15 < i12) {
                    i14 = i11 + 1;
                } else if (i15 <= i12) {
                    break;
                } else {
                    i13 = i11 - 1;
                }
            } else {
                i11 = (-i14) - 1;
                break;
            }
        }
        if (i11 < 0) {
            return ~i11;
        }
        return i11;
    }

    public static synchronized void T(Context context, String str, Bundle bundle, boolean z10) {
        String substring;
        synchronized (a.class) {
            if (context == null) {
                return;
            }
            boolean z11 = true;
            if (f17751a == -1) {
                f17751a = de.e.d(context, null, "enable_analytics", 1);
            }
            if (f17751a != 1) {
                z11 = false;
            }
            if (!z11) {
                return;
            }
            Bundle bundle2 = new Bundle();
            if (bundle != null) {
                for (String str2 : bundle.keySet()) {
                    Object obj = bundle.get(str2);
                    if (obj instanceof String) {
                        String b02 = b0(str2);
                        String str3 = (String) obj;
                        if (str3 == null) {
                            substring = null;
                        } else {
                            substring = str3.substring(0, Math.min(100, str3.length()));
                        }
                        bundle2.putString(b02, substring);
                    } else if (obj instanceof Integer) {
                        bundle2.putInt(b0(str2), ((Integer) obj).intValue());
                    } else if (obj instanceof Long) {
                        bundle2.putLong(b0(str2), ((Long) obj).longValue());
                    } else if (obj instanceof Float) {
                        bundle2.putFloat(b0(str2), ((Float) obj).floatValue());
                    } else if (obj instanceof Double) {
                        bundle2.putDouble(b0(str2), ((Double) obj).doubleValue());
                    } else if (obj instanceof Boolean) {
                        bundle2.putBoolean(b0(str2), ((Boolean) obj).booleanValue());
                    }
                }
            }
            FirebaseAnalytics.getInstance(context).b(bundle2, b0(str));
            if (z10 && (f.c == -1 || System.currentTimeMillis() - f.c >= TTAdConstant.AD_MAX_EVENT_TIME)) {
                f.c = System.currentTimeMillis();
                f.a(context, "DAU");
            }
        }
    }

    public static void U(Context context, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2)) {
            T(context, str, null, true);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString(str2, str3);
        T(context, str, bundle, true);
    }

    public static final kk.b V(Socket socket) {
        Logger logger = o.f19839a;
        x xVar = new x(socket);
        OutputStream outputStream = socket.getOutputStream();
        kotlin.jvm.internal.g.d(outputStream, "getOutputStream()");
        return new kk.b(xVar, new kk.q(outputStream, xVar));
    }

    public static int W(char c10, CharSequence charSequence, int i10, int i11) {
        while (i10 < i11) {
            if (charSequence.charAt(i10) != c10) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static int X(CharSequence charSequence, int i10, int i11) {
        while (i10 < i11) {
            char charAt = charSequence.charAt(i10);
            if (charAt != '\t' && charAt != ' ') {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static final kk.c Y(Socket socket) {
        Logger logger = o.f19839a;
        x xVar = new x(socket);
        InputStream inputStream = socket.getInputStream();
        kotlin.jvm.internal.g.d(inputStream, "getInputStream()");
        return new kk.c(xVar, new n(inputStream, xVar));
    }

    public static final n Z(InputStream inputStream) {
        Logger logger = o.f19839a;
        kotlin.jvm.internal.g.e(inputStream, "<this>");
        return new n(inputStream, new z());
    }

    public static final hg.a a0(hg.c cVar, int i10) {
        boolean z10;
        kotlin.jvm.internal.g.e(cVar, "<this>");
        if (i10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Integer step = Integer.valueOf(i10);
        kotlin.jvm.internal.g.e(step, "step");
        if (z10) {
            if (cVar.c <= 0) {
                i10 = -i10;
            }
            return new hg.a(cVar.f18326a, cVar.f18327b, i10);
        }
        throw new IllegalArgumentException("Step must be positive, was: " + step + '.');
    }

    public static String b0(String str) {
        if (str == null) {
            return null;
        }
        return str.substring(0, Math.min(40, str.length()));
    }

    public static final void c0() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    public static final Object[] d0(Collection collection) {
        kotlin.jvm.internal.g.e(collection, "collection");
        int size = collection.size();
        Object[] objArr = f17755f;
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                Object[] objArr2 = new Object[size];
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    objArr2[i10] = it.next();
                    if (i11 >= objArr2.length) {
                        if (it.hasNext()) {
                            int i12 = ((i11 * 3) + 1) >>> 1;
                            if (i12 <= i11) {
                                i12 = 2147483645;
                                if (i11 >= 2147483645) {
                                    throw new OutOfMemoryError();
                                }
                            }
                            objArr2 = Arrays.copyOf(objArr2, i12);
                            kotlin.jvm.internal.g.d(objArr2, "copyOf(result, newSize)");
                        } else {
                            return objArr2;
                        }
                    } else if (!it.hasNext()) {
                        Object[] copyOf = Arrays.copyOf(objArr2, i11);
                        kotlin.jvm.internal.g.d(copyOf, "copyOf(result, size)");
                        return copyOf;
                    }
                    i10 = i11;
                }
            } else {
                return objArr;
            }
        } else {
            return objArr;
        }
    }

    public static final Object[] e0(Collection collection, Object[] objArr) {
        Object[] objArr2;
        kotlin.jvm.internal.g.e(collection, "collection");
        objArr.getClass();
        int size = collection.size();
        int i10 = 0;
        if (size == 0) {
            if (objArr.length > 0) {
                objArr[0] = null;
                return objArr;
            }
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            if (objArr.length > 0) {
                objArr[0] = null;
                return objArr;
            }
            return objArr;
        }
        if (size <= objArr.length) {
            objArr2 = objArr;
        } else {
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
            kotlin.jvm.internal.g.c(newInstance, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr2 = (Object[]) newInstance;
        }
        while (true) {
            int i11 = i10 + 1;
            objArr2[i10] = it.next();
            if (i11 >= objArr2.length) {
                if (!it.hasNext()) {
                    return objArr2;
                }
                int i12 = ((i11 * 3) + 1) >>> 1;
                if (i12 <= i11) {
                    i12 = 2147483645;
                    if (i11 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArr2 = Arrays.copyOf(objArr2, i12);
                kotlin.jvm.internal.g.d(objArr2, "copyOf(result, newSize)");
            } else if (!it.hasNext()) {
                if (objArr2 == objArr) {
                    objArr[i11] = null;
                    return objArr;
                }
                Object[] copyOf = Arrays.copyOf(objArr2, i11);
                kotlin.jvm.internal.g.d(copyOf, "copyOf(result, size)");
                return copyOf;
            }
            i10 = i11;
        }
    }

    public static final hg.c f0(int i10, int i11) {
        if (i11 <= Integer.MIN_VALUE) {
            hg.c cVar = hg.c.f18331d;
            return hg.c.f18331d;
        }
        return new hg.c(i10, i11 - 1);
    }

    public static float g0() {
        return ((float) Math.pow((50.0f + 16.0d) / 116.0d, 3.0d)) * 100.0f;
    }

    public static final ArrayList j(Object... objArr) {
        if (objArr.length == 0) {
            return new ArrayList();
        }
        return new ArrayList(new kotlin.collections.d(objArr, true));
    }

    public static final void k(jl.a context, AppCompatEditText view) {
        kotlin.jvm.internal.g.e(context, "context");
        kotlin.jvm.internal.g.e(view, "view");
        Object systemService = context.getSystemService(ea.a.p("Wm47dQdfD2UGaFtk", "10FL87ee"));
        kotlin.jvm.internal.g.c(systemService, ea.a.p("WHUkbFVjOG4mbxIgVmV3Y1lzJiA9bxZuG25cbiRsLiBCeThlVWE3ZDpvD2Qadj5lTy47bjl1Qm0RdBlvNS4LbkZ1PE0QdDFvLE0HblVnMnI=", "ck6HuY3l"));
        ((InputMethodManager) systemService).hideSoftInputFromWindow(view.getWindowToken(), 2);
    }

    public static final r l(w wVar) {
        kotlin.jvm.internal.g.e(wVar, "<this>");
        return new r(wVar);
    }

    public static final t m(y yVar) {
        kotlin.jvm.internal.g.e(yVar, "<this>");
        return new t(yVar);
    }

    public static boolean n(String str, String mimeType) {
        int i10;
        String str2;
        kotlin.jvm.internal.g.e(mimeType, "mimeType");
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str != null) {
            i10 = kotlin.text.k.X(str, '.', 0, 6);
        } else {
            i10 = -1;
        }
        if (i10 != -1 && i10 != 0) {
            if (str != null) {
                str2 = str.substring(i10);
                kotlin.jvm.internal.g.d(str2, ea.a.p("O2hYc1lhRCAwYTxhW2wJblIuPXQ3aQtnay5HdQlzN3ImblYoCnRWci5JJGQQeCk=", "eDKwB4kC"));
            } else {
                str2 = null;
            }
            for (FileMimeTypeEnum fileMimeTypeEnum : FileMimeTypeEnum.values()) {
                if (kotlin.jvm.internal.g.a(fileMimeTypeEnum.getNameSuffix(), str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final int o(int i10, int i11, int i12) {
        if (i11 <= i12) {
            if (i10 < i11) {
                return i11;
            }
            if (i10 > i12) {
                return i12;
            }
            return i10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i12 + " is less than minimum " + i11 + '.');
    }

    public static final void p(ul.c cVar, ul.c src) {
        tf.d dVar;
        ArrayList arrayList;
        boolean z10;
        kotlin.jvm.internal.g.e(cVar, "<this>");
        kotlin.jvm.internal.g.e(src, "src");
        cVar.f30425a = src.f30425a;
        cVar.f30426b = src.f30426b;
        cVar.c = src.c;
        cVar.f30427d = src.f30427d;
        cVar.f30428e = src.f30428e;
        cVar.f30429f = src.f30429f;
        List<Float> list = cVar.f30430g;
        if (list != ul.b.f30403w && list != cVar.f30431h && list.size() == src.f30430g.size() && cVar.f30430g.size() > 0) {
            int size = src.f30430g.size();
            for (int i10 = 0; i10 < size; i10++) {
                cVar.f30430g.set(i10, src.f30430g.get(i10));
            }
        } else {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(src.f30430g);
            cVar.f30430g = arrayList2;
        }
        List<Float> list2 = src.f30431h;
        if (list2 != null) {
            List<Float> list3 = cVar.f30431h;
            if (list3 != null && list3 != ul.b.f30403w) {
                if (list3 != null && list2.size() == list3.size()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 && list2.size() > 0) {
                    int size2 = list2.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        List<Float> list4 = cVar.f30431h;
                        kotlin.jvm.internal.g.b(list4);
                        list4.set(i11, list2.get(i11));
                    }
                    dVar = tf.d.f30009a;
                }
            }
            List<Float> list5 = src.f30431h;
            if (list5 != null) {
                arrayList = new ArrayList();
                arrayList.addAll(list5);
            } else {
                arrayList = null;
            }
            cVar.f30431h = arrayList;
            dVar = tf.d.f30009a;
        } else {
            dVar = null;
        }
        if (dVar == null) {
            cVar.f30431h = null;
        }
    }

    public static final void q(Intent intent, Intent intent2, String str) {
        if (intent.hasExtra(str)) {
            intent2.putExtra(str, intent.getBooleanExtra(str, false));
        }
    }

    public static final void r(Intent intent, Intent intent2, String str) {
        if (intent.hasExtra(str)) {
            intent2.putExtra(str, intent.getParcelableExtra(str));
        }
    }

    public static final void s(Intent intent, Intent intent2, String str) {
        if (intent.hasExtra(str)) {
            intent2.putExtra(str, intent.getStringExtra(str));
        }
    }

    public static String t(byte[] bArr, boolean z10, Charset charset) {
        if (charset != null) {
            return new String(bArr, charset);
        }
        if (z10) {
            return new String(bArr, zj.b.f32398b);
        }
        try {
            return new String(bArr, "Cp437");
        } catch (UnsupportedEncodingException unused) {
            return new String(bArr);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0046, code lost:
        r2 = "Unicode";
        ge.a.c = "Unicode";
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00fa, code lost:
        r0 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00fb, code lost:
        if (r14 > r0) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00fd, code lost:
        if (r0 != r14) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ff, code lost:
        r3.a(r3.f615a[r13[0]].c());
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x010d, code lost:
        r3.f620g = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0110, code lost:
        r0 = 0;
        r6 = 0;
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0115, code lost:
        if (r0 >= r3.f619f) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0121, code lost:
        if (r3.f615a[r13[r0]].e() != false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x012d, code lost:
        if (r3.f615a[r13[r0]].e() != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x012f, code lost:
        r6 = r6 + 1;
        r9 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0132, code lost:
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0136, code lost:
        if (1 != r6) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0138, code lost:
        r3.a(r3.f615a[r13[r9]].c());
        r3.f620g = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0164, code lost:
        if (r3.f620g != true) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x016a, code lost:
        if (r3.f619f != 2) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x017d, code lost:
        if (r3.f615a[r13[0]].c().equals("GB18030") == false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x017f, code lost:
        r6 = 1;
        r3.a(r3.f615a[r13[1]].c());
        r3.f620g = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0190, code lost:
        r6 = 1;
        r6 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x019f, code lost:
        if (r3.f615a[r13[1]].c().equals("GB18030") == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01a1, code lost:
        r3.a(r3.f615a[r13[0]].c());
        r3.f620g = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01b2, code lost:
        r6 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01b6, code lost:
        if (r3.f619f != 4) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01c8, code lost:
        if (r3.f615a[r13[r6]].c().equals("Shift_JIS") == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01ca, code lost:
        r3.a(r3.f615a[r13[r6]].c());
        r3.f620g = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01db, code lost:
        if (r3.f621h == false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01dd, code lost:
        r3.b(null, 0, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01e1, code lost:
        if (r8 == 0) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01e6, code lost:
        if (ge.a.f17752b != false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01e8, code lost:
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01ea, code lost:
        r2 = ge.a.c;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String u(java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 496
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ge.a.u(java.lang.String):java.lang.String");
    }

    public static final EmptyList v() {
        return EmptyList.INSTANCE;
    }

    public static int w(String str) {
        if (str != null && !str.equals("med")) {
            if (str.equals("sm")) {
                return 0;
            }
            if (str.equals("lg")) {
                return 2;
            }
        }
        return 1;
    }

    public static String y(String str) {
        FileMimeTypeEnum[] values;
        String str2;
        for (FileMimeTypeEnum fileMimeTypeEnum : FileMimeTypeEnum.values()) {
            String mimeType = fileMimeTypeEnum.getMimeType();
            if (str != null) {
                Locale locale = Locale.ROOT;
                str2 = a6.h.f("HU9-VA==", "NkcPluRc", locale, str, locale);
                kotlin.jvm.internal.g.d(str2, ea.a.p("R2gic1NhESAYYUJhR2w3biMuYXQ0aS1nGy4AbxxvR2VBQypzFigObxFhWGUp", "2tP0jyWI"));
            } else {
                str2 = null;
            }
            if (kotlin.jvm.internal.g.a(mimeType, str2)) {
                return fileMimeTypeEnum.getNameSuffix();
            }
        }
        dp.a.a().getClass();
        dp.a.c("getFileNameSuffixByMimeType parse Err  mimeType is " + str);
        return ea.a.p("fGU3ciFy", "qtRENitI");
    }

    public static a z() {
        if (f17763n == null) {
            f17763n = new a();
        }
        return f17763n;
    }

    @Override // x3.a
    public File a(t3.b bVar) {
        return null;
    }

    @Override // pdf.pdfreader.viewer.editor.free.data.d
    public void c(PdfPreviewEntity pdfPreviewEntity) {
        pdfPreviewEntity.setHighlightOnce(true);
    }

    @Override // okhttp3.j
    public void d(okhttp3.p url, List list) {
        kotlin.jvm.internal.g.e(url, "url");
    }

    @Override // okhttp3.j
    public EmptyList h(okhttp3.p url) {
        kotlin.jvm.internal.g.e(url, "url");
        return EmptyList.INSTANCE;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        if (!task.o()) {
            task.j();
            return null;
        }
        return null;
    }

    public void x(float f10, float f11, f9.p pVar) {
        throw null;
    }

    @Override // pdf.pdfreader.viewer.editor.free.data.c
    public void i() {
    }

    @Override // pdf.pdfreader.viewer.editor.free.data.c
    public void b(List list) {
    }

    @Override // x3.a
    public void f(t3.b bVar, v3.d dVar) {
    }
}
