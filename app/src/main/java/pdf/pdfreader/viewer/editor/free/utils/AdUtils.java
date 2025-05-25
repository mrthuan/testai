package pdf.pdfreader.viewer.editor.free.utils;

import android.app.Activity;
import android.content.Context;
import com.lib.flutter.encrypt.EngineHelper;
import java.util.Map;
import kotlin.Pair;
import org.json.JSONArray;

/* compiled from: AdUtils.kt */
/* loaded from: classes3.dex */
public final class AdUtils {

    /* renamed from: a  reason: collision with root package name */
    public static final AdUtils f28513a;

    /* renamed from: b  reason: collision with root package name */
    public static final Map<String, String[]> f28514b;
    public static final tf.c c;

    static {
        ea.a.p("JGVIXwpoVnI_XyxpGWU3b0VlAF8kZDpzFnVAY2U=", "t6bKy2OY");
        ea.a.p("HWU7XxVwW2E7aDlpWnQyckt0O3QgYVpfB28EcjJl", "OEvBf7XL");
        ea.a.p("WGUyXxxsBl8BcFhhGmgJaSp0V3I1dCp0H2E2XytvAXJQZQ==", "vZXtT5w9");
        ea.a.p("KWU2X1t0CG0XaQh0UXIkdFF0O2ElX0VvAXISZQ==", "QmBO2mzH");
        ea.a.p("DGUUX0lyV3YhZRFfXW4jZUpzJmk9aVdsK3MedSNjZQ==", "wjgm92qV");
        ea.a.p("LGVOXzpvJHYtchJfXW4jZUpzJmk9aVdsK3MedSNjZQ==", "27G7YJPW");
        ea.a.p("WGUyXxtvD2UtblV0AHYzXyZhXG4jchxzX3VHY2U=", "053Rb9IL");
        ea.a.p("B2UbXyVyCHYhZRFfWmEjaU5lDWIoblhlBl8CbyRyIWU=", "iglbUmf7");
        ea.a.p("WGUyXwBjA24tblV0AHYzXyZhXG4jchxzF3VDY2U=", "x1i5qoZD");
        ea.a.p("WGUyXxtvD2UtYlVuB2UkXzdvR3IlZQ==", "ObJjQNVa");
        ea.a.p("OWUBXzxyJHYhZRFfVmE5bl1yDXMmdURjZQ==", "HNRxLAh1");
        ea.a.p("DmURXwthVmcXbgd0XXYyX1thIGQWc1l1BmNl", "9Dehg8i6");
        ea.a.p("JGVIXxVhWWcFbit0HHYNX1ZhHGQaYTpzKnUwY2U=", "W1DUEBxx");
        ea.a.p("WGUyXx9hDGctblV0AHYzXydhQGQZYhxzCnUrY2U=", "eYJWYXSu");
        ea.a.p("WGUyXx9hDGctblV0AHYzXyZhXG4jchxzV3VDY2U=", "81S16z4a");
        ea.a.p("JGVIXx51XmQ_XyRhAWkeZWpjD3IhXxZvMXIbZQ==", "KmQ4DxIt");
        ea.a.p("JGVIXx51XmQ_XyNuAWUac0FpGmkkbDpzO3U4Y2U=", "gvUOTJsm");
        ea.a.p("JGVIXxFvWmUFcylhG18GYUFpGGUaYQd0MXM9XyJvInIsZQ==", "Og3NTIQW");
        ea.a.p("JGVIXwlyUl8zbjl0FGwEX1thGmkzZTpvJGUHXyRkbXMgdUNjZQ==", "RveBTiE2");
        ea.a.p("WGUyXxtvD2UtbF1zHV84YTBpRGUZYiJuHmUiXxJvAXJQZQ==", "pPat4iLA");
        ea.a.p("WGUyXxBvDHYXckBfC2E4biFybXMpdTFjZQ==", "margK3PE");
        f28513a = new AdUtils();
        f28514b = kotlin.collections.q.A0(new Pair(ea.a.p("WGUyXwBoA3IXX1JpBWUJbzRlXF8nZBxzVnUgY2U=", "9R25VxB9"), new String[]{ea.a.p("Li1YLXI=", "YxXFNbeW"), ea.a.p("Um1maV5y", "UZk68Qa9"), ea.a.p("Q2dmaQ==", "10Yo5W0y"), ea.a.p("Wm5maQ==", "0NPSmDIv")}), new Pair(ea.a.p("WGUyXwBwDmEBaGtpB3Qzcjd0W3QvYS9fJW8CchJl", "Vwq15RRI"), new String[]{ea.a.p("Li1YLWg=", "bNIZlJyl"), ea.a.p("Li1YLW0=", "WBrwxV1E"), ea.a.p("Ui0iLXI=", "a0bRGieC"), ea.a.p("Lm0caVRy", "QlQD1tlb"), ea.a.p("UW5laQ==", "jV8HfeGY")}), new Pair(ea.a.p("WGUyXxxsBl8BcFhhGmgJaSp0V3I1dCp0J2EeXzdvJHJQZQ==", "NrDQsS9o"), new String[]{ea.a.p("Li1YLWg=", "tfmXPUN8"), ea.a.p("Ui0iLW0=", "y2RU10yY"), ea.a.p("Li1YLXI=", "tLhoRnVB"), ea.a.p("Lm0caVRy", "gAhGWshi"), ea.a.p("Wm5maQ==", "C1s9W0AF")}), new Pair(ea.a.p("JGVIXxB0Um0FaSR0EHIbdFx0B2EpXxZvQ3IGZQ==", "tOUr6eve"), new String[]{ea.a.p("WC0gLWg=", "sj9IZTjr"), ea.a.p("Ui0iLW0=", "0LphqtKc"), ea.a.p("IC0TLXI=", "4JAzHnxV"), ea.a.p("Um1maV5y", "zsUX0YNj"), ea.a.p("P2ccaQ==", "vIUmObb4"), ea.a.p("Jm4caQ==", "R16m3wfv")}), new Pair(ea.a.p("WGUyXwNyB3YbZUNfAG4iZTZzRmkyaSJsHHMtdSVjZQ==", "CBWCav79"), new String[]{ea.a.p("Ui0iLWg=", "tLM5Cw5L"), ea.a.p("Li1YLW0=", "RfJeert8"), ea.a.p("Li1YLXI=", "XGYp8hUl"), ea.a.p("NG0eaVxy", "MrU3qgrp"), ea.a.p("P2ccaQ==", "6QdrV3Pj"), ea.a.p("Jm4caQ==", "xspCOU2D")}), new Pair(ea.a.p("WGUyXxBvDHYXckBfAG4iZTZzRmkyaSJsbXMYdQtjZQ==", "2wyC4SZZ"), new String[]{ea.a.p("Li1YLWg=", "njKJtPzV"), ea.a.p("Ui0iLW0=", "YTHPTSnO"), ea.a.p("Li1YLXI=", "uYoTGWtA"), ea.a.p("P2ccaQ==", "GR8dQpPg"), ea.a.p("UG5VaQ==", "Ok9xWWQG"), ea.a.p("Lm0caVRo", "jvIIGuc4"), ea.a.p("KW10aWRt", "1QHYITnY"), ea.a.p("Um1maV5y", "ib0SguDy")}), new Pair(ea.a.p("JGVIXwpjVm4Fbit0HHYNX1dhAG4gcjpzPnUIY2U=", "xjZDQzRn"), new String[]{ea.a.p("WC0gLWg=", "Zb9NvWZs"), ea.a.p("Ui0lLW0=", "t4lzw5Z0"), ea.a.p("LC1ZLXI=", "cMM71sjA"), ea.a.p("Lm0cblRo", "XK3phGpV"), ea.a.p("KG0Ubhpt", "OAI97jEn"), ea.a.p("Lm0cblRy", "JxRMBFlT"), ea.a.p("Q2dmbg==", "RsnOd5ot"), ea.a.p("AG5_bg==", "HziRElDs")}), new Pair(ea.a.p("KWU6Xz5vLGUXYgduWmUlX0tvJ3IqZQ==", "CqBCVAmt"), new String[]{ea.a.p("Ki0ALWg=", "nLKboqoU"), ea.a.p("Ui0pLW0=", "YaVeZD32"), ea.a.p("Li1TLXI=", "ATQhE4Ez"), ea.a.p("WG0aYn9y", "bY97RprJ"), ea.a.p("Q2dmYg==", "cyhxaNiJ"), ea.a.p("Jm4cYg==", "nlmNIlNj")}), new Pair(ea.a.p("BmUKX0FyEnYhZRFfVmE5bl1yDXMmdURjZQ==", "Bwms1w9u"), new String[]{ea.a.p("Li1TLWg=", "J2zUke2g"), ea.a.p("Ui0pLW0=", "TaFyI4pa"), ea.a.p("Ui0pLXI=", "ilD0hR3T"), ea.a.p("Um1mYl5y", "k5Bokq6G"), ea.a.p("FmcfYg==", "Vjf2F9VW"), ea.a.p("C25GYg==", "MHbk1txP")}), new Pair(ea.a.p("JGVIXxVhWWcFbit0HHYNX1ZhHGQacwp1EGNl", "4YhLbvlF"), new String[]{ea.a.p("OS0qLWg=", "jzXDb79W"), ea.a.p("Ui0lLW0=", "Lb9FuJS6"), ea.a.p("Li1fLXI=", "xN1iLLXd"), ea.a.p("Lm0cblRo", "NmxUvf4J"), ea.a.p("Um1mbl5t", "1SArLDLK"), ea.a.p("CG1Kbmpy", "3tigG9op"), ea.a.p("P2ccbg==", "8DrITnvf"), ea.a.p("GG5Kbg==", "dyqg1FcN"), ea.a.p("0ajm5vmfhoro6Nu90aTm6Iylt7n25aeKkrqQ", "9d7GrcWz")}), new Pair(ea.a.p("JGVIXxVhWWcFbit0HHYNX1ZhHGQaYTpzKXUgY2U=", "FdOlFRvB"), new String[]{ea.a.p("Li1fLWg=", "jDtjudEJ"), ea.a.p("Li1fLW0=", "Ogf1cxNX"), ea.a.p("Li1fLXI=", "F3xDIAVr"), ea.a.p("Lm0cblRy", "cJPmerMl"), ea.a.p("CWcabg==", "XVy71n4O"), ea.a.p("Cm5rbg==", "Q9cFs6FB"), ea.a.p("qaiQ5vKf0or66Pe9kKTZ6IGli7n65fSKkbqQ", "FOB2wCDc")}), new Pair(ea.a.p("JGVIXxVhWWcFbit0HHYNX1ZhHGQaYjpzNnUIY2U=", "2PYrYzUh"), new String[]{ea.a.p("Li1fLWg=", "c1ZhClUx"), ea.a.p("Ui0lLW0=", "zrKYgRp0"), ea.a.p("Ui0lLXI=", "Ii0HlpQB"), ea.a.p("FG18bmVy", "2kuQHuye"), ea.a.p("Q2dmbg==", "5cXbDnWL"), ea.a.p("Jm4cbg==", "vJubxUkV"), ea.a.p("1ajq5vifh4rS6Im9jKTn6PCl17n55dKKt7qQ", "QxFRWSF3")}), new Pair(ea.a.p("WGUyXxtvD2UtbF1zHV84YTBpRGUZYiJuWGUaXzFvOXJQZQ==", "6hBLYRS9"), new String[]{ea.a.p("Li1fLWg=", "nhXhFEb3"), ea.a.p("Ui0lLW0=", "lX10xjj9"), ea.a.p("Ui0lLXI=", "PtSIOWYF"), ea.a.p("WG1UbmJy", "8Q9yOncE"), ea.a.p("Q2dmbg==", "arwcv31G"), ea.a.p("AG5lbg==", "ZMiHvlYc")}), new Pair(ea.a.p("BmU_XwxvVnYtchJfVmE5bl1yDXMmdURjZQ==", "7ymFo83q"), new String[]{ea.a.p("Ui0pLWg=", "PYMCKJ7S"), ea.a.p("Li1TLW0=", "kLGkxyTr"), ea.a.p("Ui0pLXI=", "6z6Onxq0"), ea.a.p("Q2dmYg==", "yuTGC0SH"), ea.a.p("Jm4cYg==", "OzVZXxXx")}), new Pair(ea.a.p("JGVIXx51XmQ_XyRhAWkeZWpjD3IhXxZvHXItZQ==", "Q6VwhNUx"), new String[]{ea.a.p("Ui0lLWg=", "15whdw5r"), ea.a.p("Ui0lLW0=", "8RzkS1iL"), ea.a.p("NC0WLXI=", "iEUxGct7"), ea.a.p("Um1mbl5y", "Dv3C5t8b"), ea.a.p("P2ccbg==", "Bwmsdgcu"), ea.a.p("Jm4cbg==", "XfCRPedJ")}), new Pair(ea.a.p("WGUyXxR1C2QXX11uHWUkczBpRmknbBxzDHUhY2U=", "cSfFIQ89"), new String[]{ea.a.p("Ui0iLWg=", "0mgbj6LS"), ea.a.p("FC0jLW0=", "snuJNe9Z"), ea.a.p("Li1YLXI=", "4eWGmj2y"), ea.a.p("G20aaVdy", "64z7zwmT"), ea.a.p("G2dLaQ==", "q9kfd4qw"), ea.a.p("Jm4caQ==", "B4G1U4Lt")}), new Pair(ea.a.p("JGVIXxFvWmUFcylhG18GYUFpGGUaYQd0L3M9XxdvAHIsZQ==", "UrlRJIdu"), new String[]{ea.a.p("WS1XLWg=", "9E899hPi"), ea.a.p("JC0jLW0=", "9lEMVM9U"), ea.a.p("Ui0lLXI=", "EsH2GI5W"), ea.a.p("Um1mbl5y", "W5INn9fu"), ea.a.p("Q2dmbg==", "1relF0BJ"), ea.a.p("Jm4cbg==", "T2u6zWCz")}), new Pair(ea.a.p("WGUyXwNyB18bbkd0CGw6XyphRmkwZRxvGmUMXxJkCnNcdTljZQ==", "jbsU0eYo"), new String[]{ea.a.p("Li1fLXI=", "ihWREWfX"), ea.a.p("JG1qbl1y", "Y9EGpF8p"), ea.a.p("Q2dmbg==", "UhO6370G"), ea.a.p("Wm5mbg==", "HnMozSEo")}));
        c = kotlin.a.a(new cg.a<Map<String, ? extends String>>() { // from class: pdf.pdfreader.viewer.editor.free.utils.AdUtils$adPosition$2
            @Override // cg.a
            public final Map<String, ? extends String> invoke() {
                return kotlin.collections.q.A0(new Pair(ea.a.p("q7i45u-50ojc5PCrk4_65YSP", "NuEhPYoW"), ea.a.p("WGUyXwBoA3IXX1JpBWUJbzRlXF8nZBxzGHUAY2U=", "wrITn8Qa")), new Pair(ea.a.p("2pfh5cKPi6HH5ruSjLGP", "5s3LyYZ0"), ea.a.p("WGUyXwBwDmEBaGtpB3Qzcjd0W3QvYS9fK284cipl", "XMIz24am")), new Pair(ea.a.p("ppeb5ciP3qHv5sWSkLHn6LWBiZTt5u23", "ikeeVc3U"), ea.a.p("JGVIXxZsU18pcCZhBmg3aVt0C3I2dAx0AGEuX0JvDXIsZQ==", "G8GeiB1x")), new Pair(ea.a.p("qIKI5f670Zbd5PG2k4_65YSP", "UkxKkikk"), ea.a.p("JGVIXxB0Um0FaSR0EHIbdFx0B2EpXxZvJ3IBZQ==", "NV3PRbxu")), new Pair(ea.a.p("0KLW6OiIuaH95umS0bGP", "3l9ROPnC"), ea.a.p("JGVIXwlyUnYzZT1fHG4cZUdzGmkxaQRsO3M2dRhjZQ==", "X1CCdYjj")), new Pair(ea.a.p("gL345rSi0aH95umS0bGP", "YzhT981f"), ea.a.p("OmVAXzlvHnYtchJfXW4jZUpzJmk9aVdsK3MedSNjZQ==", "1bQ9ZpQq")), new Pair(ea.a.p("qYma5vaP3qHvTit0HHYNQlRuAGVy", "kWZtKNuv"), ea.a.p("WGUyXwBjA24tblV0AHYzXyZhXG4jchxzWnUWY2U=", "5d5ANDd0")), new Pair(ea.a.p("2qbd6dK1IGEcblFy", "eubbSuaL"), ea.a.p("WGUyXxtvD2UtYlVuB2UkXzdvR3IlZQ==", "sLsJ0weA")), new Pair(ea.a.p("pqK16N6I3qHvQituG2Vy", "pjKM2kBP"), ea.a.p("JGVIXwlyUnYzZT1fF2EGblByMXMqdRdjZQ==", "vLQelWQA")), new Pair(ea.a.p("hZeQ5ua5oKHA6Mmt3KjX6biJtIvg6Ze1OmEFaSdlAWERZA==", "M6c7pF4g"), ea.a.p("WGUyXx9hDGctblV0AHYzXydhQGQZcyx1F2Nl", "eB0bS50d")), new Pair(ea.a.p("1Zb75uW5hKH66JutgajW6cSJ1Ivv6eK1PGEOaQVldGFBZEE=", "rzs7VMaw"), ea.a.p("WGUyXx9hDGctblV0AHYzXydhQGQZYRxzFnU3Y2U=", "yEbDoaw0")), new Pair(ea.a.p("1Zb75uW5hKH66JutgajW6cSJ1Ivv6eK1I2E5aUNlJGFBZEI=", "mM5gGGEe"), ea.a.p("DWU3X1phKmcXbgd0XXYyX1thIGQWYmlzG3UDY2U=", "NHfN6DT9")), new Pair(ea.a.p("2qbd6dK1h4jl6JWoJ2EiaTJlcGEobiZy", "RSpjgU1x"), ea.a.p("WGUyXxtvD2UtbF1zHV84YTBpRGUZYiJuJmUEXz9vF3JQZQ==", "HvLbVr5A")), new Pair(ea.a.p("p72d5vSi3qHv5fCVnIPAQlRuAGVy", "ZOsCwQmx"), ea.a.p("JGVIXxpvWXY_cj5fF2EGblByMXMqdRdjZQ==", "dnPVB8EM")), new Pair(ea.a.p("qryk5da83qHvTit0HHYNQ1RyZA==", "Ag8CNgAY"), ea.a.p("HWVAXzJ1XWQtXwhhQGkhZWdjM3ItX0VvAXISZQ==", "fwv9U4BL")), new Pair(ea.a.p("qryk5da83qHv5sWSkLGP", "3nBvFKVu"), ea.a.p("E2U4XxF1JGQtXw9uQGUlc0xpJmkobGlzG3UDY2U=", "7TxAvMiJ")), new Pair(ea.a.p("2qLP6NCFhZTa5ry3gKbA6eW11Int5syPtK7w6ZqM", "Qn0mQY2c"), ea.a.p("JGVIXxFvWmUFcylhG18GYUFpGGUaYQd0MXMBXyRvDXIsZQ==", "4lbgTuWx")), new Pair(ea.a.p("2qLP6NCFhZTa5ry3J2EiaTJlfXAjbgJk", "L0xhKivh"), ea.a.p("GGUWX0lyUl8hbhV0VWw7X1ZhJmk_ZWlvBGUfXzBkHXMcdR1jZQ==", "Y4so97zb")));
            }
        });
    }

