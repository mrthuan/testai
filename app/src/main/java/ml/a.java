package ml;

import android.text.InputFilter;
import android.text.Spanned;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.g;

/* compiled from: EmojiInputFilter.kt */
/* loaded from: classes3.dex */
public final class a implements InputFilter {

    /* renamed from: a  reason: collision with root package name */
    public final Pattern f22144a;

    public a() {
        Pattern compile = Pattern.compile(ea.a.p("Gz9xW4Of4oBf8KuP1l0qW7SfooBr8Nyf2V0EW4SY9S3Rm_RdnLjtPw5b1pjpLbSf-11OW7afz4BL8OeX2V0JW8Of74Be8P2r0V1IW5mfzoBp8K2ZyV0_W5af4oBL8OqbjF03W5Gc4i2QnotdhrjZPzjioYKpuMw_GluIn-GmWPCsh_RdCDFOMg98b_D2hebw24WD8NmF_fD5hcfw-Yb78KyG2i2Dn-SaL--Mj1Z8DSNuMB85G-_7j1ni-6MaW5eGpy2phuri5Klf4rKqNO_uj3t8aeLqhW7iyoearP3i2ZzRrdvi3pU_78qPC3wy4vK0pqSHXam4zD8aW5uA1uP1vW7v849MfDnj-JfXivBdubjLP05btp_LgZaf8IKWn_2aw5_Dr4Of6rJf8KuI0_DJidTwrYnXXay46T8EW4SAyeKyiRbvy49dfCnioqqLlv3i0rbQl8bi1LtL4u--O-_Njwx8EMLawsxdnbi7PxVbtITm4ra5G-_7j1l8iJ_mhJq4vD838OyD7e_Kjwt8MuLamqaMqeLKqKGP6eL3qUvi-rPRj_MtkY_YXZ24uz8VW6KA5YzduMldKQ==", "fxfu7JC5"), 66);
        g.d(compile, ea.a.p("LG9ccBBsUihQIGogVSBIIBUiRj9_Wzl1toDncjoudUEcRW5JN1NyTglJHkkjRWIgFSBOKQ==", "YTOwTAT6"));
        this.f22144a = compile;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
        if (charSequence == null) {
            return null;
        }
        Matcher matcher = this.f22144a.matcher(charSequence);
        if (matcher.find()) {
            return matcher.replaceAll("");
        }
        return charSequence;
    }
}
