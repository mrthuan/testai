package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import lib.zj.office.fc.hslf.record.SlideAtom;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzavp {
    private static final String zzd = "zzavp";
    protected final Context zza;
    private ExecutorService zze;
    private DexClassLoader zzf;
    private zzauu zzg;
    private byte[] zzh;
    private final boolean zzl;
    private zzauj zzo;
    private final Map zzp;
    private zzavi zzr;
    private volatile AdvertisingIdClient zzi = null;
    private volatile boolean zzj = false;
    private Future zzk = null;
    private volatile zzasj zzm = null;
    private Future zzn = null;
    protected boolean zzb = false;
    protected boolean zzc = false;
    private boolean zzq = false;

    private zzavp(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.zzl = applicationContext != null;
        context = applicationContext != null ? applicationContext : context;
        this.zza = context;
        this.zzp = new HashMap();
        if (this.zzr != null) {
            return;
        }
        this.zzr = new zzavi(context);
    }

    public static zzavp zzg(Context context, String str, String str2, boolean z10) {
        zzauu zzauuVar;
        byte[] zzb;
        boolean z11;
        boolean z12;
        zzavp zzavpVar = new zzavp(context);
        try {
            zzavpVar.zze = Executors.newCachedThreadPool(new zzavl());
            zzavpVar.zzj = z10;
            if (z10) {
                zzavpVar.zzk = zzavpVar.zze.submit(new zzavm(zzavpVar));
            }
            zzavpVar.zze.execute(new zzavo(zzavpVar));
            try {
                GoogleApiAvailabilityLight googleApiAvailabilityLight = GoogleApiAvailabilityLight.f10884b;
                Context context2 = zzavpVar.zza;
                googleApiAvailabilityLight.getClass();
                if (GoogleApiAvailabilityLight.a(context2) > 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                zzavpVar.zzb = z11;
                if (googleApiAvailabilityLight.c(zzavpVar.zza, GoogleApiAvailabilityLight.f10883a) == 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                zzavpVar.zzc = z12;
            } catch (Throwable unused) {
            }
            zzavpVar.zzo(0, true);
            if (zzavs.zzc() && ((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzcV)).booleanValue()) {
                throw new IllegalStateException("Task Context initialization must not be called from the UI thread.");
            }
            zzauuVar = new zzauu(null);
            zzavpVar.zzg = zzauuVar;
            try {
                try {
                    zzb = zzasz.zzb("M2RhhRYJhjrQUa7n9jg23IBcTQvCkUFLA/9ZbQYvHFo=", false);
                } catch (IllegalArgumentException e10) {
                    throw new zzaut(zzauuVar, e10);
                }
            } catch (zzaut e11) {
                throw new zzavf(e11);
            }
        } catch (zzavf unused2) {
        }
        if (zzb.length == 32) {
            byte[] bArr = new byte[16];
            ByteBuffer.wrap(zzb, 4, 16).get(bArr);
            for (int i10 = 0; i10 < 16; i10++) {
                bArr[i10] = (byte) (bArr[i10] ^ Field.INCLUDETEXT);
            }
            zzavpVar.zzh = bArr;
            try {
                try {
                    try {
                        File cacheDir = zzavpVar.zza.getCacheDir();
                        if (cacheDir == null && (cacheDir = zzavpVar.zza.getDir("dex", 0)) == null) {
                            throw new zzavf();
                        }
                        File file = new File(String.format("%s/%s.jar", cacheDir, "1708042440713"));
                        if (!file.exists()) {
                            byte[] zzb2 = zzavpVar.zzg.zzb(zzavpVar.zzh, "zhNo4T+PC6pv8XehJSeVMjjLxC8v0O6dCl/S/J/6YB2/0JDRgV5GPD2MxNtm+uZZ1r87m3PxXMd7eU3Alpx36fVcp1VUnhbocfOY/k03EpoV5iHKz3pfU4t4g2nREHq8PEhIjCV22o15TrHOdzjH5/LQAWUqxf5wfKahQNM3SvcjVE4X9xhczX6er2EQb6nGR4qPkuAuy78S60oqgJWkE+bG4i1RBnmBZScO6K7M3BSZrY8Tp4nNFqFAmBABBd/Ie41hvrAXJfGJHWkQ/teHYSDSLhDI0pzQotLq/aRpH1vh7cJTnDgR287U5bTYoX6MO1MtNuFsMYVRWj4Rlbf1Z9WznzlYbPNZjCfeAu3uitESSFCsoTGCb4Ez7O/GjHjENtNiqy1n1EltH5tTbfMh4At8Mpnha32XjsOq+W3+1xVqCvJLL5jjtF2SjlGp4RJdeID4gEQ2xgTxXUgECj2fotaupAU8D33/xYwNoZKWnZ+RZSN38T2tOwrqU1UeQ1nGYbNGL+Q8AOIRwECzdLhdrNQGMnvbyGqCMRAhUS0typrJtSQjt94hwTA2tC390hT8ap3BVYcQ60uwpRthqRDyR6hF9IwmwANcjC4DG+FXliXnp8oB1JaGwMsllgcRkfxFy8oOzUzJKdS5X66gAvFMXj2nhVOb5o7x8rrzJXaDd2U75TVX2qZtpyQxnxCFmlkS6CEVinn8Y/IIVSjOJLn45iMFdxSNZCCqERLq3Xg0JrvWLQIPu9iBahrfzvAwHsOHEUJ+ywhSXPUIXi6CZ4skPDnbOy8qgaMd53c9y8GkngGeeQCOvIR6poJuT1Uc5IxWnl61H8dMmCO25A94zoAuawC+PZcjkb6bShe/y87MvsLuRe7BY7/8WI5Xkrm8wVze8aFt5Oj5CQmFMOZQFGmObWJ2wsPqxQubB5DR3edfS7zqmGX+srh9WQZbm5MmAtoNX9KAdGMmwjQ/pAO+qeoq1kt+FVJD3FJI5QChmchMFClI61XICtDooHgEfqqqMwT4rZHa/TtA8G8W9IxpGWCC6HyMBjS07tvdNmLbgt0oOhE/hVTnWUuja29MJ/y0jtuX5yGWc9eG7Dvvdt77gYrwIhRJNwFC2XPuOr1MJGstjIZpnlFKZknHnuGqZHBl3+8GspskTMOuo9tqHUKb5BhZJEgXqAKJgQHr+jjRNFS5eiacqaAOA+UIl1Ka8GxB+1Etj+BK3oPHzWq/fye+2AGXyJGLzZxLOgj4kOJ14iOeC3FJml8MoBp/4v3pUIrogOpB/hK1zpb6vONOglAx0VqfLF8gipZ9U6FIkoSplhYYp7fsIR7qNvmAIDU2N/dg3TBxmCloAp+akBKhwlASijNaP1Jxesck0RfcI7syJPqX3qRzN2zirWvI467If0K/bQ2MTp7Txpjyv39GQRFRnJkol41Icf2jh0reS6xlOKLIc47ClmXAwNptiAVub8CgC5vqLQhoRUSKaJrK/3X0hwF3Z1xanrPe+f8ZoeUXDS2J72BNVYcRGMi+d1vI27RCqdccktfYGDuFD1zUHPmcL7QG9fpKDLxO/4kDaA9FWtF2Ok1D0vBLQubO7neSH8DubDAy0J7yuRHgjGGkaelVTe0xpwfOB3mvDBcwbVnvhmIesCeuw3tjvssiGyAyC89vGdbRiY6sfv02W2XwTFC0oxdPjEIRBLJOJj4y9/ivshwciX+LmQROsMUV46jLlY0F45o34RitMnX42hntNwlBhch1it2oOBkPakczR4c4OSqKZeyfqNqOApDTWjXncPGfChcXH2oWcOuD6RKcs0jkFjuy1zmvvp0QA9WdLFMtZz0QWJZDc/tbHCiDFxDRxMFoUmRQTaGZ2Jz0NEnPgJCZxMxI+Qv6jcSgKnGACSX894gEXP2DKNZoICtvcYebspLLnK+xjZ5PF7gP06eaAHxq94QVFvR4mHP54R4qUYjgtAK2t9WeqPdzq3WwJJXnE4bUGNo+YSjteKwrRPuxlzaIZGD30OCY56FIfy2kI8ZIsJnR4oaB6QD2MTJKKisJ+bRcX2jsll4J0YGI/opRCckg0dgU+PtOcgxjpbmdQLP+OpNyoutHgZv/cLZu2wCq/uggsd+4NEra6dbClLxJ7t6FymHj2OfFIxI+9v+QyP/Kh9RJhSAtEPlJy2yIN37aySs3ZqkisH5sih8PMhPrJP3r6aPApFX1thKddTtSprtK/A8MqKGbMX7G43X0In4di1qT/D5iDqkIWLqqt6rQ6cbT8OWrd2dBa27cf1JmZaiOrPnkFtEw+ldn6LZEXkcAXrfhOa7sBHLfx5Ex0lQQgwD0p+E48qc+AWOqzAacRbbKssfca6ZGbvQePY9u5otEMw4Lx9X91vVNXX8lzKQ3uJHmMxQidyD1k7T2HbxJQ4HoJCxrLNRkhTg27/kGBt+jlKt0NJh84Jhlnd+TQJI1ZYz6d6D/Zwufg7pzgFGaHCKV+QdOHiv0Ei3KCRmneHOcYwzvw4+vHXUbhOFQE+4RgtuRWax3cGwMlEs21MhtrdEl/Zaz8+9NpVeWXUU9+qi3YqJ9cOgl6IeIAVpcioYHT0/0aDzCQDVURJ8qVV7u0GK8IGUd06DL42+c1Izk9YyiXXJ8YHqiXZ+GPk/EiXFRXuMXUmy2TimMnQYotgLdDtckpmuZuc9HlGLizV21dAKiunvr6+VLHRwrleu35B6euFPIMNUM/FSwskyqGc2vJOkQ7ugKN9OgSRGscpJXH+nGc7p8UQJzE052DwJPxs9LAp071PoYoYVJ0r/R3CJp1eeR/X3nNNOo0fHdqzFDUJQeLrEKl0/Php6vOioXrplE18rtoBdpSCjZ6JbuCcnsoJChIYvc6K25CAiP+p0pC2GZ0JvogeD7oOaQkNpcM+I6m2OJ3Wzb/5fpr4d3hQx+1u0LSg2y3tk7GOMJ7hS0zFt1/RKKk0EyezBopSCqLpmbzIaDqlQ2k9uDzaHXW8E6LgyBD5n1drPAbrGLEJnK8OAFi1tLgs/eqNYvAHQ+uRJNPlkbblTIi+GLDDTIN9EuarCH1Zkmp0+fKtiMPzaJoq3OzMrnWPmQmDiJVa3UdspJeUhBWmIpTfdGLiWsvIKo2i2zZ9EwARduRAv0hhTOfdmOtQceS8prCkFB8gQxm/RfRAbEcXRKp3GZFoAb+rlTuzPgdWBvcB4RVg9DtGvKdapuzGXi7J1Gk3EoQdcYvk3WFMUIJ0ogfGVfpYd48ZYPtrgbvAQnJ1v7bazosxJSwWSpIM/0Bs7IiCFq4yunLaylgU4WrkvcODKv7WBOdjkPAromUv7wWu1mqxggJO/0xfruYvn8Y77cC5j/z5JtKB1WSCEAR4K4KHwFS+xmjoTF0KCZnCdr00QURwUm7qBUm27fqamCMVAVdl4/3AtZU50nrWa/ya2g8yIWRS4T/nOHV80FbDgSVF/CCE/MuDrO1U03NHge614gdSH0YILhKB6rbgc14H/SkqdLDuEU/hQ4y/XFiT3HchppvlxEWcICJlKVqqpfLw/1yVHQRsrF+SuEByrpnYqaGvfnonFsrxwiUSUVdWIQRfCziVeufAUsv23pu6IINrvncpYImjycJ/lfK0Y3DNgsDKL1S1onIEruksyelGuxZt6vJU+t+gsFVVs/zSBQ8BGkKeq+rS1FeJqjZhIqKywZN3yFMrXEyfIQ/1yxeu0vQXJJWpFDb58qUyPULqbLVDrUqxvLXYvnWfV+JJulvzHIS66tpkC95WE5N2w7l5e6+VKlPvMdd28FBR2M0B0pAh3ArtjQ+07ltM20fOUA1RHK2IHutPcRh23ZHLVlV1C+KGzXkJgg8/ipoXxY6KpUNyDwk6rw3CV1qhFBfreKsLXQ5UkB1/QotA+BLcvdf9hrbAEU7wgccwGDA/Fxu2XK541VWaVL0hiJXdRms5eow9R0bGCTZJPCB6Dk/WUF7dE5CUAfOd4r7trYqw4TYxZJdeERVn/khS7LfC1i4z3EL+pU+nZVIuLC7kki0dBxXjYcas2LWnrJGhGPou1HMoVYCWMJsgqBBSFOFO8cTvZdJ4aRAvAHdRUe4x+x9UMfycYHU/cEmKLMugWanW9d2Lp77e0+8o7XTFoa4peji4dQRf5yi08FkcaiK76sf8wmHKBFf8DRgoXp0DHuV1afZjXCT6jLEh3AyvqBo6qfBdIaFMPcR7rBdOhbkDk/862Vlih1ZWSsWEg3TIJbhfG6Mq4L7p62qC7KbaTlcT6lauikY+npX9iO5drKF/Zvjj0pXHviy+vI8PTHL8vU5YsxqK+2pKdjC4jbvRuQTEg1xQPwyyWkN3lbbssQqDduCBAdHQ/hncbT1aPcM7YiqMpQef5V+tL4CF49cUv7nHUkhDeM8eynhMvF21BuGBRTDpQEJdyY1H6WpfEBdg5gtelRQLDscgphdJrTAbS/AOo+Yo0IDO20IFJ6vCxzVVU/6NqmLTeaDS4EvFhWVCWwD3AamP90dUBMf/p9l1t//1kKvTVSy4S0oGyn5T6cK2FfZZpdLDXn8/3ynFkIgKXBfRzd43zw5qq1E/GppmmAXksYeIdrYk6CeXXpwdJaAUv6X8UAStttK0YRM1JURQnxqqGxBzbMUHCpMZL7Vfy3oKOGVK0/wwfTs1JS29b9VmbSEUVSjXS5qIz1YixRlt3Fmjhmb9PTvkSnYTM2z4v4OZnkkCR2Jbqazsm6MtCEfGz3GA4l8NZOXsxPF6ol9b4KLTwvMzg/WN32awV5ln3DSTi0N60ZMcbWeWqfCEK8V82CroyyCr176NyKTjoTOKMN0OWwTc5ill92W6chFXcIVpOd+U9S6CE8kOnF3hWOjEdTORfbkJI6yyF6Of752HV+pnTEyTX77+mDoIEQIo56+9BRGbw1vDaT/oASQKjbVcD5zSgU6iBuqQT+39NwrBJqmFLKkj2VV+Z5g+7EFVUUSicyLedk3ueSgsnEAc9I/fRr7nzuVj6YYG5Hwm+tM0pW/+x+hjD6F3r9RmmeMmkZX5mtKvBFv0JdQ2UdQHh3ePrhGyYBfjVEb1MdBjoV31b84z6H6EpW1mEE4xMkKddB21+7dQr2+IQ9QnZ0YlnjFtUT9fW5KmjD6zyODUxSzdPqqeCZfwl/eM5JhhRDBtgywUfnc7itCNocUBQosYIeY+KWprAVBWDeJWFPkXuUK8sBe9No/SuGod/Dnlk9cxeBjyKntkh8vqMUZtG+E0AvNivmXdQ7zJCEgXTYi2tB9x6QQ5FKP5kAktwIPCwRLNTjZwPuIuFrDLbZ2o6j7vZdGrD2IKR5p4aESTrIUkOgjIpNGXME0C1wjHzHx+3CxoSJsGpV87mcMCD8c+NC3nlf0GWU28irZBoTf4eAFtpPKnr3q0XDa+xoK46VTm+Bm+Gzcn8lHtdvAWS8x3WYkbfQ4C/KgXz+rSswLgv8457MhrRoUya+DoaC7YK6CFUO8YrRbLuBrsuKHu+Hu6c8SwnItjpyTxbmi/PMSUrH558GbwaDsgtTonC3X7aQn+yN/hYNnIuIPg986jjBcangoUgKi6estntCnAZPiyHGn9Wts8ro+Nmdg0XD/i5DRux97QnMNAKwoLk0vE0a9FDh+UOF2Yfd8+US4eFGiVXSiDKTppuAuPpHUqzlxsY7SaJC+ducZzQuSPDyGOwUxma7YtY6dg/6+KqACIfkAczkgMJ7PieqRGJG/yV+4Sn79bAdzZ/Q1am58seF3cRlgpSKLjZaTmbiOGthakfavYrnxyvv0Q4+3gjhgW4z4ENx9irxkpP/JoEimIwZPE9czuQBRiQfe7uhXtGz1KNMGZJBS+9/mJOVBskAdBvbLZtNMMHnqaiZtT7URyGtZLjFvtZVqKTBaw7M4jwNKJXdFnACKy9Fip5RG4pMdPFAHBAyH73OFLXFLLnxc5ba9C458inDycaT8hwsNRLruui1zBmLoKO86l0+8F8E+rWtM0n7RS6qfCErWqfmLONcY2k74WiCgFbtfflFGgHhcdtsqiGnoQQXhNpBc7YePaI/KSy4VW1cCinirPbM6PpXM7F/ElCnkKE6apjzPbAiQYDsvt8B8excIknssvvLXC76OAAAGXoSPHHlR+bh37M8+VZ8/CW8Kwix6mPfOoMf5HKR+J6tveuuFRAGdTarrwac6DAx45UEtFqR44xdZhr5gUqmKzd2boC1xFhiFtctzpvIvSP0xz+Q0E26zYdCERiAYGtueVPGIR5jCPPVQgUsx+bXZ/ht/gGOr+8ttS2SY8NX9kDZl6xdCO4bI7ruKG5KgEo+HJxliHHEId+bSlrd78eslVtsfhzFERFWzQ5IVIko8WGiYDK48IAuyw6BsxejrVdqg/JK+I1M5KvkTvjCHYNvqgz8NDp17cSRK3HzPpZym3qPDvAwZdIUwh3YcuLWEdaeutlXn2AJy7rAmbSQP6B8f7Izv9/pB5/jdKLEuavo4+pOZ/d+eG8v7jh6TGgWvsl+yBjo/hdKRHJGV9qFK43lMj364/7thiNWC4Pb8vtax2B/nWyCL9yKJXYGS69f01uB9iDZvmlcrBNtatq9R5aL1eHF947DBlKMQLYqRgpEntbcBERzYfuCCVlS11zIS6fd0wF0IVoGvJZUHlweIFvdzY567bWXIpKLi5D87n1GAZziL6y8guH1Eq5RdpRqGEM1r8h5vaDffKaMYzb5Idye6demVXfet++f3Sh2e9uh1A8tic1lT8hJBOmMT13R8iQ2X1LntEqxtdfAmWUTFuYu6eIz/CVMFsDjh4kng18Dm79Ki/cnzBM8RbW+wxIjwvW47yK7cZ6fGxrXEuSNGV4Q5Xl5oBbXDXfaty6W5CJ7AFoI7d9U/393RL/iO7qlV00n03RnL91wXMV6q/CmlFEZFgTe2tZ3jGSPlvjQZWrUOWZBsuxaXPSfr8WDJergy8eGxR6eMf0HuqYIJ6hwaQQkfSgY+N6OtYIgssuVv2a8je1/zmIBZqB0i1uk2/2wbEf2eG3o+SdewE4ROpjCiNZKI290oUhX226pLWulKJwZ2HhRD5gHm+3e858TkTcjcd5f9HOowboKdWOFhp46CMvcapKOvmuvQhtDlMd1c2jm71yiBAPO+9cmvzKY25IyuQ9Q4nNuHrdm9ZZ9TdBHRngP1qFsW9n38wTaVJJHHZ5AwU2cl+GoL9xURe3evmjK59FK2isPiUPzjHdxsFy+cd9uIRl9F17h0zRb9euF21I4G68eneV8W46fi6N6iNIPvaqPd2csKqFPQ3AzF3qiCPXcUSF/N7BpqIXQIo0hKbFmRBFoIp3tHsttwkVHO8ebMmFpBCepWp+2VGMiKNT0GjXI6IdmyxdUZPuX09Azq/P0LWxK2P3ybLKP8jHHMOhDGMfC8NeUBmw4x7V0D+QQ18Tj+X+o1wYeu7019XtCy3uTN4+z9jZoL5GRhl0nigkiuggDBGC5OIJr3dqqEi0Upq2mCv7KfU5fLv7RPpY2KiBI9nFpLagAvtXmlUrihvXL+HjtZeTW4LzI42UxbtOah76yUJLt5ryWC6pmSjbvEsRrKzs5eCdUh+2vUBXQqFHXjxMcryt7tvDxy/LfcLxmYYKbZoC6MSvEAYXfpuqwQZyl6ohHshpZyTDf/sm90HU3MCDQoefesO/us2HJd/mABNNsaBm3Zdb33UVovhKvm3KJqJeVQrdKjnnXwQ5Xph4EEbXiENc5BnoYZ4v8/QSmBeUUeJ1Ksk0IbHdrrG6aE/siPqfWtfDm+gxXK4/xP40ZCrXwlozB6/G9I8sPcUogPEnHfcgSgAqtqVZG+C2EcVkQbWq+DJegmQbr2aFIxbAJUmzyp5QBaqcfHIotw/QXE7rDIznTbuAgMRrif2uPJFRFENBNhl8KzEjaL/aCFF9HZrS1lYhVVqrQ1yOoBZJqUEMOeUpsbWYIN+P//6dkaCGg2fqG1NyP8Gex2ggDFR3b5cOlGUvLAocTtnR693FGXQQDcxgJ3Oh8x4BGhZJN12P1arVeouE89oRUpIoRrZSneze6BiRzT6XYFhhVPvlg060x4v7+sjQwprj9VRuxK5gTZ1aCZ2fyzT/qkvPKCMkZNoHRnodNKIGnQrwu/HAFwlLahb2mSUnLe9UghWCCeEakNsdEBrmq/GlZx8ZUCFU7ucZzObv2NB3EBlDdSw5Zve4n0L/YkOwdFjAXLb9WrDczuBQpvOeW6dgskkijXx90/lunpMRkWg9WHjvLkZaFDhk5A3rl/8WW6IpQaLBi4GW4ftidiUE2iuP/aS2TRAYkvZA+wvnwZKox4hmVfckCvSAy/vhfSJjhFzrkd3jwjohWYeGRtXqy0K1ggE/JWGuzEtuDeX6Fty4WXa7eiBJEUhL/TaeccM3qqR67XuRGZoZJ8BTVo3sbxAyVjaS5wPr6+GeOBxFfPp/m2ajyz6/bBzewunXNvkWjPJ59Dimb0b3lPyjDVInnaQUK+LdRMXMDPugnHmgzn5BKNtIKury0tNCq2LnsdMWpLe2VJbPO+tuBBNA6BBXoPVvUltU/3nhVqbpJiYW+lhEYF4WrYJ+9y4FmSrQY8bwcUaYH3/MSRnWMScQ4UE1iyH7Hkie8ZtpDEQeQvDul3SyD5R7Bq0zltC66+8oiV4DJzNNObIgqf7BdqBN1YDEeSh3oym2UkeIpoCO5ih3BgT0e6qT4WP4c8uXJ6qUjgdcuL8UT0AgikR55tUV6W+eYpjdxCAtmLnawKITzVleQgas4denxhG39DMgiSM5TMIEWuE2McmqtjpSxzToq4AM2J0jOv7ApGHDpgKc56KlCctgFN20hIhLaB6dKb3N9gvYsTZLJogjTVlj74i2sujLJ3eVwn4pePJlonXC9GUnBd+AYExr/sf/aUm1vRuiqujyxydeGgYQJTiAVg3DCcg+4LdlbwIBMoVNRXwRiBo8yyHftAE8b4LzcobXlzFbl4MtQpU7+QEjO1Nzo/KHS/5Oo7Jg9asa/jgprL64oX+ZoHzIOxJWBAx7sTxsoCWJ6NtHoPtyhshWtSB1k8SsLNtR/DNoRTlh6qRjQ5g0rZEHhTpA1X05EImT4o145iq/BBKj6baHbgnDFf6O28o2/b+x8MWOecf9S3uzSkgAS6Jbfk2yRtofkg16SOeCUfO+ZoDp0/yhGcTdYb9HAzrMKXjzVCAQGCc1YMtzKuevD0UcM/jptuCiKRw3VzOEdGgxYwp0I44CrLbwTJw8pVz52QRMMndT+D3Gq+VdCwJXZAYf4lMbrdQYjaUoC4z12SLGGn1q1zbMeXRjHfSQzr+pmZ02XDm1zhDuUUp+XVxEGzY1lWAfSqWCnsOv/zSTJUR25XfMMOe7kzZxP291B4+zwfxPNgckV+eMHpBNLWGXtxl8W+jzFAg/UQzlRyY3oc0T4xBJuzOhZ0rQDuK2n1kUuDjTL7Bm7DW5Y9v9o+ueEF1lwuAuw176E/N8tVKAgRWjYW5Np74XWQ45gdtqFGWpViz3L2iZqLxNwDchkMgxMeuessB12xyAYDAyCwP0kbXax+LCdNiP+d2vOE3V1cuC0SsrncLW+H9Lg+ZqFwC/TBdgzMqoC/ocM9wo0jSqDkePyHjrDWpZD5Z4+mtD+xXhnVl21iTO1XAKx1BDU+djXyDxLW5a/D809aVwYfJQIDfWvfRPJEo+LmxgtGa3bcMMAfkJdXMOmANU6h5kaquHuyTQzzEYF8+aaw6fiRShYcdowmwubtrN0+WNURdhM7bqs6+NfXK+eoSLxnj2Awh7RxuuwdblDlq38bFi2P3Zbdc3YVaechSZv81K3bYDdrnGxOlYcjfN1L+YxMTG00t7JIaLYjVBe/uTZ46A+/C9+aOTWGl38yc9pF8pWpSJPa4X9zMMkBXyl3yZryerEWCsOzvZYjRPmcVnVeuKakKn9Sfl+g8fsHVY5BPQm3ExXZorwWo4T6RG4jwwnh4f8mEGzNYHLgn3p3qEl/5e/BfGkD+ZvefaYLMNUz1mcW974hm1Sa0xVE+6a3s2sYDGy4pqifcGX/kTWRIP7Nr7nA0xqXUIOQ8pZz1RrRMmIUWE1NGzQikoURwOTbBLdb7lG510ZAoQJiKMga77r68HdpwAXtq8z4GRP6OXtAqjjjBD2c20/PdD3g7UgJc1UKjrKU0bIZxL443/xyElPnjLEaLb4T31EELcPfHTpXbgLBl37jS1HikV6lD4gUrdSgdFzuxuHpRjmdBD/iNVfyqJY9tj4q7TWq1q7L2YjZHB6GQq3Q0UhRtWlTgk4K8GjuOJ2/LaxKqWTblP3O8q6ggqIIttuhowOlenoPiRxlNH5NeYC6pPnsr1gfzTuo/KSTCywE8qLBxHt4U6NgEVnR9wNPiL82kG7UMoD2/jIEEFRaQnR45uciIQsYzJBETAHBf7sTWBj9Ss8e0iJ/j5gznovttIkpXQEENHUj7uTuJ8yFynkIWR3AHfZXsBAdpZOXqn9XzffJwkTDv866f2y962YFm+bDErmko5eHINg7UmeHXPMcR+oYWy9C2J959K4x0Lz6JVmEG9IdgIx6WDC+osFB4F9yMHSR/GOHHNOxUXduxGM8NKqOzZPccKIgzXt8FClYsHtaSvB8dH3LJpWDcyeKbvAc5P7mCead7zW39e65IOvv++UDDCIs9Evn7HX7VoXDGLdlLuSraSQmF4w3SB0j/LhFpVdrUa84Rgm1dKhs8I458ue/QYFA4lVcIT9tJ5S5JtpKoSWiqgrqCismIf4iIxJgNj5tlgusUTbAs+QqnDRzH8fq/9YAyywfstUUGBBSeSOdbCzJFv3eK0b6n5gqfxB5D8gv5uWGZcJjTxzHKoWs88YwXPm7+iRMLWsuVydxtYGWj20aiaZbVKVzx0+mAkcyKXa6eHlNSKFfKPgulEYEXwJjjKQjaYajtnpjDtvfaD9ZEnM0nMnEfKhnve0MUgnxf+K5fHmprQnch2nqFifLMCuyzIXTCKT0g57FF2UzgmMJ3iRSutiXfDf5Mz6ZD9oZ7/Vp6hcJc6S5afw5bwqotZcPQ0/I0hkDGsnqqx5TXReWOjYA63ONdTHYKzZvpeMgkwnZ2PCGy4vwNbNCButNiYyfyuVR3kDFhds2KBVdOddAoVmh4VVIbUUFoXq6Q8wvZjwgp8M0CIKdgOfAqhF9Kmjrm1b8LjPMON2DE4DREB+19oTtkbtsJm3nq3KbghHNg0XtGr9exGYA8eI66ubbzIXG5X9XBG+VKOlDiHQFcPbWDdeO/uV2OdOCvFm31IZFUczX36qvrjKS45mn306uMM5MoHdPhPWe1TFwAgbyDtOBM8yWPDzcNDTzb7FE1zlaShQ6h0Xi+J/g/v+S29xuvYPRMA1BRbuIFCyTPcQaL8R1G1p22sSC0Zm0SaCXLFMQZa35urHme1zqqpG74mlGpMDhw60vCu3iRdlwO83dkjWwh0LGFJXo82lODWE4vpFbsonjDiXqbcdDjxT1/i41dB1AFilCrUsI/RRaxr5br+UPDEwpcqTxKY7hyD2mXYv/Vm+aqBscZB0PapsDN6wrVYcXeplNlzI6G69jmaqirItp27huh6iBrXjxi03K+KiyIIBtjeWvEsgWdihxkkCKYSsVj5WsaP9O681Vb4bhWIVZFlBZwPZOb1sHLoCcgA6xpM/5K+8el03ZfJcK8GoPwVjWqHZ5tWiElfAf9TeEacYKOEN4yk56hCojBifrOrYoQX4Vgtq1OUgQtSbKXnnJisLoPKYDZV0b2bfPbOeKZsyJPxE2pYMICtz4oj+2/qash8r1PnwskNtDcOM5SdZ7PP2mQ/zvGFpf6XayfptiSArVlstAIVLNFSFGjVLl3j1zbUdJSojPTcVduy2vr71rQvR9uBNgBctZqnpztJsD91zbgxjgUv8XFfYNfKRppSHLhlYgHijonwPhiC6inGWDWSFPpjaXVcXhRMLLaJozy1xokr1kV5ux7K+PV18BU182c/0Sxrt9Ig34ykCg08BDK9PxMDYdvA+UxWSOpjpc22zQ2CZMQxC58W50j2hURpCwjcrgBzIdZVii7fQefwgNaJ+eUfG5vb1R/JAVcdVfUnZaNzmhfWN3l5d5M8NemO6Je23jR/mGE+Tj8AHnpenL1cNL+YWi9s2Db+JzXDjDyGsU8Uaz0uCTUbbR4Hhqq2ce44BpbC+8JQ2CY1B61Qm2DDC5FYMUiZgMMIgQZsoXXwZm2qcpig2FLVuGfSCYl3DM3KLy6BT12ITZz7y5ZJSpmKwzPx/A6mYHwpiP+komDHtkX3U9vGww9n10zWnd0bao661y0Csev28mF0halEG/m/j23GKCzB9m0JEg4O2AWvWtsuu678hUch4cOBqoAhizamW0qxg6bDh/ryCfIDSHKluvntD8bauJ/zkJuvfy5wvTMJ7VIFUhzXpVmvuDSZo1QOs85pTR7f94bzLLW9w6pAuVt0Afys0YLcdPMjJtYZS8WWWapRjDkjlgpMa/+jc1aCMOmio1p+YBFwpmQKTU3UYD1KaA12lzDItoDO4/TtopoiOZaf99PT+qx97nB10wQJoeDoyINuDJGorkKwsyVrz61f+AtBr6qWJgakaDFJgVI0JD4GJZHt1ejBMtHhYQrS4w/j03pFNDbJCsw8YBoPgxpl3zLL7QLreEES2+EWKM3nykNRgsV+6m88Lu3P3W6oITttSjLjjijIX94oEHqiavJHP1ruCRbCD6aC0Xv5sQeSDW3xKz70t/aeRCDzbZt4On1xxgzOAlys4CgENZGa8mjUCXwaVzFIqTAA2KOFs/ndBfR1xg/SLfFKxzwv3523KB+Pz3OutxOVs0Pmklk3ddnFz9BWDwfBkzBhFDoDBE9DTuHi1KPULkZFwJx9Ac7meQpfG7rJvQ8jAFYnEHj8aPbS9RUDP9whudO48el/Ol4F9iMU2EdIengfTFAjjxj3+bGwbIOZxWraCwwBlLwmMWpWJaey/T6RO9APkF6JURG88cOzSviEKr91CpRHRA8pKCeTWOQJQ5cjNkIV1q4BeRyJVNPDIuwdxMV7ryjGrXyvny+W8xEIuUnZZuNnM0QnwUxBh5sXASS1pZy5ZtjZ+BkfNIHWj04pFj5i6IQWoH2sFvaugKw6lrPic7zohxc5BzsFfrZbbhykYNiNeHaKwMz8xGQAQwWAHES2HJTKcqLE9AANBtegLBJ8CsuKKqY5z1HlE3SR39pd2bfd9vXnHJQJz8GWhDxlB6ojASfUNYptiVYbR73LjKLxUNAaq3D6UGx+bWd6Py3/R+pXYrAjbJk6XraIC2rOl4nyLh2WNno3MNjang1Q6RZ/ToJB2WjTX4UThPzwel7AfMjUeWBu3xboPuBYpc3EnZwJy6zPKwgsCXB7Oiy/AUF4QNj4rU405IrAJvJnv3Mc9PcxfGy6iO75TCEFJK+qJofypyYJK5+VtKl6UH1r3emGEkh+8yBRQeNL5JL0xSmLkZjLzEr9CA5GTaVwfDtr0ce8c6Lxs/nZKoI6UceNrt143YLFUr29LCSZfWWf/qOkcK2xS3WHY6echx9lK0Pz5qN4J5r0vaRRY2N0byGd7ncOBRpRpTPeCaMiD3n4vGRBX9wGBxS1ufrGFZY0hvPQ/uQ5S5mCj++NU6dH/68IS1ecChleXbsbmLykk4qwLFUmECqe3sPDXH4GKqxuc7Pa8pjvdlk6DEhLU8VBVFB/BZlVg2Did0wEPHH9r2olvAF8+lrDi6P4bUPlXj7y8pCIBHtAGWDxo1w0yq/qKncJcfffzEnhwa4/xsflQdcMDQCxqf55N730ErAxoJS6tCNzcWCfFVQswaQQapOt3VdonhH+kISGP6Uods6lj10pbMdcxixPc9YB/UIdXrN2RhnoH8ESOKQ1bz8pwsi2ZT5S4riA7JTv7ftg7gv/E4gjuXzTnDPozKXXq3C6vBCMUsgsmoB8TFoSF4wpODBq6bakY70sEZ7P7vBDpf2MgeW43+QHXn6aGm0358FjkwLfMWFSEMdPCVzoDH+RqSy70cRSSb9vhF6Tavwy4ZRTdqISWziY+cBE80xrgscug9/cjtnp6bYhmcrSbjxZuDBveewGz66O8ssJLWtP04mEZ5leTMRiZVXF0y/H7p7b/dHMoEVfsSgm2Tavx0qo9HoGdp91f4XY4ZqwuxEsSuPWe3JhK8690IQXrA2fPunkCqS0MOmASvjZW6IwlMWwV7cLjG+ZBgReq4N6dNppFppH3jht4m/Xg5hI0EuXhzgb+3yjO9mIiFU6KwjYQ");
                            file.createNewFile();
                            FileOutputStream fileOutputStream = new FileOutputStream(file);
                            if (Build.VERSION.SDK_INT >= 33) {
                                file.setReadOnly();
                            }
                            fileOutputStream.write(zzb2, 0, zzb2.length);
                            fileOutputStream.close();
                        }
                        zzavpVar.zzx(cacheDir, "1708042440713");
                        try {
                            try {
                                zzavpVar.zzf = new DexClassLoader(file.getAbsolutePath(), cacheDir.getAbsolutePath(), null, zzavpVar.zza.getClassLoader());
                                zzy(file);
                                zzavpVar.zzw(cacheDir, "1708042440713");
                                zzz(String.format("%s/%s.dex", cacheDir, "1708042440713"));
                                zzavpVar.zzo = new zzauj(zzavpVar);
                                zzavpVar.zzq = true;
                                return zzavpVar;
                            } catch (SecurityException e12) {
                                throw new zzavf(e12);
                            }
                        } catch (Throwable th2) {
                            zzy(file);
                            zzavpVar.zzw(cacheDir, "1708042440713");
                            zzz(String.format("%s/%s.dex", cacheDir, "1708042440713"));
                            throw th2;
                        }
                    } catch (FileNotFoundException e13) {
                        throw new zzavf(e13);
                    } catch (IOException e14) {
                        throw new zzavf(e14);
                    }
                } catch (NullPointerException e15) {
                    throw new zzavf(e15);
                }
            } catch (zzaut e16) {
                throw new zzavf(e16);
            }
        }
        throw new zzaut(zzauuVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzv() {
        try {
            if (this.zzi == null && this.zzl) {
                AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(this.zza);
                advertisingIdClient.start();
                this.zzi = advertisingIdClient;
            }
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException unused) {
            this.zzi = null;
        }
    }

    private final void zzw(File file, String str) {
        Throwable th2;
        FileOutputStream fileOutputStream;
        File file2 = new File(String.format("%s/%s.tmp", file, "1708042440713"));
        if (!file2.exists()) {
            File file3 = new File(String.format("%s/%s.dex", file, "1708042440713"));
            if (file3.exists()) {
                long length = file3.length();
                if (length > 0) {
                    byte[] bArr = new byte[(int) length];
                    FileInputStream fileInputStream = null;
                    try {
                        FileInputStream fileInputStream2 = new FileInputStream(file3);
                        try {
                            if (fileInputStream2.read(bArr) <= 0) {
                                try {
                                    fileInputStream2.close();
                                } catch (IOException unused) {
                                }
                                zzy(file3);
                                return;
                            }
                            System.out.print("test");
                            System.out.print("test");
                            System.out.print("test");
                            zzasm zza = zzasn.zza();
                            byte[] bytes = Build.VERSION.SDK.getBytes();
                            zzgwm zzgwmVar = zzgwm.zzb;
                            zza.zzc(zzgwm.zzv(bytes, 0, bytes.length));
                            byte[] bytes2 = "1708042440713".getBytes();
                            zza.zzd(zzgwm.zzv(bytes2, 0, bytes2.length));
                            byte[] bytes3 = this.zzg.zza(this.zzh, bArr).getBytes();
                            zza.zza(zzgwm.zzv(bytes3, 0, bytes3.length));
                            byte[] zze = zzatd.zze(bytes3);
                            zza.zzb(zzgwm.zzv(zze, 0, zze.length));
                            file2.createNewFile();
                            fileOutputStream = new FileOutputStream(file2);
                            try {
                                byte[] zzaV = ((zzasn) zza.zzbr()).zzaV();
                                fileOutputStream.write(zzaV, 0, zzaV.length);
                                fileOutputStream.close();
                                try {
                                    fileInputStream2.close();
                                } catch (IOException unused2) {
                                }
                                try {
                                    fileOutputStream.close();
                                } catch (IOException unused3) {
                                }
                                zzy(file3);
                            } catch (zzaut | IOException | NoSuchAlgorithmException unused4) {
                                fileInputStream = fileInputStream2;
                                if (fileInputStream != null) {
                                    try {
                                        fileInputStream.close();
                                    } catch (IOException unused5) {
                                    }
                                }
                                if (fileOutputStream != null) {
                                    try {
                                        fileOutputStream.close();
                                    } catch (IOException unused6) {
                                    }
                                }
                                zzy(file3);
                            } catch (Throwable th3) {
                                th2 = th3;
                                fileInputStream = fileInputStream2;
                                if (fileInputStream != null) {
                                    try {
                                        fileInputStream.close();
                                    } catch (IOException unused7) {
                                    }
                                }
                                if (fileOutputStream != null) {
                                    try {
                                        fileOutputStream.close();
                                    } catch (IOException unused8) {
                                    }
                                }
                                zzy(file3);
                                throw th2;
                            }
                        } catch (zzaut | IOException | NoSuchAlgorithmException unused9) {
                            fileOutputStream = null;
                        } catch (Throwable th4) {
                            th2 = th4;
                            fileOutputStream = null;
                        }
                    } catch (zzaut | IOException | NoSuchAlgorithmException unused10) {
                        fileOutputStream = null;
                    } catch (Throwable th5) {
                        th2 = th5;
                        fileOutputStream = null;
                    }
                }
            }
        }
    }

    private final boolean zzx(File file, String str) {
        FileOutputStream fileOutputStream;
        File file2 = new File(String.format("%s/%s.tmp", file, "1708042440713"));
        if (!file2.exists()) {
            return false;
        }
        File file3 = new File(String.format("%s/%s.dex", file, "1708042440713"));
        if (!file3.exists()) {
            FileInputStream fileInputStream = null;
            try {
                long length = file2.length();
                if (length <= 0) {
                    zzy(file2);
                    return false;
                }
                byte[] bArr = new byte[(int) length];
                FileInputStream fileInputStream2 = new FileInputStream(file2);
                try {
                    try {
                        if (fileInputStream2.read(bArr) <= 0) {
                            zzy(file2);
                            try {
                                fileInputStream2.close();
                            } catch (IOException unused) {
                            }
                            return false;
                        }
                        try {
                            try {
                                zzasn zzd2 = zzasn.zzd(bArr, zzgxi.zza());
                                if ("1708042440713".equals(new String(zzd2.zzh().zzA())) && Arrays.equals(zzd2.zzf().zzA(), zzatd.zze(zzd2.zze().zzA())) && Arrays.equals(zzd2.zzg().zzA(), Build.VERSION.SDK.getBytes())) {
                                    byte[] zzb = this.zzg.zzb(this.zzh, new String(zzd2.zze().zzA()));
                                    file3.createNewFile();
                                    fileOutputStream = new FileOutputStream(file3);
                                    try {
                                        fileOutputStream.write(zzb, 0, zzb.length);
                                        try {
                                            fileInputStream2.close();
                                        } catch (IOException unused2) {
                                        }
                                        try {
                                            fileOutputStream.close();
                                        } catch (IOException unused3) {
                                        }
                                        return true;
                                    } catch (zzaut | IOException | NoSuchAlgorithmException unused4) {
                                        fileInputStream = fileInputStream2;
                                        if (fileInputStream != null) {
                                            try {
                                                fileInputStream.close();
                                            } catch (IOException unused5) {
                                            }
                                        }
                                        if (fileOutputStream != null) {
                                            try {
                                                fileOutputStream.close();
                                            } catch (IOException unused6) {
                                            }
                                        }
                                        return false;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        fileInputStream = fileInputStream2;
                                        if (fileInputStream != null) {
                                            try {
                                                fileInputStream.close();
                                            } catch (IOException unused7) {
                                            }
                                        }
                                        if (fileOutputStream != null) {
                                            try {
                                                fileOutputStream.close();
                                            } catch (IOException unused8) {
                                            }
                                        }
                                        throw th;
                                    }
                                }
                                zzy(file2);
                                try {
                                    fileInputStream2.close();
                                } catch (IOException unused9) {
                                }
                                return false;
                            } catch (NullPointerException unused10) {
                                fileInputStream2.close();
                                return false;
                            }
                        } catch (IOException unused11) {
                            return false;
                        }
                    } catch (zzaut | IOException | NoSuchAlgorithmException unused12) {
                        fileOutputStream = null;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    fileOutputStream = null;
                }
            } catch (zzaut | IOException | NoSuchAlgorithmException unused13) {
                fileOutputStream = null;
            } catch (Throwable th4) {
                th = th4;
                fileOutputStream = null;
            }
        }
        return false;
    }

    private static final void zzy(File file) {
        if (!file.exists()) {
            String.format("File %s not found. No need for deletion", file.getAbsolutePath());
        } else {
            file.delete();
        }
    }

    private static final void zzz(String str) {
        zzy(new File(str));
    }

    public final int zza() {
        if (this.zzo != null) {
            return zzauj.zzd();
        }
        return SlideAtom.USES_MASTER_SLIDE_ID;
    }

    public final Context zzb() {
        return this.zza;
    }

    public final zzasj zzc() {
        return this.zzm;
    }

    public final zzauj zzd() {
        return this.zzo;
    }

    public final zzauu zze() {
        return this.zzg;
    }

    public final zzavi zzf() {
        return this.zzr;
    }

    public final AdvertisingIdClient zzh() {
        Future future;
        if (!this.zzj) {
            return null;
        }
        if (this.zzi == null && (future = this.zzk) != null) {
            try {
                future.get(2000L, TimeUnit.MILLISECONDS);
                this.zzk = null;
            } catch (InterruptedException | ExecutionException unused) {
            } catch (TimeoutException unused2) {
                this.zzk.cancel(true);
            }
        }
        return this.zzi;
    }

    public final DexClassLoader zzi() {
        return this.zzf;
    }

    public final Method zzj(String str, String str2) {
        zzaxc zzaxcVar = (zzaxc) this.zzp.get(new Pair(str, str2));
        if (zzaxcVar == null) {
            return null;
        }
        return zzaxcVar.zza();
    }

    public final ExecutorService zzk() {
        return this.zze;
    }

    public final Future zzl() {
        return this.zzn;
    }

    public final void zzo(int i10, boolean z10) {
        if (this.zzc) {
            Future<?> submit = this.zze.submit(new zzavn(this, i10, true));
            if (i10 == 0) {
                this.zzn = submit;
            }
        }
    }

    public final boolean zzp() {
        return this.zzc;
    }

    public final boolean zzq() {
        return this.zzb;
    }

    public final boolean zzr() {
        return this.zzq;
    }

    public final boolean zzs() {
        return this.zzr.zza();
    }

    public final boolean zzt(String str, String str2, Class... clsArr) {
        Pair pair = new Pair(str, str2);
        if (!this.zzp.containsKey(pair)) {
            this.zzp.put(pair, new zzaxc(this, str, str2, clsArr));
            return true;
        }
        return false;
    }

    public final byte[] zzu() {
        return this.zzh;
    }
}
