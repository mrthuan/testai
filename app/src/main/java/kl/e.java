package kl;

import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.SubscriptSpan;
import android.text.style.SuperscriptSpan;
import android.text.style.TypefaceSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import java.lang.Character;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.text.j;
import kotlin.text.k;

/* compiled from: StringEx.kt */
/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final String f19864a = ea.a.p("D2I-", "iECFSF9Y");

    /* renamed from: b  reason: collision with root package name */
    public static final String f19865b = ea.a.p("cy9TPg==", "WjQZEv1e");

    public static final boolean a(String str) {
        boolean a10;
        boolean a11;
        boolean a12;
        boolean a13;
        boolean a14;
        kotlin.jvm.internal.g.e(str, "<this>");
        for (int i10 = 0; i10 < str.length(); i10++) {
            Character.UnicodeBlock of2 = Character.UnicodeBlock.of(str.charAt(i10));
            if (kotlin.jvm.internal.g.a(of2, Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS)) {
                a10 = true;
            } else {
                a10 = kotlin.jvm.internal.g.a(of2, Character.UnicodeBlock.HIRAGANA);
            }
            if (a10) {
                a11 = true;
            } else {
                a11 = kotlin.jvm.internal.g.a(of2, Character.UnicodeBlock.KATAKANA);
            }
            if (a11) {
                a12 = true;
            } else {
                a12 = kotlin.jvm.internal.g.a(of2, Character.UnicodeBlock.HANGUL_SYLLABLES);
            }
            if (a12) {
                a13 = true;
            } else {
                a13 = kotlin.jvm.internal.g.a(of2, Character.UnicodeBlock.HANGUL_JAMO);
            }
            if (a13) {
                a14 = true;
            } else {
                a14 = kotlin.jvm.internal.g.a(of2, Character.UnicodeBlock.HANGUL_COMPATIBILITY_JAMO);
            }
            if (a14) {
                return true;
            }
        }
        return false;
    }

    public static final SpannableString b(String str, CharacterStyle... characterStyleArr) {
        String str2;
        String str3;
        CharacterStyle dVar;
        int V;
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            str2 = f19864a;
            int V2 = k.V(str, str2, i10, false, 4);
            str3 = f19865b;
            if (V2 == -1 || (V = k.V(str, str3, V2 + 3, false, 4)) == -1) {
                break;
            }
            arrayList.add(new Pair(Integer.valueOf(V2 - i11), Integer.valueOf((V - i11) - 3)));
            i11 += 7;
            i10 = V + 4;
        }
        SpannableString spannableString = new SpannableString(j.K(j.K(str, str2, ""), str3, ""));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            int intValue = ((Number) pair.component1()).intValue();
            int intValue2 = ((Number) pair.component2()).intValue();
            for (CharacterStyle characterStyle : characterStyleArr) {
                if (characterStyle instanceof b) {
                    dVar = new c(characterStyle);
                } else if (characterStyle instanceof ForegroundColorSpan) {
                    dVar = new ForegroundColorSpan(((ForegroundColorSpan) characterStyle).getForegroundColor());
                } else if (characterStyle instanceof BackgroundColorSpan) {
                    dVar = new BackgroundColorSpan(((BackgroundColorSpan) characterStyle).getBackgroundColor());
                } else {
                    if (characterStyle instanceof UnderlineSpan) {
                        characterStyle = new UnderlineSpan();
                    } else if (characterStyle instanceof StrikethroughSpan) {
                        characterStyle = new StrikethroughSpan();
                    } else if (characterStyle instanceof StyleSpan) {
                        dVar = new StyleSpan(((StyleSpan) characterStyle).getStyle());
                    } else if (characterStyle instanceof TypefaceSpan) {
                        dVar = new TypefaceSpan(((TypefaceSpan) characterStyle).getFamily());
                    } else if (characterStyle instanceof RelativeSizeSpan) {
                        dVar = new RelativeSizeSpan(((RelativeSizeSpan) characterStyle).getSizeChange());
                    } else if (characterStyle instanceof AbsoluteSizeSpan) {
                        AbsoluteSizeSpan absoluteSizeSpan = (AbsoluteSizeSpan) characterStyle;
                        dVar = new AbsoluteSizeSpan(absoluteSizeSpan.getSize(), absoluteSizeSpan.getDip());
                    } else if (characterStyle instanceof SuperscriptSpan) {
                        characterStyle = new SuperscriptSpan();
                    } else if (characterStyle instanceof SubscriptSpan) {
                        characterStyle = new SubscriptSpan();
                    } else if (characterStyle instanceof URLSpan) {
                        dVar = new URLSpan(((URLSpan) characterStyle).getURL());
                    } else if (characterStyle instanceof ClickableSpan) {
                        dVar = new d(characterStyle);
                    }
                    spannableString.setSpan(characterStyle, intValue, intValue2, 33);
                }
                characterStyle = dVar;
                spannableString.setSpan(characterStyle, intValue, intValue2, 33);
            }
        }
        return spannableString;
    }
}