    public static final boolean a(Context context) {
        kotlin.jvm.internal.g.e(context, "context");
        String str = he.a.f18146a;
        EngineHelper.f15726a.getClass();
        return !kotlin.jvm.internal.g.a(ea.a.p("WQ==", "555qQsq7"), (String) EngineHelper.f15730f.get(ea.a.p("VGwUZR1hAGxl", "Q456Snaf")));
    }

    public static final boolean b(Activity activity) {
        boolean z10 = false;
        if (activity == null) {
            return false;
        }
        if (System.currentTimeMillis() - c.c() >= c1.w(activity)) {
            z10 = true;
        }
        if (!z10) {
            int i10 = zk.a.f32399a;
            t1.b("since last full ad show time " + (((float) (System.currentTimeMillis() - c.c())) / 1000.0f) + "s");
        }
        return z10;
    }

    public static String c(String[] strArr) {
        boolean z10;
        if (strArr.length == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return "";
        }
        JSONArray jSONArray = new JSONArray();
        for (String str : strArr) {
            jSONArray.put(str);
        }
        String jSONArray2 = jSONArray.toString();
        kotlin.jvm.internal.g.d(jSONArray2, ea.a.p("WXMkbjJyEGELLkBvOnQkaSpnGik=", "ml0n1JG7"));
        return jSONArray2;
    }
}
